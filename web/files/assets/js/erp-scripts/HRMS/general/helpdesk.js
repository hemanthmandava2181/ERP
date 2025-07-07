var helpdesk= angular.module('helpdesk', [])
helpdesk.controller('HelpdeskController',['$scope','$http',function($scope,$http)
{


$scope.registration = function(UserData) {
console.log(UserData);
if(UserData==null || UserData=='' || UserData==undefined)
 {
  swal("Enter all details!");
 }
else if(UserData.request_categoryid == null || UserData.request_categoryid == '' || UserData.request_categoryid== undefined)
 {
  swal("Select Request Category!");
 }
else if(UserData.description == null || UserData.description == '' || UserData.description == undefined)
 {
  swal("Enter Description!");
 }  

else{  

alert(UserData.request_categoryid + '  Successful');
$http.post('/erp/selfservice/addhelpdesk', UserData).then(
function(response) {
$scope.data = response.data;  
if ($scope.data.successful) {

swal("User Data Inserted Successfully");
} else {
swal("Data not inserted");
}
}, function(errResponse) {
console.error('Error while fetching notes');
});
}

};
$http.get('/erp/selfservice/getStatuss').then(
function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
$scope.statuss = $scope.data.responseObject;
console.log($scope.statuss);
} else {
console.log("Client error while getting data");
}
}, function(response) {
console.log("Server error while getting data");
});


$http.get('/erp/selfservice/getCategories').then(
function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
$scope.categories = $scope.data.responseObject;
console.log($scope.categories);
} else {
console.log("Client error while getting data");
}
}, function(response) {
console.log("Server error while getting data");
});


$scope.getReqtypes = function(totalObj)
{
console.log(totalObj);
$http.post('/erp/selfservice/getReqtypes', totalObj.request_categoryid).then(function(response)
{
$scope.data = response.data;
if($scope.data.successful)
{
$scope.reqtypes = $scope.data.responseObject;
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



$http.get('/erp/selfservice/getAllhelpdesk').then(function(response) {
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

$scope.getById3 = function(request_id){
alert(request_id);
$http.post('/erp/selfservice/getById3', request_id).then(
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



//Get Data from Database based on request_id

$scope.getByIdview = function(request_id){
alert(request_id);
$http.post('/erp/selfservice/getByIdview', request_id).then(
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


$http.get('/erp/selfservice/getAssigns').then(
function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
$scope.assigns = $scope.data.responseObject;
console.log($scope.categories);
} else {
console.log("Client error while getting data");
}
}, function(response) {
console.log("Server error while getting data");
});


$scope.removeData3 = function(request_id) {
$http.post('/erp/selfservice/removeData2',request_id).then(
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
$scope.updateData3 = function(UserData){
$http.post('/erp/selfservice/updateData3', UserData).then(function (response) {

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
$scope.updateDataAssign = function(UserData){
$http.post('/erp/selfservice/updateDataAssign', UserData).then(function (response) {

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
$scope.updateDataEmpcomm = function(UserData){
$http.post('/erp/selfservice/updateDataEmpcomm', UserData).then(function (response) {

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

/* Getting Employee Name */

var empid = Andromeda.getSessionValue("employeeid");
    console.log("empid " +empid);  
    $http.post('/erp/selfservice/getname',empid).then(function (response) {
   $scope.data = response.data;
   if ($scope.data.successful) {
       $scope.data = {object:$scope.data.responseObject};
       console.log($scope.data);
   } else {  
    //alert("Error while getting data");
    console.log("error")  ;                          
     
   }
}, function (errResponse) {
  console.error('Error while fetching notes');    
});
   

}]);