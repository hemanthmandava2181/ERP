var employee = angular.module('claimstatusreport', []);
employee.controller('claimstatusreportController',['$scope','$http',function($scope,$http)
	{
	
	/* getting data based on from and to date in advance claim table */
	$scope.getAdvanceClaimdata=function(data){
		console.log(data);
		var Advancedetails = {
				from_date : document.getElementById('fromdate').value,
				to_date : document.getElementById('todate').value,
				claim_advance_id : data.claim_advance_id
		}
		console.log(Advancedetails);   
	$http.post('/erp/finance/getAdvanceClaimdata',Advancedetails).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)   
		{
			$scope.Advanceclaimdetails = $scope.data.responseObject.dates;
			console.log($scope.Advanceclaimdetails);
		}   
		else    
		{
			console.log("Client error while getting data");  
		}  
	   });	
   } 
	
	/* getting data based on from and to date in reimbursement claim table */
	$scope.getreimbursementClaimdata=function(data){    
		console.log(data);
		var Reimbursementdetails = {
				from_date : document.getElementById('fromdate').value,
				to_date : document.getElementById('todate').value,
				claim_reimbursement_id : data.claim_reimbursement_id
		}
		console.log(Reimbursementdetails);   
	$http.post('/erp/finance/getreimbursementClaimdata',Reimbursementdetails).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.Reimbursementclaimdetails = $scope.data.responseObject.dates;
			console.log($scope.Reimbursementclaimdetails);
		}
		else
		{
			console.log("Client error while getting data");  
		}  
	   });	
   } 
	
	/* getting advance claim drop downs */
	$http.get('/erp/finance/getAdvanceclaims').then(function(response) {
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
	
	/* getting reimbursement claim drop downs */
	$http.get('/erp/finance/getReimbursementclaims').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.reimbursements = $scope.data.responseObject;
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