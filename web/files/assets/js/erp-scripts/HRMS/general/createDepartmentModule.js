var createDepartmentModule=angular.module('createDepartmentModule',[]);

createDepartmentModule.controller('DepartmentController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/employee/getAllDepartments').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.Departments = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByDepartment = function(data){
		console.log(data)
		$http.post('/erp/employee/getByDepartment',data).then(function (response) {
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
		
		$scope.updateData = function(Data){
			$http.post('/erp/employee/updateData', Data).then(function (response) {
					
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
		
	
	$scope.saveDepartmentDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/employee/saveDepartmentDetails',data).then(function(response)
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
