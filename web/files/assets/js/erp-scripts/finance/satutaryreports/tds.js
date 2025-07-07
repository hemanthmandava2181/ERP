var tdsReport = angular.module('tdsReport', []);
tdsReport.controller('tdsController',['$scope','$http',function($scope,$http)
	{
	
	$http.get('/erp/finance/getTDSGLAccounts').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.TDSGLAccount = $scope.data.responseObject;
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
	
	   
	$scope.getIGSTReport = function(details){
		console.log(details);
		
		var obj = {   
				from_date: document.getElementById('from').value,
				to_date: document.getElementById('to').value,
				id:details.id
			
			};
		console.log(obj);   
		$http.post('/erp/finance/getIGSTReport',obj).then(function (response) {
		    $scope.data = response.data;
		    if ($scope.data.successful) {
		    	$("#report").show();
				$("#report1").hide();
				$("#report2").hide();
		        $scope.igstDetails = $scope.data.responseObject.igst;
		        console.log($scope.igstDetails);
		    } else {
	   
		    	console.log("error")
		       
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
		$scope.getCGSTReport = function(details){
			console.log(details);
			
			var obj = {   
					from_date: document.getElementById('from').value,
					to_date: document.getElementById('to').value,
					id:details.id
				
				};
			console.log(obj);   
			$http.post('/erp/finance/getCGSTReport',obj).then(function (response) {
			    $scope.data = response.data;
			    if ($scope.data.successful) {
			    	$("#report1").show();
					$("#report").hide();
					$("#report2").hide(); 
			        $scope.cgstDetails = $scope.data.responseObject.cgst;
			        console.log($scope.cgstDetails);
			    } else {
		   
			    	console.log("error")
			       
			    }
			}, function (errResponse) {
			   console.error('Error while fetching notes');    
			});   
			};  
			
			$scope.get194JReport = function(details){
				console.log(details);
				
				var obj = {   
						from_date: document.getElementById('from').value,
						to_date: document.getElementById('to').value,
						id:details.id
					
					};
				console.log(obj);   
				$http.post('/erp/finance/get194JReport',obj).then(function (response) {
				    $scope.data = response.data;
				    if ($scope.data.successful) {
				    	$("#report2").show();
						$("#report").hide();
						$("#report1").hide();
				        $scope.tdsPayableDetails = $scope.data.responseObject.tds;
				        console.log($scope.tdsPayableDetails);
				    } else {
			   
				    	console.log("error")
				       
				    }
				}, function (errResponse) {
				   console.error('Error while fetching notes');    
				});   
				};  
				
		
}]);