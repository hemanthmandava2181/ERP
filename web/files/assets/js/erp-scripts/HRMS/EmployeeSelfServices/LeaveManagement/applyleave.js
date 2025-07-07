var leave = angular.module('applyleave', []);
var documentsArr = [];
leave.controller("applyController", ['$scope','$http',function($scope, $http)

		{      
	$scope.flexidateArr = [];
			$scope.insertion = function(EmpData) {
				/*if(EmpData == undefined)
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
				{*/
				 EmpData.base64String=documentsArr[0].base64String;
				 EmpData.fileName=documentsArr[0].fileName;
				 EmpData.name=documentsArr[0].name;
				EmpData.empid = ERP.getSessionValue("employee_id");
				console.log(EmpData);
				$http.post('/erp/Employee/addleave', EmpData).then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						
						swal("Leave applied Successfully");
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			};
			 $scope.uploadFiles = function(e)
		     {
		         var k= 0;
		         for(var i =	0;	i < e.files.length; i++)
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
		                     var fileName = "leaves" + (k+1)+"."+fileDetails[1];
		                     var binaryString =  e.target.result;
		                     var base64 = btoa(binaryString);
		                     var fileModel =
		                         {
		                             fileName		:	fileName,
		                             base64String	: base64.toString(),
		                             name			: fileName
		                         };
		                      documentsArr[k] = fileModel;
		                     k++;

		                 };
		                 fileReader.readAsBinaryString(e.files[i]);
		             })(singleFileInfo);
		         }
		     }
			/*}*/

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

			var empid = ERP.getSessionValue("employee_id");
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

					
			var empid = ERP.getSessionValue("employee_id");
			console.log("empid " + empid);
			$http.post('/erp/Employee/getFlexiCount', empid).then(
					function(response) {   
						$scope.data = response.data;
						if ($scope.data.successful) {
							$scope.FlexiCount = $scope.data.responseObject['0'].flexicount;
							console.log("Successful");
						} else {
							
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
					$scope.calendardetails = $scope.data.responseObject;
					
					$scope.data = {  
							object : data
					};
					
				} else {
					console.log("Client error while getting data");
				}
			});  
			}
			
			
			
				
			
			$scope.insertionFlexi = function(EmpData,flexidateArr,FlexiHolidays,FlexiCount) {
				console.log("EmpData"+JSON.stringify(EmpData));
				console.log("flexidateArr"+JSON.stringify(flexidateArr));
				console.log("FlexiHolidays"+JSON.stringify(FlexiHolidays));
				console.log("FlexiCount"+JSON.stringify(FlexiCount));
				if(FlexiCount<5){
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
									 "empid" : ERP.getSessionValue("employee_id"),
									 "date"    : d1,
									"leave_type" : EmpData.leave_type,
									"emergency_number" : EmpData.emergency_number,
									"reason" : EmpData.reason,
									"reporting_to" : EmpData.reporting_to,
									"leave_nature" : EmpData.leave_nature
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
									$http.post('/erp/Employee/addFlexi',obj).then(function(response)
								   {
										$scope.data = response.data;
										if ($scope.data.successful) {            
											swal("Leave applied Successfully");
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
				else{
				swal("not applicable");
				}
			}	
$scope.insertionComp = function() {
									$http.post('/erp/Employee/addComp',obj).then(function(response) {
										$scope.data = response.data;
										if ($scope.data.successful) {
											
											swal("Leave applied Successfully");
										} else {
											alert("Data not inserted");
										}
									}, function(errResponse) {
										console.error('Error while fetching notes');
									});
									
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
			
			
		
			
			
				/*Getting leave balance and total leaves*/
			var details = {
					employeeid : ERP
							.getSessionValue("employee_id")

						}
				console.log(details);
			$http.post('/erp/Employee/getTotalleaves', details).then(
					function(response) {
						$scope.data13 = response.data;
						if ($scope.data13.successful) {
							console.log($scope.data13);
							$scope.data = {
								object : $scope.data13.responseObject
							};
							console.log("Successful");
						} else {
							
							console.log("error")

						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});


			/* getting calendar details based on from date,to date*/
			$scope.getValidateComp=function(data){
				var details = {
						
						from_date: document.getElementById('from').value,
						to_date: document.getElementById('to').value
						
					};
				console.log(details);
		    $http.post('/erp/Employee/getValidateComp',details).then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {    
					console.log(details);
					$scope.validatedetails = $scope.data.responseObject;
					console.log(response.data.responseObject);
					$scope.data = {
							object : data
					};  
					
				} else {
					console.log("Client error while getting data");
				}
			});  
			
			}
			
					
			} ]);