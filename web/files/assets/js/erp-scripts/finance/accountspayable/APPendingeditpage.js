var employee = angular.module('APPendingeditpage', []);
employee.controller('APPendingeditControler',['$scope','$http',function($scope,$http)
	{
	
	$http.post('/erp/finance/getByInvoiceDetails',ERP.getSessionValue("voucher_id")).then(  
			function(response) {    
				$scope.data = response.data;           
				if ($scope.data.successful) {
//					swal("Budget Created Successfully");
//					ERP.showBudgetInputPage();
				} else {
					alert("Data not inserted");    
				}   
			}, function(errResponse) {
				console.error('Error while fetching notes');
			});	
	
}]);