var empRegister = angular.module('hrprofile', []);
empRegister.controller('HrprofileController', ['$http','$scope', function($http, $scope) {
	
	
	      	 var empid = Andromeda.getSessionValue("employeeid");
	    	 console.log("empid " +empid);   
	     $http.post('/erp/employee/gethrDetails',empid).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data2 = {object:$scope.data13.responseObject};
		        console.log("Successful");
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")                             
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		       
	$scope.personaldata = function(UserData) {
		
		/*if(UserData == undefined)
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
		else if(UserData.alternate_mobile == null || UserData.alternate_mobile == undefined || UserData.alternate_mobile == "")
		{
			swal("Oops...","Enter Alternate Mobile Number","info");
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
			swal("Oops...","Enter Aadhaar","info");
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
		else if(UserData.sub_caste == null || UserData.sub_caste == undefined || UserData.sub_caste == "")
		{
			swal("Oops...","Enter Sub Caste","info");
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
		else if(UserData.relation == null || UserData.relation == undefined || UserData.relation == "")
		{
			swal("Oops...","Enter Relation","info");
		}
		else if(UserData.pincode == null || UserData.pincode == undefined || UserData.pincode == "")
		{
			swal("Oops...","Enter Pincode","info");
		}
		else if(UserData.dno == null || UserData.dno == undefined || UserData.dno == "")
		{
			swal("Oops...","Enter Door Number","info");
		}
		else if(UserData.village == null || UserData.village == undefined || UserData.village == "")
		{
			swal("Oops...","Enter Village","info");
		}
		else if(UserData.mandal == null || UserData.mandal == undefined || UserData.mandal == "")
		{
			swal("Oops...","Enter Mandal","info");
		}
		else if(UserData.districtid == null || UserData.districtid == undefined || UserData.districtid == "")
		{
			swal("Oops...","Enter District","info");
		}
		else if(UserData.state == null || UserData.state == undefined || UserData.state == "")
		{
			swal("Oops...","Enter State","info");
		}
		else if(UserData.company_name == null || UserData.company_name == undefined || UserData.company_name == "")
		{
			swal("Oops...","Enter Company Name","info");
		}
		else if(UserData.designation == null || UserData.designation == undefined || UserData.designation == "")
		{
			swal("Oops...","Enter Designation","info");
		}
		else if(UserData.from_date == null || UserData.from_date == undefined || UserData.from_date == "")
		{
			swal("Oops...","Enter From Date","info");
		}
		else if(UserData.to_date == null || UserData.to_date == undefined || UserData.to_date == "")
		{
			swal("Oops...","Enter TO Date","info");
		}
		else if(UserData.name == null || UserData.name == undefined || UserData.name == "")
		{
			swal("Oops...","Enter Relation Name","info");
		}
		else if(UserData.dob1 == null || UserData.dob1 == undefined || UserData.dob1 == "")
		{
			swal("Oops...","Enter Date Of Birth","info");
		}
		else if(UserData.relationid == null || UserData.relationid == undefined || UserData.relationid == "")
		{
			swal("Oops...","Select Relation Type","info");
		}                 
		else
		{*/
         UserData.empid = Andromeda.getSessionValue("employeeid");
         console.log(UserData.empid);
		$http.post('/erp/employee/add3',UserData).then(
				function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
			    		$("#com").show(); 
						alert("Profile Updated Successfully");
						Andromeda.showhrprofile();
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
	/* getting education details to table */
	
	/* var empid = Andromeda.getSessionValue("employeeid");
	 console.log("empid " +empid); */
	$http.post('/erp/employee/getAll').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.userdetails = $scope.data.responseObject;
		} else {
			alert("Can't view the Data");
		}
	}, function(errResponse) {
		console.error('Error while viewing notes');  
	});
	
	
	/*$http.get('/erp/employee/getCaders').then(function(response) {
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
	});*/
	
	
	/* Qualification and institute in Education tab */
	
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
	});
	
	
	$scope.getQualifications = function(totalObj)
	{
		console.log(totalObj);
		$http.post('/erp/employee/getQualifications', totalObj.institute_id).then(function(response)
		{
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.qualifications = $scope.data.responseObject;
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
	    
	
	$scope.comm = function() {
		$("#com").show();
	
	}	 
} ]);