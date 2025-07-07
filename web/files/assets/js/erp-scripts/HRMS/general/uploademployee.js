var employee = angular.module('uploademployee',[ 'xlsx-model']);
employee.controller('UploadController', ['$http','$scope', function($http, $scope) {
	
	
	
	$http.post('/erp/Upload/getYear').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful) {
			/*$scope.aicterequiredone=$scope.data.responseObject;*/
			$scope.data=$scope.data.responseObject;
		};   
		 
	});
	
	   
		 var circularsArr = [];
			$scope.filePathsArr = [];          
			
			
		    $scope.uploadFile = function(el1,param) 
			 {
				console.log(el1);
				console.log(param);
				var employeeId="employee";
				console.log(employeeId);
			   var fileName = el1.files[0].name;
			   var fileDetails=fileName.split(".");
			   fileName=employeeId+"_"+param+"."+fileDetails[1];
			   console.log(fileName);
					
			   //  fileName=param+"_"+employeeId+"."+fileDetails[1];
					  
			   // var fielName=fileDetails.join(".");
			   
			   Andromeda.setSessionValue("fileFormat",fileDetails[1]);
			  console.log(Andromeda.getSessionValue("fileFormat"));
				var fileReader;
		       fileReader = new FileReader();
		       fileReader.onload = function(e) {
		       	binaryString =  e.target.result;
		       	base64 = btoa(binaryString);
		       	var str = base64.toString();
		       	
		       	var fileModel = {
		       		fileName : fileName,
		       		base64String : str,
		       		name:fileName,
		       		//role:Andromeda.getSessionValue('role')
		       	};
		       	//console.log("fileModel"+fileModel);
					$http.post('/erp/Upload/upload',fileModel).then(function(response) {
						$scope.data1111 = response.data;
						if($scope.data1111.successful)
						{
							var name=$scope.data1111.responseObject.name;
							Andromeda.setSessionValue("filePath",name);
							
							
						}
						else {
							alert("File upload failed....please try again!!!!");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		       };       
		       fileReader.readAsBinaryString( el1.files[0]);	
		    };
		    

	      
		  //Save excel data
		    $scope.save = function(excelData,yearobject)
		    {
		    	console.log(yearobject);
		    
		    	
		    	if(yearobject == undefined)
				{
					swal("OOPS!","Fill all details","info");
				}
				/*else if(yearobject.year == null || yearobject.year == undefined || yearobject.year == "")
				{
					swal("Oops...","Select year","info");
				}*/
				else
					{
		    	
		    console.log(excelData);
					
		        jQuery("#spinner1").show();
		        var employee = [];
		        $scope.excelDetails = excelData.slice(1,excelData.length);
		        var excelLength =  $scope.excelDetails.length, keepOnGoing = true;
		       
		            for(var i = 0; i < $scope.excelDetails.length; i++)
		            {
		            	var employeesDetails = {};
		            	employeesDetails.first_name = $scope.excelDetails[i]['First Name'];
		            	employeesDetails.middle_name = $scope.excelDetails[i]['Middle Name'];
		            	employeesDetails.last_name = $scope.excelDetails[i]['Last Name']; 
		            	employeesDetails.mobile = $scope.excelDetails[i]['Phone Number'];
		            	employeesDetails.email = $scope.excelDetails[i]['Email'];
		            	employeesDetails.company_email = $scope.excelDetails[i]['Company Email']; 
		            	employeesDetails.cader = $scope.excelDetails[i]['Cader']; 
		            	employeesDetails.grade = $scope.excelDetails[i]['Grade'];
		            	employeesDetails.joining_date = $scope.excelDetails[i]['Joining Date'];
		            	employeesDetails.confirmed_date = $scope.excelDetails[i]['Confirmed Date']; 
		            	employeesDetails.contract_from = $scope.excelDetails[i]['Contract From']; 
		            	employeesDetails.contract_to = $scope.excelDetails[i]['Contract To']; 
		            	employeesDetails.relieved_date = $scope.excelDetails[i]['Relieved Date'];
		            	employeesDetails.department = $scope.excelDetails[i]['Department']; 
		            	employeesDetails.designation = $scope.excelDetails[i]['Designation']; 
		            	employeesDetails.division = $scope.excelDetails[i]['Division'];
		            	employeesDetails.cost_center = $scope.excelDetails[i]['Cost Center'];
		            	employeesDetails.employee_type = $scope.excelDetails[i]['Employee Type']; 
		            	employeesDetails.reporting_to = $scope.excelDetails[i]['Reporing To']; 
		            	employeesDetails.notice_period = $scope.excelDetails[i]['Notice Period']; 
		            	employeesDetails.year = yearobject.year;
		 	            console.log(Andromeda.getSessionValue('filePath'));         
		 	           employeesDetails.filePath = Andromeda.getSessionValue('filePath');
		 	          employeesDetails.fileExtension = Andromeda.getSessionValue('fileFormat');
		 	                //studentsDetails.fileFormat = Andromeda.getSessionValue('fileFormat');
		 	         employee.push(employeesDetails);  
		            }
		            
		            $("#spinner1").show();
		            console.log(employee);
		            
		            $http.post('/erp/Upload/saveDetails',employee).then(function(response) {
		                $scope.data1 = response.data;
		                if($scope.data1.successful) {
		                	$("#spinner1").hide();
		                    alert("Data saved successfully");
		                }
							 else {
		                    alert("Data not inserted");
		                }
		                Andromeda.showUploadEmployee();
		            }, function(errResponse) {
		                console.error('Error while fetching notes');
		            });
		            
			    }
		    };
		    
		    
		    $http.get('/erp/Upload/getAll').then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.singleCollegeStudentsSummary = $scope.data.responseObject;
				}
				else
				{
					console.log("Client error while getting data");  
				}
			});
}]);
