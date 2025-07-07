var employee = angular.module('AccountspayablePendingView', []);
employee.controller('AccountsPayableController',['$scope','$http',function($scope,$http)
	{   
	
	 $http.post('/erp/finance/getByPendingDetailsdata',ERP.getSessionValue("voucher_id")).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);
			 console.log("Successful");  
			 $http.post('/erp/finance/getTaxDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.taxDetails = $scope.data.responseObject;
					console.log($scope.taxDetails);
				} else {
					console.log("error");     
				}
			}, function (errResponse) {
				console.error('Error while fetching notes');    
			});
		 } else {    
			 //alert("Error while getting data");
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');         
	 });	
	 
	 $http.post('/erp/finance/getDocumentDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
				$scope.documents = $scope.data.responseObject;
				console.log($scope.documents);
				$http.post('/erp/finance/getCommentDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.comments = $scope.data.responseObject;
						console.log($scope.comments);
					} else {
						//alert("Error while getting data");
						console.log("error")
	     
					}
				}, function (errResponse) {
					console.error('Error while fetching notes');    
				});  
			} else {
				//alert("Error while getting data");
				console.log("error")

			}
		}, function (errResponse) {
			console.error('Error while fetching notes');    
	});
	 
	 $http.post('/erp/finance/getTimelineDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
				$scope.timeline = $scope.data.responseObject;
				console.log($scope.timeline);
				$http.post('/erp/finance/getItemDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.items = $scope.data.responseObject;
						console.log($scope.items);
					} else {
						//alert("Error while getting data");
						console.log("error")
	     
					}
				}, function (errResponse) {
					console.error('Error while fetching notes');    
				});  
			} else {
				//alert("Error while getting data");
				console.log("error")

			}
		}, function (errResponse) {
			console.error('Error while fetching notes');    
		}); 
	 
	 $http.post('/erp/finance/getPaymentDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
				$scope.data = {object:$scope.data.responseObject};
				console.log( $scope.data);
				$http.post('/erp/finance/getJVDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
					var sum = 0;
					$scope.data1 = response.data;   
					if ($scope.data1.successful) {
						$scope.jvview1 = $scope.data1.responseObject.account;
						$scope.jvview2 = $scope.data1.responseObject.tax;
						$scope.jvview3 = $scope.data1.responseObject.vendor;
	     
					} else {
						//alert("Error while getting data");
						console.log("error")
	    
					}
				}, function (errResponse) {
					console.error('Error while fetching notes');    
				});  
			} else {
				//alert("Error while getting data");
				console.log("error")

			}
		}, function (errResponse) {
			console.error('Error while fetching notes');    
		});  
	 
	 $http.post('/erp/finance/getJournalEntryDetails',ERP.getSessionValue("voucher_id")).then(function (response) {
		   $scope.data = response.data;
		   if ($scope.data.successful) {
		       $scope.journalentrydata = $scope.data.responseObject;
		       console.log($scope.journalentrydata);
		   } else {
		    //alert("Error while getting data");
		    console.log("error")
		     
		   }
		}, function (errResponse) {
		  console.error('Error while fetching notes');    
		}); 
	 
	/* Approve button page js */
	 $scope.SaveApprovalDetails = function(voucher_id) {	
			console.log(voucher_id);
			ERP.setSessionValue("voucher_id", voucher_id);
			ERP.showAccountsPayableApprovebtn();
			/*$http.post('/erp/finance/SaveApprovalDetails',voucher_id).then(  
					function(response) {    
						$scope.data = response.data;           
						if ($scope.data.successful) {
//							swal("Budget Created Successfully");
//							ERP.showBudgetInputPage();
						} else {
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});*/
			}; 
			
			/* Edit button page js */
			$scope.getByInvoiceDetails = function(voucher_id) {	
				console.log(voucher_id);
				ERP.setSessionValue("voucher_id", voucher_id);
				ERP.showAccountsPayableeditbtn();
				/*$http.post('/erp/finance/getByInvoiceDetails',voucher_id).then(  
						function(response) {    
							$scope.data = response.data;           
							if ($scope.data.successful) {
//								swal("Budget Created Successfully");
//								ERP.showBudgetInputPage();
							} else {
								alert("Data not inserted");    
							}   
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});*/
				}; 
				
		/* park button page js */
		$scope.saveParkDetails = function(voucher_id) {	
			console.log(voucher_id);
			ERP.setSessionValue("voucher_id", voucher_id);
			ERP.showAccountsPayableParkbtn();
			/*$http.post('/erp/finance/saveParkDetails',voucher_id).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Budget Created Successfully");
						ERP.showBudgetInputPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});*/
			}; 
			
			/* park button page js */
			$scope.getworkOrderDetails = function(voucher_id) {	
				console.log(voucher_id);
				ERP.setSessionValue("voucher_id", voucher_id);
				ERP.showAccountsPayableWObtn();
				/*$http.post('/erp/finance/getworkOrderDetails',voucher_id).then(  
					function(response) {    
						$scope.data = response.data;           
						if ($scope.data.successful) {
							swal("Budget Created Successfully");
							ERP.showBudgetInputPage();
						} else {
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});*/
				}; 
	
			$scope.getJVDetails = function(voucher_id){
				console.log(voucher_id)
				$http.post('/erp/finance/getJVDetails',voucher_id).then(function (response) {
					var sum = 0;
					$scope.data1 = response.data;          
					if ($scope.data1.successful) {
						$scope.jvview1 = $scope.data1.responseObject.account;
						$scope.jvview2 = $scope.data1.responseObject.tax;
						$scope.jvview3 = $scope.data1.responseObject.vendor;
	     
					} else {
						//alert("Error while getting data");
						console.log("error")
	    
					}
				}, function (errResponse) {
					console.error('Error while fetching notes');    
				});  
			};
	 
	 
	
}]);