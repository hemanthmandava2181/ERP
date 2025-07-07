var project = angular.module('profileupdateadmin', []);
project.controller('AdminprofileupdateController',['$scope','$http',function($scope,$http)
{
	var empId = Andromeda.getSessionValue();
	/* Getting caders */
	
	$http.get('/erp/employee/getCaders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.caders = $scope.data.responseObject;
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
	
	/* Getting grades */
	
	$http.get('/erp/employee/getGrades').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.grades = $scope.data.responseObject;
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
	
	/* Getting Departments */
	
	$http.get('/erp/employee/getDepartment').then(function(response) {
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
	
	/* Getting Relations */
	
	$http.get('/erp/employee/getRelations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.relations = $scope.data.responseObject;
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
	
	/* Getting Districts */
	
	$http.get('/erp/employee/getDistricts').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.districts = $scope.data.responseObject;
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
	
	/* Getting designations */
	
	$http.get('/erp/employee/getDesignation').then(function(response) {
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
	
	/* Getting divisions */
	
	$http.get('/erp/employee/getDivision').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.divisions = $scope.data.responseObject;
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
	
	/* getting cost centers */
	
	$http.get('/erp/employee/getCost_center').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.cost_centers = $scope.data.responseObject;
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
	
	/* Getting Locations */
	
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
	
	/* Getting details based on empid */
	
	  
		var empid = Andromeda.getSessionValue("empid");
		console.log("empid " +empid);  
	 $http.post('/erp/ctc/getDetails',empid).then(function (response) {
		 $scope.data13 = response.data;
		 if ($scope.data13.successful) {
			 $scope.data2 = {object:$scope.data13.responseObject};
			 console.log($scope.data2);
			 console.log("Successful");
		 } else {
			 //alert("Error while getting data");
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');    
	 });   
 
	 
	 
	 /* Update details based on empid */
	 
	 $scope.employeedata = function(UserData) {
			$http.post('/erp/ctc/adddata',UserData).then(
					function(response) {    
						$scope.data = response.data;      
						if ($scope.data.successful) {
				    		$("#com").show(); 
							alert("Profile Updated Successfully");
							Andromeda.showCreateEmployeePage();
							/*swal({
								title: "Success!",
								text: "Employee Details Updated Successfully",
								type: "Success"
							}, function(){
								window.location.reload();
							});*/
						} else {
							alert("Data not inserted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
	 

}]);