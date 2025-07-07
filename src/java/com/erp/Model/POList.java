package com.erp.Model;

import java.math.BigInteger;
import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class POList extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	public String po;
	public String po2;
	public Date created_date;
	public Date po_created_date;
	public String program;
	public String vendor_name;
	public String created_by;
	public String approved_by;
	public String amount;   
	public Integer status;
	public String action;
	public String document_path;
	public Date podate;
	
	
	
	public Date getPodate() {
		return podate;
	}
	public void setPodate(Date podate) {
		this.podate = podate;
	}
	public Integer po_id;
	
	public Integer getPo_id() {
		return po_id;
	}
	public void setPo_id(Integer po_id) {
		this.po_id = po_id;
	}
	public String getPo() {
		return po;
	}
	public void setPo(String po) {
		this.po = po;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getPo_created_date() {
		return po_created_date;
	}
	public void setPo_created_date(Date po_created_date) {
		this.po_created_date = po_created_date;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getDocument_path() {
		return document_path;
	}
	public void setDocument_path(String document_path) {
		this.document_path = document_path;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPo2() {
		return po2;
	}
	public void setPo2(String po2) {
		this.po2 = po2;
	}
	
	
}
	