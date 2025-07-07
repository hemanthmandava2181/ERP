var employee = angular.module('bookedinvoicesviewpage', []);
employee.controller('BookedInvoicesViewControler',['$scope','$http',function($scope,$http)
	{
	
	$http.post('/erp/finance/getJouranlentrydata',ERP.getSessionValue("voucher_id")).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);
			 console.log("Successful");
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
	
	/*$http.post('/erp/finance/getJVDetails',voucher_id).then(function (response) {
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
		}); */
	
	/* getting release payment page details */  
	$scope.getpaymentdetails = function(voucher_number){
		ERP.setSessionValue("voucher_number", voucher_number);
		ERP.showBankpaymentpage();
		/*console.log(paymentdetails.voucher_number);
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
		});*/
	};
		
}]);