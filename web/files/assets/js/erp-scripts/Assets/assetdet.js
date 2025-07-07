var employee = angular.module('assetdet', []);
employee.controller('assetdetcontroller',['$scope','$http',function($scope,$http)
	{
	
	$http.get('/erp/purchase/getLocations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.locations = $scope.data.responseObject;
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