var employee = angular.module('bankpaymentviewpage', []);
employee.controller('BankpaymentviewController',['$scope','$http',function($scope,$http)
	{
	
	$http.post('/erp/finance/getpaymentaccountdetails', ERP.getSessionValue("voucher_number")).then(function (response) {
		var sum = 0;
		   $scope.data = response.data;   
		   if ($scope.data.successful) {
		       $scope.accounts1 = $scope.data.responseObject.vendor;
		       $scope.accounts2 = $scope.data.responseObject.bank;
		       console.log("Success");
		       $http.post('/erp/finance/getBankpaymentsdata',ERP.getSessionValue("voucher_number")).then(function (response) {
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
		   } else {
		    //alert("Error while getting data");
		    console.log("error")
		     
		   }
		}, function (errResponse) {
		  console.error('Error while fetching notes');    
		});  
	
	/*$http.post('/erp/finance/getBankpaymentsdata',ERP.getSessionValue("voucher_number")).then(function (response) {
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
	 });   */
	
}]);