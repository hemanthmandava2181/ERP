var employee = angular.module('bookedinvoices', []);
employee.controller('bookedinvoicesController',['$scope','$http',function($scope,$http)
	{
	
	/* getting data in booked invoices table */
	$http.get('/erp/finance/getallbookedreceivablesData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.receivablesbookinvoices = $scope.data.responseObject;
			console.log($scope.receivablesbookinvoices);
		}   
		else   
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting data in partially paid tab */
	$http.get('/erp/finance/getpartiallypaideceivablesData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.receivablespartiallypaidinvoices = $scope.data.responseObject;
			console.log($scope.receivablespartiallypaidinvoices);
		}   
		else   
		{
			console.log("Client error while getting data");  
		}
	});
	
	
		
}]);