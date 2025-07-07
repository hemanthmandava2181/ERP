var segment = angular.module('segmentModule', []);

segment.controller('segmentController', ['$http','$scope', function($http, $scope) {
	 $scope.registration = function(UserData) {
			console.log(UserData);
			 if(UserData==null || UserData=='' || UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			/* else if(UserData.segment_id == null || UserData.segment_id == '' || UserData.segment_id == undefined)
			  {
			  	swal("Enter Segment Id!");
			  }*/
			 else if(UserData.segment_name == null || UserData.segment_name == '' || UserData.segment_name == undefined)
			  {
			  	swal("Enter Segment Name!");
			  }
			 
			 
			 else{
			alert(UserData.segment_name + '  Successful');
			$http.post('/erp/segment/add', UserData).then(
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
			$scope.getById = function(segment_name){
				alert(segment_name);
				$http.post('/erp/segment/getById', segment_name).then(
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
				alert(UserData.segment_name);
				$http.post('/erp/segment/updateData', UserData).then(
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
			$http.post('/erp/segment/getAll').then(function(response) {
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
			$scope.removeData = function(segment_name) {
				$http.post('/erp/segment/removeData',segment_name).then(
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

		
		
