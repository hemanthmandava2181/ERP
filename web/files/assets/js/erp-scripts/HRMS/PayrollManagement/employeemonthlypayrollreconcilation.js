var monthlypayrollrecouncil = angular.module('monthlypayrollrecouncilModule',
		[]);
monthlypayrollrecouncil.controller('MonthlyPayrollReconcilationController',['$scope','$http',function($scope, $http) {

				$http.get('/erp/calc/getYears').then(
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

				$http.get('/erp/calc/getMonths').then(function(response) {
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
				var params={};
					$scope.getEmployeeMonthlyRecouncilation = function(data) {

						console.log(data);
						var obj = {
							financial_year : data.financial_year,
							payroll_month : data.payroll_month
						}
						params=obj;
						console.log(obj);
						$http.post('/erp/report/getEmployeeMonthlyRecouncilation',obj).then(function(response) {   
											$scope.data = response.data;
											console.log($scope.data);
											if ($scope.data.successful) {
												$("#displaydata")
														.show();
												$scope.employeemonthlyrecouncilation = $scope.data.responseObject.dates;
											} else {
												console
														.log("Client error while getting data");
											}
										})

					};
					
							$scope.getSingleEmpData = function(data) {
								console.log(data);
								params['empid']=data.empid;
								console.log(JSON.stringify(params));
								$http.post('/erp/report/getSingleEmpData',params).then(function(response) {   
													$scope.data = response.data;
													console.log($scope.data);
													if ($scope.data.successful) {
														$scope.empReconData = $scope.data.responseObject.dates;
													} else {
														console.log("Client error while getting data");
													}
												})
   
							};

					       

						} ]);
monthlypayrollrecouncil.filter('sumOfValue', function () {
    return function (data, key) {        
        if (angular.isUndefined(data) || angular.isUndefined(key))
            return 0;        
        var sum = 0;        
        angular.forEach(data,function(value){
            sum = sum + parseInt(value[key]);
        });        
       var tot = new Intl.NumberFormat('en-IN').format(sum);
        return tot;
    };
});
