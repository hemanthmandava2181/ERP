var Grn = angular.module('CreateGrn', []);
Grn
		.controller(
				'CreateGrnController',
				[
						'$scope',
						'$http',
						function($scope, $http) {
							$http
									.get('/erp/purchase/getPOID')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.details = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
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
							$http.get('/erp/operation/getDistricts').then(function(response) 
							{
								$scope.data = response.data;
								if ($scope.data.successful) 
								{
									$scope.districts = $scope.data.responseObject;
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
							$http
									.get('/erp/vendorservice/getAll4')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.vendors = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											}); 

							$scope.getPODetails = function(data) {
								console.log(data);
								$http.post('/erp/grn/getPODetails', data).then(function(response) 
								{
									$scope.data = response.data;  
									console.log($scope.data);
									if ($scope.data.successful) 
									{
										$scope.data = $scope.data.responseObject;
										console.log($scope.need_by_date);
										data.need_by_date = $scope.data[0].need_by_date,
										data.order_date = $scope.data[0].order_date,
										console.log(data.order_by_date);
										data.vendorname = $scope.data[0].vendorname
										console.log(data.vendorname);
										$scope.data = {
															object : data
														};

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

							$scope.addgrnid = function(data) {
								console.log(data);
								$http
										.post('/erp/grn/addgrnid', data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														location.reload();
														alert(" Inserted Successfully");
													} else {
														alert("Data not inserted");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getDraftgrn = function(totalObj) 
							{
								$http.post('/erp/grn/getDraftgrn',totalObj.po_id).then(function(response) 
								{
									console.log(totalObj.po_id);
									$scope.data = response.data;
									if ($scope.data.successful) 
									{
										$scope.draftgrns = $scope.data.responseObject;
										$scope.data = {
														object : totalObj
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
							}

							
							/*$http.get('/erp/grn/getAlllineitems').then(function(response) {
												$scope.data = response.data;
												if ($scope.data.successful)
												{
													$scope.lineitemdetails = $scope.data.responseObject;
												} 
												else
												{
													console.log("Client error while getting data");
												}
											},
											function(response) {
												console.log("Server error while getting data");
											});*/  
							$http
									.get('/erp/grn/getGrnIDs')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.grndetails = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							// Get Data from Database based on group_name

							$scope.lineitems = function(grn_id) {
								alert(grn_id);
								$http
										.post('/erp/grn/getByIdlineitems',
												grn_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.data = {
															object : $scope.data.responseObject
														};
													} else {
														alert("Error while getting data");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							
							
							$scope.Getpoiddata = function()
							{
								var purchaseorderid = ERP.getSessionValue("purchaseorder_id");
								console.log(purchaseorderid);   
							    $http.post('/erp/grn/Getpoiddata',purchaseorder_id).then(function(response) 
							{
								$scope.data = response.data;
								if ($scope.data.successful) 
								{
									$scope.data = {object:$scope.data.responseObject};
								}
								else
								{
									alert("Error while getting data");
								}
							},function(errResponse)
							{
								console.log("Client error while getting data");
										
							});
						};
						
						
						
						
						
						
						$scope.getLineItemDetails = function(purchaseorder_id){
							/*alert(purchaseorder_id);   */ 
							console.log(purchaseorder_id);
							$http.post('/erp/grn/getLineItemDetails',purchaseorder_id).then(
							function(response) {  
							$scope.data = response.data;
							if ($scope.data.successful) {   
							$scope.lineitemdetails={object:$scope.data.responseObject};
							} else {
							alert("Error while getting data");
							}
							}, function(errResponse) {
							console.error('Error while fetching notes');
							});
							};

						
						
						
						
						
						} ]);