var employee = angular.module('reimbursementpolicy', []);
employee.controller('reimbursementpolicyController',['$scope','$http',function($scope,$http)
	{
	
	/* getting drop down for travel */
	$http.get('/erp/finance/gettravel').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.travels = $scope.data.responseObject;
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
	
	/* creating reimbursement policy */
	$scope.createreimbursementpolicy = function(PolicyData) {	
		console.log(PolicyData);
		$http.post('/erp/finance/createreimbursementpolicy',PolicyData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("Reimbursement Policy Created Successfully");
						ERP.showReimbursementPolicy();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};    
	  
		/* getting caders */
		$http.get('/erp/employee/getCaders').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.caders = $scope.data.responseObject;
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
		
		/* getting all reimbursement policies to table */
		$http.get('/erp/finance/getallReimbursementdata').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.reimbursements = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});   
		
		/* getting data based on id */
		$scope.getReimbursementdata = function(id){
			console.log(id);
			/*alert(empid);*/
			$http.post('/erp/finance/getReimbursementdata', id).then(
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
		    
		/* updating data based on id */
		$scope.updateReimbursements = function(ReimbursementData){
			console.log(ReimbursementData);   
			console.log(ReimbursementData.id);
			$http.post('/erp/finance/updateReimbursements', ReimbursementData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							ERP.showReimbursementPolicy();
							alert("Email Settings Successfully updated");
							/*location.reload();*/
							
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
	
		
}]);