var bankstatementdata = angular.module('exceptionReportModule', []);
bankstatementdata
		.controller(
				'ExceptionReportController',
				[
						'$scope',
						'$http',
						function($scope, $http) {

					
							
							$http.get('/erp/employee/GetStatus').then(function(response) {
								$scope.data = response.data;
								if($scope.data.successful)
								{
									$scope.userstatus = $scope.data.responseObject;
								}
								else
								{
									console.log("Client error while getting data");
								}
							},
							function(response)
							{
								console.log("Server error while getting data");
							});
							
							/* Getting grades */
							
						
						

							$scope.getAllExceptiondata=function(data){
							
								
								
								console.log(data);
						    $http.post('/erp/report/getAllExceptiondata',data).then(function(response) {
								$scope.data = response.data;
								if ($scope.data.successful) {
									
									$scope.employeestatus = $scope.data.responseObject.dates;
									
									console.log($scope.employeestatus)
								
								} else {
									console.log("Client error while getting data");
								}
							});  
							}
							
							
							
							
						
							

						

						} ]);