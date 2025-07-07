package com.erp.Model;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

public class Selfservices {

public Integer request_statusid;
 public String request_id ;
public Integer request_categoryid ;
public Integer request_typeid;
public String request_statusname;
public String request_typename;
public String description ;  
public String emp_docpath ;
public String emp_comments ;
public String hr_comments ;
public String hr_docpath ;
public Integer assigned_to ;
public Integer request_status ;
public String  name;
public Integer helpdesk_categoryid;
public boolean status; 
public Integer id;       
public String created_by; 
public String approval_by; 
public Timestamp createddate ;
public String first_name;
public String middle_name;
public String last_name; 
public String fullname;
public String empid;
//public Integer reporting_to ;
public Date start_date;
public Date end_date;
/*public Integer onduty_reporting_to; */
public String onduty_reporting_to; 
public String  nature_of_assignment;
public String  location; 
public String project; 
public BigInteger onduty_contact;
public Integer onduty_request_status ;
public String  comments; 
public Timestamp created_date ;
public String project_name;
/*public Integer ontravel_reporting_to;*/
public String ontravel_reporting_to;
public BigInteger ontravel_contact;
public Integer ontravel_request_status; 
public String reporting_to;
public Timestamp current_timestamp;
public String type;

public Date resignation_date;
public String notice_period;
public Date relieving_date;
public String desired_notice_period;
public String reason;

public Date rm_date; 
public Date hod_date;
public Integer reportstatus;
public String exit_id ;
public Integer notification ;
public String reliving_document; 
public String relieving_ds_document ;
public String exp_document; 
public String exp_ds_document;
public String exp_letter_status;
public String emp_notice_period;
public String breachofcontract; 
public String employee_hold; 
public String exit_status; 
public String hr_desired_notice_period;
   
  

public Date getRm_date() {
	return rm_date;
}
public void setRm_date(Date rm_date) {
	this.rm_date = rm_date;
}
public Date getHod_date() {
	return hod_date;
}
public void setHod_date(Date hod_date) {
	this.hod_date = hod_date;
}
public Integer getReportstatus() {
	return reportstatus;
}
public void setReportstatus(Integer reportstatus) {
	this.reportstatus = reportstatus;
}
public String getExit_id() {
	return exit_id;
}
public void setExit_id(String exit_id) {
	this.exit_id = exit_id;
}
public Integer getNotification() {
	return notification;
}
public void setNotification(Integer notification) {
	this.notification = notification;
}
public String getReliving_document() {
	return reliving_document;
}
public void setReliving_document(String reliving_document) {
	this.reliving_document = reliving_document;
}
public String getRelieving_ds_document() {
	return relieving_ds_document;
}
public void setRelieving_ds_document(String relieving_ds_document) {
	this.relieving_ds_document = relieving_ds_document;
}
public String getExp_document() {
	return exp_document;
}
public void setExp_document(String exp_document) {
	this.exp_document = exp_document;
}
public String getExp_ds_document() {
	return exp_ds_document;
}
public void setExp_ds_document(String exp_ds_document) {
	this.exp_ds_document = exp_ds_document;
}
public String getExp_letter_status() {
	return exp_letter_status;
}
public void setExp_letter_status(String exp_letter_status) {
	this.exp_letter_status = exp_letter_status;
}
public String getEmp_notice_period() {
	return emp_notice_period;
}
public void setEmp_notice_period(String emp_notice_period) {
	this.emp_notice_period = emp_notice_period;
}
public String getBreachofcontract() {
	return breachofcontract;
}
public void setBreachofcontract(String breachofcontract) {
	this.breachofcontract = breachofcontract;
}
public String getEmployee_hold() {
	return employee_hold;
}
public void setEmployee_hold(String employee_hold) {
	this.employee_hold = employee_hold;
}
public String getExit_status() {
	return exit_status;
}
public void setExit_status(String exit_status) {
	this.exit_status = exit_status;
}
public String getHr_desired_notice_period() {
	return hr_desired_notice_period;
}
public void setHr_desired_notice_period(String hr_desired_notice_period) {
	this.hr_desired_notice_period = hr_desired_notice_period;
}
public Date getResignation_date() {
	return resignation_date;
}
public void setResignation_date(Date resignation_date) {
	this.resignation_date = resignation_date;
}
public String getNotice_period() {
	return notice_period;
}
public void setNotice_period(String notice_period) {
	this.notice_period = notice_period;
}
public Date getRelieving_date() {
	return relieving_date;
}
public void setRelieving_date(Date relieving_date) {
	this.relieving_date = relieving_date;
}
public String getDesired_notice_period() {
	return desired_notice_period;
}
public void setDesired_notice_period(String desired_notice_period) {
	this.desired_notice_period = desired_notice_period;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}


 public String employeeid;
 
public String getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(String employeeid) {
	this.employeeid = employeeid;
}
public BigInteger getOntravel_contact() {
	return ontravel_contact;
}
public Timestamp getCurrent_timestamp() {
	return current_timestamp;
}
public void setCurrent_timestamp(Timestamp current_timestamp) {
	this.current_timestamp = current_timestamp;
}
public String getOntravel_reporting_to() {
	return ontravel_reporting_to;
}
public void setOntravel_reporting_to(String ontravel_reporting_to) {
	this.ontravel_reporting_to = ontravel_reporting_to;
}
public void setOntravel_contact(BigInteger ontravel_contact) {
	this.ontravel_contact = ontravel_contact;
}
public Integer getOntravel_request_status() {
	return ontravel_request_status;
}
public void setOntravel_request_status(Integer ontravel_request_status) {
	this.ontravel_request_status = ontravel_request_status;
}
public String getProject_name() {
	return project_name;
}
public void setProject_name(String project_name) {
	this.project_name = project_name;
}

public String getReporting_to() {
	return reporting_to;
}
public void setReporting_to(String reporting_to) {
	this.reporting_to = reporting_to;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
//public Integer getReporting_to() {
//	return reporting_to;
//}
//public void setReporting_to(Integer reporting_to) {
//	this.reporting_to = reporting_to;
//}
public Date getStart_date() {
	return start_date;
}
public void setStart_date(Date start_date) {
	this.start_date = start_date;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}
/*public Integer getOnduty_reporting_to() {
	return onduty_reporting_to;
}
public void setOnduty_reporting_to(Integer onduty_reporting_to) {
	this.onduty_reporting_to = onduty_reporting_to;
}*/

public String getNature_of_assignment() {
	return nature_of_assignment;
}
public String getOnduty_reporting_to() {
	return onduty_reporting_to;
}
public void setOnduty_reporting_to(String onduty_reporting_to) {
	this.onduty_reporting_to = onduty_reporting_to;
}
public void setNature_of_assignment(String nature_of_assignment) {
	this.nature_of_assignment = nature_of_assignment;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
public BigInteger getOnduty_contact() {
	return onduty_contact;
}
public void setOnduty_contact(BigInteger onduty_contact) {
	this.onduty_contact = onduty_contact;
}
public Integer getOnduty_request_status() {
	return onduty_request_status;
}
public void setOnduty_request_status(Integer onduty_request_status) {
	this.onduty_request_status = onduty_request_status;    
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}   
public Timestamp getCreated_date() {
	return created_date;
}
public void setCreated_date(Timestamp created_date) {
	this.created_date = created_date;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getMiddle_name() {
	return middle_name;
}
public void setMiddle_name(String middle_name) {
	this.middle_name = middle_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public Integer getRequest_statusid() {
	return request_statusid;
}
public void setRequest_statusid(Integer request_statusid) {
	this.request_statusid = request_statusid;
}
public String getRequest_statusname() {
	return request_statusname;
}
public void setRequest_statusname(String request_statusname) {
	this.request_statusname = request_statusname;
}
public String getRequest_typename() {
	return request_typename;
}
public void setRequest_typename(String request_typename) {
	this.request_typename = request_typename;
}
public Integer getRequest_typeid() {
	return request_typeid;
}
public void setRequest_typeid(Integer request_typeid) {
	this.request_typeid = request_typeid;
}

public String getCreated_by() {
	return created_by;
}
public void setCreated_by(String created_by) {
	this.created_by = created_by;
}
public String getApproval_by() {
	return approval_by;
}
public void setApproval_by(String approval_by) {
	this.approval_by = approval_by;
}
public Timestamp getCreateddate() {
	return createddate;
}
public void setCreateddate(Timestamp createddate) {
	this.createddate = createddate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getHelpdesk_categoryid() {
	return helpdesk_categoryid;
}
public void setHelpdesk_categoryid(Integer helpdesk_categoryid) {
	this.helpdesk_categoryid = helpdesk_categoryid;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRequest_id() {
	return request_id;
}
public void setRequest_id(String request_id) {
	this.request_id = request_id;
}
public Integer getRequest_categoryid() {
	return request_categoryid;
}
public void setRequest_categoryid(Integer request_categoryid) {
	this.request_categoryid = request_categoryid;
}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getEmp_docpath() {
	return emp_docpath;
}
public void setEmp_docpath(String emp_docpath) {
	this.emp_docpath = emp_docpath;
}
public String getEmp_comments() {
	return emp_comments;
}
public void setEmp_comments(String emp_comments) {
	this.emp_comments = emp_comments;
}
public String getHr_comments() {
	return hr_comments;
}
public void setHr_comments(String hr_comments) {
	this.hr_comments = hr_comments;
}
public String getHr_docpath() {
	return hr_docpath;
}
public void setHr_docpath(String hr_docpath) {
	this.hr_docpath = hr_docpath;
}
public Integer getAssigned_to() {
	return assigned_to;
}
public void setAssigned_to(Integer assigned_to) {
	this.assigned_to = assigned_to;
}
public Integer getRequest_status() {
	return request_status;
}
public void setRequest_status(Integer request_status) {
	this.request_status = request_status;
}




}