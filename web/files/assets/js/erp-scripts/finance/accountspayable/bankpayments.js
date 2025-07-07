var employee = angular.module('bankpayments', []);
employee.controller('bankpaymentController',['$scope','$http',function($scope,$http)
	{
	
	/* getting all payments to table  */
	$http.get('/erp/finance/getallbankpaymentsdata').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.bankpaymentsdetails = $scope.data.responseObject;
		}
		else  
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting data in view page */
	$scope.getBankpaymentsdata=function(voucher_number){      
		console.log(voucher_number);
	 $http.post('/erp/finance/getBankpaymentsdata',voucher_number).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);
			 console.log("Successful");
			 $http.post('/erp/finance/getpaymentaccountdetails',voucher_number).then(function (response) {
				var sum = 0;
				   $scope.data = response.data;   
				   if ($scope.data.successful) {
				       $scope.accounts1 = $scope.data.responseObject.vendor;
				       $scope.accounts2 = $scope.data.responseObject.bank;
				     
				   } else {
				    //alert("Error while getting data");
				    console.log("error");
				        
				   }
				}, function (errResponse) {
				  console.error('Error while fetching notes');    
				});  
		 } else {    
			 //alert("Error while getting data");
			 console.log("error");            
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');         
	 });   
	}
	
	/* getting reference details to table in view page */
	$scope.getreferencedetailstoviewpage = function(voucher_number){
		console.log(voucher_number)
		$http.post('/erp/finance/getreferencedetailstoviewpage',voucher_number).then(function (response) {
		   $scope.data = response.data;
		   if ($scope.data.successful) {
		       $scope.referenceDetails = $scope.data.responseObject;
		       console.log($scope.referenceDetails);
		   } else {
		    //alert("Error while getting data");
		    console.log("error");		        
		   }
		}, function (errResponse) {    
		  console.error('Error while fetching notes');    
		});  
	};
		
	/* getting accounts names and details in table */
		/*$scope.getpaymentaccountdetails = function(voucher_number){
			console.log(voucher_number)
			$http.post('/erp/finance/getpaymentaccountdetails',voucher_number).then(function (response) {
			var sum = 0;
			   $scope.data = response.data;   
			   if ($scope.data.successful) {
			       $scope.accounts1 = $scope.data.responseObject.vendor;
			       $scope.accounts2 = $scope.data.responseObject.bank;
			     
			   } else {
			    //alert("Error while getting data");
			    console.log("error");
			        
			   }
			}, function (errResponse) {
			  console.error('Error while fetching notes');    
			});  
		};   */    
	
	
	
}]);