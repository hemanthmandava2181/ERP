var sdei = angular.module('sdeiModule', []);

sdei.controller('sdeiController', ['$http','$scope', function($http, $scope) {
	 $scope.registration = function(UserData) {
			console.log(UserData);
			 if(UserData==null || UserData=='' || UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.sdei_groupnumber == null || UserData.sdei_groupnumber == '' || UserData.sdei_groupnumber== undefined)
			  {
			  	swal("Enter SDEI Group Number!");
			  }
			 else if(UserData.sdei_groupname == null || UserData.sdei_groupname == '' || UserData.sdei_groupname== undefined)
			  {
			  	swal("Enter SDEI Group Name!");
			  }
			 else if(UserData.description == null || UserData.description == '' || UserData.description == undefined)
			  {
			  	swal("Enter Description!");
			  }   
			 
			 else{    
			alert(UserData.sdei_groupname + ' Insertion Successful');
			$http.post('/erp/sdei/add', UserData).then(   
					function(response) {
						$scope.data = response.data;   
						if ($scope.data.successful) { 
							swal("SDEI Inserted Successfully");
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
	
			//Get Data from Database based on group_name
			
			$scope.getById = function(sdei_groupname){
				alert(sdei_groupname);
				$http.post('/erp/sdei/getById', sdei_groupname).then(
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
				alert(UserData.sdei_groupname);
				$http.post('/erp//updateData', UserData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Project Successfully updated");
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};

			// View Data from Database
			$http.post('/erp/sdei/getAll').then(function(response) {
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
			$scope.removeData = function(sdei_groupname) {
				$http.post('/erp/sdei/removeData',sdei_groupname).then(
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

		
		
