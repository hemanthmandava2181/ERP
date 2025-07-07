var employee = angular.module('ontravelrequest', []);
employee.controller('OntravelController',['$scope','$http',function($scope,$http)
	{
	$scope.addontravel= function(UserData) {/*{
		console.log(UserData);
		 if(UserData==null || UserData=='' || UserData==undefined)
		  {
		  	swal("Enter all details!");
		  }
		else if(UserData.start_date == null || UserData.start_date == '' || UserData.start_date== undefined)
		  {
		  	swal("Select Start Date!");
		  }
		 else if(UserData.end_date == null || UserData.end_date == '' || UserData.end_date == undefined)
		  {
		  	swal("Select End Date");
		  }
		 else if(UserData.nature_of_assignment == null || UserData.nature_of_assignment == '' || UserData.nature_of_assignment == undefined)
		  {
		  	swal("Enter Nature Of Assignment!");
		  }   
		 else if(UserData.location == null || UserData.location  == '' || UserData.location == undefined)
		  {
		  	swal("Enter Location!");
		  }
		 else if(UserData.project == null || UserData.project == '' || UserData.project == undefined)
		  {
		  	swal("Select Project");
		  }
		 else if(UserData.reporting_to == null || UserData.reporting_to== '' || UserData.reporting_to == undefined)
		  {
		  	swal("Enter Reporting To!");
		  } 
		    else if(UserData.ontravel_contact== null || UserData.ontravel_contact == '' || UserData.ontravel_contact == undefined)
		  {
		  	swal("Enter On Travel Contact Number");
		  }
		 else if(UserData.ontravel_reporting_to == null || UserData.ontravel_reporting_to== '' || UserData.ontravel_reporting_to == undefined)
		  {
		  	swal("Enter Reporting To!");
		  } 
		   else if(UserData. description  == null || UserData. description  == '' || UserData. description  == undefined)
		  {
		  	swal("Enter Description");
		  }
		
		 else{    */

	UserData.empid = ERP.getSessionValue("employee_id");

		console.log(UserData);
		alert(UserData.location + ' Insertion Successful');
		$http.post('/erp/selfservice/addontravel', UserData).then(   
				function(response) {
					$scope.data = response.data;   
					if ($scope.data.successful) { 
						swal(" Inserted Successfully");
					} else {
						swal("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	
	};	
	var empid = ERP.getSessionValue("employee_id");
	console.log("empid " + empid);
	$http.post('/erp/selfservice/getReporting', empid).then(
			function(response) {
				$scope.data13 = response.data;
				if ($scope.data13.successful) {
					$scope.traveldetails = {
						object : $scope.data13.responseObject
					};
					console.log("Successful");   
				} else {
					// alert("Error while getting data");
					console.log("error")

				}
			}, function(errResponse) {
				console.error('Error while fetching notes');
			});

		//Get Data from Database based on group_name
		
		$scope.getById2= function(location){
			alert(location);
			$http.post('/erp/selfservice/getById2',location).then(
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
		
		//Update User Details
		$scope.updateData2 = function(UserData){
			alert(UserData.location);
			$http.post('/erp/selfservice/updateData2', UserData).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							alert("Successfully updated");
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};

		//Update User Details
		$scope.updateData2Cancel = function(UserData){
			$http.post('/erp/selfservice/updateData2Cancel', UserData).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							alert("Successfully updated");
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};

		// Delete UserData based on Name
		$scope.removeData2 = function(location) {
			$http.post('/erp/selfservice/removeData2',location).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							location.reload();
							alert("User Data removed Successfully");
						} else {
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});		 
		};

$http.get('/erp/selfservice/getAlltravel').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.ontraveldetails = $scope.data.responseObject;
		console.log($scope.ontraveldetails);
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
$http.get('/erp/employee/getEmp').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.empnames = $scope.data.responseObject;
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
$http.get('/erp/selfservice/getProjects').then(function(response) {
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
$http.get('/erp/selfservice/getReportings').then(function(response) {
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
}]);
