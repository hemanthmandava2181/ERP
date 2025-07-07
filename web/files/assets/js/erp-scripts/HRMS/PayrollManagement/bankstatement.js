var bankstatementdata = angular.module('bankstatementModule', []);
bankstatementdata
		.controller(
				'BankStatementController',
				[
						'$scope',
						'$http',
						function($scope, $http) {

							$http
									.get('/erp/calc/getYears')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.financialyears = $scope.data.responseObject;
													console.log($scope.years);
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});

							$http
									.get('/erp/calc/getMonths')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {
													$scope.months = $scope.data.responseObject;
													console.log($scope.months);
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(response) {
												console
														.log("Server error while getting data");
											});

							$http
									.get('/erp/report/getLetterheads')
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.letterheads = $scope.data.responseObject;
												} else {
													console
															.log("Client error while getting data");
												}
											});

							$scope.getEmployeeKotak = function(data) {

								console.log(data);
								var obj = {
									financial_year : data.financial_year,
									payroll_month : data.payroll_month

								}
								console.log(obj);
								$http
										.post('/erp/report/getEmployeeKotak',
												obj)
										.then(
												function(response) {
													$scope.data = response.data;
													console.log($scope.data);
													if ($scope.data.successful) {
														

														$scope.employeekotak = $scope.data.responseObject.dates;
														
														$("#onlykotak").show();
														$("#otherthankotak")
																.hide();
														$("#allbankdata")
																.hide();
													} else {
														console
																.log("Client error while getting data");
													}
												})

							};

							$scope.getOthetKotakbank = function(data) {

								console.log(data);
								var obj = {
									financial_year : data.financial_year,
									payroll_month : data.payroll_month

								}
								console.log(obj);
								$http
										.post('/erp/report/getOthetKotakbank',
												obj)
										.then(
												function(response) {
													$scope.data = response.data;
													console.log($scope.data);
													if ($scope.data.successful) {
														

														$scope.employeeotherthankotak = $scope.data.responseObject.dates;
														
														$("#onlykotak").hide();
														$("#otherthankotak")
																.show();
														$("#allbankdata")
																.hide();
													} else {
														console
																.log("Client error while getting data");
													}
												})

							};

							$scope.getAllBank = function(data) {

								console.log(data);
								var obj = {
									financial_year : data.financial_year,
									payroll_month : data.payroll_month

								}
								console.log(obj);
								$http
										.post('/erp/report/getAllBank',
												obj)
										.then(
												function(response) {
													$scope.data = response.data;
													console.log($scope.data);
													if ($scope.data.successful) {
														

														$scope.employeeallbank= $scope.data.responseObject.dates;
														
														$("#onlykotak").hide();
														$("#otherthankotak")
																.hide();
														$("#allbankdata")
																.show();
													} else {
														console
																.log("Client error while getting data");
													}
												})

							};

						} ]);