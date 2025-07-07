var stopsalary = angular.module('employeeStopsalaryModule', []);
stopsalary
		.controller(
				'EmployeeStopSalaryController',
				[
						'$scope',
						'$http',
						function($scope, $http) {
							
							

							$http
									.get('/erp/calc/getYears')
									.then(   
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.financialyears = $scope.data.responseObject;
													console.log($scope.financialyears);
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
									}); 
						
							
							
							
							$http
									.get('/erp/employee/getEmp')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.empnames = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});
							$scope.comm = function() {
								$("#com").show();
							}
							$scope.addstopsalaryData = function(UserData) {
								
								var stop_by=ERP.getSessionValue("employee_id")
								 var details={
									
									empid:UserData.empid,
									stop_date:UserData.stop_date,
									stop_by:stop_by
								}
								console.log(details);
								
									alert(UserData + '  Successful');
									$http
											.post('/erp/ctc/addstopsalaryData',
													details)
											.then(
													function(response) {
														$scope.data = response.data;
														if ($scope.data.successful) {

															swal("Salary has Been Stopped");
															$("#display").show();
														} else {
															swal("Data not inserted");
														}
													},
													function(errResponse) {
														console
																.error('Error while fetching notes');
													});
				

							};

							$scope.getStopData = function(data) {
								console.log(data);
								$http
										.post('/erp/ctc/getStopData', data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														console
																.log($scope.data);
														$scope.saldetails = $scope.data.responseObject.centers;
														console
																.log($scope.saldetails);
														
														$("#display").show();
													} else {
														var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
																+ $scope.data.errorMessage
																+ "</div>";
														jQuery("#errorDiv")
																.html(message);
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							
							
							$scope.releasestopdate = function(data) {
								console.log(data);
								$http
										.post('/erp/ctc/releasestopdate', data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$("#display").hide();
														
														$("#display1").hide();
														$("#display2").show();
														console
																.log($scope.data);
														$scope.releasestopdate = $scope.data.responseObject.centers;
														console
																.log($scope.releasestopdate);
														
														
														
													} else {
														var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
																+ $scope.data.errorMessage
																+ "</div>";
														jQuery("#errorDiv")
																.html(message);
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							
							
							
							$scope.releasestopsalary = function(data) {
								console.log(data);
								$http
										.post('/erp/ctc/releasestopsalary', data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														
													
														$("#display").hide();
														$("#display2").hide();
														$("#display1").show();
														console
																.log($scope.data);
														$scope.salreleasedetails = $scope.data.responseObject.centers;
													
													
														console
																.log($scope.salreleasedetails);
														
													
													} else {
														var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
																+ $scope.data.errorMessage
																+ "</div>";
														jQuery("#errorDiv")
																.html(message);
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							
							
							
							$scope.releaseEmployeestopsalaryDate = function(data) {
								console.log(data);
								
								var details={
										empid:data.empid,
										stop_date:data.stop_date,
										release_date:data.release_date
										
								}
								console.log(details)
								$http
										.post('/erp/ctc/releaseEmployeestopsalaryDate', details)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														
													
														swal("Salary has Been Released!");
														
														
													} else {
														var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
																+ $scope.data.errorMessage
																+ "</div>";
														jQuery("#errorDiv")
																.html(message);
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							
							
							$scope.releasestopsalarypayroll = function(data)
							{
								
								console.log(data);
								$http.post('/erp/ctc/releasestopsalarypayroll',data).then(function(response)
															{					  
																         
																$scope.data1 = response.data;
																
																if($scope.data1.successful)
														           {  
																	
															    	   swal({  
													  			            title: "Success!",  
													  			           
													  			            type: "success"
													  			        }, function() {
													  			        	   
													  			        });  
																	      
														           }
															});  
													
												}
							
							$scope.releasestopsalaryamount = function(emp) {
								console.log(emp);
								
								var details={
										empid:emp.empid,
										financial_year:emp.financial_year,
										month:emp.month
										
								}
								console.log(details);
								$http
										.post('/erp/ctc/releasestopsalaryamount',
												details)   
										.then(
												function(response) {   
													$scope.data = response.data;   
													console.log($scope.data);  
													if ($scope.data.successful) {
													
														
																   
														 $scope.data = {object:$scope.data.responseObject};
														 
														 console.log($scope.data);
														   
													} else {
									  					console
																.log("Client error while getting data");
													}
												},
												function(response) {
													console
															.log("Server error while getting data");
												});

							}
							
							$scope.releaseStopSalaryDate = function(emp) {
								console.log(emp);
								
								var details={
										empid:emp.empid,
										stop_date:emp.stop_date
										
								}
								console.log(details);  
								$http
										.post('/erp/ctc/releaseStopSalaryDate',
												details)   
										.then(
												function(response) {   
													$scope.data = response.data;   
													console.log($scope.data);  
													if ($scope.data.successful) {
													
														
																   
														 $scope.data = {object:$scope.data.responseObject};
														 
														 console.log($scope.data);
														   
													} else {
									  					console
																.log("Client error while getting data");
													}
												},
												function(response) {
													console
															.log("Server error while getting data");
												});

							}
							

						} ]);