var data123 = angular.module('hrlist', []);
data123.controller('hrController', ['$http','$scope', function($http, $scope) {


	


$http.post('/erp/Employee/gethr').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.regdetails = $scope.data.responseObject;
					console.log($scope.regdetails);
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {  
				console.error('Error while viewing notes');
			});   






}]);













