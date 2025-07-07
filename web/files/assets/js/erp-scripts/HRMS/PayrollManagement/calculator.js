var project = angular.module('calculator', []);
project.controller('calculatorcontroller',['$scope','$http',function($scope,$http)
{
	
	/* Getting employees */
	
	$scope.getemployees = function(totalObj)
	{
		console.log(totalObj);
		$http.post('/erp/ctc/getemployees', totalObj.ctc_calculator).then(function(response)
		{
			$scope.data = response.data;
			if($scope.data.successful)  
			{
				$scope.empids = $scope.data.responseObject;
				$scope.data = {object : totalObj};   
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
	}

}]);