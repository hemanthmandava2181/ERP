package com.erp.Model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class AttendanceSummary {
	private static long serialVersionUID = 1L;
	
	public String empid;
    public String attendance_status;
    public Date login_date;
    public Time login_time;
    public Time logout_time;
	public Timestamp created_date;
	public Date from_date;
	public Date to_date;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		AttendanceSummary.serialVersionUID = serialVersionUID;
	}
	public String getAttendance_status() {
		return attendance_status;
	}
	public void setAttendance_status(String attendance_status) {
		this.attendance_status = attendance_status;
	}
	public Date getLogin_date() {
		return login_date;
	}
	public void setLogin_date(Date login_date) {
		this.login_date = login_date;
	}
	
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public Time getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Time login_time) {
		this.login_time = login_time;
	}
	public Time getLogout_time() {
		return logout_time;
	}
	public void setLogout_time(Time logout_time) {
		this.logout_time = logout_time;
	}
	
	
	
	
}
