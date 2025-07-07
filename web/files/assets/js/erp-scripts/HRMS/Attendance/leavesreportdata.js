
var report=angular.module('leavesReportModule',[]);

report.controller('LeavesReportController',['$scope','$http',function($scope,$http){
	
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

	
	
	     
	
	/* getting calendar details based on from date,to date*/
	$scope.GetLeavesReport=function(data){
		var details = {
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value,
				leave_type:data.leave_type
				
			};
		console.log(details);
    $http.post('/erp/leavesreport/GetLeavesReport',details).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			
		
			$scope.leavesdatareport = $scope.data.responseObject.centers;
			
			console.log($scope.GetLeavesReport)
			$("#display").show();
		} else {
			console.log("Client error while getting data");
		}
	});  
	}
	
	

}]);