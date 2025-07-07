var employee = angular.module('taxmapping', []);
employee.controller('taxmappingController',['$scope','$http',function($scope,$http)
	{
	
	/* getting dropdown for tax group */
	$http.get('/erp/finance/getTaxgroups').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.groups = $scope.data.responseObject;
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
	
	/* getting dropdown for service type */
	$http.get('/erp/finance/getservicetype').then(function(response) {
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
	
	/* getting dropdown for tax account */
	$http.get('/erp/finance/getTaxaccountnames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.accounts = $scope.data.responseObject;
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
	
	/* getting dropdown in tax section */
	$http.get('/erp/finance/getTaxsectionnames').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.sections = $scope.data.responseObject;
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
	
	/* creating tax mapping */
	$scope.createtaxmapping = function(TaxmappingData) {	
		console.log(TaxmappingData);
		$http.post('/erp/finance/createtaxmapping',TaxmappingData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
			    		/*	$("#com").show(); */
						alert("Tax Mapping Created Successfully");
						Andromeda.showcreatetaxmappingPage();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
	/* getting all tax mapping data in table */
		$http.get('/erp/finance/getallltaxmappings').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.userdetails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});
	
		/* getting data in pop up based on id */
		$scope.gettaxmappingdata = function(id){
			console.log(id);
			/*alert(empid);*/
			$http.post('/erp/finance/gettaxmappingdata', id).then(
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
		
		/* update tax mapping data base on id */
		$scope.updatetaxmapping = function(UserData){
			console.log(UserData);   
			/*alert(UserData.empid);*/
			$http.post('/erp/finance/updatetaxmapping', UserData).then(
					function(response) {
						$scope.data = response.data;
						if ($scope.data.successful) {
							alert("Tax Mapping Successfully updated");
							/*Andromeda.showcreatetaxmappingPage();*/
							$("#myModel").hide();
							$('.modal-backdrop').remove();
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
		
		/* removing data based on id */
		$scope.deletetaxmappingdata = function(taxmappingdata) {   
			console.log(taxmappingdata.id);
			$http.post('/erp/finance/deletetaxmappingdata', taxmappingdata.id).then(
					function(response) {
						$scope.data = response.data;
						console.log($scope.data);
						if ($scope.data.successful) {  
							/*location.reload();*/
							alert("Tax Mapping removed Successfully");
							Andromeda.showcreatetaxmappingPage();
						} else {
							alert("Data not Deleted");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};
	
		
}]);