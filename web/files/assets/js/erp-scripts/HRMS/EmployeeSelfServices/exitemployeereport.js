var exitemployee= angular.module('exitreportModule', [])
exitemployee.controller('ExitReportController',['$scope','$http',function($scope,$http)
	{
	/*var empid = ERP.getSessionValue("employee_id");
	console.log(empid);
		$http.post('/erp/selfservice/getexitreportemployees',empid).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					
				
				$scope.exitemployeesdata= $scope.data.responseObject;                  
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
		});*/
	$http.post('/erp/selfservice/getexitreportemployees').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.exitemployeesdata = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});
		$scope.getByIdemployeeexit = function(empid){
			alert(empid);
			$http.post('/erp/selfservice/getByIdemployeeexit',empid).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							$scope.data={object:$scope.data.responseObject};
						} else {    
							alert("Error while getting data");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
			
}]);