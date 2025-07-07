var employee = angular.module('attendancesummarygraph', []);
employee.controller('AttendanceSummary',['$scope','$http',function($scope,$http)
	{
	
	/* Getting details to table based on from and to date */
	$scope.getsummary=function(data){
		console.log(data);
		var empid = ERP.getSessionValue("employee_id");
		console.log("empid " +empid);
		var details = {
				empid : empid,
				from_date : data.from_date,
				to_date :data.to_date  
		}
		console.log(details);  
	$http.post('/erp/attendancesummary/getsummary',details).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject.centers;
			console.log($scope.regdetails);
		}
		else              
		{    
			console.log("Client error while getting data");      
		}  
	});
	}
	
}]);