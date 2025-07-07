
var report=angular.module('timesheetReportModule',[]);

report.controller('TimesheetReportController',['$scope','$http',function($scope,$http){
	
	
	
	
	     
	
	/* getting calendar details based on from date,to date*/
	$scope.apprvedTimesheets=function(data){
		var details = {
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value
				
			};
		console.log(details);
    $http.post('/erp/attendance/apprvedTimesheets',details).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			
		
			$scope.apprvedTimesheets = $scope.data.responseObject.dates;
			$("#display").show();
		} else {
			console.log("Client error while getting data");
		}
	});  
	}
	
	

}]);