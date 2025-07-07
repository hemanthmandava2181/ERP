var employee = angular.module('balancesheetreport', []);
employee
		.controller(
				'balancesheetreportController',
				[
						'$scope',
						'$http',
						function($scope, $http) {

							$http
									.get('/erp/finance/getFinancialYear')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.financialyear = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							$scope.getAssetReport = function(data) {
								console.log(data.financial_year);
								var obj = {
									financial_year : data.financial_year,
									previous_financial_year : (data.financial_year) - 1
								};
								console.log(obj);
								$http
										.post('/erp/finance/getAssetReport',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.assetDetails = $scope.data1.responseObject.asset;
														$scope.assetDetails1 = $scope.data1.responseObject.asset1;
														$scope.assetDetails2 = $scope.data1.responseObject.asset2;
														$scope.assetDetails3 = $scope.data1.responseObject.asset3;
														$scope.assetDetails4 = $scope.data1.responseObject.asset4;
														$scope.assetDetails5 = $scope.data1.responseObject.asset5;
														$scope.assetDetails6 = $scope.data1.responseObject.asset6;
														$scope.assetDetails7 = $scope.data1.responseObject.asset7;
														$scope.assetDetails8 = $scope.data1.responseObject.asset8;
														$scope.assetDetails9 = $scope.data1.responseObject.asset9;
														$scope.assetDetails10 = $scope.data1.responseObject.asset10;

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getEquityReport = function(data) {
								console.log(data.financial_year);
								var obj = {
									financial_year : data.financial_year,
									previous_financial_year : (data.financial_year) - 1
								};
								console.log(obj);
								$http
										.post('/erp/finance/getEquityReport',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.equityDetails = $scope.data1.responseObject.equity;
														$scope.equityDetails1 = $scope.data1.responseObject.equity1;
														$scope.equityDetails2 = $scope.data1.responseObject.equity2;
														$scope.equityDetails3 = $scope.data1.responseObject.equity3;
														$scope.equityDetails4 = $scope.data1.responseObject.equity4;
														$scope.equityDetails5 = $scope.data1.responseObject.equity5;

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAsset = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								console.log(obj);
								$http
										.post('/erp/finance/getGLAsset', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames = $scope.data1.responseObject.glasset;
														console
																.log(glassetnames);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAsset1 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLAsset1', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames1 = $scope.data1.responseObject.glasset1;
														console
																.log(glassetnames1);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAsset2 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLAsset2', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames2 = $scope.data1.responseObject.glasset2;
														console
																.log(glassetnames2);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getGLAsset3 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLAsset3', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames3 = $scope.data1.responseObject.glasset3;
														console
																.log(glassetnames3);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAsset4 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLAsset4', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames4 = $scope.data1.responseObject.glasset4;
														console
																.log(glassetnames4);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAsset5 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLAsset5', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames5 = $scope.data1.responseObject.glasset5;
														console
																.log(glassetnames5);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAsset6 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLAsset6', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames6 = $scope.data1.responseObject.glasset6;
														console
																.log(glassetnames6);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							/*
							 * Lability
							 */
							$scope.getGLEquity = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLEquity', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.equityaccounts = $scope.data1.responseObject.glequity;
														console
																.log(equityaccounts);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getGLEquity1 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLEquity1', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.equityaccounts1 = $scope.data1.responseObject.glequity1;
														console
																.log(equityaccounts1);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getGLEquity2 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLEquity2', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.equityaccounts2 = $scope.data1.responseObject.glequity2;
														console
																.log(equityaccounts2);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getGLEquity3 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLEquity3', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.equityaccounts3 = $scope.data1.responseObject.glequity3;
														console
																.log(equityaccounts3);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getGLEquity4 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLEquity4', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.equityaccounts4 = $scope.data1.responseObject.glequity4;
														console
																.log(equityaccounts4);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getGLEquity5 = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year,
									previous_financial_year : details.previous_financial_year
								}
								$http
										.post('/erp/finance/getGLEquity5', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.equityaccounts5 = $scope.data1.responseObject.glequity5;
														console
																.log(equityaccounts5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetails = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post('/erp/finance/getGLAssetDetails',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNames = $scope.data1.responseObject.assetgroup;
														console
																.log(GLassetNames);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetails1 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetails1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNames1 = $scope.data1.responseObject.assetgroup1;
														console
																.log(GLassetNames1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetails2 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetails2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNames2 = $scope.data1.responseObject.assetgroup2;
														console
																.log(GLassetNames2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetails3 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetails3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNames3 = $scope.data1.responseObject.assetgroup3;
														console
																.log(GLassetNames3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetails4 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetails4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNames4 = $scope.data1.responseObject.assetgroup4;
														console
																.log(GLassetNames4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetails5 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetails5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNames5 = $scope.data1.responseObject.assetgroup5;
														console
																.log(GLassetNames5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetails6 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetails6',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNames6 = $scope.data1.responseObject.assetgroup6;
														console
																.log(GLassetNames6);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							/*$scope.getGLAssetDetails7 = function(data){
								console.log(data.id);
								$http.post('/erp/finance/getGLAssetDetails7',data.id).then(function (response) {
									 var sum = 0;
								    $scope.data1 = response.data;
								    if ($scope.data1.successful) {
								        $scope.GLassetNames7 = $scope.data1.responseObject.assetgroup7;
								        console.log(GLassetNames7);
								        
								       
								    } else {     
								    	//alert("Error while getting data");   
								    	console.log("error")
								       
								    }
								}, function (errResponse) {
								   console.error('Error while fetching notes');    
								});   
								}; 
								
								
								$scope.getGLAssetDetails8 = function(data){
									console.log(data.id);
									$http.post('/erp/finance/getGLAssetDetails8',data.id).then(function (response) {
										 var sum = 0;
									    $scope.data1 = response.data;
									    if ($scope.data1.successful) {
									        $scope.GLassetNames8 = $scope.data1.responseObject.assetgroup8;
									        console.log(GLassetNames8);
									        
									       
									    } else {     
									    	//alert("Error while getting data");   
									    	console.log("error")
									       
									    }
									}, function (errResponse) {
									   console.error('Error while fetching notes');    
									});   
									}; 
									
									
									$scope.getGLAssetDetails9 = function(data){
										console.log(data.id);
										$http.post('/erp/finance/getGLAssetDetails9',data.id).then(function (response) {
											 var sum = 0;
										    $scope.data1 = response.data;
										    if ($scope.data1.successful) {
										        $scope.GLassetNames9 = $scope.data1.responseObject.assetgroup9;
										        console.log(GLassetNames9);
										        
										       
										    } else {     
										    	//alert("Error while getting data");   
										    	console.log("error")
										       
										    }
										}, function (errResponse) {
										   console.error('Error while fetching notes');    
										});   
										}; 
										
										
										$scope.getGLAssetDetails10 = function(data){
											console.log(data.id);
											$http.post('/erp/finance/getGLAssetDetails10',data.id).then(function (response) {
												 var sum = 0;
											    $scope.data1 = response.data;
											    if ($scope.data1.successful) {
											        $scope.GLassetNames10 = $scope.data1.responseObject.assetgroup10;
											        console.log(GLassetNames10);
											        
											       
											    } else {     
											    	//alert("Error while getting data");   
											    	console.log("error")
											       
											    }
											}, function (errResponse) {
											   console.error('Error while fetching notes');    
											});   
											}; 
							 */
							/*PREVIOUS*/

							$scope.getGLAssetDetailsPrevious = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNamesprevious = $scope.data1.responseObject.assetgroupprevious;
														console
																.log(GLassetNamesprevious);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetailsPrevious1 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNamesprevious1 = $scope.data1.responseObject.assetgroupprevious1;
														console
																.log(GLassetNamesprevious1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetailsPrevious2 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNamesPrevious2 = $scope.data1.responseObject.assetgroupprevious2;
														console
																.log(GLassetNamesPrevious2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetailsPrevious3 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNamesprevious3 = $scope.data1.responseObject.assetgroupprevious3;
														console
																.log(GLassetNamesprevious3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetailsPrevious4 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNamesprevious4 = $scope.data1.responseObject.assetgroupprevious4;
														console
																.log(GLassetNamesprevious4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetailsPrevious5 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNamesprevious5 = $scope.data1.responseObject.assetgroupprevious5;
														console
																.log(GLassetNames5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLAssetDetailsPrevious6 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious6',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLassetNamesprevious6 = $scope.data1.responseObject.assetgroupprevious6;
														console
																.log(GLassetNamesprevious6);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							/*EQUITY*/

							$scope.getGLEquityDetails = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetails',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNames = $scope.data1.responseObject.equitygroup;
														console
																.log(GLequityNames);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetails1 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetails1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNames1 = $scope.data1.responseObject.equitygroup1;
														console
																.log(GLequityNames1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetails2 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetails2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNames2 = $scope.data1.responseObject.equitygroup2;
														console
																.log(GLequityNames2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetails3 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetails3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNames3 = $scope.data1.responseObject.equitygroup3;
														console
																.log(GLequityNames3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetails4 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetails4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNames4 = $scope.data1.responseObject.equitygroup4;
														console
																.log(GLequityNames4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetails5 = function(data) {
								var obj = {
									id : data.id,
									financial_year : data.financial_year
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetails5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNames5 = $scope.data1.responseObject.equitygroup5;
														console
																.log(GLequityNames5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							/*PREVIOUS*/

							$scope.getGLEquityDetailsPrevious = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetailsPrevious',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNamesprevious = $scope.data1.responseObject.equitygroupprevious;
														console
																.log(GLequityNamesprevious);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetailsPrevious1 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetailsPrevious1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNamesprevious1 = $scope.data1.responseObject.equitygroupprevious1;
														console
																.log(GLequityNamesprevious1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetailsPrevious2 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetailsPrevious2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNamesprevious2 = $scope.data1.responseObject.equitygroupprevious2;
														console
																.log(GLequityNamesprevious2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetailsPrevious3 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetailsPrevious3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNamesprevious3 = $scope.data1.responseObject.equitygroupprevious3;
														console
																.log(GLequityNamesprevious3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetailsPrevious4 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetailsPrevious4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNamesprevious4 = $scope.data1.responseObject.equitygroupprevious4;
														console
																.log(GLequityNamesprevious4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getGLEquityDetailsPrevious5 = function(data) {
								var obj = {
									id : data.id,
									previous_financial_year: (data.financial_year) - 1
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLEquityDetailsPrevious5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.GLequityNamesprevious5 = $scope.data1.responseObject.equitygroupprevious5;
														console
																.log(GLequityNamesprevious5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

						/*	MONTHLY REPORT*/
							
							$scope.getMonthAssetReport = function(data) {
								var from_date= document.getElementById('from').value;
								var to_date= document.getElementById('to').value;
									var date = new Date(from_date);
							var dd = ("0" + date.getDate()).slice(-2);   
							var mm = ("0" + (date.getMonth() + 1)).slice(-2);
							var yyyy = date.getFullYear() - 1;
							var previous_from_date = dd + "-" + mm + "-" + yyyy;
							var date1 = new Date(to_date);
							var dd1 = ("0" + date1.getDate()).slice(-2);   
							var mm1 = ("0" + (date1.getMonth() + 1)).slice(-2);
							var yyyy1 = date1.getFullYear() - 1;
							var previous_from_date = yyyy + "-" + mm + "-" + dd;
							var previous_to_date =  yyyy1 + "-" + mm1 + "-" + dd1; 
							ERP.setSessionValue("from_date",from_date);
							ERP.setSessionValue("to_date",to_date);
							ERP.setSessionValue("previous_from_date",previous_from_date);
							ERP.setSessionValue("previous_to_date",previous_to_date);
							
							var obj = {
									from_date: from_date,   
									to_date: to_date,
									previous_from_date: previous_from_date,
									previous_to_date:previous_to_date
							}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthAssetReport',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthassetDetails = $scope.data1.responseObject.monthasset;
														$scope.monthassetDetails1 = $scope.data1.responseObject.monthasset1;
														$scope.monthassetDetails2 = $scope.data1.responseObject.monthasset2;
														$scope.monthassetDetails3 = $scope.data1.responseObject.monthasset3;
														$scope.monthassetDetails4 = $scope.data1.responseObject.monthasset4;
														$scope.monthassetDetails5 = $scope.data1.responseObject.monthasset5;
														$scope.monthassetDetails6 = $scope.data1.responseObject.monthasset6;
														$scope.monthassetDetails7 = $scope.data1.responseObject.monthasset7;
														$scope.monthassetDetails8 = $scope.data1.responseObject.monthasset8;
														$scope.monthassetDetails9 = $scope.data1.responseObject.monthasset9;
														$scope.monthassetDetails10 = $scope.data1.responseObject.monthasset10;

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthEquityReport = function(data) {
								var from_date= document.getElementById('from').value;
								var to_date= document.getElementById('to').value;
									var date = new Date(from_date);
							var dd = ("0" + date.getDate()).slice(-2);   
							var mm = ("0" + (date.getMonth() + 1)).slice(-2);
							var yyyy = date.getFullYear() - 1;
							var previous_from_date = dd + "-" + mm + "-" + yyyy;
							var date1 = new Date(to_date);
							var dd1 = ("0" + date1.getDate()).slice(-2);   
							var mm1 = ("0" + (date1.getMonth() + 1)).slice(-2);
							var yyyy1 = date1.getFullYear() - 1;
							var previous_from_date = yyyy + "-" + mm + "-" + dd;
							var previous_to_date =  yyyy1 + "-" + mm1 + "-" + dd1; 
							ERP.setSessionValue("from_date",from_date);
							ERP.setSessionValue("to_date",to_date);
							ERP.setSessionValue("previous_from_date",previous_from_date);
							ERP.setSessionValue("previous_to_date",previous_to_date);
							
							var obj = {
									from_date: from_date,   
									to_date: to_date,
									previous_from_date: previous_from_date,
									previous_to_date:previous_to_date
							}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthEquityReport',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthequityDetails = $scope.data1.responseObject.monthequity;
														$scope.monthequityDetails1 = $scope.data1.responseObject.monthequity1;
														$scope.monthequityDetails2 = $scope.data1.responseObject.monthequity2;
														$scope.monthequityDetails3 = $scope.data1.responseObject.monthequity3;
														$scope.monthequityDetails4 = $scope.data1.responseObject.monthequity4;
														$scope.monthequityDetails5 = $scope.data1.responseObject.monthequity5;

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAsset = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAsset', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthglassetnames = $scope.data1.responseObject.monthglasset;
														console
																.log(monthglassetnames);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAsset1 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAsset1', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthglassetnames1 = $scope.data1.responseObject.monthglasset1;
														console
																.log(monthglassetnames1);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAsset2 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAsset2', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthglassetnames2 = $scope.data1.responseObject.monthglasset2;
														console
																.log(monthglassetnames2);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getMonthGLAsset3 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAsset3', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthglassetnames3 = $scope.data1.responseObject.monthglasset3;
														console
																.log(monthglassetnames3);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAsset4 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAsset4', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthglassetnames4 = $scope.data1.responseObject.monthglasset4;
														console
																.log(monthglassetnames4);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAsset5 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAsset5', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthglassetnames5 = $scope.data1.responseObject.monthglasset5;
														console
																.log(monthglassetnames5);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAsset6 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAsset6', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.glassetnames6 = $scope.data1.responseObject.glasset6;
														console
																.log(glassetnames6);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							/*
							 * Lability
							 */
							$scope.getMonthGLEquity = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLEquity', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthequityaccounts = $scope.data1.responseObject.monthglequity;
														console
																.log(monthequityaccounts);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getMonthGLEquity1 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLEquity1', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthequityaccounts1 = $scope.data1.responseObject.monthglequity1;
														console
																.log(monthequityaccounts1);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getMonthGLEquity2 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLEquity2', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthequityaccounts2 = $scope.data1.responseObject.monthglequity2;
														console
																.log(monthequityaccounts2);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getMonthGLEquity3 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLEquity3', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthequityaccounts3 = $scope.data1.responseObject.monthglequity3;
														console
																.log(monthequityaccounts3);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getMonthGLEquity4 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLEquity4', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthequityaccounts4 = $scope.data1.responseObject.monthglequity4;
														console
																.log(monthequityaccounts4);

													} else {
														// alert("Error while
														// getting data");
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							$scope.getMonthGLEquity5 = function(details) {
								console.log(details);
								var obj = {
										group_id: details.group_id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date"),
										previous_from_date : ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLEquity5', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthequityaccounts5 = $scope.data1.responseObject.monthglequity5;
														console
																.log(monthequityaccounts5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetails = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post('/erp/finance/getMonthGLAssetDetails',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNames = $scope.data1.responseObject.monthassetgroup;
														console
																.log(monthGLassetNames);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetails1 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetails1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNames1 = $scope.data1.responseObject.monthassetgroup1;
														console
																.log(monthGLassetNames1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetails2 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetails2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNames2 = $scope.data1.responseObject.monthassetgroup2;
														console
																.log(monthGLassetNames2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetails3 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetails3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNames3 = $scope.data1.responseObject.monthassetgroup3;
														console
																.log(monthGLassetNames3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetails4 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetails4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNames4 = $scope.data1.responseObject.monthassetgroup4;
														console
																.log(monthGLassetNames4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetails5 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetails5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNames5 = $scope.data1.responseObject.monthassetgroup5;
														console
																.log(monthGLassetNames5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetails6 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetails6',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNames6 = $scope.data1.responseObject.monthassetgroup6;
														console
																.log(monthGLassetNames6);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							/*$scope.getGLAssetDetails7 = function(data){
								console.log(data.id);
								$http.post('/erp/finance/getGLAssetDetails7',data.id).then(function (response) {
									 var sum = 0;
								    $scope.data1 = response.data;
								    if ($scope.data1.successful) {
								        $scope.GLassetNames7 = $scope.data1.responseObject.assetgroup7;
								        console.log(GLassetNames7);
								        
								       
								    } else {     
								    	//alert("Error while getting data");   
								    	console.log("error")
								       
								    }
								}, function (errResponse) {
								   console.error('Error while fetching notes');    
								});   
								}; 
								
								
								$scope.getGLAssetDetails8 = function(data){
									console.log(data.id);
									$http.post('/erp/finance/getGLAssetDetails8',data.id).then(function (response) {
										 var sum = 0;
									    $scope.data1 = response.data;
									    if ($scope.data1.successful) {
									        $scope.GLassetNames8 = $scope.data1.responseObject.assetgroup8;
									        console.log(GLassetNames8);
									        
									       
									    } else {     
									    	//alert("Error while getting data");   
									    	console.log("error")
									       
									    }
									}, function (errResponse) {
									   console.error('Error while fetching notes');    
									});   
									}; 
									
									
									$scope.getGLAssetDetails9 = function(data){
										console.log(data.id);
										$http.post('/erp/finance/getGLAssetDetails9',data.id).then(function (response) {
											 var sum = 0;
										    $scope.data1 = response.data;
										    if ($scope.data1.successful) {
										        $scope.GLassetNames9 = $scope.data1.responseObject.assetgroup9;
										        console.log(GLassetNames9);
										        
										       
										    } else {     
										    	//alert("Error while getting data");   
										    	console.log("error")
										       
										    }
										}, function (errResponse) {
										   console.error('Error while fetching notes');    
										});   
										}; 
										
										
										$scope.getGLAssetDetails10 = function(data){
											console.log(data.id);
											$http.post('/erp/finance/getGLAssetDetails10',data.id).then(function (response) {
												 var sum = 0;
											    $scope.data1 = response.data;
											    if ($scope.data1.successful) {
											        $scope.GLassetNames10 = $scope.data1.responseObject.assetgroup10;
											        console.log(GLassetNames10);
											        
											       
											    } else {     
											    	//alert("Error while getting data");   
											    	console.log("error")
											       
											    }
											}, function (errResponse) {
											   console.error('Error while fetching notes');    
											});   
											}; 
							 */
							/*PREVIOUS*/

							$scope.getMonthGLAssetDetailsPrevious = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetailsPrevious',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNamesprevious = $scope.data1.responseObject.monthassetgroupprevious;
														console
																.log(monthGLassetNamesprevious);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetailsPrevious1 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetailsPrevious1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNamesprevious1 = $scope.data1.responseObject.monthassetgroupprevious1;
														console
																.log(monthGLassetNamesprevious1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetailsPrevious2 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetailsPrevious2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNamesPrevious2 = $scope.data1.responseObject.monthassetgroupprevious2;
														console
																.log(monthGLassetNamesPrevious2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetailsPrevious3 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetailsPrevious3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNamesprevious3 = $scope.data1.responseObject.monthassetgroupprevious3;
														console
																.log(monthGLassetNamesprevious3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetailsPrevious4 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetailsPrevious4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNamesprevious4 = $scope.data1.responseObject.monthassetgroupprevious4;
														console
																.log(monthGLassetNamesprevious4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetailsPrevious5 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLAssetDetailsPrevious5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNamesprevious5 = $scope.data1.responseObject.monthassetgroupprevious5;
														console
																.log(monthGLassetNamesprevious5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLAssetDetailsPrevious6 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getGLAssetDetailsPrevious6',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLassetNamesprevious6 = $scope.data1.responseObject.monthassetgroupprevious6;
														console
																.log(monthGLassetNamesprevious6);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							/*EQUITY*/

							$scope.getMonthGLEquityDetails = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetails',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNames = $scope.data1.responseObject.monthequitygroup;
														console
																.log(monthGLequityNames);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetails1 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetails1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNames1 = $scope.data1.responseObject.monthequitygroup1;
														console
																.log(monthGLequityNames1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetails2 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetails2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNames2 = $scope.data1.responseObject.monthequitygroup2;
														console
																.log(monthGLequityNames2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetails3 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetails3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNames3 = $scope.data1.responseObject.monthequitygroup3;
														console
																.log(monthGLequityNames3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetails4 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetails4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNames4 = $scope.data1.responseObject.monthequitygroup4;
														console
																.log(monthGLequityNames4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetails5 = function(data) {
								var obj = {
										id: data.id,
										from_date: ERP.getSessionValue("from_date"),
										to_date: ERP.getSessionValue("to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetails5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNames5 = $scope.data1.responseObject.monthequitygroup5;
														console
																.log(monthGLequityNames5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							/*PREVIOUS*/

							$scope.getMonthGLEquityDetailsPrevious = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetailsPrevious',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNamesprevious = $scope.data1.responseObject.monthequitygroupprevious;
														console
																.log(monthGLequityNamesprevious);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetailsPrevious1 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetailsPrevious1',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNamesprevious1 = $scope.data1.responseObject.monthequitygroupprevious1;
														console
																.log(monthGLequityNamesprevious1);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetailsPrevious2 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetailsPrevious2',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNamesprevious2 = $scope.data1.responseObject.monthequitygroupprevious2;
														console
																.log(monthGLequityNamesprevious2);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetailsPrevious3 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetailsPrevious3',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNamesprevious3 = $scope.data1.responseObject.monthequitygroupprevious3;
														console
																.log(monthGLequityNamesprevious3);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetailsPrevious4 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetailsPrevious4',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNamesprevious4 = $scope.data1.responseObject.monthequitygroupprevious4;
														console
																.log(monthGLequityNamesprevious4);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getMonthGLEquityDetailsPrevious5 = function(data) {
								var obj = {
										id: data.id,
										previous_from_date: ERP.getSessionValue("previous_from_date"),
										previous_to_date: ERP.getSessionValue("previous_to_date")
								}
								console.log(obj);
								$http
										.post(
												'/erp/finance/getMonthGLEquityDetailsPrevious5',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.monthGLequityNamesprevious5 = $scope.data1.responseObject.monthequitygroupprevious5;
														console
																.log(monthGLequityNamesprevious5);

													} else {
														//alert("Error while getting data");   
														console.log("error")

													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							
							
							
						} ]);