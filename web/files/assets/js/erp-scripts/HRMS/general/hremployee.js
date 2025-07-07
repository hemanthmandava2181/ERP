var hrRegister = angular.module('hremployee', []);

hrRegister.directive('datepicker', function () {
    return {
    	 restrict: 'A',
         require: 'ngModel',
          link: function (scope, element, attrs) {
             $(element).datepicker({
             	maxDate : new Date,
     			changeMonth : true,
     			changeYear : true,   
     			dateFormat : 'dd-mm-yy',
     			yearRange : '-50:+0',
                 onSelect: function (date) {
                     scope.date = date;
                     scope.$apply();
                }
            });
        }
    };      
});


/*var empid = ERP.getSessionValue("empid");
console.log("empid " +empid); */ 


hrRegister.controller('hrController', ['$http','$scope', function($http, $scope) {
	    	 /*console.log("empid ::" +ERP.getSessionValue("employee_id"));   
	     $http.post('/erp/employee/getDetails',ERP.getSessionValue("employee_id")).then(function (response) {
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
		});   */
		       
	   /* Calculating contract duration */
	     
	     $scope.contractDuration = function(data) {
	    	 console.log(data.contract_from);
	    	 console.log(data.contract_to);
	    	 
	    	 /* contract_from date */
	    	 var date = new Date(data.contract_from);
	    	 var dd = ("0" + date.getDate()).slice(-2);
	    	 var mm = ("0" + (date.getMonth() + 1)).slice(-2);
	    	 var yyyy = date.getFullYear();
	    	 var date1 = yyyy + "-" + mm + "-" + dd;
	    	 
	    	 /* contract_to date */
	    	 var date = new Date(data.contract_to);
	    	 var dd = ("0" + date.getDate()).slice(-2);
	    	 var mm = ("0" + (date.getMonth() + 1)).slice(-2);
	    	 var yyyy = date.getFullYear();
	    	 var date2 = yyyy + "-" + mm + "-" + dd;
	    	 
	    	 var obj = {   
	    			 contract_from : date1,
	    			 contract_to : date2	    			 
	    	 }  
	    	 console.log(obj);
	    	 
	    	 var Difference_In_Time = date2.getTime() - date1.getTime();
	    	 var Difference_In_Days = Difference_In_Time / (1000 * 3600 * 24);
	    	 document.getElementById("probationPeriodId").value = Math.round((Difference_In_Days/30));
	    	 
	    
	    	  
	    	 }
	
	$scope.hrdata = function(UserData) {
		$("#round_loader").show();
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
		else if(UserData.mobile == null || UserData.mobile == undefined || UserData.mobile == "")
		{
			swal("Oops...","Enter Phone Number","info");
		}
		else if(UserData.email == null || UserData.email == undefined || UserData.email == "")
		{
			swal("Oops...","Enter Email","info");
		}
		else if(UserData.company_email == null || UserData.company_email == undefined || UserData.company_email == "")
		{
			swal("Oops...","Enter Company Email","info");
		}
		else if(UserData.caderid == null || UserData.caderid == undefined || UserData.caderid == "")
		{
			swal("Oops...","Enter Cader","info");
		}
		else if(UserData.gradeid == null || UserData.gradeid == undefined || UserData.gradeid == "")
		{
			swal("Oops...","Enter Grade","info");
		}
		else if(UserData.joining_date == null || UserData.joining_date == undefined || UserData.joining_date == "")
		{
			swal("Oops...","Enter Joining Date","info");
		}
		else if(UserData.confirmed_date == null || UserData.confirmed_date == undefined || UserData.confirmed_date == "")
		{
			swal("Oops...","Enter Confirmed Date","info");
		}
		else if(UserData.contract_from == null || UserData.contract_from == undefined || UserData.contract_from == "")
		{
			swal("Oops...","Enter Contract From","info");
		}
		else if(UserData.contract_to == null || UserData.contract_to == undefined || UserData.contract_to == "")
		{
			swal("Oops...","Enter Contract To","info");
		}
		else if(UserData.departmentid == null || UserData.departmentid == undefined || UserData.departmentid == "")
		{
			swal("Oops...","Enter Department","info");
		}
		else if(UserData.designationid == null || UserData.designationid == undefined || UserData.designationid == "")
		{
			swal("Oops...","Enter Designation","info");
		}
		else if(UserData.divisionid == null || UserData.divisionid == undefined || UserData.divisionid == "")
		{
			swal("Oops...","Enter Division","info");
		}
		else if(UserData.cost_centerid == null || UserData.cost_centerid == undefined || UserData.cost_centerid == "")
		{
			swal("Oops...","Enter Cost Center","info");
		}
		else if(UserData.reporting == null || UserData.reporting == undefined || UserData.reporting == "")
		{
			swal("Oops...","Enter Reporting To","info");
		}
		else if(UserData.id == null || UserData.id == undefined || UserData.id == "")
		{
			swal("Oops...","Enter Location","info");
		}
		else if(UserData.notice_period == null || UserData.notice_period == undefined || UserData.notice_period == "")
		{
			swal("Oops...","Enter Notice Period","info");
		}
		else if(UserData.bank_acno == null || UserData.bank_acno == undefined || UserData.bank_acno == "")
		{
			swal("Oops...","Enter Account Number","info");
		}
		else if(UserData.bank_name == null || UserData.bank_name == undefined || UserData.bank_name == "")
		{
			swal("Oops...","Enter Bank Name","info");
		}
		else if(UserData.brach == null || UserData.brach == undefined || UserData.brach == "")
		{
			swal("Oops...","Enter Branch of Bank","info");
		}
		else if(UserData.ifsc_code == null || UserData.ifsc_code == undefined || UserData.ifsc_code == "")
		{
			swal("Oops...","Enter IFSC Code","info");
		}
		else if(UserData.pan_no == null || UserData.pan_no == undefined || UserData.pan_no == "")
		{
			swal("Oops...","Enter PAN Number","info");
		}
		else if(UserData.ctc == null || UserData.ctc == undefined || UserData.ctc == "")
		{
			swal("Oops...","Enter CTC","info");
		}
		else   
		{*/
		console.log(UserData);
		$http.post('/erp/employee/createemployee',UserData).then(  
				function(response) {    
					$scope.data = response.data;   
					console.log($scope.data);
					if ($scope.data.successful) {
						$("#round_loader").hide();
			    		/*	$("#com").show(); */       
						/*alert("Employee Created Successfully");*/
						/*ERP.showHrEmployeePage();*/
						swal({
							title: "Success!",       
							text: "Employee created Successfully",
							icon: "Success",
							button: "Done"
						}, function(){
							ERP.showCreateEmployee();         
						});
					} else {
						$("#round_loader").hide();
						alert("Data not inserted");    
					}       
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
/*	Getting all Data at a time*/
	
	/*$http.get('/erp/employee/getAlldata').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.caders = $scope.data.responseObject.getAllCaders;
			$scope.grades = $scope.data.responseObject.getAllGrades;
			$scope.departments = $scope.data.responseObject.getDepartments;
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
	*/
	
	   
	
	
	
	   
	
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
	
} ]);