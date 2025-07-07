var polist = angular.module('POListModule', []);
polist.controller('POListController',['$scope','$http',function($scope,$http)
{
	
	$http.get('/erp/polist/getAll3').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.poldetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	$scope.submitted = function(UserData)	
	{
	$http.post('/erp/polist/getAll').then(function(response) {
		$scope.data = response.data;  
		if($scope.data.successful)
		{
			$scope.poldetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	};
	$scope.save = function(UserData)	
	{
	$http.post('/erp/polist/getAll1').then(function(response) {
		$scope.data = response.data;  
		if($scope.data.successful)
		{
			$scope.poldetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	};
	
	
}]);