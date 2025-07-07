var employee = angular.module('accountsreceivablelistapprovedview', []);
employee.controller('accountsreceivablelistaprovedController',['$scope','$http',function($scope,$http)
	{

	$http.post('/erp/finance/getreceivableviewdata',ERP.getSessionValue("voucher_id")).then(function (response) {
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
	
	$http.post('/erp/finance/getARDetailstabledatainview',ERP.getSessionValue("voucher_id")).then(function (response) {
		var sum = 0;
		   $scope.data = response.data;   
		   if ($scope.data.successful) {
		       $scope.ARDetails = $scope.data.responseObject.ardet;
		     
		   } else {
		    //alert("Error while getting data");
		    console.log("error")    
		     
		   }
		}, function (errResponse) {
		  console.error('Error while fetching notes');    
		});
	

}]);