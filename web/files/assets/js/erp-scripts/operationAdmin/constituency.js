var constituency= angular.module('constituencyModule', []);

constituency.controller('constituencyController', ['$http','$scope', function($http, $scope) {
	 $scope.addconstituency = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.name == null || UserData.name == '' || UserData.name== undefined)
			  {
			  	swal("Enter Constituency Name!");
			  }
			 else if(UserData.districtid == null || UserData.districtid == '' || UserData.districtid == undefined)
			  {
			  	swal("Select District Name!");
			  }
			
			 else{    */
			alert(UserData.name + 'Constituency  Insertion Successful');
			$http.post('/erp/operation/addconstituency', UserData).then(function(response) {
				console.log(UserData);
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
			
			$scope.getByIdconstituency = function(name){
				alert(name);
				$http.post('/erp/operation/getByIdconstituency', name).then(
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
			$scope.updateDataconstituency = function(UserData){
				alert(UserData.name);
				$http.post('/erp/operation/updateDataconstituency', UserData).then(
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
			$http.get('/erp/operation/getAllconstituency').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.constituencydetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDataconstituency = function(name) {
				$http.post('/erp/operation/removeDataconstituency',name).then(
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
				
				 
			

			
	}]);

		
		
