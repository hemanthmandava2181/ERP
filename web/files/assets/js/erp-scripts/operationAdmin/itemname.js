var itemname = angular.module('itemnameModule', []);

itemname.controller('itemnameController', ['$http','$scope', function($http, $scope) {
	 $scope.additemname = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.item_name == null || UserData.item_name == '' || UserData.item_name== undefined)
			  {
			  	swal("Enter Item Name!");
			  }
			 else if(UserData.item_group == null || UserData.item_group == '' || UserData.item_group == undefined)
			  {
			  	swal("Select Item Group!");
			  }
			
			 else{    */
			alert(UserData.item_name + ' Insertion Successful');
			$http.post('/erp/operation/additemname', UserData).then(   
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
	/* $scope.registration=function(UserDetails){
			///console.log(formData.username);
*/		
		/*};	
	*/
			//Get Data from Database based on group_name
			
			$scope.getByIditemname = function(item_name){
				alert(item_name);
				$http.post('/erp/operation/getByIditemname', item_name).then(
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
			$scope.updateDataitemname = function(UserData){
				alert(UserData.item_name);
				$http.post('/erp/operation/updateDataitemname', UserData).then(
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
			$http.post('/erp/operation/getAllitemname').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.itemnamedetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			/*$scope.removeDatadistrict = function(districtname) {
				$http.post('/erp/operation/removeData',districtname).then(
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
				
				*/
				 
			
			$http.get('/erp/operation/getItemgroups').then(function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							$scope.groups = $scope.data.responseObject;
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

		
		
