var employee = angular.module('customercreation', []);
employee.controller('customercreationController',['$scope','$http',function($scope,$http)
	{
	
	/* getting nature of services to drop down  */
	$http.get('/erp/finance/getNatureofservices').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.services = $scope.data.responseObject;
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
	
	/* getting states to drop down  */
	$http.get('/erp/finance/getStates').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.states = $scope.data.responseObject;
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
	
	/* customer creation */
	$scope.customercreation = function(CustomerData) {	
		console.log(CustomerData);
		$http.post('/erp/finance/customercreation',CustomerData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("Customer Created Successfully");
						$("#myModel").hide();
						$('.modal-backdrop').remove();
						Andromeda.showcCustomerMasterPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		/* getting all Customer Details data in table */
		$http.get('/erp/finance/getalllCustomerDetails').then(function(response) {
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
		
		/* getting customer data to pop up based in customer id */
		$scope.getCustomerdata = function(customer_id){
			console.log(customer_id);
			/*alert(empid);*/
			$http.post('/erp/finance/getCustomerdata', customer_id).then(
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
		
		/* updating customer data based on customer_id */
		$scope.UpdateCustomerdata = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/UpdateCustomerdata', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							swal("Customer Data Successfully updated");
							$("#myModel").hide();
							$('.modal-backdrop').remove();
							Andromeda.showcCustomerMasterPage();
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
		/* inactivating customer based on customer_id */
		$scope.inactivecustomer = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/inactivecustomer', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							swal("Customer Inactiated");
							$("#myModel").hide();
							$('.modal-backdrop').remove();
							Andromeda.showcCustomerMasterPage();
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
	
		
}]);