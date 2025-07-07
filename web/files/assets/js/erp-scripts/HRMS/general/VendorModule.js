var vendor = angular.module('VendorModule', []);
var documentsArr = [];

vendor.filter('numberFormat', function () {
	return function(input) {   
	     input = input || 0;
	     var out = new Intl.NumberFormat('en-IN').format(parseInt(input));
	     return out;
	};
})  
                                
.filter('sumOfValue', function() {
    return function(data, key) {
      if (angular.isUndefined(data) || angular.isUndefined(key))
        return 0;
      var sum = 0;
      angular.forEach(data, function(v, k) {
        sum = sum + parseInt(v[key]);
      });    
      return sum;  
    };
 })
vendor.controller('VendorController',['$scope','$http',function($scope,$http)
{
	$scope.save = function(UserData)	
	{
				if(UserData != undefined)
				{       
				if(UserData.vendor_type == null || UserData.vendor_type == undefined || UserData.vendor_type == "")
				{
				swal("Oops","Please, Enter vendor Type ","info");
				} 
				else if(UserData.name == null || UserData.name == undefined || UserData.name == "")	
				{
				swal("Oops","Please, Enter vendor Name ","info");
				}
				else if(UserData.mobile == null || UserData.mobile == undefined || UserData.mobile == "")	
				{
				swal("Oops","Please, Enter Mobile Number ","info");
				}
				else if(UserData.phone == null || UserData.phone == undefined || UserData.phone == "")	
				{
				swal("Oops","Please, Enter Phone Number ","info");
				}
				else if(UserData.email == null || UserData.email == undefined || UserData.email == "")	
				{
				swal("Oops","Please, Enter Email Id ","info");
				}
				else if(UserData.web_site == null || UserData.web_site == undefined || UserData.web_site == "")	
				{
				swal("Oops","Please, Enter Web site URL ","info");
				}
				else if(UserData.address == null || UserData.address == undefined || UserData.address == "")	
				{
				swal("Oops","Please, Enter Address ","info");
				}
				else if(UserData.contact_person_name == null || UserData.contact_person_name == undefined || UserData.contact_person_name == "")	
				{
				swal("Oops","Please, Enter Name of Authorized Representative ","info");
				}
				else if(UserData.contact_person_designation == null || UserData.contact_person_designation == undefined || UserData.contact_person_designation == "")	
				{
				swal("Oops","Please, Enter Authorized Person Designation ","info");
				}
				else if(UserData.contact_person_mobile == null || UserData.contact_person_mobile == undefined || UserData.contact_person_mobile == "")	
				{
				swal("Oops","Please, Enter Authorized Person MobileNo ","info");
				}
				else if(UserData.contact_person_mail == null || UserData.contact_person_mail == undefined || UserData.contact_person_mail == "")	
				{
				swal("Oops","Please, Enter Authorized Person Email ","info");
				}
				else if(UserData.income_status == null || UserData.income_status == undefined || UserData.income_status == "")	
				{
				swal("Oops","Please, Enter the Income Status of the Person","info");
				}
				else if(UserData.service_status == null || UserData.service_status == undefined || UserData.service_status == "")	
				{
				swal("Oops","Please, Enter Service Status of the Person","info");
				}
				/*else if(UserData.registering_authority == null || UserData.registering_authority == undefined || UserData.registering_authority == "")	
				{
				swal("Oops","Please, Enter Registering Authority ","info");
				}*/
				else if(UserData.registration_no == null || UserData.registration_no == undefined || UserData.registration_no == "")	
				{
				swal("Oops","Please, Enter Registration No","info");
				}
				else if(UserData.date_of_registration == null || UserData.date_of_registration == undefined || UserData.date_of_registration == "")	
				{
				swal("Oops","Please, Enter Date of Registration","info");
				}
				else if(UserData.place_of_registration == null || UserData.place_of_registration == undefined || UserData.place_of_registration == "")	
				{
				swal("Oops","Please, Enter Palce of Registration ","info");
				}
				else if(UserData.experience == null || UserData.experience == undefined || UserData.experience == "")	
				{
				swal("Oops","Please, Enter No Of Years Experience ","info");
				}
				else if(UserData.annual_turnover == null || UserData.annual_turnover == undefined || UserData.annual_turnover == "")	
				{
				swal("Oops","Please, Enter the Annual turnover ","info");
				}
				else if(UserData.nsdc_number == null || UserData.nsdc_number == undefined || UserData.nsdc_number == "")	
				{
				swal("Oops","Please, Enter Nsdc affilcation No","info");
				}
				else if(UserData.ssc_number == null || UserData.ssc_number == undefined || UserData.ssc_number == "")	
				{
				swal("Oops","Please, Enter SSC affilcation No","info");
				}
				else if(UserData.pan_no == null || UserData.pan_no == undefined || UserData.pan_no == "")	
				{
				swal("Oops","Please, Enter PAN No","info");
				}
				else if(UserData.tan_no == null || UserData.tan_no == undefined || UserData.tan_no == "")	
				{
				swal("Oops","Please, Enter TAN No","info");
				}
				else if(UserData.service_tax == null || UserData.service_tax == undefined || UserData.service_tax == "")	
				{
				swal("Oops","Please, Enter Service Tax No","info");
				}
				else if(UserData.account_no == null || UserData.account_no == undefined || UserData.account_no == "")	
				{
				swal("Oops","Please, Enter Bank Account No","info");
				}
				else if(UserData.bank_name == null || UserData.bank_name == undefined || UserData.bank_name == "")	
				{
				swal("Oops","Please, Enter Bank Name","info");
				}
				else if(UserData.branch == null || UserData.branch == undefined || UserData.branch == "")	
				{
				swal("Oops","Please, Enter Branch","info");
				}
				else if(UserData.gst_no == null || UserData.gst_no == undefined || UserData.gst_no == "")	
				{
				swal("Oops","Please, Enter GST NO","info");
				}
				else if(UserData.gst_reg_date == null || UserData.gst_reg_date == undefined || UserData.gst_reg_date == "")	
				{
				swal("Oops","Please, Enter GST Registered Date","info");
				}
				else if(UserData.nature_of_service == null || UserData.nature_of_service == undefined || UserData.nature_of_service == "")	
				{
				swal("Oops","Please, Enter the Nature of serviceDate","info");
				}
				
			else
			{
	
				$http.post('/erp/vendor/add', UserData).then(
				
					function(response) {    
					$scope.data = response.data;      
					if ($scope.data.successful) {
						alert("User Data Inserted Successfully");
						location.reload();
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			};
				}
	};
	                                                  
	$http.get('/erp/vendor/getAll').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.regdetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
		
	
	

	$scope.name=null,$scope.filteredResult = null;
					    
					$scope.getNameWiseData = function(obj) {      
						$scope.getBranchWisePrograms = function(totalObj)
						{
							Andromeda.setSessionValue("studentBranchId", totalObj.name);
							
							$("#glyphiconid").show();        
							$scope.name = totalObj.name;
							$http.post('/erp/vendor/getBranchWisePrograms', totalObj.name).then(function(response)
							{
								$scope.data = response.data;
								if($scope.data.successful)
								{
									$scope.regdetails = $scope.data.responseObject;
									/*$("#div1").hide();
									$("#lb6b").show();
									$("#div4").hide();*/
									$("#glyphiconid").hide();
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
						}; 
					} 
					
	
					$scope.getIdWiseData = function(obj) {      
						$scope.getBranchWisePrograms = function(totalObj)
						{
							Andromeda.setSessionValue("studentBranchId", totalObj.name);
							
							$("#glyphiconid").show();        
							$scope.name = totalObj.name;
							$http.post('/erp/vendor/getBranchWisePrograms', totalObj.name).then(function(response)
							{
								$scope.data = response.data;
								if($scope.data.successful)
								{
									$scope.regdetails = $scope.data.responseObject;
									/*$("#div1").hide();
									$("#lb6b").show();
									$("#div4").hide();*/
									$("#glyphiconid").hide();
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
						}; 
					} 
					
	
	$scope.getById = function(Data){
	
		$http.post('/erp/vendor/getById',Data).then(function (response) {
		    $scope.data13 = response.data;
		    if ($scope.data13.successful) {
		        $scope.data = {object:$scope.data13.responseObject};
		    } else {
		    	//alert("Error while getting data");
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};     
	
		$scope.updateData = function(Data){
		$http.post('/erp/vendor/updateData', Data).then(function (response) {
				
					$scope.data = response.data;     
					if ($scope.data.successful) {
					  alert("User Details Successfully updated");
					 
					} else {
					  alert("Data not updated");
					}
				}, function(errResponse) {
				console.error('Error while fetching notes');
				});
	
		};
		$scope.toggle = function(id)
		{
			$("#" + id).toggle();
		};

}]);