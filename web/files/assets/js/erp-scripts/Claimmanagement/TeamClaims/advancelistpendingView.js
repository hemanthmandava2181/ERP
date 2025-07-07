var employee = angular.module('advancelistpendingView', []);
employee.controller('AdvanceListviewController',['$scope','$http',function($scope,$http)
	{
	
	 $http.post('/erp/finance/getadvancependingvewdata',ERP.getSessionValue("claim_advance_id")).then(function (response) {
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
	 
	 /* approving advance claim */
		$scope.Approveadvanceclaim = function(ApproveclaimData){
			console.log(ApproveclaimData.claim_advance_id);   
			$http.post('/erp/finance/Approveadvanceclaim', ApproveclaimData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							swal("Claim Approved Successfully");
							ERP.showAdvanceList1();
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
				});
		};
		
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
	
		
}]);