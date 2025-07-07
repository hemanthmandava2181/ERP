var employee = angular.module('jelist', []);
employee.controller('createjeController',['$scope','$http',function($scope,$http)
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
	   
	/* getting JE List table data in submitted by you tube in period mode */
	$scope.getperiodJEList=function(data){
		console.log(data);
		var Subperioddetails = {
				from_date : document.getElementById('fromdate').value,
				to_date : document.getElementById('todate').value,
				entry_type : data.entry_type
		}
		console.log(Subperioddetails);   
	$http.post('/erp/finance/getperiodJEList',Subperioddetails).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)   
		{
			$scope.subJEListdetails = $scope.data.responseObject.subpe;
			console.log($scope.subJEListdetails);
		}   
		else    
		{
			console.log("Client error while getting data");  
		}  
	   });	
   } 
	
	/* getting data to pop up in submitted view button page */
	$scope.getsubmittedjelistdata = function(voucher_number){
		console.log(voucher_number);
		$http.post('/erp/finance/getsubmittedjelistdata', voucher_number).then(
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
	
	/* getting data in pop up table for view button in submitted je list tab for period type */
	$scope.getpopuptabledatasubperiod=function(subJEListdetails){
		console.log(subJEListdetails);  
		/*console.log(subJEListdetails.voucher_number);*/   
	$http.get('/erp/finance/getpopuptabledatasubperiod',subJEListdetails).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)   
		{
			$scope.popupsubperiodData = $scope.data.responseObject.popuptable;
			console.log($scope.popupsubperiodData);
		}   
		else    
		{
			console.log("Client error while getting data");  
		}  
	   });	
   } 
	
	/* getting data in update page in submitted je list tab for period type */
	$scope.getupdatesubperioddata = function(voucher_number){
		console.log(voucher_number);
		/*alert(empid);*/
		$http.post('/erp/finance/getupdatesubperioddata', voucher_number).then(
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
	
	/* getting project drop down */
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
	
	/* getting cost centers drop down */
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
	
	/* getting work order names to drop down */
	$http.get('/erp/finance/getworkorders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.orders = $scope.data.responseObject;
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
	
	/* getting gl account drop down */
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
	
	/* updating je */   
	$scope.updateJV = function(jeData){
		console.log(jeData.journal_entry_header);  
		console.log(jeData.voucher_number);
		/*alert(UserData.empid);*/
		$http.post('/erp/finance/updateJV', jeData).then(
				function(response) {
					$scope.data = response.data;  
					if ($scope.data.successful) {
						/*Andromeda.showcreatecostcenterPage();*/
						alert("Journal Entry Successfully updated");
						ERP.showJEList();
					} else {  
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	/* getting JE List table data in submitted by you tube in period mode */
	$scope.getfinancialJEList=function(FinanceJVdata){
		console.log(FinanceJVdata.financial_year);
		console.log(FinanceJVdata.entry_type);
	$http.post('/erp/finance/getfinancialJEList',FinanceJVdata).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)   
		{
			$scope.subJEListdetails = $scope.data.responseObject.subpe;
			console.log($scope.subJEListdetails);
		}   
		else    
		{
			console.log("Client error while getting data");  
		}  
	   });	
   }
	
	    
	
}]);