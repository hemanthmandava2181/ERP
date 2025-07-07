var leaveSettingsModule=angular.module('leaveSettingsModule',[]);

leaveSettingsModule.controller('leaveSettingsController',['$scope','$http',function($scope,$http){
	
	$scope.leaveSettingArr = [];
	$scope.leaveSettingArr1 = [];
	$http.get('/erp/leavesreport/getLeavesDetails').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.leaveTypes = $scope.data.responseObject;
			console.log($scope.leaveTypes);
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
	


	$http.get('/erp/leavesreport/getLeaveRules').then(function(response) {
		$scope.data = response.data;
		if($scope.data.successful)
		{
			$scope.leaveRules = $scope.data.responseObject;
			console.log($scope.leaveRules);
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
	

	$scope.savedata = function(LeaveData,leaveSettingArr,leaveRules) {

		console.log(LeaveData);
		console.log(leaveSettingArr);   
		console.log(leaveRules);
		if(leaveSettingArr != null)
		{
		var Obj= [];
		for(var i in leaveSettingArr)
		{  
		if(leaveSettingArr[i] == true)
		{
		for(var k=0;k<$scope.leaveRules.length;k++)
		{
		if($scope.leaveRules[k]['id'] == i)
		{
		var d1=$scope.leaveRules[k]['id'];  
		console.log(d1);      
	
		var obj={
	
		"id"    : d1,
		"leave_type" : LeaveData.leave_type,
		"gender" :LeaveData.gender,
		"statusvalue" :LeaveData.statusvalue,   
		"useddays" :LeaveData.useddays,
		"maxdays" :LeaveData.maxdays,
		"maxleaves" :LeaveData.maxleaves,
		"workdays" :LeaveData.workdays,
		"applicabledays" :LeaveData.applicabledays
		}
		

	

		console.log(obj);
		$http.post('/erp/leavesreport/saveData',obj).then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
		/*location.reload();
		alert("Leave Data Successfully");*/
		} else {   
		alert("Data not inserted");
		}
		}, function(errResponse) {
		console.error('Error while fetching notes');
		});

		}   
		}
		}
		}

		}   
	}
			

	$scope.getByLeave = function(leave_type){
		console.log(leave_type);
		
		$http.post('/erp/leavesreport/getByLeave',leave_type).then(function (response) {
		    $scope.data3 = response.data;
		if ($scope.data3.successful) {
		        $scope.data = {object:$scope.data3.responseObject};
		        console.log( $scope.data);
		
		    } else {
			//alert("Error while getting data");
			console.log("error")
		
		    }
		}, function (errResponse) {
		   console.error('Error while fetching notes');    
		});   
		};  
				
		
		$scope.update = function(updateData,leaveSettingArr1,leaveRules) {
	
			console.log(updateData);
			console.log(leaveSettingArr1);   
			console.log(leaveRules);
			if(leaveSettingArr1 != null)   
			{
			var Obj= [];
			for(var i in leaveSettingArr1)
			{  
			if(leaveSettingArr1[i] == true)
			{
			for(var k=0;k<$scope.leaveRules.length;k++)
			{
			if($scope.leaveRules[k]['id'] == i)
			{
			var d1=$scope.leaveRules[k]['id'];  
			console.log(d1);      
		
			var obj={  
		
			"id"    : d1,
			
			
			}
			

			console.log(obj);
			$http.post('/erp/leavesreport/update',obj).then(function(response) {
			$scope.data = response.data;
			if ($scope.data.successful) {
			
			} else {   
			alert("Data not inserted");
			}
			}, function(errResponse) {
			console.error('Error while fetching notes');
			});

			}   
			}
			}
			}

			}
		}
		
	      $scope.saveLeaveType = function(data) {
				
            console.log(data);
				$http.post('/erp/leavesreport/saveLeaveType',data).then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						

					} 
					else {
						alert("Data not inserted");
						
					}
				});
			}

	
	
}]);
