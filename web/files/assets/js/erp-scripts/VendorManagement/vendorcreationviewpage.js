var vendor = angular.module('Vendorcreationviewpage', []);
vendor.controller('vendorviewController',['$scope','$http',function($scope,$http)
{
	
	$http.post('/erp/vendor/getById', ERP.getSessionValue("vendor_id")).then(
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

}]);
         