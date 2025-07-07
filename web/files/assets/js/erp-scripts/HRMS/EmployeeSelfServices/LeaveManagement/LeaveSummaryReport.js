var LeaveSummaryModule= angular.module('LeaveSummaryModule', []);
LeaveSummaryModule.controller('LeaveSummaryController',['$scope','$http',function($scope,$http)
{
	$scope.getLeaveSummaryReport= function(data)
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
		$http.post('/erp/report/getLeaveSummaryReport',data).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                          
			{      	    					
				console.log($scope.data);  
				$scope.leavesummarydetails = $scope.data.responseObject.centers;                  
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
	
	$http.get('/erp/report/getYears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.years = $scope.data.responseObject;
			console.log($scope.years);
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
	$http.get('/erp/report/getQuarters').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.quarters = $scope.data.responseObject;
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
	
	
	$http.get('/erp/report/getCalendarYears').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		    {            
			$scope.yearss = $scope.data.responseObject;
			console.log($scope.yearss);
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