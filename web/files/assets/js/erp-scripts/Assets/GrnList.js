var grnlist = angular.module('GrnList', []);
grnlist.controller('GrnlistController',['$scope','$http',function($scope,$http)
{
/*$http.get('/erp/polist/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.linedetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});*/
	$scope.getGrnListReport = function(data)
	{        
			console.log(data);
			$http.post('grn/getGrnListReport',data).then(function(response)
		{   
	    	$scope.data = response.data;                
			if($scope.data.successful)                                              
			{      	    					  
				console.log($scope.data);  
				$scope.grnlistdetails = $scope.data.responseObject.centers; 
				console.log($scope.grnlistdetails);
			}             
			else
			{              
				var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
				jQuery("#errorDiv").html(message);
			}
		},     
		function(errResponse)   
		{
			console.error('Error while fetching notes');
		}); 
	}
	
}]);          