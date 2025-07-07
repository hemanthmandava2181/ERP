var createReqTypeModule=angular.module('ReqtypeModule',[]);

createReqTypeModule.controller('HelpDeskReqTypeController',['$scope','$http',function($scope,$http){
	
	
	$http.get('/erp/selfservice/getCategories').then(
			function(response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
			$scope.categories = $scope.data.responseObject;
			console.log($scope.categories);
			} else {
			console.log("Client error while getting data");
			}        
			}, function(response) {
			console.log("Server error while getting data");        
			});

	$http.get('/erp/report/getAllHelpdeskReqType').then(
			function(response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
			$scope.reqtypes = $scope.data.responseObject;
			console.log($scope.reqtypes);
			} else {
			console.log("Client error while getting data");
			}
			}, function(response) {
			console.log("Server error while getting data");
			});

	
	$scope.getByIdCategories = function(helpdesk_categoryid){
		alert(helpdesk_categoryid);
		$http.post('/erp/report/getByIdCategories',helpdesk_categoryid).then(
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
	
		$scope.updateReqTypeData = function(Data){
			console.log(Data);
			$http.post('/erp/report/updateReqTypeData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert(" Successfully updated");
						 
						
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	
	$scope.saveReqTypeDetails = function(data)
	{
		
		console.log(data);
		$http.post('/erp/report/saveReqTypeDetails',data).then(function(response)
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