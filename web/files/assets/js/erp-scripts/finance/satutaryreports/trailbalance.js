var employee = angular.module('trailbalance', []);
employee.controller('trailbalanceController',['$scope','$http',function($scope,$http)
	{   
	
	/* getting financial year drop down */
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
	$scope.getTrailIncomeExpenditureReport = function(data){
		console.log(data.financial_year);
		var obj = {
				financial_year: data.financial_year,
				
		};
		console.log(obj);
		$http.post('/erp/finance/getTrailIncomeExpenditureReport',obj).then(function (response) {
			 var sum = 0;
		    $scope.data1 = response.data;
		    if ($scope.data1.successful) {
		        $scope.trailincomeDetails = $scope.data1.responseObject.trailincome;
		        $scope.trailincomeDetails1 = $scope.data1.responseObject.trailincome1;
		        console.log(trailincomeDetails);
		        console.log(trailincomeDetails1);
		       
		    } else {     
		    	//alert("Error while getting data");   
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		}; 
		
		$scope.getTrailGLAccountDetails = function(data){
			var obj = {
					id: data.id,
					financial_year: data.financial_year
			}
			console.log(obj);
			$http.post('/erp/finance/getTrailGLAccountDetails',obj).then(function (response) {
				 var sum = 0;
			    $scope.data1 = response.data;
			    if ($scope.data1.successful) {
			        $scope.trailGLgroupNames = $scope.data1.responseObject.trailgroup;
			        console.log(trailGLgroupNames);
			        
			       
			    } else {     
			    	//alert("Error while getting data");   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			}; 
			
			$scope.getTrailGLAccountDetails1 = function(data){
				var obj = {
						id: data.id,
						financial_year: data.financial_year
				}
				console.log(obj);
				$http.post('/erp/finance/getTrailGLAccountDetails1',obj).then(function (response) {
					 var sum = 0;
				    $scope.data1 = response.data;
				    if ($scope.data1.successful) {
				        $scope.trailGLgroupNames1 = $scope.data1.responseObject.trailgroup1;
				        console.log(trailGLgroupNames1);
				        
				       
				    } else {     
				    	//alert("Error while getting data");   
				    	console.log("error")
				       
				    }
				}, function (errResponse) {
				   console.error('Error while fetching notes');    
				});   
				}; 
				
				$scope.getTrailGLAccountDetails2 = function(data){
					var obj = {
							id: data.id,
							financial_year: data.financial_year
					}
					console.log(obj);
					$http.post('/erp/finance/getTrailGLAccountDetails2',obj).then(function (response) {
						 var sum = 0;
					    $scope.data1 = response.data;
					    if ($scope.data1.successful) {
					        $scope.trailGLgroupNames2 = $scope.data1.responseObject.trailgroup2;
					        console.log(trailGLgroupNames2);
					        
					       
					    } else {     
					    	//alert("Error while getting data");   
					    	console.log("error")
					       
					    }
					}, function (errResponse) {
					   console.error('Error while fetching notes');    
					});   
					}; 
					
					$scope.getTrailGLAccountDetails3 = function(data){
						var obj = {
								id: data.id,
								financial_year: data.financial_year
						}
						console.log(obj);
						$http.post('/erp/finance/getTrailGLAccountDetails3',obj).then(function (response) {
							 var sum = 0;
						    $scope.data1 = response.data;
						    if ($scope.data1.successful) {
						        $scope.trailGLgroupNames3 = $scope.data1.responseObject.trailgroup3;
						        console.log(trailGLgroupNames3);
						        
						       
						    } else {     
						    	//alert("Error while getting data");   
						    	console.log("error")
						       
						    }
						}, function (errResponse) {
						   console.error('Error while fetching notes');    
						});   
						}; 
						
						$scope.getTrailGLAccountDetails4 = function(data){
							var obj = {
									id: data.id,
									financial_year: data.financial_year
							}
							console.log(obj);
							$http.post('/erp/finance/getTrailGLAccountDetails4',obj).then(function (response) {
								 var sum = 0;
							    $scope.data1 = response.data;
							    if ($scope.data1.successful) {
							        $scope.trailGLgroupNames4 = $scope.data1.responseObject.trailgroup4;
							        console.log(trailGLgroupNames4);
							        
							       
							    } else {     
							    	//alert("Error while getting data");   
							    	console.log("error")
							       
							    }
							}, function (errResponse) {
							   console.error('Error while fetching notes');    
							});   
							}; 
							
						
		
		$scope.getTrailExpenditureReport = function(data){
			console.log(data.financial_year);
			var obj = {
					financial_year: data.financial_year,
					
			};
			console.log(obj);
			$http.post('/erp/finance/getTrailExpenditureReport',obj).then(function (response) {
				 var sum = 0;
			    $scope.data1 = response.data;
			    if ($scope.data1.successful) {
			        $scope.trailexpenditureDetails = $scope.data1.responseObject.trailexpenditure;
			        $scope.trailexpenditureDetails1 = $scope.data1.responseObject.trailexpenditure1;
			        $scope.trailexpenditureDetails2 = $scope.data1.responseObject.trailexpenditure2;

			     
			       
			    } else {     
			    	//alert("Error while getting data");   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			}; 
			
		$scope.getTrailGLAccountNames = function(details){
			console.log(details);
			var obj = {
					group_id: details.group_id,
					financial_year: details.financial_year,
					
			}
			console.log(obj);
			$http.post('/erp/finance/getTrailGLAccountNames',obj).then(function (response) {
			    $scope.data = response.data;
			    if ($scope.data.successful) {
			    	
			        $scope.trailglaccounts = $scope.data.responseObject.trailgl;
			        
			        console.log($scope.trailglaccounts);
			    } else {
		   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			};  
			   
			
			$scope.getTrailGLAccountTwoNames = function(details){
				console.log(details);
				var obj = {   
						group_id: details.group_id,
						financial_year: details.financial_year,
						
				}
				console.log(obj);
				$http.post('/erp/finance/getTrailGLAccountTwoNames',obj).then(function (response) {
				    $scope.data = response.data;
				    if ($scope.data.successful) {
				    	
				        $scope.trailglaccounts1 = $scope.data.responseObject.trailgl1;
				        
				        console.log($scope.trailglaccounts1);
				    } else {   
			   
				    	console.log("error")
				       
				    }
				}, function (errResponse) {
				   console.error('Error while fetching notes');    
				});   
				};  
				
				
				/*	Expenditure*/
				$scope.getTrailGLExpAccountNames = function(details){
					console.log(details);
					var obj = {
							group_id: details.group_id,
							financial_year: details.financial_year
							
					}
					console.log(obj);
					$http.post('/erp/finance/getTrailGLExpAccountNames',obj).then(function (response) {
					    $scope.data = response.data;
					    if ($scope.data.successful) {
					    	
					        $scope.trailexpenditureaccounts = $scope.data.responseObject.trailglexp;
					        
					        console.log($scope.trailexpenditureaccounts);
					    } else {
				   
					    	console.log("error")
					       
					    }
					}, function (errResponse) {
					   console.error('Error while fetching notes');    
					});   
					};  
					
					
					$scope.getTrailGLExpAccountOneNames = function(details){
						console.log(details);
						var obj = {
								group_id: details.group_id,
								financial_year: details.financial_year
								
						}
						console.log(obj);
						$http.post('/erp/finance/getTrailGLExpAccountOneNames',obj).then(function (response) {
						    $scope.data = response.data;
						    if ($scope.data.successful) {
						    	
						        $scope.trailexpenditureaccounts1 = $scope.data.responseObject.trailglexp1;
						        
						        console.log($scope.trailexpenditureaccounts1);
						    } else {
					   
						    	console.log("error")
						       
						    }
						}, function (errResponse) {
						   console.error('Error while fetching notes');    
						});   
						};  
						
						$scope.getTrailGLExpAccountTwoNames = function(details){
							console.log(details);
							var obj = {
									group_id: details.group_id,
									financial_year: details.financial_year
									
							}
							console.log(obj);
							$http.post('/erp/finance/getTrailGLExpAccountTwoNames',obj).then(function (response) {
							    $scope.data = response.data;
							    if ($scope.data.successful) {
							    	
							        $scope.trailexpenditureaccounts2 = $scope.data.responseObject.trailglexp2;
							        
							        console.log($scope.trailexpenditureaccounts2);
							    } else {
						   
							    	console.log("error")
							       
							    }
							}, function (errResponse) {
							   console.error('Error while fetching notes');    
							});   
							}; 
							
							$scope.getTrailAssetReport = function(data) {
								console.log(data.financial_year);
								var obj = {
										financial_year: data.financial_year
									
								};
								console.log(obj);
								$http
										.post('/erp/finance/getTrailAssetReport',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailassetDetails = $scope.data1.responseObject.trailasset;
														$scope.trailassetDetails1 = $scope.data1.responseObject.trailasset1;
														$scope.trailassetDetails2 = $scope.data1.responseObject.trailasset2;
														$scope.trailassetDetails3 = $scope.data1.responseObject.trailasset3;
														$scope.trailassetDetails4 = $scope.data1.responseObject.trailasset4;
														$scope.trailassetDetails5 = $scope.data1.responseObject.trailasset5;
														$scope.trailassetDetails6 = $scope.data1.responseObject.trailasset6;
														$scope.trailassetDetails7 = $scope.data1.responseObject.trailasset7;
														$scope.trailassetDetails8 = $scope.data1.responseObject.trailasset8;
														$scope.trailassetDetails9 = $scope.data1.responseObject.trailasset9;
														$scope.trailassetDetails10 = $scope.data1.responseObject.trailasset10;

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

							$scope.getTrailEquityReport = function(data) {
								console.log(data.financial_year);
								var obj = {
										financial_year: data.financial_year
									
								};
								console.log(obj);
								$http
										.post('/erp/finance/getTrailEquityReport',
												obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailequityDetails = $scope.data1.responseObject.trailequity;
														$scope.trailequityDetails1 = $scope.data1.responseObject.trailequity1;
														$scope.trailequityDetails2 = $scope.data1.responseObject.trailequity2;
														$scope.trailequityDetails3 = $scope.data1.responseObject.trailequity3;
														$scope.trailequityDetails4 = $scope.data1.responseObject.trailequity4;
														$scope.trailequityDetails5 = $scope.data1.responseObject.trailequity5;

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

							$scope.getTrailGLAsset = function(details) {
								console.log(details);
								var obj = {
									group_id : details.group_id,
									financial_year : details.financial_year
									
								}
								console.log(obj);
								$http
										.post('/erp/finance/getTrailGLAsset', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailglassetnames = $scope.data1.responseObject.trailglasset;
														console
																.log(trailglassetnames);

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

							$scope.getTrailGLAsset1 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
										
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLAsset1', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailglassetnames1 = $scope.data1.responseObject.trailglasset1;
														console
																.log(trailglassetnames1);

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

							$scope.getTrailGLAsset2 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
										
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLAsset2', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailglassetnames2 = $scope.data1.responseObject.trailglasset2;
														console
																.log(trailglassetnames2);

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
							$scope.getTrailGLAsset3 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
										
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLAsset3', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailglassetnames3 = $scope.data1.responseObject.trailglasset3;
														console
																.log(trailglassetnames3);

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

							$scope.getTrailGLAsset4 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
										
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLAsset4', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailglassetnames4 = $scope.data1.responseObject.trailglasset4;
														console
																.log(trailglassetnames4);

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

							$scope.getTrailGLAsset5 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
										
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLAsset5', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailglassetnames5 = $scope.data1.responseObject.trailglasset5;
														console
																.log(trailglassetnames5);

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

							$scope.getTrailGLAsset6 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLAsset6', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailglassetnames6 = $scope.data1.responseObject.trailglasset6;
														console
																.log(trailglassetnames6);

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
							$scope.getTrailGLEquity = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLEquity', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailequityaccounts = $scope.data1.responseObject.trailequity;
														console
																.log(trailequityaccounts);

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
							$scope.getTrailGLEquity1 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLEquity1', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailequityaccounts1 = $scope.data1.responseObject.trailequity1;
														console
																.log(trailequityaccounts1);

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
							$scope.getTrailGLEquity2 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLEquity2', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailequityaccounts2 = $scope.data1.responseObject.trailequity2;
														console
																.log(trailequityaccounts2);

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
							$scope.getTrailGLEquity3 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLEquity3', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailequityaccounts3 = $scope.data1.responseObject.trailequity3;
														console
																.log(trailequityaccounts3);

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
							$scope.getTrailGLEquity4 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLEquity4', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailequityaccounts4 = $scope.data1.responseObject.trailequity4;
														console
																.log(trailequityaccounts4);

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
							$scope.getTrailGLEquity5 = function(details) {
								console.log(details);
								var obj = {
										group_id : details.group_id,
										financial_year : details.financial_year
									}
									console.log(obj);
								$http
										.post('/erp/finance/getTrailGLEquity5', obj)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.trailequityaccounts5 = $scope.data1.responseObject.trailequity5;
														console
																.log(trailequityaccounts5);

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
					
						/*MONTHLY TRAIL BALANCE	*/
							
							$scope.getMonthTrailIncomeExpenditureReport = function(data){

								var from_date= document.getElementById('from').value;
									var to_date= document.getElementById('to').value;
										
								ERP.setSessionValue("from_date",from_date);
								ERP.setSessionValue("to_date",to_date);
								
							var obj = {
									from_date: from_date,   
									to_date: to_date
									
							}
								console.log(obj);  
							
								$http.post('/erp/finance/getMonthTrailIncomeExpenditureReport',obj).then(function (response) {
									 var sum = 0;
								    $scope.data1 = response.data;
								    if ($scope.data1.successful) {
								        $scope.monthtrailincomeDetails = $scope.data1.responseObject.monthtrailincome;
								        $scope.monthtrailincomeDetails1 = $scope.data1.responseObject.monthtrailincome1;
								        console.log(monthtrailincomeDetails);
								        console.log(monthtrailincomeDetails1);
								       
								    } else {     
								    	//alert("Error while getting data");   
								    	console.log("error")
								       
								    }
								}, function (errResponse) {
								   console.error('Error while fetching notes');    
								});   
								}; 
								
							
												
								
								$scope.getMonthTrailExpenditureReport = function(data){

									var from_date= document.getElementById('from').value;
										var to_date= document.getElementById('to').value;
										
									ERP.setSessionValue("from_date",from_date);
									ERP.setSessionValue("to_date",to_date);
									
								var obj = {
										from_date: from_date,   
										to_date: to_date
										
								}
									console.log(obj);  
									$http.post('/erp/finance/getMonthTrailExpenditureReport',obj).then(function (response) {
										 var sum = 0;
									    $scope.data1 = response.data;
									    if ($scope.data1.successful) {
									        $scope.monthtrailexpenditureDetails = $scope.data1.responseObject.monthtrailexpenditure;
									        $scope.monthtrailexpenditureDetails1 = $scope.data1.responseObject.monthtrailexpenditure1;
									        $scope.monthtrailexpenditureDetails2 = $scope.data1.responseObject.monthtrailexpenditure2;

									     
									       
									    } else {     
									    	//alert("Error while getting data");   
									    	console.log("error")
									       
									    }
									}, function (errResponse) {
									   console.error('Error while fetching notes');    
									});   
									}; 
									
								$scope.getMonthTrailGLAccountNames = function(details){
									console.log(details);
									var obj = {
											group_id: details.group_id,
											from_date: ERP.getSessionValue("from_date"),
											to_date: ERP.getSessionValue("to_date")
											
									}
									console.log(obj);
									$http.post('/erp/finance/getMonthTrailGLAccountNames',obj).then(function (response) {
									    $scope.data = response.data;
									    if ($scope.data.successful) {
									    	
									        $scope.monthtrailglaccounts = $scope.data.responseObject.monthtrailgl;
									        
									        console.log($scope.monthtrailglaccounts);
									    } else {
								   
									    	console.log("error")
									       
									    }
									}, function (errResponse) {
									   console.error('Error while fetching notes');    
									});   
									};  
									   
									
									$scope.getMonthTrailGLAccountTwoNames = function(details){
										console.log(details);
										var obj = {   
												group_id: details.group_id,
												from_date: ERP.getSessionValue("from_date"),
												to_date: ERP.getSessionValue("to_date")
												
										}
										console.log(obj);
										$http.post('/erp/finance/getMonthTrailGLAccountTwoNames',obj).then(function (response) {
										    $scope.data = response.data;
										    if ($scope.data.successful) {
										    	
										        $scope.monthtrailglaccounts1 = $scope.data.responseObject.monthtrailgl1;
										        
										        console.log($scope.monthtrailglaccounts1);
										    } else {   
									   
										    	console.log("error")
										       
										    }
										}, function (errResponse) {
										   console.error('Error while fetching notes');    
										});   
										};  
										
										
										/*	Expenditure*/
										$scope.getMonthTrailGLExpAccountNames = function(details){
											console.log(details);
											var obj = {
													group_id: details.group_id,
													from_date: ERP.getSessionValue("from_date"),
													to_date: ERP.getSessionValue("to_date")
													
											}
											console.log(obj);
											$http.post('/erp/finance/getMonthTrailGLExpAccountNames',obj).then(function (response) {
											    $scope.data = response.data;
											    if ($scope.data.successful) {
											    	
											        $scope.monthtrailexpenditureaccounts = $scope.data.responseObject.monthtrailglexp;
											        
											        console.log($scope.monthtrailexpenditureaccounts);
											    } else {
										   
											    	console.log("error")
											       
											    }
											}, function (errResponse) {
											   console.error('Error while fetching notes');    
											});   
											};  
											
											
											$scope.getMonthTrailGLExpAccountOneNames = function(details){
												console.log(details);
												var obj = {
														group_id: details.group_id,
														from_date: ERP.getSessionValue("from_date"),
														to_date: ERP.getSessionValue("to_date")
														
												}
												console.log(obj);
												$http.post('/erp/finance/getMonthTrailGLExpAccountOneNames',obj).then(function (response) {
												    $scope.data = response.data;
												    if ($scope.data.successful) {
												    	
												        $scope.monthtrailexpenditureaccounts1 = $scope.data.responseObject.monthtrailglexp1;
												        
												        console.log($scope.monthtrailexpenditureaccounts1);
												    } else {
											   
												    	console.log("error")
												       
												    }
												}, function (errResponse) {
												   console.error('Error while fetching notes');    
												});   
												};  
												
												$scope.getMonthTrailGLExpAccountTwoNames = function(details){
													console.log(details);
													var obj = {
															group_id: details.group_id,
															from_date: ERP.getSessionValue("from_date"),
															to_date: ERP.getSessionValue("to_date")
															
													}
													console.log(obj);
													$http.post('/erp/finance/getMonthTrailGLExpAccountTwoNames',obj).then(function (response) {
													    $scope.data = response.data;
													    if ($scope.data.successful) {
													    	
													        $scope.monthtrailexpenditureaccounts2 = $scope.data.responseObject.monthtrailglexp2;
													        
													        console.log($scope.monthtrailexpenditureaccounts2);
													    } else {
												   
													    	console.log("error")
													       
													    }
													}, function (errResponse) {
													   console.error('Error while fetching notes');    
													});   
													}; 
													
													$scope.getMonthTrailAssetReport = function(data) {

														var from_date= document.getElementById('from').value;
															var to_date= document.getElementById('to').value;
																
														ERP.setSessionValue("from_date",from_date);
														ERP.setSessionValue("to_date",to_date);
														
													var obj = {
															from_date: from_date,   
															to_date: to_date
															
													}
														console.log(obj);  
													
														$http
																.post('/erp/finance/getMonthTrailAssetReport',
																		obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailassetDetails = $scope.data1.responseObject.monthtrailasset;
																				$scope.monthtrailassetDetails1 = $scope.data1.responseObject.monthtrailasset1;
																				$scope.monthtrailassetDetails2 = $scope.data1.responseObject.monthtrailasset2;
																				$scope.monthtrailassetDetails3 = $scope.data1.responseObject.monthtrailasset3;
																				$scope.monthtrailassetDetails4 = $scope.data1.responseObject.monthtrailasset4;
																				$scope.monthtrailassetDetails5 = $scope.data1.responseObject.monthtrailasset5;
																				$scope.monthtrailassetDetails6 = $scope.data1.responseObject.monthtrailasset6;
																				$scope.monthtrailassetDetails7 = $scope.data1.responseObject.monthtrailasset7;
																				$scope.monthtrailassetDetails8 = $scope.data1.responseObject.monthtrailasset8;
																				$scope.monthtrailassetDetails9 = $scope.data1.responseObject.monthtrailasset9;
																				$scope.monthtrailassetDetails10 = $scope.data1.responseObject.monthtrailasset10;

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

													$scope.getMonthTrailEquityReport = function(data) {
														var from_date= document.getElementById('from').value;
														var to_date= document.getElementById('to').value;
															
													ERP.setSessionValue("from_date",from_date);
													ERP.setSessionValue("to_date",to_date);
													
												var obj = {
														from_date: from_date,   
														to_date: to_date
														
												}
													console.log(obj);  
														$http
																.post('/erp/finance/getMonthTrailEquityReport',
																		obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailequityDetails = $scope.data1.responseObject.monthtrailequity;
																				$scope.monthtrailequityDetails1 = $scope.data1.responseObject.monthtrailequity1;
																				$scope.monthtrailequityDetails2 = $scope.data1.responseObject.monthtrailequity2;
																				$scope.monthtrailequityDetails3 = $scope.data1.responseObject.monthtrailequity3;
																				$scope.monthtrailequityDetails4 = $scope.data1.responseObject.monthtrailequity4;
																				$scope.monthtrailequityDetails5 = $scope.data1.responseObject.monthtrailequity5;

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

													$scope.getMonthTrailGLAsset = function(details) {
														console.log(details);
														var obj = {
															group_id : details.group_id,
															from_date: ERP.getSessionValue("from_date"),
															to_date: ERP.getSessionValue("to_date")
															
														}
														console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLAsset', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailglassetnames = $scope.data1.responseObject.monthtrailglasset;
																				console
																						.log(monthtrailglassetnames);

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

													$scope.getMonthTrailGLAsset1 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
																
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLAsset1', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailglassetnames1 = $scope.data1.responseObject.monthtrailglasset1;
																				console
																						.log(monthtrailglassetnames1);

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

													$scope.getMonthTrailGLAsset2 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
																
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLAsset2', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailglassetnames2 = $scope.data1.responseObject.monthtrailglasset2;
																				console
																						.log(monthtrailglassetnames2);

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
													$scope.getMonthTrailGLAsset3 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
																
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLAsset3', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailglassetnames3 = $scope.data1.responseObject.monthtrailglasset3;
																				console
																						.log(monthtrailglassetnames3);

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

													$scope.getMonthTrailGLAsset4 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
																
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLAsset4', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailglassetnames4 = $scope.data1.responseObject.monthtrailglasset4;
																				console
																						.log(monthtrailglassetnames4);

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

													$scope.getMonthTrailGLAsset5 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
																
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLAsset5', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailglassetnames5 = $scope.data1.responseObject.monthtrailglasset5;
																				console
																						.log(monthtrailglassetnames5);

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

													$scope.getmonthTrailGLAsset6 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLAsset6', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailglassetnames6 = $scope.data1.responseObject.monthtrailglasset6;
																				console
																						.log(monthtrailglassetnames6);

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
													$scope.getMonthTrailGLEquity = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLEquity', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailequityaccounts = $scope.data1.responseObject.monthtrailequity;
																				console
																						.log(monthtrailequityaccounts);

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
													$scope.getMonthTrailGLEquity1 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLEquity1', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailequityaccounts1 = $scope.data1.responseObject.monthtrailequity1;
																				console
																						.log(monthtrailequityaccounts1);

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
													$scope.getMonthTrailGLEquity2 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLEquity2', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailequityaccounts2 = $scope.data1.responseObject.monthtrailequity2;
																				console
																						.log(monthtrailequityaccounts2);

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
													$scope.getMonthTrailGLEquity3 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLEquity3', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailequityaccounts3 = $scope.data1.responseObject.monthtrailequity3;
																				console
																						.log(monthtrailequityaccounts3);

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
													$scope.getMonthTrailGLEquity4 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLEquity4', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailequityaccounts4 = $scope.data1.responseObject.monthtrailequity4;
																				console
																						.log(monthtrailequityaccounts4);

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
													$scope.getMonthTrailGLEquity5 = function(details) {
														console.log(details);
														var obj = {
																group_id : details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date")
															}
															console.log(obj);
														$http
																.post('/erp/finance/getMonthTrailGLEquity5', obj)
																.then(
																		function(response) {
																			var sum = 0;
																			$scope.data1 = response.data;
																			if ($scope.data1.successful) {
																				$scope.monthtrailequityaccounts5 = $scope.data1.responseObject.monthtrailequity5;
																				console
																						.log(monthtrailequityaccounts5);

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
											
							

							
							
}]);