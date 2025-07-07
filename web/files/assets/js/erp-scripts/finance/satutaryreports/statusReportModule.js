var invoicewopostatus=angular.module('invoicewopostatus',[]);

invoicewopostatus.controller('invoicewopocontroller',['$scope','$http',function($scope,$http){
	
	   
	
	$http.get('/erp/finance/getVendorDetails').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.vendors = $scope.data.responseObject;
			 $scope.data = {
						object : data
					};
			
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
		

	$scope.getInvoiceDetails = function(data){
		console.log(data);
		console.log(data.vendor_id);
		$http.post('/erp/finance/getInvoiceDetails',data.vendor_id).then(function (response) {
		    $scope.data = response.data;
		    if ($scope.data.successful) {
		        $scope.invoices = $scope.data.responseObject;
		        console.log($scope.invoices);
		        $scope.data = {
						object : data
					};
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		
		$scope.getWorkorderDetails = function(data){
			console.log(data.vendor_id);
			$http.post('/erp/finance/getWorkorderDetails',data.vendor_id).then(function (response) {
			    $scope.data = response.data;
			    if ($scope.data.successful) {
			        $scope.workorders = $scope.data.responseObject;
			        console.log($scope.workorders);
			        $scope.data = {
							object : data
						};
			    } else {
			    	//alert("Error while getting data");
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			};  
		
			
			$scope.getPurchaseorderDetails = function(data){
				console.log(data.vendor_id);
				$http.post('/erp/finance/getPurchaseorderDetails',data.vendor_id).then(function (response) {
				    $scope.data = response.data;
				    if ($scope.data.successful) {
				        $scope.purchaseorders = $scope.data.responseObject;
				        console.log($scope.purchaseorders);
				        $scope.data = {
								object : data
							};
				    } else {
				    	//alert("Error while getting data");
				    	console.log("error")
				       
				    }
				}, function (errResponse) {
				   console.error('Error while fetching notes');    
				});   
				};  
			
				$scope.getMouDetails = function(data){
					console.log(data.vendor_id);
					$http.post('/erp/finance/getMouDetails',data.vendor_id).then(function (response) {
					    $scope.data = response.data;
					    if ($scope.data.successful) {
					        $scope.mous = $scope.data.responseObject;
					        console.log($scope.mous);
					        $scope.data = {
									object : data
								};
					    } else {
					    	//alert("Error while getting data");
					    	console.log("error")
					       
					    }
					}, function (errResponse) {
					   console.error('Error while fetching notes');    
					});   
					};  
					
					
				var totalreportingcount;
				var totalcfocount;
				var totalfinancecount;
				var totalpaymentcount;
				var totalbookedcount;
				var totalreleasecount;
				var totalholdcount;
				var totalreturnedcount;
				
					$scope.getInvoiceStatusReport = function(details){
						console.log(details);
						
						var obj = {      
								vendor_id: details.vendor_id,
								invoiceid: details.invoiceid
							   
							};
						console.log(obj);   
						$http.post('/erp/finance/getInvoiceStatusReport',obj).then(function (response) {
						    $scope.data = response.data;
						    if ($scope.data.successful) {
						        $scope.invoicecount = $scope.data.responseObject.count;
						        $scope.reportingcount = $scope.data.responseObject.report;
						        totalreportingcount = $scope.reportingcount.length;
						        $scope.cfocount = $scope.data.responseObject.cfo;
						        totalcfocount = $scope.cfocount.length;
						        $scope.financecount = $scope.data.responseObject.finance;
						        totalfinancecount = $scope.financecount.length;
						        $scope.paymentcount = $scope.data.responseObject.payment;
						        totalpaymentcount = $scope.paymentcount.length;
						        $scope.bookedcount = $scope.data.responseObject.booked;
						        totalbookedcount = $scope.bookedcount.length;
						        $scope.releasecount = $scope.data.responseObject.release;
						        totalreleasecount = $scope.releasecount.length;
						        $scope.holdcount = $scope.data.responseObject.hold;
						        totalholdcount = $scope.holdcount.length;
						        $scope.returnedcount = $scope.data.responseObject.returned;
						        totalreturnedcount = $scope.returnedcount.length;
						        console.log($scope.invoicecount);
						        console.log($scope.reportingcount);
						        console.log($scope.cfocount);
						        console.log($scope.financecount);
						        console.log($scope.paymentcount);
						        console.log($scope.bookedcount);
						        console.log($scope.releasecount);
						        console.log($scope.holdcount);
						        console.log($scope.returnedcount);
						    } else {
					   
						    	console.log("error")
						       
						    }
						}, function (errResponse) {
						   console.error('Error while fetching notes');    
						});   
						}; 
						
						

						$scope.getInvoiceTotalData = function(details){
							console.log(details);
							var obj = {
									vendor_id: details.vendor,
									invoiceid: details.id
							}
							console.log(obj);
							$http.post('/erp/finance/getInvoiceTotalData',obj).then(function (response) {
							    $scope.data = response.data;
							    if ($scope.data.successful) {
							    	 $("#invoice1").show();	  
									 $("#invoice2").hide();
									 $("#invoice3").hide();
									 $("#invoice4").hide();
									 $("#invoice5").hide();   
									 $("#invoice6").hide();
									 $("#invoice7").hide();
									 $("#invoice8").hide();
									 $("#invoice9").hide();
							        $scope.totalinvoice = $scope.data.responseObject.total;
							        console.log($scope.totalinvoice);
							        
							    } else {
							    	//alert("Error while getting data");
							    	console.log("error")
							       
							    }
							}, function (errResponse) {
							   console.error('Error while fetching notes');    
							});   
							};  
							
							
							$scope.getTotalReportingData = function(details1){
								console.log(details1);
								var obj = {
										vendor_id: details1.vendor,
										invoiceid: details1.id
								}
								console.log(obj);
								$http.post('/erp/finance/getTotalReportingData',obj).then(function (response) {
								    $scope.data = response.data;
								    if ($scope.data.successful) {
								    	 $("#invoice1").hide();	  
										 $("#invoice2").show();
										 $("#invoice3").hide();
										 $("#invoice4").hide();
										 $("#invoice5").hide();   
										 $("#invoice6").hide();
										 $("#invoice7").hide();   
										 $("#invoice8").hide();
										 $("#invoice9").hide();
								        $scope.totalreporting = $scope.data.responseObject.totalreport;
								        console.log($scope.totalreporting);
								        
								    } else {
								    	//alert("Error while getting data");
								    	console.log("error")
								       
								    }
								}, function (errResponse) {
								   console.error('Error while fetching notes');    
								});   
								};  			
						
								$scope.getTotalPendingData = function(details2){
									console.log(details2);
									var obj = {
											vendor_id: details2.vendor,
											invoiceid: details2.id
									}
									console.log(obj);
									$http.post('/erp/finance/getTotalPendingData',obj).then(function (response) {
									    $scope.data = response.data;
									    if ($scope.data.successful) {
									    	 $("#invoice1").hide();	  
											 $("#invoice2").hide();
											 $("#invoice3").show();
											 $("#invoice4").hide();
											 $("#invoice5").hide();   
											 $("#invoice6").hide();
											 $("#invoice7").hide();   
											 $("#invoice8").hide();
											 $("#invoice9").hide();
									        $scope.totalcfo = $scope.data.responseObject.totalcfo;
									        console.log($scope.totalcfo);
									        
									    } else {
									    	//alert("Error while getting data");
									    	console.log("error")
									       
									    }
									}, function (errResponse) {
									   console.error('Error while fetching notes');    
									});   
									};  	
									
									
									$scope.getTotalFinanceData = function(details3){
										console.log(details3);
										var obj = {
												vendor_id: details3.vendor,
												invoiceid: details3.id
										}
										console.log(obj);
										$http.post('/erp/finance/getTotalFinanceData',obj).then(function (response) {
										    $scope.data = response.data;
										    if ($scope.data.successful) {
										    	 $("#invoice1").hide();	  
												 $("#invoice2").hide();
												 $("#invoice3").hide();
												 $("#invoice4").show();
												 $("#invoice5").hide();   
												 $("#invoice6").hide();
												 $("#invoice7").hide();   
												 $("#invoice8").hide();
												 $("#invoice9").hide();
										        $scope.totalfinance = $scope.data.responseObject.finance;
										        console.log($scope.totalfinance);
										        
										    } else {
										    	//alert("Error while getting data");
										    	console.log("error")
										       
										    }
										}, function (errResponse) {
										   console.error('Error while fetching notes');    
										});   
										};  			
								

										$scope.getTotalPaymentData = function(details3){
											console.log(details3);
											var obj = {
													vendor_id: details3.vendor,
													invoiceid: details3.id
											}
											console.log(obj);
											$http.post('/erp/finance/getTotalPaymentData',obj).then(function (response) {
											    $scope.data = response.data;
											    if ($scope.data.successful) {
											    	 $("#invoice1").hide();	  
													 $("#invoice2").hide();
													 $("#invoice3").hide();
													 $("#invoice4").hide();
													 $("#invoice5").show();   
													 $("#invoice6").hide();
													 $("#invoice7").hide();   
													 $("#invoice8").hide();
													 $("#invoice9").hide();
											        $scope.paymentData = $scope.data.responseObject.payment;
											        console.log($scope.paymentData);
											        
											    } else {
											    	//alert("Error while getting data");
											    	console.log("error")
											       
											    }
											}, function (errResponse) {
											   console.error('Error while fetching notes');    
											});   
											};  			
										
											$scope.getTotalBookedData = function(details){
												console.log(details);
												var obj = {
														vendor_id: details.vendor,
														invoiceid: details.id
												}
												console.log(obj);
												$http.post('/erp/finance/getTotalBookedData',obj).then(function (response) {
												    $scope.data = response.data;
												    if ($scope.data.successful) {
												    	 $("#invoice1").hide();	  
														 $("#invoice2").hide();
														 $("#invoice3").hide();
														 $("#invoice4").hide();
														 $("#invoice5").hide();   
														 $("#invoice6").show();
														 $("#invoice7").hide();   
														 $("#invoice8").hide();
														 $("#invoice9").hide();
												    	 
												        $scope.bookedData = $scope.data.responseObject.bookedinvoice;
												        console.log($scope.bookedData);
												        
												    } else {
												    	//alert("Error while getting data");
												    	console.log("error")
												       
												    }
												}, function (errResponse) {
												   console.error('Error while fetching notes');    
												});   
												};  	
											
												$scope.getTotalReleasedData = function(details){
													console.log(details);
													var obj = {
															vendor_id: details.vendor,
															invoiceid: details.id
													}
													console.log(obj);
													$http.post('/erp/finance/getTotalReleasedData',obj).then(function (response) {
													    $scope.data = response.data;
													    if ($scope.data.successful) {
													    	 $("#invoice1").hide();	  
															 $("#invoice2").hide();
															 $("#invoice3").hide();
															 $("#invoice4").hide();
															 $("#invoice5").hide();   
															 $("#invoice6").hide();
															 $("#invoice7").show();   
															 $("#invoice8").hide();
															 $("#invoice9").hide();
													    	 
													        $scope.releasedData = $scope.data.responseObject.release;
													        console.log($scope.bookedData);
													        
													    } else {
													    	//alert("Error while getting data");
													    	console.log("error")
													       
													    }
													}, function (errResponse) {
													   console.error('Error while fetching notes');    
													});   
													}; 
													
													
													$scope.getTotalHoldData = function(details){
														console.log(details);
														var obj = {
																vendor_id: details.vendor,
																invoiceid: details.id
														}
														console.log(obj);
														$http.post('/erp/finance/getTotalHoldData',obj).then(function (response) {
														    $scope.data = response.data;
														    if ($scope.data.successful) {
														    	 $("#invoice1").hide();	  
																 $("#invoice2").hide();
																 $("#invoice3").hide();
																 $("#invoice4").hide();
																 $("#invoice5").hide();   
																 $("#invoice6").hide();
																 $("#invoice7").hide();   
																 $("#invoice8").show();
																 $("#invoice9").hide();
														    	 
														        $scope.holdData = $scope.data.responseObject.hold;
														        console.log($scope.holdData);
														        
														    } else {
														    	//alert("Error while getting data");
														    	console.log("error")
														       
														    }
														}, function (errResponse) {
														   console.error('Error while fetching notes');    
														});   
														};
						
														
														$scope.getTotalReturnedData = function(details){
															console.log(details);
															var obj = {
																	vendor_id: details.vendor,
																	invoiceid: details.id
															}
															console.log(obj);
															$http.post('/erp/finance/getTotalReturnedData',obj).then(function (response) {
															    $scope.data = response.data;
															    if ($scope.data.successful) {
															    	 $("#invoice1").hide();	  
																	 $("#invoice2").hide();
																	 $("#invoice3").hide();
																	 $("#invoice4").hide();
																	 $("#invoice5").hide();   
																	 $("#invoice6").hide();
																	 $("#invoice7").hide();   
																	 $("#invoice8").hide();
																	 $("#invoice9").show();
															    	 
															        $scope.returnedData = $scope.data.responseObject.returned;
															        console.log($scope.holdData);
															        
															    } else {
															    	//alert("Error while getting data");
															    	console.log("error")
															       
															    }
															}, function (errResponse) {
															   console.error('Error while fetching notes');    
															});   
															};
							
															
												/*WORK ORDER*/
															
															
															var totalworkorderreportingcount;
															var totalworkordercfocount;
															var totalworkorderceocount;
															var totalworkorderapprovedcount;
															var totalworkorderholdcount;
															var totalworkorderreturnedcount;
															
															$scope.getWorkorderStatusReport = function(details){
																console.log(details);
																
																var obj = {      
																		vendor_id: details.vendor_id,
																		workorderid: details.workorderid
																	   
																	};
																console.log(obj);   
																$http.post('/erp/finance/getWorkorderStatusReport',obj).then(function (response) {
																    $scope.data = response.data;
																    if ($scope.data.successful) {
																        $scope.workordercount = $scope.data.responseObject.count1;
																        $scope.workorderreportingcount = $scope.data.responseObject.report1;
																        totalworkorderreportingcount = $scope.workorderreportingcount.length;
																        $scope.cfoworkordercount = $scope.data.responseObject.cfo1;
																        totalworkordercfocount = $scope.cfoworkordercount.length;
																        $scope.workorderceocount = $scope.data.responseObject.ceo1;
																        totalworkorderceocount = $scope.workorderceocount.length;
																        $scope.workorderapprovedcount = $scope.data.responseObject.approved1;
																        totalworkorderapprovedcount = $scope.workorderapprovedcount.length;
																        $scope.workorderholdcount = $scope.data.responseObject.hold1;
																        totalworkorderholdcount = $scope.workorderholdcount.length;
																        $scope.workorderreturnedcount = $scope.data.responseObject.returned1;
																        totalworkorderreturnedcount = $scope.workorderreturnedcount.length;
																        console.log($scope.workordercount);
																        console.log($scope.workorderreportingcount);
																        console.log($scope.cfoworkordercount);
																        console.log($scope.workorderceocount);
																        console.log($scope.workorderapprovedcount);
																        console.log($scope.workorderholdcount);
																        console.log($scope.workorderreturnedcount);
																    } else {
															   
																    	console.log("error")
																       
																    }
																}, function (errResponse) {
																   console.error('Error while fetching notes');    
																});   
																}; 
																	
																
																$scope.getWorkorderTotalData = function(details1){
																	console.log(details1);
																	var obj = {
																			vendor_id: details1.vendor,
																			workorderid: details1.id
																	}
																	console.log(obj);
																	$http.post('/erp/finance/getWorkorderTotalData',obj).then(function (response) {
																	    $scope.data = response.data;
																	    if ($scope.data.successful) {
																	    	 $("#workorder1").show();	  
																			 $("#workorder2").hide();
																			 $("#workorder3").hide();
																			 $("#workorder4").hide();
																			 $("#workorder5").hide();   
																			 $("#workorder6").hide();
																			 $("#workorder7").hide();   
																			
																	        $scope.totalworkorders = $scope.data.responseObject.totalworkorder1;
																	        console.log($scope.totalworkorders);
																	        
																	    } else {
																	    	//alert("Error while getting data");
																	    	console.log("error")
																	       
																	    }
																	}, function (errResponse) {
																	   console.error('Error while fetching notes');    
																	});   
																	}; 
																	
																	$scope.getTotalWorkorderReportingData = function(details1){
																		console.log(details1);
																		var obj = {
																				vendor_id: details1.vendor,
																				workorderid: details1.id
																		}
																		console.log(obj);
																		$http.post('/erp/finance/getTotalWorkorderReportingData',obj).then(function (response) {
																		    $scope.data = response.data;
																		    if ($scope.data.successful) {
																		    	 $("#workorder1").hide();	  
																				 $("#workorder2").show();
																				 $("#workorder3").hide();
																				 $("#workorder4").hide();
																				 $("#workorder5").hide();   
																				 $("#workorder6").hide();
																				 $("#workorder7").hide();   
																				
																		        $scope.workorderreporting = $scope.data.responseObject.totalreport1;
																		        console.log($scope.workorderreporting);
																		        
																		    } else {
																		    	//alert("Error while getting data");
																		    	console.log("error")
																		       
																		    }
																		}, function (errResponse) {
																		   console.error('Error while fetching notes');    
																		});   
																		};  
																		
																		
																		
																		$scope.getTotalworkorderPendingData = function(details1){
																			console.log(details1);
																			var obj = {
																					vendor_id: details1.vendor,
																					workorderid: details1.id
																			}
																			console.log(obj);
																			$http.post('/erp/finance/getTotalworkorderPendingData',obj).then(function (response) {
																			    $scope.data = response.data;
																			    if ($scope.data.successful) {
																			    	 $("#workorder1").hide();	  
																					 $("#workorder2").hide();
																					 $("#workorder3").show();
																					 $("#workorder4").hide();
																					 $("#workorder5").hide();   
																					 $("#workorder6").hide();
																					 $("#workorder7").hide();   
																					
																			        $scope.workordercfo = $scope.data.responseObject.totalcfo1;
																			        console.log($scope.workordercfo);
																			        
																			    } else {
																			    	//alert("Error while getting data");
																			    	console.log("error")
																			       
																			    }
																			}, function (errResponse) {
																			   console.error('Error while fetching notes');    
																			});   
																			}; 
																			
																			$scope.getTotalWorkorderCEOData = function(details1){
																				console.log(details1);
																				var obj = {
																						vendor_id: details1.vendor,
																						workorderid: details1.id
																				}
																				console.log(obj);
																				$http.post('/erp/finance/getTotalWorkorderCEOData',obj).then(function (response) {
																				    $scope.data = response.data;
																				    if ($scope.data.successful) {
																				    	 $("#workorder1").hide();	  
																						 $("#workorder2").hide();
																						 $("#workorder3").hide();
																						 $("#workorder4").show();
																						 $("#workorder5").hide();   
																						 $("#workorder6").hide();
																						 $("#workorder7").hide();   
																						
																				        $scope.workorderceo = $scope.data.responseObject.totalceo1;
																				        console.log($scope.workorderceo);
																				        
																				    } else {
																				    	//alert("Error while getting data");
																				    	console.log("error")
																				       
																				    }
																				}, function (errResponse) {
																				   console.error('Error while fetching notes');    
																				});   
																				}; 
																				
																				$scope.getTotalApprovedData = function(details1){
																					console.log(details1);
																					var obj = {
																							vendor_id: details1.vendor,
																							workorderid: details1.id
																					}
																					console.log(obj);
																					$http.post('/erp/finance/getTotalApprovedData',obj).then(function (response) {
																					    $scope.data = response.data;
																					    if ($scope.data.successful) {
																					    	 $("#workorder1").hide();	  
																							 $("#workorder2").hide();
																							 $("#workorder3").hide();
																							 $("#workorder4").hide();
																							 $("#workorder5").show();   
																							 $("#workorder6").hide();
																							 $("#workorder7").hide();   
																							
																					        $scope.workorderapproved = $scope.data.responseObject.totalapproved1;
																					        console.log($scope.workorderapproved);
																					        
																					    } else {
																					    	//alert("Error while getting data");
																					    	console.log("error")
																					       
																					    }
																					}, function (errResponse) {
																					   console.error('Error while fetching notes');    
																					});   
																					}; 
																		
																	
																					$scope.getTotalWorkorderHoldData = function(details1){
																						console.log(details1);
																						var obj = {
																								vendor_id: details1.vendor,
																								workorderid: details1.id
																						}
																						console.log(obj);
																						$http.post('/erp/finance/getTotalWorkorderHoldData',obj).then(function (response) {
																						    $scope.data = response.data;
																						    if ($scope.data.successful) {
																						    	 $("#workorder1").hide();	  
																								 $("#workorder2").hide();
																								 $("#workorder3").hide();
																								 $("#workorder4").hide();
																								 $("#workorder5").hide();   
																								 $("#workorder6").show();
																								 $("#workorder7").hide();   
																								
																						        $scope.workorderhold = $scope.data.responseObject.totalhold1;
																						        console.log($scope.workorderhold);
																						        
																						    } else {
																						    	//alert("Error while getting data");
																						    	console.log("error")
																						       
																						    }
																						}, function (errResponse) {
																						   console.error('Error while fetching notes');    
																						});   
																						}; 
																			
																						
																						$scope.getTotalWorkorderReturnedData = function(details1){
																							console.log(details1);
																							var obj = {
																									vendor_id: details1.vendor,
																									workorderid: details1.id
																							}
																							console.log(obj);
																							$http.post('/erp/finance/getTotalWorkorderReturnedData',obj).then(function (response) {
																							    $scope.data = response.data;
																							    if ($scope.data.successful) {
																							    	 $("#workorder1").hide();	  
																									 $("#workorder2").hide();
																									 $("#workorder3").hide();
																									 $("#workorder4").hide();  
																									 $("#workorder5").hide();   
																									 $("#workorder6").hide();
																									 $("#workorder7").show();   
																									
																							        $scope.workorderreturned = $scope.data.responseObject.totalreturned1;
																							        console.log($scope.workorderreturned);
																							        
																							    } else {
																							    	//alert("Error while getting data");
																							    	console.log("error")
																							       
																							    }
																							}, function (errResponse) {
																							   console.error('Error while fetching notes');    
																							});   
																							}; 
				
																							
																							/*PURCHASE ORDER*/
																							
																							
																							var totalpurchaseorderreportingcount;
																							var totalpurchaseordercfocount;
																							var totalpurchaseorderceocount;
																							var totalpurchaseorderapprovedcount;
																							var totalpurchaseorderholdcount;
																							var totalpurchaseorderreturnedcount;
																							
																							$scope.getPurchaseorderStatusReport = function(details){
																								console.log(details);
																								
																								var obj = {      
																										vendor_id: details.vendor_id,
																										purchaseorderid: details.purchaseorderid
																									   
																									};
																								console.log(obj);   
																								$http.post('/erp/finance/getPurchaseorderStatusReport',obj).then(function (response) {
																								    $scope.data = response.data;
																								    if ($scope.data.successful) {
																								        $scope.purchaseordercount = $scope.data.responseObject.count2;
																								        $scope.purchaseorderreportingcount = $scope.data.responseObject.report2;
																								        totalpurchaseorderreportingcount = $scope.purchaseorderreportingcount.length;
																								        $scope.cfopurchaseordercount = $scope.data.responseObject.cfo2;
																								        totalpurchaseordercfocount = $scope.cfopurchaseordercount.length;
																								        $scope.purchaseorderceocount = $scope.data.responseObject.ceo2;
																								        totalpurchaseorderceocount = $scope.purchaseorderceocount.length;
																								        $scope.purchaseorderapprovedcount = $scope.data.responseObject.approved2;
																								        totalpurchaseorderapprovedcount = $scope.purchaseorderapprovedcount.length;
																								        $scope.purchaseorderholdcount = $scope.data.responseObject.hold2;
																								        totalpurchaseorderholdcount = $scope.purchaseorderholdcount.length;
																								        $scope.purchaseorderreturnedcount = $scope.data.responseObject.returned2;
																								        totalpurchaseorderreturnedcount = $scope.purchaseorderreturnedcount.length;
																								        console.log($scope.purchaseordercount);
																								        console.log($scope.purchaseorderreportingcount);
																								        console.log($scope.cfopurchaseordercount);
																								        console.log($scope.purchaseorderceocount);
																								        console.log($scope.purchaseorderapprovedcount);
																								        console.log($scope.purchaseorderholdcount);
																								        console.log($scope.purchaseorderreturnedcount);
																								    } else {
																							   
																								    	console.log("error")
																								       
																								    }
																								}, function (errResponse) {
																								   console.error('Error while fetching notes');    
																								});   
																								}; 
																									
																								
																								$scope.getPurchaseorderTotalData = function(details1){
																									console.log(details1);
																									var obj = {
																											vendor_id: details1.vendor,     
																											purchaseorderid: details1.id
																									}
																									console.log(obj);
																									$http.post('/erp/finance/getPurchaseorderTotalData',obj).then(function (response) {
																									    $scope.data = response.data;
																									    if ($scope.data.successful) {
																									    	 $("#purchaseorder1").show();	  
																											 $("#purchaseorder2").hide();
																											 $("#purchaseorder3").hide();
																											 $("#purchaseorder4").hide();
																											 $("#purchaseorder5").hide();   
																											 $("#purchaseorder6").hide();
																											 $("#purchaseorder7").hide();   
																											
																									        $scope.totalpurchaseorders = $scope.data.responseObject.totalpurchaseorder2;
																									        console.log($scope.totalpurchaseorders);
																									        
																									    } else {
																									    	//alert("Error while getting data");
																									    	console.log("error")
																									       
																									    }
																									}, function (errResponse) {
																									   console.error('Error while fetching notes');    
																									});   
																									}; 
																									
																									$scope.getTotalPurchaseorderReportingData = function(details1){
																										console.log(details1);
																										var obj = {
																												vendor_id: details1.vendor,
																												purchaseorderid: details1.id
																										}
																										console.log(obj);
																										$http.post('/erp/finance/getTotalPurchaseorderReportingData',obj).then(function (response) {
																										    $scope.data = response.data;
																										    if ($scope.data.successful) {
																										    	 $("#purchaseorder1").hide();	  
																												 $("#purchaseorder2").show();
																												 $("#purchaseorder3").hide();
																												 $("#purchaseorder4").hide();
																												 $("#purchaseorder5").hide();   
																												 $("#purchaseorder6").hide();
																												 $("#purchaseorder7").hide();   
																												
																										        $scope.purchaseorderreporting = $scope.data.responseObject.totalreport2;
																										        console.log($scope.purchaseorderreporting);
																										        
																										    } else {
																										    	//alert("Error while getting data");
																										    	console.log("error")
																										       
																										    }
																										}, function (errResponse) {
																										   console.error('Error while fetching notes');    
																										});   
																										};  
																										
																										
																										
																										$scope.getTotalpurchaseorderPendingData = function(details1){
																											console.log(details1);
																											var obj = {
																													vendor_id: details1.vendor,
																													purchaseorderid: details1.id
																											}
																											console.log(obj);
																											$http.post('/erp/finance/getTotalpurchaseorderPendingData',obj).then(function (response) {
																											    $scope.data = response.data;
																											    if ($scope.data.successful) {
																											    	 $("#purchaseorder1").hide();	  
																													 $("#purchaseorder2").hide();
																													 $("#purchaseorder3").show();
																													 $("#purchaseorder4").hide();
																													 $("#purchaseorder5").hide();   
																													 $("#purchaseorder6").hide();
																													 $("#purchaseorder7").hide();   
																													
																											        $scope.purchaseordercfo = $scope.data.responseObject.totalcfo2;
																											        console.log($scope.purchaseordercfo);
																											        
																											    } else {
																											    	//alert("Error while getting data");
																											    	console.log("error")
																											       
																											    }
																											}, function (errResponse) {
																											   console.error('Error while fetching notes');    
																											});   
																											}; 
																											
																											$scope.getTotalPurchaseorderCEOData = function(details1){
																												console.log(details1);
																												var obj = {
																														vendor_id: details1.vendor,
																														purchaseorderid: details1.id
																												}
																												console.log(obj);
																												$http.post('/erp/finance/getTotalPurchaseorderCEOData',obj).then(function (response) {
																												    $scope.data = response.data;
																												    if ($scope.data.successful) {
																												    	 $("#purchaseorder1").hide();	  
																														 $("#purchaseorder2").hide();
																														 $("#purchaseorder3").hide();
																														 $("#purchaseorder4").show();
																														 $("#purchaseorder5").hide();   
																														 $("#purchaseorder6").hide();
																														 $("#purchaseorder7").hide();   
																														
																												        $scope.purchaseorderceo = $scope.data.responseObject.totalceo2;
																												        console.log($scope.purchaseorderceo);
																												        
																												    } else {
																												    	//alert("Error while getting data");
																												    	console.log("error")
																												       
																												    }
																												}, function (errResponse) {
																												   console.error('Error while fetching notes');    
																												});   
																												}; 
																												
																												$scope.getTotalPurchaseApprovedData = function(details1){
																													console.log(details1);
																													var obj = {
																															vendor_id: details1.vendor,
																															purchaseorderid: details1.id
																													}
																													console.log(obj);
																													$http.post('/erp/finance/getTotalPurchaseApprovedData',obj).then(function (response) {
																													    $scope.data = response.data;
																													    if ($scope.data.successful) {
																													    	 $("#purchaseorder1").hide();	  
																															 $("#purchaseorder2").hide();
																															 $("#purchaseorder3").hide();
																															 $("#purchaseorder4").hide();
																															 $("#purchaseorder5").show();   
																															 $("#purchaseorder6").hide();
																															 $("#purchaseorder7").hide();   
																															
																													        $scope.purchaseorderapproved = $scope.data.responseObject.totalapproved2;
																													        console.log($scope.purchaseorderapproved);
																													        
																													    } else {
																													    	//alert("Error while getting data");
																													    	console.log("error")
																													       
																													    }
																													}, function (errResponse) {
																													   console.error('Error while fetching notes');    
																													});   
																													}; 
																										
																									
																													$scope.getTotalPurchaseorderHoldData = function(details1){
																														console.log(details1);
																														var obj = {
																																vendor_id: details1.vendor,
																																purchaseorderid: details1.id
																														}
																														console.log(obj);
																														$http.post('/erp/finance/getTotalPurchaseorderHoldData',obj).then(function (response) {
																														    $scope.data = response.data;
																														    if ($scope.data.successful) {
																														    	 $("#purchaseorder1").hide();	  
																																 $("#purchaseorder2").hide();
																																 $("#purchaseorder3").hide();
																																 $("#purchaseorder4").hide();
																																 $("#purchaseorder5").hide();   
																																 $("#purchaseorder6").show();
																																 $("#purchaseorder7").hide();   
																																
																														        $scope.purchaseorderhold = $scope.data.responseObject.totalhold2;
																														        console.log($scope.purchaseorderhold);
																														        
																														    } else {
																														    	//alert("Error while getting data");
																														    	console.log("error")
																														       
																														    }
																														}, function (errResponse) {
																														   console.error('Error while fetching notes');    
																														});   
																														}; 
																											
																														
																														$scope.getTotalPurchaseorderReturnedData = function(details1){
																															console.log(details1);
																															var obj = {
																																	vendor_id: details1.vendor,
																																	purchaseorderid: details1.id
																															}
																															console.log(obj);
																															$http.post('/erp/finance/getTotalPurchaseorderReturnedData',obj).then(function (response) {
																															    $scope.data = response.data;
																															    if ($scope.data.successful) {
																															    	 $("#purchaseorder1").hide();	  
																																	 $("#purchaseorder2").hide();
																																	 $("#purchaseorder3").hide();
																																	 $("#purchaseorder4").hide();  
																																	 $("#purchaseorder5").hide();   
																																	 $("#purchaseorder6").hide();
																																	 $("#purchaseorder7").show();   
																																	
																															        $scope.purchaseorderreturned = $scope.data.responseObject.totalreturned2;
																															        console.log($scope.purchaseorderreturned);
																															        
																															    } else {
																															    	//alert("Error while getting data");
																															    	console.log("error")
																															       
																															    }
																															}, function (errResponse) {
																															   console.error('Error while fetching notes');    
																															});   
																															}; 
																															
																															
																															/*PURCHASE ORDER*/
																															
																														
																															var totalmoureportingcount;
																															var totalmoucfocount;
																															var totalmouceocount;
																															var totalmouapprovedcount;
																															var totalmouholdcount;
																															var totalmoureturnedcount;
																															
																															$scope.getMOUStatusReport = function(details){
																																console.log(details);
																																
																																var obj = {      
																																		vendor_id: details.vendor_id,
																																		mouid: details.mouid
																																	   
																																	};
																																console.log(obj);   
																																$http.post('/erp/finance/getMOUStatusReport',obj).then(function (response) {
																																    $scope.data = response.data;
																																    if ($scope.data.successful) {
																																        $scope.moucount = $scope.data.responseObject.count3;
																																        $scope.moureportingcount = $scope.data.responseObject.report3;
																																        totalmoureportingcount = $scope.moureportingcount.length;
																																        $scope.cfomoucount = $scope.data.responseObject.cfo3;
																																        totalmoucfocount = $scope.cfomoucount.length;
																																        $scope.mouceocount = $scope.data.responseObject.ceo3;
																																        totalmouceocount = $scope.mouceocount.length;
																																        $scope.mouapprovedcount = $scope.data.responseObject.approved3;
																																        totalmouapprovedcount = $scope.mouapprovedcount.length;
																																        $scope.mouholdcount = $scope.data.responseObject.hold3;
																																        totalmouholdcount = $scope.mouholdcount.length;
																																        $scope.moureturnedcount = $scope.data.responseObject.returned3;
																																        totalmoureturnedcount = $scope.moureturnedcount.length;
																																        console.log($scope.moucount);
																																        console.log($scope.moureportingcount);
																																        console.log($scope.cfomoucount);
																																        console.log($scope.mouceocount);
																																        console.log($scope.mouapprovedcount);
																																        console.log($scope.mouholdcount);
																																        console.log($scope.moureturnedcount);
																																    } else {
																															   
																																    	console.log("error")
																																       
																																    }
																																}, function (errResponse) {
																																   console.error('Error while fetching notes');    
																																});   
																																}; 
																																	
																																
																																$scope.getMOUTotalData = function(details1){
																																	console.log(details1);
																																	var obj = {
																																			vendor_id: details1.vendor,     
																																			mouid: details1.id   
																																	}
																																	console.log(obj);
																																	$http.post('/erp/finance/getMOUTotalData',obj).then(function (response) {
																																	    $scope.data = response.data;
																																	    if ($scope.data.successful) {
																																	    	 $("#mou1").show();	  
																																			 $("#mou2").hide();
																																			 $("#mou3").hide();
																																			 $("#mou4").hide();
																																			 $("#mou5").hide();   
																																			 $("#mou6").hide();
																																			 $("#mou7").hide();   
																																			
																																	        $scope.totalmous = $scope.data.responseObject.totalmou3;
																																	        console.log($scope.totalmous);
																																	        
																																	    } else {
																																	    	//alert("Error while getting data");
																																	    	console.log("error")
																																	       
																																	    }
																																	}, function (errResponse) {
																																	   console.error('Error while fetching notes');    
																																	});   
																																	}; 
																																	
																																	$scope.getTotalMOUReportingData = function(details1){
																																		console.log(details1);
																																		var obj = {
																																				vendor_id: details1.vendor,
																																				mouid: details1.id
																																		}
																																		console.log(obj);
																																		$http.post('/erp/finance/getTotalMOUReportingData',obj).then(function (response) {
																																		    $scope.data = response.data;
																																		    if ($scope.data.successful) {
																																		    	 $("#mou1").hide();	  
																																				 $("#mou2").show();
																																				 $("#mou3").hide();
																																				 $("#mou4").hide();
																																				 $("#mou5").hide();   
																																				 $("#mou6").hide();
																																				 $("#mou7").hide();   
																																				
																																		        $scope.moureporting = $scope.data.responseObject.totalreport3;
																																		        console.log($scope.moureporting);
																																		        
																																		    } else {
																																		    	//alert("Error while getting data");
																																		    	console.log("error")
																																		       
																																		    }
																																		}, function (errResponse) {
																																		   console.error('Error while fetching notes');    
																																		});   
																																		};  
																																		
																																		
																																		
																																		$scope.getTotalMOUPendingData = function(details1){
																																			console.log(details1);
																																			var obj = {
																																					vendor_id: details1.vendor,
																																					mouid: details1.id
																																			}
																																			console.log(obj);
																																			$http.post('/erp/finance/getTotalMOUPendingData',obj).then(function (response) {
																																			    $scope.data = response.data;
																																			    if ($scope.data.successful) {
																																			    	 $("#mou1").hide();	  
																																					 $("#mou2").hide();
																																					 $("#mou3").show();
																																					 $("#mou4").hide();
																																					 $("#mou5").hide();   
																																					 $("#mou6").hide();
																																					 $("#mou7").hide();   
																																					
																																			        $scope.moucfo = $scope.data.responseObject.totalcfo3;
																																			        console.log($scope.moucfo);
																																			        
																																			    } else {
																																			    	//alert("Error while getting data");
																																			    	console.log("error")
																																			       
																																			    }
																																			}, function (errResponse) {
																																			   console.error('Error while fetching notes');    
																																			});   
																																			}; 
																																			
																																			$scope.getTotalMOUCEOData = function(details1){
																																				console.log(details1);
																																				var obj = {
																																						vendor_id: details1.vendor,
																																						mouid: details1.id
																																				}
																																				console.log(obj);
																																				$http.post('/erp/finance/getTotalMOUCEOData',obj).then(function (response) {
																																				    $scope.data = response.data;
																																				    if ($scope.data.successful) {
																																				    	 $("#mou1").hide();	  
																																						 $("#mou2").hide();
																																						 $("#mou3").hide();
																																						 $("#mou4").show();
																																						 $("#mou5").hide();   
																																						 $("#mou6").hide();
																																						 $("#mou7").hide();   
																																						
																																				        $scope.mouceo = $scope.data.responseObject.totalceo3;
																																				        console.log($scope.mouceo);
																																				        
																																				    } else {
																																				    	//alert("Error while getting data");
																																				    	console.log("error")
																																				       
																																				    }
																																				}, function (errResponse) {
																																				   console.error('Error while fetching notes');    
																																				});   
																																				}; 
																																				
																																				$scope.getTotalMOUApprovedData = function(details1){
																																					console.log(details1);
																																					var obj = {
																																							vendor_id: details1.vendor,
																																							mouid: details1.id
																																					}
																																					console.log(obj);
																																					$http.post('/erp/finance/getTotalMOUApprovedData',obj).then(function (response) {
																																					    $scope.data = response.data;
																																					    if ($scope.data.successful) {
																																					    	 $("#mou1").hide();	  
																																							 $("#mou2").hide();
																																							 $("#mou3").hide();
																																							 $("#mou4").hide();
																																							 $("#mou5").show();   
																																							 $("#mou6").hide();
																																							 $("#mou7").hide();   
																																							
																																					        $scope.mouapproved = $scope.data.responseObject.totalapproved3;
																																					        console.log($scope.mouapproved);
																																					        
																																					    } else {
																																					    	//alert("Error while getting data");
																																					    	console.log("error")
																																					       
																																					    }
																																					}, function (errResponse) {
																																					   console.error('Error while fetching notes');    
																																					});   
																																					}; 
																																		
																																	
																																					$scope.getTotalMOUHoldData = function(details1){
																																						console.log(details1);
																																						var obj = {
																																								vendor_id: details1.vendor,
																																								mouid: details1.id
																																						}
																																						console.log(obj);
																																						$http.post('/erp/finance/getTotalMOUHoldData',obj).then(function (response) {
																																						    $scope.data = response.data;
																																						    if ($scope.data.successful) {
																																						    	 $("#mou1").hide();	  
																																								 $("#mou2").hide();
																																								 $("#mou3").hide();
																																								 $("#mou4").hide();
																																								 $("#mou5").hide();      
																																								 $("#mou6").show();
																																								 $("#mou7").hide();   
																																								
																																						        $scope.mouhold = $scope.data.responseObject.totalhold3;
																																						        console.log($scope.mouhold);
																																						        
																																						    } else {
																																						    	//alert("Error while getting data");
																																						    	console.log("error")
																																						       
																																						    }
																																						}, function (errResponse) {
																																						   console.error('Error while fetching notes');    
																																						});   
																																						}; 
																																			
																																						
																																						$scope.getTotalMOUReturnedData = function(details1){
																																							console.log(details1);
																																							var obj = {
																																									vendor_id: details1.vendor,
																																									mouid: details1.id
																																							}
																																							console.log(obj);
																																							$http.post('/erp/finance/getTotalMOUReturnedData',obj).then(function (response) {
																																							    $scope.data = response.data;
																																							    if ($scope.data.successful) {
																																							    	 $("#mou1").hide();	  
																																									 $("#mou2").hide();
																																									 $("#mou3").hide();
																																									 $("#mou4").hide();  
																																									 $("#mou5").hide();   
																																									 $("#mou6").hide();
																																									 $("#mou7").show();   
																																									  
																																							        $scope.moureturned = $scope.data.responseObject.totalreturned3;
																																							        console.log($scope.moureturned);
																																							          
																																							    } else {
																																							    	//alert("Error while getting data");
																																							    	console.log("error")
																																							       
																																							    }
																																							}, function (errResponse) {
																																							   console.error('Error while fetching notes');    
																																							});   
																																							}; 
																				
									
												
	
}]);   