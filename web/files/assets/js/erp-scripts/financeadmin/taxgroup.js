var employee = angular.module('taxgroup', []);
employee.controller('taxgroupController',['$scope','$http',function($scope,$http)
	{
	

				/* creating tax group */
			$scope.createtaxgroup = function(TaxgroupData) {
				console.log(TaxgroupData);
				$http.post('/erp/finance/createtaxgroup', TaxgroupData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Tax Group Created Successfully");
								Andromeda.showcreatetaxgroupPage();
							} else {
								alert("Data not inserted");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};

			/* getting all cost center data in table */
			$http.get('/erp/finance/getallltaxgroups').then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							$scope.userdetails = $scope.data.responseObject;
						} else {
							console.log("Client error while getting data");
						}
			});
			
			/* getting Tax group data based on tax group name */
			$scope.gettaxgroupdata = function(tax_group_name){
				console.log(tax_group_name);
				/*alert(empid);*/
				$http.post('/erp/finance/gettaxgroupdata', tax_group_name).then(
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
			
			/* updating tax group data based on tax groupr name */
			$scope.updatetaxgroup = function(UserData){
				console.log(UserData);   
				/*alert(UserData.empid);*/
				$http.post('/erp/finance/updatetaxgroup', UserData).then(
						function(response) {
							$scope.data = response.data;  
							if ($scope.data.successful) {
								/*Andromeda.showcreatetaxgroupPage();*/
								alert("Tax Group Successfully updated");
								$("#myModel").hide();
								$('.modal-backdrop').remove();
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};
	
		
}]);