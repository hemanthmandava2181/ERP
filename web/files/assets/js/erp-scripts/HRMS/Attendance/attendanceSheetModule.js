var employee = angular.module('attendanceSheetModule', []);
employee.controller('attendanceSheetController', ['$scope','$http',function($scope, $http) {

	/* Getting departments */

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
	
			/* Getting cadres */

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

			/* Getting Grades */

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
   
			
			/* getting calendar details based on from date,to date*/
			
			$scope.getCalendarDetails=function(data){
				var data1 = {
						
						from_date: document.getElementById('fromdate').value,
						to_date: document.getElementById('todate').value
     
					};
				console.log(data1);
		    $http.post('/erp/attendance/getCalendarDetails',data1).then(function(response) {
				$scope.data1 = response.data;
				if ($scope.data1.successful) {
					$scope.data = $scope.data1.responseObject;
					console.log($scope.data);
					for(var i = 0; i < $scope.data.length;i++){
						var presenceArr = $scope.data[i]['presence'].split(",");
						console.log(presenceArr);
						var tempArr = [];
						
						for(var j = 0; j < presenceArr.length; j++){
							var eachDateArr = presenceArr[j].split(":");
							
							if(eachDateArr[2] == "F"){
								eachDateArr[1] == "H";
							}
							var presenceObj = 
								{
									date : eachDateArr[0],
									status : eachDateArr[1],
									workingDayOrNot : eachDateArr[2]
								};
							tempArr.push(presenceObj);
						}
						$scope.data[i]['presenceArr'] = tempArr;
					}
				} else {
					console.log("Client error while getting data");
				}
			});  
			}		  
   
			/* Getting Details to the table */ 
			
			/*$scope.getDetails=function(data){
				console.log(data);
				if(data == undefined)
				{
					swal("OOPS!","Select all details","info");
				}
				else if(data.department == null || data.department == undefined || data.department == "")
				{
					swal("Oops...","Select Department","info");
				}
				else if(data.cader == null || data.cader == undefined || data.cader == "")
				{
					swal("Oops...","Select Cader","info");
				}
				else if(data.grade == null || data.grade == undefined || data.grade == "")
				{
					swal("Oops...","Select Grade","info");
				}
				else if(data.employee_type == null || data.employee_type == undefined || data.employee_type == "")
				{
					swal("Oops...","Select Employee Type","info");
				}
				else if(data.from_date == null || data.from_date == undefined || data.from_date == "")
				{
					swal("Oops...","Select From Date","info");
				}
				else if(data.to_date == null || data.to_date == undefined || data.to_date == "")
				{
					swal("Oops...","Select To Date","info");
				}
				else if(data.reporting_to == null || data.reporting_to == undefined || data.reporting_to == "")
				{
					swal("Oops...","Select Reporting Manager","info");
				}
				else if(data.location == null || data.location == undefined || data.location == "")
				{
					swal("Oops...","Select Location","info");
				}		
				else{
			$http.post('/erp/attendance/getDetails',data).then(function(response) {
				$scope.data = response.data;   
				if($scope.data.successful)
				{
					$scope.data = $scope.data.responseObject.dates;
					console.log($scope.data);
				}
				else
				{
					console.log("Client error while getting data");  
				}  
				});
			
				    
			}*/
			
			/* Updating Attendance */ 
			
			$scope.getstatus = function(student,presence1){
				/*alert(empid);*/
				console.log(student.empid);
				console.log(presence1.date);
				var details= {
						empid : student.empid,
						date : presence1.date
				}
				console.log(details);
				
				/*
				console.log(empid);*/
				$http.post('/erp/Employee/getstatus', details).then(
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
			
			/* absent */
			
			$scope.getstatusab = function(student,presence1){
				/*alert(empid);*/
				console.log(student.empid);
				console.log(presence1.date);
				var details= {
						empid : student.empid,
						date : presence1.date
				}
				console.log(details);
				
				
				console.log(ERP.setSessionValue("presence1.date"));
				
				/*
				console.log(empid);*/
				$http.post('/erp/Employee/getstatusab', details).then(
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
			
			
		/* for absent update */
			
			$scope.updateattendance = function(UserData){
				console.log(UserData);   
				console.log(UserData.empid);
				console.log(UserData.date);
				
				/*alert(UserData.empid);*/
				$http.post('/erp/attendance/updateattendance', UserData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Employee Attendance Successfully updated");
								ERP.showAttendanceSheet();
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};
			
			/* for present update */
			
			$scope.updateattendancepresent = function(UserData){
				console.log(UserData);   
				console.log(UserData.empid);
				console.log(UserData.date);				
				/*alert(UserData.empid);*/
				$http.post('/erp/attendance/updateattendancepresent', UserData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Employee Attendance Successfully updated");
								ERP.showAttendanceSheet();
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};
			
			/* for leave update */
			
			$scope.updateattendanceleave = function(UserData){
				/*console.log(UserData);      
				console.log(UserData.empid);   
				console.log(UserData.date);*/
				var details = {
						empid : UserData.empid,
						date : UserData.date 
				}
				console.log(details);
				
				/*alert(UserData.empid);*/
				$http.post('/erp/attendance/updateattendanceleave', details).then(
						function(response) {
							$scope.data = response.data;
							console.log($scope.data);
							if ($scope.data.successful) {
								alert("Employee Attendance Successfully updated");
								ERP.showAttendanceSheet();
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};

		} ]);