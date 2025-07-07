var employee = angular.module('budgetoverview', []);
employee.controller('budgetoverviewController',['$scope','$http',function($scope,$http)
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
	
	/* getting budget data based on financial year */
	$scope.getbudgetdataoverview=function(data){
		console.log(data.financialyear);   
	$http.post('/erp/finance/getbudgetdataoverview',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)   
		{
			$scope.budgetInputOverviewData = $scope.data.responseObject.budgetoverview;
			console.log($scope.budgetInputOverviewData);
			$scope.data = {
					object : data
			};  
		}   
		else    
		{
			console.log("Client error while getting data");  
		}  
	   });	
   } 
	
	
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
	
}]);