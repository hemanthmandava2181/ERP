var workorderlist = angular.module('workorderlist', []);
workorderlist.controller('workorderlistController',['$scope','$http',function($scope,$http)
	{
	
	/* getting programs drop down */
	$http.get('/erp/procurement/getwolist').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.wolistdetails = $scope.data.responseObject;
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