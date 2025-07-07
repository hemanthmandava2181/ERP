
package com.erp.Model;


import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class Segment extends BaseModel {    
	
	private static long serialVersionUID = 1L;
	
	public String segment_name;
	public String segment_id;
	public boolean status;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Segment.serialVersionUID = serialVersionUID;
	}
	public String getSegment_name() {
		return segment_name;
	}
	public void setSegment_name(String segment_name) {
		this.segment_name = segment_name;
	}
	public String getSegment_id() {
		return segment_id;
	}
	public void setSegment_id(String segment_id) {
		this.segment_id = segment_id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
		
		
}
	
	
	