var leaveSummaryReportModule = angular.module('leaveSummaryReportModule', [])
.filter('sumOfValue', function () {
return function (data, key) {        
if (angular.isUndefined(data) || angular.isUndefined(key))
return 0;             
var sum = 0;        
angular.forEach(data,function(value)
        {     
	if(value[key]==null){
		value[key]=0;
	}
	if(value[key] != null)
	{
		sum = sum + value[key];
	}    
        });         
return sum;
    };    
})

leaveSummaryReportModule.controller('leaveSummaryController', [ '$http', '$scope', function($http, $scope) {
	
	var count = 0;
		var self = this;
		
		$http.get('/erp/leavesreport/getCalendarYears').then(function(response) {
			$scope.data = response.data;
			if($scope.data.successful)
			{
				$scope.calendaryears = $scope.data.responseObject;
				console.log($scope.calendaryears);
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
		
			
			$scope.getLeaveSummaryReport = function(year_id){
				console.log(year_id);
			
				
				$http.post('/erp/leavesreport/getLeaveSummaryReport',year_id).then(function(response) {
				$scope.data = response.data;
				if($scope.data.successful) {
					$("#leaveDiv").show();   
					$scope.leaveSummary = $scope.data.responseObject.report;
				} else {
					showError($scope.data.errorMessage);   
					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
					jQuery("#errorDiv").html(message);
				}
			}, function(errResponse) {         
				console.error('Error ...');      
			});   
			};  
			
		
					

} ]);
