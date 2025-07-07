var createDepartmentModule=angular.module('letterheadModule',[]);

createDepartmentModule.controller('LetterheadController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/calc/getAllLetterheads').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.letterheadsdata = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByletterhead = function(data){
		console.log(data)
		$http.post('/erp/calc/getByletterhead',data).then(function (response) {
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
		
		$scope.updateLetterhead = function(Data){
			$http.post('/erp/calc/updateLetterhead', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						alert("Department Details Successfully updated");
						  $("myModal").hide();
						
						} else {   
						alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
	$scope.saveLetterhead = function(data)
	{
		
		console.log(data);
		$http.post('/erp/calc/saveLetterhead',data).then(function(response)
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
