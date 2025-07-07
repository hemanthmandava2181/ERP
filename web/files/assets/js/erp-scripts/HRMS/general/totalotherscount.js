var data123 = angular.module('totalother', []);
data123.controller('otherController', ['$http','$scope', function($http, $scope) {



$http.post('/erp/Employee/getAll4').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.empDetail13 = $scope.data.responseObject;
					console.log($scope.empDetail13);
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {  
				console.error('Error while viewing notes');
			});
    

 


} ]);
