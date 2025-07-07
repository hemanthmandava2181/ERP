
var report=angular.module('attendanceReportModule',[]);

report.controller('attendanceReportController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/myerp/Employee/getDepartment').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.departments = $scope.data.responseObject;
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
	
	$http.get('/myerp/Employee/getDesignation').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.designations = $scope.data.responseObject;
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

	/* get attendence report */
	$http.get('/myerp/attendance/getStaff').then(function(response) {
		$scope.data = response.data;
		
		if($scope.data.successful)
		{
			$scope.staffs = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	
	/*getting Employee name*/
	$http.get('/myerp/Employee/getAllname').then(function(response) {
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
	
	
	
	/* getting calendar details based on from date,to date*/
	$scope.getCalendarDetailsdet=function(data){
		var details = {
				
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value
				
			};
		console.log(details);
    $http.post('/myerp/attendance/getCalendarDetailsdet',details).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.calendarDetails = $scope.data.responseObject.dates;
		} else {
			console.log("Client error while getting data");
		}
	});  
	}
	
	

}]);