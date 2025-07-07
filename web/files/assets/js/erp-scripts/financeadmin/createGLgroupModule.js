
var createGLgroupModule=angular.module('createGLgroupModule',[]);

createGLgroupModule.controller('GLaccountsControler',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/finance/getAccountType').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.accountTypes = $scope.data.responseObject;
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
	
	$http.get('/erp/finance/getGLHeads').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.glHeads = $scope.data.responseObject;
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
	
	$http.get('/erp/finance/getIncomeHeads').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.incomeHeads = $scope.data.responseObject;
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
	
	$http.get('/erp/finance/getAssetClass').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.assets = $scope.data.responseObject;
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
	
	$scope.getAssetNature = function(data){
		console.log(data.asset_id);
		$http.post('/erp/finance/getAssetNature',data.asset_id).then(function(response) {
		$scope.data1 = response.data;
		if($scope.data1.successful) { 
			$scope.assetnature = $scope.data1.responseObject.report;
		} else {
			showError($scope.data1.errorMessage);   
			var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data1.errorMessage + "</div>";
			jQuery("#errorDiv").html(message);
		}
	}, function(errResponse) {            
		console.error('Error ...');      
	});     
	};  
	  
	$http.get('/erp/finance/getLiability').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.liabilities = $scope.data.responseObject;
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
	
	$http.get('/erp/finance/getAllGLgroups').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.GLgroup = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByGLGroup = function(id){
		console.log(id)
		$http.post('/erp/finance/getByGLGroup',id).then(function (response) {
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
		
		$scope.updateData = function(Data){
			$http.post('/erp/finance/updateData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("GL Group Details Updated Successfully");
						  $("#myModal").hide();
						  $('.modal-backdrop').remove();
						  Andromeda.showGLGroup();
						} else {   
						  alert("Data not updated");      
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	   
	$scope.saveGLgroupDetails = function(data)
	{
		console.log(data);
		$http.post('/erp/finance/saveGLgroupDetails',data).then(function(response)
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
					
			   
	/*subgroup Details*/
	
	
	
	$http.get('/erp/finance/getGLGroup').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.groups = $scope.data.responseObject;
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
	
	$http.get('/erp/finance/getAllGLSubgroups').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.GLSubgroup = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByGLSubGroup = function(id){
		console.log(id)
		$http.post('/erp/finance/getByGLSubGroup',id).then(function (response) {
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
		
		$scope.updateGLSubData = function(Data){
			$http.post('/erp/finance/updateGLSubData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("GL Sub Group Details Updated Successfully");
						  $("#myModal1").hide();
						  $('.modal-backdrop').remove();
						  Andromeda.showGLGroup();
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	   
	$scope.saveGLSubgroupDetails = function(data)
	{
		console.log(data);
		$http.post('/erp/finance/saveGLSubgroupDetails',data).then(function(response)
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
		
	
	   
	/*Account Details*/
	
	
	
	$http.get('/erp/finance/getGLSubGroup').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.subgroups = $scope.data.responseObject;
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
	
	$http.get('/erp/finance/getAllGLAccount').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.GLAccount = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByGLAccount = function(id){
		console.log(id)
		$http.post('/erp/finance/getByGLAccount',id).then(function (response) {
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
		
		$scope.updateGLAccountData = function(Data){
			$http.post('/erp/finance/updateGLAccountData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("GL Account Details Updated Successfully");
						  $("#myModal2").hide();
						  $('.modal-backdrop').remove();
						 Andromeda.showGLGroup();
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	   
	$scope.saveGLAccountDetails = function(data)
	{
		console.log(data);
		$http.post('/erp/finance/saveGLAccountDetails',data).then(function(response)
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
		
	
	
	
}]);   