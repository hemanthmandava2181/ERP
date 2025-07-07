var paymentsummary = angular.module('paymentsummaryModule', []);
paymentsummary.controller('PaymentSummmaryController',['$scope','$http',function($scope,$http)
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
	
	$http.get('/erp/report/getLetterheads')
	.then(
	function(response) { 
	$scope.data = response.data;
	if ($scope.data.successful) {

	$scope.letterheads = $scope.data.responseObject;
	} else {
	console
	.log("Client error while getting data");
	}
	}); 
	
	$scope.getEmployeeStaffwise=function(data){
		
		console.log(data);
		var obj={
				financial_year: data.financial_year,
				payroll_month: data.payroll_month
				
		}
	console.log(obj);
	$http.post('/erp/report/getEmployeeStaffwise',obj).then(function(response) {
		$scope.data = response.data;
		console.log($scope.data);
		if($scope.data.successful)
		{
			
			$scope.employeestaffwise = $scope.data.responseObject.dates;
			
			$("#displaystaff").show();
			$("#displayPaytype").hide();   
			$("#displaysaturation").hide();
			
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	
	
	
$scope.getEmployeePaytype=function(data){
		
	console.log(data);
	var obj={
			financial_year: data.financial_year,
			payroll_month: data.payroll_month
			
	}
	console.log(obj);
	$http.post('/erp/report/getEmployeePaytype',obj).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
		
			
			$scope.employeepaytype = $scope.data.responseObject.dates;
			
			$("#displaystaff").hide();
			$("#displayPaytype").show();   
			$("#displaysaturation").hide();
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	
	
$scope.getEmployeeSaturation=function(data){
		
	console.log(data);
	var obj={
			financial_year: data.financial_year,
			payroll_month: data.payroll_month
			
	}
	console.log(obj);
	$http.post('/erp/report/getEmployeeSaturation',obj).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
		
			
			$scope.employeesaturation = $scope.data.responseObject.dates;
			$("#displaystaff").hide();
			$("#displayPaytype").hide();   
			$("#displaysaturation").show();
		}
		else
		{
			console.log("Client error while getting data");  
		}
	})
	
	};
	
	
	


}]);                           