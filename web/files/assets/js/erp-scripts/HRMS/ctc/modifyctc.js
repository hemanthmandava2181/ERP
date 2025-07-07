var project = angular.module('modifyctc', []);
project.controller('modifyctccontroller',['$scope','$http',function($scope,$http)
{
	
	
	/*updating CTC Calculator*/
	
	$scope.updateCTC = function(UserData) 
	{
		var created_by =ERP.getSessionValue("employee_id");
		
		 var details = {
					empid:UserData.empid,
					ctc_calculatorid:UserData.ctc_calculatorid,
					effective_date:	document.getElementById('effective').value,
					ctc_amount:UserData.ctc_amount,
					revised_ctc:UserData.revised_ctc,
					created_by:created_by
				}
	 console.log(details);
		$http.post('/erp/ctc/updateCTC',details).then(  
				function(response) {        
					$scope.data = response.data;      
					if ($scope.data.successful)
					{   
			    		 
						alert("Ctc Updated Successfully");    
						
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
	
/* getting ctc calculator */
	
	$http.get('/erp/Employee/getctccalculator').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.ctcs = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
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
	
	/* getting relations */
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
	
	/* getting districts */
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
	
	/* getting designations */
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
	
	/* getting divisions */
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
	
	/* Getting Employee type */
	$http.get('/erp/Employee/getStaff').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.types = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});
	
	/* Getting all employees */
	
	$scope.getallemployees=function(){
	 $http.get('/erp/ctc/getallemployees').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.ctcdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
	});
	}	
	
	/* Getting employees based on given data */
	
	$scope.getemployeedata=function(data){
		console.log(data);
				
	$http.post('/erp/ctc/getemployeedata',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.ctcdetails = $scope.data.responseObject.ctcs;
			console.log($scope.ctcdetails);
		}
		else
		{
			console.log("Client error while getting data");  
		}  
		});   
	}   
	
	/* Getting details based on empid */
	
	$scope.getDetails=function(empid){      
		console.log(empid);          
	// Andromeda.setSessionValue(empid,1000);
	 //console.log(Andromeda.setSessionValue(empid,1000));
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
	}
	
	/* updating details of employee */
	
	$scope.adminupdate = function(UserData) {
		$http.post('/erp/ctc/adminupdate',UserData).then(  
				function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
			    		$("#com").show(); 
						alert("Profile Updated Successfully");
						Andromeda.showmodifyctcPage();
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
		
		/* Getting datails in revise ctc page based on empid */
		
		$scope.getctcDetails=function(empid){      
			console.log(empid);    
		 $http.post('/erp/ctc/getctcDetails',empid).then(function (response) {
			 $scope.data13 = response.data;
			 if ($scope.data13.successful) {
				 $scope.data = {object:$scope.data13.responseObject};
				 console.log($scope.data2);
				 console.log("Successful");
			 } else {
				 //alert("Error while getting data");
				 console.log("error") 
			 }
		 }, function (errResponse) {
			 console.error('Error while fetching notes');    
		 });   
		}
		
	/* updating ctc in revise ctc page */
		
		$scope.applyctcrevision = function(UserData) {
			console.log(UserData);
			$http.post('/erp/ctc/applyctcrevision',UserData).then(  
					function(response) {    
						$scope.data = response.data;      
						if ($scope.data.successful) {
				    		$("#com").show(); 
							alert("CTC Updated Successfully");
							Andromeda.showmodifyctcPage();
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
















/*var project = angular.module('modifyctc', []);
project.controller('modifyctccontroller',['$scope','$http',function($scope,$http)
{
	
	 Getting caders 
	   
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
	
	 Getting grades 
	
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
	
 getting ctc calculator 
	
	$http.get('/erp/Employee/getctccalculator').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.ctcs = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});
	
	 Getting Departments 
	
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
	
	 getting relations 
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
	
	 getting districts 
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
	
	 getting designations 
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
	
	 getting divisions 
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
	
	 getting cost centers 
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
	
	 Getting reporting to 
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
	
	 Getting Locations 	
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
	
	 Getting Employee type 
	$http.get('/erp/Employee/getStaff').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.types = $scope.data.responseObject;
		} else {
			console.log("Client error while getting data");
		}
	}, function(response) {
		console.log("Server error while getting data");
	});
	
	 Getting all employees 
	
	$scope.getallemployees=function(){
	 $http.get('/erp/ctc/getallemployees').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.ctcdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
	});
	}	
	
	 Getting employees based on given data 
	
	$scope.getemployeedata=function(data){
		console.log(data);
				
	$http.post('/erp/ctc/getemployeedata',data).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.ctcdetails = $scope.data.responseObject.ctcs;
			console.log($scope.ctcdetails);
		}
		else
		{
			console.log("Client error while getting data");  
		}  
		});   
	}   
	
	 Getting details based on empid 
	
	$scope.getDetails=function(empid){      
		console.log(empid);          
	// Andromeda.setSessionValue(empid,1000);
	 //console.log(Andromeda.setSessionValue(empid,1000));
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
	}
	
	 updating details of employee 
	
	$scope.adminupdate = function(UserData) {
		$http.post('/erp/ctc/adminupdate',UserData).then(  
				function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
			    		$("#com").show(); 
						alert("Profile Updated Successfully");
						Andromeda.showmodifyctcPage();
						swal({
							title: "Success!",
							text: "Employee Details Updated Successfully",
							type: "Success"
						}, function(){
							window.location.reload();
						});
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
		
		 Getting datails in revise ctc page based on empid 
		
		$scope.getctcDetails=function(empid){      
			console.log(empid);    
		 $http.post('/erp/ctc/getctcDetails',empid).then(function (response) {
			 $scope.data13 = response.data;
			 if ($scope.data13.successful) {
				 $scope.data = {object:$scope.data13.responseObject};
				 console.log($scope.data2);
				 console.log("Successful");
			 } else {
				 //alert("Error while getting data");
				 console.log("error") 
			 }
		 }, function (errResponse) {
			 console.error('Error while fetching notes');    
		 });   
		}
		
	 updating ctc in revise ctc page 
		
		$scope.applyctcrevision = function(UserData) {
			console.log(UserData);
			$http.post('/erp/ctc/applyctcrevision',UserData).then(  
					function(response) {    
						$scope.data = response.data;      
						if ($scope.data.successful) {
				    		$("#com").show(); 
							alert("CTC Updated Successfully");
							Andromeda.showmodifyctcPage();
							swal({
								title: "Success!",
								text: "Employee Details Updated Successfully",
								type: "Success"
							}, function(){
								window.location.reload();
							});
						} else {
							alert("Data not inserted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
	

}]);*/