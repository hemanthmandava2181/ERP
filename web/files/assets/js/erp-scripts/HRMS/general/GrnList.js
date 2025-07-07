var employee = angular.module('GrnList', []);
employee.controller('GrnListController',['$scope','$http',function($scope,$http)
{
$http.get('/erp/polist/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.linedetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});


}]);             