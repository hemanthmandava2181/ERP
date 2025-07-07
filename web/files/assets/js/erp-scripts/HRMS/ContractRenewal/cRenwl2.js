var data123 = angular.module('cRenwl2', []);
data123.controller('rewlController', ['$http','$scope', function($http, $scope) {
	$http.post('/erp/Employee/getAll9').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.regdetails1 = $scope.data.responseObject;
			console.log($scope.regdetails1);
		} else {   
			alert("Can't view the Data");
		}      
	}, function(errResponse) {  
		console.error('Error while viewing notes');      
	});
	  
	/*$scope.getByempid = function(empid){
		console.log(empid)
	$http.post('/erp/Employee/getempid',empid).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			console.log($scope.getByempid);
		} else {
			alert("Can't view the Data");
		}
	}, function(errResponse) {  
		console.error('Error while viewing notes');
	});

	}*/
	
	
	
	$scope.updateData = function(UserData){
		/*UserData.empid=ERP.getSessionValue("employee_id");*/
		for(i in UserData){console.log("Message:"+i);}
		$http.post('/erp/Employee/updateData12', UserData).then(
				function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						window.alert("Initiated contract renewal process");
						location.reload();
						ERP.showEmployeeContarctRenewal();
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};	
	
	
	
	
} ]);