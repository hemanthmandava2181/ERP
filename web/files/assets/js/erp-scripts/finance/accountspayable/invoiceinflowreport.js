var employee = angular.module('invoiceinflowreport', []);
employee.controller('invoiceinflowreportController',['$scope','$http',function($scope,$http)
	{
	
	/* getting calendar details based on from date,to date*/
	
	$scope.getCalendarDetails=function(data){
		var data1 = {
				
				from_date: document.getElementById('fromdate').value,
				to_date: document.getElementById('todate').value

			};
		console.log(data1);
    $http.post('/erp/attendance/getCalendarDetails',data1).then(function(response) {
		$scope.data1 = response.data;
		if ($scope.data1.successful) {
			$scope.data = $scope.data1.responseObject;
			console.log($scope.data);
			for(var i = 0; i < $scope.data.length;i++){
				var presenceArr = $scope.data[i]['presence'].split(",");
				console.log(presenceArr);
				var tempArr = [];
				
				for(var j = 0; j < presenceArr.length; j++){
					var eachDateArr = presenceArr[j].split(":");
					
					if(eachDateArr[2] == "F"){
						eachDateArr[1] == "H";
					}
					var presenceObj = 
						{
							date : eachDateArr[0],
							status : eachDateArr[1],
							workingDayOrNot : eachDateArr[2]
						};
					tempArr.push(presenceObj);
				}
				$scope.data[i]['presenceArr'] = tempArr;
			}
		} else {
			console.log("Client error while getting data");
		}
	});  
	}
	
}]);