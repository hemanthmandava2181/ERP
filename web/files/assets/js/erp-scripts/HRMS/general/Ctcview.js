var ctc = angular.module('Ctcview', []);

ctc.controller('CtcviewController', [ '$http', '$scope', function($http, $scope) {

	
	

		/*$http.post('/erp/calc/getById', name).then(function(response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
				$scope.data = {
					object : $scope.data.responseObject
				};
			} else {       
				// alert("Error while getting data");
				console.log("error")

			}
		}, function(errResponse) {
			console.error('Error while fetching notes');
		});*/
	var name=Andromeda.getSessionValue("name");
	
	$http.post('/erp/calc/getById', name).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.data = {
				object : $scope.data.responseObject
			};
			
		} else {
			alert("Error while getting data");
		}
	}, function(errResponse) {
		console.error('Error while fetching notes');
	});


	$http.post('/erp/ctc/getEarnings').then(function(response) {
		$scope.data = response.data;    
		if ($scope.data.successful) {
			$scope.userdetails = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}   
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});

	$http.post('/erp/ctc/getDeductions').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.regdetails1 = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});

	
	
	/*$http.post('/erp/calc/getAll').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.regdetails = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}   
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});


*/

}]);