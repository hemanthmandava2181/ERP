var employee = angular.module('billsubmission', []);
employee.controller('billsubmissionController',['$scope','$http',function($scope,$http)
	{
	
	/* getting claim advance id drop down */
	$http.get('/erp/finance/getclaimadvanceids').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.claims = $scope.data.responseObject;
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
	
	/* getting cost centers */
	$http.get('/erp/employee/getCost_center').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.cost_centers = $scope.data.responseObject;
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
	
	/* getting drop down in projects */
	$http.get('/erp/finance/getprojects').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.projects = $scope.data.responseObject;
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
	
	/* getting dropdown for tax account */
	$http.get('/erp/finance/getTaxaccountnames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.accounts = $scope.data.responseObject;
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
	
	/* inserting bill submission details */
	$scope.suubmitbillsubmission = function(BillsData) {	
		console.log(BillsData);
		$http.post('/erp/finance/suubmitbillsubmission',BillsData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Bill Submission done Successfully");
						ERP.showBillSubmission();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
	
	
		
}]);