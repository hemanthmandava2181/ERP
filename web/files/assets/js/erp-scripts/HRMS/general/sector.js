var sector = angular.module('sectorModule', []);

sector.controller('sectorController', ['$http','$scope', function($http, $scope) {
	 $scope.registration = function(UserData) {
			console.log(UserData);
			 if(UserData==null || UserData=='' || UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			 else if(UserData.sector_id == null || UserData.sector_id == '' || UserData.sector_id == undefined)
			  {
			  	swal("Enter Sector ID!");
			  }
			 
			 else if(UserData.sector_name == null || UserData.sector_name == '' || UserData.sector_name == undefined)
			  {
			  	swal("Enter Sector Name!");
			  }
			 
			 else{
			alert(UserData.sector_name + '  Successful');
			$http.post('/erp/sector/add', UserData).then(
					function(response) {
						$scope.data = response.data;   
						if ($scope.data.successful) {
							location.reload();   
							swal("User Data Inserted Successfully");
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
		};	
	
			//Get Data from Database based on Name
			$scope.getById = function(sector_name){
				alert(sector_name);
				$http.post('/erp/sector/getById', sector_name).then(
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
			$scope.updateData = function(UserData){
				alert(UserData.sector_name);
				$http.post('/erp/sector/updateData', UserData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert("User Details Successfully updated");
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};

			// View Data from Database
			$http.post('/erp/sector/getAll').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.userdetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
			$scope.removeData = function(sector_name) {
				$http.post('/erp/sector/removeData',sector_name).then(
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

		
		
