var employee = angular.module('projectemployeemapping', []);
employee.controller('projectempController',['$scope','$http',function($scope,$http)
	{
	
	var projectname;
	
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
			$scope.reportings = $scope.data.responseObject;
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
			console.log("locationid: "+$scope.regdetails["0"].division);
				console.log("projectid: "+$scope.regdetails["0"].project);
				console.log("reportingid: "+$scope.regdetails["0"].reporting_to);
				
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
			/*console.log($scope.empdetails);*/
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
												var empArray={};
												empArray['emp_id'] = empdetails[k]['emp_id'];
												empArray['project']=parseInt($scope.regdetails["0"].project);
												empArray['division']=parseInt($scope.regdetails["0"].division);
												empArray['reporting_to']=$scope.regdetails["0"].reporting_to;
												console.log("empArry eval: "+eval(empArray));
												console.log("empArry String: "+JSON.stringify(empArray));
												$http.post('/erp/employee/addemployees',empArray).then(function(response)
												{
													$scope.data = response.data;							  						
													if($scope.data.successful)
													{
														swal("Employees Added to project");
														ERP.showProjectEmployeeMapping();
													}
												});   
											}      
									}
							}     
					}
			}
	}
	
	
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
	
	    
}]);