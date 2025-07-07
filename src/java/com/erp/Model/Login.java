package com.erp.Model; 

import java.security.Timestamp;
import java.util.Date;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class Login extends BaseModel
{
	 
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String ipaddress;    
	private String logtime;        
	private Integer roleid;
	public String employee_id;
	public String email;
	public String login_date;
	public String login_time;
	public String logout_time;
	public boolean loggedin;
	public List<String> roles;
	
	
	private String empid;
	
	private Date created_date;   
	private String created_by;
	private List<Login> login;
	private List<Attendance> attendance;
	private Timestamp timestamp;
	private String selectedDate;   
	private Timestamp current_timestamp;
	private String date;
	private String login_latitude;
	private String login_longitude;
	private String login_ip;
	

	

	public String getLogin_date() {
		return login_date;
	}
	public void setLogin_date(String login_date) {
		this.login_date = login_date;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public void setLogout_time(String logout_time) {
		this.logout_time = logout_time;
	}
	public boolean isLoggedin() {
		return loggedin;
	}
	public void setLoggedin(boolean loggedin) {
		this.loggedin = loggedin;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}  

	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}

		public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

		public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword()
	{   
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}   

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Object getLogout_time() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public List<Login> getLogin() {
		return login;
	}
	public void setLogin(List<Login> login) {
		this.login = login;
	}
	public List<Attendance> getAttendance() {
		return attendance;
	}
	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getSelectedDate() {
		return selectedDate;
	}
	public void setSelectedDate(String selectedDate) {
		this.selectedDate = selectedDate;
	}
	public Timestamp getCurrent_timestamp() {
		return current_timestamp;
	}
	public void setCurrent_timestamp(Timestamp current_timestamp) {
		this.current_timestamp = current_timestamp;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}       
	public String getLogin_latitude() {
		return login_latitude;
	}
	public void setLogin_latitude(String login_latitude) {
		this.login_latitude = login_latitude;
	}
	public String getLogin_longitude() {
		return login_longitude;
	}
	public void setLogin_longitude(String login_longitude) {
		this.login_longitude = login_longitude;
	}
	public String getLogin_ip() {
		return login_ip;
	}
	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}	
	
	
	
}