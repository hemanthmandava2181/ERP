var employee = angular.module('reimbursementlist', []);
employee.controller('reimbursementlistController',['$scope','$http',function($scope,$http)
	{
	
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
	
	/* getting data to pending list */
	
	$http.get('/erp/finance/getallPendingData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.pendingDetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting pending view page details */
	$scope.getpendingclaimDetails=function(claim_reimbursement_id){      
		console.log(claim_reimbursement_id);
	 $http.post('/erp/finance/getpendingclaimDetails',claim_reimbursement_id).then(function (response) {
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
	}
	
	/* getting view page table data */
	/*$scope.getViewpagetabledata=function(pendingDetails){      
		console.log(pendingDetails.claim_reimbursement_id);
	 $http.post('/erp/finance/getViewpagetabledata',pendingDetails).then(function (response) {
		 $scope.data = response.data;
		 if($scope.data.successful)        
			{       
				$scope.viewpagedetails = $scope.data.responseObject.dates;
				console.log($scope.viewpagedetails);
			}
		 else {
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');    
	 });   
	}  */
	
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
	
	/* getting data to approved list */
	
	$http.get('/erp/finance/getallApprovedData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.ApprovedDetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});      
	
	/* getting approved view page details */
	$scope.getAcceptedclaimDetails=function(claim_reimbursement_id){      
		console.log(claim_reimbursement_id);
	 $http.post('/erp/finance/getAcceptedclaimDetails',claim_reimbursement_id).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 $scope.viewapprovedpagedetails = $scope.data.responseObject;
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