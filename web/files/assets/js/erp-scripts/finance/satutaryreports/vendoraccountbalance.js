var employee = angular.module('vendoraccountbalance', []);
employee.controller('vendoraccountbalanceController',['$scope','$http',function($scope,$http)
	{
	
	$http.get('/erp/finance/getFinancialYear').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.financialYear = $scope.data.responseObject;
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
	
	   
	$scope.getVendorAccountBalance = function(data){
		console.log(data.financial_year)
		$http.post('/erp/finance/getVendorAccountBalance',data.financial_year).then(function (response) {
		    $scope.data1 = response.data;
		    if ($scope.data1.successful) {   
		        $scope.vendorBalance = $scope.data1.responseObject;
		        console.log($scope.vendorBalance);
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		
}]);