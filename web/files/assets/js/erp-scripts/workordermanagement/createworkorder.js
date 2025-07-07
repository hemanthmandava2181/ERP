var createworkorder = angular.module('createworkorder', []);
createworkorder.controller('createworkorderController',['$scope','$http',function($scope, $http) 
{
							/* getting programs drop down */
	$http.get('/erp/purchase/getPrograms').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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
	$http.get('/erp/purchase/getYears').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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
	$http.get('/erp/purchase/getServices').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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
	/*$http.get('/erp/procurement/getVendors').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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
*/
							/* getting drop down for sectors */
	/*$http.get('/erp/procurement/getSectors').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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
*/
							/* getting districts drop down */
	$http.get('/erp/employee/getDistricts').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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
						
	
	$http.get('/erp/purchase/getLocations').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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

							/* creating work order */
	var documentsArr = [];
	$scope.createworkorder = function(data) 
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
		
		$http.post('/erp/procurement/createworkorder',Subperioddetails).then(function(response) 
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

							/* script form uploading documents */
	$scope.uploadFiles = function(e) 
	{
		var k = 0;
		for (var i = 0; i < e.files.length; i++) 
		{
			var singleFileInfo = e.files[i];
			(function(singleFileInfo) 
			{
				var fileReader;
				fileReader = new FileReader();
				fileReader.onload = function(e) 
				{
					var fileName1 = singleFileInfo.name;
					filesize = singleFileInfo.size;
					var fileDetails = fileName1.split(".");
					var fileName = "workOrderData_"+ (k + 1) + "."+ fileDetails[1];
					var binaryString = e.target.result;
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
			})
			(singleFileInfo);
		}
								// console.log(documentsArr);
	}
	$scope.addwoitems = function(UserData)
	{
		$http.post('/erp/procurement/addwoitems',UserData).then(function(response) 
		{
			$scope.data = response.data;
			if ($scope.data.successful)
			{
				swal("Inserted Successfully");
			}
			else
			{
				swal("Data not inserted");
			}
		},
		function(errResponse) 
		{
			console.error('Error while fetching notes');
		});
	}
	
	
	
	   
	
	$scope.getProgramDet= function(data) {
		
		console.log(data);
				$http.post('/erp/purchase/getProgramDet',data).then(function(response) 
		{   
					  
			console.log(data);  
			$scope.data = response.data;
			console.log($scope.data);
			if ($scope.data.successful) 
			{  
				$scope.data = $scope.data.responseObject;    
				console.log($scope.program_id);      
				data.program_name = $scope.data[0].program_name;
				console.log(data.program_name);
				data.scheme_id = $scope.data[0].scheme_id;
				console.log(data.scheme_id);      
				data.from_date = $scope.data[0].from_date;
				console.log(data.from_date);
				data.description = $scope.data[0].description;
				console.log(data.description);
				data.project_id = $scope.data[0].project_id;
				console.log(data.project_id);
				data.to_date = $scope.data[0].to_date;
				console.log(data.to_date);  
				
				$scope.data = {
								object : data    
								};          
					}
					else      
					{
						console.log("Client error while getting data");
					}
				},
				function(response) {
						console.log("Server error while getting data");
					});
		}
	
	
	/*######################WORK ORDER MULTIPLICATION####################*/
	
	

				
		
		
	
	
	
	
	
	
	
	
	$scope.getPayBaseMulti = function(data)
	{
		
		
		if(document.getElementById("Days").checked == true)
		{
			var days = document.getElementById("DAYS").value;
			console.log(days);
		}
		else
		{
			var days=1;
		}
		if(document.getElementById("Hours").checked == true)
		{
			var hours = document.getElementById("HOURS").value;
			console.log(hours);
		}
		else
		{
			var hours = 1;
		}
		if(document.getElementById("Trainers").checked == true)
		{
			var trainers = document.getElementById("TRAINERS").value;
			console.log(trainers);
		}
		else
		{
			var trainers = 1;
		}
		if( document.getElementById("Rate").checked == true)
		{
			var rate = document.getElementById("RATE").value;
			console.log(rate);
		}
		else
		{
			var rate = 1;
		}
		
		document.getElementById("VALUE").value = days*trainers*rate;
		 
	};    
	      
	   
	
	
	

	
	$scope.getTraineeMulti = function(data)
	{
		
		
		if(document.getElementById("Days1").checked == true)
		{
			var days = document.getElementById("DAYS").value;
			console.log(days);
		}
		else
		{
			var days=1;
		}
		if(document.getElementById("Hours1").checked == true)
		{
			var hours = document.getElementById("HOURS").value;
			console.log(hours);
		}
		else
		{
			var hours = 1;
		}
		if(document.getElementById("Trainers1").checked == true)
		{
			var trainers = document.getElementById("TRAINERS").value;
			console.log(trainers);
		}
		else
		{
			var trainers = 1;
		}
		
		if( document.getElementById("Batches1").checked == true)
		{
			var batches = document.getElementById("BATCHES").value;
			console.log(batches);
		}
		else
		{
			var batches = 1;
		}
		
		
		if( document.getElementById("Rate1").checked == true)
		{
			var rate = document.getElementById("RATE").value;
			console.log(rate);
		}   
		else   
		{
			var rate = 1;
		}
		
		document.getElementById("VALUE2").value = days*trainers*rate*batches;
			
	};
	    
	
	
	
	
	
	
	
	
	$scope.TravelDaysMutli = function(data)
	{
		
		if(document.getElementById("TravelDays").checked == true)
		{
			var days = document.getElementById("TRAVELDAYS").value;
			console.log(days);
		}
		else
		{
			var days=1;
		}
		if(document.getElementById("TravelTrainers").checked == true)
		{
			var trainers = document.getElementById("TRAVELTRAINERS").value;
			console.log(trainers);
		}
		else
		{
			var trainers = 1;
		}
		
		var rate = document.getElementById("TRAVELRATE").value;
		console.log(rate);
		
		document.getElementById("TRAVELVALUE").value = days*trainers*rate;
			
	};
	
	
	

	$scope.addwoadditions = function(data)
	{
		var traveldays = document.getElementById("TRAVELDAYS").value;
		var traveltrainers = document.getElementById("TRAVELTRAINERS").value;
		var rate = document.getElementById("RATE").value;
		var val = document.getElementById("VALUE").value;
		
		
		var details={
				rate11		:rate,
				duration_days11: traveldays,
				no_of_trainers11 : traveltrainers,
				value : val
				
				
				}   
		console.log(details);   
	$http.post('/erp/purchase/addwoadditions',details).then(function(response) 
	{
		
		
		
		$scope.data = response.data;         
		if ($scope.data.successful) 
		{
			alert("User Data Inserted Successfully");
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
		
	}

	
	
	
	
	
	
	
	

	$scope.addWOItems = function(data)
	{
		var days = document.getElementById("DAYS").value;
		var hours = document.getElementById("HOURS").value;
		var trainers = document.getElementById("TRAINERS").value;
		var val = document.getElementById("VALUE").value;
		
		
		var details={
				
				duration_hours : hours,
				duration_days: days,
				no_of_trainers : trainers,
				value : val
				
				
				}   
		console.log(details);   
	$http.post('/erp/purchase/addWOItems',details).then(function(response) 
	{
		
		
		
		$scope.data = response.data;         
		if ($scope.data.successful) 
		{
			alert("User Data Inserted Successfully");
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
		
	}




	
	
	
	
	} ]);