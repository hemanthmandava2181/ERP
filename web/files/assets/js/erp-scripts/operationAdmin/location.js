var location = angular.module('locationModule', []);

location.controller('locationController', ['$http','$scope', function($http, $scope) {
	 $scope.addlocation = function(UserData) {
			
			/* if(UserData==null ||UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.location_name == null || UserData.location_name == '' || UserData.location_name== undefined)
			  {
			  	swal("Enter Location Name!");
			  }
			 else if(UserData.districtid == null || UserData.districtid == '' || UserData.districtid == undefined)
			  {
			  	swal("Select District Name!");
			  }
			   else if(UserData.constituencyid == null || UserData.constituencyid == '' || UserData.constituencyid == undefined)
			  {
			  	swal("Select Constituency Name!");
			  }
			   else if(UserData.mandalid == null || UserData.mandalid == '' || UserData.mandalid == undefined)
			  {
			  	swal("Select Mandal Name!");
			  }
			   else if(UserData.address1 == null || UserData.address1  == '' || UserData.address1  == undefined)
			  {
			  	swal("Enter Address!");
			  }
			   else if(UserData.address2 == null || UserData.address2 == '' || UserData.address2 == undefined)
			  {
			  	swal("Enter Address!");
			  }
			   else if(UserData.pin_code == null || UserData.pin_code == '' || UserData.pin_code == undefined)
			  {
			  	swal("Enter Pin Code!");
			  }
			
			 else{    */
			alert(UserData.location_name + ' Insertion Successful');
			$http.post('/erp/operation/addlocation', UserData).then(   
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
	
			//Get Data from Database based on group_name
			
			$scope.getByIdlocation = function(location_name){
				alert(location_name);
				$http.post('/erp/operation/getByIdlocation', location_name).then(
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
			$scope.updateDatalocation = function(UserData){
				alert(UserData.location_name);
				$http.post('/erp/operation/updateDatalocation', UserData).then(
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
			$http.get('/erp/operation/getAlllocation').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.locationdetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDatalocation = function(location_name) {
				$http.post('/erp/operation/removeDatalocation',location_name).then(
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
				
				
				$http.get('/erp/operation/getMandals').then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.mandals = $scope.data.responseObject;
					} else {
						alert("Can't view the Data");
					}
				}, function(errResponse) {
					console.error('Error while viewing notes');
				});
			
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

		
		
