var employee = angular.module('advanceorimprestform', []);
employee.controller('advanceorimprestformController',['$scope','$http',function($scope,$http)
	{
	
	/* creating claim advance new */
	var documentsArr = [];
	$scope.submitclaimadvance = function(advanceData) {	
		var documents = {}; 
		advanceData.base64String = documentsArr[0].base64String;
		advanceData.fileName = documentsArr[0].fileName;
		advanceData.name = documentsArr[0].name;
		console.log(advanceData);
		$http.post('/erp/finance/submitclaimadvance',advanceData).then(  
				function(response) {    
					$scope.data = response.data;
					console.log($scope.data);
					if ($scope.data.successful) {
						swal("Claim Advance Created Successfully");
						ERP.showAdvanceImprest();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
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
		                    var fileName = "advanceData_" + (k+1)+"."+fileDetails[1];
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
		
		
		/* creating claim advance existing */
		$scope.submitexistingclaimadvance = function(advanceeData) {	
			console.log(advanceeData);
			$http.post('/erp/finance/submitexistingclaimadvance',advanceeData).then(  
					function(response) {    
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) {
							swal("Claim Advance Created Successfully");
							ERP.showAdvanceImprest();
						} else {
							alert("Data not inserted");    
						}   
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
			};
		
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
		
		/* getting cost centers */
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
		
		
}]);