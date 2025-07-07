var employee = angular.module('selectcandidate', []);
employee.controller('selectcandidatecontroller',['$scope','$http',function($scope,$http)
	{
	
	/* Hiring request */
	
	$http.get('/erp/purchase/getPositions').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.positions = $scope.data.responseObject;
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
	
	
	/* getting details to front end */
	
	$http.get('/erp/Employee/getCandidates').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	    
}]);