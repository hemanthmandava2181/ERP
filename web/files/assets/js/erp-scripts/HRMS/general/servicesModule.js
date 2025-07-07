var servicesModule = angular.module('servicesModule', []);
servicesModule.controller('servicesController',['$scope','$http',function($scope,$http)
{
	
	
	 $http.post('/erp/service/getAll').then(function (response) {
	        $scope.data1 = response.data;
	        if ($scope.data1.successful) {
	            $scope.empdetails= $scope.data1.responseObject; 
	            console.log($scope.empdetails);
	        } 
	        else 
	        { 
	            var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>" + $scope.data.errorMessage + "</div>";
	            jQuery("#errorDiv").html(message);
	        }
	    }, function (errResponse) {
	      
	    });
	
	
	$scope.createHR = function(totalObj,data1)
	{
		$http.post('/erp/service/createHR', totalObj).then(function(response)
			{
				$scope.data = response.data;
				if($scope.data.successful)
				{    
						alert("Login credentials created successfully!!!");
						Andromeda.showlogincredentialsPage();
						jQuery("#glyphiconid").hide();   
						$scope.data = {object : totalObj};
						
				}
				else
				{
					alert("User already exist");
					console.log("Client error while getting data");
					jQuery("#glyphiconid").hide();
				}
			},
			function(response)
			{
				alert("user already exist");
				console.log("Server error while getting data");
				jQuery("#glyphiconid").hide();
			});
	};
	$scope.createEmployee = function(totalObj,data1)
	{
		jQuery("#glyphiconid").show();
		if(totalObj == null || totalObj == undefined || totalObj == "")
		{
			alert("Fill all details!");
		}
		else if(totalObj.email == null || totalObj.email == undefined || totalObj.email == "")
		{
			alert("Enter Email");
		}
		else if(totalObj.mobile == null || totalObj.mobile == undefined || totalObj.mobile == "")
		{
			alert("Enter Mobile Number");
		}
		else
		{     
			$http.post('/erp/service/createEmployee', totalObj).then(function(response)
			{
				$scope.data = response.data;
				if($scope.data.successful)
				{    
					
					alert("Login credentials created successfully!!!");
					Andromeda.showlogincredentialsPage();
					jQuery("#glyphiconid").hide();   
					$scope.data = {object : totalObj};
				}   
				else                 
				{
					alert("User already exist");
					console.log("Client error while getting data");
					jQuery("#glyphiconid").hide();
				}
			},
			function(response)
			{
				alert("user already exist");
				console.log("Server error while getting data");
				jQuery("#glyphiconid").hide();
			});
		}
	};
	
	$scope.getLogins = function(totalObj)
	{
		jQuery("#glyphiconid").show();
		if(totalObj == null || totalObj == undefined || totalObj == "")
		{
			alert("Fill all details!");
		}
		else if(totalObj.districtId == null || totalObj.districtId == undefined || totalObj.districtId == "")
		{
			alert("Select district");
		}
		else if(totalObj.collegeId == null || totalObj.collegeId == undefined || totalObj.collegeId == "")
		{
			alert("Select college");
		}
		$http.post('/erp/service/getLogins', totalObj.collegeId).then(function(response)
		{
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.users = $scope.data.responseObject;
				$scope.data = {object : totalObj};
				if($scope.users == null || $scope.users == undefined || $scope.users == "")
					$("#msgDiv").show();
				else
					$("#msgDiv").hide();
				$("#loginsDiv").show();
				$("#errorDiv").hide();
				jQuery("#glyphiconid").hide();
			}
			else
			{
				console.log("Client error while getting data");
				jQuery("#glyphiconid").hide();
			}
		},
		function(response)
		{
			$("#loginsDiv").hide();
			$("#errorDiv").show();
			$("#errorDiv").html("<b>" + $scope.data.errorMessage + "</b>");
			console.log("Server error while getting data");
			jQuery("#glyphiconid").hide();
		});
	};
	

	
	
	
}]);