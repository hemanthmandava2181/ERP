var AddAcademic = angular.module('uploadincomeModule', ['xlsx-model']);
AddAcademic.controller('IncomeUploadController',['$http','$scope',function($http, $scope) {

							var role = ERP.getSessionValue('employee_id');
							var circularsArr = [];
							$scope.filePathsA
							rr = [];

						
							$scope.uploadFile = function(el1, param) {
								console.log(el1);
								console.log(param);
								var employeeId = ERP.getSessionValue("employee_id");
								console.log(employeeId);     
								var fileName = el1.files[0].name;
								var fileDetails = fileName.split(".");
								fileName = employeeId + "_" + param + "."
										+ fileDetails[1];
								console.log(fileName);

								// fileName=param+"_"+employeeId+"."+fileDetails[1];

								// var fielName=fileDetails.join(".");

								ERP.setSessionValue("fileFormat",fileDetails[1]);
								console.log(ERP.getSessionValue("fileFormat"));
								var fileReader;
								fileReader = new FileReader();
								fileReader.onload = function(e) {
									binaryString = e.target.result;
									base64 = btoa(binaryString);
									var str = base64.toString();

									var fileModel = {
										fileName : fileName,
										base64String : str,
										name : fileName,
										role : ERP.getSessionValue('employee_id')
									};
								//console.log("fileModel"+fileModel);
									$http.post('/erp/ctc/upload', fileModel).then(
													function(response) {
														$scope.data1111 = response.data;
														if ($scope.data1111.successful) {
															var name = $scope.data1111.responseObject.name;
															ERP.setSessionValue("filePath",name);

														} else {
															alert("File upload failed....please try again!!!!");
														}
													},
													function(errResponse) {
														console
																.error('Error while fetching notes');
													});
								};
								fileReader.readAsBinaryString(el1.files[0]);
							};

							$http.get('/erp/calc/getYears').then(
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

							$http.get('/erp/calc/getMonths').then(
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
							
							
							// Save excel data
							$scope.save = function(excelData, yearobject) {
								console.log(yearobject);

								if (yearobject == undefined)
								{
									
									swal("OOPS!", "Fill all details", "info");
									
								}
								else if (yearobject.financial_year == null || yearobject.financial_year == undefined || yearobject.financial_year == "") 
								{
									swal("Oops...", "Select financial_year", "info");
								}
								else if (yearobject.payroll_month == null || yearobject.payroll_month == undefined || yearobject.payroll_month == "")
								{
									swal("Oops...", "Select payroll_month", "info");
									
								}
								else {

									console.log(excelData); 
									jQuery("#spinner1").show();
									var employee = [];
									$scope.excelDetails = excelData.slice(1,excelData.length + 1);
									var excelLength = $scope.excelDetails.length, keepOnGoing = true;

									for (var i = 0; i < $scope.excelDetails.length; i++) {
										var incometaxDetails = {};
										incometaxDetails.empid = $scope.excelDetails[i]['empid'];
										incometaxDetails.amount = $scope.excelDetails[i]['amount'];
										
										incometaxDetails.financial_year = yearobject.financial_year;
										incometaxDetails.payroll_month=yearobject.payroll_month
						 	            console.log(ERP.getSessionValue('filePath'));         
										incometaxDetails.filePath = ERP.getSessionValue('filePath');
										incometaxDetails.fileExtension = ERP.getSessionValue('fileFormat');

										
										incometaxDetails.role = ERP.getSessionValue('employee_id');
									
										employee.push(incometaxDetails);

									}
									 $("#spinner1").show();
									 console.log('StData:'+employee);
									
									//console.log(employee);    

									$http.post('/erp/ctc/saveIncometaxDetails',employee).then(
													function(response) {
														$scope.data1 = response.data;
														if ($scope.data1.successful) {

															$("#spinner1")
																	.hide();
															alert("Data saved successfully");

														}
  
														else {
															alert("Data not inserted");
														}
													},
													function(errResponse) {
														console
																.error('Error while fetching notes');
													});

								}

							};

					

						} ]);
