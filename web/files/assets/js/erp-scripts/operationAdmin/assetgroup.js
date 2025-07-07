var assetgroup = angular.module('assetgroupModule', []);

assetgroup.controller('assetgroupController', ['$http','$scope', function($http, $scope) {
	 $scope.addassetgroup = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.group_name == null || UserData.group_number == '' || UserData.group_number== undefined)
			  {
			  	swal("Enter Asset Group Name!");
			  }
			 else if(UserData.asset_nature == null || UserData.districtname == '' || UserData.districtname == undefined)
			  {
			  	swal("Select Asset Nature!");
			  }
			
			 else{    */
			alert(UserData.group_name + ' Insertion Successful');
			$http.post('/erp/operation/addassetgroup', UserData).then(   
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
			
			$scope.getByIdassetgroup = function(group_name){
				alert(group_name);
				$http.post('/erp/operation/getByIdassetgroup', group_name).then(
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
			$scope.updateDataassetgroup = function(UserData){
				alert(UserData.group_name);
				$http.post('/erp/operation/updateDataassetgroup', UserData).then(
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
			$http.get('/erp/operation/getAllassetgroup').then(function(response) {
				$scope.data = response.data;
				console.log($scope.data);  
				if ($scope.data.successful) {
					$scope.assetgroupdetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");  
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDataassetgroup = function(group_name) {
				$http.post('/erp/operation/removeDataassetgroup',group_name).then(
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
				$http.get('/erp/operation/getassetnature').then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.natures = $scope.data.responseObject;
					} else {
						alert("Can't view the Data");
					}
				}, function(errResponse) {
					console.error('Error while viewing notes');
				});	 
			

			
	}]);

		
		
