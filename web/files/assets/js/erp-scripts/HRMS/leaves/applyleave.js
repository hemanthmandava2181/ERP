var leave = angular.module('applyleave', []);
var documentsArr = [];
leave.controller("applyController", ['$scope','$http',function($scope, $http)

{      
$scope.flexidateArr = [];
$scope.insertion = function(EmpData) {
if(EmpData == undefined)
{
swal("OOPS!","Fill all details","info");
}
else if(EmpData.leave_type== null || EmpData.leave_type == undefined || EmpData.leave_type == "")
{
swal("Oops...","select Leave Type","info");
}
else if(EmpData.emergency_number == null || EmpData.emergency_number == undefined || EmpData.emergency_number == "")
{
swal("Oops...","Enter Mobile number","info");
}
else if(EmpData.from_date == null || EmpData.from_date == undefined || EmpData.from_date == "")

{
swal("Oops...","select from Date","info");
}
else if(EmpData.to_date == null || EmpData.to_date == undefined || EmpData.to_date == "")
{
swal("Oops...","select to date","info");
}


else if(EmpData.reason == null || EmpData.reason == undefined || EmpData.reason == "")
{
swal("Oops...","select reason","info");
}

else
{


EmpData.empid = Andromeda.getSessionValue("employeeid");

console.log(EmpData);
$http.post('/erp/Employee/add', EmpData).then(function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
location.reload();
swal("Leave applied Successfully");
} else {
alert("Data not inserted");
}
}, function(errResponse) {
console.error('Error while fetching notes');
});
};
}

$http.get('/erp/Employee/getLeavetype').then(function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
$scope.leavetypes = $scope.data.responseObject;
} else {
console.log("Client error while getting data");
}
}, function(response) {
console.log("Server error while getting data");
});

var empid = Andromeda.getSessionValue("employeeid");
console.log("empid " + empid);
$http.post('/erp/Employee/getReporting', empid).then(
function(response) {
$scope.data13 = response.data;
if ($scope.data13.successful) {
$scope.data = {
object : $scope.data13.responseObject
};
console.log("Successful");
} else {
// alert("Error while getting data");
console.log("error")

}
}, function(errResponse) {
console.error('Error while fetching notes');
});




/* getting calendar details based on from date,to date*/
$scope.getCalendarDetails=function(data){
var details = {

from_date: document.getElementById('from').value,
to_date: document.getElementById('to').value

};
console.log(details);
   $http.post('/erp/attendance/getCalendarDetails',details).then(function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
$scope.calendarDetails = $scope.data.responseObject.dates;

$scope.data = {
object : data
};

} else {
console.log("Client error while getting data");
}
});  
}





$scope.insertionFlexi = function(EmpData,flexidateArr,FlexiHolidays) {

console.log(EmpData);
console.log(flexidateArr);
console.log(FlexiHolidays);

if(flexidateArr != null)
{
var Obj= [];
for(var i in flexidateArr)
{  
if(flexidateArr[i] == true)
{
for(var k=0;k<$scope.FlexiHolidays.length;k++)
{
if($scope.FlexiHolidays[k]['date'] == i)
{
var d1=$scope.FlexiHolidays[k]['date'];  
                                    console.log(d1);      
console.log(EmpData);
var obj={
"empid" : Andromeda.getSessionValue("employeeid"),
"date"    : d1,
"leave_type" : EmpData.leave_type,
"emergency_number" : EmpData.emergency_number,
"reason" : EmpData.reason,
"reporting_to" : EmpData.reporting_to


}
if(EmpData == undefined)
{
swal("OOPS!","Fill all details","info");
}
else if(EmpData.leave_type== null || EmpData.leave_type == undefined || EmpData.leave_type == "")
{
swal("Oops...","select Leave Type","info");
}
else if(EmpData.emergency_number == null || EmpData.emergency_number == undefined || EmpData.emergency_number == "")
{
swal("Oops...","Enter Mobile number","info");
}

else if(EmpData.reason == null || EmpData.reason == undefined || EmpData.reason == "")
{
swal("Oops...","select reason","info");
}

else
{




console.log(obj);
$http.post('/erp/Employee/addFlexi',obj).then(function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
location.reload();
alert("Leave applied Successfully");
} else {
alert("Data not inserted");
}
}, function(errResponse) {
console.error('Error while fetching notes');
});

}
}
}
}

}
}
}


$http.get('/erp/Employee/getFlexiHolidays').then(function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
$scope.FlexiHolidays = $scope.data.responseObject;
} else {
console.log("Client error while getting data");
}
}, function(response) {
console.log("Server error while getting data");
});

} ]);
