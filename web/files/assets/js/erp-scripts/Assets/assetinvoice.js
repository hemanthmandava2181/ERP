var invoice = angular.module('assetinvoice', []);
invoice.controller('AssetInvoiceController', [
		'$scope',
		'$http',
		function($scope, $http) {

			$http.get('/erp/employee/getCost_center').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.cost_centers = $scope.data.responseObject;
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});
			// View Data from Database
			$http.get('/erp/operation/getglaccounts').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.glaccounts = $scope.data.responseObject;
				} else {
					alert("Can't view the Data");
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});
			$http.get('/erp/grn/getGrns').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.grns = $scope.data.responseObject;
				} else {
					console.log("Client error while getting data");
				}
			});

			$scope.saveassetinvoice = function(UserData) {

				$http.post('/erp/grn/addinvoice', UserData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert("Inserted Successfully");
							} else {
								alert("Data not inserted");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});

			};
			$scope.saveassetinvoicedetails = function(UserData) {

				$http.post('/erp/grn/addinvoicedetails', UserData).then(
						function(response) {
							$scope.data = response.data;
							if ($scope.data.successful) {
								alert(" Inserted Successfully");
							} else {
								alert("Data not inserted");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});

			};
			$scope.getGrnData = function(data) {
				
				  
				$http.post('/erp/grn/getGrnData', data).then(
						function(response) {
							$scope.data = response.data;
							console.log($scope.data);
							if ($scope.data.successful) {
								$scope.grns = $scope.data.responseObject;
								console.log($scope.grn_date);
								data.purchase_order_no = $scope.grns[0].purchase_order_no;
								console.log(data.purchase_order_no);
								data.vendorname = $scope.grns[0].vendorname;
								console.log(data.vendor_id);
								data.poamount = $scope.grns[0].poamount;
								console.log(data.poamount);
								data.GrnAmount = $scope.grns[0].GrnAmount;
								console.log(data.grnamount);
								$scope.data = {
									object : data     
								};   
							} else {	
								console.log("Client error while getting data");
							}
						}, function(response) {
							console.log("Server error while getting data");
						});
			}/*
			$http.get('/erp/grn/getInvoiceDetails').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.invoiceDetails = $scope.data.responseObject;
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});*/

		} ]);
