var employee = angular.module('billsubmissionlist', []);
employee.controller('billsubmissionlistController',['$scope','$http',function($scope,$http)
	{
	
	/* getting all reimbursement lists */
	$http.get('/erp/finance/getallbillsubmissionlists').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.billsubmissionListdetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting bill submission view page data */
	$scope.getbillsubmissionviewpgedata=function(claim_reimbursement_id){      
		console.log(claim_reimbursement_id);
	 $http.post('/erp/finance/getbillsubmissionviewpgedata',claim_reimbursement_id).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 /*$scope.viewpagedetails = $scope.data.responseObject;*/
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
	
	/* getting data in bill submission update page */
	$scope.getbillsubmissionupdatedata=function(claim_reimbursement_id){      
		console.log(claim_reimbursement_id);
	 $http.post('/erp/finance/getbillsubmissionupdatedata',claim_reimbursement_id).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 /*$scope.viewpagedetails = $scope.data.responseObject;*/
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
	
	/* getting drop down in projects */
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
	
	/* updating bills */
	$scope.updateBills = function(BillsData){
		console.log(BillsData.claim_reimbursement_id);
		console.log(BillsData.claim_id);
		$http.post('/erp/finance/updateBills', BillsData).then(
				function(response) {
					$scope.data = response.data;  
					if ($scope.data.successful) {
						/*Andromeda.showcreatecostcenterPage();*/
						swal("Requested Bill Successfully updated");
						ERP.showBillSubmissionList();    
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	
		
}]);