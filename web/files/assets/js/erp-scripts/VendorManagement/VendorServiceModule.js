/*var employee = angular.module('VendorServiceModule', []);
employee.controller('natureofServiceController',['$scope','$http',function($scope,$http)
{

 inserting cost center 
$scope.createnatureofservice = function(ServiceData) {
console.log(ServiceData);
$http.post('/erp/vendorservice/createnatureofservice',ServiceData).then(  
function(response) {    
$scope.data = response.data;          
if ($scope.data.successful) {
alert("Nature Of Service Created Successfully");
Andromeda.showNatureService();
} else {    
alert("Data not inserted");    
}  
}, function(errResponse) {
console.error('Error while fetching notes');
});
};

 getting all cost center data in table 
$http.get('/erp/vendorservice/getnatureofservices').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{  
$scope.userdetails = $scope.data.responseObject;
}
else
{
console.log("Client error while getting data");  
}
});

 getting coste center data based on cost center name 
$scope.getnatureofservice = function(service_name){
console.log(service_name);
alert(empid);
$http.post('/erp/vendorservice/getnatureofservice', service_name).then(
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

 updating cost center data based on cost center name 
$scope.updatenatureofservice = function(UserData){
console.log(UserData);  
alert(UserData.empid);
$http.post('/erp/vendorservice/updatenatureofservice', UserData).then(
function(response) {
$scope.data = response.data;  
if ($scope.data.successful) {
Andromeda.showNatureService();
alert("Nature of Service Successfully updated");

} else {
alert("Data not updated");
}
}, function(errResponse) {
console.error('Error while fetching notes');
});
};
}]);
*/









var vendorservice = angular.module('VendorServiceModule', []);
var documentsArr = [];

									vendorservice.filter('numberFormat', function () {
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
 
									vendorservice.controller('natureofServiceController',['$scope','$http',function($scope,$http)
									{
									$scope.save = function(UserData)
									{
										/*if(UserData != undefined)                
										{      
											if(UserData.service_name == null || UserData.service_name == undefined || UserData.service_name == "")
											{
												swal("Oops","Please, Enter vendor service name ","info");
											}


									else
									{*/
											$http.post('/erp/vendorservice/add', UserData).then(
											function(response) 
														{    

																$scope.data = response.data;
																console.log($scope.data);
															if ($scope.data.successful) {
																alert("User Data Inserted Successfully");
															} else {
																alert("Data not inserted");
															}
														},
										  				function(errResponse) {
															console
																	.error('Error while fetching notes');
														});
									/*}
									;
								}*/
							};

							$http.get('/erp/vendorservice/getAll').then(function(response)
									{
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

$scope.name=null,$scope.filteredResult = null;
   
$scope.getNameWiseData = function(obj) {      
$scope.getBranchWisePrograms = function(totalObj)
{
Andromeda.setSessionValue("studentBranchId", totalObj.name);

$("#glyphiconid").show();        
$scope.name = totalObj.name;
$http.post('/erp/vendorservice/getBranchWisePrograms', totalObj.name).then(function(response)
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




$scope.getById = function(Data){

$http.post('/erp/vendorservice/getById',Data).then(function (response) {
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
};    

$scope.updateData = function(Data){
$http.post('/erp/vendorservice/updateData', Data).then(function (response) {

$scope.data = response.data;    
if ($scope.data.successful) {
 alert("User Details Successfully updated");

} else {
 alert("Data not updated");
}
}, function(errResponse) {
console.error('Error while fetching notes');
})
};

$scope.toggle = function(id)
{  
$("#" + id).toggle();
};

}]);
