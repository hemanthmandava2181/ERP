var employee = angular.module('vehicleregistration', []);
employee.controller('vehicleregistrationController',['$scope','$http',function($scope,$http)
	{
	
	/* creating email settings */
	$scope.createvehicleRegistration = function(RegistratonData) {	
		console.log(RegistratonData);
		$http.post('/erp/finance/createvehicleRegistration',RegistratonData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("Vehicle Registration Created Successfully");
						ERP.showVehicleRegistration();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		
}]);