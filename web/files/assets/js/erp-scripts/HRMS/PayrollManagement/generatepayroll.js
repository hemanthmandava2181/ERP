function fillEmpCount(){
	var responseData = ERP.post('/erp/Payroll/employeeCounts');
      if(responseData.successful){
          			jQuery("#totalEmployees").html(responseData.responseObject.all);
					
          }
      else{
            ERP.showError(responseData.errorMessage);    
        }
};

       
var payrollgenerate = angular.module('generatepayroll', []);
payrollgenerate.filter('sumOfValue', function () {
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

/*payrollgenerate.filter('numberFormat', function () { 
	 return function(input) {
	      input = input || 0;
	      var out = new Intl.NumberFormat('en-IN').format(parseInt(input));
	      return out;
	 };
});

payrollgenerate.filter('dateFormat', function () { 
	 return function(input) {
	      input = input || 0;
	      var out = input.split("-").reverse().join("-");;
	      return out;
	 };
});
*/




payrollgenerate.controller('GenaretePayrollController',['$scope','$http',function($scope,$http)
{
	
	
	
	
	
	/*var self = this;
	var d = new Date(),
    month = '' + (d.getMonth() + 1),
    day = '' + d.getDate(),
    year = d.getFullYear();
    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;
    
    console.log(month);   
     $scope.displayDate = convertMonth(parseInt(month)) + ", "+year;
	
	$http.generatepayroll('/erp/Employee/getdata',details).then(function(response) {
		$scope.data = response.data;   
		if($scope.data.successful)
		{
			$scope.userdetails = $scope.data.responseObject.dates;
			console.log($scope.userdetails);
		}
		else
		{
			console.log("Client error while getting data");  
		}  
	   });	
     */
	
	
	
	$http
	.get('/erp/Payroll/getFinancialYear')
	.then(
	function(response) {
	$scope.data = response.data;
	if ($scope.data.successful) {

	$scope.financialyears = $scope.data.responseObject;
	} else {
	console
	.log("Client error while getting data");
	}
	});
      
	$scope.savePayrollSettings = function(UserData) {
	
		console.log(UserData);
		var obj={
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value,
				financial_year:UserData.financial_year,
				payroll_month:UserData.payroll_month
		}
	console.log(obj);
		$http.post('/erp/Payroll/savePayrollSettings',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						$("#display").hide();    
						$("#display1").show();
						$("#validate").hide();
						$("#approve").hide();
						
						$("#reject").hide();
						
						alert("Payroll settings saved Successfully");
						
						
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
	$scope.GeneratePayroll = function(details) {
		/*alert("Please validate payroll check list before process payroll");*/
		console.log(details);
		var obj={
				from_date: details.from_date,
				to_date: details.to_date,
				financial_year:details.financial_year,
				payroll_month:details.payroll_month,
				
		}
	console.log(obj);
		$http.post('/erp/Payroll/GeneratePayroll',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						alert("Are you sure, want to process the payroll !");
						
						$("#validate").show();
						$("#reject").show();
						   
						alert("Payroll Generated Successfully");
						
							$http
									.post('/erp/Payroll/getPayrollTotal', obj)
									.then(
											function(response) {
												var sum = 0;
												$scope.data1 = response.data;
												if ($scope.data1.successful) {
													
													$scope.payrollDetails5 = $scope.data1.responseObject.payroll5;
													$scope.payrollDetails6 = $scope.data1.responseObject.payroll6;
													$scope.payrollDetails7 = $scope.data1.responseObject.payroll7;
													$scope.payrollDetails8 = $scope.data1.responseObject.payroll8;
													$scope.payrollDetails9 = $scope.data1.responseObject.payroll9;
													$scope.payrollDetails10 = $scope.data1.responseObject.payroll10;
													$scope.payrollDetails11 = $scope.data1.responseObject.payroll11;
													$scope.payrollDetails12 = $scope.data1.responseObject.payroll12;

													console.log(payrollDetails5);
													console.log(payrollDetails6);
													console.log(payrollDetails7);
													console.log(payrollDetails8);

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
					

						
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
	
	
$scope.GeneratePayrollStatus = function(UserData) {
		
		console.log(UserData);
		var obj={
				from_date: UserData.from_date,
				to_date: UserData.to_date,
				financial_year:UserData.financial_year,
				payroll_month:UserData.payroll_month
		}
	console.log(obj);
		$http.post('/erp/Payroll/GeneratePayrollStatus',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						
					
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
$scope.ValidatePayroll = function(UserData) {
		
		console.log(UserData);
		var obj={
				from_date: UserData.from_date,
				to_date: UserData.to_date,
				financial_year:UserData.financial_year,
				payroll_month:UserData.payroll_month
		}
	console.log(obj);
		$http.post('/erp/Payroll/ValidatePayroll',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						
						$("#approve").show();
						alert("Payroll Validated  Successfully");
						
						
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
$scope.ApprovePayroll = function(UserData) {
		
		console.log(UserData);
		var obj={
				
				financial_year:UserData.financial_year,
				payroll_month:UserData.payroll_month
		}
	console.log(obj);
		$http.post('/erp/Payroll/ApprovePayroll',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						
						
						$("#approve").attr("disabled", true);
						$("#reject").hide();
						$("#validate").hide();
						$("#generate").hide();
						
						alert("Payroll Approved  Successfully");
						
						
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
$scope.RejectPayrollStatus = function(UserData) {
		
		console.log(UserData);
		var obj={
				
				financial_year:UserData.financial_year,
				payroll_month:UserData.payroll_month
		}
	console.log(obj);
		$http.post('/erp/Payroll/RejectPayrollStatus',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						
						
						alert("Payroll Rejected  Successfully");
						
						
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
$scope.RejectPayroll = function(UserData) {
		
		console.log(UserData);
		var obj={
				
				financial_year:UserData.financial_year,
				payroll_month:UserData.payroll_month
		}
	console.log(obj);
		$http.post('/erp/Payroll/RejectPayroll',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						$("#deisplay").show();
						$("#approve").hide();
						$("#validate").hide();
						$("#generate").hide();
						
						alert("Payroll Rejected  Successfully");
						
						
					} else {
						alert("Data not inserted");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	$scope.getPayrollDetails = function(details) {
		console.log(details);
		var obj = {
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value,
				financial_year:details.financial_year,
				payroll_month:details.payroll_month
		}   
		console.log(obj);
		$http
				.post('/erp/Payroll/getPayrollDetails', obj)
				.then(
						function(response) {
							var sum = 0;
							$scope.data1 = response.data;
							if ($scope.data1.successful) {
								$scope.payrollDetails = $scope.data1.responseObject.payroll;
								$scope.payrollDetails1 = $scope.data1.responseObject.payroll1;
								$scope.payrollDetails2 = $scope.data1.responseObject.payroll2;
								$scope.payrollDetails3 = $scope.data1.responseObject.payroll3;
								$scope.payrollDetails4 = $scope.data1.responseObject.payroll4;
								$scope.payrollDetails5 = $scope.data1.responseObject.payroll5;
								$scope.payrollDetails6 = $scope.data1.responseObject.payroll6;
								console.log(payrollDetails4);
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
	
	$scope.getJVModalData = function(UserData) {
		console.log(UserData);
		var obj={ 
				financial_year:$scope.payrollDetails5.financial_year,
				payroll_month:$scope.payrollDetails5.payroll_month,
				payslip_head:UserData.id
				}
	console.log(obj);
		$http.post('/erp/Payroll/getPayRollJVModelData',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						$scope.JVpayrollModalData = response.data.responseObject.payRollJVModelData;
					
					} else {
						alert("Data Not Found");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
	$scope.getJVModalDataOthers = function(UserData) {
		console.log(UserData);
		var obj={ 
				financial_year:$scope.payrollDetails5.financial_year,
				payroll_month:$scope.payrollDetails5.payroll_month,
				payslip_head:UserData.id
				}
	console.log(obj);
		$http.post('/erp/Payroll/getPayRollJVModelDataOthers',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						$scope.JVpayrollModalDataOthers = response.data.responseObject.payRollJVModelDataOthers;
					
					} else {
						alert("Data Not Found");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
	$scope.getJVModalDataPaymentSummary = function(UserData) {
		console.log(UserData);
		var obj={ 
				financial_year:$scope.payrollDetails5.financial_year,
				payroll_month:$scope.payrollDetails5.payroll_month,
				payslip_head:UserData.id
				}
	console.log(obj);
		$http.post('/erp/Payroll/getJVModalDataPaymentSummary',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						$scope.JVpayrollModalDataPaymentSummary = response.data.responseObject.payRollJVModelDataPaymentSummary;
					
					} else {
						alert("Data Not Found");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};
	
	$scope.getJVModalDataDeputation = function(UserData) {
		console.log(UserData);
		var obj={ 
				financial_year:$scope.payrollDetails5.financial_year,
				payroll_month:$scope.payrollDetails5.payroll_month,
				payslip_head:UserData.id
				}
	console.log(obj);
		$http.post('/erp/Payroll/getJVModalDataDeputation',obj).then(  
				function(response) {    
					$scope.data = response.data;        
					if ($scope.data.successful) {
						$scope.JVpayrollModalDataDeputation = response.data.responseObject.payRollJVModelDataDeputation;
					
					} else {
						alert("Data Not Found");    
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		
	};


}]);

