var lopAdjustmentsModule=angular.module('lopAdjustmentsModule',[]);

lopAdjustmentsModule.controller('lopAdjustmentController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/leavesreport/getFinancialYears').then(function(response) {
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
	
	

	$http.get('/erp/leavesreport/getMonths').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.months = $scope.data.responseObject;
			console.log($scope.months);
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
	
	$scope.getEmployees = function(data) {
		console.log(data);
		varobj = {

			
				payroll_id :data.payroll_id
		} 
		console.log(obj);
	$http.post('/erp/leavesreport/getEmployees', obj).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.employees = $scope.data.responseObject;
			console.log($scope.employees);
			$scope.data = {
					object : data
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
	};  
	
	$scope.getEmployeeLOPDetails = function(data){
		console.log(data);
		
		$http.post('/erp/leavesreport/getEmployeeLOPDetails',data).then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful) { 
			$("#itemsTable").show();
			$scope.lopAdjustmentDetails = $scope.data.responseObject.centers;
			console.log($scope.lopAdjustmentDetails);
		} else {
			showError($scope.data.errorMessage);   
			var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
			jQuery("#errorDiv").html(message);
		}
	}, function(errResponse) {         
		console.error('Error ...');   
	});   
	};  
	
	$scope.getLOPCount = function(data) {
		console.log(data);
		varobj = {

			
			empid :data.empid
		}   
		$http
				.post('/erp/leavesreport/getLOPCount',
						obj)   
				.then(
						function(response) {   
							$scope.data = response.data;   
							console.log($scope.data);  
							if ($scope.data.successful) {

								

								$scope.lop_days = $scope.data.responseObject;	
								console.log($scope.lop_days);
								data.lop_days = $scope.lop_days[0].lop_days,
								
								
										
								$scope.data = {
									object : data
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
	


	
	$scope.saveEmployeeLOPDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/leavesreport/saveEmployeeLOPDetails',data).then(function(response)
									{					
										
										$scope.data1 = response.data;
										
										if($scope.data1.successful)
								           {  
											
										/*swal({  
										            title: "Success!",  
										
										            type: "success"
										        }, function() {
											
										        });  
											      */
								           }
									});  
							
						}
					
			
			
		
		
		
	

	
	
}]);   
