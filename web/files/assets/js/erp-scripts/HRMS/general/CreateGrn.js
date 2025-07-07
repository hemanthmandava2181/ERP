var employee = angular.module('CreateGrn', []);
employee.controller('CreateGrnController',['$scope','$http',function($scope,$http)
{
$http.get('/erp/polist/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.vendordetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});

$http.get('/erp/polist/getAll').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.linedetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
});

$http.get('/erp/polist/getAll').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.slinedetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
});

$http.get('/erp/polist/getAllpo').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.assdetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
});
<!--get employee name for checked by field-->
$http.get('/erp/polist/checkedBy').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.empdetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
});
$http.get('/erp/employee/getDistricts').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.districts = $scope.data.responseObject;
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




/* get grn details*/
/*$scope.savePresentgrns = function(data) {
var purchaseorder_id =document.getElementById("p1").value;
console.log("purchaseorder_id " +purchaseorder_id);   
$http.post('/erp/polist/getGrnDetails',purchaseorder_id).then(function (response) {
$scope.data13 = response.data;
if ($scope.data13.successful) {
   $scope.data2 = {object:$scope.data13.responseObject};
   console.log("Successful");
} else {
	//alert("Error while getting data");
	console.log("error")                             
  
}
}, function (errResponse) {
console.error('Error while fetching notes');    
});  
}*/
//Get Data from Database based on purchaseorder_id
$scope.getByPo = function(data){
	console.log(data);
	alert(data.purchaseorder_id);
	$http.post('/erp/polist/getByPo', data.purchaseorder_id).then(
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

 /*getting vendor invoice field*/
$http.get('/erp/polist/getVendor').then(function(response) {
	$scope.data = response.data;
	if($scope.data.successful)
	{
		$scope.vendordetails = $scope.data.responseObject;
	}
	else
	{
		console.log("Client error while getting data");  
	}
});
  





}]);             