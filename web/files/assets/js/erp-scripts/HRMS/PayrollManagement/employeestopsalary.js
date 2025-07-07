var employeestopdata = angular.module('employeeStopsalaryModule', []);
employeestopdata.controller('EmployeeStopSalaryController',['$scope','$http',function($scope,$http)
{
	
	$http
	.get('/erp/report/getAlldata')
	.then(
	function(response) {
	$scope.data = response.data;
	if ($scope.data.successful) {

	$scope.financialyears = $scope.data.responseObject.finalyear;
	$scope.employees = $scope.data.responseObject.employees;
	} else {
	console
	.log("Client error while getting data");
	}
	});    
	
		
	$scope.addEmployeeStopSalary=function(data){
		
	
	console.log(obj);
	$http.post('/erp/report/addEmployeeStopSalary',data).then(function(response) {
		$scope.data = response.data;
		console.log($scope.data);
		if($scope.data.successful)
		{
			
			$scope.employeestaffwise = $scope.data.responseObject.dates;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	              
	
	
$scope.releasesalary=function(data){
		
	
	console.log(obj);
	$http.post('/erp/report/releasesalary',data).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			
			$scope.employeepaytype = $scope.data.responseObject.dates;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	
	   

	
	


}]);                           