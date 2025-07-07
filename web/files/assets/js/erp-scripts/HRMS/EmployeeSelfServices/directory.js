var directory= angular.module('directoryModule', [])
directory.controller('DirectoryController',['$scope','$http',function($scope,$http)
	{
	
	
			$http.get('/erp/selfservice/getEmployeeDirectory').then(   
					function(response) {
						$scope.data = response.data;   
						if($scope.data.successful)
						{
							$scope.directorydata = $scope.data.responseObject;
						}
						else   
						{      
							console.log("Client error while getting data");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			
			
			$scope.Getdata = function(SingleUserData) 
			{
				$scope.SingleData=SingleUserData;
			}
			
	
			
}]);