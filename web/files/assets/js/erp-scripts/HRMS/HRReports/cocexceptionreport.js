var cocexceptionmodule= angular.module('cocexceptionmodule', []);
cocexceptionmodule.controller('COCExceptionController', [ '$http', '$scope', function($http, $scope) {	 
		
	     
	      
	      
	      $http.get('/erp/report/getCoCExceptionReport').then(function(response) {
  			$scope.data = response.data;
  			if($scope.data.successful)
  			{
  				
  				$scope.allcocexceptions = $scope.data.responseObject;
  				console.log($scope.allcocexceptions);
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
	      
	     
	      
	     
	     
} ]);