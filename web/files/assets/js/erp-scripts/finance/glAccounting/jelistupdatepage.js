var employee = angular.module('jelistupdatepage', []);
employee.controller('jelistupdateController',['$scope','$http',function($scope,$http)
	{
	
	$http.post('/erp/finance/getupdatesubperioddata', ERP.getSessionValue("voucher_number")).then(
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
	
	/* getting project drop down */
	$http.get('/erp/finance/getprojects').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.projects = $scope.data.responseObject;
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
	
	/* getting cost centers drop down */
	$http.get('/erp/employee/getCost_center').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.cost_centers = $scope.data.responseObject;
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
	
	/* getting work order names to drop down */
	$http.get('/erp/finance/getworkorders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.orders = $scope.data.responseObject;
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
	
	          
	/* updating JE */
	$scope.updateJE = function(JEData){
		console.log(JEData);   
		$http.post('/erp/finance/updateJE', JEData).then(
				function(response) {
					$scope.data = response.data;  
					if ($scope.data.successful) {
						swal("JE Successfully updated");
						ERP.showJEList();						
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	
	
}]);