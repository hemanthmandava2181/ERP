var employee = angular.module('taxSection', []);
employee.controller('TaxSectionController',['$scope','$http',function($scope,$http)
	{
	
	$http.post('/erp/finance/getAllSections').then(function(response) {
		console.log("Executed");
		$scope.data1 = response.data;
		if($scope.data1.successful)
		{
			
			$scope.Tax = $scope.data1.responseObject;
		}
		else
		{
			swal("Can't view the Data");
			console.log("Client error while getting data");  
		}}, function(errResponse) {
			//console.error('Error while viewing notes');
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
							
						  swal("Tax Section Details Updated Successfully");
						  $("#myModal").hide();
						  $('.modal-backdrop').remove();
						  ERP.showTaxSection();
						  
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