var app=angular.module('myteamtimesheet',[]);
app.controller('teamController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/Employee/getLeavetype').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.leavetypes = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});
	
	/* getting myteam details based on from date,to date*/
	$scope.getMyTeamDetails=function(data){
		console.log(data);
    $http.post('/erp/attendance/getMyTeamDetails',data).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.teamdetails = $scope.data.responseObject.dates;
		} else {
			console.log("Client error while getting data");
		}
	});  
	}
	   
}]);