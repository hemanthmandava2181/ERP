var employee = angular.module('billsubmissionlistviepage', []);
employee.controller('billsubmissionlistviewController',['$scope','$http',function($scope,$http)
	{
	
	 $http.post('/erp/finance/getbillsubmissionviewpgedata',ERP.getSessionValue("claim_reimbursement_id")).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);   
			 console.log("Successful");   
		 } else {    
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');         
	 });   	
		
}]);