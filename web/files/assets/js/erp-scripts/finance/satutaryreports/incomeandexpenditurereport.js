var employee = angular.module('incomeandexpenditurereport', []);
employee.controller('incomeandexpenditurereportController',['$scope','$http',function($scope,$http)
	{
	
	/* getting financial year drop down */
	$http.get('/erp/finance/getFinancialYear').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{      
			
			$scope.financialyear = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});   
	    
	  
	$scope.getIncomeExpenditureReport = function(data){
		
		console.log(data.financial_year);  
		$scope.fyindex=data.financial_year;
		
		  
		var obj = {
				financial_year: data.financial_year,
				previous_financial_year: (data.financial_year) - 1
		};
		console.log(obj);
		$http.post('/erp/finance/getIncomeExpenditureReport',obj).then(function (response) {
			 var sum = 0;
		    $scope.data1 = response.data;
		    if ($scope.data1.successful) {
		        $scope.incomeDetails = $scope.data1.responseObject.income;
		        $scope.incomeDetails1 = $scope.data1.responseObject.income1;
		        console.log(incomeDetails);
		        console.log(incomeDetails1);
		       
		    } else {     
		    	//alert("Error while getting data");   
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		}; 
		
		$scope.getGLAccountDetails = function(data){
			console.log(data);
			var obj = {
					id: data.id,
					financial_year: data.financial_year
			}
			console.log(obj);
			$http.post('/erp/finance/getGLAccountDetails',obj).then(function (response) {
				 var sum = 0;
			    $scope.data1 = response.data;
			    if ($scope.data1.successful) {
			        $scope.GLgroupNames = $scope.data1.responseObject.group;
			        console.log(GLgroupNames);
			        
			       
			    } else {     
			    	//alert("Error while getting data");   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			}; 
			
			$scope.getGLAccountDetails1 = function(data){
				var obj = {
						id: data.id,
						financial_year: data.financial_year
				}
				console.log(obj);
				$http.post('/erp/finance/getGLAccountDetails1',obj).then(function (response) {
					 var sum = 0;
				    $scope.data1 = response.data;
				    if ($scope.data1.successful) {
				        $scope.GLgroupNames1 = $scope.data1.responseObject.group1;
				        console.log(GLgroupNames1);
				        
				       
				    } else {     
				    	//alert("Error while getting data");   
				    	console.log("error")
				       
				    }
				}, function (errResponse) {
				   console.error('Error while fetching notes');    
				});   
				}; 
				
				$scope.getGLAccountDetails2 = function(data){
					var obj = {
							id: data.id,
							financial_year: data.financial_year
					}
					console.log(obj);
					
					$http.post('/erp/finance/getGLAccountDetails2',obj).then(function (response) {
						 var sum = 0;
					    $scope.data1 = response.data;
					    if ($scope.data1.successful) {
					        $scope.GLgroupNames2 = $scope.data1.responseObject.group2;
					        console.log(GLgroupNames2);
					        
					       
					    } else {     
					    	//alert("Error while getting data");   
					    	console.log("error")
					       
					    }
					}, function (errResponse) {
					   console.error('Error while fetching notes');    
					});   
					}; 
					
					$scope.getGLAccountDetails3 = function(data){
						var obj = {
								id: data.id,
								financial_year: data.financial_year
						}
						console.log(obj);
						$http.post('/erp/finance/getGLAccountDetails3',obj).then(function (response) {
							 var sum = 0;
						    $scope.data1 = response.data;
						    if ($scope.data1.successful) {
						        $scope.GLgroupNames3 = $scope.data1.responseObject.group3;
						        console.log(GLgroupNames3);
						        
						       
						    } else {     
						    	//alert("Error while getting data");   
						    	console.log("error")
						       
						    }
						}, function (errResponse) {
						   console.error('Error while fetching notes');    
						});   
						}; 
						
						$scope.getGLAccountDetails4 = function(data){
							var obj = {
									id: data.id,
									financial_year: data.financial_year
							}
							console.log(obj);
							$http.post('/erp/finance/getGLAccountDetails4',obj).then(function (response) {
								 var sum = 0;
							    $scope.data1 = response.data;
							    if ($scope.data1.successful) {
							        $scope.GLgroupNames4 = $scope.data1.responseObject.group4;
							        console.log(GLgroupNames4);
							        
							       
							    } else {     
							    	//alert("Error while getting data");   
							    	console.log("error")
							       
							    }
							}, function (errResponse) {
							   console.error('Error while fetching notes');    
							});   
							}; 
							
							$scope.getGLAccountDetails5 = function(data){
								var obj = {
										id: data.id,
										financial_year: data.financial_year
								}
								console.log(obj);
								$http.post('/erp/finance/getGLAccountDetails5',obj).then(function (response) {
									 var sum = 0;
								    $scope.data1 = response.data;
								    if ($scope.data1.successful) {
								        $scope.GLgroupNames5 = $scope.data1.responseObject.group5;
								        console.log(GLgroupNames5);
								        
								       
								    } else {     
								    	//alert("Error while getting data");   
								    	console.log("error")
								       
								    }
								}, function (errResponse) {
								   console.error('Error while fetching notes');    
								});   
								}; 
								
								
							/*	previous*/
								
								$scope.getGLAccountDetailsPrevious = function(data){
									console.log(data);
									var obj = {
											id: data.id,
											previous_financial_year: (data.financial_year) -1
									}
									console.log(obj);
									$http.post('/erp/finance/getGLAccountDetailsPrevious',obj).then(function (response) {
										 var sum = 0;
									    $scope.data1 = response.data;
									    if ($scope.data1.successful) {
									        $scope.GLgroupNamesprevious = $scope.data1.responseObject.groups;
									        console.log(GLgroupNamesprevious);
									        
									       
									    } else {     
									    	//alert("Error while getting data");   
									    	console.log("error")
									       
									    }
									}, function (errResponse) {
									   console.error('Error while fetching notes');    
									});   
									}; 
									
									$scope.getGLAccountDetailsPrevious1 = function(data){
										var obj = {
												id: data.id,
												previous_financial_year: (data.financial_year) - 1
										}
										console.log(obj);
										$http.post('/erp/finance/getGLAccountDetailsPrevious1',obj).then(function (response) {
											 var sum = 0;
										    $scope.data1 = response.data;
										    if ($scope.data1.successful) {
										        $scope.GLgroupNamesprevious1 = $scope.data1.responseObject.groups1;
										        console.log(GLgroupNamesprevious1);
										        
										       
										    } else {     
										    	//alert("Error while getting data");   
										    	console.log("error")
										       
										    }
										}, function (errResponse) {
										   console.error('Error while fetching notes');    
										});      
										}; 
										
										$scope.getGLAccountDetailsPrevious2 = function(data){
											var obj = {
													id: data.id,
													previous_financial_year: (data.financial_year) - 1
											}
											console.log(obj);
											
											$http.post('/erp/finance/getGLAccountDetailsPrevious2',obj).then(function (response) {
												 var sum = 0;
											    $scope.data1 = response.data;
											    if ($scope.data1.successful) {
											        $scope.GLgroupNamesprevious2 = $scope.data1.responseObject.groups2;
											        console.log(GLgroupNamesprevious2);
											        
											       
											    } else {     
											    	//alert("Error while getting data");   
											    	console.log("error")
											       
											    }
											}, function (errResponse) {
											   console.error('Error while fetching notes');    
											});   
											}; 
											
											$scope.getGLAccountDetailsPrevious3 = function(data){
												var obj = {
														id: data.id,
														previous_financial_year: (data.financial_year) - 1
												}
												console.log(obj);
												$http.post('/erp/finance/getGLAccountDetailsPrevious3',obj).then(function (response) {
													 var sum = 0;
												    $scope.data1 = response.data;
												    if ($scope.data1.successful) {
												        $scope.GLgroupNamesprevious3 = $scope.data1.responseObject.groups3;
												        console.log(GLgroupNamesprevious3);
												        
												       
												    } else {     
												    	//alert("Error while getting data");   
												    	console.log("error")
												       
												    }
												}, function (errResponse) {
												   console.error('Error while fetching notes');    
												});   
												}; 
												
												$scope.getGLAccountDetailsPrevious4 = function(data){
													var obj = {
															id: data.id,
															previous_financial_year: (data.financial_year) - 1
													}
													console.log(obj);
													$http.post('/erp/finance/getGLAccountDetailsPrevious4',obj).then(function (response) {
														 var sum = 0;
													    $scope.data1 = response.data;
													    if ($scope.data1.successful) {
													        $scope.GLgroupNamesprevious4 = $scope.data1.responseObject.groups4;
													        console.log(GLgroupNamesprevious4);
													        
													       
													    } else {     
													    	//alert("Error while getting data");   
													    	console.log("error")
													       
													    }
													}, function (errResponse) {
													   console.error('Error while fetching notes');    
													});   
													}; 
													
													$scope.getGLAccountDetailsPrevious5 = function(data){
														var obj = {
																id: data.id,
																previous_financial_year: (data.financial_year) - 1
														}
														console.log(obj);
														$http.post('/erp/finance/getGLAccountDetailsPrevious5',obj).then(function (response) {
															 var sum = 0;
														    $scope.data1 = response.data;
														    if ($scope.data1.successful) {
														        $scope.GLgroupNamesprevious5 = $scope.data1.responseObject.groups5;
														        console.log(GLgroupNamesprevious5);
														        
														       
														    } else {     
														    	//alert("Error while getting data");   
														    	console.log("error")
														       
														    }
														}, function (errResponse) {
														   console.error('Error while fetching notes');    
														});   
														}; 
									
			
		
		
		$scope.getExpenditureReport = function(data){
			console.log(data.financial_year);
			var obj = {
					financial_year: data.financial_year,
					previous_financial_year: (data.financial_year) - 1
			};
			console.log(obj);
			$http.post('/erp/finance/getExpenditureReport',obj).then(function (response) {
				 var sum = 0;
			    $scope.data1 = response.data;
			    if ($scope.data1.successful) {
			        $scope.expenditureDetails = $scope.data1.responseObject.expenditure;
			        $scope.expenditureDetails1 = $scope.data1.responseObject.expenditure1;
			        $scope.expenditureDetails2 = $scope.data1.responseObject.expenditure2;

			     
			       
			    } else {     
			    	//alert("Error while getting data");   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			}; 
			
		$scope.getGLAccountNames = function(details){
			console.log(details);
			var obj = {
					group_id: details.group_id,
					financial_year: details.financial_year,
					previous_financial_year: details.previous_financial_year
			}
			console.log(obj);
			$http.post('/erp/finance/getGLAccountNames',obj).then(function (response) {
			    $scope.data = response.data;
			    if ($scope.data.successful) {
			    	
			        $scope.glaccounts = $scope.data.responseObject.gl;
			        
			        console.log($scope.glaccounts);
			    } else {
		   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			};  
			   
			
			$scope.getGLAccountTwoNames = function(details){
				console.log(details);
				var obj = {   
						group_id: details.group_id,
						financial_year: details.financial_year,
						previous_financial_year: details.previous_financial_year
				}
				console.log(obj);
				$http.post('/erp/finance/getGLAccountTwoNames',obj).then(function (response) {
				    $scope.data = response.data;
				    if ($scope.data.successful) {
				    	
				        $scope.glaccounts1 = $scope.data.responseObject.gl1;
				        
				        console.log($scope.glaccounts1);
				    } else {   
			   
				    	console.log("error")
				       
				    }
				}, function (errResponse) {
				   console.error('Error while fetching notes');    
				});   
				};  
				
				
				/*	Expenditure*/
				$scope.getGLExpAccountNames = function(details){
					console.log(details);
					var obj = {
							group_id: details.group_id,
							financial_year: details.financial_year,
							previous_financial_year: details.previous_financial_year
					}
					console.log(obj);
					$http.post('/erp/finance/getGLExpAccountNames',obj).then(function (response) {
					    $scope.data = response.data;
					    if ($scope.data.successful) {
					    	
					        $scope.expenditureaccounts = $scope.data.responseObject.glexp;
					        
					        console.log($scope.expenditureaccounts);
					    } else {
				   
					    	console.log("error")
					       
					    }
					}, function (errResponse) {
					   console.error('Error while fetching notes');    
					});   
					};  
					
					
					$scope.getGLExpAccountOneNames = function(details){
						console.log(details);
						var obj = {
								group_id: details.group_id,
								financial_year: details.financial_year,
								previous_financial_year: details.previous_financial_year
						}
						console.log(obj);
						$http.post('/erp/finance/getGLExpAccountOneNames',obj).then(function (response) {
						    $scope.data = response.data;
						    if ($scope.data.successful) {
						    	
						        $scope.expenditureaccounts1 = $scope.data.responseObject.glexp1;
						        
						        console.log($scope.expenditureaccounts1);
						    } else {
					   
						    	console.log("error")
						       
						    }
						}, function (errResponse) {
						   console.error('Error while fetching notes');    
						});   
						};  
						
						$scope.getGLExpAccountTwoNames = function(details){
							console.log(details);
							var obj = {
									group_id: details.group_id,
									financial_year: details.financial_year,
									previous_financial_year: details.previous_financial_year
							}
							console.log(obj);
							$http.post('/erp/finance/getGLExpAccountTwoNames',obj).then(function (response) {
							    $scope.data = response.data;
							    if ($scope.data.successful) {
							    	
							        $scope.expenditureaccounts2 = $scope.data.responseObject.glexp2;
							        
							        console.log($scope.expenditureaccounts2);
							    } else {
						   
							    	console.log("error")
							       
							    }
							}, function (errResponse) {
							   console.error('Error while fetching notes');    
							});   
							}; 
							
							$scope.getDepreciationDetails = function(data){
								console.log(data.financial_year);
								var obj = {
										financial_year: data.financial_year,
										previous_financial_year: (data.financial_year) - 1
								};
								console.log(obj);
								$http.post('/erp/finance/getDepreciationDetails',obj).then(function (response) {
									 var sum = 0;
								    $scope.data1 = response.data;
								    if ($scope.data1.successful) {
								        $scope.depreciationDetails = $scope.data1.responseObject.depreciation;
								      		       
								    } else {     
								    	//alert("Error while getting data");   
								    	console.log("error")
								       
								    }
								}, function (errResponse) {
								   console.error('Error while fetching notes');    
								});   
								}; 
								
								$scope.getDepreciationAccountNames = function(details){
									console.log(details);
									var obj = {
											group_id: details.group_id,
											financial_year: details.financial_year,
											previous_financial_year: details.previous_financial_year
									}
									console.log(obj);
									$http.post('/erp/finance/getDepreciationAccountNames',obj).then(function (response) {
									    $scope.data = response.data;
									    if ($scope.data.successful) {
									    	
									        $scope.depreciationAccountnames = $scope.data.responseObject.dep;
									        
									        console.log($scope.depreciationAccountnames);
									    } else {
								   
									    	console.log("error")
									       
									    }  
									}, function (errResponse) {
									   console.error('Error while fetching notes');    
									});   
									}; 
									
									/*DISPLAY ACCOUNT BALANCE
									
									$scope.getDisplayAccountDetails = function(details){
										console.log(details);
										
										var obj = {   
												
												   
												from_date: details.from_date,
												to_date: details.to_date,
												id:details.id
												
								   
												  
											};
										console.log(obj);   
										$http.post('/erp/finance/getDisplayAccountDetails',obj).then(function (response) {
										    $scope.data = response.data;
										    if ($scope.data.successful) {
										        $scope.displayBalance = $scope.data.responseObject.balance;
										        console.log($scope.displayBalance);
										    } else {
									   
										    	console.log("error")
										       
										    }
										}, function (errResponse) {
										   console.error('Error while fetching notes');    
										});   
										};  */
									
									
								/*	MONTHLY REPORT*/
									$scope.getMonthIncomeExpenditureReport = function(data){
										
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
									
										$http.post('/erp/finance/getMonthIncomeExpenditureReport',obj).then(function (response) {
											 var sum = 0;
										    $scope.data1 = response.data;
										    if ($scope.data1.successful) {
										        $scope.monthincomeDetails = $scope.data1.responseObject.monthincome;
										        $scope.monthincomeDetails1 = $scope.data1.responseObject.monthincome1;
										        console.log(monthincomeDetails);
										        console.log(monthincomeDetails1);
										       
										    } else {     
										    	//alert("Error while getting data");   
										    	console.log("error")
										       
										    }
										}, function (errResponse) {
										   console.error('Error while fetching notes');    
										});   
										}; 
										
										$scope.getMonthExpenditureReport = function(data){
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
									var obj = {
											from_date: from_date,
											to_date: to_date,
											previous_from_date: previous_from_date,
											previous_to_date:previous_to_date
									}
										console.log(obj);  
											$http.post('/erp/finance/getMonthExpenditureReport',obj).then(function (response) {
												 var sum = 0;
											    $scope.data1 = response.data;
											    if ($scope.data1.successful) {
											        $scope.monthexpenditureDetails = $scope.data1.responseObject.monthexpenditure;
											        $scope.monthexpenditureDetails1 = $scope.data1.responseObject.monthexpenditure1;
											        $scope.monthexpenditureDetails2 = $scope.data1.responseObject.monthexpenditure2;

											     
											       
											    } else {     
											    	//alert("Error while getting data");   
											    	console.log("error")
											       
											    }
											}, function (errResponse) {
											   console.error('Error while fetching notes');    
											});   
											}; 
										
											

											$scope.getMonthDepreciationDetails = function(data){
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
										var obj = {
												from_date: from_date,
												to_date: to_date,
												previous_from_date: previous_from_date,
												previous_to_date:previous_to_date
										}
											console.log(obj);  
												$http.post('/erp/finance/getMonthDepreciationDetails',obj).then(function (response) {
													 var sum = 0;
												    $scope.data1 = response.data;
												    if ($scope.data1.successful) {
												        $scope.monthdepreciationDetails = $scope.data1.responseObject.monthdepreciation;
												      		       
												    } else {     
												    	//alert("Error while getting data");   
												    	console.log("error")
												       
												    }
												}, function (errResponse) {
												   console.error('Error while fetching notes');    
												});   
												}; 
												
												
												$scope.getMonthGLAccountNames = function(details){
													console.log(details);
													var obj = {
															group_id: details.group_id,
															from_date: ERP.getSessionValue("from_date"),
															to_date: ERP.getSessionValue("to_date"),
															previous_from_date : ERP.getSessionValue("previous_from_date"),
															previous_to_date: ERP.getSessionValue("previous_to_date")
													}
													console.log(obj);
													$http.post('/erp/finance/getMonthGLAccountNames',obj).then(function (response) {
													    $scope.data = response.data;
													    if ($scope.data.successful) {
													    	
													        $scope.monthglaccounts = $scope.data.responseObject.monthgl;
													        
													        console.log($scope.monthglaccounts);
													    } else {
												   
													    	console.log("error")
													       
													    }
													}, function (errResponse) {   
													   console.error('Error while fetching notes');    
													});   
													};  
													   
													
													$scope.getMonthGLAccountTwoNames = function(details){
														console.log(details);
														var obj = {
																group_id: details.group_id,
																from_date: ERP.getSessionValue("from_date"),
																to_date: ERP.getSessionValue("to_date"),
																previous_from_date : ERP.getSessionValue("previous_from_date"),
																previous_to_date: ERP.getSessionValue("previous_to_date")
														}
														console.log(obj);
														$http.post('/erp/finance/getMonthGLAccountTwoNames',obj).then(function (response) {
														    $scope.data = response.data;
														    if ($scope.data.successful) {
														    	
														        $scope.monthglaccounts1 = $scope.data.responseObject.monthgl1;
														        
														        console.log($scope.monthglaccounts1);
														    } else {   
													   
														    	console.log("error")
														       
														    }
														}, function (errResponse) {
														   console.error('Error while fetching notes');    
														});   
														};  
														
														
															/*Expenditure*/
														$scope.getMonthGLExpAccountNames = function(details){
															console.log(details);
															var obj = {
																	group_id: details.group_id,
																	from_date: ERP.getSessionValue("from_date"),
																	to_date: ERP.getSessionValue("to_date"),
																	previous_from_date : ERP.getSessionValue("previous_from_date"),
																	previous_to_date: ERP.getSessionValue("previous_to_date")
															}
															console.log(obj);
															$http.post('/erp/finance/getMonthGLExpAccountNames',obj).then(function (response) {
															    $scope.data = response.data;
															    if ($scope.data.successful) {
															    	
															        $scope.monthexpenditureaccounts = $scope.data.responseObject.monthglexp;
															        
															        console.log($scope.monthexpenditureaccounts);
															    } else {
														   
															    	console.log("error")
															       
															    }
															}, function (errResponse) {
															   console.error('Error while fetching notes');    
															});   
															};  
															
															
															$scope.getMonthGLExpAccountOneNames = function(details){
																console.log(details);
																var obj = {
																		group_id: details.group_id,
																		from_date: ERP.getSessionValue("from_date"),
																		to_date: ERP.getSessionValue("to_date"),
																		previous_from_date : ERP.getSessionValue("previous_from_date"),
																		previous_to_date: ERP.getSessionValue("previous_to_date")
																}
																console.log(obj);
																$http.post('/erp/finance/getMonthGLExpAccountOneNames',obj).then(function (response) {
																    $scope.data = response.data;
																    if ($scope.data.successful) {
																    	
																        $scope.monthexpenditureaccounts1 = $scope.data.responseObject.monthglexp1;
																        
																        console.log($scope.monthexpenditureaccounts1);
																    } else {
															   
																    	console.log("error")
																       
																    }
																}, function (errResponse) {
																   console.error('Error while fetching notes');    
																});   
																};  
																
																$scope.getMonthGLExpAccountTwoNames = function(details){
																	console.log(details);
																	var obj = {
																			group_id: details.group_id,
																			from_date: ERP.getSessionValue("from_date"),
																			to_date: ERP.getSessionValue("to_date"),
																			previous_from_date : ERP.getSessionValue("previous_from_date"),
																			previous_to_date: ERP.getSessionValue("previous_to_date")
																	}
																	console.log(obj);
																	$http.post('/erp/finance/getMonthGLExpAccountTwoNames',obj).then(function (response) {
																	    $scope.data = response.data;
																	    if ($scope.data.successful) {
																	    	
																	        $scope.monthexpenditureaccounts2 = $scope.data.responseObject.monthglexp2;
																	        
																	        console.log($scope.monthexpenditureaccounts2);
																	    } else {
																   
																	    	console.log("error")
																	       
																	    }
																	}, function (errResponse) {
																	   console.error('Error while fetching notes');    
																	});  
																};
																
																$scope.getMonthDepreciationAccountNames = function(details){
																	console.log(details);
																	var obj = {
																			group_id: details.group_id,
																			from_date: ERP.getSessionValue("from_date"),
																			to_date: ERP.getSessionValue("to_date"),
																			previous_from_date : ERP.getSessionValue("previous_from_date"),
																			previous_to_date: ERP.getSessionValue("previous_to_date")
																	}
																	console.log(obj);
																	$http.post('/erp/finance/getMonthDepreciationAccountNames',obj).then(function (response) {
																	    $scope.data = response.data;
																	    if ($scope.data.successful) {
																	    	
																	        $scope.monthdepreciationAccountnames = $scope.data.responseObject.monthdep;
																	        
																	        console.log($scope.monthdepreciationAccountnames);
																	    } else {
																   
																	    	console.log("error")
																	       
																	    }  
																	}, function (errResponse) {
																	   console.error('Error while fetching notes');    
																	});   
																	}; 
									
																	
																	$scope.getMonthGLAccountDetails = function(data){
																		console.log(data);
																		var obj = {
																				id: data.id,
																				from_date: ERP.getSessionValue("from_date"),
																				to_date: ERP.getSessionValue("to_date")
																		}
																		console.log(obj);
																		$http.post('/erp/finance/getMonthGLAccountDetails',obj).then(function (response) {
																			 var sum = 0;
																		    $scope.data1 = response.data;
																		    if ($scope.data1.successful) {
																		        $scope.monthGLgroupNames = $scope.data1.responseObject.monthgroup;
																		        console.log(monthGLgroupNames);
																		        
																		       
																		    } else {     
																		    	//alert("Error while getting data");   
																		    	console.log("error")
																		       
																		    }
																		}, function (errResponse) {
																		   console.error('Error while fetching notes');    
																		});   
																		}; 
																		
																		$scope.getMonthGLAccountDetails1 = function(data){
																			var obj = {
																					id: data.id,
																					from_date: ERP.getSessionValue("from_date"),
																					to_date: ERP.getSessionValue("to_date")
																			}
																			console.log(obj);
																			$http.post('/erp/finance/getMonthGLAccountDetails1',obj).then(function (response) {
																				 var sum = 0;
																			    $scope.data1 = response.data;
																			    if ($scope.data1.successful) {
																			        $scope.monthGLgroupNames1 = $scope.data1.responseObject.monthgroup1;
																			        console.log(monthGLgroupNames1);
																			        
																			       
																			    } else {     
																			    	//alert("Error while getting data");   
																			    	console.log("error")
																			       
																			    }
																			}, function (errResponse) {
																			   console.error('Error while fetching notes');    
																			});   
																			}; 
																			
																			$scope.getMonthGLAccountDetails2 = function(data){
																				var obj = {
																						id: data.id,
																						from_date: ERP.getSessionValue("from_date"),
																						to_date: ERP.getSessionValue("to_date")
																				}
																				console.log(obj);
																				
																				$http.post('/erp/finance/getMonthGLAccountDetails2',obj).then(function (response) {
																					 var sum = 0;
																				    $scope.data1 = response.data;
																				    if ($scope.data1.successful) {
																				        $scope.monthGLgroupNames2 = $scope.data1.responseObject.monthgroup2;
																				        console.log(monthGLgroupNames2);
																				        
																				       
																				    } else {     
																				    	//alert("Error while getting data");   
																				    	console.log("error")
																				       
																				    }
																				}, function (errResponse) {
																				   console.error('Error while fetching notes');    
																				});   
																				}; 
																				
																				$scope.getMonthGLAccountDetails3 = function(data){
																					var obj = {
																							id: data.id,
																							from_date: ERP.getSessionValue("from_date"),
																							to_date: ERP.getSessionValue("to_date")
																					}
																					console.log(obj);
																					$http.post('/erp/finance/getMonthGLAccountDetails3',obj).then(function (response) {
																						 var sum = 0;
																					    $scope.data1 = response.data;
																					    if ($scope.data1.successful) {
																					        $scope.monthGLgroupNames3 = $scope.data1.responseObject.monthgroup3;
																					        console.log(monthGLgroupNames3);
																					        
																					       
																					    } else {     
																					    	//alert("Error while getting data");   
																					    	console.log("error")
																					       
																					    }
																					}, function (errResponse) {
																					   console.error('Error while fetching notes');    
																					});   
																					}; 
																					
																					$scope.getMonthGLAccountDetails4 = function(data){
																						var obj = {
																								id: data.id,
																								from_date: ERP.getSessionValue("from_date"),
																								to_date: ERP.getSessionValue("to_date")
																						}
																						console.log(obj);
																						$http.post('/erp/finance/getMonthGLAccountDetails4',obj).then(function (response) {
																							 var sum = 0;
																						    $scope.data1 = response.data;
																						    if ($scope.data1.successful) {
																						        $scope.monthGLgroupNames4 = $scope.data1.responseObject.monthgroup4;
																						        console.log(monthGLgroupNames4);
																						        
																						       
																						    } else {     
																						    	//alert("Error while getting data");   
																						    	console.log("error")
																						       
																						    }
																						}, function (errResponse) {
																						   console.error('Error while fetching notes');    
																						});   
																						}; 
																						
																						$scope.getMonthGLAccountDetails5 = function(data){
																							var obj = {
																									id: data.id,
																									from_date: ERP.getSessionValue("from_date"),
																									to_date: ERP.getSessionValue("to_date")
																							}
																							console.log(obj);
																							$http.post('/erp/finance/getMonthGLAccountDetails5',obj).then(function (response) {
																								 var sum = 0;
																							    $scope.data1 = response.data;
																							    if ($scope.data1.successful) {
																							        $scope.monthGLgroupNames5 = $scope.data1.responseObject.monthgroup5;
																							        console.log(monthGLgroupNames5);
																							        
																							       
																							    } else {     
																							    	//alert("Error while getting data");   
																							    	console.log("error")
																							       
																							    }
																							}, function (errResponse) {
																							   console.error('Error while fetching notes');    
																							});   
																							}; 
																							
																							
																						/*	previous*/
																							
																							$scope.getMonthGLAccountDetailsPrevious = function(data){
																								console.log(data);
																								var obj = {
																										id: data.id,
																										previous_from_date : ERP.getSessionValue("previous_from_date"),
																										previous_to_date: ERP.getSessionValue("previous_to_date")
																								}
																								console.log(obj);
																								$http.post('/erp/finance/getMonthGLAccountDetailsPrevious',obj).then(function (response) {
																									 var sum = 0;
																								    $scope.data1 = response.data;
																								    if ($scope.data1.successful) {
																								        $scope.monthGLgroupNamesprevious = $scope.data1.responseObject.monthgroups;
																								        console.log(monthGLgroupNamesprevious);
																								        
																								       
																								    } else {     
																								    	//alert("Error while getting data");   
																								    	console.log("error")
																								       
																								    }
																								}, function (errResponse) {
																								   console.error('Error while fetching notes');    
																								});   
																								}; 
																								
																								$scope.getMonthGLAccountDetailsPrevious1 = function(data){
																									var obj = {
																											id: data.id,
																											previous_from_date : ERP.getSessionValue("previous_from_date"),
																											previous_to_date: ERP.getSessionValue("previous_to_date")
																									}
																									console.log(obj);
																									$http.post('/erp/finance/getMonthGLAccountDetailsPrevious1',obj).then(function (response) {
																										 var sum = 0;
																									    $scope.data1 = response.data;
																									    if ($scope.data1.successful) {
																									        $scope.monthGLgroupNamesprevious1 = $scope.data1.responseObject.monthgroups1;
																									        console.log(monthGLgroupNamesprevious1);
																									        
																									       
																									    } else {     
																									    	//alert("Error while getting data");   
																									    	console.log("error")
																									       
																									    }
																									}, function (errResponse) {
																									   console.error('Error while fetching notes');    
																									});   
																									}; 
																									
																									$scope.getMonthGLAccountDetailsPrevious2 = function(data){
																										var obj = {
																												id: data.id,
																												previous_from_date : ERP.getSessionValue("previous_from_date"),
																												previous_to_date: ERP.getSessionValue("previous_to_date")
																										}
																										console.log(obj);
																										
																										$http.post('/erp/finance/getMonthGLAccountDetailsPrevious2',obj).then(function (response) {
																											 var sum = 0;
																										    $scope.data1 = response.data;
																										    if ($scope.data1.successful) {
																										        $scope.monthGLgroupNamesprevious2 = $scope.data1.responseObject.monthgroups2;
																										        console.log(monthGLgroupNamesprevious2);
																										        
																										       
																										    } else {     
																										    	//alert("Error while getting data");   
																										    	console.log("error")
																										       
																										    }
																										}, function (errResponse) {
																										   console.error('Error while fetching notes');    
																										});   
																										}; 
																										
																										$scope.getMonthGLAccountDetailsPrevious3 = function(data){
																											var obj = {
																													id: data.id,
																													previous_from_date : ERP.getSessionValue("previous_from_date"),
																													previous_to_date: ERP.getSessionValue("previous_to_date")
																											}
																											console.log(obj);
																											$http.post('/erp/finance/getMonthGLAccountDetailsPrevious3',obj).then(function (response) {
																												 var sum = 0;
																											    $scope.data1 = response.data;
																											    if ($scope.data1.successful) {
																											        $scope.monthGLgroupNamesprevious3 = $scope.data1.responseObject.monthgroups3;
																											        console.log(monthGLgroupNamesprevious3);
																											        
																											       
																											    } else {     
																											    	//alert("Error while getting data");   
																											    	console.log("error")
																											       
																											    }
																											}, function (errResponse) {
																											   console.error('Error while fetching notes');    
																											});   
																											}; 
																											
																											$scope.getMonthGLAccountDetailsPrevious4 = function(data){
																												var obj = {
																														id: data.id,
																														previous_from_date : ERP.getSessionValue("previous_from_date"),
																														previous_to_date: ERP.getSessionValue("previous_to_date")
																												}
																												console.log(obj);
																												$http.post('/erp/finance/getMonthGLAccountDetailsPrevious4',obj).then(function (response) {
																													 var sum = 0;
																												    $scope.data1 = response.data;
																												    if ($scope.data1.successful) {
																												        $scope.monthGLgroupNamesprevious4 = $scope.data1.responseObject.monthgroups4;
																												        console.log(monthGLgroupNamesprevious4);
																												        
																												       
																												    } else {     
																												    	//alert("Error while getting data");   
																												    	console.log("error")
																												       
																												    }
																												}, function (errResponse) {
																												   console.error('Error while fetching notes');    
																												});   
																												}; 
																												
																												$scope.getMonthGLAccountDetailsPrevious5 = function(data){
																													var obj = {
																															id: data.id,
																															previous_from_date : ERP.getSessionValue("previous_from_date"),
																															previous_to_date: ERP.getSessionValue("previous_to_date")
																													}
																													console.log(obj);
																													$http.post('/erp/finance/getMonthGLAccountDetailsPrevious5',obj).then(function (response) {
																														 var sum = 0;
																													    $scope.data1 = response.data;
																													    if ($scope.data1.successful) {
																													        $scope.monthGLgroupNamesprevious5 = $scope.data1.responseObject.monthgroups5;
																													        console.log(monthGLgroupNamesprevious5);
																													        
																													       
																													    } else {     
																													    	//alert("Error while getting data");   
																													    	console.log("error")
																													       
																													    }
																													}, function (errResponse) {
																													   console.error('Error while fetching notes');    
																													});   
																													}; 
																								
																		
																	
																	
}]);