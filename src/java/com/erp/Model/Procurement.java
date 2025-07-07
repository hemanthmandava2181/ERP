
package com.erp.Model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

import software.amazon.ion.Decimal;

public class Procurement extends BaseModel {
	
	
	private static final long serialVersionUID = 1L;
	public Integer yearid;
	public String years;
	/*public Integer sector_id;*/
	public String sector_name;
	public String project_name;
	public Integer year;
	public Integer count;
	public Integer programid;
	public String programname;
	public String servicename;
	public String scheme_name;
	/*public Integer scheme_id;*/	
	public String file_name;
	public String fileName;
	public String base64String;
	public String filepath;             
	public List<Procurement>uploadfiles;
	public String folderName;
	public String filePaths;
	public String[] filePathsArr;
	public List<FileModel> files;
	public String image;
	public String image1;
	public Integer vendorid;
	public String vendorname;	
	public Integer project; 
	public Integer  program; 
	public Integer  vendor;
	public double  amount; 
	public String  workorder_id;
	public Date  workorder_date; 
	public Integer  type;
	public Integer  status; 
	public String  agreement_file; 
	public String  note_file; 
	public Timestamp  date_created; 
	public Integer  financial_year; 
	public Integer  scheme; 
	public String  other1 ;
	public String  other2; 
	public Integer created_by; 
	public Integer approved_by; 
	public Integer oreder_status; 
	public Integer  unlick_work_order;
	public Date  from_date;
	public Date  to_date;
	public String reference; 
	public Integer service;
	public Integer model; 
	public String subject;
	public Integer  budjet_type; 
	public boolean  inclusive_tax ;
	public Integer work_status;
	public boolean  vendor_accepted; 
	public String  vendor_comment; 
	public String  existing_work_order_id;
	public String description; 
	public String  document_to_submit;
	public String  document_path; 
	public Integer  next_approver; 
	public Integer  incharge; 
	public String  mou_id;
	public Date   mou_date;
	public Integer  order_status; 
	public Integer unlock_work_order; 
	public Integer  budget_type;  
	public String  existing_mou_id ;
	public Integer district;
	public Integer mou;
	public Integer id;
	public Integer  invoice_details; 
	public Integer  location; 
	public Integer  workorder; 
	public Integer  duration_hours; 
	public Integer  duration_days; 
	public Integer  trainer_type; 
	public Integer  no_of_trainers; 
	public Integer no_of_candidates; 
	public Integer no_of_batches; 
	public Integer  model_rate; 
	public boolean duration_days_check; 
	public boolean duration_hours_check ;
	public boolean no_of_trainers_check ;
	public boolean  no_of_candidates_check; 
	public boolean  model_rate_check; 
	public boolean  no_of_batches_check; 
	public String name;  
	public Integer workorder_additions;
	public Integer  value; 
	public Integer  rate; 
	public Integer  per_days ;
	public Integer  trainer_trainee; 
	public boolean per_days_check ;
	public boolean  trainer_trainee_check;
	public String	program_name; 
	public String  project_id; 
	  public String  program_id; 
	  public String  segment_id; 
	  public String  sector_id;   
	  public String  scheme_id;
	  public String  district_id ;
	public double  opex_budgetvalue;
	public double capex_budgetvalue; 
	  
	
	
	public double getOpex_budgetvalue() {
		return opex_budgetvalue;
	}
	public void setOpex_budgetvalue(double opex_budgetvalue) {
		this.opex_budgetvalue = opex_budgetvalue;
	}
	public double getCapex_budgetvalue() {
		return capex_budgetvalue;
	}
	public void setCapex_budgetvalue(double capex_budgetvalue) {
		this.capex_budgetvalue = capex_budgetvalue;
	}
	public String getProgram_name() {
		return program_name;
	}
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getProgram_id() {
		return program_id;
	}
	public void setProgram_id(String program_id) {
		this.program_id = program_id;
	}
	public String getSegment_id() {
		return segment_id;
	}
	public void setSegment_id(String segment_id) {
		this.segment_id = segment_id;
	}
	public String getSector_id() {
		return sector_id;
	}
	public void setSector_id(String sector_id) {
		this.sector_id = sector_id;
	}
	public String getScheme_id() {
		return scheme_id;
	}
	public void setScheme_id(String scheme_id) {
		this.scheme_id = scheme_id;
	}
	public String getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(String district_id) {
		this.district_id = district_id;
	}
	public String getFile_name() {
		return file_name;
	}
	public Integer getWorkorder_additions() {
		return workorder_additions;
	}
	public void setWorkorder_additions(Integer workorder_additions) {
		this.workorder_additions = workorder_additions;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Integer getPer_days() {
		return per_days;
	}
	public void setPer_days(Integer per_days) {
		this.per_days = per_days;
	}
	public Integer getTrainer_trainee() {
		return trainer_trainee;
	}
	public void setTrainer_trainee(Integer trainer_trainee) {
		this.trainer_trainee = trainer_trainee;
	}
	public boolean isPer_days_check() {
		return per_days_check;
	}
	public void setPer_days_check(boolean per_days_check) {
		this.per_days_check = per_days_check;
	}
	public boolean isTrainer_trainee_check() {
		return trainer_trainee_check;
	}
	public void setTrainer_trainee_check(boolean trainer_trainee_check) {
		this.trainer_trainee_check = trainer_trainee_check;
	}
	public Integer getInvoice_details() {
		return invoice_details;
	}
	public void setInvoice_details(Integer invoice_details) {
		this.invoice_details = invoice_details;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public Integer getWorkorder() {
		return workorder;
	}
	public void setWorkorder(Integer workorder) {
		this.workorder = workorder;
	}
	public Integer getDuration_hours() {
		return duration_hours;
	}
	public void setDuration_hours(Integer duration_hours) {
		this.duration_hours = duration_hours;
	}
	public Integer getDuration_days() {
		return duration_days;
	}
	public void setDuration_days(Integer duration_days) {
		this.duration_days = duration_days;
	}
	public Integer getTrainer_type() {
		return trainer_type;
	}
	public void setTrainer_type(Integer trainer_type) {
		this.trainer_type = trainer_type;
	}
	public Integer getNo_of_trainers() {
		return no_of_trainers;
	}
	public void setNo_of_trainers(Integer no_of_trainers) {
		this.no_of_trainers = no_of_trainers;
	}
	public Integer getNo_of_candidates() {
		return no_of_candidates;
	}
	public void setNo_of_candidates(Integer no_of_candidates) {
		this.no_of_candidates = no_of_candidates;
	}
	public Integer getNo_of_batches() {
		return no_of_batches;
	}
	public void setNo_of_batches(Integer no_of_batches) {
		this.no_of_batches = no_of_batches;
	}
	public Integer getModel_rate() {
		return model_rate;
	}
	public void setModel_rate(Integer model_rate) {
		this.model_rate = model_rate;
	}
	public boolean isDuration_days_check() {
		return duration_days_check;
	}
	public void setDuration_days_check(boolean duration_days_check) {
		this.duration_days_check = duration_days_check;
	}
	public boolean isDuration_hours_check() {
		return duration_hours_check;
	}
	public void setDuration_hours_check(boolean duration_hours_check) {
		this.duration_hours_check = duration_hours_check;
	}
	public boolean isNo_of_trainers_check() {
		return no_of_trainers_check;
	}
	public void setNo_of_trainers_check(boolean no_of_trainers_check) {
		this.no_of_trainers_check = no_of_trainers_check;
	}
	public boolean isNo_of_candidates_check() {
		return no_of_candidates_check;
	}
	public void setNo_of_candidates_check(boolean no_of_candidates_check) {
		this.no_of_candidates_check = no_of_candidates_check;
	}
	public boolean isModel_rate_check() {
		return model_rate_check;
	}
	public void setModel_rate_check(boolean model_rate_check) {
		this.model_rate_check = model_rate_check;
	}
	public boolean isNo_of_batches_check() {
		return no_of_batches_check;
	}
	public void setNo_of_batches_check(boolean no_of_batches_check) {
		this.no_of_batches_check = no_of_batches_check;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getMou() {
		return mou;
	}
	public void setMou(Integer mou) {
		this.mou = mou;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public Integer getYearid() {
		return yearid;
	}
	public void setYearid(Integer yearid) {
		this.yearid = yearid;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	/*public Integer getSector_id() {
		return sector_id;
	}
	public void setSector_id(Integer sector_id) {
		this.sector_id = sector_id;
	}*/
	public String getSector_name() {
		return sector_name;
	}
	public void setSector_name(String sector_name) {
		this.sector_name = sector_name;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getProgramid() {
		return programid;
	}
	public void setProgramid(Integer programid) {
		this.programid = programid;
	}
	public String getProgramname() {
		return programname;
	}
	public void setProgramname(String programname) {
		this.programname = programname;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getScheme_name() {
		return scheme_name;
	}
	public void setScheme_name(String scheme_name) {
		this.scheme_name = scheme_name;
	}
	/*public Integer getScheme_id() {
		return scheme_id;
	}
	public void setScheme_id(Integer scheme_id) {
		this.scheme_id = scheme_id;
	}
	public String getFile_name() {
		return file_name;
	}*/
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getBase64String() {
		return base64String;
	}
	public void setBase64String(String base64String) {
		this.base64String = base64String;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public List<Procurement> getUploadfiles() {
		return uploadfiles;
	}
	public void setUploadfiles(List<Procurement> uploadfiles) {
		this.uploadfiles = uploadfiles;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public String getFilePaths() {
		return filePaths;
	}
	public void setFilePaths(String filePaths) {
		this.filePaths = filePaths;
	}
	public String[] getFilePathsArr() {
		return filePathsArr;
	}
	public void setFilePathsArr(String[] filePathsArr) {
		this.filePathsArr = filePathsArr;
	}
	public List<FileModel> getFiles() {
		return files;
	}
	public void setFiles(List<FileModel> files) {
		this.files = files;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public Integer getVendorid() {
		return vendorid;
	}
	public void setVendorid(Integer vendorid) {
		this.vendorid = vendorid;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public Integer getProject() {
		return project;
	}
	public void setProject(Integer project) {
		this.project = project;
	}
	public Integer getProgram() {
		return program;
	}
	public void setProgram(Integer program) {
		this.program = program;
	}
	public Integer getVendor() {
		return vendor;
	}
	public void setVendor(Integer vendor) {
		this.vendor = vendor;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getWorkorder_id() {
		return workorder_id;
	}
	public void setWorkorder_id(String workorder_id) {
		this.workorder_id = workorder_id;
	}
	public Date getWorkorder_date() {
		return workorder_date;
	}
	public void setWorkorder_date(Date workorder_date) {
		this.workorder_date = workorder_date;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAgreement_file() {
		return agreement_file;
	}
	public void setAgreement_file(String agreement_file) {
		this.agreement_file = agreement_file;
	}
	public String getNote_file() {
		return note_file;
	}
	public void setNote_file(String note_file) {
		this.note_file = note_file;
	}
	public Timestamp getDate_created() {
		return date_created;
	}
	public void setDate_created(Timestamp date_created) {
		this.date_created = date_created;
	}
	public Integer getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(Integer financial_year) {
		this.financial_year = financial_year;
	}
	public Integer getScheme() {
		return scheme;
	}
	public void setScheme(Integer scheme) {
		this.scheme = scheme;
	}
	public String getOther1() {
		return other1;
	}
	public void setOther1(String other1) {
		this.other1 = other1;
	}
	public String getOther2() {
		return other2;
	}
	public void setOther2(String other2) {
		this.other2 = other2;
	}
	public Integer getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}
	public Integer getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(Integer approved_by) {
		this.approved_by = approved_by;
	}
	public Integer getOreder_status() {
		return oreder_status;
	}
	public void setOreder_status(Integer oreder_status) {
		this.oreder_status = oreder_status;
	}
	public Integer getUnlick_work_order() {
		return unlick_work_order;
	}
	public void setUnlick_work_order(Integer unlick_work_order) {
		this.unlick_work_order = unlick_work_order;
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
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getBudjet_type() {
		return budjet_type;
	}
	public void setBudjet_type(Integer budjet_type) {
		this.budjet_type = budjet_type;
	}
	public boolean isInclusive_tax() {
		return inclusive_tax;
	}
	public void setInclusive_tax(boolean inclusive_tax) {
		this.inclusive_tax = inclusive_tax;
	}
	public Integer getWork_status() {
		return work_status;
	}
	public void setWork_status(Integer work_status) {
		this.work_status = work_status;
	}
	public boolean isVendor_accepted() {
		return vendor_accepted;
	}
	public void setVendor_accepted(boolean vendor_accepted) {
		this.vendor_accepted = vendor_accepted;
	}
	public String getVendor_comment() {
		return vendor_comment;
	}
	public void setVendor_comment(String vendor_comment) {
		this.vendor_comment = vendor_comment;
	}
	public String getExisting_work_order_id() {
		return existing_work_order_id;
	}
	public void setExisting_work_order_id(String existing_work_order_id) {
		this.existing_work_order_id = existing_work_order_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDocument_to_submit() {
		return document_to_submit;
	}
	public void setDocument_to_submit(String document_to_submit) {
		this.document_to_submit = document_to_submit;
	}
	public String getDocument_path() {
		return document_path;
	}
	public void setDocument_path(String document_path) {
		this.document_path = document_path;
	}
	public Integer getNext_approver() {
		return next_approver;
	}
	public void setNext_approver(Integer next_approver) {
		this.next_approver = next_approver;
	}
	public Integer getIncharge() {
		return incharge;
	}
	public void setIncharge(Integer incharge) {
		this.incharge = incharge;
	}
	public String getMou_id() {
		return mou_id;
	}
	public void setMou_id(String mou_id) {
		this.mou_id = mou_id;
	}
	public Date getMou_date() {
		return mou_date;
	}
	public void setMou_date(Date mou_date) {
		this.mou_date = mou_date;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	public Integer getUnlock_work_order() {
		return unlock_work_order;
	}
	public void setUnlock_work_order(Integer unlock_work_order) {
		this.unlock_work_order = unlock_work_order;
	}
	public Integer getBudget_type() {
		return budget_type;
	}
	public void setBudget_type(Integer budget_type) {
		this.budget_type = budget_type;
	}
	public String getExisting_mou_id() {
		return existing_mou_id;
	}
	public void setExisting_mou_id(String existing_mou_id) {
		this.existing_mou_id = existing_mou_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
	 
	 
	
	
	
}	