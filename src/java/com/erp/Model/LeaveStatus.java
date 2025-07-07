
package com.erp.Model;

import java.sql.Date;
import java.sql.Timestamp;

public class LeaveStatus{
	private static final long serialVersionUID = 1L;
	
	public String empid;
	public String first_name;
	public Integer mobile;
	public String email;
	public String description;
	public String grade_name;
	public String department_name;
	public String designation_name;
	public Integer designation_id;
	public Integer departmentid;
	public Integer caderid;
	public Integer gradeid;
public Timestamp created_date;
public Integer leave_nature;
public Date comp_date;
public Date requested_date;
public Date approved_date;
public Integer leavestatus;
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGrade_name() {
		return grade_name;
	}
	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(Integer designation_id) {
		this.designation_id = designation_id;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public Integer getCaderid() {
		return caderid;
	}
	public void setCaderid(Integer caderid) {
		this.caderid = caderid;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	
	/*getting Leavetype*/
	public Integer id;
	public String type;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String reporting_to;

	public String getReporting_to() {
		return reporting_to;
	}
	public void setReporting_to(String reporting_to) {
		this.reporting_to = reporting_to;
	}
	
	
	/*apply leave */
	public String emergency_number;
	public Date from_date;
	public String getEmergency_number() {
		return emergency_number;
	}
	public void setEmergency_number(String emergency_number) {
		this.emergency_number = emergency_number;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date to_date;
	public String reason;
	public Integer leave_type;
	public String file_name;
	
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public Integer getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(Integer leave_type) {
		this.leave_type = leave_type;
	}
	
	public Double no_days;

	public Double getNo_days() {
		return no_days;
	}
	public void setNo_days(Double no_days) {
		this.no_days = no_days;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public Integer getLeave_nature() {
		return leave_nature;
	}
	public void setLeave_nature(Integer leave_nature) {
		this.leave_nature = leave_nature;
	}
	public Date getComp_date() {
		return comp_date;
	}
	public void setComp_date(Date comp_date) {
		this.comp_date = comp_date;
	}
	public Date getRequested_date() {
		return requested_date;
	}
	public void setRequested_date(Date requested_date) {
		this.requested_date = requested_date;
	}
	public Date getApproved_date() {
		return approved_date;
	}
	public void setApproved_date(Date approved_date) {
		this.approved_date = approved_date;
	}
	public Integer getLeavestatus() {
		return leavestatus;
	}
	public void setLeavestatus(Integer leavestatus) {
		this.leavestatus = leavestatus;
	}
	
}
