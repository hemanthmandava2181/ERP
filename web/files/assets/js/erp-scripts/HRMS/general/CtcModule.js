var ctc = angular.module('CtcModule', []);

ctc.controller(
				'CtcController',
				[
						'$http',
						'$scope',
						function($http, $scope) {    
						

					$http.get('/erp/calc/getYears').then(
											function(response) {
												$scope.data = response.data;    
												if ($scope.data.successful) {
													$scope.years = $scope.data.responseObject;

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
									.get('/erp/calc/getCaders')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.caders = $scope.data.responseObject;
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
									.get('/erp/calc/getGrades')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.grades = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});
							
							

							var entity;
							var val;
							var payslip;
							$scope.savedetails=function(data){
								var array=[data.payslip_id];
								data.payslip_id=array.join();
								console.log(data.payslip_id);
								
								ERP.setSessionValue("entity",data.entity_type);
								  ERP.setSessionValue("val",data.value);
								  ERP.setSessionValue("payslip",data.payslip_id);
								  if(entity== null)
									  {
									  entity=data.entity_type;
									  }
								  else{
									  entity=entity + " ," + data.entity_type;
								  }
								  if(val== null)
								  {
									  val=data.value;
									  }
								  else{
									  val=val + " ," + data.value;
								  }
								  if (payslip== null)
								  {
									 payslip=data.payslip_id;
									 console.log(payslip);
								  }
								  else{
									  payslip=payslip + " ," + data.payslip_id;
								  }
								     
								  
								  ERP.setSessionValue("entity",entity);
								  ERP.setSessionValue("val",val);	
								  ERP.setSessionValue("payslip",payslip);
								  
								  console.log(payslip);
								
							};
							
							/*var entity;
							var val;
							var payslip;*/
							$scope.saveDeductiondetails=function(data){
								var array=[data.payslip_id];
								data.payslip_id=array.join();
								console.log(data.payslip_id);
								
								ERP.setSessionValue("entity",data.entity_type);
								  ERP.setSessionValue("val",data.value);
								  ERP.setSessionValue("payslip",data.payslip_id);
								  if(entity== null)
									  {
									  entity=data.entity_type;
									  }
								  else{
									  entity=entity + " ," + data.entity_type;
								  }
								  if(val== null)     
								  {
									  val=data.value;
									  }
								  else{
									  val=val + " ," + data.value;
								  }
								  if (payslip== null)
								  {
									 payslip=data.payslip_id;
								  }
								  else{
									  payslip=payslip + " ," + data.payslip_id;
								  }
								        
								  
								  ERP.setSessionValue("entity",entity);
								  ERP.setSessionValue("val",val);	
								  ERP.setSessionValue("payslip",payslip);
								
								
							};
							
							
							 
							
							  $scope.savedata = function(UserData)    
							  { 
								  console.log(UserData);      	
								  
											       
								  
								  var entity=ERP.getSessionValue("entity");
								  var val=ERP.getSessionValue("val");
								  var payslip=ERP.getSessionValue("payslip");
							
								  var details={
										  entity_type : entity,
										  value : val,
										  payslip_id : payslip,	 	      
								  }  
								     
						
								  console.log(details);
								     
							  $http.post('/erp/calc/add', details).then(
							  
							  function(response) 
							  { 
								  $scope.data = response.data; 
								  if($scope.data.successful) 
								  {     
									  
									  
									  alert("User Data Inserted              Successfully"); 
									  } else { 
										  alert("Data not inserted"); 
										  }
							   }, 
							   function(errResponse) {
								   console.error('Error while fetching notes'); 
							  });
							  
							  } 
							
							
							
							
							
							
					

							$http
									.post('/erp/calc/getAll')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.regdetails = $scope.data.responseObject;
												} else {
													alert("Can't view the Data");
												}
											},
											function(errResponse) {
												console
														.error('Error while viewing notes');
											});

							$http
									.post('/erp/ctc/getEarnings')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.Earningdata = $scope.data.responseObject;
													console.log($scope.Earningdata);
												} else {
													alert("Can't view the Data");
												}
											},
											function(errResponse) {
												console
														.error('Error while viewing notes');
											});

							$http
									.post('/erp/ctc/getDeductions')
									.then(
											function(response) {
												$scope.data = response.data;   
												if ($scope.data.successful) {
													$scope.Deductiondata = $scope.data.responseObject;
													console.log($scope.Deductiondata);
												} else {
													alert("Can't view the Data");
												}
											},
											function(errResponse) {
												console
														.error('Error while viewing notes');
											});

					

							$scope.saveCalcdetails = function(userData) {
								console.log(userData);

								$http
										.post('/erp/calc/saveCalcdetails',
												userData)
										.then(

												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {

														alert("User Data Inserted@@@@@@@@@@@@@@@@@@@@@@@@Successfully");
													} else {
														alert("Data not inserted");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});

							}
							
							
							$scope.getById = function(data) {

								/* alert(name); */
								$http
										.post('/erp/calc/getById', data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.data = {object : $scope.data.responseObject.centers};
														$scope.data1 = {object : $scope.data.responseObject.earnings};
														$scope.data2 = {object : $scope.data.responseObject.deductions};
														console.log($scope.data);
														console.log($scope.data1);
														console.log($scope.data2);
														
													} else {
														alert("Error while getting data");
													}    
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

						} ]);

