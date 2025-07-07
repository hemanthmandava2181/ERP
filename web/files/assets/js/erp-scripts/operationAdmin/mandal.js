var mandal = angular.module('mandalModule', []);

mandal.controller('mandalController', ['$http','$scope', function($http, $scope) {
	 $scope.addmandal = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||(UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.mandal_name == null || UserData.mandal_name == '' || UserData.mandal_name == undefined)
			  {
			  	swal("Enter Mandal Name!");
			  }
			 else if(UserData.districtid == null || UserData.districtid == '' || UserData.districtid == undefined)
			  {
			  	swal("Select District Name!");
			  }
			 else if(UserData.constituency == null || UserData.constituency == '' || UserData.constituency  == undefined)
			  {
			  	swal("Select Constituency  Name!");
			  }
			 else{    */
			alert(UserData.mandal_name + ' Insertion Successful');
			$http.post('/erp/operation/addmandal', UserData).then(   
					function(response) {
						$scope.data = response.data;   
						if ($scope.data.successful) { 
							swal("Inserted Successfully");
						} else {
							swal("Data not inserted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			 }
		//Get Data from Database 
			
			$scope.getByIdmandal = function(mandal_name){
				alert(mandal_name);
				$http.post('/erp/operation/getByIdmandal', mandal_name).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								$scope.data={object:$scope.data.responseObject};
							} else {
								alert("Error while getting data");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};
			
			//Update User Details
			$scope.updateDatamandal = function(UserData){
				alert(UserData.mandal_name);
				$http.post('/erp/operation/updateDatamandal', UserData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Successfully updated");
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};

			// View Data from Database
			$http.get('/erp/operation/getAllmandal').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.mandaldetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDatamandal = function(mandal_name) {
				$http.post('/erp/operation/removeDatamandal',mandal_name).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								location.reload();
								alert("User Data removed Successfully");
							} else {
								alert("Data not Deleted");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
				};
				
				
				 
			$http.get('/erp/operation/getdistricts').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.districts = $scope.data.responseObject;
				} else {
					console
							.log("Client error while getting data");
				}
			},
			function(response) {
				console
						.log("Server error while getting data");
			});
	
			$http.get('/erp/operation/getConstituencys').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.cons= $scope.data.responseObject;
				} else {
					console
							.log("Client error while getting data");
				}
			},
			function(response) {
				console
						.log("Server error while getting data");
			});
	

			
	}]);

		
		
