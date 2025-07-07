var employee = angular.module('candidateregistration', []);
employee.controller('candidateregistration',['$scope','$http',function($scope,$http)
	{
	
	/* Required Position */
	
	$http.get('/erp/purchase/getPositions').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.positions = $scope.data.responseObject;
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
	
	
	/* getting branches and education */
	
	
	$http.get('/erp/Employee/getEducations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.educations = $scope.data.responseObject;
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
	
	
	$scope.getBranches = function(totalObj)
	{
		console.log(totalObj);
		$http.post('/erp/Employee/getBranches', totalObj.education_id).then(function(response)
		{
			$scope.data = response.data;
			if($scope.data.successful)  
			{
				$scope.branches = $scope.data.responseObject;
				$scope.data = {object : totalObj};   
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
	}
	
	
	/* sending data to data base */
	
	/*$scope.register = function(UserData) {
		console.log(UserData);    
		alert(UserData.candidate_name + ' Registration Successful');
		$http.post('/erp/Employee/add1', UserData).then(
				function(response) {         
					$scope.data = response.data;
					if ($scope.data.successful) {
						alert("Register Data Inserted Successfully");
						
					} else {      
						alert("Data not inserted");
					}   
				}, function(errResponse) {  
					console.error('Error while fetching notes');  
				});
		
	};*/
	
	$scope.register = function(UserData) {
		console.log(UserData);    
		alert(UserData.candidate_name + ' Registration Successful');
		$http.post('/erp/Employee/add1', UserData).then(
				function(response) {         
					$scope.data = response.data;
					if ($scope.data.successful) {
						alert("Register Data Inserted Successfully");
					} else {   
						alert("Data not inserted");   
					}   
				}, function(errResponse) {  
					console.error('Error while fetching notes');  
				});
	}; 
	

	    
}]);