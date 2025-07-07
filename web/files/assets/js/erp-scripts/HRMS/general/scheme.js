var scheme = angular.module('schemeModule', []);
scheme.controller('schemeController',['$scope','$http',function($scope,$http)
{
$scope.registration = function(UserData) {
console.log(UserData);
if(UserData==null || UserData=='' || UserData==undefined)
 {
  swal("Enter all details!");
 }
else if(UserData.financial_year == null || UserData.financial_year== '' || UserData.financial_year== undefined)
 {
  swal("Select Financial Year!");
 }
else if(UserData.sdei_groupnumber == null || UserData.sdei_groupnumber == '' || UserData.sdei_groupnumber == undefined)
 {
  swal("Select SDEI Group Name!");
 }
else if(UserData.scheme_id == null || UserData.scheme_id == '' || UserData.scheme_id == undefined)
 {
  swal("Select Scheme Id!");
 }
else if(UserData.scheme_name == null || UserData.scheme_name == '' || UserData.scheme_name == undefined)
 {
  swal("Select Secheme Name!");
 }
else if(UserData.scheme_type == null || UserData.scheme_type == '' || UserData.scheme_type == undefined)
 {
  swal("Select Scheme Type!");
 }
else if(UserData.capex_budgetvalue == null || UserData.capex_budgetvalue == '' || UserData.capex_budgetvalue == undefined)
 {
  swal("Enter CAPEX Budget Value!");
 }
else if(UserData.opex_budgetvalue == null || UserData.opex_budgetvalue == '' || UserData.opex_budgetvalue == undefined)
 {
  swal("Enter OPEX Budget Value!");
 }
else if(UserData.from_date == null || UserData.from_date == '' || UserData.from_date== undefined)
 {
  swal("Select From Date!");
 }
else if(UserData.to_date == null || UserData.to_date == '' || UserData.to_date == undefined)
 {
  swal("Select To Date!");
 }
/*else if(UserData.primary_responsibiity == null || UserData.primary_responsibiity == '' || UserData.primary_responsibiity == undefined)
 {
  swal("Select Primary Responsibility!");
 }
else if(UserData.secondary_responsibility == null || UserData.secondary_responsibility == '' || UserData.secondary_responsibility == undefined)
 {
  swal("Select Secondary Responsibility!");
 }*/
else if(UserData.description == null || UserData.description == '' || UserData.description == undefined)
 {
  swal("Enter Description!");
 }
else if(UserData.headcount == null || UserData.headcount == '' || UserData.headcount == undefined)
 {
  swal("Enter Head Count!");
 }
else if(UserData.physical_outcome == null || UserData.physical_outcome== '' || UserData.physical_outcome== undefined)
 {
  swal("Enter physical outcome!");
 }

else{

alert(UserData.financial_year + '  Successful');
$http.post('/erp/scheme/add', UserData).then(
function(response) {
$scope.data = response.data;  
if ($scope.data.successful) {
location.reload();  
swal("User Data Inserted Successfully");
} else {
swal("Data not inserted");
}
}, function(errResponse) {
console.error('Error while fetching notes');
});
}

};
$http.get('/erp/scheme/getYears').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.years = $scope.data.responseObject;
console.log($scope.years);
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
$http.get('/erp/scheme/getNames').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.primarys = $scope.data.responseObject;
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
$http.get('/erp/scheme/getNames').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.secondarys = $scope.data.responseObject;
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
$http.get('/erp/scheme/getSdeigroups').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.sdeigroups = $scope.data.responseObject;

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


$http.get('/erp/scheme/getAll').then(function(response) {
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


$scope.getById = function(financial_year){
alert(financial_year);
$http.post('/erp/scheme/getById', financial_year).then(
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

$scope.removeData = function(financial_year) {
$http.post('/erp/scheme/removeData',financial_year).then(
function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
location.reload();
alert("User Data removed Successfully");
} else {
alert("Data not Deleted");
}
}, function(errResponse) {
console.error('Error while fetching notes');
});




};



$scope.updateData = function(UserData){
$http.post('/erp/scheme/updateData', Data).then(function (response) {

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



}]);

