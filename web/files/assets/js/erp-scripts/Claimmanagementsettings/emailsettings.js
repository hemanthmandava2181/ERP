var employee = angular.module('emailsettings', []);
employee.controller('EmailsettingsController',['$scope','$http',function($scope,$http)
	{
	
	/* creating email settings */
	$scope.createemailsettings = function(EmaileData) {	
		console.log(EmaileData);
		$http.post('/erp/finance/createemailsettings',EmaileData).then(  
				function(response) {    
					$scope.data = response.data;           
					if ($scope.data.successful) {
						alert("Email settings Created Successfully");
						ERP.showEmailSettings();
					} else {
						alert("Data not inserted");    
					}   
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
		};
		
		/* getting all email settings */
		$http.get('/erp/finance/getallemailSettingsdata').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{   
				$scope.emails = $scope.data.responseObject;
			}
			else
			{
				console.log("Client error while getting data");  
			}
		});   
		
		/* getting email settings data based on id */
		$scope.getemailsetingsdata = function(id){
			console.log(id);
			/*alert(empid);*/
			$http.post('/erp/finance/getemailsetingsdata', id).then(
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
		
		/* updating email settings data based on id */
		$scope.updateEmailsettings = function(EmailsData){
			console.log(EmailsData);   
			console.log(EmailsData.id);
			$http.post('/erp/finance/updateEmailsettings', EmailsData).then(
					function(response) {
						$scope.data = response.data;  
						if ($scope.data.successful) {
							ERP.showEmailSettings();
							swal("Email Settings Successfully updated");
							location.reload();
							
						} else {
							alert("Data not updated");
						}
					}, function(errResponse) {
						console.error('Error while fetching notes');
					});
		};	
		
		
}]);