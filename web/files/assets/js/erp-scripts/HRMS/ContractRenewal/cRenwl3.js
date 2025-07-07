var newdata = angular.module('cRenwl3', []);
newdata.controller('RegistrationController33', ['$http','$scope', function($http, $scope) {
	$http.post('/erp/Employee/getAll9').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.details = $scope.data.responseObject;
			console.log($scope.details);
		} else {   
			alert("Can't view the Data");     
		}      
	}, function(errResponse) {  
		console.error('Error while viewing notes');     
	});
	
	
	
	
} ]);