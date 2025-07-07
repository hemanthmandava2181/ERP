var deputation = angular.module('DeputationModule', []);

deputation.controller('DeputationController', [ '$http', '$scope',
		function($http, $scope) {
			$http.get('/erp/deputation/getPname').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.pnames = $scope.data.responseObject;

					console.log($scope.pnames);
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});

			$http.get('/erp/deputation/getNames').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.names = $scope.data.responseObject;
					console.log($scope.names);
				} else {
					console.log("Client error while getting data");
				}
			});

			

			$http.get('/erp/deputation/getYears').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.years = $scope.data.responseObject;

					console.log($scope.years);
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});
			
			
			
			
			
			$http.get('/erp/deputation/getMonths').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.months = $scope.data.responseObject;
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});
			
			
			/*id=document.getElementById("id1").value;
			console.log(id);
			
			 $scope.columns = [{ id:id, amount:amount }];
			 
			  console.log($scope.columns);
			  $scope.addNewColumn = function() {
			    var newItemNo = $scope.columns.length+1;
			    console.log(newItemNo);
			    $scope.columns.push({'colId':'col'+newItemNo});
			  };*/
			  
			
			
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
			
			var payslip;
			var amnt;
			 
			/*var empid;
			var month;
			var year;*/
			
			
			   
			$scope.savedetails=function(data){
				var model = {
						empid:"", monthid:"", financial_year:"", payslip_heads:"", amount:0
				};
				var models = [];
				
				var x = document.getElementsByClassName("id1");
				var y = document.getElementsByClassName("id2");
				
				var  payload=data.empid + ":" + data.monthid + ":" + data.financial_year;
				for(var i=0; i<x.length; i++) {
					if(x[i].value != null && y[i].value != null) {
						payload += (i == 0 ? '#' : ";");
						payload += x[i].value + ":" + y[i].value;
						
						var m = Object.create(model);
						m.empid = data.empid;
						m.monthid = data.monthid;
						m.financial_year = data.financial_year;
						m.payslip_heads = x[i].value;
						m.amount = y[i].value;
						models.push(m);
					}
				}
				console.log(models);     
								    
				
				$http.post('/erp/deputation/add', models).then(function(response) {
					console.log(data);
					$scope.data = response.data;
					
					
					if ($scope.data.successful) {
						
						$scope.data={
								object : data
						};
						
						location.reload();
						swal("data inserted Successfully");
						location.reload();
					} else {
						swal("Data not inserted");
					}
				
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			
				
			};   
			
			/*$scope.insertion = function(data) {
				  var payslip=Andromeda.getSessionValue("payslip");
				  var amnt=Andromeda.getSessionValue("amnt");
				  var details={
		    			  
						  payslip_heads: payslip,      
						  amount : amnt,
						  empid : data.empid,
						  monthid :data.monthid,
						  yearid :data.yearid
						  empid : userData.employeename,
						  payroll_month : userData.monthid,
						  financial_year : userData.financial_year
						  

						  
						     
						  
						  empid:document.getElementById('emp1').value,
						 
						           
				  }  ;   
				 
				console.log(details);
			$http.post('/erp/deputation/add', details).then(function(response) {
				console.log(data);
				$scope.data = response.data;
				
				
				if ($scope.data.successful) {
					
					$scope.data={
							object : data
					};
					
					
					alert("data inserted Successfully");
				} else {
					alert("Data not inserted");
				}
			
			}, function(errResponse) {
				console.error('Error while fetching notes');
			});
	            
		}*/
			
			

	} ]);






















/*var deputation = angular.module('DeputationModule', []);

deputation.controller('DeputationController', [ '$http', '$scope',function($http, $scope) {
			$http.get('/erp/calc/getNames').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.names = $scope.data.responseObject;
					console.log($scope.names);
				} else {
					console.log("Client error while getting data");
				}
			});

			

			$http.get('/erp/calc/getYears').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.years = $scope.data.responseObject;

					console.log($scope.years);
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});
			
			
			$http.get('/erp/calc/getPname').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.pnames = $scope.data.responseObject;
					console.log($scope.pnames);
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});

			
			
			$http.get('/erp/calc/getMonths').then(function(response) {
				$scope.data = response.data;
				if ($scope.data.successful) {
					$scope.months = $scope.data.responseObject;
				} else {
					console.log("Client error while getting data");
				}
			}, function(response) {
				console.log("Server error while getting data");
			});

			
			
			
			
			
				var payslip;
				var amnt;
				var empid;
				var month;
				var year;
				$scope.savedetails=function(data1){
					
					console.log(data1);
					ERP.setSessionValue("payslip",data1.payslip_id);
					  ERP.setSessionValue("amnt",data1.amount);
					ERP.setSessionValue("empid",data1.employeename);
					ERP.setSessionValue("month",data1.monthid);
					  
					  if(payslip== null)
					{   
						  payslip=data1.payslip_id;
					 }
					  else
					  {
						  payslip=payslip + " ," + data1.payslip_id;
					  }
					  if(amnt == null)
					  {
						  amnt = data1.amount;   
					 }
					  else
					  {
						  amnt=amnt + " ," + data1.amount;
					  }

				  if(empid == null)
					  {
						  empid = data1.employeename;
					 }
					  else
					  {
						  empid=empid + " ," + data1.employeename;
					  }

				  if(month == null)
				  {
					  month = data1.monthid;
				 }
				  else
				  {
					  month=month + " ," + data1.monthid;
				  }
				  
				  if(year == null)
				  {
					  year = data1.financial_year;
				 }
				  else
				  {
					  year=year + " ," + data1.financial_year;
				  }

				  
					      
					  ERP.setSessionValue("payslip",payslip);
					  ERP.setSessionValue("amnt",amnt);
				 ERP.setSessionValue("empid",empid);
				 ERP.setSessionValue("month",month);
					 
					
				};
				
				  $scope.savedata = function(userData)    
				  { 
					  console.log(userData);      	
					  
					  var payslip=ERP.getSessionValue("payslip");
					  var amnt=ERP.getSessionValue("amnt");
			
					  
					  var array = [userData.employeename];
					  userData.employeename = array.join();     
					  console.log(userData.employeename);
					  var details={
				    			  
							  payslip_heads : payslip,      
							  amount : amnt, 
							  empid : userData.employeename,
							  payroll_month : userData.monthid,
							  financial_year : userData.financial_year
				
							 
							           
					  }  ;   
			      
					  console.log(details);
				    
				  
			  $http.post('/erp/ctc/addd',details).then(  
			     
			  function(response) 
			  {    
				  $scope.data = response.data; 
				  if($scope.data.successful)    
				  {     
					  
					  alert("User Data Inserted Successfully"); 
					  } else { 
						  alert("Data not inserted"); 
						  }
			   }, 
			   function(errResponse) {
				   console.error('Error while fetching notes'); 
			  });    
			  
			  } 


			
			
			  
			  
			  
			  
			  $scope.addDetails = function(userData)    
			  { 
				  console.log(userData);  	 
				  $http.post('/erp/ctc/addDetails',userData).then(
			  function(response) 
			  { 
				  $scope.data = response.data; 
				  if($scope.data.successful) 
				  { 
					  
					  
					  alert("User Data Inserted@@@@@@@@@@@@@@@@@@@@@@@@Successfully"); 
					  } else { 
						  alert("Data not inserted"); 
						  }
			   }, 
			   function(errResponse) {
				   console.error('Error while fetching notes'); 
			  });
			  
			  } 
			  
			  
			  
			  
			  
			  
			  $http.post('/erp/ctc/getEarnings').then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.userdetails = $scope.data.responseObject;
					} else {
						alert("Can't view the Data");
					}    
				}, function(errResponse) {
					console.error('Error while viewing notes');
				});
				$http.post('/erp/ctc/getDeductions').then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.regdetails1 = $scope.data.responseObject;
					} else {
						alert("Can't view the Data");  
					}
				}, function(errResponse) {
					console.error('Error while viewing notes');
				});
			  
			  
			  
			  
			  $scope.removeData = function(data) {   
					console.log(data.task);
					$http.post('/erp/ctc/removeData', data.task).then(
							function(response) {
								$scope.data = response.data;
								if ($scope.data.successful) {  
									location.reload();
									alert("Task removed Successfully");
								} else {
									alert("Data not Deleted");
								}
							}, function(errResponse) {
								console.error('Error while fetching notes');
							});
				};
			  
				 
				  $scope.getEmployeenames = function(data) {   
			  
				$http.get('/erp/ctc/getEmployeenames',data.payslip_id).then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.userdetails = $scope.data.responseObject;
						console.log($scope.names);
					} else {
						console.log("Client error while getting data");
					}
				});
				  };    
				  $scope.getPayrollMonth = function(data) {   
					  
				$http.get('/erp/ctc/getPayrollMonth',data.payslip_id).then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.userdetails = $scope.data.responseObject;
					} else {
						console.log("Client error while getting data");
					}
				}, function(response) {
					console.log("Server error while getting data");
				});

				
			
			  
			
				 $scope.saveempid = function(userData)    
				  { 
					  console.log(userData);  	 
					  $http.post('/erp/ctc/saveempid',userData).then(
				  function(response) 
				  { 
					  $scope.data = response.data; 
					  if($scope.data.successful) 
					  { 
						  
						  
						  alert("User Data Inserted@@@@@@@@@@@@@@@@@@@@@@@@Successfully"); 
						  } else { 
							  alert("Data not inserted"); 
							  }
				   }, 
				   function(errResponse) {
					   console.error('Error while fetching notes'); 
				  });
			
			
				  }
			
		} ]);
*/