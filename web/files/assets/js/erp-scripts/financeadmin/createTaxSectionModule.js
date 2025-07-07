
var createTaxCreationModule=angular.module('createTaxCreationModule',[]);

createTaxCreationModule.controller('TaxController',['$scope','$http',function($scope,$http){
	
	$http.get('/erp/finance/getAllSections').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			
			$scope.Tax = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$scope.getByTax = function(id){
		console.log(id)
		$http.post('/erp/finance/getByTax',id).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		        console.log( $scope.data);
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		
		$scope.updateTaxData = function(Data){
			$http.post('/erp/finance/updateTaxData', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("Tax Section Details Updated Successfully");
						  $("#myModal").hide();
						  $('.modal-backdrop').remove();
						  Andromeda.showTaxSection();
						  
						} else {   
						  alert("Data not updated");   
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
	   
	$scope.saveTaxDetails = function(data)
	{
		console.log(data);
		$http.post('/erp/finance/saveTaxDetails',data).then(function(response)
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