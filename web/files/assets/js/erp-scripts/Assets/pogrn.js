var POGrn = angular.module('POGrn', []);
POGrn.controller('POGrnController',['$scope','$http',function($scope, $http) {
							
							$http.get('/erp/purchase/getPOID').then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.details = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});  
						       
							 	  
							    
						//Get Data from Database based on group_name
						
						$scope.getByIdpurchaseorderReport = function(userdata){    
							console.log(userdata);
							
							$http.post('/erp/grn/getByIdpurchaseorderReport', userdata).then(
									function(response) {
										$scope.data = response.data;
										if ($scope.data.successful) {
											
											
											$scope.pogrndetails={object:$scope.data.responseObject};  
										} else {  
											alert("Error while getting data");
										}
									}, function(errResponse) {
										console.error('Error while fetching notes');
									});
						};
						} ]);