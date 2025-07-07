var employee = angular.module('advanceList', []);
employee.controller('AdvanceListController',['$scope','$http',function($scope,$http)
	{
	
	/* getting data to pending list */
	$http.get('/erp/finance/getalladvancePendingData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.advancependingDetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting advance pending list view page details */
	$scope.getadvancependingvewdata=function(claim_advance_id){      
		console.log(claim_advance_id);
	 $http.post('/erp/finance/getadvancependingvewdata',claim_advance_id).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);
			 console.log("Successful");
		 } else {    
			 //alert("Error while getting data");
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');         
	 });   
	}
	
	/* update advance claim data */
	/*var documentsArr = [];*/
	$scope.updateadvanceclaimdata = function(AdvanceupdateData){
		/*var documents = {}; 
		AdvanceupdateData.base64String = documentsArr[0].base64String;
		AdvanceupdateData.fileName = documentsArr[0].fileName;
		AdvanceupdateData.name = documentsArr[0].name;*/
		console.log(AdvanceupdateData);
		$http.post('/erp/finance/updateadvanceclaimdata', AdvanceupdateData).then(
				function(response) {
					$scope.data = response.data;  
					if ($scope.data.successful) {
						/*Andromeda.showcreatecostcenterPage();*/
						swal("Requested Advance Claim Successfully updated");
						$("#myModel").hide();
						$('.modal-backdrop').remove();
						ERP.showAdvanceList1();
					} else {
						alert("Data not updated");
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
	                    var fileName = "AdvanceupdateData_" + (k+1)+"."+fileDetails[1];
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
//	         console.log(documentsArr);
	    }
	
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
	
	/* getting details to pop up based on claim_advance_id */
	$scope.getpopupdata = function(claim_advance_id){
		console.log(claim_advance_id);
		/*alert(empid);*/
		$http.post('/erp/finance/getpopupdata', claim_advance_id).then(
		function(response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
				$scope.data={object:$scope.data.responseObject};
			} else {
				alert("Error while getting data");
			}
		}, function(errResponse) {
			console.error('Error while fetching notes');
		});
	};
	
	/* approving advance claim */
	$scope.Approveadvanceclaim = function(ApproveclaimData){
		console.log(ApproveclaimData.claim_advance_id);   
		$http.post('/erp/finance/Approveadvanceclaim', ApproveclaimData).then(
				function(response) {
					$scope.data = response.data;  
					if ($scope.data.successful) {
						swal("Claim Approved Successfully");
						ERP.showAdvanceList1();
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	
	/* getting approved list data */
	$http.get('/erp/finance/getalladvanceApprovedData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.advApprovedDetails = $scope.data.responseObject;
		}
		else
		{
			console.log("Client error while getting data");  
		}
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
	
	/* getting data in approved view page */
	$scope.getapprovedclaimDetails=function(claim_advance_id){      
		console.log(claim_advance_id);
	 $http.post('/erp/finance/getapprovedclaimDetails',claim_advance_id).then(function (response) {
		 $scope.data = response.data;
		 if ($scope.data.successful) {
			 $scope.data = {object:$scope.data.responseObject};
			 console.log($scope.data);
			 console.log("Successful");
		 } else {    
			 //alert("Error while getting data");
			 console.log("error") 
		 }
	 }, function (errResponse) {
		 console.error('Error while fetching notes');         
	 });   
	}
	
	
		
}]);