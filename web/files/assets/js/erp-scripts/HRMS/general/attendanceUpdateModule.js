function formatDate(date) {
	var d = new Date(date), month = '' + (d.getMonth() + 1), day = ''
			+ d.getDate(), year = d.getFullYear();

	if (month.length < 2)
		month = '0' + month;
	if (day.length < 2)
		day = '0' + day;

	return [ year, month, day ].join('-');
};

function formatDateDayFirst(date) {
	var d = new Date(date), month = '' + (d.getMonth() + 1), day = ''
			+ d.getDate(), year = d.getFullYear();

	if (month.length < 2)
		month = '0' + month;
	if (day.length < 2)
		day = '0' + day;

	return [ day, month, year ].join('-');
};

var attendanceUpdateModule = angular.module('attendanceUpdateModule', [])
		.filter('sumOfValue', function() {
			return function(data, key) {
				if (angular.isUndefined(data) || angular.isUndefined(key))
					return 0;
				var sum = 0;
				angular.forEach(data, function(value) {
					if (value[key] == null) {
						value[key] = 0;
					}
					if (value[key] != null) {
						sum = sum + value[key];
					}
				});
				return sum;
			};
		})

attendanceUpdateModule
		.controller(
				'attendanceUpdateController',
				[
						'$http',
						'$scope',
						function($http, $scope) {
							$scope.studentsPresentArr = [];
							$scope.absentees = [];
							$scope.program = [];

							var count = 0;

							var self = this;
							$scope.selectedDate1 = formatDate(new Date());
							$scope.selectedDate = formatDateDayFirst(new Date());
							$http
									.post('/erp/attendance/getAbsentees',
											$scope.selectedDate1)
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$("#dataDiv").show();
													$scope.absentees = $scope.data.responseObject;
												} else {
													showError($scope.data.errorMessage);
													var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
															+ $scope.data.errorMessage
															+ "</div>";
													jQuery("#errorDiv").html(
															message);
												}
											}, function(errResponse) {
												console.error('Error ...');
											});

							$scope.getAbsentees = function(selectedDate) {
								console.log(selectedDate);
								var date = selectedDate.toLocaleDateString(
										'en-GB', "dd-MM-yyyy");
								var date1 = date.split("-").reverse().join("-");
								var date = selectedDate.toISOString().slice(0,
										10).split('-').reverse().join('-');
								var date = new Date(selectedDate);
								var dd = ("0" + date.getDate()).slice(-2);
								var mm = ("0" + (date.getMonth() + 1))
										.slice(-2);
								var yyyy = date.getFullYear();
								var date1 = yyyy + "-" + mm + "-" + dd;
								console.log(date1);
								console.log(date1);

								$http
										.post('/erp/attendance/getAbsentees',
												date1)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.absentees = $scope.data.responseObject;
													} else {
														showError($scope.data.errorMessage);
														var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
																+ $scope.data.errorMessage
																+ "</div>";
														jQuery("#errorDiv")
																.html(message);
													}
												}, function(errResponse) {
													console.error('Error ...');
												});
							};

							/*	$scope.generateemployeeexcel = function()
								{
								var blob = new Blob([document.getElementById('attedancediv').innerHTML], {
								       type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"
								   });
								   var fileName = "Attendance.xls";     
								   saveAs(blob, fileName);
								};
							 */
							$scope.generateemployeeexcel = function() {
								console.log("Coming");
								var blob = new Blob(
										[ document
												.getElementById('attendancediv').innerText ],
										{
											type : "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"
										});
								var fileName = "Attendance";
								if (fileName != null) {
									saveAs(blob, fileName + ".xls");
								}
							};

							$scope.setAllRegIds = function(allEmployees) {
								if (allEmployees == true) {
									for (var i = 0; i < $scope.filteredItems.length; i++) {
										var aadhaar = $scope.filteredItems[i]['empid'];
										$scope.studentsPresentArr[aadhaar] = true;
									}
								} else if (allEmployees == false) {
									$scope.studentsPresentArr = [];
								}
							};
							
							$scope.updateAttendance = function(selectedDate,studentsPresentArr)
						    {
						   

						    console.log(selectedDate);
						console.log(studentsPresentArr);
						var date = selectedDate.toLocaleDateString(
								'en-GB', "dd-MM-yyyy");
						var date1 = date.split("-").reverse().join("-");
						var date = selectedDate.toISOString().slice(0,
								10).split('-').reverse().join('-');
						var date = new Date(selectedDate);
						var dd = ("0" + date.getDate()).slice(-2);
						var mm = ("0" + (date.getMonth() + 1))
								.slice(-2);
						var yyyy = date.getFullYear();
						var date1 = yyyy + "-" + mm + "-" + dd;
						console.log(date1);

					/*var date = selectedDate.toLocaleDateString('en-GB');
						console.log(date);*/
						/*var date = new Date(selectedDate);
						var dd = ("0" + date.getDate()).slice(-2);
						var mm = ("0" + (date.getMonth() + 1)).slice(-2);
						var yyyy = date.getFullYear();
						var date1 =  yyyy + "-" + mm + "-" + dd;         
						                        console.log(date1);    */
						    if(studentsPresentArr != null)   
						    {    
						       var Obj = [];      
						       
						    for(var i in studentsPresentArr)
						    {
						      if(studentsPresentArr[i]== true)
						      {
						       
						    var obj =  
						    {   
						      
						    "empid": i,
						    "date":date1
						     
						    };        
						    $http.post('/erp/attendance/updateAttendance',obj).then(function(response)
						    {
						   
						   
						    $scope.data1 = response.data;  
						   
						    if($scope.data1.successful)
						    {
						    $scope.studentsPresentArr = [];
						    console.log("successssss");
						    }
						   
						    });
						   
						   
						    }
						    }
						    swal({
						               title: "Success!",
						               text: "Attendance updated successfully!",
						               type: "success"
						           }, function() {
						           
						           });
						   
						     }
						    };
							

							/*$scope.updateAttendance = function(selectedDate,
									studentsPresentArr) {

								console.log(selectedDate);
								console.log(studentsPresentArr);

									var date = selectedDate.toLocaleDateString('en-GB',"dd-MM-yyyy");

								var date = new Date(selectedDate);
								var dd = ("0" + date.getDate()).slice(-2);
								var mm = ("0" + (date.getMonth() + 1)).slice(-2);
								var yyyy = date.getFullYear();
								var date1 = dd + "-" + mm + "-" + yyyy;          
								console.log(date1);
								if (studentsPresentArr != null) {
									var Obj = [];

									for ( var i in studentsPresentArr) {
										if (studentsPresentArr[i] == true) {

											var obj = {

												"empid" : i,
												"date" : selectedDate

											};

											console.log(obj);
											$http
													.post(
															'/erp/attendance/updateAttendance',
															obj)    
													.then(
															function(response) {

																$scope.data1 = response.data;

																if ($scope.data1.successful) {
																	$scope.studentsPresentArr = [];
																	swal(
																			{
																				title : "Success!",
																				text : "Attendance updated successfully!",
																				type : "success"
																			}, function() {
																				window.location.reload();
																			});
																	
																	
																	console
																			.log("successssss");
																}

															});

										}
									}
									swal(
											{
												title : "Failed!",
												text : "Attendance Not updated !",
												type : "success"
											}, function() {
											//	window.location.reload();
											});

								}

								

							};*/

						} ]);

