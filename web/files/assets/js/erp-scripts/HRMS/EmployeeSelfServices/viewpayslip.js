var viewpayslip = angular.module('viewpayslipModule', []);

viewpayslip.filter('sumOfValue', function() {
	return function(data, key) {
		if (angular.isUndefined(data) || angular.isUndefined(key))
			return 0;
		var sum = 0;
		angular.forEach(data, function(value) {
			sum = sum + parseInt(value[key]);
		});
		var tot = new Intl.NumberFormat('en-IN').format(sum);
		return tot;
	};
});
viewpayslip
		.controller(
				'viewpayslipController',
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

							var empid = ERP.getSessionValue("employee_id");

							$http
									.post('/erp/ctc/viewdetalisdata', empid)
									.then(
											function(response) {
												$scope.data = response.data;
												if ($scope.data.successful) {

													$scope.viewdetails = {
														object : $scope.data.responseObject
													};
													
													console
															.log($scope.viewdetails);
												} else {
													console
															.log("Client error while getting data");
												}
											},
											function(errResponse) {
												console
														.error('Error while fetching notes');
											});

							$scope.getViewpayslipearings = function(data) {

								var empid = ERP.getSessionValue("employee_id");

								console.log(data);
								var obj = {
									financial_year : data.financial_year,
									payroll_month : data.payroll_month,
									empid : empid

								}
								console.log(obj);
								$http
										.post('/erp/ctc/getViewpayslipearings',
												obj)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {

														$scope.employeepayslipearing = $scope.data.responseObject.dates;
														console
																.log($scope.employeepayslipearing);

													} else {
														console
																.log("Client error while getting data");
													}
												})

							};

							$scope.getViewpayslipdeduction = function(data) {

								console.log(data);
								var obj = {
									financial_year : data.financial_year,
									payroll_month : data.payroll_month,
									empid : empid

								}
								console.log(obj);
								$http
										.post(
												'/erp/ctc/getViewpayslipdeduction',
												obj)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {

														$scope.employeepayslipdeduction = $scope.data.responseObject.dates;
														console
																.log($scope.employeepayslipdeduction);

													} else {
														console
																.log("Client error while getting data");
													}
												})

							};

						

						} ]);