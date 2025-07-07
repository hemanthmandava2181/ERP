var employee = angular.module('accountsreceivablelist', []);
employee.controller('accountsreceivablelistController',['$scope','$http',function($scope,$http)
	{
	
	/* getting pending account receivables to pending list table */
	$http.get('/erp/finance/getallPendingreceivablesData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.pendingreceivables = $scope.data.responseObject;
			console.log($scope.pendingreceivables);
		}
		else   
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting data in view page */
	$scope.getreceivableviewdata=function(voucher_id){      
		console.log(voucher_id);
	 $http.post('/erp/finance/getreceivableviewdata',voucher_id).then(function (response) {
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
	
	/* approving accounts receivable */
	$scope.approveaccountsreceivable = function(receivableData){
		console.log(receivableData.voucher_id);   
		$http.post('/erp/finance/approveaccountsreceivable', receivableData).then(
				function(response) {
					$scope.data = response.data;  
					if ($scope.data.successful) {
						swal("Accounts Receivable Successfully");
						ERP.showAccountReceivablesList();
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	/* getting approved or rejected receivables list */
	$http.get('/erp/finance/getallPendingapprovedrejectedreceivablesData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.approvedrejecteddata = $scope.data.responseObject;
			console.log($scope.approvedrejecteddata);
		}
		else   
		{
			console.log("Client error while getting data");  
		}
	});
	
	
		
}]);