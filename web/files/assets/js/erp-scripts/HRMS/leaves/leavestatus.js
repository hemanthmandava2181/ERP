var LeaveStatus = angular.module('LeaveStatusModule', []);
LeaveStatus.controller('LeaveStatusController', ['$http','$scope', function($http, $scope) {
	
			var empid = ERP.getSessionValue("employee_id");
			console.log(empid);
				$http.post('/erp/user/getAllLeaves',empid).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								$scope.userdetails={object:$scope.data.responseObject};
								/*console.log(data);*/
							} else {    
								alert("Error while getting data");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
					
		} ]);