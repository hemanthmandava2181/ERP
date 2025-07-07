
var report=angular.module('leavesSummaryReportModule',[]);

report.controller('LeavesSummaryReportController',['$scope','$http',function($scope,$http){
	
	$http
	.get('/erp/calc/getYears')
	.then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.financialyears = $scope.data.responseObject;
					console.log($scope.years);
				} else {
					console
							.log("Client error while getting data");
				}
			},
			function(response) {
				console
						.log("Server error while getting data");
			});
	/* getting calendar details based on from date,to date*/
	$scope.GetLeavesSummaryReport=function(data){
		
		console.log(details);
    $http.post('/erp/leavesreport/GetLeavesSummaryReport',data).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {    
			$scope.leavesummaryreport = $scope.data.responseObject;
			
			console.log($scope.leavesummaryreport)
			$("#display").show();
		} else {
			console.log("Client error while getting data");
		}
	});  
	}
	
	

}]);