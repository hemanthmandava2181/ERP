var assetname = angular.module('assetnameModule', []);

assetname.controller('assetnameController', ['$http','$scope', function($http, $scope) {
	 $scope.addassetname = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.asset_name == null || UserData.asset_name == '' || UserData.asset_name== undefined)
			  {
			  	swal("Enter Asset Name!");
			  }
			 else if(UserData.gl_account == null || UserData.gl_account == '' || UserData.gl_account == undefined)
			  {
			  	swal("Select GL Account!");
			  }
			
			 else{    */
			alert(UserData.asset_name + ' Insertion Successful');
			$http.post('/erp/operation/addassetname', UserData).then(   
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
			
			$scope.getByIdassetname = function(asset_name){
				alert(asset_name);
				$http.post('/erp/operation/getByIdassetname', asset_name).then(
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
			$scope.updateDataassetname = function(UserData){
				alert(UserData.asset_name);
				$http.post('/erp/operation/updateDataassetname', UserData).then(
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
			$http.get('/erp/operation/getAllassetname').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.assetnamedetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDataassetname = function(asset_name) {
				$http.post('/erp/operation/removeDataassetname',asset_name).then(
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
				
				
				// View Data from Database
				$http.get('/erp/operation/getglaccounts').then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.glaccounts = $scope.data.responseObject;
					} else {
						alert("Can't view the Data");
					}
				}, function(errResponse) {
					console.error('Error while viewing notes');
				}); 
			

			
	}]);

		
		
