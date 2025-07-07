var loginReportModule= angular.module('loginReportModule', []);
loginReportModule.controller('loginReportController', [ '$http', '$scope', function($http, $scope) {	 
		
	      $scope.getloginreports = function(data)
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
		   			 else{*/
		    			console.log(data); 
		    			$http.post('/erp/report/getloginreports',data).then(function(response)
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
		    	
	      
	      
			    	
			    		 $scope.getLoginbefore11 = function(data)
				    		{ 
				    	
	      $http.post('/erp/report/getLoginbefore11',data).then(function(response) {
  			$scope.data = response.data;
  			if($scope.data.successful)
  			{
  				
  				$scope.beforelogins = $scope.data.responseObject.centers;
  				console.log($scope.beforelogins);
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
				    		} 
			    		 $scope.getLoginafter11 = function(data)
				    		{ 
				    	
	      $http.post('/erp/report/getLoginafter11',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.afterlogins = $scope.data.responseObject.centers;
	  				console.log($scope.afterlogins);
	  				}     
	  			else         
	  			{
	  				console.log("Client error while getting data");
	  			}
	  		},
	  		function(response)
	  		{
	  			console.log("Server error while getting data");
	  		});	}
	      $scope.getMissedlogin = function(data)
  		{ 
  	
	      $http.post('/erp/report/getMissedlogin',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.missedlogins = $scope.data.responseObject.centers;    
	  				console.log($scope.missedlogins);
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
				    		}
	      
	      $scope.getAllReports = function(data)
	  		{ 
	      $http.post('/erp/report/getAllReports',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.allreports = $scope.data.responseObject.centers;
	  				console.log($scope.allreports);
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
	      
	  		}
	      $scope.getLeavesReport = function(data)
	  		{ 
	      $http.post('/erp/report/getLeavesReport',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.leavesreports = $scope.data.responseObject.centers;
	  				console.log($scope.leavesreports);
	  				}     
	  			else         
	  			{
	  				console.log("Client error while getting data");
	  			}
	  		},
	  		function(response)
	  		{
	  			console.log("Server error while getting data");
	  		});	}
	      $scope.getDefaultLogins= function(data)
	  		{ 
	      $http.post('/erp/report/getDefaultLogins',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.defaultlogins = $scope.data.responseObject.centers;
	  				console.log($scope.defaultlogins);
	  				}     
	  			else         
	  			{
	  				console.log("Client error while getting data");
	  			}
	  		},
	  		function(response)
	  		{
	  			console.log("Server error while getting data");
	  		});	}
} ]);