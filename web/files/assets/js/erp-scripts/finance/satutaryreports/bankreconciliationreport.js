var bankreconciliationreport = angular.module('bankreconciliationreport', []);
bankreconciliationreport.controller('bankreconciliationreportController',['$scope','$http',function($scope,$http)
	{
	
	$http.get('/erp/finance/getAllBankAccounts').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.bankAccounts = $scope.data.responseObject;
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
	
	$scope.getBankDetails = function(details){
		console.log(details);
		
		var obj = {   
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value,
				id:details.id
			
			};
		console.log(obj);   
		$http.post('/erp/finance/getBankDetails',obj).then(function (response) {
		    $scope.data = response.data;
		    if ($scope.data.successful) {
		    	$("#report").show();
				$("#report1").hide();
				
		        $scope.bankDetails = $scope.data.responseObject.bank;
		        console.log($scope.bankDetails);
		    } else {
	   
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		
		$scope.getByBankDetails = function(id){
			console.log(id)
			$http.post('/erp/finance/getByBankDetails',id).then(function (response) {
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
		$scope.updateBankDetails = function(Data){
			console.log(Data);
			
		
			$http.post('/erp/finance/updateBankDetails', Data).then(function (response) {
					
						$scope.data = response.data;     
						if ($scope.data.successful) {
							
						  alert("Bank Date Updated Successfully");
						  $("#myModal").hide();
						  $('.modal-backdrop').remove();
						  $("#display").show();
						  $("#report").hide();
						  
						  
						} else {   
						  alert("Data not updated");      
						}
					}, function(errResponse) {
					console.error('Error while fetching notes');
					})
		};
		
		
	
}]);