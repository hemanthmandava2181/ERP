
package com.erp.Model;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import com.andromeda.commons.model.BaseModel;
      
public class Manager extends BaseModel {

	private static long serialVersionUID = 1L;

	public String empid;
	/*public String leave_type;  */
	public String leave_nature;
	/*public String leavestatus;*/
	public Date from_date;
	public Date to_date;
	public String first_name;
	public String last_name;
	public String employeename;
	/*public Integer cader;
	public Integer grade;
	public Integer designation;
	public Integer department;*/
	public Timestamp created_date;
public Timestamp login_time;
public String name;
public Integer division;
public Integer cost_center; 
public Integer employee_type;
public  Date login_date; 
public Timestamp logout_time; 
public String login_ip; 
public String logout_ip; 
public String grade_name;
public String location;
public String  cader_name;
public String description;
public String department_name;
public String designation_name;
public String staff_type;
public String location_name;
public String cader;
public String grade;
public String department;
public String designation;
public String employeetype;
public BigInteger logincount;
public Integer leave_type;
public String approval_by;
public String reason;
public Integer leavestatus;
public Date approved_date;
public Timestamp current_timestamp;

public Timestamp getCurrent_timestamp() {
	return current_timestamp;
}
public void setCurrent_timestamp(Timestamp current_timestamp) {
	this.current_timestamp = current_timestamp;
}
public Date getApproved_date() {
	return approved_date;
}
public void setApproved_date(Date approved_date) {
	this.approved_date = approved_date;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public BigInteger getLogincount() {
	return logincount;
}
public void setLogincount(BigInteger logincount) {
	this.logincount = logincount;
}
public Integer getEmployee_type() {
	return employee_type;
}
public void setEmployee_type(Integer employee_type) {
	this.employee_type = employee_type;
}
/*public void setCader(Integer cader) {
	this.cader = cader;
}
public void setGrade(Integer grade) {
	this.grade = grade;
}
public void setDesignation(Integer designation) {
	this.designation = designation;
}
public void setDepartment(Integer department) {
	this.department = department;
}*/
public Timestamp getLogin_time() {
	return login_time;
}
public void setLogin_time(Timestamp login_time) {
	this.login_time = login_time;
}
public Timestamp getLogout_time() {
	return logout_time;
}
public void setLogout_time(Timestamp logout_time) {
	this.logout_time = logout_time;
}
public String getEmployeetype() {
	return employeetype;
}
public void setEmployeetype(String employeetype) {
	this.employeetype = employeetype;
}
public static long getSerialVersionUID() {
	return serialVersionUID;
}
public static void setSerialVersionUID(long serialVersionUID) {
	Manager.serialVersionUID = serialVersionUID;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
/*public String getLeave_type() {
	return leave_type;
}
public void setLeave_type(String leave_type) {
	this.leave_type = leave_type;
}*/
public String getLeave_nature() {
	return leave_nature;
}
public void setLeave_nature(String leave_nature) {
	this.leave_nature = leave_nature;
}
/*public String getLeavestatus() {
	return leavestatus;
}
public void setLeavestatus(String leavestatus) {
	this.leavestatus = leavestatus;
}*/
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
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public Timestamp getCreated_date() {
	return created_date;
}
public void setCreated_date(Timestamp created_date) {
	this.created_date = created_date;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getDivision() {
	return division;
}
public void setDivision(Integer division) {
	this.division = division;
}
public Integer getCost_center() {
	return cost_center;
}
public void setCost_center(Integer cost_center) {
	this.cost_center = cost_center;
}
public Date getLogin_date() {
	return login_date;
}
public void setLogin_date(Date login_date) {
	this.login_date = login_date;
}

public String getLogin_ip() {
	return login_ip;
}
public void setLogin_ip(String login_ip) {
	this.login_ip = login_ip;
}
public String getLogout_ip() {
	return logout_ip;
}
public void setLogout_ip(String logout_ip) {
	this.logout_ip = logout_ip;
}
public String getGrade_name() {
	return grade_name;
}
public void setGrade_name(String grade_name) {
	this.grade_name = grade_name;
}
public String getCader_name() {
	return cader_name;
}
public void setCader_name(String cader_name) {
	this.cader_name = cader_name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public String getDesignation_name() {
	return designation_name;
}
public void setDesignation_name(String designation_name) {
	this.designation_name = designation_name;
}
public String getStaff_type() {
	return staff_type;
}
public void setStaff_type(String staff_type) {
	this.staff_type = staff_type;
}
public String getLocation_name() {
	return location_name;
}
public void setLocation_name(String location_name) {
	this.location_name = location_name;
}
public String getCader() {
	return cader;
}
public void setCader(String cader) {
	this.cader = cader;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Integer getLeave_type() {
	return leave_type;
}
public void setLeave_type(Integer leave_type) {
	this.leave_type = leave_type;
}
public String getApproval_by() {
	return approval_by;
}
public void setApproval_by(String approval_by) {
	this.approval_by = approval_by;
}
public String getReason() {
	return reason;
}    
public void setReason(String reason) {
	this.reason = reason;
}
public Integer getLeavestatus() {
	return leavestatus;
}
public void setLeavestatus(Integer leavestatus) {
	this.leavestatus = leavestatus;
}


}

