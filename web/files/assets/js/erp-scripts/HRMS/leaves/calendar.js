var leave = angular.module('calendar', []);
var documentsArr = [];
leave.controller("calendarcontroller", ['$scope','$http',function($scope, $http)

		{

	       /*get years */
	
	$http.get('/erp/attendance/getyears').then(function(response) {
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
	
	
$scope.insertion = function(Data) {
	/*console.log(data);
	var arr=[data.day];   
	data.day=arr.join();
	console.log(data.day);*/
				$http.post('/erp/attendance/addcalendar', Data).then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						location.reload();
						alert("Data inserted Successfully");
					} else {
						alert("Data not inserted");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
			};
			
}]);