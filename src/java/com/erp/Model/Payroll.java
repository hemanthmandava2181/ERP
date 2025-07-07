package com.erp.Model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import com.andromeda.commons.model.BaseModel;

public class Payroll extends BaseModel{
	
	private Integer id; 
	private Integer financial_year;
	private Integer payroll_month;
	private Date from_date;
	private Date to_date;
	private String approved_by;
	private String modified_by;
	private Number grosspay;
	private Number deductions;
	private Number netpay;
	private String empname;
	private Integer payslip_head;
	
	
	public Integer getPayslip_head() {
		return payslip_head;
	}
	public void setPayslip_head(Integer payslip_head) {
		this.payslip_head = payslip_head;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Number getGrosspay() {
		return grosspay;
	}
	public void setGrosspay(Number grosspay) {
		this.grosspay = grosspay;
	}
	public Number getDeductions() {
		return deductions;
	}
	public void setDeductions(Number deductions) {
		this.deductions = deductions;
	}
	public Number getNetpay() {
		return netpay;
	}
	public void setNetpay(Number netpay) {
		this.netpay = netpay;
	}
	public String getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	private Integer month_days;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(Integer financial_year) {
		this.financial_year = financial_year;
	}
	public Integer getPayroll_month() {
		return payroll_month;
	}
	public void setPayroll_month(Integer payroll_month) {
		this.payroll_month = payroll_month;
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
	public Integer getMonth_days() {
		return month_days;
	}
	public void setMonth_days(Integer month_days) {
		this.month_days = month_days;
	}
	
	
	

}
