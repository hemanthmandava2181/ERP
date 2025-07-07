
package com.erp.Model;


import java.sql.Timestamp;
import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class Operation extends BaseModel {    
	
	
	private static long serialVersionUID = 1L;
	public String  district_name;
	public Integer districtid;
	public boolean status;
	public Timestamp created_date;
	public Timestamp current_timestamp;
	public String  name;
	public String description;
	public String asset_type;
	public Timestamp date_created;
	public String group_name; 
	 public String item_name;
	 public Integer item_group;
	 public String created_by;
	 public String modified_by;
	public String asset_name;
	public Integer gl_account;
	public Integer asset_class;
	public Integer district_id;
	public Integer constituency ;
	public String mandal_name;
	public Integer asset_nature;
public String	location_name ;
	public String gl_id;
	public Integer  constituencyid; 
	public Integer  pin_code; 
	public String  address1; 
	public String  address2; 
	
	public String  mandalid; 
	public Integer id;
	
	
	public String getGl_id() {
		return gl_id;
	}
	public void setGl_id(String gl_id) {
		this.gl_id = gl_id;
	}
	 
	 
	
	 
	 
	  
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public Integer getConstituencyid() {
		return constituencyid;
	}
	public void setConstituencyid(Integer constituencyid) {
		this.constituencyid = constituencyid;
	}
	public Integer getPin_code() {
		return pin_code;
	}
	public void setPin_code(Integer pin_code) {
		this.pin_code = pin_code;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getMandalid() {
		return mandalid;
	}
	public void setMandalid(String mandalid) {
		this.mandalid = mandalid;
	}
	public Integer getAsset_nature() {
		return asset_nature;
	}
	public void setAsset_nature(Integer asset_nature) {
		this.asset_nature = asset_nature;
	}
	public Integer getConstituency() {
		return constituency;
	}
	public void setConstituency(Integer constituency) {
		this.constituency = constituency;
	}
	public String getMandal_name() {
		return mandal_name;
	}
	public void setMandal_name(String mandal_name) {
		this.mandal_name = mandal_name;
	}
	public Integer getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}
	public Integer getAsset_class() {
		return asset_class;
	}
	public void setAsset_class(Integer asset_class) {
		this.asset_class = asset_class;
	}
	public Integer getGl_account() {
		return gl_account;
	}
	public void setGl_account(Integer gl_account) {
		this.gl_account = gl_account;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Integer getItem_group() {
		return item_group;
	}
	public void setItem_group(Integer item_group) {
		this.item_group = item_group;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Timestamp getDate_created() {
		return date_created;
	}
	public void setDate_created(Timestamp date_created) {
		this.date_created = date_created;
	}
	
	public String getAsset_type() {
		return asset_type;
	}
	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public static void setSerialVersionUID(long serialVersionUID) {
		Operation.serialVersionUID = serialVersionUID;
	}
	
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public Timestamp getCurrent_timestamp() {
		return current_timestamp;
	}
	public void setCurrent_timestamp(Timestamp current_timestamp) {
		this.current_timestamp = current_timestamp;
	}
	/*public Integer getDistrictid() {
		return districtid;
	}
	public void setDistrictid(Integer districtid) {
		this.districtid = districtid;
	}*/
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
	
	
	public Integer getDistrictid() {
		return districtid;
	}
	public void setDistrictid(Integer districtid) {
		this.districtid = districtid;
	}
	 
	
}
	
	
	