package com.erp.Model;

public class AttendanceReport {
	private String empid;
	private String login_date;
	private String login_time;
	private String logout_time;
	private String from_date;
	private String to_date;  
	
	
	private String getEmpid() {
		return empid;
	}
	private void setEmpid(String empid) {
		this.empid = empid;  
	}
	private String getLogin_date() {
		return login_date;
	}
	private void setLogin_date(String login_date) {
		this.login_date = login_date;
	}
	private String getLogin_time() {
		return login_time;
	}
	private void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	private String getLogout_time() {
		return logout_time;
	}
	private void setLogout_time(String logout_time) {
		this.logout_time = logout_time;
	}
	
	private String getFrom_date() {
		return from_date;
	}
	private void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	private String getTo_date() {
		return to_date;
	}
	private void setTo_date(String to_date) {
		this.to_date = to_date;
	}


}
