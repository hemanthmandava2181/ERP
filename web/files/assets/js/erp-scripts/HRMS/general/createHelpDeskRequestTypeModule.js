varcreateHelpDeskModule=angular.module('createHelpDeskModule',[]);

createHelpDeskModule.controller('HelpDeskController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/employee/getAllHelpDeskTypes').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.HelpDesk = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByHelpDesk = function(data){
		console.log(data)
		$http.post('/erp/employee/getByHelpDesk',data).then(function (response) {
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
		
		$scope.updateHelpDeskData = function(Data){
			console.log(Data);
			$http.post('/erp/employee/updateHelpDeskData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {

						alert("Help Desk Request Type Details Successfully updated");
						  $("#myModal").hide();
						
						
						
						} else {      
						alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
	$scope.saveHelpDeskDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/employee/saveHelpDeskDetails',data).then(function(response)
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
