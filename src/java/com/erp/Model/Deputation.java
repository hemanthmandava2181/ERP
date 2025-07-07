package com.erp.Model;

public class Deputation {
	private Integer yearid;
	private String year;
	private Integer monthid;
	private String month_name;
	private String empid;
	private String employeename;
	private Integer id;
	private String pname;
	private Integer payslip_id;
	private Long amount;
	private Integer financial_year;
	private Integer payslip_heads;
	public Integer getPayslip_heads() {
		return payslip_heads;
	}
	public void setPayslip_heads(Integer payslip_heads) {
		this.payslip_heads = payslip_heads;
	}
	public Integer getFinancial_year() {
		return financial_year;
		
	}
	public void setFinancial_year(Integer financial_year) {
		this.financial_year = financial_year;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Integer getPayslip_id() {
		return payslip_id;
	}
	public void setPayslip_id(Integer payslip_id) {
		this.payslip_id = payslip_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public Integer getMonthid() {
		return monthid;
	}
	public void setMonthid(Integer monthid) {
		this.monthid = monthid;
	}
	public String getMonth_name() {
		return month_name;
	}
	public void setMonth_name(String month_name) {
		this.month_name = month_name;
	}
	public Integer getYearid() {
		return yearid;
	}
	public void setYearid(Integer yearid) {
		this.yearid = yearid;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

}
