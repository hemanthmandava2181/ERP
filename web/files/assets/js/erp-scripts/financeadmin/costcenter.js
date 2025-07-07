var employee = angular.module('costcenter', []);
employee.controller('costcenterController',['$scope','$http',function($scope,$http)
	{
	
	/* inserting cost center */
	$scope.createcostcenter = function(CostcenterData) {	
		console.log(CostcenterData);
		$http.post('/erp/finance/createcostcenter',CostcenterData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("Cost Center Created Successfully");
						Andromeda.showcreatecostcenterPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
	/* getting all cost center data in table */
		$http.get('/erp/finance/getalllcostcenters').then(function(response) {
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
	
	/* getting cost center data based on cost center name */
		$scope.getcostcenterdata = function(name){
			console.log(name);
			/*alert(empid);*/
			$http.post('/erp/finance/getcostcenterdata', name).then(
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
		$scope.updatecostcenter = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/updatecostcenter', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							/*Andromeda.showcreatecostcenterPage();*/
							alert("Cost Center Successfully updated");
							$("#myModel").hide();
							$('.modal-backdrop').remove();
							
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		

		
}]);