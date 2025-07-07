var createWorkLocationModule=angular.module('createWorkLocationModule',[]);

createWorkLocationModule.controller('LocationController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/employee/getAllLocations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.Location = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByLocation = function(data){
		console.log(data)
		$http.post('/erp/employee/getByLocation',data).then(function (response) {
		    $scope.data13 = response.data;
		if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		    } else {   
			//alert("Error while getting data");
			console.log("error")
		
		    }
		}, function (errResponse) {  
		console.error('Error while fetching notes');    
		});   
		};  
		
		$scope.updateLocationData = function(Data){
			console.log(Data);
			$http.post('/erp/employee/updateLocationData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("Work Location Details Successfully updated");
						  $("myModal").hide();
						
						
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
	$scope.saveLocationDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/employee/saveLocationDetails',data).then(function(response)
									{					
										
										$scope.data1 = response.data;
										
										if($scope.data1.successful)
								           {  
											
										swal({  
										            title: "Success!",  
										
										            type: "success"
										        }, function() {
											
										        });  
											
								           }
									});  
							
						}
					
			
			

	
	
}]);
