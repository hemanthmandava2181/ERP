var employee = angular.module('natureofService', []);
employee.controller('NatureofServiceController',['$scope','$http',function($scope,$http)
	{
	
	/* inserting cost center */
	$scope.createnatureofservice = function(ServiceData) {	
		console.log(ServiceData);
		$http.post('/erp/finance/createnatureofservice',ServiceData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("Nature Of Service Created Successfully");
						ERP.showNatureService();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
	/* getting all cost center data in table */
		$http.get('/erp/finance/getalllnatureofservices').then(function(response) {
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
	
	/* getting coste center data based on cost center name */
		$scope.getnatureofservice = function(service_name){
			console.log(service_name);
			/*alert(empid);*/
			$http.post('/erp/finance/getnatureofservice', service_name).then(
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
		
	/* updating cost center data based on cost center name */
		$scope.updatenatureofservice = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/updatenatureofservice', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							ERP.showNatureService();
							alert("Nature of Service Successfully updated");
							
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};	
	
	
		
}]);