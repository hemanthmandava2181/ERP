
var vendor = angular.module('VendorAppModule', []);
vendor.controller('VendorAppController',['$scope','$http',function($scope,$http)
{

vendor.filter('numberFormat', function () {
return function(input) {  
    input = input || 0;
    var out = new Intl.NumberFormat('en-IN').format(parseInt(input));
    return out;
};
})  
                               
.filter('sumOfValue', function() {
   return function(data, key) {
     if (angular.isUndefined(data) || angular.isUndefined(key))
       return 0;
     var sum = 0;
     angular.forEach(data, function(v, k) {    
       sum = sum + parseInt(v[key]);
     });    
     return sum;      
   };
})

$http.get('/erp/vendorapp/getAll').then(function(response) {
$scope.data = response.data;  
if($scope.data.successful)
{
$scope.regdetails = $scope.data.responseObject;
}
else
{
console.log("Client error while getting data");  
}
});



$scope.getById = function(vendor_id){   
	
	console.log(vendor_id);  
	ERP.setSessionValue("vendor_id",vendor_id);
	ERP.showvendorcreationviewPage();
}
   



/*$scope.getById = function(Data){

$http.post('/erp/vendorapp/getById',Data).then(function (response) {
   $scope.data13 = response.data;
   if ($scope.data13.successful) {
       $scope.data = {object:$scope.data13.responseObject};
   } else {
    //alert("Error while getting data");
    console.log("error")
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});    
};  */

$scope.name=null,$scope.filteredResult = null;
   
$scope.getNameWiseData = function(obj) {      
$scope.getBranchWisePrograms = function(totalObj)
{
Andromeda.setSessionValue("studentBranchId", totalObj.name);

$("#glyphiconid").show();        
$scope.name = totalObj.name;
$http.post('/erp/vendorapp/getBranchWisePrograms', totalObj.name).then(function(response)
{
$scope.data = response.data;
if($scope.data.successful)
{
$scope.regdetails = $scope.data.responseObject;
/*$("#div1").hide();
$("#lb6b").show();
$("#div4").hide();*/
$("#glyphiconid").hide();
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
};
}


$scope.getIdWiseData = function(obj) {      
$scope.getBranchWisePrograms = function(totalObj)
{
Andromeda.setSessionValue("studentBranchId", totalObj.name);

$("#glyphiconid").show();        
$scope.name = totalObj.name;
$http.post('/erp/vendorapp/getBranchWisePrograms', totalObj.name).then(function(response)
{
$scope.data = response.data;
if($scope.data.successful)
{
$scope.regdetails = $scope.data.responseObject;
/*$("#div1").hide();
$("#lb6b").show();
$("#div4").hide();*/
$("#glyphiconid").hide();
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
};

}
$scope.toggle = function(id)
{
$("#" + id).toggle();
};
}]);

