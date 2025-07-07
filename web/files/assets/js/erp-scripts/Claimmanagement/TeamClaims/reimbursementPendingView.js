var employee = angular.module('reimbursementPendingView', []);
employee.controller('ReimbursementPendingViewController',['$scope','$http',function($scope,$http)
	{
	
	 $http.post('/erp/finance/getpendingclaimDetails',ERP.getSessionValue("claim_reimbursement_id")).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 $scope.viewpagedetails = $scope.data.responseObject;
			 console.log($scope.data);
			 console.log("Successful");
		 } else {    
			 //alert("Error while getting data");   
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');         
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
	 
	 /* approving claim in pending view page */
		$scope.approveclaim = function(ApproveData){
			console.log(ApproveData.claim_reimbursement_id);   
			$http.post('/erp/finance/approveclaim', ApproveData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							swal("Claim Approved Successfully");
							ERP.showReimbursementList();
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
}]);