var employee = angular.module('advancelist', []);
employee.controller('advancelistController',['$scope','$http',function($scope,$http)
	{
	
	/* getting data to table */
	$http.get('/erp/finance/getalladvanceListData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.advanceListdetails = $scope.data.responseObject;
		}  
		else
		{
			console.log("Client error while getting data");  
		}
	});
	
	/* getting table data in view page 
	$http.get('/erp/finance/getallviewHistoryListData').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{   
			$scope.viewhistorydetails = $scope.data.responseObject;
		}  
		else
		{
			console.log("Client error while getting data");  
		}
	});*/
	
	/* getting data in view page */
	$scope.getadvanceviewpgedata=function(claim_advance_id){      
		console.log(claim_advance_id);
	 $http.post('/erp/finance/getadvanceviewpgedata',claim_advance_id).then(function (response) {
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
	
	/* update advance claim data */
	
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
						/*$("#myModel").hide();
						$('.modal-backdrop').remove();*/
						location.reload();   
						ERP.showAdvanceList();    
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
	
	
		
}]);