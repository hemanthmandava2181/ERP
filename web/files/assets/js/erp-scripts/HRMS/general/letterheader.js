var ctc = angular.module('ctcModule', []);      

ctc.controller('ctcController', ['$http','$scope', function($http, $scope) {
	 $scope.registration = function(UserData) {
			console.log(UserData);
			 if(UserData==null || UserData=='' || UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(UserData.pname == null || UserData.pname == '' || UserData.pname == undefined)
			  {
			  	swal("Enter Name!");
			  }
			 else if(UserData.title == null || UserData.title == '' || UserData.title == undefined)
			  {
			  	swal("Enter Title!");
			  }
			
			 else{                              
			alert(UserData.pname + ' Registration Successful');
			$http.post('/erp/ctc/add', UserData).then(
					function(response) {
						$scope.data = response.data;             
						if ($scope.data.successful) {
							/*location.reload(); */  
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
			// User Registration Module    
	
			
			
			//Update User Details
			$scope.updateData = function(UserData){
				alert(UserData.name);
				$http.post('/erp/ctc/updateData', UserData).then(
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
			$scope.getById = function(name){
				alert(name);
				$http.post('/erp/ctc/getById', first_name).then(
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

			// View Data from Database
			$http.post('/erp/ctc/getAll').then(function(response) {
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
			$scope.removeData = function(name) {
				$http.post('/erp/ctc/removeData',name).then(
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