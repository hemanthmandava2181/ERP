var employee = angular.module('payslip', []);
employee.controller('payslipcontroller',['$scope','$http',function($scope,$http)
	{
	
	
	/* Getting Years */
	$http.get('/erp/purchase/getYears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.years = $scope.data.responseObject;
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
	
	
	/* Getting Months */
	$http.get('/erp/purchase/getMonths').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.months = $scope.data.responseObject;
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
	
	
	/* Getting Details based on empid 
	$scope.getdeatils = function(data){
		alert(empid);
		$http.post('/erp/Employee/getdeatils', data).then(
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
	};*/
	   
	/* Getting Employee type */

	$http.get('/erp/Employee/getStaff').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.types = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});
	
	
	/* Getting data in table for others */
	$scope.getdetails=function(data){
		console.log(data);
	$http.post('/erp/Employee/getdetails',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject.dates;
			console.log($scope.regdetails);
		}
		else
		{
			console.log("Client error while getting data");  
		}  
	});
	
		  
	}
	
	    
}]);