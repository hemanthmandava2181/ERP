var employee = angular.module('Fixedasset', []);
employee.controller('FixedController',['$scope','$http',function($scope,$http)
	{
	
	$http.get('/erp/purchase/getYears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.yearrange = $scope.data.responseObject;
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