
var TimeModule = angular.module('TimeModule', [])

TimeModule.controller('timeController', [ '$http', '$scope', function($http, $scope) {
	
		    		$scope.getSheets1 = function(UserData)
		    		{      
		    			
		    			console.log(UserData);
			   			 if(UserData==null || UserData=='' || UserData==undefined)
			   			  {
			   			  	swal("Enter all details!");
			   			  }
			   			else if(UserData.from_date == null || UserData.from_date == '' || UserData.from_date== undefined)
			   			  {
			   			  	swal("Enter From Date!");
			   			  }
			   			 else if(UserData.to_date == null || UserData.to_date == '' || UserData.to_date == undefined)
			   			  {
			   			  	swal("Enter To Date!");
			   			  }
			   			
			   			 else{
			    			console.log(UserData); 
		    			$http.post('timesheet/getSheets1',UserData).then(function(response)
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
		    		}
		    		
		    		
} ]);
