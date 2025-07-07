var bankstatementdata = angular.module('profileReportModule', []);
bankstatementdata
.controller(
'ProfileReportController',
[
'$scope',
'$http',
function($scope, $http) {



$http.get('/erp/report/GetProfilereport').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.GetProfilereport = $scope.data.responseObject;
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


$scope.getemployeemaster = function(Data){
		$("#loader_").show();
		console.log(Data);
		$http.post('/erp/Employee/getemployeemaster',Data).then(function (response) {
			    
		    $scope.data = response.data;
		    if($scope.data.successful)
			{
		    	$("#loader_").hide();
				$scope.regdetails = $scope.data.responseObject;
				console.log($scope.regdetails);
			}
			else
			{
				$("#loader_").hide();
				console.log("Client error while getting data");  
			}
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
	}
	
	
	
/* Getting details based on empid */
	
	$scope.getDetails=function(empid){      
		console.log(empid);
		$("round_loader").show();
	 $http.post('/erp/ctc/getDetails',empid).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $("round_loader").hide();
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);
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
		$http.post('/erp/ctc/adminupdate',UserData).then(function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
			    		$("#com").show(); 
						swal("Profile Updated Successfully");
						ERP.showEmployeeMaster();
						/*swal({
							title: "Success!",
							text: "Employee Details Updated Successfully",
							type: "Success"
						}, function(){
							window.location.reload();
						});*/
					} else {
						alert("Data not Updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	
	/* Update Data based on empid */
	/* Getting Details based on empid */
		$scope.getById = function(empid){
			/*alert(empid);*/
			$http.post('/erp/Employee/getById', empid).then(
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
		
	/* Updating Data based on empid */
		
		$scope.updateData = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/Employee/updateData', UserData).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
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
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
		/* getting caders */
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
		
		/* getting grades */
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
		
		/* getting departments */
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
		
		/* getting ctc calculator */
		
		$http.get('/erp/employee/getctccalculator').then(function(response) {  
			$scope.data = response.data;
			if ($scope.data.successful) {
				$scope.ctcs = $scope.data.responseObject;
			} else {
				console.log("Client error while getting data");
			}
		}, function(response) {
			console.log("Server error while getting data");
		});
		
		
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
		
		$http.get('/erp/employee/getCast').then(function(response) {
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
		
		/* Adding Educational Details */   
		$scope.addEducationaldetails = function(EducationData) {
			console.log(EducationData);
			$http.post('/erp/employee/addEducationaldetails',EducationData).then(  
					function(response) {    
						$scope.data = response.data;               
						if ($scope.data.successful) {
							console.log("Successful");		
							swal("Education Details Inserted Successfully");
							ERP.showEmployeeProfile();
						} else {
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			}; 
		
		/* getting education details to table */
		$scope.getEducationDetails = function(empid) {    
		    console.log(empid);   
			$http.post('/erp/employee/getEducationDetails',empid).then(function(response) {
				var sum = 0;
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.educations = $scope.data.responseObject.educations;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');  
			});
		};
		
		/* getting family details to table */
		$scope.getFamilydetails = function(empid) {    
		    console.log(empid);   
			$http.post('/erp/employee/getFamilydetails',empid).then(function(response) {
				var sum = 0;
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.familydet = $scope.data.responseObject.families;
				} else {    
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');  
			});
		};
		
		/* deleting education details based on id */
		$scope.DeleteEducation = function(id) {   
			console.log(id);
			$http.post('/erp/employee/DeleteEducation', id).then(
					function(response) {
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) {  
							/*location.reload();*/  
							swal("Data removed Successfully");        
							ERP.showEmployeeMaster();   
						} else {
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};     
		
		/* Adding Educational Details */   
		$scope.addFamilydetails = function(FamilyData) {
			console.log(FamilyData);
			$http.post('/erp/employee/addFamilydetails',FamilyData).then(  
					function(response) {    
						$scope.data = response.data;               
						if ($scope.data.successful) {
							console.log("Successful");		
							swal("Family Details Inserted Successfully");
							ERP.showEmployeeMaster();
						} else {
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			}; 
		

		/* deleting education details based on id */
		$scope.DeletefamilyDet = function(id) {   
			console.log(id);
			$http.post('/erp/employee/DeletefamilyDet', id).then(
					function(response) {
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) {  
							/*location.reload();*/
							swal("Data removed Successfully");
							ERP.showEmployeeMaster();   
						} else {
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};


}]);