var employee = angular.module('employeeprojectmapping', []);
employee.controller('projectController',['$scope','$http',function($scope,$http)
	{
	
	$http.get('/erp/employee/getLocations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.locations = $scope.data.responseObject;
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
	
	/* Getting Projects */
	$http.get('/erp/employee/getprojects').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.projects = $scope.data.responseObject;
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
	
	/* Getting reporting to */
	$http.get('/erp/employee/getReporting').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.reporting = $scope.data.responseObject;
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
	
	
	/* getting data in table */
	
	$scope.getempprojectdata=function(data){
		console.log(data);		
	$http.post('/erp/employee/getempprojectdata',data).then(function(response) {
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
	
	/* getting data in pop up */
	
	$scope.getByproject = function(project_name){
		console.log(project_name);   
		$http.post('/erp/employee/getByproject', project_name).then(
		function(response) {
			$scope.data = response.data;  
			if ($scope.data.successful) {
				$scope.data={object:$scope.data.responseObject};
			} else {
				alert("Error while getting data");
			}
		}, function(errResponse) {
			console.error('Error while fetching notes');
		});
	};
	
	/* update data in pop up based on project_name */
	
	$scope.updateprojectdata = function(UserData){
		console.log(UserData); 
		$http.post('/erp/employee/updateprojectdata', UserData).then(
				function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						alert("Project Details Successfully updated");
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	    
}]);