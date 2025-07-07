var program = angular.module('programModule', []);
program.controller('programController',['$scope','$http',function($scope,$http)
{
$http.get('/erp/program/getNames').then(function(response) {
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
// Delete UserData based on Name
$scope.removeData = function(program_name) {
$http.post('/erp/program/removeData',program_name).then(
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
$http.get('/erp/program/getGroups').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.groups = $scope.data.responseObject;

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

$http.get('/erp/program/getDistricts').then(function(response) {
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


$http.get('/erp/program/getSegments').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.segments = $scope.data.responseObject;
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
$http.get('/erp/program/getSchemes').then(function(response) {
$scope.data = response.data;
console.log($scope.data);            
if($scope.data.successful)      
{      
$scope.schemes = $scope.data.responseObject;
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


$scope.getProjects = function(totalObj)
{
$http.post('/erp/program/getProjects', totalObj.scheme_id).then(function(response)
{
$scope.data = response.data;
if($scope.data.successful)
{
$scope.projects = $scope.data.responseObject;
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
 
$http.get('/erp/program/getSectors').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.sectors = $scope.data.responseObject;
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


$scope.registration = function(UserData)
{
console.log(UserData);
if(UserData==null || UserData=='' || UserData==undefined)
 {
  swal("Enter all details!");
 }
else if(UserData.program_id== null || UserData.program_id== '' || UserData.program_id== undefined)
 {
  swal("Select Program Id!");
 }
else if(UserData.program_name == null || UserData.program_name== '' || UserData.program_name== undefined)
 {
  swal("Select Program!");
 }
else if(UserData.project_id == null || UserData.project_id== '' || UserData.project_id== undefined)
 {
  swal("Select Project!");
 }
/*else if(UserData.district_id == null || UserData.district_id == '' || UserData.district_id == undefined)
 {
  swal("Select District!");
 }
else if(UserData.sector_id == null || UserData.sector_id== '' || UserData.sector_id == undefined)
 {
  swal("Select Sector Name!");
 }*/
else if(UserData.segment_id == null || UserData.segment_id== '' || UserData.segment_id == undefined)
 {
  swal("Select Segment Type!");
 }
else if(UserData.other == null || UserData.other == '' || UserData.other == undefined)
 {
  swal("Enter Other!");
 }
else if(UserData.capex_budgetvalue == null || UserData.capex_budgetvalue == '' || UserData.capex_budgetvalue == undefined)
 {
  swal("Enter CAPEX Budget Value!");
 }
else if(UserData.opex_budgetvalue == null || UserData.opex_budgetvalue  == '' || UserData.opex_budgetvalue == undefined)
 {
  swal("Enter OPEX Budget Value!");
 }
else if(UserData.from_date == null || UserData.from_date == '' || UserData.from_date == undefined)
 {
  swal("Select From Date!");
 }
else if(UserData.to_date == null || UserData.to_date  == '' || UserData.to_date  == undefined)
 {
  swal("Select To Date!");
 }
else if(UserData.headcount == null || UserData.headcount == '' || UserData.headcount == undefined)
 {
  swal("Enter Head Count!");
 }
else if(UserData.description == null || UserData.description == '' || UserData.description == undefined)
 {
  swal("Enter Description!");
 }
else if(UserData.physical_outcome == null || UserData.physical_outcome == '' || UserData.physical_outcome == undefined)
 {
  swal("Enter Physical Outcome!");
 }
/*else if(UserData.paymentgroup_id == null || UserData.paymentgroup_id== '' || UserData.paymentgroup_id== undefined)
 {
  swal("Select PaymentGroup!");
 }
else if(UserData.secondary_responsibility== null || UserData.secondary_responsibility== '' || UserData.secondary_responsibility== undefined)
 {
  swal("Select Secondary Responsibility!");
 }*/
else{

$http.post('/erp/program/add', UserData).then(
function(response) {    
$scope.data = response.data;      
if ($scope.data.successful) {
alert("User Data Inserted Successfully");
} else {
alert("Data not inserted");
}
}, function(errResponse) {
console.error('Error while fetching notes');
});

};}


$http.get('/erp/program/getAll').then(function(response) {
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


$scope.getById = function(Data){

$http.post('/erp/program/getById',program_name).then(function (response) {
   $scope.data = response.data;
   if ($scope.data.successful) {
       $scope.data = {object:$scope.data.responseObject};
   } else {
    //alert("Error while getting data");
    console.log("error")
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});  
};  

$http.get('/erp/program/getGroups').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.groups = $scope.data.responseObject;
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



$scope.updateData = function(Data){
$http.post('/erp/program/updateData', Data).then(function (response) {

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
