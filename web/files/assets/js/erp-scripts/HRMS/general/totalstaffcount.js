var data123 = angular.module('totalStaff', []);
data123.controller('staffController', ['$http','$scope', function($http, $scope) {



$http.post('/erp/Employee/getAll3').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.empDetail = $scope.data.responseObject;
					console.log($scope.empDetail);
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {  
				console.error('Error while viewing notes');
			});


} ]);
