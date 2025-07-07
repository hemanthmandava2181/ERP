var RelieveEmployee = angular.module('relieveemployee', []);

RelieveEmployee
		.controller(
				'RelieveEmployeeController',
				[
						'$http',
						'$scope',
						function($http, $scope) {
							console.log("empid ::"
									+ ERP.getSessionValue("employee_id"));
							
							
							$scope.studentsPresentArr = [];
							$scope.Leavesencashed = [];

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

							$http
									.get('/erp/leavesreport/EncashmentStatus')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.leaveencashmentstatus = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});

							/* getting data in for relieving */

							$scope.GetDataByID = function(data) {

								/* alert(name); */
								$http
										.post('/erp/Employee/GetDataByID', data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.data = {
															object : $scope.data.responseObject
														};
														
													
														console
																.log($scope.data);
													} else {
														alert("Error while getting data");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.GetEncashdetails = function(data) {

								/* alert(name); */
								$http
										.post(
												'/erp/leavesreport/GetEncashdetails',
												data)
										.then(
												function(response) {
													$scope.data3 = response.data;
													if ($scope.data3.successful) {
														$scope.Leavesencashed = $scope.data3.responseObject.dates;
														console
																.log($scope.Leavesencashed);
													} else {
														alert("Error while getting data");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.setAllRegIds = function(leaveEncashment) {
								if (leaveEncashment == true) {
									for (var i = 0; i < $scope.filteredItems.length; i++) {
										var aadhaar = $scope.filteredItems[i]['calendar_year'];
										$scope.studentsPresentArr[aadhaar] = true;
									}
								} else if (leaveEncashment == false) {
									$scope.studentsPresentArr = [];
								}
							};

							$scope.LeaveEncashdataprocess = function(Leavesencashed,
									studentsPresentArr) {

								console.log(Leavesencashed);
								console.log(Leavesencashed.id);
								console.log(studentsPresentArr);

								if (studentsPresentArr != null) {   
									var Obj = [];

									  for(var i in studentsPresentArr)
									    {
									      if(studentsPresentArr[i]== true)
									      {
								for (var k = 0; k < $scope.Leavesencashed.length; k++) {
												
													var id = $scope.Leavesencashed[k]['id'];
									    	  
													var obj = {
															calendar_year : i,
															id :id
													};
									
													console.log(obj);   
													$http   
															.post(
																	'/erp/leavesreport/LeaveEncashdataprocess',
																	obj)
															.then(
																	function(
																			response) {
																		$scope.data = response.data;
																		if ($scope.data.successful) {

																			swal({
																				title: "Success!",
																				text: "Leave Encashment Processed Successfully",
																				type: "Success"});
																		} else {
																			alert("Error while getting data");
																		}
																	},
																	function(
																			errResponse) {
																		console
																				.error('Error while fetching notes');
																	});
												
									}
									      }    }	
									
								}
							};	
									
							
							
							$scope.UpdateEmployerelieveing = function(UserData) {
								$http.post('/erp/leavesreport/UpdateEmployerelieveing',UserData).then(  
										function(response) {    
											$scope.data = response.data;      
											if ($scope.data.successful) {
									    		$("#com").show(); 
												alert("Profile Updated Successfully");
											//	ERP.showRelieveEmployee();
												swal({
													title: "Success!",
													text: "Employee Relieving Updated Successfully",
													type: "Success"
												});
											} else {
												alert("Data not Updated");
											}
										}, function(errResponse) {
											console.error('Error while fetching notes');
										});
							};

						} ]);