var leaveEncashmentModule=angular.module('leaveEncashmentModule',[]);

leaveEncashmentModule.controller('leaveEncashmentController',['$scope','$http',function($scope,$http){
	
	$scope.studentsPresentArr = [];
	$scope.leaves = [];   

	$scope.studentsInactivePresentArr = [];
	$scope.inactiveleave = [];      
	
	$http.get('/erp/leavesreport/getYears').then(function(response) {
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
	
	

	$http.get('/erp/leavesreport/getMonths').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.months = $scope.data.responseObject;
			console.log($scope.months);
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
	
	
	$http.get('/erp/leavesreport/getQuarters').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.quarters = $scope.data.responseObject;
			console.log($scope.quarters);
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
	
	
	$scope.getLeaveEncashmentDetails = function(data){
		console.log(data);
		
		$http.post('/erp/leavesreport/getLeaveEncashmentDetails',data).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful) {   
			$scope.leaves = $scope.data.responseObject.centers;
			console.log($scope.leaves);
		} else {
			showError($scope.data.errorMessage);   
			var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
			jQuery("#errorDiv").html(message);
		}
	}, function(errResponse) {         
		console.error('Error ...');   
	});   
	};  
	

	$scope.getInactiveLeaveEncashmentDetails = function(data){
		console.log(data);
		
		$http.post('/erp/leavesreport/getInactiveLeaveEncashmentDetails',data).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful) {   
			$scope.inactiveleaves = $scope.data.responseObject.centers;
			console.log($scope.inactiveleaves);
		} else {
			showError($scope.data.errorMessage);   
			var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
			jQuery("#errorDiv").html(message);
		}
	}, function(errResponse) {         
		console.error('Error ...');   
	});   
	};  
	
	
	$scope.setAllRegIds = function(leaveEncashment)
	{      
		if(leaveEncashment == true)
		{
			for(var i = 0; i < $scope.filteredItems.length; i++)
			{
				var aadhaar = $scope.filteredItems[i]['empid'];
				$scope.studentsPresentArr[aadhaar] = true;
			}
		}
		else if(leaveEncashment == false)       
		{      
			$scope.studentsPresentArr = [];
		}   
	};
	   
	$scope.saveLeaveEncashmentDetails = function(leaves,studentsPresentArr)
	{
		
		console.log(leaves);
		console.log(studentsPresentArr);
		
		if(studentsPresentArr != null)  
		 {
			
			 var Obj = [];                     
			      
			 for(var i in studentsPresentArr)
			 {
					  
			   if(studentsPresentArr[i]== true)   
			   {	
				         
				  for(var k = 0; k < $scope.leaves.length; k++)
					{					 
						if($scope.leaves[k]['empid'] == i)    
						{
							var empId = $scope.leaves[k]['empid'];  
							$http.post('/erp/leavesreport/saveLeaveEncashmentDetails',empId).then(function(response)
									{					  
										         
										$scope.data1 = response.data;
										
										if($scope.data1.successful)
								           {  
											
									    	   swal({  
							  			            title: "Success!",  
							  			            text: "Leave Encashment Processed successfully!",
							  			            type: "success"
							  			        }, function() {
							  			        	window.location.reload();     
							  			        });  
											      
								           }
									});  
							
						}
					}
			   }
			 }   
		 }
		
		
	}
	
	$scope.setAllInactiveRegIds = function(inactiveleaveEncashment)
	{      
		if(inactiveleaveEncashment == true)
		{
			for(var i = 0; i < $scope.filtereditems.length; i++)
			{
				var aadhaar = $scope.filtereditems[i]['empid'];
				$scope.studentsInactivePresentArr[aadhaar] = true;
			}
		}
		else if(inactiveleaveEncashment == false)       
		{      
			$scope.studentsInactivePresentArr = [];
		}     
	};
	   
	$scope.saveInactiveLeaveEncashmentDetails = function(inactiveleaves,studentsInactivePresentArr)
	{
		
		console.log(inactiveleaves);
		console.log(studentsInactivePresentArr);
		
		if(studentsInactivePresentArr != null)  
		 {
			
			 var Obj = [];                     
			      
			 for(var i in studentsInactivePresentArr)
			 {
					  
			   if(studentsInactivePresentArr[i]== true)   
			   {	
				         
				  for(var k = 0; k < $scope.inactiveleaves.length; k++)
					{					 
						if($scope.inactiveleaves[k]['empid'] == i)    
						{
							var empId = $scope.inactiveleaves[k]['empid'];  
							$http.post('/erp/leavesreport/saveInactiveLeaveEncashmentDetails',empId).then(function(response)
									{					  
										         
										$scope.data1 = response.data;
										
										if($scope.data1.successful)
								           {  
									    	   swal({  
							  			            title: "Success!",  
							  			            text: "Details Saved successfully!",
							  			            type: "success"
							  			        }, function() {
							  			        	window.location.reload();     
							  			        });  
									    	       
								           }
									});    
							
						}
					}
			   }
			 }   
		 }
		
		
	}
	
}]); 
