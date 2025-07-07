var order = angular.module('order', []);
order.controller('orderController',['$scope','$http',function($scope,$http)
{
	
	/* getting programs drop down */
	/*$http.get('/erp/procurement/getmous').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.mous = $scope.data.responseObject;   
		}
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response)
	{   
		console.log("Server error while getting data");   
	});*/
	
	$http.get('/erp/procurement/getworkorders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.workorders = $scope.data.responseObject;
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
	
	$http.get('/erp/procurement/getpurchaseorders').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.purchaseorders = $scope.data.responseObject;
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
	$http.get('/erp/employee/getEmp').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.empnames = $scope.data.responseObject;
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
	$scope.comm = function() {
		$("#com").show();
	}
	
	
	$scope.getWorkorderDetails = function(data)
	{
		
		
		
		$http.post('/erp/procurement/getWorkorderDetails',data).then(function(response)
		{   
			$scope.data= response.data;     
			console.log($scope.data);    
			if ($scope.data.successful)
			{
				$scope.data = $scope.data.responseObject;
				console.log($scope.data);   
			
				data.workorder_id=$scope.data[0].workorder_id
				data.vendor_id = $scope.data[0].vendor_id,   
				data.empcreated_by = $scope.data[0].empcreated_by,
				data.empincharge = $scope.data[0].empincharge,
				$scope.data = {    
						object : data
				};    
		       
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
	
	
	
	$scope.getPODetails = function(data)
	{
		$http.post('/erp/procurement/getPODetails',data).then(function(response) 
		{       
			$scope.data= response.data;     
			console.log($scope.data);    
			if ($scope.data.successful) 
			{
				$scope.data = $scope.data.responseObject;
				console.log($scope.data);
				data.wopurchaseorder_id = $scope.data[0].wopurchaseorder_id,  
				data.wovendor_id = $scope.data[0].wovendor_id,   
				data.wocreated_by = $scope.data[0].wocreated_by,
				data.woincharge = $scope.data[0].woincharge,
				$scope.data = 
				{    
						object : data
				};    
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
	
	
	
	
	
	
	$scope.addordermanagement = function(Data)
	{
		$http.post('/erp/procurement/addordermanagement', Data).then(function(response)
		{
			$scope.data = response.data; 
			console.log($scope.data);
			if ($scope.data.successful) 
			{
				alert("User Details Successfully updated");
				
			}
			else
			{
				alert("Data not updated");
			}
		},
		function(errResponse) 
		{ 
			console.error('Error  while fetching notes'); 
		})
	};
		  

	
}]);