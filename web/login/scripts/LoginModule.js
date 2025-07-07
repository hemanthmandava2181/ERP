var LoginModule = angular.module('LoginModule', [])
LoginModule.controller('LoginController', [ '$http', '$scope', function($http, $scope) {
		var self = this;        
		$scope.login = function(user) {
		     
			console.log(user);    
	        $http.post('/erp/login/login',user).then(function(response) {
	        
				$scope.data = response.data;         
				if($scope.data.successful) {        
					console.log(response.data);
					//var roles = [response.data.responseObject.roles];      
					ERP.setSessionValue("employee_id", $scope.data.responseObject.employee_id.replace(/\s+/g, ''));
					ERP.setSessionValue("password", $scope.data.responseObject.password);
					ERP.setSessionValue("username", $scope.data.responseObject.username.replace(/\s+/g, ''));
		  			ERP.setSessionValue("roleid", $scope.data.responseObject.roleid);
		  			ERP.setSessionValue("roles", JSON.stringify($scope.data.responseObject.roles));
					  		if ((ERP.getSessionValue("roleid") == 1)) {
				    			/*window.location.href="/erp/dashboard/index.html"*/ 
					  			ERP.showAdminHomePage();
				    		}         
					  		       
					  		else if ((ERP.getSessionValue("roleid") == 0)) {
				    			/*window.location.href="/erp/dashboard/index.html"*/ 
					  			ERP.showSuperAdminHomePage();
				    		}         
		 		    		
				    		else if (((ERP.getSessionValue("roleid") != null) && (ERP.getSessionValue("roleid") > 1))) {   
				    			/*window.location.href="/erp/dashboard/index.html"*/
				    			ERP.showEmployeeHomePage();
				    		}      
					  		
				    		else {              
				    			/*window.location.href="/erp/index.html"   */   
				    			ERP.showLoginPage(); 
				         		}               
				        	     			      
					                  
	           
				} else {     
				//	$("#glyphiconid").hide();
					//alert($scope.data.errorMessage);
					ERP.showError($scope.data.errorMessage);    
					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				   jQuery("#errorDiv").html(message);
					$("#errorDiv").show();
					$("#errorDiv").html("<b style='margin-left: 28%;font-size: medium;color:blue'>Note:</b> Invalid login credentials");
				//	console.log('Error while validating user');
				} 
			},function(errResponse) {
				console.error('Error while fetching notes');
			});
	    };    
	   
	 
} ]);