
var Registration = angular.module('NotificationmobileModule', []);
Registration.controller('MobileController', ['$http','$scope', function($http, $scope) {
	
// for checkboxes 
	
	$scope.projectEmp = [];
	$scope.projectEmp1 = [];
	$scope.linedetails = [];
	$scope.groupdetails = [];
	$scope.filteredResults = [];

	$scope.setAllRegId = function(checkemployees)  
	{
	console.log(checkemployees);
	if(checkemployees == true)
	{  
	for(var i = 0; i < $scope.filteredResult.length; i++)
	{
	var project3 = $scope.filteredResult[i]['mobile'];
	$scope.projectEmp[project3] = true;
	} 
	}
	else if(checkemployees == false)
	{
	$scope.projectEmp = [];
	}
	};
	
	$scope.setAllRegIds = function(checkgroupemployees)  
	{
	console.log(checkgroupemployees);
	if(checkgroupemployees == true)
	{  
	for(var i = 0; i < $scope.filteredResults.length; i++)
	{
	var project3 = $scope.filteredResults[i]['mobile'];
	$scope.projectEmp1[project3] = true;
	} 
	}
	else if(checkgroupemployees == false)
	{
	$scope.projectEmp1 = [];
	}
	};
	
	
	$scope.sendSMS = function(projectEmp,data) 
	{
		console.log(projectEmp);
		console.log(data);
		
		 /*$scope.getById = function(data){ 
		 $http.post('/erp/notification/getById', data).then(function(response) { 
			 $scope.data = response.data; 
			 if ($scope.data.successful) {
			 }
		 });
		       */        	if(projectEmp != null)
				{
					var Obj = [];
					for(var i in projectEmp){
						if(projectEmp[i] == true)
							{
							var obj={
									
									"mobile" : i,
								     "needbydate" : data.needbydate
									
							};
							
		
							   
		console.log(obj+"selected");
		$http.post('/erp/notification/sendSMS', obj).then(
				function(response) {
					$scope.data = response.data;   
					if ($scope.data.successful) {
						
						swal("Message sent Successfully");
						Andromeda.showNotificationgroup();  
					} else {
						alert("Message not sent");
					}
					
				}, function(errResponse) {
		 			console.error('Error while fetching notes');
				});
	}; 
	  
					}
				}
	}
	
	$scope.sendGroupSMS = function(projectEmp1,data) 
	{
		console.log(projectEmp1);
		console.log(data);
		
		 /*$scope.getById = function(data){ 
		 $http.post('/erp/notification/getById', data).then(function(response) { 
			 $scope.data = response.data; 
			 if ($scope.data.successful) {
			 }
		 });
		       */
		if(projectEmp1 != null)
			{
			var Obj = [];
			for(var i in projectEmp1){
				if(projectEmp1[i] == true)
					{
					var obj={
							
							"mobile" : i,
						     "needbydate1" : data.needbydate1
							
					};
					
						
						
						
						/*for(var i in projectEmp1)       
						{
							if(projectEmp1[i] == true)
							{
								var obj = 
								{   
									"mobile" : i,
								     "needbydate1" : data.needbydate1
								    

								};
							}
						}
		*/
							   
		console.log(obj);
		$http.post('/erp/notification/sendGroupSMS', obj).then(
				function(response) {
					$scope.data = response.data;   
					if ($scope.data.successful) {
						
						swal("Message sent Successfully");
						Andromeda.showNotificationgroup();  
					} else {
						alert("Message not sent");
					}
					
				}, function(errResponse) {
		 			console.error('Error while fetching notes');
				});
	}; 
			}
			}
			}
	
	
	$scope.getById = function(data){
		/*alert(data);*/

	$http.post('/erp/notification/getbasedonselection',data).then(function(response) {
		$scope.data = response.data;
	
		if ($scope.data.successful) {
			$scope.filteredResult12 = $scope.data.responseObject;
			
		} else {
			alert("Can't view the Data");         
		}
	}, function(errResponse) {
		console.error('Error while viewing notes');
	});


	 
	}			
	
		
			// New group creation
			$scope.registration = function(UserData) {
				alert(UserData.group_name + ' Registration Successful');
				UserData.id = Andromeda.getSessionValue("id");
				console.log(UserData.id);   
				$http.post('/erp/notification/add', UserData).then(
						function(response) {
							$scope.data = response.data;   
							if ($scope.data.successful) {
								
								alert("New Group Created Successfully");
								Andromeda.showNotificationgroup();  
							} else {
								alert("Data not inserted");
							}
						}, function(errResponse) {
				 			console.error('Error while fetching notes');
						});
			};
			
			
			
			// New notification creation
			$scope.inserting = function(data) {
			/*	alert(data + '  Successful');*/
				alert(richeditor.getData());
/*				alert(document.getElementById('richeditor').getData());
*/				
				$http.post('/erp/notification/inserting', data).then(
						function(response) {
							$scope.data = response.data;   
							if ($scope.data.successful) {
								
								alert("New Notification Created Successfully");
								Andromeda.showNotificationgroup();  
							} else {
								alert("Data not inserted");
							}
						}, function(errResponse) {
				 			console.error('Error while fetching notes');
						});
			};
			
			
			
			
			
			
			
			
			
			
			   
			// Get Data from Database based on Name
			$scope.getId = function(id){
				alert(id)
				$http.post('/erp/notification/getId',id).then(
						function(response) {
							$scope.data = response.data;
							console.log($scope.data );
							if ($scope.data.successful) {
								$scope.data={object:$scope.data.responseObject};
								
							} else {
								alert("Error while getting data");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};
			
			
			
			
			
			
			// Update group Name
			$scope.updateData = function(UserData){
				/*alert(UserData.id);*/
				//alert(UserData.group_name);
				//alert(Entered);
				$http.post('/erp/notification/updateData', UserData).then(
						function(response) {
							$scope.data = response.data;
						      if ($scope.data.successful) {
								console.log(response.data);
								alert("Group Name Successfully updated");
								Andromeda.showNotificationgroup(); 
							} else {
								alert("Data not updated");
							}
						}, function(errResponse) {
							console.error('Error while fetching notes');
						});
			};

			// getting data of after creating data from Database
			$http.post('/erp/notification/getAll').then(function(response) {
				$scope.data = response.data;
			
				if ($scope.data.successful) {
					$scope.newuserdetails = $scope.data.responseObject;
					
				} else {
					alert("Can't view the Data");         
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});
			
			
			
			
/*
			// getting data of added employees from Database
			$http.post('/erp/notification/getbasedonselection').then(function(response) {
				$scope.data = response.data;
			
				if ($scope.data.successful) {
					$scope.filteredResult12 = $scope.data.responseObject;
					
				} else {
					alert("Can't view the Data");         
				}
			}, function(errResponse) {
				console.error('Error while viewing notes');
			});

		*/
			
			
			
			/* Getting Departments */
			
			$http.get('/erp/employee/getDepartment').then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.departments = $scope.data.responseObject;
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
			
			
			
			/* Getting caders */
			   
			$http.get('/erp/employee/getCaders').then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.caders = $scope.data.responseObject;
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
			
			
			/* Getting grades */
			
			$http.get('/erp/employee/getGrades').then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.grades = $scope.data.responseObject;
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
			
			
			/* getting designations */
			$http.get('/erp/employee/getDesignation').then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful)
				{
					$scope.designations = $scope.data.responseObject;
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
			    
			
			/* Getting Employee type */
			$http.get('/erp/Employee/getStaff').then(function(response) {
				$scope.data = response.data; 
				if ($scope.data.successful) {
					$scope.types = $scope.data.responseObject; 
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});
			
			
			
			
			
			/* Get dropdowns for groups*/
		$http.get('/erp/notification/getdropdown').then(function(response) {
				$scope.data = response.data; 
				if ($scope.data.successful) {
					$scope.groups = $scope.data.responseObject; 
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});
			
			
			
			
			
			
			/* Getting employees data based on given data */
			
			$scope.getemployeedatabased=function(data){
				console.log(data); 
						
			$http.post('/erp/notification/getemployeedatabased',data).then(function(response) {
				$scope.data = response.data;   
				if($scope.data.successful)
				{
					$scope.linedetails = $scope.data.responseObject.mody;
					console.log($scope.linedetails);
				}
				else
				{
					console.log("Client error while getting data");  
				}  
				});   
			}
			
			$scope.getGroupDetails=function(data){
				console.log(data.id); 
						
			$http.post('/erp/notification/getGroupDetails',data.id).then(function(response) {
				$scope.data = response.data;   
				if($scope.data.successful)
				{
					$scope.groupdetails = $scope.data.responseObject.group;
					console.log($scope.groupdetails);
				}
				else
				{
					console.log("Client error while getting data");  
				}  
				});   
			}
			
			
			
			
			
			
		
							
		}]);


