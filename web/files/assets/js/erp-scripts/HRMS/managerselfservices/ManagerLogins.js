function formatDate(date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),               
        year = d.getFullYear();
    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;
    return [year, month, day].join('-');
};
function formatDateDayFirst(date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear()
    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;
    return [day, month, year].join('-');
};
var managerModule= angular.module('managerModule', [])
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
managerModule.directive('datepicker', function () {
   return {
    restrict: 'A',
        require: 'ngModel',
         link: function (scope, element, attrs) {
            $(element).datepicker({
            maxDate : new Date,
    changeMonth : true,
    changeYear : true,
    dateFormat : 'dd-mm-yy',   
    yearRange : '-50:+0',
                onSelect: function (date) {
                    scope.dob = date;
                    scope.$apply();
               }
           });
       }
   };
})
function attendanceActivity(date){
	$(function () {
     $('#Ramya').highcharts({
       chart: {
        renderTo: 'container'
    },
    xAxis: {
        type: 'datetime',    
        title: {    
                text: 'Time'
            } //ensures that xAxis is treated as datetime values
    },
     yAxis: {
            title: {
                text: 'Employee present in office'
            },
            tickInterval: 50
        },
        title: {
            text: 'Attendance activity'
        },      
        tooltip: {
            crosshairs: true,
            shared: true,
            text : 'attended'
        },
      series: [{
        data: [
            [Date.UTC(date.year, date.month-1, date.day, 8, 00), date.eight], 
            [Date.UTC(date.year, date.month-1, date.day, 8, 30), date.eightthirty], 
            [Date.UTC(date.year, date.month-1, date.day, 9, 00), date.nine], 
            [Date.UTC(date.year, date.month-1, date.day, 9, 30), date.ninethirty],
            [Date.UTC(date.year, date.month-1, date.day, 10, 00), date.ten], 
            [Date.UTC(date.year, date.month-1, date.day, 10, 30), date.tenthirty],
            [Date.UTC(date.year, date.month-1, date.day, 11, 00), date.eleven], 
            [Date.UTC(date.year, date.month-1, date.day, 11, 30), date.eleventhirty]
            //and so on...
        ]
    }]
       
    });
});
}
managerModule.controller('managerController', [ '$http', '$scope', function($http, $scope) {	 
			$scope.generateemployeeexcel = function() {
				console.log("Coming");
		         var blob = new Blob([document.getElementById('attendancediv').innerText], {
		             type: "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"
		         });
		         var fileName = "Attendance";                  
		         if (fileName != null) {
		             saveAs(blob, fileName + ".xls");   
		         }   
		     };
		    	/* sending data*/
	      $scope.getLoginSheets = function(data)
		    		{ 
		    			console.log(data);
		   			 if(data==null || data=='' || data==undefined)
		   			  {
		   			  	swal("Enter all details!");
		   			  }
		   			else if(data.from_date == null || data.from_date == '' || data.from_date== undefined)
		   			  {
		   			  	swal("Enter From Date!");
		   			  }
		   			 else if(data.to_date == null || data.to_date == '' || data.to_date == undefined)
		   			  {
		   			  	swal("Enter To Date!");
		   			  } 			 
		   			 else{
		    			console.log(data); 
		    			$http.post('/erp/manager/getLoginSheets',data).then(function(response)
		    			{   
		    		    	$scope.data = response.data;                
		    				if($scope.data.successful)                                          
		    				{      	    					
		    					console.log($scope.data);  
		    					$scope.userdetails = $scope.data.responseObject.centers;
		    				}          
		    				else
		    				{              
		    					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
		    					jQuery("#errorDiv").html(message);
		    				}
		    			},     
		    			function(errResponse)   
		    			{
		    				console.error('Error while fetching notes');
		    			});      
		    		};
		    	}
	      
	      
	      
	     	/* sending data*/
	      $scope.getLoginbefore11 = function(data)
		  {
		    			$http.post('/erp/manager/getLoginbefore11',data).then(function(response)
		    			{   
		    		    	$scope.data = response.data;                
		    				if($scope.data.successful)                                          
		    				{      	    					
		    					console.log($scope.data);  
		    					$scope.beforelogins  = $scope.data.responseObject.centers;
		    				}          
		    				else
		    				{              
		    					var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"+ $scope.data.errorMessage + "</div>";
		    					jQuery("#errorDiv").html(message);
		    				}
		    			},     
		    			function(errResponse)   
		    			{
		    				console.error('Error while fetching notes');
		    			});      
		    		};
		    	
	      
	     /* $http.get('/erp/manager/getLoginbefore11').then(function(response) {
  			$scope.data = response.data;
  			if($scope.data.successful)
  			{
  				
  				$scope.beforelogins = $scope.data.responseObject;
  				console.log($scope.beforelogins);
  				}     
  			else         
  			{
  				console.log("Client error while getting data");
  			}
  		},
  		function(response)
  		{
  			console.log("Server error while getting data");
  		});	*/
		    		 $scope.getLoginafter11 = function(data)
		   		  { 
	      $http.post('/erp/manager/getLoginafter11',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.afterlogins = $scope.data.responseObject.centers;
	  				console.log($scope.afterlogins);
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
}
		    		 $scope.getMissedLogin = function(data)
			   		  { 
	      $http.post('/erp/manager/getMissedLogin',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.missedlogins = $scope.data.responseObject.centers;
	  				console.log($scope.missedlogins);
	  				}     
	  			else         
	  			{
	  				console.log("Client error while getting data");
	  			}
	  		},
	  		function(response)
	  		{
	  			console.log("Server error while getting data");
	  		});	}
		    		 $scope.getAllReports = function(data)
			   		  { 
	      $http.post('/erp/manager/getAllReports',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.allreports = $scope.data.responseObject.centers;
	  				console.log($scope.allreports);
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
			   		  }
	      $http.get('/erp/report/getMonths').then(function(response) {
	  		$scope.data = response.data;
	  		if($scope.data.successful)
	  		{
	  			$scope.months = $scope.data.responseObject;
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
	      $scope.getLeavesReport = function(data)
   		  { 
	      $http.post('/erp/manager/getLeavesReport',data).then(function(response) {
	  			$scope.data = response.data;
	  			if($scope.data.successful)
	  			{
	  				
	  				$scope.leavesreports = $scope.data.responseObject.centers;
	  				console.log($scope.leavesreports);
	  				}     
	  			else         
	  			{
	  				console.log("Client error while getting data");
	  			}
	  		},
	  		function(response)
	  		{
	  			console.log("Server error while getting data");
	  		});	}
	      $scope.getByIdviewlogin = function(login_date){
				alert(login_date);
				console.log($scope.login_date);
				$http.post('/erp/manager/getByIdviewlogin', login_date).then(
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
			
} ]);