var asset = angular.module('assetModule', []);

asset.controller('assetController', ['$http','$scope', function($http, $scope) {
	 $scope.addassetclassname = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.asset_name == null || UserData.group_number == '' || UserData.group_number== undefined)
			  {
			  	swal("Enter SDEI Group Number!");
			  }
			 else if(UserData.districtname == null || UserData.districtname == '' || UserData.districtname == undefined)
			  {
			  	swal("Enter District Name!");
			  }
			
			 else{    */
			alert(UserData.name + ' Insertion Successful');
			$http.post('/erp/operation/addassetclass', UserData).then(   
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
			
			$scope.getByIdassetclass = function(name){
				alert(name);
				$http.post('/erp/operation/getByIdassetclass', name).then(
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
			$scope.updateDataassetclass = function(UserData){
				alert(UserData.name);
				$http.post('/erp/operation/updateDataassetclass', UserData).then(
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
			$http.get('/erp/operation/getAllassetclass').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.assetclassdetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDataassetclass = function(name) {
				$http.post('/erp/operation/removeDataassetclass',name).then(
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
				
				
				 
			

			
	}]);

		
		
