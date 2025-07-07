var employee = angular.module('APPendingparkpage', []);
employee.controller('APPedningParkControler',['$scope','$http',function($scope,$http)
	{
	
	$http.post('/erp/finance/saveParkDetails',ERP.getSessionValue("voucher_id")).then(  
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