var data123 = angular.module('ceolist', []);
data123.controller('ceoController', ['$http','$scope', function($http, $scope) {
// for checkboxes

$scope.projectEmpArr1 = [];
$scope.regdetails1 = [];
$scope.filteredResult = [];

$scope.setAllIds1 = function(allprojec)  
{
console.log(allprojec);
console.log($scope.regdetails1);
if(allprojec == true)
{  
for(var i = 0; i < $scope.filteredResult.length; i++)
{
var project2 = $scope.filteredResult[i]['empid'];
$scope.projectEmpArr1[project2] = true;
}
}
else if(allprojec == false)
{
	console.log("test"+$scope.projectEmpArr1)
	console.log("filteredlength"+$scope.filteredResult.length)
$scope.projectEmpArr1 = [];
}
};


$http.post('/erp/Employee/gethr').then(function(response) {
$scope.data = response.data;
if ($scope.data.successful) {
$scope.regdetails1 = $scope.data.responseObject;
console.log($scope.regdetails1);
} else {
alert("Can't view the Data");
}
}, function(errResponse) {  
console.error('Error while viewing notes');
});








$scope.Approveall = function(projectEmpArr1,data)
{


console.log(data);
delete  data.responseObject[0].$$hashKey;
delete data.responseObject[0].__proto__;

var empdata=data.responseObject[0].empid+","+data.responseObject[0].Month;
var reqbody=data.responseObject.length;
console.log(reqbody);

for (var i=0; i<reqbody; i++) 
{   
	console.log(data.responseObject[i].empid);
	
	data.responseObject[i]["employee_type"]=0;
	

};
console.log(data.object);
console.log("hiresponseObject"+data.responseObject);
console.log("empdata111111"+empdata);

console.log(projectEmpArr1);
if(projectEmpArr1!= null)
{
	var Obj = [];
	var count = 0;
	for(var i in projectEmpArr1){
		
		if(projectEmpArr1[i] == true)
			{
			Obj[count]=i
			
			}
		count++;
		} 
	var duplicate =false;
	var index=[];
	for(var k=0,j=0; k<Obj.length;k++){
		  
	
	for (var i=0; i<reqbody ; i++) 
	{  
		console.log(Obj[k]+"  "+data.responseObject[i].empid)
		
		for(var b=0;b<index.length;b++)
			{
			if(index[b]==i){
				duplicate=true;
			}
			}
		if (Obj[k] != data.responseObject[i].empid && !duplicate ){
			
			index[j]=i;
			j++;
			
		}
		
		};
	};
	console.log("index"+index)
	for (var i=0; i<index.length; i++) 
	{  
		var id = data.responseObject[index[i]].empid;
		console.log("id"+id)
		var isdelete =true;
	for(var j=0;j<Obj.length;j++)
	{
		if(Obj[j]==id){
			isdelete =false;
		}
		
	};   
	if (isdelete==true){
		delete  data.responseObject[index[i]];
	}
		
		};
		console.log("Finalbefore"+index)
		console.log(Obj)
		console.log("FinalObject"+data.responseObject)
}
	
$http.post('/erp/Employee/Approveall',data.responseObject).then(function(response)
{  
     
$scope.data = response.data;

if($scope.data.successful)
         {  

     swal({  
            title: "Success!",  
            text: "Approved successfully!",
            type: "success"
        }, function() {
         
         ERP.showContractRenewalList();
        });  
   
         }
});  
   
    
   
}

















}]);