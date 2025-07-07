var bankstatementdata = angular.module('employeeStatusModule', []);
bankstatementdata
		.controller(
				'EmployeeStatusController',
				[
						'$scope',
						'$http',
						function($scope, $http) {

						/*	$http
									.get('/erp/calc/getYears')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.financialyears = $scope.data.responseObject;
													console.log($scope.years);
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});

							$http
									.get('/erp/calc/getMonths')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.months = $scope.data.responseObject;
													console.log($scope.months);
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});*/
							
							$http.get('/erp/employee/getCaders').then(function(response) {
								$scope.data = response.data;
								if($scope.data.successful)
								{
									$scope.caders = $scope.data.responseObject;
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
							
							$http.get('/erp/employee/getGrades').then(function(response) {
								$scope.data = response.data;
								if($scope.data.successful)
								{
									$scope.grades = $scope.data.responseObject;
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

						

							$scope.getEmployeeStatusReport=function(data){
								var details = {
										from_date: document.getElementById('from').value,
										to_date: document.getElementById('to').value,
										caderid:data.caderid,
										gradeid:data.gradeid
										
									};
								console.log(details);
						    $http.post('/erp/report/getEmployeeStatusReport',details).then(function(response) {
								$scope.data = response.data;
								if ($scope.data.successful) {
									
								
									$scope.employeestatus = $scope.data.responseObject.dates;
									
									console.log($scope.employeestatus)
									$("#display1joining").show();
									$("#display1relieving").hide();
									$("#display1stop").hide();
								} else {
									console.log("Client error while getting data");
								}
							});  
							}
							
							
							
							
							$scope.getEmployeeStatusRelievingReport=function(data){
								var details = {
										from_date: document.getElementById('from').value,
										to_date: document.getElementById('to').value,
										caderid:data.caderid,
										gradeid:data.gradeid
										
									};
								console.log(details);
						    $http.post('/erp/report/getEmployeeStatusRelievingReport',details).then(function(response) {
								$scope.data = response.data;
								if ($scope.data.successful) {
									
								
									$scope.empreliveve = $scope.data.responseObject.dates;
									
									console.log($scope.employeestatus)
									$("#display1joining").hide();
									$("#display1relieving").show();  
									$("#display1stop").hide();
								} else {
									console.log("Client error while getting data");
								}
							});  
							}
							

						

						} ]);