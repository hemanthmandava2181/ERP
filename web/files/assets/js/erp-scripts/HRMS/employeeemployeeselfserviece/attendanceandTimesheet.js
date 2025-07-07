var employee = angular.module('attendanceandTimesheet', []);
employee.controller('attendanceandTimeSheet',['$scope','$http',function($scope,$http)
	{
	
	/* inserting task */
	$scope.Insertdata = function(UserData) {
		   
		UserData.empid = ERP.getSessionValue("employee_id");
		console.log(UserData);
		$http.post('/erp/employee/add8',UserData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
			    		/*	$("#com").show(); */
						swal("Task Inserted Successfully");
						/*Andromeda.showHrEmployeePage();*/
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};

	/* Getting login and logout */
	
		var empid = ERP.getSessionValue("employee_id");
	    console.log("empid " +empid);   
	    $http.post('/erp/employee/getLoginDetails',empid).then(function (response) {
		    $scope.data = response.data;
		    if ($scope.data.successful) {
		        $scope.data = {object:$scope.data.responseObject};
		        console.log("Successful");
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")                             
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});
	    
}]);


/*var employee = angular.module('attendanceandTimesheet', []);
employee.controller('attendanceandTimeSheet',['$scope','$http',function($scope,$http)
	{
	
	 inserting task 
	$scope.Insertdata = function(UserData) {
		   
		UserData.empid = Andromeda.getSessionValue("employeeid");
		console.log(UserData);
		
		$http.post('/erp/employee/add8',UserData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
			    			$("#com").show(); 
						alert("Task Inserted Successfully");
						Andromeda.showHrEmployeePage();
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
	
	 Getting login and logout 
	
		var empid = Andromeda.getSessionValue("employeeid");
	    console.log("empid " +empid);   
	    $http.post('/erp/employee/getLoginDetails',empid).then(function (response) {
		    $scope.data = response.data;
		    if ($scope.data.successful) {
		        $scope.data = {object:$scope.data.responseObject};
		        console.log("Successful");
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")                             
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});
	    
}]);*/