var employee = angular.module('trackinterviewstatus', []);
employee.controller('interviewcontroller',['$scope','$http',function($scope,$http)
	{
	
	/* Hiring Request */
	
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
	    
	
}]);