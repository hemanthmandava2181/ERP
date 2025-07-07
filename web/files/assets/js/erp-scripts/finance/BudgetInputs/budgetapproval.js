var employee = angular.module('budgetapproval', []);
employee.controller('budgetapprovalController',['$scope','$http',function($scope,$http)
	{
	
	/* getting pending budget inputs to table in pending list tab  */
	$http.get('/erp/finance/getallPendingbudgetData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.budgetApprovalData = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting approved or rejected budget inputs to tale  in approve/rejected tab */
	$http.get('/erp/finance/getallapprovedbudgetData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.budgetApproverejectData = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting view page data based on budget id */
	$scope.budgetviewpagedata=function(budget_id){      
		console.log(budget_id);
	 $http.post('/erp/finance/budgetviewpagedata',budget_id).then(function (response) {
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
	
	/* approving budget input submitted */
	$scope.approvebudgetinput = function(ApprovebudgetData){
		console.log(ApprovebudgetData.budget_id);   
		$http.post('/erp/finance/approvebudgetinput', ApprovebudgetData).then(
				function(response) {
					$scope.data = response.data;  
					if ($scope.data.successful) {
						swal("Budget Input Approved Successfully");
						ERP.showBudgetApprovalsPage();
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	
	
}]);