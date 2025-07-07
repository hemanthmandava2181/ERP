package com.erp.Model;

import java.math.BigInteger;
import java.util.Date;

import com.andromeda.commons.model.BaseModel;

public class Vendor extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	public String vendor_id;
	public String vendor_type;
	public String name; 
	public String mobile;
	public String phone;
	public String email;  
	public String web_site;
	public String address;
	public String contact_person_name;
	public String contact_person_designation;
	public String contact_person_mobile;
	public String contact_person_mail;
	public String income_status;
	public String service_status;
	public String registering_authority;
	public String registration_no;
	public Date date_of_registration;
	public String place_of_registration;
	public Double experience;
	public Integer annual_turnover;
	public String nsdc_number;
	public String ssc_number;
	public String pan_no;
	public String tan_no;
	public String service_tax;
	public String account_no;
	public String ifsc;
	public String swift;
	public String bank_name;
	public String branch;
	public String gst_no;
	public Date gst_reg_date;
	public String nature_of_service;
	public String year;
	public String service_name;
	public Integer id;
	
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;   
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_type() {
		return vendor_type;
	}
	public void setVendor_type(String vendor_type) {
		this.vendor_type = vendor_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb_site() {
		return web_site;
	}
	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact_person_name() {
		return contact_person_name;
	}
	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}
	public String getContact_person_designation() {
		return contact_person_designation;
	}
	public void setContact_person_designation(String contact_person_designation) {
		this.contact_person_designation = contact_person_designation;
	}
	public String getContact_person_mobile() {
		return contact_person_mobile;
	}
	public void setContact_person_mobile(String contact_person_mobile) {
		this.contact_person_mobile = contact_person_mobile;
	}
	public String getContact_person_mail() {
		return contact_person_mail;
	}
	public void setContact_person_mail(String contact_person_mail) {
		this.contact_person_mail = contact_person_mail;
	}
	public String getIncome_status() {
		return income_status;
	}
	public void setIncome_status(String income_status) {
		this.income_status = income_status;
	}
	public String getService_status() {
		return service_status;
	}
	public void setService_status(String service_status) {
		this.service_status = service_status;
	}
	public String getRegistering_authority() {
		return registering_authority;
	}
	public void setRegistering_authority(String registering_authority) {
		this.registering_authority = registering_authority;
	}
	public String getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}
	public Date getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(Date date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public String getPlace_of_registration() {
		return place_of_registration;
	}
	public void setPlace_of_registration(String place_of_registration) {
		this.place_of_registration = place_of_registration;
	}
	public Double getExperience() {
		return experience;
	}
	public void setExperience(Double experience) {
		this.experience = experience;
	}
	public Integer getAnnual_turnover() {
		return annual_turnover;
	}
	public void setAnnual_turnover(Integer annual_turnover) {
		this.annual_turnover = annual_turnover;
	}
	public String getNsdc_number() {
		return nsdc_number;
	}
	public void setNsdc_number(String nsdc_number) {
		this.nsdc_number = nsdc_number;
	}
	public String getSsc_number() {
		return ssc_number;
	}
	public void setSsc_number(String ssc_number) {
		this.ssc_number = ssc_number;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getTan_no() {
		return tan_no;
	}
	public void setTan_no(String tan_no) {
		this.tan_no = tan_no;
	}
	public String getService_tax() {
		return service_tax;
	}
	public void setService_tax(String service_tax) {
		this.service_tax = service_tax;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getIfsc() {
		return ifsc;
	}  
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getSwift() {
		return swift;
	}
	public void setSwift(String swift) {
		this.swift = swift;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGst_no() {
		return gst_no;
	}  
	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}
	public Date getGst_reg_date() {
		return gst_reg_date;
	}
	public void setGst_reg_date(Date gst_reg_date) {
		this.gst_reg_date = gst_reg_date;
	}
	public String getNature_of_service() {
		return nature_of_service;
	}
	public void setNature_of_service(String nature_of_service) {
		this.nature_of_service = nature_of_service;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
	
	
	