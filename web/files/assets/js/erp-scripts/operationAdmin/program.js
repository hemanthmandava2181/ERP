var program = angular.module('programModule', []);
program.controller('programController',['$scope','$http',function($scope,$http)
{
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
$scope.segements = $scope.data.responseObject;
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
$http.get('/erp/program/getProjects').then(function(response) {
$scope.data = response.data;
if($scope.data.successful)
{
$scope.projects = $scope.data.responseObject;
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

};


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
