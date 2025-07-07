var createpo = angular.module('CreatePOModule', []);
createpo.controller('createPOController',['$scope','$http',function($scope,$http)
{
	
	$http.get('/erp/purchase/getYears').then(function(response) {
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
	
	$http.get('/erp/purchase/getAssetNames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.assetnames = $scope.data.responseObject;
			
			console.log($scope.assetnames);
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
	$http.get('/erp/purchase/getItemNames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.itemnames = $scope.data.responseObject;
			
			console.log($scope.itemnames);
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
	
	$http.get('/erp/purchase/getPurchaseOrderType').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.purchaseotypes = $scope.data.responseObject;
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
	
	$http.get('/erp/purchase/getPurchaseType').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.purchasetypes = $scope.data.responseObject;
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
	
	$http.get('/erp/purchase/getServices').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.services = $scope.data.responseObject;
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
	
	
	$scope.getVendornames = function(totalObj) 
	{
		$http.post('/erp/purchase/getVendornames',totalObj.serviceid).then(function(response) 
		{
			$scope.data = response.data;
			if ($scope.data.successful)
			{
				$scope.vendornames = $scope.data.responseObject;
				$scope.data = 
				{  
						object : totalObj   
				};
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
	
	
	
	
	
	
	$http.get('/erp/purchase/getPrograms').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.programs = $scope.data.responseObject;
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
	$http.get('/erp/purchase/getSchemes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.schemes = $scope.data.responseObject;
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
	$http.get('/erp/purchase/getProjects').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.projects = $scope.data.responseObject;
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
	$http.get('/erp/purchase/getSectors').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.sectors = $scope.data.responseObject;
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
	
	
	$http.get('/erp/purchase/getVendors').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.vendors = $scope.data.responseObject;
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
	$http.get('/erp/purchase/getAssets').then(function(response) {
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
	$http.get('/erp/purchase/getLocations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.locations = $scope.data.responseObject;  
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
	

	$scope.save = function(UserData)	
	{
			
	
				$http.post('/erp/purchase/add', UserData).then(
					function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
						alert("User Data Inserted Successfully");
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			
	};
	
	
	
	
	
	

	/*$http.get('/erp/purchase/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.regdetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});*/
	

	/*$http.get('/erp/purchase/getNames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.names = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});*/
	$scope.getById = function(Data){
		
		$http.post('/erp/purchase/getById',Data).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		
		/*$http.get('/erp/purchase/getGroups').then(function(response) {
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
		*/
		
		$scope.savedata = function(UserData)	
		{
			$http.post('/erp/purchase/submit', UserData).then(
					
						function(response) {    
						$scope.data = response.data;      
						if ($scope.data.successful) {
							alert("User Data Inserted Successfully");
						} else {
							alert("Data not inserted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
				
		};
		
		$scope.updateData = function(Data){
			$http.post('/erp/purchase/updateData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
						  alert("User Details Successfully updated");
						 
						} else {
						  alert("Data not updated");
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
		
		$scope.getAllIds = function(data)
		{
			
			$http.post('/erp/purchase/getAllIds',data).then(function(response) 
					{       
						$scope.data= response.data;     
						console.log(response);    
						if ($scope.data.successful) 
						{
							$scope.data = $scope.data.responseObject;
							console.log($scope.data);   
			
			data.from_date = $scope.data[0].from_date,
			data.to_date = $scope.data[0].to_date,   
			data.program_id = $scope.data[0].program_id,
			data.project_id = $scope.data[0].project_id,
			console.log(data.project_id);   
			data.scheme_id = $scope.data[0].scheme_id,
            console.log(data.scheme_id);
			data.from_date = $scope.data[0].from_date,  
			console.log(from_date);
			data.to_date = $scope.data[0].to_date
			console.log(to_date);    
			$scope.data = {    
			object : data
			};    
			       
			} else {
			console 
			.log("Client error while getting data");
			}
			},
			function(response) {
			console.log("Server error while getting data");
			});
			 
			}
	
		$http.get('/erp/purchase/getLocations').then(function(response) {  
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.locations = $scope.data.responseObject;
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
		
		
		
		
		
		$scope.Consumables = function(UserData)	
		
		
		{
			
			
			var quantity = document.getElementById("QTY").value;
			console.log(quantity)
			var rate = document.getElementById("RATE").value;
			console.log(rate);
			var status = document.getElementById("STATUS").value;
			console.log(status);
			var cost = document.getElementById("COST").value;
			console.log(cost);
			var amount, value, price;
				
			   var details={
					      
					   qty : quantity,  
					   rate : rate,
					   
					   
			   }   

			   	console.log(details);   
		   
			
					$http.post('/erp/purchase/Consumables', UserData).then(
					
						function(response) {    
							
								
						$scope.data = response.data;         
						if ($scope.data.successful) {
							alert("User Data Inserted Successfully");
						} else {
							alert("Data not inserted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
				
		};
		
		
				
		
		/*$http.get('/erp/purchase/getConsume').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				
				$scope.UserData = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});*/
		$scope.getConsume = function(Data){
			
			$http.post('/erp/purchase/getConsume',Data).then(function (response) {
			    $scope.data = response.data;
			    if ($scope.data.successful) {
			        $scope.data = {object:$scope.data.responseObject};
			    } else {
			    	//alert("Error while getting data");   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			};  
		

						
		
		
		
				
							/*
								$scope.POAmount = function(UserData) {
									
									
									 var quantity=Andromeda.getSessionValue("quantity");  
									
									
									var quantity = document.getElementById("QTY").value;
									console.log(quantity)
									var rate = document.getElementById("RATE").value;
									console.log(rate);
									var status = document.getElementById("STATUS").value;
									console.log(status);
									var cost = document.getElementById("COST").value;
									console.log(cost);
									var amount, value, price;
										
									   var details={
											      
											   qty : quantity,  
											   rate : rate,
											   
											   
									   }   

									   	console.log(details);   
								   

								$http.post('/erp/purchase/POAmount',details).then(function(response) {
													console.log(details);

													$scope.data = response.data;
													if ($scope.data.successful) {
														alert("User Data Inserted Successfully");
													} else {
														alert("Data not inserted");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});

							};
		
		
		*/
		
		
		
		
		
	
		
		
		
	/*	$scope.getVendorNames = function(totalObj)
		{
	$http.post('/erp/purchase/getVendorNames',totalObj.serviceid).then(
			function(response) {
				console.log(totalObj.serviceid);
				$scope.data = response.data;  
				if ($scope.data.successful) {     

					$scope.vendornames = $scope.data.responseObject;
					$scope.data = {object : totalObj};
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
		}*/
		
		
/*		$scope.savedata = function(UserData)	
		{
				
		
					$http.post('/erp/purchase/submit', UserData).then(
					
						function(response) {    
						$scope.data = response.data;      
						if ($scope.data.successful) {
							alert("User Data Inserted Successfully");
						} else {
							alert("Data not inserted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
				
		};*/
	/*$scope.save = function(UserData)	
	{
				if(UserData != undefined)                
				{       
				if(UserData.service_name == null || UserData.service_name == undefined || UserData.service_name == "")
				{
				swal("Oops","Please, Enter vendor service name ","info");
				} 
				else if(UserData.status == null || UserData.status == undefined || UserData.status == "")	
				{
				swal("Oops","Please, Enter vendor service status ","info");
				}
				
			else
			{
	
				$http.post('/erp/vendorservice/add', UserData).then(
				
					function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
						alert("User Data Inserted Successfully");
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			};
				}
	};
	
	$http.get('/erp/vendorservice/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.regdetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	$scope.name=null,$scope.filteredResult = null;
    
	$scope.getNameWiseData = function(obj) {      
		$scope.getBranchWisePrograms = function(totalObj)
		{
			Andromeda.setSessionValue("studentBranchId", totalObj.name);
			
			$("#glyphiconid").show();        
			$scope.name = totalObj.name;
			$http.post('/erp/vendorservice/getBranchWisePrograms', totalObj.name).then(function(response)
			{
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.regdetails = $scope.data.responseObject;
					$("#div1").hide();
					$("#lb6b").show();
					$("#div4").hide();
					$("#glyphiconid").hide();
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
		}; 
	} 
	

	

	$scope.getById = function(Data){
		
		$http.post('/erp/vendorservice/getById',Data).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};     
		
		$scope.updateData = function(Data){
			$http.post('/erp/vendorservice/updateData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
						  alert("User Details Successfully updated");
						 
						} else {             
						  alert("Data not updated");
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
		*/

}]);