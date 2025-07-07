var exitemployee= angular.module('exitModule', [])
exitemployee.controller('ExitController',['$scope','$http',function($scope,$http)
	{
	 $scope.addexitemployee = function(UserData) {/*{
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
		    else if(UserData.onduty_contact== null || UserData.onduty_contact == '' || UserData.onduty_contact == undefined)
		  {
		  	swal("Enter On Travel Contact Number");
		  }
		 else if(UserData.onduty_reporting_to == null || UserData.onduty_reporting_to== '' || UserData.onduty_reporting_to == undefined)
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
			alert(UserData.empid + ' Insertion Successful');
			$http.post('/erp/selfservice/addexitemployee', UserData).then(   
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
		console.log("employee_id " + empid);
		$http.post('/erp/selfservice/getNoticePeriod', empid).then(
				function(response) {
					$scope.data1 = response.data;
					if ($scope.data1.successful) {
						$scope.data = {
							object : $scope.data1.responseObject
						};
						console.log("Successful");
					} else {
						console.log("error")

					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	/*	var empid = ERP.getSessionValue("employee_id");
		console.log(empid);
			$http.post('/erp/selfservice/getallexitemployee',empid).then(function(response)
			{   
		    	$scope.data = response.data;                
				if($scope.data.successful)                                            
				{      	    					
					$scope.employeeexitdetails= $scope.data.responseObject;                  
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
			*/
			   
			/*var empid = ERP.getSessionValue("employee_id");
			console.log(empid);
				$http.post('/erp/selfservice/getallprojectemployee',empid).then(function(response)
				{   
			    	$scope.data = response.data;                
					if($scope.data.successful)                                          
					{      	    					
						
						$scope.employeeprojectdetails= $scope.data.responseObject;                  
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
				*/
				var empid = ERP.getSessionValue("employee_id");
				console.log(empid);
					$http.post('/erp/selfservice/getallprojectemployee',empid).then(
							function(response) {
								$scope.data = response.data;
								if ($scope.data.successful) {
									$scope.employeeprojectdetails={object:$scope.data.responseObject};
								} else {    
									alert("Error while getting data");
								}
							}, function(errResponse) {
								console.error('Error while fetching notes');
							});
					var empid = ERP.getSessionValue("employee_id");
					console.log(empid);
						$http.post('/erp/selfservice/getallexitemployee',empid).then(
								function(response) {
									$scope.data = response.data;
									if ($scope.data.successful) {
										$scope.employeeexitdetails={object:$scope.data.responseObject};
										/*console.log(data);*/
									} else {    
										alert("Error while getting data");
									}
								}, function(errResponse) {
									console.error('Error while fetching notes');
								});
					
	
}]);