package com.erp.Model;

import java.math.BigInteger;
import java.util.List;

public class Upload {
	
	public String id;
	public String empid;
	public String first_name;
	public String middle_name;
	public String last_name; 
	public BigInteger mobile;
	public String email;
	public String company_email; 
	public Integer cader;           
	public Integer grade;
	public String joining_date;              
	public String confirmed_date; 
	public String contract_from;                                      
	public String contract_to; 
	public String relieved_date;
	public Integer department; 
	public Integer designation; 
	public Integer division;                 
	public Integer cost_center;                       
	public Integer employee_type; 
	public String reporting_to; 
	public Integer notice_period;
	
    public String year;
	private String ipAddress;
	public int InstitutionCode;
	private String fileName;
	private String base64String;
	private List<FileModel> filePaths;
	private List<String> paths;
	private String filePath;
	private String fileExtension;
	private String fileFormat;
	private String role;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
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
	
	public Integer getCader() {
		return cader;
	}
	public void setCader(Integer cader) {
		this.cader = cader;
	}               
	
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getConfirmed_date() {
		return confirmed_date;
	}
	public void setConfirmed_date(String confirmed_date) {
		this.confirmed_date = confirmed_date;
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
	public String getRelieved_date() {
		return relieved_date;
	}
	public void setRelieved_date(String relieved_date) {
		this.relieved_date = relieved_date;
	}
	
	public String getReporting_to() {
		return reporting_to;
	}
	public void setReporting_to(String reporting_to) {
		this.reporting_to = reporting_to;
	}
	
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	public Integer getDesignation() {
		return designation;
	}
	public void setDesignation(Integer designation) {
		this.designation = designation;
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getInstitutionCode() {
		return InstitutionCode;
	}
	public void setInstitutionCode(int institutionCode) {
		InstitutionCode = institutionCode;
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
	public String getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	   
	
	
	
	
}
