var leave = angular.module('myleave', []);
leave.controller("leaveController", ['$scope','$http',function($scope, $http)
  {
	/*$http.get('/erp/attendance/getLeavesDetails').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.leavesdetails = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});
	*/
	
	
	
 
	
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
	
	
	/* getting myleaves details based on year,leavetype*/
	/*$scope.getMyleavesDetails=function(data){
		console.log(data);   
		
    $http.post('/erp/attendance/getMyleavesDetails',data).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.MyleavesDetails = $scope.data.responseObject.dates;
		} else {
			console.log("Client error while getting data");
		}
	});  
	}
	*/
	$http.get('/erp/report/getYears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.years = $scope.data.responseObject;
			console.log($scope.years);
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
	$http.get('/erp/report/getCalendarYears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		    {
			$scope.yearss = $scope.data.responseObject;
			console.log($scope.yearss);
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
	$scope.getMyleavesDetails=function(data){
		data.empid = ERP.getSessionValue("employee_id");
		console.log(data);
	$http.post('/erp/attendance/getMyleavesDetails',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)     
		{
			$scope.MyleavesDetails = $scope.data.responseObject.dates;
			console.log($scope.MyleavesDetails);
		}
		else              
		{    
			console.log("Client error while getting data");      
		}  
	});                              
	}  
	
	/*$scope.getprojectdata=function(data){
		console.log(data);		
	$http.post('/erp/employee/getprojectdata',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject.dates;
			console.log($scope.regdetails);
		} 
		else
		{
			console.log("Client error while getting data");  
		}  
	});   
	}
	   */
		}]);