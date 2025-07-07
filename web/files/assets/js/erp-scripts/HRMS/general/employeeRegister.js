var empRegister = angular.module('employeeRegister', []);

empRegister.controller('employeeProfileController', ['$http','$scope', function($http, $scope) {
	
	
	     var empid = ERP.getSessionValue("employee_id");
	     console.log("empid " +empid);   
	     $http.post('/erp/employee/getDetails',empid).then(function (response) {
	    	 $("round_loader").show();
		    $scope.data = response.data;
		    if ($scope.data.successful) {  
		    	$("round_loader").hide();
		        $scope.data2 = {object:$scope.data.responseObject};
		        console.log("Successful");
		    } else {      
		    	$("round_loader").hide();
		    	//alert("Error while getting data");    
		    	console.log("error")                             
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
	
	/*var a = Andromeda.getSessionValue("employeeid");
	 alert(a);
	 $http.post('/erp/employee/getDetails', a).then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				console.log("Successful");
				$scope.data = {object:$scope.data.responseObject};
			}
			else
			{                                    
				console.log("NOT Successful");
				console.log("Client error while getting data");
			}
		},
		function(response)
		{
			console.log("Server error while getting data");
		});
	*/
	$scope.personaldata = function(UserData) {
		console.log(UserData);
		
		if(UserData == undefined)
		{
			swal("OOPS!","Fill all details","info");
		}
		else if(UserData.title == null || UserData.title == undefined || UserData.title == "")
		{
			swal("Oops...","Enter Title","info");
		}
		else if(UserData.first_name == null || UserData.first_name == undefined || UserData.first_name == "")
		{
			swal("Oops...","Enter First Name","info");
		}
		else if(UserData.last_name == null || UserData.last_name == undefined || UserData.last_name == "")
		{
			swal("Oops...","Enter Last Name","info");
		}
		else if(UserData.mobile == null || UserData.mobile == undefined || UserData.mobile == "")
		{
			swal("Oops...","Enter Mobile Number","info");
		}
		else if(UserData.dob == null || UserData.dob == undefined || UserData.dob == "")
		{
			swal("Oops...","Enter Date Of Birth","info");
		}
		else if(UserData.gender == null || UserData.gender == undefined || UserData.gender == "")
		{
			swal("Oops...","Enter Gender","info");
		}
		else if(UserData.aadhaar == null || UserData.aadhaar == undefined || UserData.aadhaar == "")
		{
			swal("Oops...","Enter Aadhaar Number","info");
		}
		else if(UserData.nationality == null || UserData.nationality == undefined || UserData.nationality == "")
		{
			swal("Oops...","Enter Nationality","info");
		}
		else if(UserData.nativity == null || UserData.nativity == undefined || UserData.nativity == "")
		{
			swal("Oops...","Enter Nativity","info");
		}
		else if(UserData.caste == null || UserData.caste == undefined || UserData.caste == "")
		{
			swal("Oops...","Enter Caste","info");
		}
		else if(UserData.blood_group == null || UserData.blood_group == undefined || UserData.blood_group == "")
		{
			swal("Oops...","Enter Blood Group","info");
		}
		else if(UserData.emergency_name == null || UserData.emergency_name == undefined || UserData.emergency_name == "")
		{
			swal("Oops...","Enter Emergency Name","info");
		}
		else if(UserData.emergency_contact == null || UserData.emergency_contact == undefined || UserData.emergency_contact == "")
		{
			swal("Oops...","Enter Emergency Contact","info");
		}
		else if(UserData.relation_id == null || UserData.relation_id == undefined || UserData.relation_id == "")
		{
			swal("Oops...","Enter Relation","info");
		}
		else if(UserData.city == null || UserData.city == undefined || UserData.city == "")
		{
			swal("Oops...","Enter City","info");
		}
		else if(UserData.street == null || UserData.street == undefined || UserData.street == "")
		{
			swal("Oops...","Enter Street","info");
		}
		else if(UserData.present_address == null || UserData.present_address == undefined || UserData.present_address == "")
		{
			swal("Oops...","Enter Address","info");
		}
		else if(UserData.state == null || UserData.state == undefined || UserData.state == "")
		{
			swal("Oops...","Enter State","info");
		}
		else if(UserData.districtid == null || UserData.districtid == undefined || UserData.districtid == "")
		{
			swal("Oops...","Enter District","info");
		}
		else if(UserData.pincode == null || UserData.pincode == undefined || UserData.pincode == "")
		{
			swal("Oops...","Enter Pincode","info");
		}
		else if(UserData.country == null || UserData.country == undefined || UserData.country == "")
		{
			swal("Oops...","Enter Country","info");
		}
		else if(UserData.company_name == null || UserData.company_name == undefined || UserData.company_name == "")
		{
			swal("Oops...","Enter Company Name","info");
		}
		else if(UserData.company_designation == null || UserData.company_designation == undefined || UserData.company_designation == "")
		{
			swal("Oops...","Enter Company Designation","info");
		}
		else if(UserData.from_date == null || UserData.from_date == undefined || UserData.from_date == "")
		{
			swal("Oops...","Enter From Date","info");
		}
		else if(UserData.to_date == null || UserData.to_date == undefined || UserData.to_date == "")
		{
			swal("Oops...","Enter To Date","info");
		}                      
		else
		{
         UserData.empid = ERP.getSessionValue("employee_id");
         console.log(UserData.empid);
		$http.post('/erp/employee/add',UserData).then(  
				function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
			    		$("#com").show(); 
						swal("Profile Updated Successfully");
						ERP.showProfilePage();
						/*swal({
							title: "Success!",
							text: "Employee Details Updated Successfully",
							type: "Success"
						}, function(){
							ERP.showEmployeeProfile();   
						});*/
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		}
		
	};
	
	
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
	
	
	/* Qualification and institute in Education tab */
	/*
	$http.get('/erp/employee/getInstitutes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.institutes = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	},
	function(response)
	{
		console.log("Server error while getting data");
	});*/
	
	
	$http.get('/erp/employee/getQualifications').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)   
		{
			$scope.qualifications = $scope.data.responseObject;
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
	
	/* getting months */
	$http.get('/erp/employee/getMonths').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)   
		{
			$scope.months = $scope.data.responseObject;
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
	
	/* getting months */
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
	    
	
	$scope.comm = function() {
		$("#com").show();
	
	}	
	
	/* Adding Educational Details */   
	$scope.addEducationaldetails = function(EducationData) {
		console.log(EducationData);
		EducationData.empid = ERP.getSessionValue("employee_id");
        console.log(EducationData.empid);
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
							ERP.showEmployeeProfile();   
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
			/*if(FamilyData == undefined)
			{
				swal("OOPS!","Fill all details","info");
			}
			else if(FamilyData.name == null || FamilyData.name == undefined || FamilyData.name == "")
			{
				swal("Oops...","Enter Name","info");
			}
			else if(FamilyData.dob1 == null || FamilyData.dob1 == undefined || FamilyData.dob1 == "")
			{
				swal("Oops...","Enter Date of Birth","info");
			}
			else if(FamilyData.relationid == null || FamilyData.relationid == undefined || FamilyData.relationid == "")
			{
				swal("Oops...","Enter Relation","info");
			}
			else{*/
			FamilyData.empid = ERP.getSessionValue("employee_id");
	        console.log(FamilyData.empid);
			$http.post('/erp/employee/addFamilydetails',FamilyData).then(function(response) {    
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
		
		/* getting education details to table */
		$scope.getEducationDetails = function() {
			var empid = ERP.getSessionValue("employee_id");
		    console.log("empid " +empid);   
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
		$scope.getFamilydetails = function() { 
			var empid = ERP.getSessionValue("employee_id");   
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
		
	
} ]);