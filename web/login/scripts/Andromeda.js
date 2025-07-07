var Andromeda = {

	showPage : function(path, targetDiv) {
		var jqxhr = jQuery.post(path, function(data) {
			jQuery("#" + targetDiv).html(data);
		});
	},
	
	
	showLoginPage : function() {  
		var path = "/erp/login/html/login.html";
		Andromeda.showPage(path, "mainDiv");   
	},
	showEmployeeHomePage : function() {  
		var path = "/erp/dashboard/EmpHome.html";     
		Andromeda.showPage(path, "mainDiv");
	},  
	showAdminHomePage : function() {  
		var path = "/erp/dashboard/AdminHome.html";   
		Andromeda.showPage(path, "mainDiv");
	},
	      
	showHRHomePage : function() {        
		var path = "/erp/dashboard/HRHome.html";     
		Andromeda.showPage(path, "mainDiv");
	},
		                   
	setSessionValue : function(key, value) {
		sessionStorage.setItem(key, value);
	},

	getSessionValue : function(key) {
		return sessionStorage.getItem(key);
	},

	removeSessionValue : function(key) {
		sessionStorage.removeItem(key);    
	},

	showError : function(errorMessage) {
		var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
				+ errorMessage + "</div>";
		jQuery("#errorDiv").html(message);
	},                       
                                                         
	logout : function() {
		
		var employeeid = Andromeda.getSessionValue("employeeid") || "";
		Andromeda.setSessionValue("email", null);
		Andromeda.setSessionValue("password", null);
		Andromeda.setSessionValue("roleid", null);
		Andromeda.setSessionValue("username", null);
		Andromeda.post('/erp/login/logout', employeeid);
		Andromeda.setSessionValue("employeeid", null);
		Andromeda.showLoginPage();
	},

	post : function(url, data) {
		var responseData = null;
         
		jQuery.ajax({
			url : url,
			type : 'post',
			data : JSON.stringify(data), // Stringified Json Object
			dataType : 'json',
			async : false, // Cross-domain requests and dataType: "jsonp"
			// requests do not support synchronous operation
			cache : false, // This will force requested pages not to be cached
			// by the browser
			processData : false, // To avoid making query String instead of
			// JSON
			contentType : "application/json; charset=utf-8",
			success : function(data) {
				responseData = data;
			}
		});

		return responseData;
	},

	isUserLoggedIn : function() {
		
		var email = Andromeda.getSessionValue("email") || "";
		var password = Andromeda.getSessionValue("password") || "";
		var roleid = Andromeda.getSessionValue("roleid") || "";
		var username = Andromeda.getSessionValue("username") || "";
		var employeeid = Andromeda.getSessionValue("employeeid") || "";
		var login = {
			email : email,
			password : password,   
			roleid : roleid,
			username:username,
			employeeid : employeeid,
		};    
   
		return Andromeda.post('/erp/login/loggedin', login) || false;
	}  	
};
