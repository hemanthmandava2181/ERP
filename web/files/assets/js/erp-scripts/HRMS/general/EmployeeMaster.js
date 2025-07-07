var employee = angular.module('EmployeeMaster', []);

employee.filter('numberFormat', function () {
	return function(input) {   
	     input = input || 0;
	     var out = new Intl.NumberFormat('en-IN').format(parseInt(input));
	     return out;
	};
})  
                                
.filter('sumOfValue', function() {
    return function(data, key) {
      if (angular.isUndefined(data) || angular.isUndefined(key))
        return 0;
      var sum = 0;
      angular.forEach(data, function(v, k) {
        sum = sum + parseInt(v[key]);
      });    
      return sum;  
    };
 })

employee.controller('EmployeeMasterController',['$scope','$http',function($scope,$http)
{
	
	$scope.name=null,$scope.filteredResult = null;
    
	$scope.getNameWiseData = function(obj) {      
		$scope.getBranchWisePrograms = function(totalObj)
		{
			ERP.setSessionValue("studentBranchId", totalObj.empid);
			
			$("#glyphiconid").show();        
			$scope.name = totalObj.name;
			$http.post('/erp/Employee/getBranchWisePrograms', totalObj.empid).then(function(response)
			{
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.regdetails = $scope.data.responseObject;
					/*$("#div1").hide();
					$("#lb6b").show();
					$("#div4").hide();*/
					$("#glyphiconid").hide();
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
		}; 
	}     
	
	$scope.getemployeemaster = function(Data){
		$("#loader").show();
		console.log(Data);
		$http.post('/erp/Employee/getemployeemaster',Data).then(function (response) {
			    
		    $scope.data = response.data;
		    if($scope.data.successful)
			{
		    	$("#loader").hide();
				$scope.regdetails = $scope.data.responseObject;
				console.log($scope.regdetails);
			}
			else
			{
				$("#loader").hide();
				console.log("Client error while getting data");  
			}
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
	}
	
	
	
/* Getting details based on empid */
	
	$scope.getDetails=function(empid){      
		$("loader").show();
	 $http.post('/erp/ctc/getDetails',empid).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $("loader").hide();
			 $scope.data = {object:$scope.data.responseObject};
			
		 } else {  
				$("#loader").hide();   
			 //alert("Error while getting data");
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');    
	 });   
	}
	
	/* updating details of employee */
	
	$scope.adminupdate = function(UserData) {
		$("loader").show();
		$http.post('/erp/ctc/adminupdate',UserData).then(function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
						$("loader").hide();
			    		$("#com").show(); 
						swal("Profile Updated Successfully");
						ERP.showEmployeeMaster();
						
					} else {
					$("#loader").hide();
						alert("Data not Updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	
	/* Update Data based on empid */
	/* Getting Details based on empid */
		$scope.getById = function(empid){
			$("#loader").show();
			$http.post('/erp/Employee/getById', empid).then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
				$("#loader").hide();
					$scope.data={object:$scope.data.responseObject};
				} else {
				$("#loader").hide();
					alert("Error while getting data");
				}
			}, function(errResponse) {
				console.error('Error while fetching notes');
			});
		};
		
	/* Updating Data based on empid */
		
		$scope.updateData = function(UserData){
			$("#loader").show();
			$http.post('/erp/Employee/updateData', UserData).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
						$("#loader").hide();
							/*alert("Employee Details Successfully updated");*/
							swal({
								title: "Success!",
								text: "Status Updated Successfully",
								icon: "Success",
								button: "Done"
							}, function(){
								ERP.showEmployeeMaster();   
							});
						} else {
						$("#loader").hide();
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
		
		$http.get('/erp/employee/getCaders').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.caders = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		/* getting grades */
		$http.get('/erp/employee/getGrades').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.grades = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");
			}
		},
		function(response)
		{       
			console.log("Server error while getting data");
		});
		
		/* getting departments */
		$http.get('/erp/employee/getDepartment').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.departments = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		/* Getting reporting to */
		$http.get('/erp/employee/getReporting').then(function(response) {
		$("#loader").show();      
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.reportings = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");    
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		  
		/* Getting Employee type */

		$http.get('/erp/Employee/getStaff').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if ($scope.data.successful) {
			$("#loader").hide();
				$scope.types = $scope.data.responseObject;
			} else {
			$("#loader").hide();
				console.log("Client error while getting data");
			}
		}, function(response) {
			console.log("Server error while getting data");   
		});
		
		/* getting ctc calculator */
		
		$http.get('/erp/employee/getctccalculator').then(function(response) {  
		$("#loader").show();
			$scope.data = response.data;
			if ($scope.data.successful) {
			$("#loader").hide();
				$scope.ctcs = $scope.data.responseObject;
			} else {
			$("#loader").hide();
				console.log("Client error while getting data");
			}
		}, function(response) {
			console.log("Server error while getting data");
		});
		
		
		$http.get('/erp/employee/getRelations').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.relations = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
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
		
		$http.get('/erp/employee/getDesignation').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.designations = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		$http.get('/erp/employee/getDivision').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.divisions = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		$http.get('/erp/employee/getCost_center').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.cost_centers = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");    
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
		
		/* Getting Projects */
		$http.get('/erp/employee/getprojects').then(function(response) {
		$("#loader").show();
			$scope.data = response.data;
			if($scope.data.successful)
			{
			$("#loader").hide();
				$scope.projects = $scope.data.responseObject;
			}
			else
			{
			$("#loader").hide();
				console.log("Client error while getting data");    
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		}); 
		
		/* Adding Educational Details */   
		$scope.addEducationaldetails = function(EducationData) {
		$("#loader").show();
		$http.post('/erp/employee/addEducationaldetails',EducationData).then(  
					function(response) {    
						$scope.data = response.data;               
						if ($scope.data.successful) {
							$("#loader").hide();		
							swal("Education Details Inserted Successfully");
							ERP.showEmployeeProfile();
						} else {
						$("#loader").hide();
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			}; 
		
		/* getting education details to table */
		$scope.getEducationDetails = function(empid) {   
		$("#loader").show(); 
		    console.log(empid);   
			$http.post('/erp/employee/getEducationDetails',empid).then(function(response) {
				var sum = 0;
				$scope.data = response.data;
				if ($scope.data.successful) {
				$("#loader").hide();
					$scope.educations = $scope.data.responseObject.educations;
				} else {
				$("#loader").hide();
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');  
			});
		};
		
		/* getting family details to table */
		$scope.getFamilydetails = function(empid) { 
		$("#loader").show();   
		    console.log(empid);   
			$http.post('/erp/employee/getFamilydetails',empid).then(function(response) {
				var sum = 0;
				$scope.data = response.data;
				if ($scope.data.successful) {
				$("#loader").hide();
					$scope.familydet = $scope.data.responseObject.families;
				} else {    
				$("#loader").hide();
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');  
			});
		};
		
		/* deleting education details based on id */
		$scope.DeleteEducation = function(id) {   
		$("#loader").show();
			console.log(id);
			$http.post('/erp/employee/DeleteEducation', id).then(
					function(response) {
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) {  
						$("#loader").hide();
							/*location.reload();*/  
							swal("Data removed Successfully");        
							ERP.showEmployeeMaster();   
						} else {
						$("#loader").hide();
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};     
		
		$http.get('/erp/employee/getCastes').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)   
			{
				$scope.casts = $scope.data.responseObject;
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
		
		/* Adding Educational Details */   
		$scope.addFamilydetails = function(FamilyData) {
		$("#loader").show();
			console.log(FamilyData);
			$http.post('/erp/employee/addFamilydetails',FamilyData).then(  
					function(response) {    
						$scope.data = response.data;               
						if ($scope.data.successful) {
						$("#loader").hide();
							console.log("Successful");		
							swal("Family Details Inserted Successfully");
							ERP.showEmployeeMaster();
						} else {
						$("#loader").hide();
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			}; 
		         

		/* deleting education details based on id */
		$scope.DeletefamilyDet = function(id) {  
		$("#loader").show(); 
			console.log(id);
			$http.post('/erp/employee/DeletefamilyDet', id).then(
					function(response) {
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) {
						$("#loader").hide();  
							/*location.reload();*/
							swal("Data removed Successfully");
							ERP.showEmployeeMaster();   
						} else {
						$("#loader").hide();
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
	           
	
}]);