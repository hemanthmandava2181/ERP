var data12 = angular.module('upcomingSta', []);
data12.controller('upcomingstaffController', ['$http','$scope', function($http, $scope) {

console.log(hi)

$http.post('/erp/Employee/getAll5').then(function(response) {
	console.log(hieee)
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.empDetailss = $scope.data.responseObject;
					console.log($scope.empDetailss);
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {  
				console.error('Error while viewing notes');    
			});  
    

   


} ]);
