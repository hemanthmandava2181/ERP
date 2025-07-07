
package com.erp.Model;


import java.math.BigInteger;
import java.sql.Date;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

/**
 * @author Shyam
 *
 */
public class Ctc extends BaseModel {    
	
	private static long serialVersionUID = 1L;
	/*public String financial_year;*/
	public String financialyear;
	public String year;
	public String monthname;
	public String stop_by;
	public String release_by;
	public Date release_date;	
	public Integer ctc_calculatorid;
	public Date stop_date;
	public Date stopdate;
	public String fullname;
	public String created_by;
	public String pname;
	public String title;
	public boolean status;
	public String first_name;
	public String last_name;
	public String employee_name;
	public String name;
	public Integer department;
	public String designation;
	public String designation_id;
	public Integer cader;
	public String cader_name;
	public Integer grade;
	public String ctc_calculator;
	public Date effective_date;
	public Double ctc;
	public Integer id;
	public String middle_name;
	public String department_name;
	public String designation_name;
	public String description;
	public String grade_name;
	public String empid;
	public Integer caderid;
	public Integer gradeid;
	public Integer departmentid;
	public BigInteger mobile;
	public String email;
	public String company_email;
	public Integer designationid;
	public Integer divisionid;
	public Integer cost_centerid;
	public Integer reporting;
	public String reporting_to;
	public Integer notice_period;
	public String bank_name;
	public String brach;
	public String ifsc_code;
	public String bank_acno;
	public String pan_no;
	public String esi_no;
	public String uan_no;
	public String pf_no;
	public BigInteger beneficiary_code;
	public String location_name;
	public String aadhaar;
	public String passport;
	public String nationality;
	public String nativity;
	public String sub_caste;
	public String blood_group;
	public String emergency_name;
	public BigInteger emergency_contact;
	public Integer relations;
	public String dno;
	public String street;
	public String village;
	public String mandal;
	public Integer districtid;
	public String state;
	public String company_name;
	public String document_name;
	public boolean consent;
	public String from_date;
	public String to_date;
	public String dob1;
	public Integer relationid;
	public Integer relation_id;
	public Integer employee_type;
	public Integer realation;
	public String gender;
	public String company_designation;
	public Integer location;
	public String ctc_calculatorname;
	public Double ctc_amount;
	public Double revised_ctc;
	public String effective_from;
	public Integer financial_year;
	public Integer  payslip_heads; 
	public  Integer payroll_month; 
	public  boolean is_processed ;
	public Date  stoped_date;
	public  Integer month; 
	public Integer yearid;
	public  String years;	
	public String alternate_mobile;
	public Date dob;
	public Integer caste;
	public String city;
	public String country;
	public String pincode;
	public String present_address;
	public Integer district;
	public Date joining_date;
	public Date confirmed_date;
	public Date contract_from;
	public Date contract_to;
	public Date relieved_date;
	public Integer division;
	public Integer cost_center;
	public String branch;
	public String pan_name;
	public String cfms_code;
	public Double annual_salary;
	public Integer project;	
	public Double amount;
	public Integer monthid;
	public String employeename;	
	public String value;
	public String entity_type;
	public Integer payslip_id;
	public String role;
	
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<String> paths;
	public List<FileModel> filePaths;
	public String filePath;
	public String fileExtension;
	public String ipAddress;
	
	
	
	
	
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public List<FileModel> getFilePaths() {
		return filePaths;
	}
	public void setFilePaths(List<FileModel> filePaths) {
		this.filePaths = filePaths;
	}
	public List<String> getPaths() {
		return paths;
	}
	public void setPaths(List<String> paths) {
		this.paths = paths;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Ctc.serialVersionUID = serialVersionUID;
	}
	public String getFinancialyear() {
		return financialyear;
	}
	public void setFinancialyear(String financialyear) {
		this.financialyear = financialyear;
	}
	public String getMonthname() {
		return monthname;
	}
	public void setMonthname(String monthname) {
		this.monthname = monthname;
	}
	public String getStop_by() {
		return stop_by;
	}
	public void setStop_by(String stop_by) {
		this.stop_by = stop_by;
	}
	public String getRelease_by() {
		return release_by;
	}
	public void setRelease_by(String release_by) {
		this.release_by = release_by;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public Integer getCtc_calculatorid() {
		return ctc_calculatorid;
	}
	public void setCtc_calculatorid(Integer ctc_calculatorid) {
		this.ctc_calculatorid = ctc_calculatorid;
	}
	public Date getStop_date() {
		return stop_date;
	}
	public void setStop_date(Date stop_date) {
		this.stop_date = stop_date;
	}
	public Date getStopdate() {
		return stopdate;
	}
	public void setStopdate(Date stopdate) {
		this.stopdate = stopdate;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
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
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(String designation_id) {
		this.designation_id = designation_id;
	}
	public Integer getCader() {
		return cader;
	}
	public void setCader(Integer cader) {
		this.cader = cader;
	}
	public String getCader_name() {
		return cader_name;
	}
	public void setCader_name(String cader_name) {
		this.cader_name = cader_name;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getCtc_calculator() {
		return ctc_calculator;
	}
	public void setCtc_calculator(String ctc_calculator) {
		this.ctc_calculator = ctc_calculator;
	}
	public Date getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(Date effective_date) {
		this.effective_date = effective_date;
	}
	public Double getCtc() {
		return ctc;
	}
	public void setCtc(Double ctc) {
		this.ctc = ctc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
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
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
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
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public BigInteger getMobile() {
		return mobile;
	}
	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany_email() {
		return company_email;
	}
	public void setCompany_email(String company_email) {
		this.company_email = company_email;
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
	public Integer getReporting() {
		return reporting;
	}
	public void setReporting(Integer reporting) {
		this.reporting = reporting;
	}
	public String getReporting_to() {
		return reporting_to;
	}
	public void setReporting_to(String reporting_to) {
		this.reporting_to = reporting_to;
	}
	public Integer getNotice_period() {
		return notice_period;
	}
	public void setNotice_period(Integer notice_period) {
		this.notice_period = notice_period;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
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
	public String getBank_acno() {
		return bank_acno;
	}
	public void setBank_acno(String bank_acno) {
		this.bank_acno = bank_acno;
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
	public BigInteger getBeneficiary_code() {
		return beneficiary_code;
	}
	public void setBeneficiary_code(BigInteger beneficiary_code) {
		this.beneficiary_code = beneficiary_code;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNativity() {
		return nativity;
	}
	public void setNativity(String nativity) {
		this.nativity = nativity;
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
	public Integer getRelations() {
		return relations;
	}
	public void setRelations(Integer relations) {
		this.relations = relations;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public boolean isConsent() {
		return consent;
	}
	public void setConsent(boolean consent) {
		this.consent = consent;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
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
	public Integer getRelation_id() {
		return relation_id;
	}
	public void setRelation_id(Integer relation_id) {
		this.relation_id = relation_id;
	}
	public Integer getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(Integer employee_type) {
		this.employee_type = employee_type;
	}
	public Integer getRealation() {
		return realation;
	}
	public void setRealation(Integer realation) {
		this.realation = realation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCompany_designation() {
		return company_designation;
	}
	public void setCompany_designation(String company_designation) {
		this.company_designation = company_designation;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public String getCtc_calculatorname() {
		return ctc_calculatorname;
	}
	public void setCtc_calculatorname(String ctc_calculatorname) {
		this.ctc_calculatorname = ctc_calculatorname;
	}
	public Double getCtc_amount() {
		return ctc_amount;
	}
	public void setCtc_amount(Double ctc_amount) {
		this.ctc_amount = ctc_amount;
	}
	public Double getRevised_ctc() {
		return revised_ctc;
	}
	public void setRevised_ctc(Double revised_ctc) {
		this.revised_ctc = revised_ctc;
	}
	public String getEffective_from() {
		return effective_from;
	}
	public void setEffective_from(String effective_from) {
		this.effective_from = effective_from;
	}
	public Integer getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(Integer financial_year) {
		this.financial_year = financial_year;
	}
	public Integer getPayslip_heads() {
		return payslip_heads;
	}
	public void setPayslip_heads(Integer payslip_heads) {
		this.payslip_heads = payslip_heads;
	}
	public Integer getPayroll_month() {
		return payroll_month;
	}
	public void setPayroll_month(Integer payroll_month) {
		this.payroll_month = payroll_month;
	}
	public boolean isIs_processed() {
		return is_processed;
	}
	public void setIs_processed(boolean is_processed) {
		this.is_processed = is_processed;
	}
	public Date getStoped_date() {
		return stoped_date;
	}
	public void setStoped_date(Date stoped_date) {
		this.stoped_date = stoped_date;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYearid() {
		return yearid;
	}
	public void setYearid(Integer yearid) {
		this.yearid = yearid;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
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
	public Integer getCaste() {
		return caste;
	}
	public void setCaste(Integer caste) {
		this.caste = caste;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPresent_address() {
		return present_address;
	}
	public void setPresent_address(String present_address) {
		this.present_address = present_address;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPan_name() {
		return pan_name;
	}
	public void setPan_name(String pan_name) {
		this.pan_name = pan_name;
	}
	public String getCfms_code() {
		return cfms_code;
	}
	public void setCfms_code(String cfms_code) {
		this.cfms_code = cfms_code;
	}
	public Double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(Double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public Integer getProject() {
		return project;
	}
	public void setProject(Integer project) {
		this.project = project;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getMonthid() {
		return monthid;
	}
	public void setMonthid(Integer monthid) {
		this.monthid = monthid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}
	public Integer getPayslip_id() {
		return payslip_id;
	}
	public void setPayslip_id(Integer payslip_id) {
		this.payslip_id = payslip_id;
	}	
		
}
	
	
	