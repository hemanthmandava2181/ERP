var accountspayable = angular.module('bookinvoiceviewpage', []);
accountspayable.filter('numberFormat', function () {  
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
accountspayable.controller('bookinvoiceviewpageController',['$scope','$http',function($scope,$http)
{
	/* getting data in pending tab */
	$http.get('/erp/finance/getallPendinginvoicesData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.pendinginvoicesdata = $scope.data.responseObject;
			console.log($scope.pendinginvoicesdata);
		}
		else   
		{
			console.log("Client error while getting data");  
		}
	});        

//$scope.getByPendingDetails = function(voucher_id){
//	console.log("success");
//	console.log(voucher_id);
//	console.log("success");
//$http.post('/erp/finance/getByPendingDetails', voucher_id).then(function (response) {
//   $scope.data = response.data;
//   if ($scope.data.successful) {
//		 $scope.data = {object:$scope.data.responseObject};
//		 console.log($scope.data);
//   } else {
//    //alert("Error while getting data");
//    console.log("error")
//     
//   }
//}, function (errResponse) {
//  console.error('Error while fetching notes');    
//});  
//};  
	
	
	
	
	
	$scope.getByPendingDetailsdata=function(voucher_id){      
		console.log(voucher_id);
	 $http.post('/erp/finance/getByPendingDetailsdata',voucher_id).then(function (response) {
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

$scope.getTaxDetails = function(voucher_id){
console.log(voucher_id)
$http.post('/erp/finance/getTaxDetails',voucher_id).then(function (response) {
   $scope.data = response.data;
   if ($scope.data.successful) {
       $scope.taxDetails = $scope.data.responseObject;
       console.log($scope.taxDetails);
   } else {
    //alert("Error while getting data");
    console.log("error")
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});  
};  

$scope.getPaymentDetails = function(voucher_id){
console.log(voucher_id)
$http.post('/erp/finance/getPaymentDetails',voucher_id).then(function (response) {
   $scope.data = response.data;
   if ($scope.data.successful) {
       $scope.data = {object:$scope.data.responseObject};
       console.log( $scope.data);
   } else {
    //alert("Error while getting data");
    console.log("error")
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});  
};

$scope.getItemDetails = function(voucher_id){
console.log(voucher_id)
$http.post('/erp/finance/getItemDetails',voucher_id).then(function (response) {
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
}; 

/* getting data in action page journal entry table */
$scope.getJournalEntryDetails = function(voucher_id){
	console.log(voucher_id)
	$http.post('/erp/finance/getJournalEntryDetails',voucher_id).then(function (response) {
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

$scope.getDocumentDetails = function(voucher_id){
console.log(voucher_id)
$http.post('/erp/finance/getDocumentDetails',voucher_id).then(function (response) {
   $scope.data = response.data;
   if ($scope.data.successful) {
       $scope.documents = $scope.data.responseObject;
       console.log($scope.documents);
   } else {
    //alert("Error while getting data");
    console.log("error")
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});  
};  

$scope.getCommentDetails = function(voucher_id){
console.log(voucher_id)
$http.post('/erp/finance/getCommentDetails',voucher_id).then(function (response) {
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
};

$scope.getTimelineDetails = function(voucher_id){
console.log(voucher_id)
$http.post('/erp/finance/getTimelineDetails',voucher_id).then(function (response) {
   $scope.data = response.data;
   if ($scope.data.successful) {
       $scope.timeline = $scope.data.responseObject;
       console.log($scope.timeline);
   } else {
    //alert("Error while getting data");
    console.log("error")
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});  
};


$scope.getPreviousInvoiceDetails = function(workorder){
console.log(workorder)
$http.post('/erp/finance/getPreviousInvoiceDetails',workorder).then(function (response) {
   $scope.data = response.data;
   if ($scope.data.successful) {
       $scope.previousDetails = $scope.data.responseObject;
       console.log($scope.previousDetails);
   } else {
    //alert("Error while getting data");
    console.log("error")
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});  
};

$scope.saveComments = function(data)
{
console.log(data);
$http.post('/erp/finance/saveComments',data).then(function(response)
{  
       
$scope.data1 = response.data;

if($scope.data1.successful)
          {  

      swal({  
             title: "Success!",  
           
             type: "success"
         }, function() {
           
         });  
     
          }
});  

}

	/* booking invoice in view page */
	$scope.bookaccountspayableinvoice = function(bookinvoiceData) {
		console.log(bookinvoiceData);
		$http.post('/erp/finance/bookaccountspayableinvoice',bookinvoiceData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
							/*var invoiceid = Andromeda.getSessionValue("invoice_id");
							console.log(invoiceid);*/
							$http.post('/erp/finance/getjouranlentrydata').then(
							function(response) {
								$scope.data = response.data;    
								if ($scope.data.successful) {
									$scope.data={object:$scope.data.responseObject};
									console.log("sdwwwwwwwwwwwwwwwww");
									console.log($scope.data); 
									/*$scope.data = {       
											object: data
									};   */
								} else {     
									alert("Error while getting data");
								}
							}, function(errResponse) {
								console.error('Error while fetching notes');
							});
						console.log("Book invoice")
					} else {   
						alert("Data not inserted");    
					}      
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		/* getting journalentry data in view page */
		/*$scope.getjouranlentrydata = function(){
			
			$http.post('/erp/finance/getjouranlentrydata').then(
			function(response) {
				$scope.data = response.data;    
				if ($scope.data.successful) {
					$scope.data={object:$scope.data.responseObject};
					console.log("sdwwwwwwwwwwwwwwwww");
					console.log($scope.data); 
					$scope.data = {
							object: data
					};   
				} else {     
					alert("Error while getting data");
				}
			}, function(errResponse) {
				console.error('Error while fetching notes');
			});
		};*/

		
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
		
		/* getting release payment page details */
		$scope.getpaymentdetails = function(paymentdetails){
			console.log(paymentdetails.voucher_number);
			$http.post('/erp/finance/getpaymentdetails', paymentdetails).then(
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
		
		/* releasing payment to vendor */
		$scope.Releasepaymenttovendor = function(PaymentData) {	
			console.log(PaymentData);
			$http.post('/erp/finance/Releasepaymenttovendor',PaymentData).then(  
					function(response) {    
						$scope.data = response.data;           
						if ($scope.data.successful) {
							swal("Payment Released Successfully");
							Andromeda.showfinanceaccountspayablePage();
						} else {  
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			};   
			
 



}]);
