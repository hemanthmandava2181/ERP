var employee = angular.module('budgetinput', []);
employee.controller('budgetinputController',['$scope','$http',function($scope,$http)
	{
	
	/* getting financial year drop down */
	$http.get('/erp/finance/getfinancialyears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.years = $scope.data.responseObject;
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
	
	/* getting SDEI Group Names in drop down */
	$http.get('/erp/finance/getSDEIgroupnames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.groups = $scope.data.responseObject;
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
	
	/* getting scheme drop down */
	$http.get('/erp/finance/getSchemes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.schemes = $scope.data.responseObject;
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
	
	/* getting segment in drop down */
	$http.get('/erp/finance/getSegments').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.segments = $scope.data.responseObject;
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
	
	/* getting drop down for sectors */
	$http.get('/erp/finance/getsectors').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.sectors = $scope.data.responseObject;
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
	
	/* Creating Budget Input */   
	$scope.createBudgetinput = function(BudgetData) {	
		console.log(BudgetData);
		$http.post('/erp/finance/createBudgetinput',BudgetData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Budget Created Successfully");
						ERP.showBudgetInputPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};   
		
	/* getting all budget inputs to table */
	$http.get('/erp/finance/getallBudgetInputs').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.budgetInputData = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}    
	});
	
	/* getting pop up data */
	$scope.viewbudgetpopupdata = function(budget_id){
		console.log(budget_id);
		$http.post('/erp/finance/viewbudgetpopupdata', budget_id).then(
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
	};
	
	
	
	
		
}]);