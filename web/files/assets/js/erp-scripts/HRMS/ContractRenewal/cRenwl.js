var data123 = angular.module('cRenwl', []);
data123.controller('rewlController1', ['$http','$scope', function($http, $scope) {
var totalheadcount;
var totalstaffcount;
var totalotherscount;
//totalheadcount(for charts purpose these methods used here again for temp purpose commented)
	/*$http.post('/erp/Employee/getAll1').then(function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						$scope.empDetails = $scope.data.responseObject;
						totalheadcount=$scope.empDetails.length;
						console.log($scope.empDetails);
					} else {
						alert("Can't view the Data");
					}
				}, function(errResponse) {  
					console.error('Error while viewing notes');
				});*/
	//totalstaff
	/*$http.post('/erp/Employee/getAll3').then(function(response) { 
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.empDetail = $scope.data.responseObject;
			totalstaffcount=$scope.empDetail.length;
			console.log($scope.empDetail);
		} else {
			alert("Can't view the Data");
		}
	}, function(errResponse) {  
		console.error('Error while viewing notes');
	});*/
	//totalothers
	/*$http.post('/erp/Employee/getAll4').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.empDetail13 = $scope.data.responseObject;
			totalotherscount=$scope.empDetail13.length;
			console.log($scope.empDetail13);
		} else {
			alert("Can't view the Data");
		}
	}, function(errResponse) {  
		console.error('Error while viewing notes');
	});*/

/*	
	
	setTimeout(() => {
		
	
	Highcharts.chart('container', {
	    chart: {
	        type: 'variablepie'
	    },
	    title: {
	        text: 'Employee Info.'
	    },
	    tooltip: {
	        headerFormat: '',
	        pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {point.name}</b><br/>' +
	            
	            ': <b>{point.z}</b><br/>'
	    },
	    series: [{
	        minPointSize: 10,
	        innerSize: '20%',
	        zMin: 0,
	        name: 'countries',
	        data: [{
	            name: 'Total Head count',
	            y: 50537,
	            z: totalheadcount
	        },  {
	            name: 'Total Staff count',
	            y: 21277,
	            z:totalstaffcount
	        }, {
	            name: 'Total Others count',
	            y: 25702,
	            z: totalotherscount
	        }]
	    }]
	});
	
},1000);
	
	
	
	
	
	
	
*/	
	
	
	
	
	
	
	$http.post('/erp/Employee/getAll2').then(function(response) {
		$scope.data = response.data;
		if ($scope.data.successful) {
			$scope.regdetails = $scope.data.responseObject;
			console.log($scope.regdetails);
		} else {   
			alert("Can't view the Data");
		}      
	}, function(errResponse) {  
		console.error('Error while viewing notes');    
	});
	
          
	
	$scope.updateData = function(UserData){
		for(i in UserData){console.log("Message:"+i);}
		console.log(UserData);
		$http.post('/erp/Employee/updateData12', UserData).then( 
				
				function(response) {
					$scope.data = response.data;
					if ($scope.data.successful) {
						window.alert("Initiated contract renewal process");
						location.reload();
					} else {
						alert("Data not updated");
					}
				}, function(errResponse) {
					console.error('Error while fetching notes');
				});
	};
	/*console.log("TestING");*/
	     
	            
	 
} ]);