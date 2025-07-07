var createmou = angular.module('createmou', []);
createmou.controller('createmouController',['$scope','$http',function($scope,$http)
	{
	
	
	/*getting mou details*/
	
	$scope.getMoUIds = function(data)
	{
		$http.post('/erp/purchase/getMoUIds',data).then(function(response)
		{       
			$scope.data= response.data;     
			console.log($scope.data);     
			if ($scope.data.successful) 
			{
				$scope.data = $scope.data.responseObject;
				console.log($scope.data);   
				data.from_date = $scope.data[0].from_date,
				data.to_date = $scope.data[0].to_date,   
				data.program_id = $scope.data[0].program_id,
				data.project_id = $scope.data[0].project_id,
				console.log(data.project_id);   
				data.scheme_id = $scope.data[0].scheme_id,
				console.log(data.scheme_id);
				data.description = $scope.data[0].description,
				console.log(data.description);
		/*data.from_date = $scope.data[0].from_date,  
		console.log(from_date);
		data.to_date = $scope.data[0].to_date
		console.log(to_date);    */
				$scope.data = {    
						object : data
				};    
		 }
		else
		{
			console.log("Client error while getting data");
		}
	},
	function(response) 
	{
		console	.log("Server error while getting data");
	});
		 
		}
	
	
	/* getting programs drop down */
	$http.get('/erp/purchase/getPrograms').then(function(response) {
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
	
	/* getting financial year drop down */
	$http.get('/erp/purchase/getYears').then(function(response) {
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
	
	/* getting Services drop down */
	$http.get('/erp/purchase/getServices').then(function(response) {
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
	$http.get('/erp/procurement/getVendors').then(function(response) {
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
	
	/* getting drop down for sectors */
	$http.get('/erp/procurement/getSectors').then(function(response) {
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
	
	/* getting districts drop down */
	$http.get('/erp/employee/getDistricts').then(function(response) {
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
	
	/* creating work order */
	var documentsArr = [];
	$scope.createmou = function(mouData) {
		var documents = {}; 
		mouData.base64String = documentsArr[0].base64String;
		mouData.fileName = documentsArr[0].fileName;
		mouData.name = documentsArr[0].name;
		console.log(mouData);
		$http.post('/erp/procurement/createmou',mouData).then(  
				function(response) {    
					$scope.data = response.data;
					console.log($scope.data);      
					if ($scope.data.successful) {
						swal("Mou Created Successfully");
						Andromeda.showcreatemouPage();
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
		                    var fileName = "mouData_" + (k+1)+"."+fileDetails[1];
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
		 $http.get('/erp/purchase/getLocations').then(function(response) {
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
			
		 
		 
		 
		 
		 
		 
		 var documentsArr = [];
			$scope.createMoU = function(data) 
			{
				/*console.log(data);    
				var documents = {};
				data.base64String = documentsArr[0].base64String;
				data.fileName = documentsArr[0].fileName;
				data.name = documentsArr[0].name;      
				console.log(data);*/  
				
				var totalrate = document.getElementById("TOTAL VALUE").value;
				
				var Subperioddetails = {
						from_date : document.getElementById('wo_date').value,
						to_date : document.getElementById('wo_date1').value,
						entry_type : data.entry_type
						}
				
				$http.post('/erp/procurement/createMoU',Subperioddetails).then(function(response) 
				{
					$scope.data = response.data;   
					console.log($scope.data);					
					if ($scope.data.successful) 
					{
						swal("Work Order Created Successfully");   
						Andromeda.showcreateworkorderPage();
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
	
	
}]);