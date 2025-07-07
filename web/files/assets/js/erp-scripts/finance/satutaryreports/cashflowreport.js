var employee = angular.module('cashflowreport', []);
employee.controller('cashflowreportController',['$scope','$http',function($scope,$http)
	{
	
	$http
	.get('/erp/finance/getFinancialYear')
	.then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {

					$scope.financialyear = $scope.data.responseObject;
				} else {
					console
							.log("Client error while getting data");
				}
			});

$scope.getCashFlowReport = function(data) {
	console.log(data.financial_year);
	var obj = {
			financial_year: data.financial_year,
			previous_financial_year: (data.financial_year) - 1
	};
	console.log(obj);
$http
		.post('/erp/finance/getCashFlowReport',
				obj)
		.then(
				function(response) {
					var sum = 0;
					$scope.data1 = response.data;
					if ($scope.data1.successful) {
						$scope.cashflowDetails = $scope.data1.responseObject.cashflow;
						$scope.cashflowDetails1 = $scope.data1.responseObject.cashflow1;
						$scope.cashflowDetails2 = $scope.data1.responseObject.cashflow2;
						$scope.cashflowDetails3 = $scope.data1.responseObject.cashflow3;
						$scope.cashflowDetails4 = $scope.data1.responseObject.cashflow4;
						$scope.cashflowDetails5 = $scope.data1.responseObject.cashflow5;
						$scope.cashflowDetails6 = $scope.data1.responseObject.cashflow6;
						$scope.cashflowDetails7 = $scope.data1.responseObject.cashflow7;
						$scope.cashflowDetails8 = $scope.data1.responseObject.cashflow8;
						$scope.cashflowDetails9 = $scope.data1.responseObject.cashflow9;
						$scope.cashflowDetails10 = $scope.data1.responseObject.cashflow10;
						$scope.cashflowDetails11 = $scope.data1.responseObject.cashflow11;
						$scope.cashflowDetails12 = $scope.data1.responseObject.cashflow12;
					} else {
						// alert("Error while
						// getting data");
						console.log("error")

					}
				},
				function(errResponse) {
					console
							.error('Error while fetching notes');
				});
};



$scope.getMonthCashFlowReport = function(data) {
	console.log(data.financial_year);
	var from_date= document.getElementById('from').value;
	var to_date= document.getElementById('to').value;
		var date = new Date(from_date);
var dd = ("0" + date.getDate()).slice(-2);   
var mm = ("0" + (date.getMonth() + 1)).slice(-2);
var yyyy = date.getFullYear() - 1;
var previous_from_date = dd + "-" + mm + "-" + yyyy;
var date1 = new Date(to_date);
var dd1 = ("0" + date1.getDate()).slice(-2);   
var mm1 = ("0" + (date1.getMonth() + 1)).slice(-2);
var yyyy1 = date1.getFullYear() - 1;
var previous_from_date = yyyy + "-" + mm + "-" + dd;
var previous_to_date =  yyyy1 + "-" + mm1 + "-" + dd1; 
ERP.setSessionValue("from_date",from_date);
ERP.setSessionValue("to_date",to_date);
ERP.setSessionValue("previous_from_date",previous_from_date);
ERP.setSessionValue("previous_to_date",previous_to_date);
var obj = {
	from_date: from_date,   
	to_date: to_date,
	previous_from_date: previous_from_date,
	previous_to_date:previous_to_date
}
console.log(obj);  
$http
		.post('/erp/finance/getMonthCashFlowReport',
				obj)
		.then(
				function(response) {
					var sum = 0;
					$scope.data1 = response.data;
					if ($scope.data1.successful) {
						$scope.monthcashflowDetails = $scope.data1.responseObject.monthcashflow;
						$scope.monthcashflowDetails1 = $scope.data1.responseObject.monthcashflow1;
						$scope.monthcashflowDetails2 = $scope.data1.responseObject.monthcashflow2;
						$scope.monthcashflowDetails3 = $scope.data1.responseObject.monthcashflow3;
						$scope.monthcashflowDetails4 = $scope.data1.responseObject.monthcashflow4;
						$scope.monthcashflowDetails5 = $scope.data1.responseObject.monthcashflow5;
						$scope.monthcashflowDetails6 = $scope.data1.responseObject.monthcashflow6;
						$scope.monthcashflowDetails7 = $scope.data1.responseObject.monthcashflow7;
						$scope.monthcashflowDetails8 = $scope.data1.responseObject.monthcashflow8;
						$scope.monthcashflowDetails9 = $scope.data1.responseObject.monthcashflow9;
						$scope.monthcashflowDetails10 = $scope.data1.responseObject.monthcashflow10;
						$scope.monthcashflowDetails11 = $scope.data1.responseObject.monthcashflow11;
						$scope.monthcashflowDetails12 = $scope.data1.responseObject.monthcashflow12;
					} else {
						// alert("Error while
						// getting data");
						console.log("error")

					}
				},
				function(errResponse) {
					console
							.error('Error while fetching notes');
				});
};
	
}]);