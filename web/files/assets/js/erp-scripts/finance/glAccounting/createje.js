var employee = angular.module('createje', []);
employee.controller('createjeController',['$scope','$http',function($scope,$http)
	{
	
	/* getting project drop down */
	$http.get('/erp/finance/getprojects').then(function(response) {
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
	
	/* getting programs drop down */
	$http.get('/erp/finance/getPrograms').then(function(response) {
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
	
	/* getting gl account drop down */
	$http.get('/erp/finance/getTaxaccountnames').then(function(response) {
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
	
	/* getting cost centers drop down */
	$http.get('/erp/employee/getCost_center').then(function(response) {
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
	
	/* getting work order names to drop down */
	$http.get('/erp/finance/getworkorders').then(function(response) {
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
	
	/* getting vendor names drop down */
	$http.get('/erp/finance/getvendors').then(function(response) {
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
	
	/* getting customer names drop down */
	$http.get('/erp/finance/getCustomers').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.customers = $scope.data.responseObject;
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
	
	/* creating JE account */
	var documentsArr = [];
	$scope.CreateJE = function(createJEData) {
		var documents = {}; 
		createJEData.base64String = documentsArr[0].base64String;
		createJEData.fileName = documentsArr[0].fileName;
		createJEData.name = documentsArr[0].name;
		console.log(createJEData);
		$http.post('/erp/finance/CreateJE',createJEData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Journal Voucher Crearted Successfully");
						ERP.showCreateJE();
					} else {
						alert("Data not inserted");    
					}      
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
	/* for document upload */
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
	                    var fileName = "createJEData_" + (k+1)+"."+fileDetails[1];
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
	        	//	 console.log(documentsArr);
	    }
	
	 /* getting all journal vouchers to table */
		$http.get('/erp/finance/getalljournalaccounts').then(function(response) {
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
	
	/* deleting voucher data from header table */	
		$scope.deleteJEheaderdata = function(je) {   
			console.log(je.voucher_number);
			$http.post('/erp/finance/deleteJEheaderdata', je.voucher_number).then(
					function(response) {
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) {  
							swal("Journal Voucher Details removed Successfully");
							ERP.showCreateJE();
						} else {
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
		/* deleting journal voucher data from details table */
		$scope.deleteJEdetailsdata = function(je) {   
			console.log(je.voucher_number);
			$http.post('/erp/finance/deleteJEdetailsdata', je.voucher_number).then(
					function(response) {
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) { 
						} else {
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		    
	
		
	/* adding document rows */
		$scope.getData=function(){
		  var table = document.getElementById("dataTable");
		  var rcount = document.getElementById("dataTable").rows.length;
		    for (var i = 1, row; i<rcount; i++) {
		        var x = row.cells[0].childNodes[0].value;
		        
		        var y = row.cells[1].childNodes[0].value;
		        console.log(y);
		        var z = row.cells[2].childNodes[0].value; // select option field
		           
		    }
		}
		
	/* getting financial year drop down */
	$http.get('/erp/finance/getfinancialyears').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.years = $scope.data.responseObject;
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
	
	
	
	
	
}]);