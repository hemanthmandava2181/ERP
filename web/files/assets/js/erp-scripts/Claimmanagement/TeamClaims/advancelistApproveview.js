var employee = angular.module('advancelistApproveview', []);
employee.controller('AdvanceListViewController',['$scope','$http',function($scope,$http)
	{
		
	 $http.post('/erp/finance/getapprovedclaimDetails',ERP.getSessionValue("claim_advance_id")).then(function (response) {
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
		
}]);