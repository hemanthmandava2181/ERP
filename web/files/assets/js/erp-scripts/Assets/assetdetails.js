var AssetDetails = angular.module('assetDet', []);
AssetDetails.controller('AssetDetailController',['$scope','$http',function($scope, $http) {

					
	
	/*$scope.getGrnItems = function(data) {
		console.log(data);
				$http.post('/erp/grn/getGrnItems', data).then(function(response) 
		{
			$scope.data = response.data;
			console.log($scope.data);
			if ($scope.data.successful) 
			{
				$scope.grnitemdetails = $scope.data.responseObject;    
				console.log($scope.grn_date);    
				data.assets = $scope.grnitemdetails[0].assets;
				console.log(data.assets);
				data.qty = $scope.grnitemdetails[0].qty;
				console.log(data.qty);      
				data.brand = $scope.grnitemdetails[0].brand;
				console.log(data.brand);
				data.location = $scope.grnitemdetails[0].location;
				console.log(data.location);
				$scope.data = {
								object : data
								};      
					}  
					else 
					{
						console.log("Client error while getting data");
					}
				},
				function(response) {
						console.log("Server error while getting data");
					});
		}*/
	
	
	
				
	
	$scope.getAssetId = function(data) {
		console.log(data);
				$http.post('/erp/grn/getAssetId', data).then(function(response) 
		{
			$scope.data = response.data;
			console.log($scope.data);
			if ($scope.data.successful) 
			{
				$scope.grnitemdetails = $scope.data.responseObject;    
				console.log($scope.grn_date);    
				data.brand = $scope.grnitemdetails[0].brand;
				console.log(data.brand);
				data.value = $scope.grnitemdetails[0].value;
				console.log(data.value);      
				
				$scope.data = {
								object : data
								};      
					}       
					else 
					{
						console.log("Client error while getting data");
					}
				},
				function(response) {
						console.log("Server error while getting data");
					});
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

							$scope.getAssetDetails = function(data)
							{
								
								$http.post('/erp/grn/getAssetDetails', data).then(function(response) 
								{
									$scope.data = response.data;
									console.log($scope.data);
									if ($scope.data.successful) 
									{
										$scope.data = $scope.data.responseObject; 
										data.grn_date = $scope.data[0].grn_date,
										data.purchaseorder_id = $scope.data[0].purchaseorder_id,
										console.log(data.po_id);
										data.order_date = $scope.data[0].order_date
										console.log(data.order_date);
										data.vendorname=$scope.data[0].vendorname;
  										console.log(data.vendorname);
										data.assets = $scope.data[0].assets;
										console.log(data.item_name);  
										data.qty = $scope.data[0].qty;
										console.log(data.qty);
										data.brand = $scope.data[0].brand;
										console.log(data.brand);
										data.location = $scope.data[0].location;
										console.log(data.location);
										$scope.data = {
														object : data
														};
											}
											else 
											{
												console.log("Client error while getting data");
											}
										},
										function(response) {
												console.log("Server error while getting data");
											});
								}
							
							
							
							

							$scope.addgrnid = function(data) {
								console.log(data);
								$http
										.post('/erp/grn/addgrnid', data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														location.reload();
														alert(" Inserted Successfully");
													} else {
														alert("Data not inserted");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

							$scope.getDraftgrn = function(totalObj) {
								$http
										.post('/erp/grn/getDraftgrn',
												totalObj.po_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {

														$scope.draftgrns = $scope.data.responseObject;
														$scope.data = {
															object : totalObj
														};
													} else {
														console
																.log("Client error while getting data");
													}
												},
												function(response) {
													console
															.log("Server error while getting data");
												});
							}

							/*$http
									.get('/erp/grn/getAlllineitems')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.lineitemdetails = $scope.data.responseObject;

												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});*/
							$http
									.get('/erp/grn/getGrns')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.grns = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							// Get Data from Database based on group_name

							$scope.getByIdlineitems = function(grn_id) {
								alert(grn_id);
								$http
										.post('/erp/grn/getByIdlineitems',
												grn_id)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														$scope.data = {
															object : $scope.data.responseObject
														};
													} else {
														alert("Error while getting data");
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};
							
							
							
							
							//adding grn item details
							
							

							$scope.saveGrndetails = function(userdata) 
							{
								console.log(userdata);
								$http.post('/erp/grn/saveGrndetails', userdata).then(function(response) 
								{
									$scope.data1 = response.data;
									if ($scope.data1.successful)    
									{
										location.reload();
										alert(" Inserted Successfully");
									}
									else
									{   
										alert("Data not inserted");
									}
								},
								function(errResponse)
								{
									console.error('Error while fetching notes');
								});
							};

							
} ]);