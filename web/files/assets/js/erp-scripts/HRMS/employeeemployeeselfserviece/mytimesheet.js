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
	
	
	
	$scope.getByIddata = function(data){
		
		
		$http.post('/erp/Employee/getByIddata', data).then(
				function(response) {
					$scope.mytimesheetdata = response.data;
					if ($scope.mytimesheetdata.successful) {
						$scope.data={object:$scope.mytimesheetdata.responseObject};
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
						
						alert("Task removed Successfully");
						/*ERP.showMyTimesheet();*/
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
		$http.post('/erp/Employee/updatedata', UserData).then(
				function(response) {
						$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Task Successfully updated");
								/*ERP.showMyTimesheet();*/
								
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};   
	    
}]);