var project = angular.module('projectModule', []);
project.controller('projectController',['$scope','$http',function($scope,$http)
{

$http.get('/erp/project/getYears').then(function(response) {
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


$http.get('/erp/project/getSdeis').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)  
{
$scope.sdeis= $scope.data.responseObject;

console.log($scope.sdeis);
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


$http.get('/erp/project/getSchemes').then(function(response) {
$scope.data = response.data;
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


$scope.registration = function(UserData)
{
console.log(UserData);
if(UserData==null || UserData=='' || UserData==undefined)
 {
  swal("Enter all details!");
 }
else if(UserData.project_id == null || UserData.project_id== '' || UserData.project_id== undefined)
 {
  swal("Enter Project Id!");
 }
else if(UserData.project_name == null || UserData.project_name== '' || UserData.project_name== undefined)
 {
  swal("Enter Project Name!");
 }
else if(UserData.budget_type == null || UserData.budget_type== '' || UserData.budget_type== undefined)
 {
  swal("Select BudgetType!");
 }
else if(UserData.scheme_id== null || UserData.scheme_id == '' || UserData.scheme_id == undefined)
 {
  swal("Select Scheme!");
 }
else if(UserData.financial_year == null || UserData.financial_year== '' || UserData.financial_year == undefined)
 {
  swal("Select Financial Year!");
 }
else if(UserData.sdei_groupnumber == null || UserData.sdei_groupnumber== '' || UserData.sdei_groupnumber == undefined)
 {
  swal("Select SDEI GROUP Type!");
 }
else if(UserData.headcount == null || UserData.headcount == '' || UserData.headcount == undefined)
 {
  swal("Enter Head Count!");
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

else if(UserData.description == null || UserData.description == '' || UserData.description == undefined)
 {
  swal("Enter Description!");
 }

else if(UserData.physical_outcome == null || UserData.physical_outcome == '' || UserData.physical_outcome == undefined)
 {
  swal("Enter Physical Outcome!");
 }

else{


$http.post('/erp/project/add', UserData).then(
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

};
}

$http.get('/erp/project/getAll').then(function(response) {
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

$http.post('/erp/project/getById',project_name).then(function (response) {
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

$scope.removeData = function(project_name) {
$http.post('/erp/project/removeData',project_name).then(
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

$scope.updateData = function(Data){
$http.post('/erp/project/updateData', Data).then(function (response) {

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