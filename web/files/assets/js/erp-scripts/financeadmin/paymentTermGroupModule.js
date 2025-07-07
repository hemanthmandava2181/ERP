
var paymentTermGroupModule=angular.module('paymentTermGroupModule',[]);

paymentTermGroupModule.controller('TermController',['$scope','$http',function($scope,$http){
	
	$http.get('/erp/finance/getAllPaymentTerms').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.termGroups = $scope.data.responseObject;
		}
		else
		{    
			console.log("Client error while getting data");  
		}
	});
	
	$scope.getGroup = function(data){
		console.log(data)
		$http.post('/erp/finance/getGroup',data).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		        console.log( $scope.data);
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
$scope.getByTerm = function(data){
		console.log(data)
		$http.post('/erp/finance/getByTerm',data).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		        console.log( $scope.data);
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		
		$scope.updateTermData = function(Data){
			$http.post('/erp/finance/updateTermData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("Payment Term Details Updated Successfully");
						  $("#myModal").hide();
						  $('.modal-backdrop').remove();
						  Andromeda.showPaymentTerms();
						  
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	   
	$scope.saveTermDetails = function(data)
	{
		console.log(data);
		$http.post('/erp/finance/saveTermDetails',data).then(function(response)
									{					  
										         
										$scope.data1 = response.data;
										
										if($scope.data1.successful)
								           {  
											
									    	   swal({  
							  			            title: "Success!",  
							  			           
							  			            type: "success"
							  			        }, function() {
							  			        	   
							  			        });  
											      
								           }
									});  
							
						}
		
	
	$scope.saveConditions = function(data)
	{
		console.log(data);
		$http.post('/erp/finance/saveConditions',data).then(function(response)
									{					  
										         
										$scope.data1 = response.data;
										
										if($scope.data1.successful)
								           {  
											
									    	   swal({  
							  			            title: "Success!",  
							  			           
							  			            type: "success"
							  			        }, function() {
							  			        	   
							  			        });  
											      
								           }
									});  
							
						}
	$scope.getAllConditions = function(data){
		console.log(data.term_name);
		
		$http.post('/erp/finance/getAllConditions',data.term_name).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful) {   
			$scope.termConditions = $scope.data.responseObject;
			console.log($scope.termConditions);
		} else {
			showError($scope.data.errorMessage);   
			var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
			jQuery("#errorDiv").html(message);
		}
	}, function(errResponse) {         
		console.error('Error ...');   
	});      
	};  
	$scope.getByTermConditions = function(data){
		console.log(data)
		$http.post('/erp/finance/getByTermConditions',data).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		        console.log( $scope.data);
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  

		$scope.updateConditionsData = function(Data){
			$http.post('/erp/finance/updateConditionsData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("Terms and Conditions Updated Successfully");
						  $("#myModal").hide();
						  $('.modal-backdrop').remove();
						  Andromeda.showPaymentTerms();
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
}]);   