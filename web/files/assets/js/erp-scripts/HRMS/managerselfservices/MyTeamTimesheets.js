var sheets = angular.module('sheetsModule', []);
sheets.controller('sheetsController',['$scope','$http',function($scope,$http)
{
	$scope.getTeamSheets = function(data)
	{        
		/*console.log(data); 
		if(data==null || data=='' || data==undefined)
		  {
		  	swal("Enter all details!");      
		  }
		 
		 else if(data.from_date == null || data.from_date == '' || data.from_date== undefined)
		  {
		  	swal("Select From Date!");
		  }
		 else if(data.to_date == null || data.to_date == '' || data.to_date == undefined)
		  {
		  	swal("Select To Date!");
		  }
	
		 
		 else{*/
		$http.post('/erp/timesheet/getTeamSheets',data).then(function(response)
		{   
			console.log(data);  
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					
				console.log($scope.data);  
				$scope.empdetails = $scope.data.responseObject.centers;                  
			}          
			else
			{              
				var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				jQuery("#errorDiv").html(message);
			}
		},     
		function(errResponse)   
		{
			console.error('Error while fetching notes');
		});
		 }

	
	
	
/*	$scope.getAttSheets = function(data)
	{      
		console.log(data); 
		if(data==null || data=='' || data==undefined)
		  {
		  	swal("Enter all details!");
		  }
		 
		 else if(data.from_date == null || data.from_date == '' || data.from_date== undefined)
		  {
		  	swal("Select From Date!");
		  }
		 else if(data.to_date == null || data.to_date == '' || data.to_date == undefined)
		  {
		  	swal("Select To Date!");
		  }
		 else
			 {
		
		$http.post('timesheet/getAttSheets',data).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					
				console.log($scope.data);  
				$scope.attdetails = $scope.data.responseObject.centers;                  
			}          
			else
			{              
				var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				jQuery("#errorDiv").html(message);
			}
		},     
		function(errResponse)   
		{
			console.error('Error while fetching notes');
		}); 
			 }
	};
		 */
	$http.get('/erp/timesheet/getReportings').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.reportings = $scope.data.responseObject;
			console.log($scope.reportings);
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
	//Update User Details
	$scope.updateDataapprove = function(UserData){

		$http.post('/erp/timesheet/updateDataapprove', UserData).then(
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
	$scope.updateDatareject = function(UserData){
		$http.post('/erp/timesheet/updateDatareject', UserData).then(
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
	
	
	
	
	
	
	/* getting calendar details based on from date,to date*/
	$scope.getCalendarDetails=function(data){
		var details = {
				
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value
				
			};
		console.log(details);
    $http.post('/erp/attendance/getCalendarDetails',details).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			console.log(details);
			$scope.calendardetails = $scope.data.responseObject;
			console.log(response.data.responseObject);
			$scope.data = {
					object : data
			};  
			
		} else {
			console.log("Client error while getting data");
		}
	});  

	
	}
	
	$scope.getAttSheets = function(data)
	{         
		/*console.log(data1); 
		if(data1==null || data1=='' || data1==undefined)
		  {
		  	swal("Enter all details!");
		  }
		 
		 else if(data1.from_date == null || data1.from_date == '' || data1.from_date== undefined)
		  {
		  	swal("Select From Date!");
		  }
		 else if(data1.to_date == null || data1.to_date == '' || data1.to_date == undefined)
		  {
		  	swal("Select To Date!");
		  }
		 else
		 {
		*/
			 
		$http.post('/erp/timesheet/getAttSheets',data).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					            
				console.log($scope.data);  
				$scope.attdetails = $scope.data.responseObject.centers;                  
			}          
			else
			{              
				var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				jQuery("#errorDiv").html(message);
			}
		},     
		function(errResponse)   
		{    
			console.error('Error while fetching notes');
		}); 
			 
	};       
	
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
	
	
}]);