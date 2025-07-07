var createCasteModule=angular.module('createCasteModule',[]);

createCasteModule.controller('CasteController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/employee/getCastes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.Caste = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByCaste = function(data){
		console.log(data)
		$http.post('/erp/employee/getByCaste',data).then(function (response) {
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
		
		$scope.updateCasteData = function(Data){
			console.log(Data);
			$http.post('/erp/employee/updateCasteData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("Caste Details Successfully updated");
						  $("myModal").hide();
						
						
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
	$scope.saveCasteDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/employee/saveCasteDetails',data).then(function(response)
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
