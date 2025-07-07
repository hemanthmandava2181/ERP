package com.erp.Model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class EmployeeMaster {
	private static final long serialVersionUID = 1L;
	
	
	public String emptypename;
	 
	
	public String empid;
	public String first_name;
	public String mobile;
	public String email;
	public String description;       
	public String grade_name;
	public String department_name;
	public String designation_name;
	public Integer designation_id;
	public Integer departmentid;
	public Integer caderid;
	public Integer gradeid;
	public Date date;
	public boolean workingday;
	public Date login_date;
	public String emergency_number;
	public Double no_days;
	public String reason;
	public Integer leave_type;
	public String file_name;
	public String reporting_to;
	public String statusname;
	public String type;
	public String cader_name;
	public String employeetype;
	
	/* create hiring request add method */
	
	public Integer scheme_id;
	public Integer project_id;
	public Integer sector_id;
	public String position;
	public Integer position_number;
	public Integer divisionid;
	public String total_experience;
	public String relevent_experience;
	public String job_id;
	
	/* candidate Registration add1 method */
	
	/* public Integer position; */
	public String candidate_type;
	public String candidate_name;
	public Integer passout_year;
	public String experience;
	public Integer notice_period;
	public String coolingoff_period;	
	
	/* education and branches in candidate registration */
	
	public Integer education_id;
	public String education_name;
	public Integer branch_id;
	public String branch_name; 
	public String designation;
	public Date joining_date;
	public Date contract_end_date;
	public boolean status;
	public Integer status1;
	public Integer id;
	public String staff_type;	
	public Timestamp start_time;
	public Timestamp end_time;
	public Timestamp timesheetdate;
	public Timestamp created_date;
	public Date from_date;
	public Date to_date;
	
	/* Payslip */
	
	public String last_name;
	public String pan_no;
	public String bank_name;
	public String bank_acno;
	public String brach;
	public String ifsc_code;
	public String name;
	public Integer employee_type;
	public Date timesheet_date;
	public String task;
	public String location;	
	public String comments;	
	public String Month;
	public String contract_from;
	public String contract_to;
	
	
	public String fileName;
	public String base64String;
	public Integer leave_nature;
	
	public Integer flexicount;
	
	public String filepath;             
	
	public List<EmployeeMaster>uploadfiles;
	public String folderName;
	public String filePaths;
	public String[] filePathsArr;
	public List<FileModel> files;
	public String image;
	public String image1;
	
	
	
	
	
	
	
	
	
	public String getEmptypename() {
		return emptypename;
	}
	public void setEmptypename(String emptypename) {
		this.emptypename = emptypename;
	}
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isWorkingday() {
		return workingday;
	}
	public void setWorkingday(boolean workingday) {
		this.workingday = workingday;
	}
	public Date getLogin_date() {
		return login_date;
	}
	public void setLogin_date(Date login_date) {
		this.login_date = login_date;
	}
	public String getEmergency_number() {
		return emergency_number;
	}
	public void setEmergency_number(String emergency_number) {
		this.emergency_number = emergency_number;
	}
	public Double getNo_days() {
		return no_days;
	}
	public void setNo_days(Double no_days) {
		this.no_days = no_days;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(Integer leave_type) {
		this.leave_type = leave_type;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getReporting_to() {
		return reporting_to;
	}
	public void setReporting_to(String reporting_to) {
		this.reporting_to = reporting_to;
	}
	public String getStatusname() {
		return statusname;
	}
	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCader_name() {
		return cader_name;
	}
	public void setCader_name(String cader_name) {
		this.cader_name = cader_name;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	public void setEmployeetype(String employeetype) {
		this.employeetype = employeetype;
	}
	public Integer getScheme_id() {
		return scheme_id;
	}
	public void setScheme_id(Integer scheme_id) {
		this.scheme_id = scheme_id;
	}
	public Integer getProject_id() {
		return project_id;
	}
	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}
	public Integer getSector_id() {
		return sector_id;
	}
	public void setSector_id(Integer sector_id) {
		this.sector_id = sector_id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getPosition_number() {
		return position_number;
	}
	public void setPosition_number(Integer position_number) {
		this.position_number = position_number;
	}
	public Integer getDivisionid() {
		return divisionid;
	}
	public void setDivisionid(Integer divisionid) {
		this.divisionid = divisionid;
	}
	public String getTotal_experience() {
		return total_experience;
	}
	public void setTotal_experience(String total_experience) {
		this.total_experience = total_experience;
	}
	public String getRelevent_experience() {
		return relevent_experience;
	}
	public void setRelevent_experience(String relevent_experience) {
		this.relevent_experience = relevent_experience;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getCandidate_type() {
		return candidate_type;
	}
	public void setCandidate_type(String candidate_type) {
		this.candidate_type = candidate_type;
	}
	public String getCandidate_name() {
		return candidate_name;
	}
	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}
	public Integer getPassout_year() {
		return passout_year;
	}
	public void setPassout_year(Integer passout_year) {
		this.passout_year = passout_year;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Integer getNotice_period() {
		return notice_period;
	}
	public void setNotice_period(Integer notice_period) {
		this.notice_period = notice_period;
	}
	public String getCoolingoff_period() {
		return coolingoff_period;
	}
	public void setCoolingoff_period(String coolingoff_period) {
		this.coolingoff_period = coolingoff_period;
	}
	public Integer getEducation_id() {
		return education_id;
	}
	public void setEducation_id(Integer education_id) {
		this.education_id = education_id;
	}
	public String getEducation_name() {
		return education_name;
	}
	public void setEducation_name(String education_name) {
		this.education_name = education_name;
	}
	public Integer getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}
	public Date getContract_end_date() {
		return contract_end_date;
	}
	public void setContract_end_date(Date contract_end_date) {
		this.contract_end_date = contract_end_date;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Integer getStatus1() {
		return status1;
	}
	public void setStatus1(Integer status1) {
		this.status1 = status1;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStaff_type() {
		return staff_type;
	}
	public void setStaff_type(String staff_type) {
		this.staff_type = staff_type;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}
	public Timestamp getTimesheetdate() {
		return timesheetdate;
	}
	public void setTimesheetdate(Timestamp timesheetdate) {
		this.timesheetdate = timesheetdate;
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
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_acno() {
		return bank_acno;
	}
	public void setBank_acno(String bank_acno) {
		this.bank_acno = bank_acno;
	}
	public String getBrach() {
		return brach;
	}
	public void setBrach(String brach) {
		this.brach = brach;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(Integer employee_type) {
		this.employee_type = employee_type;
	}
	public Date getTimesheet_date() {
		return timesheet_date;
	}
	public void setTimesheet_date(Date timesheet_date) {
		this.timesheet_date = timesheet_date;
	}
	public String getTask() {
		return task;
	}     
	public void setTask(String task) {
		this.task = task;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public String getContract_from() {
		return contract_from;
	}
	public void setContract_from(String contract_from) {
		this.contract_from = contract_from;
	}
	public String getContract_to() {
		return contract_to;
	}
	public void setContract_to(String contract_to) {
		this.contract_to = contract_to;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public String cader;
	public String grade;
	public String company_email;
	public Date relieved_date;
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
	public String getCompany_email() {
		return company_email;
	}
	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}
	public Date getRelieved_date() {
		return relieved_date;
	}
	public void setRelieved_date(Date relieved_date) {
		this.relieved_date = relieved_date;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getBase64String() {
		return base64String;
	}
	public void setBase64String(String base64String) {
		this.base64String = base64String;
	}
	public Integer getLeave_nature() {
		return leave_nature;
	}
	public void setLeave_nature(Integer leave_nature) {
		this.leave_nature = leave_nature;
	}
	public Integer getFlexicount() {
		return flexicount;
	}
	public void setFlexicount(Integer flexicount) {
		this.flexicount = flexicount;
	}
	
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public List<EmployeeMaster> getUploadfiles() {
		return uploadfiles;
	}
	public void setUploadfiles(List<EmployeeMaster> uploadfiles) {
		this.uploadfiles = uploadfiles;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public String getFilePaths() {
		return filePaths;
	}
	public void setFilePaths(String filePaths) {
		this.filePaths = filePaths;
	}
	public String[] getFilePathsArr() {
		return filePathsArr;
	}
	public void setFilePathsArr(String[] filePathsArr) {
		this.filePathsArr = filePathsArr;
	}
	public List<FileModel> getFiles() {
		return files;
	}
	public void setFiles(List<FileModel> files) {
		this.files = files;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	
	
	
	


	
	
	
	
	
	    
	
	
}
