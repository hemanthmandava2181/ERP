var createGradeModule=angular.module('createGradeModule',[]);

createGradeModule.controller('GradeController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/employee/getAllGrades').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.Grade = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByGrade = function(data){
		console.log(data)
		$http.post('/erp/employee/getByGrade',data).then(function (response) {
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
		
		$scope.updateGradeData = function(Data){
			console.log(Data);
			$http.post('/erp/employee/updateGradeData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
						
						  alert("Grade Details Successfully updated");
						  $("myModal").hide();
						
						
						
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
	$scope.saveGradeDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/employee/saveGradeDetails',data).then(function(response)
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
