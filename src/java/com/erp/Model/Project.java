package com.erp.Model;

import java.math.BigInteger;
import java.sql.Date;



public class Project {
	
public String	project_id ;
	public String project_name; 
	public String scheme_id ;
	public String scheme_name;     
	public String budget_type ;
    public String financial_year;
    public String sdei_groupnumber ;
    public String sdei_groupname ;
    public Integer headcount; 
    public double  capex_budgetvalue ;
    public double opex_budgetvalue;
    public Date from_date; 
    public Date to_date; 
    public String description; 
	public Integer yearid;
	public String program_id;
	public String physical_outcome;
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
	public String getBudget_type() {
		return budget_type;
	}
	public void setBudget_type(String budget_type) {
		this.budget_type = budget_type;
	}
	public String getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(String financial_year) {
		this.financial_year = financial_year;
	}
	public String getSdei_groupnumber() {
		return sdei_groupnumber;
	}
	public void setSdei_groupnumber(String sdei_groupnumber) {
		this.sdei_groupnumber = sdei_groupnumber;
	}
	public String getSdei_groupname() {
		return sdei_groupname;
	}
	public void setSdei_groupname(String sdei_groupname) {
		this.sdei_groupname = sdei_groupname;
	}
	public Integer getHeadcount() {
		return headcount;
	}
	public void setHeadcount(Integer headcount) {
		this.headcount = headcount;
	}
	public double getCapex_budgetvalue() {
		return capex_budgetvalue;
	}
	public void setCapex_budgetvalue(double capex_budgetvalue) {
		this.capex_budgetvalue = capex_budgetvalue;
	}
	public double getOpex_budgetvalue() {
		return opex_budgetvalue;
	}
	public void setOpex_budgetvalue(double opex_budgetvalue) {
		this.opex_budgetvalue = opex_budgetvalue;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getYearid() {
		return yearid;
	}
	public void setYearid(Integer yearid) {
		this.yearid = yearid;
	}
	public String getProgram_id() {
		return program_id;
	}
	public void setProgram_id(String program_id) {
		this.program_id = program_id;
	}
	public String getPhysical_outcome() {
		return physical_outcome;
	}
	public void setPhysical_outcome(String physical_outcome) {
		this.physical_outcome = physical_outcome;
	}
	
	
}
	
	
	