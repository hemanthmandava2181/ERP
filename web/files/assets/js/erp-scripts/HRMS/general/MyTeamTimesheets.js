var sheets = angular.module('sheetsModule', []);
sheets.controller('sheetsController',['$scope','$http',function($scope,$http)
{
	$scope.getTeamSheets = function(data)
	{      
		console.log(data); 
		if(data==null || data=='' || data==undefined)
		  {
		  	swal("Enter all details!");
		  }
		 
		 else if(data.from_date == null || data.from_date == '' || data.from_date== undefined)
		  {
		  	swal("Select From Date!");
		  }
		 else if(data.to_date == null || data.to_date == '' || data.to_date == undefined)
		  {
		  	swal("Select To Date!");
		  }
		/* else if(data.reporting_to == null || data.id == '' || data.to_date == undefined)
		  {
		  	swal("Select To Date!");
		  }*/
		 
		 
		 else{
		$http.post('timesheet/getTeamSheets',data).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					
				console.log($scope.data);  
				$scope.empdetails = $scope.data.responseObject.centers;                  
			}          
			else
			{              
				var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				jQuery("#errorDiv").html(message);
			}
		},     
		function(errResponse)   
		{
			console.error('Error while fetching notes');
		});
		 }
	};
	
	
	
	$scope.getAttSheets = function(data)
	{      
		console.log(data); 
		if(data==null || data=='' || data==undefined)
		  {
		  	swal("Enter all details!");
		  }
		 
		 else if(data.from_date == null || data.from_date == '' || data.from_date== undefined)
		  {
		  	swal("Select From Date!");
		  }
		 else if(data.to_date == null || data.to_date == '' || data.to_date == undefined)
		  {
		  	swal("Select To Date!");
		  }
		 else
			 {
		
		$http.post('timesheet/getAttSheets',data).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					
				console.log($scope.data);  
				$scope.attdetails = $scope.data.responseObject.centers;                  
			}          
			else
			{              
				var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				jQuery("#errorDiv").html(message);
			}
		},     
		function(errResponse)   
		{
			console.error('Error while fetching notes');
		}); 
			 }
	};
		 
	$http.get('/erp/timesheet/getReportings').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.reportings = $scope.data.responseObject;
			console.log($scope.reportings);
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
}]);