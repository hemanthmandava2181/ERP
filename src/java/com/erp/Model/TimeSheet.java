
package com.erp.Model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import com.andromeda.commons.model.BaseModel;
      
public class TimeSheet extends BaseModel {

	private static long serialVersionUID = 1L;
	public String task;
	public String empid;
	public String location;  
	public String description;             
	public Date from_date;
	public Date to_date;
	public String first_name;
	public String last_name;
	public String employeename;
	public String  timesheet_date; 
	 public String  start_time; 
	  public String  end_time; 
	  public String  duration; 
	public Integer status ;
	public Timestamp  created_date; 
	public Timestamp current_timestamp;
	

	public Timestamp getCurrent_timestamp() {
		return current_timestamp;
	}
	public void setCurrent_timestamp(Timestamp current_timestamp) {
		this.current_timestamp = current_timestamp;
	}
	public String staff_type;
	public Integer id;    
	
	/* getting data to table in attendance sheet */

	private Double total_leaves;
	private Double used_leaves;
	private Double no_of_holidays;    
	private Integer count;   
	public Date login_date;
	public String login_time;

	public boolean workingday;
	public String presence;

	public Integer reporting_to;
	public Integer employee_type;
	public String name;	
	/* apply leave page */
	public String type;
	public Integer calendar_year;
	public Integer leave_type;
	public String session;
	public String logout_time;	
	public Integer year_id;
	public Integer year;
	public String holiday_type;
	public String holiday_name;
	public String day;
	
	private Integer cader;
	private Integer grade;
	private Integer leave_nature;
	private Integer designation;
	private Integer department;
	private Integer leve_type;
	private String approval_by;
	private String reason;
	public Date date;
	public Date absent_date;
	
	
	public String getStaff_type() {
		return staff_type;
	}
	public void setStaff_type(String staff_type) {
		this.staff_type = staff_type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getTotal_leaves() {
		return total_leaves;
	}
	public void setTotal_leaves(Double total_leaves) {
		this.total_leaves = total_leaves;
	}
	public Double getUsed_leaves() {
		return used_leaves;
	}
	public void setUsed_leaves(Double used_leaves) {
		this.used_leaves = used_leaves;
	}
	public Double getNo_of_holidays() {
		return no_of_holidays;
	}
	public void setNo_of_holidays(Double no_of_holidays) {
		this.no_of_holidays = no_of_holidays;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getLogin_date() {
		return login_date;
	}
	public void setLogin_date(Date login_date) {
		this.login_date = login_date;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public boolean isWorkingday() {
		return workingday;
	}
	public void setWorkingday(boolean workingday) {
		this.workingday = workingday;
	}
	public String getPresence() {
		return presence;
	}
	public void setPresence(String presence) {
		this.presence = presence;
	}
	public Integer getReporting_to() {
		return reporting_to;
	}
	public void setReporting_to(Integer reporting_to) {
		this.reporting_to = reporting_to;
	}
	public Integer getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(Integer employee_type) {
		this.employee_type = employee_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getCalendar_year() {
		return calendar_year;
	}
	public void setCalendar_year(Integer calendar_year) {
		this.calendar_year = calendar_year;
	}
	public Integer getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(Integer leave_type) {
		this.leave_type = leave_type;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getLogout_time() {
		return logout_time;
	}
	public void setLogout_time(String logout_time) {
		this.logout_time = logout_time;
	}
	public Integer getYear_id() {
		return year_id;
	}
	public void setYear_id(Integer year_id) {
		this.year_id = year_id;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getHoliday_type() {
		return holiday_type;
	}
	public void setHoliday_type(String holiday_type) {
		this.holiday_type = holiday_type;
	}
	public String getHoliday_name() {
		return holiday_name;
	}
	public void setHoliday_name(String holiday_name) {
		this.holiday_name = holiday_name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Integer getCader() {
		return cader;
	}
	public void setCader(Integer cader) {
		this.cader = cader;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getLeave_nature() {
		return leave_nature;
	}
	public void setLeave_nature(Integer leave_nature) {
		this.leave_nature = leave_nature;
	}
	public Integer getDesignation() {
		return designation;
	}
	public void setDesignation(Integer designation) {
		this.designation = designation;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	public Integer getLeve_type() {
		return leve_type;
	}
	public void setLeve_type(Integer leve_type) {
		this.leve_type = leve_type;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getAbsent_date() {
		return absent_date;
	}
	public void setAbsent_date(Date absent_date) {
		this.absent_date = absent_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		TimeSheet.serialVersionUID = serialVersionUID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getTimesheet_date() {
		return timesheet_date;
	}
	public void setTimesheet_date(String timesheet_date) {
		this.timesheet_date = timesheet_date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	
	
}
