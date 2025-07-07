var employee = angular.module('expenseaccount', []);
employee.controller('expenseaccountController',['$scope','$http',function($scope,$http)
	{
	
	/* Inserting expense accounts */
	$scope.addexpenseaccount = function(LiabilityData) {	
		console.log(LiabilityData);
		$http.post('/erp/finance/addexpenseaccount',LiabilityData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
			    		/*	$("#com").show(); */
						alert("Expense Account Created Successfully");
						Andromeda.showexpenseaccountPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		/* getting all expense account in table */
		$http.get('/erp/finance/getalllexpenseaccounts').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.userdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});
		
		/* getting data based on expense account name */
		$scope.getexpenseaccountdetails = function(expense_account_name){
			console.log(expense_account_name);
			/*alert(empid);*/
			$http.post('/erp/finance/getexpenseaccountdetails', expense_account_name).then(
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
	
		/* update expense account based on accoun name */
		$scope.updateexpenseaccount = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/updateexpenseaccount', UserData).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							alert("Expense Account Successfully updated");
							/*Andromeda.showexpenseaccountPage();*/
							$("#myModel").hide();
							$('.modal-backdrop').remove();
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
		
}]);