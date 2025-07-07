var managerleavesReportModule = angular.module('managerleavesReportModule', []);
managerleavesReportModule.controller('managerleavesReportController', [ '$http', '$scope', function($http, $scope)
	{
	 /* sending data*/
		    		$scope.getLeaveSheets= function(data)
		    		{      
		    			
		    			/*console.log(data);
			   			 if(data==null || data=='' || data==undefined)
			   			  {
			   			  	swal("Enter all details!");
			   			  }
			   			else if(data.from_date == null || data.from_date == '' || data.from_date== undefined)
			   			  {
			   			  	swal("Enter From Date!");
			   			  }
			   			 else if(data.to_date == null || data.to_date == '' || data.to_date == undefined)
			   			  {
			   			  	swal("Enter To Date!");
			   			  }
			   			 else if(data.leave_type == null || data.leave_type == '' || data.leave_type== undefined)
			   			  {
			   			  	swal("Enter Leave Type!");
			   			  }
			   			 
			   			 else{*/
			    			console.log(data); 
		    			$http.post('/erp/manager/getLeaveSheets',data).then(function(response)
		    			{   
		    		    	$scope.data = response.data;                
		    				if($scope.data.successful)                                          
		    				{      	    					
		    					console.log($scope.data);  
		    					$scope.userdetails = $scope.data.responseObject.centers;       
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
		    		
		    		$http.get('/erp/leavesreport/getLeaves').then(function(response) {
		    			$scope.data = response.data;
		    			if($scope.data.successful)
		    			{
		    				$scope.leaves = $scope.data.responseObject;
		    				console.log($scope.leaves);
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
		    		$scope.updateDataapprove = function(data1){
		    	console.log(data1);
		    			$http.post('/erp/manager/updateDataapprove', data1).then(
		    					function(response) {
		    						$scope.data3 = response.data3;
		    						if ($scope.data.successful) {
		    							alert(" Successfully updated");
		    						} else {
		    							alert("Data not updated");
		    						}
		    					}, function(errResponse) {
		    						console.error('Error while fetching notes');
		    					});
		    		};
		    		//Update User Details
		    		$scope.updateDatareject = function(UserData){		    	
		    			$http.post('/erp/manager/updateDatareject', UserData).then(
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
		    		
		    		
					$scope.getById= function(name){
						alert(name);
						$http.post('/erp/manager/getById',name).then(
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
						
		    		
		    		
		    		
		    		
} ]);