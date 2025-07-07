package com.erp.Model;

import java.math.BigInteger;
import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class VendorService extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	public String service_id;
	public String service_name;
	public String status;
	public String year;
	
	
	public String getService_id() {
		return service_id;
	}
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	} 
	
}
	
	
	