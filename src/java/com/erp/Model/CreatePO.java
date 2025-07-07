package com.erp.Model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

import software.amazon.ion.Decimal;

public class CreatePO extends BaseModel {

	private static long serialVersionUID = 1L;

	
	
	public String assets;
	public String purchase_type;

	public Integer yearid;
	/* public String years; */
	/*
	 * public String purchaseotypename; public String purchasetypename; public
	 * Integer purchaseotypeid; public Integer purchasetypeid;
	 */
	public Integer purchaseotypeid;
	public Integer service_id;
	public Integer purchasetypeid;
	public Integer sectorid;
	/* public Integer vendorid; */
	public Integer serviceid;
	public String scheme_id;
	public String scheme_name;
	public String project_id;   
	public String project_name;
	public Integer programid;

	/* public String servicename; */
	public String program_id;
	public String program_name;
	public String sector_id;
	public String sector_name;
	public Integer vendor_id;
	/* public String vendorname; */
	public Integer po_id;
	public String location_name;
	public Integer qty;

	public Integer value;
	public String specifications;
	public String asset_name;
	public Integer installation_cost;
	public String programname;
	public String financial_year;
	public Integer po_type;
	public Integer p_type;
	/*
	 * public Integer service_id; public Integer program_id; public Integer
	 * sector_id; public Integer vendor_id;
	 */
	public String vendor_comment;
	public Integer order_no;
	public Date order_date;
	public Date need_by_date;
	public String address;
	public String amount_words;
	public Integer amount;
	public String instructions;
	public String puchaseorder_id;
	public String group_name;
	public String name;
	public String installation;

	public Integer recieved_qty;
	public Integer id;
	public Integer grn;
	public Integer po_details;
	public Integer vgrn_details;
	public String item_name;
	public Decimal rate;
	public Integer po_qty;
	public Integer received_qty;
	public Integer inspected_qty;
	public Integer rejected_qty;
	public Integer qc_qty;
	public Integer installation_status;
	public Timestamp installation_date;
	public String brand;
	public Integer location;
	public Integer created_by;
	public Date created_date;
	public Integer vendorid;
	public String vendorname;
	public String servicename;
	public Date from_date;
	public Date to_date;
	public String fromdate;
	public String todate;
	
	
	
	/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%WORK ORDER model class**************************/
	
	public String years;
	public Integer year;
	public Integer count;
	public String file_name;
	public String fileName;
	public String base64String;
	public String filepath;            
	public String folderName;
	public String filePaths;
	public String[] filePathsArr;
	public List<FileModel> files;
	public String image;
	public String image1;
	public Integer project;
	public Integer  program;
	public Integer  vendor;
	public String  workorder_id;
	public Date  workorder_date;
	public Integer  type;
	public Integer  status;
	public String  agreement_file;
	public String  note_file;
	public Timestamp  date_created;
	public Integer  scheme;
	public String  other1 ;
	public String  other2;
	public Integer approved_by;
	public Integer oreder_status;
	public Integer  unlick_work_order;
	public String reference;
	public Integer service;
	public Integer paybasemodel;
	public String subject;
	public Integer  budjet_type;
	public boolean  inclusive_tax ;
	public Integer work_status;
	public boolean  vendor_accepted;
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
	public Integer  invoice_details;
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
	public Integer workorder_additions;
	public Integer  per_days ;
	public Integer  trainer_trainee;
	public boolean per_days_check ;
	public boolean  trainer_trainee_check;	
	public String  segment_id;
	public String  district_id ;
	public double  opex_budgetvalue;
	public double capex_budgetvalue;
	 
	
	
	public Integer value11;
	public double rate11;
	public Integer duration_days11;
	public Integer no_of_trainers11;
	public boolean duration_days_check11;
	public boolean duration_days_trainer11;
	
	
	
	

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public Integer getValue11() {
		return value11;
	}    

	public void setValue11(Integer value11) {
		this.value11 = value11;
	}

	public double getRate11() {
		return rate11;
	}

	public void setRate11(double rate11) {
		this.rate11 = rate11;
	}

	public Integer getDuration_days11() {
		return duration_days11;
	}

	public void setDuration_days11(Integer duration_days11) {
		this.duration_days11 = duration_days11;
	}

	public Integer getNo_of_trainers11() {
		return no_of_trainers11;
	}

	public void setNo_of_trainers11(Integer no_of_trainers11) {
		this.no_of_trainers11 = no_of_trainers11;
	}

	public boolean isDuration_days_check11() {
		return duration_days_check11;
	}

	public void setDuration_days_check11(boolean duration_days_check11) {
		this.duration_days_check11 = duration_days_check11;
	}

	public boolean isDuration_days_trainer11() {
		return duration_days_trainer11;
	}

	public void setDuration_days_trainer11(boolean duration_days_trainer11) {
		this.duration_days_trainer11 = duration_days_trainer11;
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

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public String getScheme_id() {
		return scheme_id;
	}

	public void setScheme_id(String scheme_id) {
		this.scheme_id = scheme_id;
	}

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	/*
	 * public String getProgram_id() { return program_id; } public void
	 * setProgram_id(String program_id) { this.program_id = program_id; }
	 */
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public String getPuchaseorder_id() {
		return puchaseorder_id;
	}

	public void setPuchaseorder_id(String puchaseorder_id) {
		this.puchaseorder_id = puchaseorder_id;
	}

	public Integer getYearid() {
		return yearid;
	}

	public void setYearid(Integer yearid) {
		this.yearid = yearid;
	}

	public Integer getPurchaseotypeid() {
		return purchaseotypeid;
	}

	public void setPurchaseotypeid(Integer purchaseotypeid) {
		this.purchaseotypeid = purchaseotypeid;
	}

	public Integer getService_id() {
		return service_id;
	}

	public void setService_id(Integer service_id) {
		this.service_id = service_id;
	}

	public Integer getPurchasetypeid() {
		return purchasetypeid;
	}

	public void setPurchasetypeid(Integer purchasetypeid) {
		this.purchasetypeid = purchasetypeid;
	}

	public Integer getProgramid() {
		return programid;
	}

	public void setProgramid(Integer programid) {
		this.programid = programid;
	}

	public Integer getSectorid() {
		return sectorid;
	}

	public void setSectorid(Integer sectorid) {
		this.sectorid = sectorid;
	}

	public Integer getVendorid() {
		return vendorid;
	}

	public void setVendorid(Integer vendorid) {
		this.vendorid = vendorid;
	}

	public Integer getServiceid() {
		return serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public String getScheme_name() {
		return scheme_name;
	}

	public void setScheme_name(String scheme_name) {
		this.scheme_name = scheme_name;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getSector_id() {
		return sector_id;
	}

	public void setSector_id(String sector_id) {
		this.sector_id = sector_id;
	}

	public String getSector_name() {
		return sector_name;
	}

	public void setSector_name(String sector_name) {
		this.sector_name = sector_name;
	}

	public Integer getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}

	public Integer getPo_id() {
		return po_id;
	}

	public void setPo_id(Integer po_id) {
		this.po_id = po_id;
	}

	/*
	 * public String getAsset_name() { return asset_name; } public void
	 * setAsset_name(String asset_name) { this.asset_name = asset_name; }
	 */
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

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	/*
	 * public Integer getRate() { return rate; } public void setRate(Integer rate) {
	 * this.rate = rate; }
	 */
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	/*
	 * public String getInstallation_status() { return installation_status; } public
	 * void setInstallation_status(String installation_status) {
	 * this.installation_status = installation_status; }
	 */
	public Integer getInstallation_cost() {
		return installation_cost;
	}

	public void setInstallation_cost(Integer installation_cost) {
		this.installation_cost = installation_cost;
	}

	public String getFinancial_year() {
		return financial_year;
	}

	public void setFinancial_year(String financial_year) {
		this.financial_year = financial_year;
	}

	public Integer getPo_type() {
		return po_type;
	}

	public void setPo_type(Integer po_type) {
		this.po_type = po_type;
	}

	public Integer getP_type() {
		return p_type;
	}

	public void setP_type(Integer p_type) {
		this.p_type = p_type;
	}

	public String getVendor_comment() {
		return vendor_comment;
	}

	public void setVendor_comment(String vendor_comment) {
		this.vendor_comment = vendor_comment;
	}

	public Integer getOrder_no() {
		return order_no;
	}

	public void setOrder_no(Integer order_no) {
		this.order_no = order_no;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Date getNeed_by_date() {
		return need_by_date;
	}

	public void setNeed_by_date(Date need_by_date) {
		this.need_by_date = need_by_date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAmount_words() {
		return amount_words;
	}

	public void setAmount_words(String amount_words) {
		this.amount_words = amount_words;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getProgram_name() {
		return program_name;
	}

	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}

	public String getProgramname() {
		return programname;
	}

	public void setProgramname(String programname) {
		this.programname = programname;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		CreatePO.serialVersionUID = serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstallation() {
		return installation;
	}

	public void setInstallation(String installation) {
		this.installation = installation;
	}

	public Integer getRecieved_qty() {
		return recieved_qty;
	}

	public void setRecieved_qty(Integer recieved_qty) {
		this.recieved_qty = recieved_qty;
	}

	public Integer getGrn() {
		return grn;
	}

	public void setGrn(Integer grn) {
		this.grn = grn;
	}

	public Integer getPo_details() {
		return po_details;
	}

	public void setPo_details(Integer po_details) {
		this.po_details = po_details;
	}

	public Integer getVgrn_details() {
		return vgrn_details;
	}

	public void setVgrn_details(Integer vgrn_details) {
		this.vgrn_details = vgrn_details;
	}
	/*
	 * public Integer getAsset_name() { return asset_name; } public void
	 * setAsset_name(Integer asset_name) { this.asset_name = asset_name; }
	 */
	/*
	 * public Integer getItem_name() { return item_name; } public void
	 * setItem_name(Integer item_name) { this.item_name = item_name; }
	 */

	public Decimal getRate() {
		return rate;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public void setRate(Decimal rate) {
		this.rate = rate;
	}

	public Integer getPo_qty() {
		return po_qty;
	}

	public void setPo_qty(Integer po_qty) {
		this.po_qty = po_qty;
	}

	public Integer getReceived_qty() {
		return received_qty;
	}

	public void setReceived_qty(Integer received_qty) {
		this.received_qty = received_qty;
	}

	public Integer getInspected_qty() {
		return inspected_qty;
	}

	public void setInspected_qty(Integer inspected_qty) {
		this.inspected_qty = inspected_qty;
	}

	public Integer getRejected_qty() {
		return rejected_qty;
	}

	public void setRejected_qty(Integer rejected_qty) {
		this.rejected_qty = rejected_qty;
	}

	public Integer getQc_qty() {
		return qc_qty;
	}

	public void setQc_qty(Integer qc_qty) {
		this.qc_qty = qc_qty;
	}

	public Integer getInstallation_status() {
		return installation_status;
	}

	public void setInstallation_status(Integer installation_status) {
		this.installation_status = installation_status;
	}

	public Timestamp getInstallation_date() {
		return installation_date;
	}

	public void setInstallation_date(Timestamp installation_date) {
		this.installation_date = installation_date;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getProgram_id() {
		return program_id;
	}

	public void setProgram_id(String program_id) {
		this.program_id = program_id;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public String getAssets() {
		return assets;
	}

	public void setAssets(String assets) {
		this.assets = assets;
	}

	public String getPurchase_type() {
		return purchase_type;
	}

	public void setPurchase_type(String purchase_type) {
		this.purchase_type = purchase_type;
	}

		
		/*#############Getter Setters for Work Order ############*/
	
	
	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
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

	public String getFile_name() {
		return file_name;
	}

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


	public Integer getPaybasemodel() {
		return paybasemodel;
	}

	public void setPaybasemodel(Integer paybasemodel) {
		this.paybasemodel = paybasemodel;
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

	public Integer getDistrict() {
		return district;
	}

	public void setDistrict(Integer district) {
		this.district = district;
	}

	public Integer getMou() {
		return mou;
	}

	public void setMou(Integer mou) {
		this.mou = mou;
	}

	public Integer getInvoice_details() {
		return invoice_details;
	}

	public void setInvoice_details(Integer invoice_details) {
		this.invoice_details = invoice_details;
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

	public Integer getWorkorder_additions() {
		return workorder_additions;
	}

	public void setWorkorder_additions(Integer workorder_additions) {
		this.workorder_additions = workorder_additions;
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

	public String getSegment_id() {
		return segment_id;
	}

	public void setSegment_id(String segment_id) {
		this.segment_id = segment_id;
	}

	public String getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(String district_id) {
		this.district_id = district_id;
	}

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
	
	
	
	

	
	
	
	
	
	

}
