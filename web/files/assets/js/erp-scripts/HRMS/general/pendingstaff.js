var data123 = angular.module('pendingRenwl', []);
data123.controller('PendingController', ['$http','$scope', function($http, $scope) {




$http.post('/erp/Employee/getAll6').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.empDetails = $scope.data.responseObject;
					console.log($scope.empDetails);
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {  
				console.error('Error while viewing notes');
			});
}]);
