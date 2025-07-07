var LoginModule = angular.module('LoginModule', [])
LoginModule.controller('LoginController', [ '$http', '$scope', function($http, $scope) {
		var self = this;
		$scope.login = function(user) {
		//	 $("#glyphiconid").show();     
			
	        $http.post('/erp/login/login',user).then(function(response) {
				$scope.data = response.data;    
				if($scope.data.successful) {
					Andromeda.setSessionValue("employeeid", $scope.data.responseObject.employeeid.replace(/\s+/g, ''));
					Andromeda.setSessionValue("password", $scope.data.responseObject.password);
					Andromeda.setSessionValue("username", $scope.data.responseObject.username.replace(/\s+/g, ''));
		  			Andromeda.setSessionValue("roleid", $scope.data.responseObject.roleid);
		  			Andromeda.setSessionValue("email", $scope.data.responseObject.email);
		  			/*Andromeda.setSessionValue("instituteid", $scope.data.responseObject.instituteid);  
					Andromeda.setSessionValue("courseid", $scope.data.responseObject.courseid);
					Andromeda.setSessionValue("courseshortname", $scope.data.responseObject.courseshortname);
					Andromeda.setSessionValue("districtid", $scope.data.responseObject.districtid);
					Andromeda.setSessionValue("amount", $scope.data.responseObject.amount);
					Andromeda.setSessionValue("examcentercode", $scope.data.responseObject.examcentercode);*/
					//console.log(Andromeda.getSessionValue("courseid"));       
					  		if ((Andromeda.getSessionValue("roleid") == 0)) {
				    			Andromeda.showAdminHomePage();    
				    		}   
		 		    		else if ((Andromeda.getSessionValue("roleid") == 1)) { 
				    			Andromeda.showHRHomePage();
				    		}   
				    		else if ((Andromeda.getSessionValue("roleid") == 2)) {   
				    			Andromeda.showEmployeeHomePage();
				    		}     
				    		else {    
				    			 Andromeda.showHRHomePage();             
				         		}           
				        	     			      
					    
	    
				} else {     
				//	$("#glyphiconid").hide();
					//alert($scope.data.errorMessage);
					Andromeda.showError($scope.data.errorMessage);    
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