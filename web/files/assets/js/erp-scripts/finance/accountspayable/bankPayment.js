var employee = angular.module('bankPayment', []);
employee.controller('BankPaymentController',['$scope','$http',function($scope,$http)
	{
	
	$http.post('/erp/finance/getpaymentdetails', ERP.getSessionValue("voucher_number")).then(
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
	
		
}]);