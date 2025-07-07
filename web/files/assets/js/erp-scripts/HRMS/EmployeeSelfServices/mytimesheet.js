var employee = angular.module('mytimesheet', []);
employee.controller('MytimesheetController',['$scope','$http',function($scope,$http)
	{
	
	$scope.getdata=function(data){
		console.log(data);
		var empid = ERP.getSessionValue("employee_id");
		console.log("empid " +empid);
		var details = {
				empid : empid,
				from_date : data.from_date,
				to_date :data.to_date  
		}
		console.log(details);   
		/*if(data == undefined)   
		{
			swal("OOPS!","Select all details","info");
		}
		else if(data.from_date == null || data.from_date == undefined || data.from_date == "")
		{
			swal("Oops...","Select From Date","info");
		}
		else if(data.to_date == null || data.to_date == undefined || data.to_date == "")
		{
			swal("Oops...","Select To Date","info");
		}	
		else{*/
	$http.post('/erp/Employee/getdata',details).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.userdetails = $scope.data.responseObject.dates;
			console.log($scope.userdetails);
		}
		else
		{
			console.log("Client error while getting data");  
		}  
	   });	
     
   }     
	
	/*  getting data based on empid */
	
	/*$scope.getByIddata = function(empid){
		alert(empid);
		$http.post('/erp/Employee/getByIddata', empid).then(
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
	};*/
	
	$scope.getByIddata = function(task){
		
		alert(task);
		$http.post('/erp/Employee/getByIddata', task).then(
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
	
	/* Deleting data based on task */
	
	$scope.removeData = function(data) {   
		console.log(data.task);
		$http.post('/erp/Employee/removeData', data.task).then(
				function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {  
						/*location.reload();*/
						swal("Task removed Successfully");
						ERP.showMyTimeSheet();
					} else {
						alert("Data not Deleted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	/* updating data based on task */
			
	$scope.updatedata = function(UserData){
		console.log(UserData);     
		alert(UserData.task);
		$http.post('/erp/Employee/updatedata', UserData).then(
				function(response) {
						$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Task Successfully updated");
								ERP.showMyTimeSheet();
								/*Andromeda.showTimesheetpage();*/
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};
	    
}]);