var ledgerhead = angular.module('ledgerheadModule', []);

ledgerhead.controller('ledgerheadController', ['$http','$scope', function($http, $scope) {
	 $scope.addledgerhead = function(UserData) {
			
			/* if(UserData==null || UserData=='' ||UserData==undefined)
			  {
			  	swal("Enter all details!");
			  }
			
			 else if(UserData.name == null || UserData.name == '' || UserData.name == undefined)
			  {
			  	swal("Enter Ledger Head Name!");
			  }
			else if(UserData.description == null || UserData.description == '' || UserData.description== undefined)
			  {
			  	swal("Enter Description!");
			  }
			 else{    */
			alert(UserData.name + ' Insertion Successful');
			$http.post('/erp/operation/addledgerhead', UserData).then(   
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
	
			//Get Data from Database based on group_name
			
			$scope.getByIdledgerhead = function(name){
				alert(name);
				$http.post('/erp/operation/getByIdledgerhead', name).then(
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
			$scope.updateDataledgerhead = function(UserData){
				alert(UserData.name);
				$http.post('/erp/operation/updateDataledgerhead', UserData).then(
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
			$http.get('/erp/operation/getAllledgerhead').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.ledgerheaddetails = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

			// Delete UserData based on Name
		$scope.removeDataledgerhead = function(name) {
				$http.post('/erp/operation/removeDataledgerhead',name).then(
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

		
		
