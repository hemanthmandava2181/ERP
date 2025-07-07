var CTCModule= angular.module('CTCReportModule', []);
CTCModule.controller('CTCReportController',['$scope','$http',function($scope,$http)
{
	
	$scope.getCTCReports = function(data)
	{        
		/*console.log(data); 
		if(data==null || data=='' || data==undefined)
		  {
		  	swal("Enter all details!");
		  }
		 
		 else if(data.empid == null || data.empid == '' || data.empid== undefined)
		  {
		  	swal("Select Employee!");
		  }
		 else if(data.employee_type== null || data.employee_type == '' || data.employee_type == undefined)
		  {
		  	swal("Select Employee Type!");
		  }
		 else{*/
		$http.post('/erp/report/getCTCReports',data).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					
				console.log($scope.data);  
				$scope.ctcreportdetails = $scope.data.responseObject.centers;                  
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
	$http.get('/erp/report/getEmployeeTypes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.employeetypes= $scope.data.responseObject;
			console.log($scope.employeetypes);
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
	/* Getting reporting to */
	$http.get('/erp/report/getEmployeeIds').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.employeeids = $scope.data.responseObject;
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