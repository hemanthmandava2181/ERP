var employee = angular.module('localconveyancerates', []);
employee.controller('localconveyanceController',['$scope','$http',function($scope,$http)
	{
	
	/* creating local conveyance rate */
	$scope.createlocalconveyancerate = function(LocalconveyanceData) {	
		console.log(LocalconveyanceData);
		$http.post('/erp/finance/createlocalconveyancerate',LocalconveyanceData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Local Conveyance Created Successfully");
						ERP.showLocalConveyanceRates();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		/* getting all local conveyance data to table */
		$http.get('/erp/finance/getallllocalconveyancesdata').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.userdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});
		
		/* getting local conveyance data based on id */
		$scope.getlocalconveyancedata = function(id){
			console.log(id);
			/*alert(empid);*/
			$http.post('/erp/finance/getlocalconveyancedata', id).then(
			function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.data={object:$scope.data.responseObject};
				} else {
					alert("Error while getting data");
				}
			}, function(errResponse) {
				console.error('Error while fetching notes');
			});
		};
		
		/* update local conveyance data based on id */
		$scope.updatelocalconveyancedata = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/updatelocalconveyancedata', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							/*Andromeda.showcreatecostcenterPage();*/
							swal("Local Conveyance Data Successfully updated");
							location.reload();
							
						} else {   
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
		
		
		
}]);