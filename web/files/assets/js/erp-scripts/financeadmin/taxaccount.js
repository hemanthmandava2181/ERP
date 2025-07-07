var employee = angular.module('taxaccount', []);
employee.controller('taxaccountController',['$scope','$http',function($scope,$http)
	{
	
	/* getting dropdown for tax group */
	$http.get('/erp/finance/getTaxgroups').then(function(response) {
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
	
	/* creating tax account */
	$scope.createtaxaccount = function(TaxaccountData) {	
		console.log(TaxaccountData);
		$http.post('/erp/finance/createtaxaccount',TaxaccountData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("Tax Account Created Successfully");
						Andromeda.showcreatetaxaccountPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
	
		/* getting all Tax account data in table */
		$http.get('/erp/finance/getallltaxaccounts').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.userdetails = $scope.data.responseObject;
				console.log($scope.userdetails);
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});	
		
		/* getting tax account data based on tax account */
		$scope.gettaxaccountdata = function(id){   
			console.log(id);
			$http.post('/erp/finance/gettaxaccountdata', id).then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.data={object:$scope.data.responseObject};
					console.log($scope.data);
				} else {
					alert("Error while getting data");  
				}
			}, function(errResponse) {
				console.error('Error while fetching notes');
			});
		};
		
		/* updating tax account data based on tax account */
		$scope.updatetaxaccount = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/updatetaxaccount', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							/*Andromeda.showcreatecostcenterPage();*/
							alert("Tax Account Successfully updated");
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