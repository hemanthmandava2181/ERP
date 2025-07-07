var assetnature = angular.module('assetnatureModule', []);

assetnature.controller('assetnatureController', ['$http','$scope', function($http, $scope) {
	 $scope.addassetnature = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.name == null || UserData.name == '' || UserData.name== undefined)
			  {
			  	swal("Enter Asset Nature Name!");
			  }
			 else if(UserData.asset_class == null || UserData.asset_class == '' || UserData.asset_class== undefined)
			  {
			  	swal("Select Asset Class!");
			  }
			
			 else{    */
			alert(UserData.name + ' Insertion Successful');
			$http.post('/erp/operation/addassetnature', UserData).then(   
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
	
			//Get Data from Database based on name
			
			$scope.getByIdassetnature = function(name){
				alert(name);
				$http.post('/erp/operation/getByIdassetnature', name).then(
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
			$scope.updateDataassetnature = function(UserData){
				alert(UserData.name);
				$http.post('/erp/operation/updateDataassetnature', UserData).then(
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
			$http.get('/erp/operation/getAllassetnature').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.assetnaturedetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDataassetnature = function(name) {
				$http.post('/erp/operation/removeDataassetnature',name).then(
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
				
				
				$http.get('/erp/operation/getassetclass').then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.assetclasses= $scope.data.responseObject;
					} else {
						alert("Can't view the Data");
					}
				}, function(errResponse) {
					console.error('Error while viewing notes');
				}); 
			

			
	}]);

		
		
