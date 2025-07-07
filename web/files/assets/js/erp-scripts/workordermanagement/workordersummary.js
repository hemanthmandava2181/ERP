var workordersummary = angular.module('workordersummary', []);
workordersummary.controller('workordersummaryController',['$scope','$http',function($scope, $http) 
{

							/* Getting schemes */
	$http.get('/erp/procurement/getSchemes').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
		{
			$scope.schemes = $scope.data.responseObject;
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

	$http.get('/erp/procurement/getProjects').then(function(response) 
	{
		$scope.data = response.data;
		if ($scope.data.successful) 
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

	$scope.getProjectWise = function(data) 
	{
		console.log(data);
		$http.post('procurement/getProjectWise',data.id).then(function(response) 
		{
			$scope.data = response.data;
			if ($scope.data.successful) 
			{
				console.log($scope.data);
				$scope.details = $scope.data.responseObject.centers;
			} 
			else 
			{
				var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage+ "</div>";
				jQuery("#errorDiv").html(message);
			}
		},
		function(errResponse) 
		{
			console.error('Error while fetching notes');
		});
	};

							/*
							 * $scope.getWorkOrderWise = function(data) {
							 * console.log(data);
							 * $http.post('procurement/getWorkOrderWise',data).then(function(response) {
							 * $scope.data = response.data;
							 * if($scope.data.successful) {
							 * console.log($scope.data); $scope.pendingdetails =
							 * $scope.data.responseObject.centers; } else { var
							 * message = "<div class=\"alert alert-danger\"><strong>Error:
							 * </strong>"+ $scope.data.errorMessage + "</div>";
							 * jQuery("#errorDiv").html(message); } },
							 * function(errResponse) { console.error('Error
							 * while fetching notes'); }); };
							 */
							$scope.getWorkOrderWise = function(data) {
								console.log(data);
								$http
										.post('procurement/getWorkOrderWise',
												data)
										.then(
												function(response) {
													$scope.data = response.data;
													if ($scope.data.successful) {
														console
																.log($scope.data);
														$scope.approvedetails = $scope.data.responseObject.centers;
													} else {
														var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
																+ $scope.data.errorMessage
																+ "</div>";
														jQuery("#errorDiv")
																.html(message);
													}
												},
												function(errResponse) {
													console
															.error('Error while fetching notes');
												});
							};

						} ]);