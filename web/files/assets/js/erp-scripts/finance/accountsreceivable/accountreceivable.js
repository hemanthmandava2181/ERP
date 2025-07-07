var employee = angular.module('accountreceivable', []);
employee.controller('accountreceivableController',['$scope','$http',function($scope,$http)
	{
	
	
	
	/* getting Customer drop down */
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
	
	/* getting scheme drop down */
	$http.get('/erp/finance/getSchemes').then(function(response) {
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
	
	/* getting Services drop down */
	$http.get('/erp/finance/getServices').then(function(response) {
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
	
	/* getting drop down in projects */
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
	
	/* getting drop down for sectors */
	$http.get('/erp/finance/getsectors').then(function(response) {
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
	
	/* getting dropdown for tax account */
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
	
	/* getting locations drop down */
	$http.get('/erp/employee/getLocations').then(function(response) {
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
	
	/* creating account receivable */
	var documentsArr = [];
	$scope.createaccountreceivable = function(accountsreceivableData) {	
		var documents = {}; 
		accountsreceivableData.base64String = documentsArr[0].base64String;
		accountsreceivableData.fileName = documentsArr[0].fileName;
		accountsreceivableData.name = documentsArr[0].name;
		console.log(accountsreceivableData);
		$http.post('/erp/finance/createaccountreceivable',accountsreceivableData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						swal("Account Receivable Data Added Successfully");
						ERP.showAccountReceivables();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		/* uploading documents */
		/*var documentsArr = [];
		$scope.uploaddocuments = function(UserData){
			var documents = {}; 
			UserData.base64String = documentsArr[0].base64String;
			UserData.fileName = documentsArr[0].fileName;
			UserData.name = documentsArr[0].name;
			console.log(UserData);
			$http.post('/erp/finance/uploaddocuments', UserData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							swal("Documents Uploaded Successfully");
							Andromeda.showaccountReceivablesPage();
							
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};*/
		
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
		                    var fileName = "accountsreceivableData_" + (k+1)+"."+fileDetails[1];
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
//		         console.log(documentsArr);
		    }
		
	/* getting all accounts to table */
		$http.get('/erp/finance/getalllaccountsreceivables').then(function(response) {
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
		
	/* deleting accounts receivable data from header table based on voucher id */
	$scope.deleteaccountsreceivabledata = function(accounts) {   
		console.log(accounts.voucher_id);
		$http.post('/erp/finance/deleteaccountsreceivabledata', accounts.voucher_id).then(
				function(response) {
					$scope.data = response.data;
					console.log($scope.data);
					if ($scope.data.successful) {  
						/*location.reload();*/
						swal("Accounts Receivable data removed Successfully");
						ERP.showAccountReceivables();
					} else {
						alert("Data not Deleted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	/* deleting accounts receivable data from details table based on voucher id */
	$scope.deleteAccountsreceivabledetails = function(accounts) {   
		console.log(accounts.voucher_id);
		$http.post('/erp/finance/deleteAccountsreceivabledetails', accounts.voucher_id).then(
				function(response) {
					$scope.data = response.data;
					console.log($scope.data);
					if ($scope.data.successful) {  
						
						ERP.showAccountReceivables();
					} else {
						alert("Data not Deleted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
		
	
	/* getting voucher id */
	$scope.getvoucherIDdata = function(voucher_id){
		console.log(voucher_id);   
		/*alert(empid);*/
		$http.post('/erp/finance/getvoucherIDdata', voucher_id).then(
		function(response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
				$scope.data={object:$scope.data.responseObject};
				console.log($scope.data);
			} else {  
				alert("Error while getting data");
			}
		}, function(errResponse) {
			console.error('Error while fetching notes');
		});
	};
		
	
		
}]);