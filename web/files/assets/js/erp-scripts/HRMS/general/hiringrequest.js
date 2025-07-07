var employee = angular.module('hiringrequest', []);
employee.controller('hiringrequestcon',['$scope','$http',function($scope,$http)
	{
	
	/* getting data for table */
	
	$http.get('/erp/Employee/hiringRequest').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject;  
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* search bar */
	
	/*$scope.getsearch = function(Data){
		$http.post('/erp/Employee/getHiringsearch',Data).then(function (response) {
		    $scope.data = response.data;
		    if($scope.data.successful)
			{
				$scope.regdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		}*/
	
	/* Hiring Request Search bar */
	
$scope.name=null,$scope.filteredResult = null;
    
	$scope.getNameWiseData = function(obj) {      
		$scope.getBranchWisePrograms = function(totalObj)
		{
			Andromeda.setSessionValue("studentBranchId", totalObj.empid);
			
			$("#glyphiconid").show();        
			$scope.name = totalObj.name;
			$http.post('/erp/Employee/getBranchWisePrograms', totalObj.empid).then(function(response)
			{
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.regdetails = $scope.data.responseObject;
					/*$("#div1").hide();
					$("#lb6b").show();
					$("#div4").hide();*/
					$("#glyphiconid").hide();
				}
				else
				{    
					console.log("Client error while getting data");
				}
			},
			function(response)
			{
				console.log("Server error while getting data");
			});
		}; 
	}
	
	    
}]);