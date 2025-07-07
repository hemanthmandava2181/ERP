var employee = angular.module('reimbursementapproveView', []);
employee.controller('ReimbursementapproveViewController',['$scope','$http',function($scope,$http)
	{
	
	 $http.post('/erp/finance/getAcceptedclaimDetails',ERP.getSessionValue("claim_reimbursement_id")).then(function (response) {
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
		
}]);