var itemgroup = angular.module('itemgroupModule', []);

itemgroup.controller('itemgroupController', ['$http','$scope', function($http, $scope) {
	 $scope.additemgroup = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.group_name == null || UserData.group_name == '' || UserData.group_namer== undefined)
			  {
			  	swal("Enter Group Name!");
			  }
			
			
			 else{    */
			alert(UserData.group_name + ' Insertion Successful');
			$http.post('/erp/operation/additemgroup', UserData).then(   
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
			
			$scope.getByIditemgroup = function(group_name){
				alert(group_name);
				$http.post('/erp/operation/getByIditemgroup', group_name).then(
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
			$scope.updateDataitemgroup = function(UserData){
				alert(UserData.group_name);
				$http.post('/erp/operation/updateDataitemgroup', UserData).then(
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
			$http.get('/erp/operation/getAllitemgroup').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.itemgroupdetails = $scope.data.responseObject;
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
				 
			

			
	}]);

		
		
