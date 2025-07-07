package com.erp.Model;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
public class LeavesReport {
	private static long serialVersionUID = 1L;
	public String  employeename;
	public String  empid;
	public String  first_name;
	public String  grade_name;
	public String description;
	public String  department_name;
	public String  designation_name;
	public Integer designation_id;
	public Integer departmentid;       
	public Integer caderid;            
	public Integer gradeid;
	public Integer designation;
	public Integer department;
	public Integer cader;
	public Integer grade;
	public String  reporting_to;
	public Integer leave_type;
	public String leavetype;
	public Integer leave_nature ;
	public String  approval_by;
	public String  reason;
	public Integer leavestatus;
	public String leavestatusdata;
	public Date    comp_date;
	public Date  from_date;
	public Date  to_date;
	public Timestamp created_date;
	public BigInteger count;
	public BigInteger empid1;
	public Integer quarter;
	public String quarter_name; 
	public Integer id;
	public String name;
	public String financialyear;
	public String  approved_by;
	public String type;
	public Integer useddays;
	public Integer maxdays;
	public Integer maxleaves;
	public Integer workdays;
	public Integer applicabledays;
	public String value;
	public Integer month;
	public Integer year_id;
	 public Integer monthid;
	 public Integer financial_year;
	 public Double ctc;
		
		public Integer lop_days;
		
		public Double amount;
		public Integer payroll_id;
		public Integer quarter_id;
		public String payroll_month;
		public Integer calendar_year;
		 public double total_leaves;
		 public double used_leaves;
		 public double leaves_availed;
		 public double  leave_encashed ;
		 public double  leaves_forwarded ;
		 public double   basic_salary;
		 public double  special_allowance ;
		 
		 public double encashed_amount;
		 
		 public Integer encashed_status;
		 
		 public String status;
		 
		 public String title;
			
			public String middle_name;
			public String last_name;
			public String mobile;
			public String alternate_mobile;
			public Date dob;  
			public Date birthday_date;
			public String gender;
			public String email;
			public String aadhaar;
			public String passport;                           
			public String photo_path;  
			public String nativity;
			public String nationality;
			public Integer caste;   
			public String sub_caste;
			public String blood_group;
			public String emergency_name;
			public BigInteger emergency_contact;
			public String relation;
			public String city;
			public String city1;
			public String state;
			public String state1;
			public String country;
			public String country1;
			public String street;
			public String street1;
			public String pincode;
			public String pincode1;
			public String present_address;
			public String permanent_address;

			public String created_by;
			
			public String bank_name ;
			public String  branch ;
			public String ifsc_code ;
			public String bank_acno ;
			public String pan_name ;
			public String  pan_no ;
			public String  esi_no ;
			public String  uan_no ;
			public String  pf_no;
			public String  cfms_code ;
			public String  pan_path ;
			public String  bank_passbook_path; 
		
			
			public String 	company_email ;
		
			public Date  joining_date;
			public Date   confirmed_date ;
			public Date   contract_from;
			public Date   contract_to;
			public Date   relieved_date;
			
			public Integer  division;
			public Integer  cost_center;
			public Integer  employee_type ;
		
			public Integer  notice_period ;
		
			public String dno;
			
			public String village;
			public String mandal;
			public Integer districtid;
			
			
			public String brach;
			
			public String payment_mode;
			public Date effective_date;
			public String fullname;
			public Integer contract_duration;
			public String comapny_empid;
			public String company_designation;	
			/* attendance and time sheet */
			public String timesheet_date;
			public String location;
			public String task;     
		
			public String start_time;
			public String end_time;
			/* Location */	

			public String location_name;
			public Integer reporting;
			/* project employee mapping getting all employees */	
			public String full_name;
			public String cader_name;
		
			public String email_id;
			public String emp_id;
			public BigInteger beneficiary_code;

			public Integer designationid;
			public Integer divisionid;
			public Integer cost_centerid;
		
			public String dob1;
			public Integer relationid;
			public String company_name; 
			
			
			public String document_name;
			public Boolean consent;
			
			public BigInteger phone;
			public String staff_type;
			public Integer ctc_calculator;
			
			
			public String scheme_id;
			public String scheme_name;
			public String project_id;
			public String project_name;
			public String sector_id;
			public String sector_name;

			
			public Integer institute_id;
			public String institute_name;
			public Integer qualification_id;
			public String qualification_name;
			public String highest_qualification;
			public String highest_qualifications;
			public String score;
			public Integer passout_year;
			public Integer passout_years;
			public Double cgpa;
			public Double cgpas;
			public String grades;
			public String gradess;
			public Double percentage;
			public Double percentages;
			public Integer project;
			public String institute;
			public String projectname;
			public String locationname;
			public Integer duration;
			public String login_time;
			public String logout_time;
			public Integer payslip_heads;
			public String ctcname;
			public String[] roles;
			public String role_name;
			public static long getSerialVersionUID() {
				return serialVersionUID;
			}
			public static void setSerialVersionUID(long serialVersionUID) {
				LeavesReport.serialVersionUID = serialVersionUID;
			}
			public String getEmployeename() {
				return employeename;
			}
			public void setEmployeename(String employeename) {
				this.employeename = employeename;
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
			public String getGrade_name() {
				return grade_name;
			}
			public void setGrade_name(String grade_name) {
				this.grade_name = grade_name;
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
			public String getReporting_to() {
				return reporting_to;
			}
			public void setReporting_to(String reporting_to) {
				this.reporting_to = reporting_to;
			}
			public Integer getLeave_type() {
				return leave_type;
			}
			public void setLeave_type(Integer leave_type) {
				this.leave_type = leave_type;
			}
			public String getLeavetype() {
				return leavetype;
			}
			public void setLeavetype(String leavetype) {
				this.leavetype = leavetype;
			}
			public Integer getLeave_nature() {
				return leave_nature;
			}
			public void setLeave_nature(Integer leave_nature) {
				this.leave_nature = leave_nature;
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
			public String getLeavestatusdata() {
				return leavestatusdata;
			}
			public void setLeavestatusdata(String leavestatusdata) {
				this.leavestatusdata = leavestatusdata;
			}
			public Date getComp_date() {
				return comp_date;
			}
			public void setComp_date(Date comp_date) {
				this.comp_date = comp_date;
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
			public Timestamp getCreated_date() {
				return created_date;
			}
			public void setCreated_date(Timestamp created_date) {
				this.created_date = created_date;
			}
			public BigInteger getCount() {
				return count;
			}
			public void setCount(BigInteger count) {
				this.count = count;
			}
			public BigInteger getEmpid1() {
				return empid1;
			}
			public void setEmpid1(BigInteger empid1) {
				this.empid1 = empid1;
			}
			public Integer getQuarter() {
				return quarter;
			}
			public void setQuarter(Integer quarter) {
				this.quarter = quarter;
			}
			public String getQuarter_name() {
				return quarter_name;
			}
			public void setQuarter_name(String quarter_name) {
				this.quarter_name = quarter_name;
			}
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getFinancialyear() {
				return financialyear;
			}
			public void setFinancialyear(String financialyear) {
				this.financialyear = financialyear;
			}
			public String getApproved_by() {
				return approved_by;
			}
			public void setApproved_by(String approved_by) {
				this.approved_by = approved_by;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public Integer getUseddays() {
				return useddays;
			}
			public void setUseddays(Integer useddays) {
				this.useddays = useddays;
			}
			public Integer getMaxdays() {
				return maxdays;
			}
			public void setMaxdays(Integer maxdays) {
				this.maxdays = maxdays;
			}
			public Integer getMaxleaves() {
				return maxleaves;
			}
			public void setMaxleaves(Integer maxleaves) {
				this.maxleaves = maxleaves;
			}
			public Integer getWorkdays() {
				return workdays;
			}
			public void setWorkdays(Integer workdays) {
				this.workdays = workdays;
			}
			public Integer getApplicabledays() {
				return applicabledays;
			}
			public void setApplicabledays(Integer applicabledays) {
				this.applicabledays = applicabledays;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
			public Integer getMonth() {
				return month;
			}
			public void setMonth(Integer month) {
				this.month = month;
			}
			public Integer getYear_id() {
				return year_id;
			}
			public void setYear_id(Integer year_id) {
				this.year_id = year_id;
			}
			public Integer getMonthid() {
				return monthid;
			}
			public void setMonthid(Integer monthid) {
				this.monthid = monthid;
			}
			public Integer getFinancial_year() {
				return financial_year;
			}
			public void setFinancial_year(Integer financial_year) {
				this.financial_year = financial_year;
			}
			public Double getCtc() {
				return ctc;
			}
			public void setCtc(Double ctc) {
				this.ctc = ctc;
			}
			public Integer getLop_days() {
				return lop_days;
			}
			public void setLop_days(Integer lop_days) {
				this.lop_days = lop_days;
			}
			public Double getAmount() {
				return amount;
			}
			public void setAmount(Double amount) {
				this.amount = amount;
			}
			public Integer getPayroll_id() {
				return payroll_id;
			}
			public void setPayroll_id(Integer payroll_id) {
				this.payroll_id = payroll_id;
			}
			public Integer getQuarter_id() {
				return quarter_id;
			}
			public void setQuarter_id(Integer quarter_id) {
				this.quarter_id = quarter_id;
			}
			public String getPayroll_month() {
				return payroll_month;
			}
			public void setPayroll_month(String payroll_month) {
				this.payroll_month = payroll_month;
			}
			public Integer getCalendar_year() {
				return calendar_year;
			}
			public void setCalendar_year(Integer calendar_year) {
				this.calendar_year = calendar_year;
			}
			public double getTotal_leaves() {
				return total_leaves;
			}
			public void setTotal_leaves(double total_leaves) {
				this.total_leaves = total_leaves;
			}
			public double getUsed_leaves() {
				return used_leaves;
			}
			public void setUsed_leaves(double used_leaves) {
				this.used_leaves = used_leaves;
			}
			public double getLeaves_availed() {
				return leaves_availed;
			}
			public void setLeaves_availed(double leaves_availed) {
				this.leaves_availed = leaves_availed;
			}
			public double getLeave_encashed() {
				return leave_encashed;
			}
			public void setLeave_encashed(double leave_encashed) {
				this.leave_encashed = leave_encashed;
			}
			public double getLeaves_forwarded() {
				return leaves_forwarded;
			}
			public void setLeaves_forwarded(double leaves_forwarded) {
				this.leaves_forwarded = leaves_forwarded;
			}
			public double getBasic_salary() {
				return basic_salary;
			}
			public void setBasic_salary(double basic_salary) {
				this.basic_salary = basic_salary;
			}
			public double getSpecial_allowance() {
				return special_allowance;
			}
			public void setSpecial_allowance(double special_allowance) {
				this.special_allowance = special_allowance;
			}
			public double getEncashed_amount() {
				return encashed_amount;
			}
			public void setEncashed_amount(double encashed_amount) {
				this.encashed_amount = encashed_amount;
			}
			public Integer getEncashed_status() {
				return encashed_status;
			}
			public void setEncashed_status(Integer encashed_status) {
				this.encashed_status = encashed_status;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
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
			public String getMobile() {
				return mobile;
			}
			public void setMobile(String mobile) {
				this.mobile = mobile;
			}
			public String getAlternate_mobile() {
				return alternate_mobile;
			}
			public void setAlternate_mobile(String alternate_mobile) {
				this.alternate_mobile = alternate_mobile;
			}
			public Date getDob() {
				return dob;
			}
			public void setDob(Date dob) {
				this.dob = dob;
			}
			public Date getBirthday_date() {
				return birthday_date;
			}
			public void setBirthday_date(Date birthday_date) {
				this.birthday_date = birthday_date;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getAadhaar() {
				return aadhaar;
			}
			public void setAadhaar(String aadhaar) {
				this.aadhaar = aadhaar;
			}
			public String getPassport() {
				return passport;
			}
			public void setPassport(String passport) {
				this.passport = passport;
			}
			public String getPhoto_path() {
				return photo_path;
			}
			public void setPhoto_path(String photo_path) {
				this.photo_path = photo_path;
			}
			public String getNativity() {
				return nativity;
			}
			public void setNativity(String nativity) {
				this.nativity = nativity;
			}
			public String getNationality() {
				return nationality;
			}
			public void setNationality(String nationality) {
				this.nationality = nationality;
			}
			public Integer getCaste() {
				return caste;
			}
			public void setCaste(Integer caste) {
				this.caste = caste;
			}
			public String getSub_caste() {
				return sub_caste;
			}
			public void setSub_caste(String sub_caste) {
				this.sub_caste = sub_caste;
			}
			public String getBlood_group() {
				return blood_group;
			}
			public void setBlood_group(String blood_group) {
				this.blood_group = blood_group;
			}
			public String getEmergency_name() {
				return emergency_name;
			}
			public void setEmergency_name(String emergency_name) {
				this.emergency_name = emergency_name;
			}
			public BigInteger getEmergency_contact() {
				return emergency_contact;
			}
			public void setEmergency_contact(BigInteger emergency_contact) {
				this.emergency_contact = emergency_contact;
			}
			public String getRelation() {
				return relation;
			}
			public void setRelation(String relation) {
				this.relation = relation;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getCity1() {
				return city1;
			}
			public void setCity1(String city1) {
				this.city1 = city1;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public String getState1() {
				return state1;
			}
			public void setState1(String state1) {
				this.state1 = state1;
			}
			public String getCountry() {
				return country;
			}
			public void setCountry(String country) {
				this.country = country;
			}
			public String getCountry1() {
				return country1;
			}
			public void setCountry1(String country1) {
				this.country1 = country1;
			}
			public String getStreet() {
				return street;
			}
			public void setStreet(String street) {
				this.street = street;
			}
			public String getStreet1() {
				return street1;
			}
			public void setStreet1(String street1) {
				this.street1 = street1;
			}
			public String getPincode() {
				return pincode;
			}
			public void setPincode(String pincode) {
				this.pincode = pincode;
			}
			public String getPincode1() {
				return pincode1;
			}
			public void setPincode1(String pincode1) {
				this.pincode1 = pincode1;
			}
			public String getPresent_address() {
				return present_address;
			}
			public void setPresent_address(String present_address) {
				this.present_address = present_address;
			}
			public String getPermanent_address() {
				return permanent_address;
			}
			public void setPermanent_address(String permanent_address) {
				this.permanent_address = permanent_address;
			}
			public String getCreated_by() {
				return created_by;
			}
			public void setCreated_by(String created_by) {
				this.created_by = created_by;
			}
			public String getBank_name() {
				return bank_name;
			}
			public void setBank_name(String bank_name) {
				this.bank_name = bank_name;
			}
			public String getBranch() {
				return branch;
			}
			public void setBranch(String branch) {
				this.branch = branch;
			}
			public String getIfsc_code() {
				return ifsc_code;
			}
			public void setIfsc_code(String ifsc_code) {
				this.ifsc_code = ifsc_code;
			}
			public String getBank_acno() {
				return bank_acno;
			}
			public void setBank_acno(String bank_acno) {
				this.bank_acno = bank_acno;
			}
			public String getPan_name() {
				return pan_name;
			}
			public void setPan_name(String pan_name) {
				this.pan_name = pan_name;
			}
			public String getPan_no() {
				return pan_no;
			}
			public void setPan_no(String pan_no) {
				this.pan_no = pan_no;
			}
			public String getEsi_no() {
				return esi_no;
			}
			public void setEsi_no(String esi_no) {
				this.esi_no = esi_no;
			}
			public String getUan_no() {
				return uan_no;
			}
			public void setUan_no(String uan_no) {
				this.uan_no = uan_no;
			}
			public String getPf_no() {
				return pf_no;
			}
			public void setPf_no(String pf_no) {
				this.pf_no = pf_no;
			}
			public String getCfms_code() {
				return cfms_code;
			}
			public void setCfms_code(String cfms_code) {
				this.cfms_code = cfms_code;
			}
			public String getPan_path() {
				return pan_path;
			}
			public void setPan_path(String pan_path) {
				this.pan_path = pan_path;
			}
			public String getBank_passbook_path() {
				return bank_passbook_path;
			}
			public void setBank_passbook_path(String bank_passbook_path) {
				this.bank_passbook_path = bank_passbook_path;
			}
			public String getCompany_email() {
				return company_email;
			}
			public void setCompany_email(String company_email) {
				this.company_email = company_email;
			}
			public Date getJoining_date() {
				return joining_date;
			}
			public void setJoining_date(Date joining_date) {
				this.joining_date = joining_date;
			}
			public Date getConfirmed_date() {
				return confirmed_date;
			}
			public void setConfirmed_date(Date confirmed_date) {
				this.confirmed_date = confirmed_date;
			}
			public Date getContract_from() {
				return contract_from;
			}
			public void setContract_from(Date contract_from) {
				this.contract_from = contract_from;
			}
			public Date getContract_to() {
				return contract_to;
			}
			public void setContract_to(Date contract_to) {
				this.contract_to = contract_to;
			}
			public Date getRelieved_date() {
				return relieved_date;
			}
			public void setRelieved_date(Date relieved_date) {
				this.relieved_date = relieved_date;
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
			public Integer getEmployee_type() {
				return employee_type;
			}
			public void setEmployee_type(Integer employee_type) {
				this.employee_type = employee_type;
			}
			public Integer getNotice_period() {
				return notice_period;
			}
			public void setNotice_period(Integer notice_period) {
				this.notice_period = notice_period;
			}
			public String getDno() {
				return dno;
			}
			public void setDno(String dno) {
				this.dno = dno;
			}
			public String getVillage() {
				return village;
			}
			public void setVillage(String village) {
				this.village = village;
			}
			public String getMandal() {
				return mandal;
			}
			public void setMandal(String mandal) {
				this.mandal = mandal;
			}
			public Integer getDistrictid() {
				return districtid;
			}
			public void setDistrictid(Integer districtid) {
				this.districtid = districtid;
			}
			public String getBrach() {
				return brach;
			}
			public void setBrach(String brach) {
				this.brach = brach;
			}
			public String getPayment_mode() {
				return payment_mode;
			}
			public void setPayment_mode(String payment_mode) {
				this.payment_mode = payment_mode;
			}
			public Date getEffective_date() {
				return effective_date;
			}
			public void setEffective_date(Date effective_date) {
				this.effective_date = effective_date;
			}
			public String getFullname() {
				return fullname;
			}
			public void setFullname(String fullname) {
				this.fullname = fullname;
			}
			public Integer getContract_duration() {
				return contract_duration;
			}
			public void setContract_duration(Integer contract_duration) {
				this.contract_duration = contract_duration;
			}
			public String getComapny_empid() {
				return comapny_empid;
			}
			public void setComapny_empid(String comapny_empid) {
				this.comapny_empid = comapny_empid;
			}
			public String getCompany_designation() {
				return company_designation;
			}
			public void setCompany_designation(String company_designation) {
				this.company_designation = company_designation;
			}
			public String getTimesheet_date() {
				return timesheet_date;
			}
			public void setTimesheet_date(String timesheet_date) {
				this.timesheet_date = timesheet_date;
			}
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
			public String getTask() {
				return task;
			}
			public void setTask(String task) {
				this.task = task;
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
			public String getLocation_name() {
				return location_name;
			}
			public void setLocation_name(String location_name) {
				this.location_name = location_name;
			}
			public Integer getReporting() {
				return reporting;
			}
			public void setReporting(Integer reporting) {
				this.reporting = reporting;
			}
			public String getFull_name() {
				return full_name;
			}
			public void setFull_name(String full_name) {
				this.full_name = full_name;
			}
			public String getCader_name() {
				return cader_name;
			}
			public void setCader_name(String cader_name) {
				this.cader_name = cader_name;
			}
			public String getEmail_id() {
				return email_id;
			}
			public void setEmail_id(String email_id) {
				this.email_id = email_id;
			}
			public String getEmp_id() {
				return emp_id;
			}
			public void setEmp_id(String emp_id) {
				this.emp_id = emp_id;
			}
			public BigInteger getBeneficiary_code() {
				return beneficiary_code;
			}
			public void setBeneficiary_code(BigInteger beneficiary_code) {
				this.beneficiary_code = beneficiary_code;
			}
			public Integer getDesignationid() {
				return designationid;
			}
			public void setDesignationid(Integer designationid) {
				this.designationid = designationid;
			}
			public Integer getDivisionid() {
				return divisionid;
			}
			public void setDivisionid(Integer divisionid) {
				this.divisionid = divisionid;
			}
			public Integer getCost_centerid() {
				return cost_centerid;
			}
			public void setCost_centerid(Integer cost_centerid) {
				this.cost_centerid = cost_centerid;
			}
			public String getDob1() {
				return dob1;
			}
			public void setDob1(String dob1) {
				this.dob1 = dob1;
			}
			public Integer getRelationid() {
				return relationid;
			}
			public void setRelationid(Integer relationid) {
				this.relationid = relationid;
			}
			public String getCompany_name() {
				return company_name;
			}
			public void setCompany_name(String company_name) {
				this.company_name = company_name;
			}
			public String getDocument_name() {
				return document_name;
			}
			public void setDocument_name(String document_name) {
				this.document_name = document_name;
			}
			public Boolean getConsent() {
				return consent;
			}
			public void setConsent(Boolean consent) {
				this.consent = consent;
			}
			public BigInteger getPhone() {
				return phone;
			}
			public void setPhone(BigInteger phone) {
				this.phone = phone;
			}
			public String getStaff_type() {
				return staff_type;
			}
			public void setStaff_type(String staff_type) {
				this.staff_type = staff_type;
			}
			public Integer getCtc_calculator() {
				return ctc_calculator;
			}
			public void setCtc_calculator(Integer ctc_calculator) {
				this.ctc_calculator = ctc_calculator;
			}
			public String getScheme_id() {
				return scheme_id;
			}
			public void setScheme_id(String scheme_id) {
				this.scheme_id = scheme_id;
			}
			public String getScheme_name() {
				return scheme_name;
			}
			public void setScheme_name(String scheme_name) {
				this.scheme_name = scheme_name;
			}
			public String getProject_id() {
				return project_id;
			}
			public void setProject_id(String project_id) {
				this.project_id = project_id;
			}
			public String getProject_name() {
				return project_name;
			}
			public void setProject_name(String project_name) {
				this.project_name = project_name;
			}
			public String getSector_id() {
				return sector_id;
			}
			public void setSector_id(String sector_id) {
				this.sector_id = sector_id;
			}
			public String getSector_name() {
				return sector_name;
			}
			public void setSector_name(String sector_name) {
				this.sector_name = sector_name;
			}
			public Integer getInstitute_id() {
				return institute_id;
			}
			public void setInstitute_id(Integer institute_id) {
				this.institute_id = institute_id;
			}
			public String getInstitute_name() {
				return institute_name;
			}
			public void setInstitute_name(String institute_name) {
				this.institute_name = institute_name;
			}
			public Integer getQualification_id() {
				return qualification_id;
			}
			public void setQualification_id(Integer qualification_id) {
				this.qualification_id = qualification_id;
			}
			public String getQualification_name() {
				return qualification_name;
			}
			public void setQualification_name(String qualification_name) {
				this.qualification_name = qualification_name;
			}
			public String getHighest_qualification() {
				return highest_qualification;
			}
			public void setHighest_qualification(String highest_qualification) {
				this.highest_qualification = highest_qualification;
			}
			public String getHighest_qualifications() {
				return highest_qualifications;
			}
			public void setHighest_qualifications(String highest_qualifications) {
				this.highest_qualifications = highest_qualifications;
			}
			public String getScore() {
				return score;
			}
			public void setScore(String score) {
				this.score = score;
			}
			public Integer getPassout_year() {
				return passout_year;
			}
			public void setPassout_year(Integer passout_year) {
				this.passout_year = passout_year;
			}
			public Integer getPassout_years() {
				return passout_years;
			}
			public void setPassout_years(Integer passout_years) {
				this.passout_years = passout_years;
			}
			public Double getCgpa() {
				return cgpa;
			}
			public void setCgpa(Double cgpa) {
				this.cgpa = cgpa;
			}
			public Double getCgpas() {
				return cgpas;
			}
			public void setCgpas(Double cgpas) {
				this.cgpas = cgpas;
			}
			public String getGrades() {
				return grades;
			}
			public void setGrades(String grades) {
				this.grades = grades;
			}
			public String getGradess() {
				return gradess;
			}
			public void setGradess(String gradess) {
				this.gradess = gradess;
			}
			public Double getPercentage() {
				return percentage;
			}
			public void setPercentage(Double percentage) {
				this.percentage = percentage;
			}
			public Double getPercentages() {
				return percentages;
			}
			public void setPercentages(Double percentages) {
				this.percentages = percentages;
			}
			public Integer getProject() {
				return project;
			}
			public void setProject(Integer project) {
				this.project = project;
			}
			public String getInstitute() {
				return institute;
			}
			public void setInstitute(String institute) {
				this.institute = institute;
			}
			public String getProjectname() {
				return projectname;
			}
			public void setProjectname(String projectname) {
				this.projectname = projectname;
			}
			public String getLocationname() {
				return locationname;
			}
			public void setLocationname(String locationname) {
				this.locationname = locationname;
			}
			public Integer getDuration() {
				return duration;
			}
			public void setDuration(Integer duration) {
				this.duration = duration;
			}
			public String getLogin_time() {
				return login_time;
			}
			public void setLogin_time(String login_time) {
				this.login_time = login_time;
			}
			public String getLogout_time() {
				return logout_time;
			}
			public void setLogout_time(String logout_time) {
				this.logout_time = logout_time;
			}
			public Integer getPayslip_heads() {
				return payslip_heads;
			}
			public void setPayslip_heads(Integer payslip_heads) {
				this.payslip_heads = payslip_heads;
			}
			public String getCtcname() {
				return ctcname;
			}
			public void setCtcname(String ctcname) {
				this.ctcname = ctcname;
			}
			public String[] getRoles() {
				return roles;
			}
			public void setRoles(String[] roles) {
				this.roles = roles;
			}
			public String getRole_name() {
				return role_name;
			}
			public void setRole_name(String role_name) {
				this.role_name = role_name;
			}

	
	

	
}
