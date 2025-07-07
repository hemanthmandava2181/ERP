var createmou = angular.module('AddRolesModule', []);
createmou.controller('AddRoleController',['$scope','$http',function($scope,$http)
	{
	/* getting districts drop down */
	$http.get('/erp/employee/getRoles').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.roles = $scope.data.responseObject;
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
	
	/* creating work order */
	$scope.submit=function(data){
		var a=[];
		 $("#roleselect :selected").each(function(){
		        a.push($(this).val()); 
		    })
		//console.log(data+"///"+a);
		    data["roles"]=a;
		 console.log(data.roles);
		$http.post('/erp/employee/submit',data).then(function(response) {
		console.log(response.data);    
	});   
	}
			
	
	
}]);