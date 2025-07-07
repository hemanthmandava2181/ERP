var employee = angular.module('createhiringrequest', []);
employee.controller('hiringrequest',['$scope','$http',function($scope,$http)
	{
	
	
	$scope.insertion = function(UserData) {
		if(UserData == undefined)
		{
			swal("OOPS!","Fill all details","info");
		}
		else if(UserData.scheme_id == null || UserData.scheme_id == undefined || UserData.scheme_id == "")
		{
			swal("Oops...","Enter Scheme","info");  
		}
		else if(UserData.project_id == null || UserData.project_id == undefined || UserData.project_id == "")
		{
			swal("Oops...","Enter Project","info");
		}
		else if(UserData.sector_id == null || UserData.sector_id == undefined || UserData.sector_id == "")
		{
			swal("Oops...","Enter Sector","info");
		}
		else if(UserData.departmentid == null || UserData.departmentid == undefined || UserData.departmentid == "")
		{
			swal("Oops...","Enter Department","info");
		}
		else if(UserData.caderid == null || UserData.caderid == undefined || UserData.caderid == "")
		{
			swal("Oops...","Enter Cader","info");
		}
		else if(UserData.gradeid == null || UserData.gradeid == undefined || UserData.gradeid == "")
		{
			swal("Oops...","Enter Grade","info");
		}
		else if(UserData.designation_id == null || UserData.designation_id == undefined || UserData.designation_id == "")
		{
			swal("Oops...","Enter Designation","info");
		}
		else if(UserData.position == null || UserData.position == undefined || UserData.position == "")
		{
			swal("Oops...","Enter Position","info");
		}
		else if(UserData.position_number == null || UserData.position_number == undefined || UserData.position_number == "")
		{
			swal("Oops...","Enter Number Of Position","info");
		}
		else if(UserData.divisionid == null || UserData.divisionid == undefined || UserData.divisionid == "")
		{
			swal("Oops...","Enter Division","info");
		}
		else if(UserData.total_experience == null || UserData.total_experience == undefined || UserData.total_experience == "")
		{
			swal("Oops...","Enter Total Experience","info");
		}
		else if(UserData.relevent_experience == null || UserData.relevent_experience == undefined || UserData.relevent_experience == "")
		{
			swal("Oops...","Enter Relevent Experience","info");
		}                 
		else
		{
		console.log(UserData);    
		alert(UserData.id + ' Insertion Successful');
		$http.post('/erp/Employee/add', UserData).then(
				function(response) {         
					$scope.data = response.data;
					if ($scope.data.successful) {
						alert("Register Data Inserted Successfully");
						
					} else {      
						alert("Data not inserted");
					}   
				}, function(errResponse) {  
					console.error('Error while fetching notes');  
				});
		}
	};
	
	
	
	$http.get('/erp/Employee/getCaders').then(function(response) {
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
	
	
	$http.get('/erp/Employee/getGrades').then(function(response) {
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
	
	
	$http.get('/erp/Employee/getDepartment').then(function(response) {
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

	
	$http.get('/erp/Employee/getDesignation').then(function(response) {
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
	
/* scheme,  Sector and projects */
	
	$http.get('/erp/employee/getSchemes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.schemes = $scope.data.responseObject;
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
	
	
	$scope.getProjects = function(totalObj)
	{
		console.log(totalObj);
		$http.post('/erp/employee/getProjects', totalObj.scheme_id).then(function(response)
		{
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.projects = $scope.data.responseObject;
				$scope.data = {object : totalObj};   
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
	}
	
	$http.get('/erp/employee/getSectors').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.sectors = $scope.data.responseObject;
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
	
	
	
}]);