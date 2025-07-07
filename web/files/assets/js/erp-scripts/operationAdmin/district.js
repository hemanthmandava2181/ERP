var district = angular.module('districtModule', []);

district.controller('districtController', ['$http','$scope', function($http, $scope) {
	 $scope.adddistrict = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.district_name == null || UserData.district_name == '' || UserData.district_name== undefined)
			  {
			  	swal("Enter District Name!");
			  }
			
			 else{    */
			alert(UserData.district_name + ' Insertion Successful');
			$http.post('/erp/operation/adddistrict', UserData).then(   
					function(response) {
						$scope.data = response.data;   
						if ($scope.data.successful) { 
							swal(" District Inserted Successfully");
						} else {
							swal("Data not inserted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
	
			//Get Data from Database based on group_name
			
			$scope.getByIddistrict = function(district_name){
				alert(district_name);
				$http.post('/erp/operation/getByIddistrict', district_name).then(
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
			$scope.updateDatadistrict = function(UserData){
				alert(UserData.district_name);
				$http.post('/erp/operation/updateDatadistrict', UserData).then(
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
			$http.get('/erp/operation/getAlldistrict').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.districtdetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeDatadistrict = function(district_name) {
				$http.post('/erp/operation/removeDatadistrict',district_name).then(
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
				
				
				 
			
	 }
			
	}]);

		
		
