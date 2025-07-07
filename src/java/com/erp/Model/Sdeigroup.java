
package com.erp.Model;


import java.sql.Timestamp;
import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class Sdeigroup extends BaseModel {    
	
	private static long serialVersionUID = 1L;
	public String description;
	public String sdei_groupname;
	public String sdei_groupnumber;
	public boolean status;
	public Timestamp created_date;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Sdeigroup.serialVersionUID = serialVersionUID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSdei_groupname() {
		return sdei_groupname;
	}
	public void setSdei_groupname(String sdei_groupname) {
		this.sdei_groupname = sdei_groupname;
	}
	public String getSdei_groupnumber() {
		return sdei_groupnumber;
	}
	public void setSdei_groupnumber(String sdei_groupnumber) {
		this.sdei_groupnumber = sdei_groupnumber;
	}
	public boolean isStatus() {
		return status;
	}            
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	
	
	
		
		
}
	
	
	