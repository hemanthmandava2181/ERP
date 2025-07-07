var createDesignationModule=angular.module('createDesignationModule',[]);

createDesignationModule.controller('DesignationController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/employee/getAllDesignations').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.Designation = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByDesignation = function(data){
		console.log(data)
		$http.post('/erp/employee/getByDesignation',data).then(function (response) {
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
		
		$scope.updateDesignationData = function(Data){
			console.log(Data);
			$http.post('/erp/employee/updateDesignationData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {

						alert("Designation Details Successfully updated");
						  $("myModal").hide();
						
						
						
						} else {   
						alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
	$scope.saveDesignationDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/employee/saveDesignationDetails',data).then(function(response)
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
					
			
			

	$http.get('/erp/employee/getCaders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.caders = $scope.data.responseObject;
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
		
	$http.get('/erp/employee/getGrades').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.grades = $scope.data.responseObject;
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
	
	$http.get('/erp/employee/getDesignationGroups').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.groups = $scope.data.responseObject;
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
	

	
	
}]);   
