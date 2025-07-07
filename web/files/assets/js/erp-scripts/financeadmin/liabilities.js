var employee = angular.module('liabilities', []);
employee.controller('liabilityController',['$scope','$http',function($scope,$http)
	{
	
	/* Inserting Liabilities */
	$scope.addliability = function(LiabilityData) {	
		console.log(LiabilityData);
		$http.post('/erp/finance/addliability',LiabilityData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
			    		/*	$("#com").show(); */
						alert("Equity Liability Inserted Successfully");
						Andromeda.showliabilitisPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		/* getting liabilities head dropdown */
		$http.get('/erp/finance/getliabilitiesheads').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.heads = $scope.data.responseObject;
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
		
		/* getting all liabilities in table */
		$http.get('/erp/finance/getallliabilities').then(function(response) {
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
	
	
}]);