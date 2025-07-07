
package com.erp.Model;


import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class Sector extends BaseModel {    
	
	private static long serialVersionUID = 1L;
	
	public String sector_name;
	public String sector_id;
	public boolean status;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Sector.serialVersionUID = serialVersionUID;
	}
	public String getSector_name() {
		return sector_name;
	}
	public void setSector_name(String sector_name) {
		this.sector_name = sector_name;
	}
	public String getSector_id() {
		return sector_id;
	}
	public void setSector_id(String sector_id) {
		this.sector_id = sector_id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
		
		
}
	
	
	