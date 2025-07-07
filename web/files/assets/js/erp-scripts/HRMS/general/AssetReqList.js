var employee = angular.module('AssetReqList', []);
employee.controller('AssetReqListController',['$scope','$http',function($scope,$http)
{
$http.get('/erp/Grnlist/getAll').then(function(response) {
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