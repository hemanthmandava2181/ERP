var moulist = angular.module('moulist', []);
moulist.controller('moulistController',['$scope','$http',function($scope,$http)
	{
	
	/* getting programs drop down */
	$http.get('/erp/procurement/getmoulist').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.moulistdetails = $scope.data.responseObject;
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