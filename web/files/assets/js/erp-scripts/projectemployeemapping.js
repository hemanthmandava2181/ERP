var employee = angular.module('projectemployeemapping', []);
employee.controller('projectempController',['$scope','$http',function($scope,$http)
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
	
	/* Getting data in tables */
	
	$scope.getprojectdata=function(data){
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
	
	/* Getting all employees of given location */
	
	$scope.getallemployees=function(data){
		console.log(data);		
	$http.post('/erp/employee/getallemployees',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.empdetails = $scope.data.responseObject.alldata;
			console.log($scope.empdetails);
		} 
		else
		{
			console.log("Client error while getting data");  
		}  
	});   
	}
	
	/* For Check boxes */
	
	$scope.projectEmpArr = [];
	$scope.empdetails = [];
	$scope.filteredResult = [];
	
	$scope.setAllIds = function(projectmapping)   
	{
		console.log(projectmapping);
		if(projectmapping == true)
			{   
				for(var i = 0; i < $scope.filteredResult.length; i++)
					{
						var project1 = $scope.filteredResult[i]['emp_id'];
						$scope.projectEmpArr[project1] = true;
					}
			}
		else if(projectmapping == false)
			{
				$scope.projectEmpArr = [];
			}
	};
	
	/* Adding employees to project using check box */
	
	$scope.addemployees = function(empdetails,projectEmpArr)
	{   
		console.log(empdetails);
		console.log(projectEmpArr);
		
		if(projectEmpArr != null)
			{
				var Obj = [];
				
				for(var i in projectEmpArr)
					{
						if(projectEmpArr[i] == true)
							{
								for(var k = 0; k< $scope.empdetails.length; k++)
									{   
										if($scope.empdetails[k]['emp_id'] == i)
											{
												var empId = $scope.empdetails[k]['emp_id'];
												$http.post('/erp/employee/addemployees',empId).then(function(response)
												{
													$scope.data = response.data;
													
													if($scope.data.successful)
													{
														swal({
															title: "Success!",
															text: "Employees Added To Project Successfully",
															icon: "Success",
															button: "Done",
														},function(){														
														ERP.showProjectEmployeemappingpage();															
														});
													}
												});
											}
									}
							}     
					}
			}
	}
	
	    
}]);