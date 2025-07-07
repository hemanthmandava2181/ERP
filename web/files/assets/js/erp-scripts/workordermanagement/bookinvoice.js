var employee = angular.module('bookinvoice', []);
employee.controller('bookinvoicecontroller',['$scope','$http',function($scope,$http)
{

/* getting cost centers drop down */
	$http.get('/erp/employee/getCost_center').then(function(response)
	{
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.cost_centers = $scope.data.responseObject;
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

/* getting programs drop down */
	$http.get('/erp/procurement/getPrograms').then(function(response) 
	{
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.programs = $scope.data.responseObject;
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

/* getting Services drop down */
	$http.get('/erp/procurement/getServices').then(function(response) 
	{
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.services = $scope.data.responseObject;
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

/* getting vendor names drop down */
	$http.get('/erp/procurement/getvendors').then(function(response) 
	{
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.vendors = $scope.data.responseObject;
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

/* getting work order names to drop down */
	$http.get('/erp/procurement/getworkorders').then(function(response) 
	{
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.orders = $scope.data.responseObject;
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

	
	
	
/* getting details related to work order id */
			

	$scope.getDetailsofWO= function(data) 
	{
		console.log(data);
		$http.post('/erp/procurement/getDetailsofWO',data).then(function(response)
		{       
			$scope.data= response.data;     
			console.log($scope.data);    
			if ($scope.data.successful)   
			{
				$scope.data = $scope.data.responseObject; 
				console.log($scope.data);
				data.from_date = $scope.data[0].from_date,
				
		$scope.data = {    
		object : data
		};    
		          
		} else {
		console
		.log("Client error while getting data");   
		}
		},
		function(response) {
		console
		.log("Server error while getting data");
		});
		 
		}
	
	

/* Getting Locations */
	$http.get('/erp/employee/getLocations').then(function(response) 
	{
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.locations = $scope.data.responseObject;
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

/* getting dropdown for tax account */
	$http.get('/erp/procurement/getTaxaccountnames').then(function(response) 	
	{
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.accounts = $scope.data.responseObject;
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

/* book invoice for others type */
	var documentsArr = [];
	$scope.bookothersinvoice = function(OthersivoiceData) 
	{
		var documents = {};
		OthersivoiceData.base64String = documentsArr[0].base64String;
		OthersivoiceData.fileName = documentsArr[0].fileName;
		OthersivoiceData.name = documentsArr[0].name;
		console.log(OthersivoiceData);
		$http.post('/erp/procurement/bookothersinvoice',OthersivoiceData).then(  function(response) 
		{    
			$scope.data = response.data;          
			if ($scope.data.successful) 
			{
				alert("Invoice Created Successfully");
				Andromeda.showbookinvoicepage();
			}
			else
			{
				alert("Data not inserted");    
			}  
		},
		function(errResponse) 
		{
			console.error('Error while fetching notes');
		});
	};

/* script form uploading documents */
$scope.uploadFiles = function(e)
   {
       var k= 0;
       for(var i = 0; i < e.files.length; i++)
       {
           var singleFileInfo = e.files[i];
           (function(singleFileInfo)
           {
               var fileReader;
               fileReader = new FileReader();
               fileReader.onload = function(e)
               {
                   var fileName1 = singleFileInfo.name;
                   filesize =  singleFileInfo.size;
                   var fileDetails=fileName1.split(".");
                   var fileName = "workOrderData_" + (k+1)+"."+fileDetails[1];
                   var binaryString =  e.target.result;
                   var base64 = btoa(binaryString);
                   var fileModel =  
                       {
                           fileName : fileName,
                           base64String : base64.toString(),                
                           name : fileName
                       };
                    documentsArr[k] = fileModel;
                   k++;    
               };  
               fileReader.readAsBinaryString(e.files[i]);
           })(singleFileInfo);
       }
       //console.log(documentsArr);
   }

$scope.uploadFiles1 = function(e)
   {
       var k= 0;
       for(var i = 0; i < e.files.length; i++)
       {
           var singleFileInfo = e.files[i];
           (function(singleFileInfo)
           {
               var fileReader;
               fileReader = new FileReader();
               fileReader.onload = function(e)
               {  
                   var fileName1 = singleFileInfo.name;
                   filesize =  singleFileInfo.size;
                   var fileDetails=fileName1.split(".");
                   var fileName = "workOrderData_" + (k+1)+"."+fileDetails[1];
                   var binaryString =  e.target.result;
                   var base64 = btoa(binaryString);
                   var fileModel =  
                       {
                           fileName : fileName,
                           base64String : base64.toString(),                
                           name : fileName
                       };
                    documentsArr[k] = fileModel;
                   k++;    
               };  
               fileReader.readAsBinaryString(e.files[i]);
           })(singleFileInfo);
       }
       //console.log(documentsArr);
   }
}]);

