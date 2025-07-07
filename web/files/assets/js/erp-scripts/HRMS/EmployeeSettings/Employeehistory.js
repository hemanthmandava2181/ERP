var employee = angular.module('HistoryModule', []);
employee.controller('HistoryController',['$scope','$http',function($scope,$http)
{
	  $scope.getEmployeeHistory = function(data)
		{ 
			/*console.log(data);
			 if(data==null || data=='' || data==undefined)
			  {
			  	swal("Enter all details!");
			  }
			else if(data.departmentid == null || data.departmentid == '' || data.departmentid== undefined)
			  {
			  	swal("Select Department!");
			  }
			 else if(data.designationid == null || data.designationid  == '' || data.designationid  == undefined)
			  {
			  	swal("Select Designation!");
			  } 
			   else if(data.caderid == null || data.caderid == '' || data.caderid == undefined)
			  {
			  	swal("Select Cader!");
			  } 	
			   else if(data.gradeid == null || data.gradeid == '' || data.gradeid == undefined)
			  {
			  	swal("Select Grade!");
			  } 		
			   else if(data.employee_type == null || data.employee_type == '' || data.employee_type == undefined)
			  {
			  	swal("Select Employee Type!");
			  } 
			   else if(data.financial_year == null || data.financial_year == '' || data.financial_year == undefined)
			  {
			  	swal("Enter Financial Year!");
			  }  
			 else{*/
			console.log(data); 
			$http.post('report/getEmployeeHistory',data).then(function(response)
			{   
		    	$scope.data = response.data;                
				if($scope.data.successful)                                          
				{      	    					
					console.log($scope.data);  
					$scope.historydetails= $scope.data.responseObject.centers;
				}          
				else
				{              
					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
					jQuery("#errorDiv").html(message);
				}
			},     
			function(errResponse)   
			{
				console.error('Error while fetching notes');
			});      
		};
		 $http.get('report/getAllEmployeeHistory').then(function(response) {
	  			$scope.data = response.data;        
	  			if($scope.data.successful)
	  			{
	  				$scope.historydetails = $scope.data.responseObject;
	  				console.log($scope.historydetails);
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
		 $http.get('employee/getDesignation').then(function(response) {
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
		 $http.get('report/getYears').then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				$scope.financialyears= $scope.data.responseObject;
	  				
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
		 
		 $http.get('employee/getDepartment').then(function(response) {
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
		 $http.get('employee/getCaders').then(function(response) {
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
		 $http.get('employee/getGrades').then(function(response) {
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
		
		 $http.get('employee/getDivision').then(function(response) {
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
			   
		 $http.get('Employee/getStaff').then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				$scope.types = $scope.data.responseObject;
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
		 $http.get('/erp/report/getEmployeeSalaryDetails').then(function(response) {
	  			$scope.data = response.data;        
	  			if($scope.data.successful)
	  			{
	  				$scope.salarydetails = $scope.data.responseObject;
	  				console.log($scope.salarydetails);
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
		
		 $http.get('/erp/report/getEmployeeProjectDetails').then(function(response) {
	  			$scope.data = response.data;        
	  			if($scope.data.successful)
	  			{
	  				$scope.projectdetails = $scope.data.responseObject;
	  				console.log($scope.projectdetails);
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
		
		 $http.get('/erp/report/getEmployeeEmploymentDetails').then(function(response) {
	  			$scope.data = response.data;        
	  			if($scope.data.successful)
	  			   {
	  				$scope.basicdetails = $scope.data.responseObject;
	  				console.log($scope.basicdetails);
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
		
		 $scope.getByIdEmployeeHistory = function(empid){
				console.log(empid)
				$http.post('/erp/report/getByIdEmployeeHistory',empid).then(function (response) {
				    $scope.data = response.data;
				if ($scope.data.successful) {
				        $scope.data = {object:$scope.data.responseObject};
				    } else {   
					//alert("Error while getting data");
					console.log("error")
				
				    }
				}, function (errResponse) {  
				console.error('Error while fetching notes');    
				});   
				};  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
}]);