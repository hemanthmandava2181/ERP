var employee = angular.module('bookedinvoices', []);
employee.controller('bookedinvoiceController',['$scope','$http',function($scope,$http)
	{
	
	/* getting all booked invoices to table */
	$http.get('/erp/finance/getallbookedinvoicesData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.bookedDetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting data in view page */
	$scope.getJouranlentrydata=function(voucher_id){      
		console.log(voucher_id);
	 $http.post('/erp/finance/getJouranlentrydata',voucher_id).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			/* $("#mainpage").hide();
				$("#bookedinvoicesview").show();
				$("#releasepayementpage").hide();*/
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);
			 console.log("Successful");
			 	
		 } else {    
			 //alert("Error while getting data");
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');         
	 });   
	}
	
	/* getting release payment page details */
	$scope.getpaymentdetails = function(paymentdetails){
		console.log(paymentdetails.voucher_number);
		$http.post('/erp/finance/getpaymentdetails', paymentdetails).then(
		function(response) {
			$scope.data = response.data;    
			if ($scope.data.successful) {
				/*$("#mainpage").hide();
				$("#bookedinvoicesview").hide();   
				$("#releasepayementpage").show();  */   
				$scope.data={object:$scope.data.responseObject};
				
			} else {
				alert("Error while getting data");
			}
		}, function(errResponse) {
			console.error('Error while fetching notes');
		});
	};
	
	/* releasing payment to vendor */
	$scope.Releasepaymenttovendor = function(PaymentData) {	
		console.log(PaymentData);
		$http.post('/erp/finance/Releasepaymenttovendor',PaymentData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Payment Released Successfully");
						ERP.showBookedInvoices();
					} else {  
						alert("Data not inserted");    
					}      
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
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
			
			/* getting bank account names in drop down */
			$http.get('/erp/finance/getBankaccountnames').then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.banks = $scope.data.responseObject;
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
			
			/* getting all partially paid invoices to table */
			$http.get('/erp/finance/getallpartiallypaidinvoices').then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{   
					$scope.partiallypaidDetails = $scope.data.responseObject;
				}
				else
				{
					console.log("Client error while getting data");  
				}
			});
			
			/* getting details in multiple payment page */
			$scope.payInvoiceArr = [];
			$scope.bookedDetails = [];
			$scope.filteredResult = [];  
			
			$scope.getpaymenttabledetails=function(bookedDetails,payInvoiceArr){      
				console.log(bookedDetails);
				console.log(payInvoiceArr);
				
				if(payInvoiceArr != null)
				{
					var Obj = [];
					
					for(var i in payInvoiceArr)
						{     
							if(payInvoiceArr[i] == true)
								{
									for(var k = 0; k< $scope.bookedDetails.length; k++)   
										{   
											if($scope.bookedDetails[k]['voucher_id'] == i)
												{
													var voucher_id = $scope.bookedDetails[k]['name'];
													$http.post('/erp/finance/getpaymenttabledetails',voucher_id).then(function (response) {
														 $scope.data = response.data;
														 if ($scope.data.successful) {
															 $scope.data = {object:$scope.data.responseObject};
															 console.log($scope.data);
															 console.log("Successful");
														 } else {    
															 //alert("Error while getting data");
															 console.log("error") 
														 }
													 }, function (errResponse) {
														 console.error('Error while fetching notes');         
													 }); 
													
												}
										}
								}
						}
				}
			}
			
			
		/* get partial payment details */
			$scope.getPartialpaydet = function(voucher_number){
				console.log(voucher_number);
				$http.post('/erp/finance/getPartialpaydet', voucher_number).then(
				function(response) {
					$scope.data = response.data;    
					if ($scope.data.successful) { 
						$scope.data={object:$scope.data.responseObject};
						
					} else {
						alert("Error while getting data");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			};
		
	
		
}]);