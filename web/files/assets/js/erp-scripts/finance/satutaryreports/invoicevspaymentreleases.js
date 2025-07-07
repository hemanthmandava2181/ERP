var employee = angular.module('invoicevspaymentreleases', []);
employee.controller('invoicevspaymentreleasesController',['$scope','$http',function($scope,$http)
	{
	
	$http.get('/erp/finance/getAllOrders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.orders = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	$scope.getInvoicevsPaymentsReport = function(details){
		console.log(details);
		
		var obj = {   
				   
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value,
				order_id: details.order_id
			
			};  
		console.log(obj);      
		$http.post('/erp/finance/getInvoicevsPaymentsReport',obj).then(function (response) {
		    $scope.data = response.data;
		    if ($scope.data.successful) {
		        $scope.invoiceReports = $scope.data.responseObject.invs;
		        console.log($scope.invoiceReports);
		    } else {
	   
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
}]);