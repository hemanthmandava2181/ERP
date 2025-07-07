var payrollsummary = angular.module('payrollsummaryModule', []);
payrollsummary.controller('PayrollSummmaryController',['$scope','$http',function($scope,$http)
{
	
	$http
	.get('/erp/calc/getYears')
	.then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.financialyears = $scope.data.responseObject;
					console.log($scope.years);
				} else {
					console
							.log("Client error while getting data");
				}
			},
			function(response) {
				console
						.log("Server error while getting data");
			});

$http
	.get('/erp/calc/getMonths')
	.then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.months = $scope.data.responseObject;
					console.log($scope.months);
				} else {
					console
							.log("Client error while getting data");
				}
			},
			function(response) {
				console
						.log("Server error while getting data");
			});    
	
	$scope.getEmployeeStaff=function(data){
		
		console.log(data);
		var obj={
				financial_year: data.financial_year,
				payroll_month: data.payroll_month
				
		}
	console.log(obj);
	$http.post('/erp/report/getEmployeeStaff',obj).then(function(response) {
		$scope.data = response.data;
		console.log($scope.data);
		if($scope.data.successful)
		{
		
			
			$scope.employeestaff = $scope.data.responseObject.dates;
			
			$("#displaystaff").show();
			$("#displayothers").hide();   
			$("#displayDeputation").hide();
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	
	
	
$scope.getEmployeeOthers=function(data){
		
	console.log(data);
	var obj={
			financial_year: data.financial_year,
			payroll_month: data.payroll_month
			
	}
	console.log(obj);
	$http.post('/erp/report/getEmployeeOthers',obj).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
		
			
			$scope.employeeother = $scope.data.responseObject.dates;
			
			$("#displaystaff").hide();
			$("#displayothers").show();   
			$("#displayDeputation").hide();
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	
	
$scope.getEmployeeDeputation=function(data){
		
	console.log(data);
	var obj={
			finacial_year: data.finacial_year,
			payroll_month: data.payroll_month
			
	}
	console.log(obj); 
	$http.post('/erp/report/getEmployeeDeputation',obj).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			
			
			$scope.employeedeputation = $scope.data.responseObject.dates;
			
			$("#displaystaff").hide();
			$("#displayothers").hide();    
			$("#displayDeputation").show();
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	
	


}]);                           