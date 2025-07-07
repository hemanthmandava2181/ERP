var accountspayable = angular.module('accountspayable', []);
accountspayable.filter('numberFormat', function() {
	return function(input) {
		input = input || 0;
		var out = new Intl.NumberFormat('en-IN').format(parseInt(input));
		return out;
	};
})

accountspayable.filter('sumOfValue', function() {
	return function(data, key) {
		if (angular.isUndefined(data) || angular.isUndefined(key))
			return 0;
		var sum = 0;
		angular.forEach(data, function(v, k) {
			sum = sum + parseInt(v[key]);
		});
		return sum;
	}
})
accountspayable
		.controller(
				'accountsPayableController',
				[
						'$scope',
						'$http',
						function($scope, $http) {
							$scope.invoiceArr = [];
							$scope.InvoiceChecks = [];
							$http
									.get('/erp/finance/getAllPendings')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.pendinginvoicesdata = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							$http
									.get('/erp/finance/getGLAccount')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.glaccounts = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							$http
									.get('/erp/finance/getInvoiceChecks')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.InvoiceChecks = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});
							$http
									.get('/erp/finance/getTaxes')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.taxes = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							$http
									.get('/erp/finance/getCostCenter')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.costcenter = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							$scope.getByPendingDetails = function(voucher_id) {
								console.log("voucher_id:" + voucher_id);

								$http   
										.post(
												'/erp/finance/getByPendingDetails',
												voucher_id)
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

							$scope.getByInvoiceDetails = function() {
								var voucherid = Andromeda
										.getSessionValue("voucher_id");
								console.log(voucherid);

								$http
										.post(
												'/erp/finance/getByInvoiceDetails',
												voucherid)
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
							 * $scope.getByGLAccountDetails = function(){
							 * 
							 * var
							 * voucherid=Andromeda.getSessionValue("voucher_id");
							 * console.log(voucherid);
							 * $http.post('/erp/finance/getByGLAccountDetails',voucherid).then(function
							 * (response) { $scope.data = response.data; if
							 * ($scope.data.successful) { $scope.data =
							 * {object:$scope.data.responseObject}; console.log(
							 * $scope.data); } else { //alert("Error while
							 * getting data"); console.log("error")
							 *  } }, function (errResponse) {
							 * console.error('Error while fetching notes'); }); };
							 */
							/*
							 * $scope.getAppliedTaxes = function(){
							 * 
							 * var
							 * voucherid=Andromeda.getSessionValue("voucher_id");
							 * console.log(voucherid);
							 * $http.post('/erp/finance/getAppliedTaxes',voucherid).then(function
							 * (response) { $scope.data = response.data; if
							 * ($scope.data.successful) { $scope.data =
							 * {object:$scope.data.responseObject}; console.log(
							 * $scope.data); } else { //alert("Error while
							 * getting data"); console.log("error")
							 *  } }, function (errResponse) {
							 * console.error('Error while fetching notes'); }); };
							 */

							$scope.getTaxDetails = function(voucher_id) {
								console.log(voucher_id)
								$http
										.post('/erp/finance/getTaxDetails',
												voucher_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.taxDetails = $scope.data.responseObject;
														console
																.log($scope.taxDetails);
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

							$scope.getPaymentDetails = function(voucher_id) {
								console.log(voucher_id)
								$http
										.post('/erp/finance/getPaymentDetails',
												voucher_id)
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

							$scope.getItemDetails = function(voucher_id) {
								console.log(voucher_id)
								$http
										.post('/erp/finance/getItemDetails',
												voucher_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.items = $scope.data.responseObject;
														console
																.log($scope.items);
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

							$scope.getJVDetails = function(voucher_id) {
								console.log(voucher_id)
								$http
										.post('/erp/finance/getJVDetails',
												voucher_id)
										.then(
												function(response) {
													var sum = 0;
													$scope.data1 = response.data;
													if ($scope.data1.successful) {
														$scope.jvview1 = $scope.data1.responseObject.account;
														$scope.jvview2 = $scope.data1.responseObject.tax;
														$scope.jvview3 = $scope.data1.responseObject.vendor;

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

							$scope.getDocumentDetails = function(voucher_id) {
								console.log(voucher_id)
								$http
										.post(
												'/erp/finance/getDocumentDetails',
												voucher_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.documents = $scope.data.responseObject;
														console
																.log($scope.documents);
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

							$scope.getCommentDetails = function(voucher_id) {
								console.log(voucher_id)
								$http
										.post('/erp/finance/getCommentDetails',
												voucher_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.comments = $scope.data.responseObject;
														console
																.log($scope.comments);
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

							$scope.getTimelineDetails = function(voucher_id) {
								console.log(voucher_id)
								$http
										.post(
												'/erp/finance/getTimelineDetails',
												voucher_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.timeline = $scope.data.responseObject;
														console
																.log($scope.timeline);
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

							$scope.getPreviousInvoiceDetails = function(
									workorder) {
								console.log(workorder)
								$http
										.post(
												'/erp/finance/getPreviousInvoiceDetails',
												workorder)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.previousDetails = $scope.data.responseObject;
														console
																.log($scope.previousDetails);
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

							$scope.saveComments = function(data) {
								console.log(data);
								$http.post('/erp/finance/saveComments', data)
										.then(function(response) {

											$scope.data1 = response.data;

											if ($scope.data1.successful) {

												swal({
													title : "Success!",

													type : "success"
												}, function() {

												});
    
											}
										});

							}

							$scope.saveChecks = function(invoiceArr) {

								console.log(invoiceArr);

								if (invoiceArr != null) {
									var Obj = [];

									for ( var i in invoiceArr) {
										if (invoiceArr[i] == true) {

											var obj = {

												"check_id" : i,

											};
											console.log(obj);
											$http
													.post(
															'/erp/finance/saveChecks',
															obj)
													.then(
															function(response) {

																$scope.data1 = response.data;

																if ($scope.data1.successful) {
																	$scope.invoiceArr = [];
																	console
																			.log("successssss");
																}

															});

										}
									}
									swal(
											{
												title : "Success!",
												text : "Check list Saved successfully!",
												type : "success"
											}, function() {
												
											});

								}

							};
							$scope.updateAccountPayableData = function(Data) {
								$http
										.post(
												'/erp/finance/updateAccountPayableData',
												Data)
										.then(
												function(response) {

													$scope.data = response.data;
													if ($scope.data.successful) {

														alert("Details Updated Successfully");
														$("#myModal").hide();
														$('.modal-backdrop')
																.remove();

													} else {
														alert("Data not updated");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												})
							};
							

} ]);
