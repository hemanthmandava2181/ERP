var employee = angular.module('vehicletypes', []);
employee.controller('vehicletypesController',['$scope','$http',function($scope,$http)
	{
	
	/* creating vehicle types */
	$scope.createvehicletype = function(VehicletypeeData) {	
		console.log(VehicletypeeData);
		$http.post('/erp/finance/createvehicletype',VehicletypeeData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Vehicle Type Created Successfully");
						ERP.showVehicleTypes();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		
		/* Getting caders */
		   
		$http.get('/erp/employee/getCaders').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.caders = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		/* Getting grades */
		
		$http.get('/erp/employee/getGrades').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.grades = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		/* getting designations */
		$http.get('/erp/employee/getDesignation').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.designations = $scope.data.responseObject;
			}
			else     
			{
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		/* getting all vehicle types data to table */
		$http.get('/erp/finance/getalllvehicletypessdata').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.userdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});
		
		/* getting vehicle type data based on id */
		$scope.getvehicletypedatadata = function(id){
			console.log(id);
			$http.post('/erp/finance/getvehicletypedatadata', id).then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.data={object:$scope.data.responseObject};
					console.log($scope.data);
				} else {
					alert("Error while getting data");
				}      
			}, function(errResponse) {      
				console.error('Error while fetching notes');
			});
		};       
		
		/* updating vehicle type data based on id */
		$scope.updatevehicletypedata = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/updatevehicletypedata', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							/*Andromeda.showcreatecostcenterPage();*/
							swal("Vehicle Type Data Successfully updated");
							ERP.showVehicleTypes();							
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
	
		
}]);