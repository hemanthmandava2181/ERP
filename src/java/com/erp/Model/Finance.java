package com.erp.Model;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class Finance extends BaseModel{
	
	private static final long serialVersionUID = 1L;
	public String liabilities_subhead;
	public Integer liabilities_head;
	public String liabilitieshead;
	public String liabilityhead;
	public Integer id;
	public String expense_account_name;
	public boolean status;
	public String location;
	public String name;
	public String address;
	public String tax_group_name;
	public String service_name;
	public String tax_group;
	public String account_name;
	public Integer tax_groupid;
	public Integer account_nature;
	public String account_type;
	public Integer gl_accountid;
	public String accounttype_name;
	public String accountnature_name;
	public String section_name;
	public Integer serviceid;
	public Integer vendortype;
	public Integer jvid;
	public Integer taxgroup;
	public Integer supplytype;
	public Integer taxsection;
	public double taxrate;
	public Date effectivefrom;
	public Date effectiveto;
	public Date effective_from;
	public Date effective_to;
	public String vendor_type;
	public Integer vendor_typeid;
	public String supply_type;
	public double tax_rate;
	public Integer tax_section;
	public Integer tax_account;
	public Integer supply_typeid;
	public Integer service;
	public Integer type_of_vehicle;
	public double rate_per_km;
	public String vehicle_name;
	public double rate_perkm;
	public Integer type_ofvehicle;
	public double rate_km;
	public Integer designation;
	public Integer grade;
	public Integer cader;
	public String description;
	public String designation_name;
	public String grade_name;
	public Integer caderid;
	public Integer gradeid;
	public Integer designationid;
	public String vehiclename;
	public String hours;
	public String claimtypename;
	public Integer claim_type;
	public double cities_incidental;
	public double other_incidental;
	public double stay_metro;
	public double stay_non_metro;
	public double mobile_benefits;
	public double internet_benefits;
	public Integer local_conveyance;
	public Integer location_id;
	public Integer rem_id;
	public String travel;
	public Integer purpose;
	public Integer sector;
	public Integer project;
	public Date from_date;
	public Date to_date;
	public String cost_center;
	public String claim_advance_id;
	public double amount;
	public Integer yearid;
	public String years;
	public Integer sector_id;
	public String sector_name;
	public String year_selected;
	public String project_name;
	public Integer year;
	public Integer count;
	public String existed_claim_id;
	public Integer financial_year;
	public String claim_reimbursement_id;
	public double advance_amount;
	public double claim_amount;
	public Integer claim_advanceid;
	public Integer gl_account;
	public double km;
	public Integer local_conveyance_types;
	public Integer claim_id;
	public Date details_date;
	public String customer_id;
	public String phone_number;
	public BigInteger mobile_number;
	public String email;
	public String web_site;
	public String pan_no;
	public String service_tax_no;
	public Integer status_of_person;
	public Integer status_of_person_service_tax;
	public Integer tds;
	public String gst_no;
	public Integer service_tax;
	public Integer tax_credit;
	public Integer overright_aggregate;
	public String tan_no;
	public String account_no;
	public String bank_name;
	public String ifsc;
	public String branch;
	public String contact_person_name;
	public String city;
	public String district;
	public String pincode;
	public String contact_person_designation;
	public String contact_person_mobile;
	public String contact_person_mail;
	public String registration_no;
	public String place_of_registration;
	public Date date_of_registration;
	public BigInteger experience;
	public double annual_turnover;
	public Integer nsda_affilcation;
	public Integer ssc_affilation;
	public String registering_authority;
	public String nsda_number;
	public String ssc_number;
	public Integer gst_registration;
	public String gst_reg_date;
	public BigInteger state;
	public Integer nature_of_service;
	public String gstregistration;
	public String state_name;
	public Integer programid;
	public String programname;
	public String servicename;
	public String scheme_name;
	public Integer scheme_id;
	public Integer accounts_receivable_header;
	public Date ref_date;
	public String descriptiondet;
	public Integer customer;
	public Integer scheme;
	public Integer program;
	public Date selected_date;
	public Date due_date;
	public Integer income_type;
	public String invoice_number;
	public boolean inclusive_tax;
	public String voucher_id;
	public String cost_centername;
	public String location_name;
	public String file_name;
	public String fileName;
	public String base64String;
	public String filepath;
	public List<Finance>uploadfiles;
	public String folderName;
	public String filePaths;
	public String[] filePathsArr;
	public List<FileModel> files;
	public String image;
	public String image1;
	public String document_path;
	public Integer vendorid;
	public String vendorname;
	public String voucher_number;
	public Integer work_order;
	public Date date;
	public Integer entry_type;
	public Integer expense_type;
	public double debit_amount;
	public double credit_amount;
	public String reason;
	public Integer purchase_order;
	public Integer mou;
	public String comments;
	public String documents_attached;
	public Date workorder_date;
	public Integer type;
	public String reference;
	public String subject;
	public Integer budjet_type;
	public String document_to_submit;
	public String workorder_id;
	public Integer vendor;
	public String vendor_name;
	public String program_name;
	public double total_amount;
	public Date todate;
	public Date fromdate;
	public Integer order_type;
	public String hsn_code;
	public String attachment;
	public Date invoice_date;
	public String item_description;
	public String segment_name;
	public String group_name;
	public Integer financialyear;
	public String budget_id;
	public Integer sdeigroup;
	public Integer schemename;
	public Integer sectorname;
	public Integer segmentname;
	public Integer hcplanned;
	public double capex_non_planned;
	public double capex_planned;
	public double capex_adnn_budget;
	public double totalbudget;
	public Integer physicaloutput;
	public String descriptions;
	public double opexplanned;
	public double opexnon_planned;
	public double opexadnn_planned;
	public double opextotal_budget;
	public double capextotal_budget;
	public String approvestatus;
	public Date created_date;
	public double release_amount;
	public String submittedby;
	public String approvedby;
	public String purposename;
	public String entrytype_name;
	public Date voucher_date;
	public Integer budgetid;
	public String title;
	public double planned;
	public Integer hc_planned;
	public double non_planned;
	public double adnn_budget;
	public double total_budget;
	public Integer physical_output;
	public double opex_planned;
	public double opex_non_planned;
	public double opex_adnn_planned;
	public double opex_total_budget;
	public double capex_total_budget;
	public String incometype;
	public Timestamp date_created;
	public String ordertype;
	public String sdei_groupname;
	
	
	
	
	
	private String voucher_name;
	private String invoice_status;
	private String invoice_id;
	/*private Date invoice_date;*/
	/*private Date due_date;*/
	private Double net_amount;
	/*private String service_name;*/   
	private String createdby;
	/*private String voucher_id;*/
	/*private String cost_center;*/
	/*private String workorder_id;*/   
	/*private Double amount;*/
	private Double paid_amount;
	/*private String project_name;*/
	/*private String program_name;*/
	private Double credit_total;         
	private Double debit_total;
	private Double credit_tax_amount;
	private Double debit_tax_amount;
	private String gl_account_name;
	private String title_description;
	/*private Double amount;*/
	/*private String document_path;*/
	private String document_name;
	private Date submitted_date;
	/*private String comments;*/
	private String invoice_name;
	private String created_by;
	private Integer workorder;
	private Double workorder_amount;
	public String voucherid;
	public Integer invoiceid;
	public Integer voucher;
	public String bank_account;
	public Integer journal_entry_header;
	public double diff_amount;
	public String signature_two;
	public String signature_one;
	public Date payment_date;
	public String reference_number;
	public Integer bank_gl_account;
	public double debit;
	public double credit;
	
	/* lavanya model */
	private String group_name1;
	private Integer type_id1;
	private Integer head_id1;
	private Integer income_id1;
	private Integer asset_id1;
	private Integer nature_id1;
	private Integer liability_id1;
	private Integer group_id1;
	private String subgroup_name1;
	private Integer subgroup_id1;
	private String account_name1;
	private String section_name1;
	private String term_name1;
	private String title1;
	private Double rate1;
	private Integer rate_type1;
	private Integer condition_days1;
	private Date condition_from_date1;
	private Date condition_to_date1;
	private Integer condition_type1;
	private String tax_section_name;
	private String tax_section_name1;
	private Double max_limit;
	private Double max_limit1;
	private Integer section_id;
	private Integer section_id1;
	private String deduction_type;
	private String deduction_type1;
	
	private Integer type_id;
	private String accounttype;
	private Integer head_id;
	private String gl_head_name;
	private Integer income_id;
	private String income_head_name;
	private Integer asset_id;
	private String asset_name;
	private Integer nature_id;
	private String asset_nature_name;
	private Integer liability_id;
	private Integer group_id;
	private String particulars;
	private String subgroup_name;
	private Integer subgroup_id;
	private Boolean checkstatus;
	private String gl_id;
	private String term_name;
	private Double rate;
	private Integer rate_type;
	private Integer condition_days;
	private Date condition_from_date;
	private Date condition_to_date;
	private Integer condition_type;
	public Integer claimtype;
	public String hour;
	public Integer localconveyance;
	public Integer locationid;
	public double internetbenefits;
	public double mobilebenefits;
	public double stay_nonmetro;
	public double staymetro;
	public double citiesincidental;
	public double otherincidental;
	
	
	
	
	
	
	private Integer previous_financial_year;
	private Double previous_amount;
   	private Integer glid;
	private Integer tax_id;
	private Integer no_of_candidates;
	private Integer no_of_trainers;
	
	private String invoice_check_name;
	private Double tds_igst_amount;
	private Double tds_cgst_amount;
	private Double tds_sgst_amount;
    private Double tds_194j;
    private Double gross_total;
    private String cheque_no;
    private Date cheque_date;
    private Date bank_date;
	private String purchaseorder_id;
	private String mou_id;
	private String note_generated_id;
    private Integer workorderid;
    private Integer mouid;
    private Integer purchaseorderid;
	private Integer vendor_id;
	private Integer invoicecount;
	private Integer reportingcount;
	private Integer cfocount;
	private Integer financecount;
	private Integer paymentcount;
	private Integer bookedcount;
	private Integer releasecount;
	private Integer holdcount;
	private Integer returnedcount;
	private String invoice_type;
	
	private String fy;
	private Integer tds_type;
	
	private Integer cost_id;
	/*private Double tax_rate;*/
	private String hsn_sac_code;
	/*private String tax_account;*/
	private Integer duration_hours;   
	private Integer duration_days;
	private Integer no_of_trainees;
	private Integer no_of_batches;
	private Double model_rate;
	/*private String location_name;*/
	private String tax_rate_value;
	private String tax_name;
	private String workorder_name;
	private String account_types;
	
	private String next_approver;    
	private String modified_by;
	private Date invoice_booked_date;
	private String o_type;
	private String order_name;
	private Integer order_id;
	private Double credit_balance;
	private Double debit_balance;
	private Double capex_budget_value;
	private Double opex_budget_value;
	private Double capex_spent_amount;
	private Double opex_spent_amount;
	private Integer check_id;

	private Double booked_amount;
	private Date previous_from_date;
	private Date previous_to_date;
	
	
	
	   

	
	
	
	
	
	
	
	
	
	    
	         
	
	
	    
	
	
	
	
	public Integer getCost_id() {
		return cost_id;
	}
	public void setCost_id(Integer cost_id) {
		this.cost_id = cost_id;
	}
	public Double getBooked_amount() {
		return booked_amount;
	}
	public void setBooked_amount(Double booked_amount) {
		this.booked_amount = booked_amount;
	}
	public Date getPrevious_from_date() {
		return previous_from_date;
	}
	public void setPrevious_from_date(Date previous_from_date) {
		this.previous_from_date = previous_from_date;
	}
	public Date getPrevious_to_date() {
		return previous_to_date;
	}
	public void setPrevious_to_date(Date previous_to_date) {
		this.previous_to_date = previous_to_date;
	}
	public String getSdei_groupname() {
		return sdei_groupname;
	}
	public void setSdei_groupname(String sdei_groupname) {
		this.sdei_groupname = sdei_groupname;
	}
	public Integer getLocalconveyance() {
		return localconveyance;
	}
	public void setLocalconveyance(Integer localconveyance) {
		this.localconveyance = localconveyance;
	}
	public Integer getLocationid() {
		return locationid;
	}
	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}
	public double getInternetbenefits() {
		return internetbenefits;
	}
	public void setInternetbenefits(double internetbenefits) {
		this.internetbenefits = internetbenefits;
	}
	public double getMobilebenefits() {
		return mobilebenefits;
	}
	public void setMobilebenefits(double mobilebenefits) {
		this.mobilebenefits = mobilebenefits;
	}
	public double getStay_nonmetro() {
		return stay_nonmetro;
	}
	public void setStay_nonmetro(double stay_nonmetro) {
		this.stay_nonmetro = stay_nonmetro;
	}
	public double getStaymetro() {
		return staymetro;
	}
	public void setStaymetro(double staymetro) {
		this.staymetro = staymetro;
	}
	public double getCitiesincidental() {
		return citiesincidental;
	}
	public void setCitiesincidental(double citiesincidental) {
		this.citiesincidental = citiesincidental;
	}
	public double getOtherincidental() {
		return otherincidental;
	}
	public void setOtherincidental(double otherincidental) {
		this.otherincidental = otherincidental;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public Integer getClaimtype() {
		return claimtype;
	}
	public void setClaimtype(Integer claimtype) {
		this.claimtype = claimtype;
	}
	public String getClaimtypename() {
		return claimtypename;
	}
	public void setClaimtypename(String claimtypename) {
		this.claimtypename = claimtypename;
	}
	public String getYear_selected() {
		return year_selected;
	}
	public void setYear_selected(String year_selected) {
		this.year_selected = year_selected;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public Integer getHead_id() {
		return head_id;
	}
	public void setHead_id(Integer head_id) {
		this.head_id = head_id;
	}
	public String getGl_head_name() {
		return gl_head_name;
	}
	public void setGl_head_name(String gl_head_name) {
		this.gl_head_name = gl_head_name;
	}
	public Integer getIncome_id() {
		return income_id;
	}
	public void setIncome_id(Integer income_id) {
		this.income_id = income_id;
	}
	public String getIncome_head_name() {
		return income_head_name;
	}
	public void setIncome_head_name(String income_head_name) {
		this.income_head_name = income_head_name;
	}
	public Integer getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(Integer asset_id) {
		this.asset_id = asset_id;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}
	public Integer getNature_id() {
		return nature_id;
	}
	public void setNature_id(Integer nature_id) {
		this.nature_id = nature_id;
	}
	public String getAsset_nature_name() {
		return asset_nature_name;
	}
	public void setAsset_nature_name(String asset_nature_name) {
		this.asset_nature_name = asset_nature_name;
	}
	public Integer getLiability_id() {
		return liability_id;
	}
	public void setLiability_id(Integer liability_id) {
		this.liability_id = liability_id;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getSubgroup_name() {
		return subgroup_name;
	}
	public void setSubgroup_name(String subgroup_name) {
		this.subgroup_name = subgroup_name;
	}
	public Integer getSubgroup_id() {
		return subgroup_id;
	}
	public void setSubgroup_id(Integer subgroup_id) {
		this.subgroup_id = subgroup_id;
	}
	public Boolean getCheckstatus() {
		return checkstatus;
	}
	public void setCheckstatus(Boolean checkstatus) {
		this.checkstatus = checkstatus;
	}
	public String getGl_id() {
		return gl_id;
	}
	public void setGl_id(String gl_id) {
		this.gl_id = gl_id;
	}
	public String getTerm_name() {
		return term_name;
	}
	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Integer getRate_type() {
		return rate_type;
	}
	public void setRate_type(Integer rate_type) {
		this.rate_type = rate_type;
	}
	public Integer getCondition_days() {
		return condition_days;
	}
	public void setCondition_days(Integer condition_days) {
		this.condition_days = condition_days;
	}
	public Date getCondition_from_date() {
		return condition_from_date;
	}
	public void setCondition_from_date(Date condition_from_date) {
		this.condition_from_date = condition_from_date;
	}
	public Date getCondition_to_date() {
		return condition_to_date;
	}
	public void setCondition_to_date(Date condition_to_date) {
		this.condition_to_date = condition_to_date;
	}
	public Integer getCondition_type() {
		return condition_type;
	}
	public void setCondition_type(Integer condition_type) {
		this.condition_type = condition_type;
	}
	public String getGroup_name1() {
		return group_name1;
	}
	public void setGroup_name1(String group_name1) {
		this.group_name1 = group_name1;
	}
	public Integer getType_id1() {
		return type_id1;
	}
	public void setType_id1(Integer type_id1) {
		this.type_id1 = type_id1;
	}
	public Integer getHead_id1() {
		return head_id1;
	}
	public void setHead_id1(Integer head_id1) {
		this.head_id1 = head_id1;
	}
	public Integer getIncome_id1() {
		return income_id1;
	}
	public void setIncome_id1(Integer income_id1) {
		this.income_id1 = income_id1;
	}
	public Integer getAsset_id1() {
		return asset_id1;
	}
	public void setAsset_id1(Integer asset_id1) {
		this.asset_id1 = asset_id1;
	}
	public Integer getNature_id1() {
		return nature_id1;
	}
	public void setNature_id1(Integer nature_id1) {
		this.nature_id1 = nature_id1;
	}
	public Integer getLiability_id1() {
		return liability_id1;
	}
	public void setLiability_id1(Integer liability_id1) {
		this.liability_id1 = liability_id1;
	}
	public Integer getGroup_id1() {
		return group_id1;
	}
	public void setGroup_id1(Integer group_id1) {
		this.group_id1 = group_id1;
	}
	public String getSubgroup_name1() {
		return subgroup_name1;
	}
	public void setSubgroup_name1(String subgroup_name1) {
		this.subgroup_name1 = subgroup_name1;
	}
	public Integer getSubgroup_id1() {
		return subgroup_id1;
	}
	public void setSubgroup_id1(Integer subgroup_id1) {
		this.subgroup_id1 = subgroup_id1;
	}
	public String getAccount_name1() {
		return account_name1;
	}
	public void setAccount_name1(String account_name1) {
		this.account_name1 = account_name1;
	}
	public String getSection_name1() {
		return section_name1;
	}
	public void setSection_name1(String section_name1) {
		this.section_name1 = section_name1;
	}
	public String getTerm_name1() {
		return term_name1;
	}
	public void setTerm_name1(String term_name1) {
		this.term_name1 = term_name1;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public Double getRate1() {
		return rate1;
	}
	public void setRate1(Double rate1) {
		this.rate1 = rate1;
	}
	public Integer getRate_type1() {
		return rate_type1;
	}
	public void setRate_type1(Integer rate_type1) {
		this.rate_type1 = rate_type1;
	}
	public Integer getCondition_days1() {
		return condition_days1;
	}
	public void setCondition_days1(Integer condition_days1) {
		this.condition_days1 = condition_days1;
	}
	public Date getCondition_from_date1() {
		return condition_from_date1;
	}
	public void setCondition_from_date1(Date condition_from_date1) {
		this.condition_from_date1 = condition_from_date1;
	}
	public Date getCondition_to_date1() {
		return condition_to_date1;
	}
	public void setCondition_to_date1(Date condition_to_date1) {
		this.condition_to_date1 = condition_to_date1;
	}
	public Integer getCondition_type1() {
		return condition_type1;
	}
	public void setCondition_type1(Integer condition_type1) {
		this.condition_type1 = condition_type1;
	}
	public String getTax_section_name() {
		return tax_section_name;
	}
	public void setTax_section_name(String tax_section_name) {
		this.tax_section_name = tax_section_name;
	}
	public String getTax_section_name1() {
		return tax_section_name1;
	}
	public void setTax_section_name1(String tax_section_name1) {
		this.tax_section_name1 = tax_section_name1;
	}
	public Double getMax_limit() {
		return max_limit;
	}
	public void setMax_limit(Double max_limit) {
		this.max_limit = max_limit;
	}
	public Double getMax_limit1() {
		return max_limit1;
	}
	public void setMax_limit1(Double max_limit1) {
		this.max_limit1 = max_limit1;
	}
	public Integer getSection_id() {
		return section_id;
	}
	public void setSection_id(Integer section_id) {
		this.section_id = section_id;
	}
	public Integer getSection_id1() {
		return section_id1;
	}
	public void setSection_id1(Integer section_id1) {
		this.section_id1 = section_id1;
	}
	public String getDeduction_type() {
		return deduction_type;
	}
	public void setDeduction_type(String deduction_type) {
		this.deduction_type = deduction_type;
	}
	public String getDeduction_type1() {
		return deduction_type1;
	}
	public void setDeduction_type1(String deduction_type1) {
		this.deduction_type1 = deduction_type1;
	}
	public String getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public String getSignature_two() {
		return signature_two;
	}
	public void setSignature_two(String signature_two) {
		this.signature_two = signature_two;
	}
	public String getSignature_one() {
		return signature_one;
	}
	public void setSignature_one(String signature_one) {
		this.signature_one = signature_one;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public String getReference_number() {
		return reference_number;
	}
	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}
	public Integer getBank_gl_account() {
		return bank_gl_account;
	}
	public void setBank_gl_account(Integer bank_gl_account) {
		this.bank_gl_account = bank_gl_account;
	}
	public double getDiff_amount() {
		return diff_amount;
	}
	public void setDiff_amount(double diff_amount) {
		this.diff_amount = diff_amount;
	}
	public Integer getJournal_entry_header() {
		return journal_entry_header;
	}
	public void setJournal_entry_header(Integer journal_entry_header) {
		this.journal_entry_header = journal_entry_header;
	}
	public String getBank_account() {
		return bank_account;
	}
	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}
	public Integer getVoucher() {
		return voucher;
	}
	public void setVoucher(Integer voucher) {
		this.voucher = voucher;
	}
	public Integer getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(Integer invoiceid) {
		this.invoiceid = invoiceid;
	}
	public String getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(String voucherid) {
		this.voucherid = voucherid;
	}
	public Integer getJvid() {
		return jvid;
	}
	public void setJvid(Integer jvid) {
		this.jvid = jvid;
	}
	public String getVoucher_name() {
		return voucher_name;
	}
	public void setVoucher_name(String voucher_name) {
		this.voucher_name = voucher_name;
	}
	public String getInvoice_status() {
		return invoice_status;
	}
	public void setInvoice_status(String invoice_status) {
		this.invoice_status = invoice_status;
	}
	public String getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}
	public Double getNet_amount() {
		return net_amount;
	}
	public void setNet_amount(Double net_amount) {
		this.net_amount = net_amount;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public Double getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(Double paid_amount) {
		this.paid_amount = paid_amount;
	}
	public Double getCredit_total() {
		return credit_total;
	}
	public void setCredit_total(Double credit_total) {
		this.credit_total = credit_total;
	}
	public Double getDebit_total() {
		return debit_total;
	}
	public void setDebit_total(Double debit_total) {
		this.debit_total = debit_total;
	}
	public Double getCredit_tax_amount() {
		return credit_tax_amount;
	}
	public void setCredit_tax_amount(Double credit_tax_amount) {
		this.credit_tax_amount = credit_tax_amount;
	}
	public Double getDebit_tax_amount() {
		return debit_tax_amount;
	}
	public void setDebit_tax_amount(Double debit_tax_amount) {
		this.debit_tax_amount = debit_tax_amount;
	}
	public String getGl_account_name() {
		return gl_account_name;
	}
	public void setGl_account_name(String gl_account_name) {
		this.gl_account_name = gl_account_name;
	}
	public String getTitle_description() {
		return title_description;
	}
	public void setTitle_description(String title_description) {
		this.title_description = title_description;
	}
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public Date getSubmitted_date() {
		return submitted_date;
	}
	public void setSubmitted_date(Date submitted_date) {
		this.submitted_date = submitted_date;
	}
	public String getInvoice_name() {
		return invoice_name;
	}
	public void setInvoice_name(String invoice_name) {
		this.invoice_name = invoice_name;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Integer getWorkorder() {
		return workorder;
	}
	public void setWorkorder(Integer workorder) {
		this.workorder = workorder;
	}
	public Double getWorkorder_amount() {
		return workorder_amount;
	}
	public void setWorkorder_amount(Double workorder_amount) {
		this.workorder_amount = workorder_amount;
	}
	public Timestamp getDate_created() {
		return date_created;
	}
	public void setDate_created(Timestamp date_created) {
		this.date_created = date_created;
	}
	public String getIncometype() {
		return incometype;
	}
	public void setIncometype(String incometype) {
		this.incometype = incometype;
	}
	public double getPlanned() {
		return planned;
	}
	public void setPlanned(double planned) {
		this.planned = planned;
	}
	public Integer getHc_planned() {
		return hc_planned;
	}
	public void setHc_planned(Integer hc_planned) {
		this.hc_planned = hc_planned;
	}
	public double getNon_planned() {
		return non_planned;
	}
	public void setNon_planned(double non_planned) {
		this.non_planned = non_planned;
	}
	public double getAdnn_budget() {
		return adnn_budget;
	}
	public void setAdnn_budget(double adnn_budget) {
		this.adnn_budget = adnn_budget;
	}
	public double getTotal_budget() {
		return total_budget;
	}
	public void setTotal_budget(double total_budget) {
		this.total_budget = total_budget;
	}
	public Integer getPhysical_output() {
		return physical_output;
	}
	public void setPhysical_output(Integer physical_output) {
		this.physical_output = physical_output;
	}
	public double getOpex_planned() {
		return opex_planned;
	}
	public void setOpex_planned(double opex_planned) {
		this.opex_planned = opex_planned;
	}
	public double getOpex_non_planned() {
		return opex_non_planned;
	}
	public void setOpex_non_planned(double opex_non_planned) {
		this.opex_non_planned = opex_non_planned;
	}
	public double getOpex_adnn_planned() {
		return opex_adnn_planned;
	}
	public void setOpex_adnn_planned(double opex_adnn_planned) {
		this.opex_adnn_planned = opex_adnn_planned;
	}
	public double getOpex_total_budget() {
		return opex_total_budget;
	}
	public void setOpex_total_budget(double opex_total_budget) {
		this.opex_total_budget = opex_total_budget;
	}
	public double getCapex_total_budget() {
		return capex_total_budget;
	}
	public void setCapex_total_budget(double capex_total_budget) {
		this.capex_total_budget = capex_total_budget;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getBudgetid() {
		return budgetid;
	}
	public void setBudgetid(Integer budgetid) {
		this.budgetid = budgetid;
	}
	public Date getVoucher_date() {
		return voucher_date;
	}
	public void setVoucher_date(Date voucher_date) {
		this.voucher_date = voucher_date;
	}
	public String getEntrytype_name() {
		return entrytype_name;
	}
	public void setEntrytype_name(String entrytype_name) {
		this.entrytype_name = entrytype_name;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getPurposename() {
		return purposename;
	}
	public void setPurposename(String purposename) {
		this.purposename = purposename;
	}
	public double getRelease_amount() {
		return release_amount;
	}
	public void setRelease_amount(double release_amount) {
		this.release_amount = release_amount;
	}
	public String getSubmittedby() {
		return submittedby;
	}
	public void setSubmittedby(String submittedby) {
		this.submittedby = submittedby;
	}
	public String getApprovedby() {
		return approvedby;
	}
	public void setApprovedby(String approvedby) {
		this.approvedby = approvedby;
	}
	public String getApprovestatus() {
		return approvestatus;
	}
	public void setApprovestatus(String approvestatus) {
		this.approvestatus = approvestatus;
	}
	public Integer getFinancialyear() {
		return financialyear;
	}
	public void setFinancialyear(Integer financialyear) {
		this.financialyear = financialyear;
	}
	public String getBudget_id() {
		return budget_id;
	}
	public void setBudget_id(String budget_id) {
		this.budget_id = budget_id;
	}
	public Integer getSdeigroup() {
		return sdeigroup;
	}
	public void setSdeigroup(Integer sdeigroup) {
		this.sdeigroup = sdeigroup;
	}
	public Integer getSchemename() {
		return schemename;
	}
	public void setSchemename(Integer schemename) {
		this.schemename = schemename;
	}
	public Integer getSectorname() {
		return sectorname;
	}
	public void setSectorname(Integer sectorname) {
		this.sectorname = sectorname;
	}
	public Integer getSegmentname() {
		return segmentname;
	}
	public void setSegmentname(Integer segmentname) {
		this.segmentname = segmentname;
	}
	public Integer getHcplanned() {
		return hcplanned;
	}
	public void setHcplanned(Integer hcplanned) {
		this.hcplanned = hcplanned;
	}
	public double getCapex_non_planned() {
		return capex_non_planned;
	}
	public void setCapex_non_planned(double capex_non_planned) {
		this.capex_non_planned = capex_non_planned;
	}
	public double getCapex_planned() {
		return capex_planned;
	}
	public void setCapex_planned(double capex_planned) {
		this.capex_planned = capex_planned;
	}
	public double getCapex_adnn_budget() {
		return capex_adnn_budget;
	}
	public void setCapex_adnn_budget(double capex_adnn_budget) {
		this.capex_adnn_budget = capex_adnn_budget;
	}
	public double getTotalbudget() {
		return totalbudget;
	}
	public void setTotalbudget(double totalbudget) {
		this.totalbudget = totalbudget;
	}
	public Integer getPhysicaloutput() {
		return physicaloutput;
	}
	public void setPhysicaloutput(Integer physicaloutput) {
		this.physicaloutput = physicaloutput;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	public double getOpexplanned() {
		return opexplanned;
	}
	public void setOpexplanned(double opexplanned) {
		this.opexplanned = opexplanned;
	}
	public double getOpexnon_planned() {
		return opexnon_planned;
	}
	public void setOpexnon_planned(double opexnon_planned) {
		this.opexnon_planned = opexnon_planned;
	}
	public double getOpexadnn_planned() {
		return opexadnn_planned;
	}
	public void setOpexadnn_planned(double opexadnn_planned) {
		this.opexadnn_planned = opexadnn_planned;
	}
	public double getOpextotal_budget() {
		return opextotal_budget;
	}
	public void setOpextotal_budget(double opextotal_budget) {
		this.opextotal_budget = opextotal_budget;
	}
	public double getCapextotal_budget() {
		return capextotal_budget;
	}
	public void setCapextotal_budget(double capextotal_budget) {
		this.capextotal_budget = capextotal_budget;
	}
	public String getSegment_name() {
		return segment_name;
	}
	public void setSegment_name(String segment_name) {
		this.segment_name = segment_name;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public Integer getOrder_type() {
		return order_type;
	}
	public void setOrder_type(Integer order_type) {
		this.order_type = order_type;
	}
	public String getHsn_code() {
		return hsn_code;
	}
	public void setHsn_code(String hsn_code) {
		this.hsn_code = hsn_code;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public Date getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getProgram_name() {
		return program_name;
	}
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Integer getVendor() {
		return vendor;
	}
	public void setVendor(Integer vendor) {
		this.vendor = vendor;
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
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
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
	public String getDocument_to_submit() {
		return document_to_submit;
	}
	public void setDocument_to_submit(String document_to_submit) {
		this.document_to_submit = document_to_submit;
	}
	public String getWorkorder_id() {
		return workorder_id;
	}
	public void setWorkorder_id(String workorder_id) {
		this.workorder_id = workorder_id;
	}
	public String getVoucher_number() {
		return voucher_number;
	}
	public void setVoucher_number(String voucher_number) {
		this.voucher_number = voucher_number;
	}
	public Integer getWork_order() {
		return work_order;
	}
	public void setWork_order(Integer work_order) {
		this.work_order = work_order;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getEntry_type() {
		return entry_type;
	}
	public void setEntry_type(Integer entry_type) {
		this.entry_type = entry_type;
	}
	public Integer getExpense_type() {
		return expense_type;
	}
	public void setExpense_type(Integer expense_type) {
		this.expense_type = expense_type;
	}
	public double getDebit_amount() {
		return debit_amount;
	}
	public void setDebit_amount(double debit_amount) {
		this.debit_amount = debit_amount;
	}
	public double getCredit_amount() {
		return credit_amount;
	}
	public void setCredit_amount(double credit_amount) {
		this.credit_amount = credit_amount;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getPurchase_order() {
		return purchase_order;
	}
	public void setPurchase_order(Integer purchase_order) {
		this.purchase_order = purchase_order;
	}
	public Integer getMou() {
		return mou;
	}
	public void setMou(Integer mou) {
		this.mou = mou;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDocuments_attached() {
		return documents_attached;
	}
	public void setDocuments_attached(String documents_attached) {
		this.documents_attached = documents_attached;
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
	public String getDocument_path() {
		return document_path;
	}
	public void setDocument_path(String document_path) {
		this.document_path = document_path;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public List<Finance> getUploadfiles() {
		return uploadfiles;
	}
	public void setUploadfiles(List<Finance> uploadfiles) {
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
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public Integer getCustomer() {
		return customer;
	}
	public void setCustomer(Integer customer) {
		this.customer = customer;
	}
	public Integer getScheme() {
		return scheme;
	}
	public void setScheme(Integer scheme) {
		this.scheme = scheme;
	}
	public Integer getProgram() {
		return program;
	}
	public void setProgram(Integer program) {
		this.program = program;
	}
	public Date getSelected_date() {
		return selected_date;
	}
	public void setSelected_date(Date selected_date) {
		this.selected_date = selected_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Integer getIncome_type() {
		return income_type;
	}
	public void setIncome_type(Integer income_type) {
		this.income_type = income_type;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public boolean isInclusive_tax() {
		return inclusive_tax;
	}
	public void setInclusive_tax(boolean inclusive_tax) {
		this.inclusive_tax = inclusive_tax;
	}
	public String getVoucher_id() {
		return voucher_id;
	}
	public void setVoucher_id(String voucher_id) {
		this.voucher_id = voucher_id;
	}
	public String getCost_centername() {
		return cost_centername;
	}
	public void setCost_centername(String cost_centername) {
		this.cost_centername = cost_centername;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public Integer getAccounts_receivable_header() {
		return accounts_receivable_header;
	}
	public void setAccounts_receivable_header(Integer accounts_receivable_header) {
		this.accounts_receivable_header = accounts_receivable_header;
	}
	public Date getRef_date() {
		return ref_date;
	}
	public void setRef_date(Date ref_date) {
		this.ref_date = ref_date;
	}
	public String getDescriptiondet() {
		return descriptiondet;
	}
	public void setDescriptiondet(String descriptiondet) {
		this.descriptiondet = descriptiondet;
	}
	public String getScheme_name() {
		return scheme_name;
	}
	public void setScheme_name(String scheme_name) {
		this.scheme_name = scheme_name;
	}
	public Integer getScheme_id() {
		return scheme_id;
	}
	public void setScheme_id(Integer scheme_id) {
		this.scheme_id = scheme_id;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
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
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getGstregistration() {
		return gstregistration;
	}
	public void setGstregistration(String gstregistration) {
		this.gstregistration = gstregistration;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public BigInteger getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(BigInteger mobile_number) {
		this.mobile_number = mobile_number;
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
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getService_tax_no() {
		return service_tax_no;
	}
	public void setService_tax_no(String service_tax_no) {
		this.service_tax_no = service_tax_no;
	}
	public Integer getStatus_of_person() {
		return status_of_person;
	}
	public void setStatus_of_person(Integer status_of_person) {
		this.status_of_person = status_of_person;
	}
	public Integer getStatus_of_person_service_tax() {
		return status_of_person_service_tax;
	}
	public void setStatus_of_person_service_tax(Integer status_of_person_service_tax) {
		this.status_of_person_service_tax = status_of_person_service_tax;
	}
	public Integer getTds() {
		return tds;
	}
	public void setTds(Integer tds) {
		this.tds = tds;
	}
	public String getGst_no() {
		return gst_no;
	}
	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}
	public Integer getService_tax() {
		return service_tax;
	}
	public void setService_tax(Integer service_tax) {
		this.service_tax = service_tax;
	}
	public Integer getTax_credit() {
		return tax_credit;
	}
	public void setTax_credit(Integer tax_credit) {
		this.tax_credit = tax_credit;
	}
	public Integer getOverright_aggregate() {
		return overright_aggregate;
	}
	public void setOverright_aggregate(Integer overright_aggregate) {
		this.overright_aggregate = overright_aggregate;
	}
	public String getTan_no() {
		return tan_no;
	}
	public void setTan_no(String tan_no) {
		this.tan_no = tan_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getContact_person_name() {
		return contact_person_name;
	}
	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
	public String getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}
	public String getPlace_of_registration() {
		return place_of_registration;
	}
	public void setPlace_of_registration(String place_of_registration) {
		this.place_of_registration = place_of_registration;
	}
	public Date getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(Date date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public BigInteger getExperience() {
		return experience;
	}
	public void setExperience(BigInteger experience) {
		this.experience = experience;
	}
	public double getAnnual_turnover() {
		return annual_turnover;
	}
	public void setAnnual_turnover(double annual_turnover) {
		this.annual_turnover = annual_turnover;
	}
	public Integer getNsda_affilcation() {
		return nsda_affilcation;
	}
	public void setNsda_affilcation(Integer nsda_affilcation) {
		this.nsda_affilcation = nsda_affilcation;
	}
	public Integer getSsc_affilation() {
		return ssc_affilation;
	}
	public void setSsc_affilation(Integer ssc_affilation) {
		this.ssc_affilation = ssc_affilation;
	}
	public String getRegistering_authority() {
		return registering_authority;
	}
	public void setRegistering_authority(String registering_authority) {
		this.registering_authority = registering_authority;
	}
	public String getNsda_number() {
		return nsda_number;
	}
	public void setNsda_number(String nsda_number) {
		this.nsda_number = nsda_number;
	}
	public String getSsc_number() {
		return ssc_number;
	}
	public void setSsc_number(String ssc_number) {
		this.ssc_number = ssc_number;
	}
	public Integer getGst_registration() {
		return gst_registration;
	}
	public void setGst_registration(Integer gst_registration) {
		this.gst_registration = gst_registration;
	}
	public String getGst_reg_date() {
		return gst_reg_date;
	}
	public void setGst_reg_date(String gst_reg_date) {
		this.gst_reg_date = gst_reg_date;
	}
	public BigInteger getState() {
		return state;
	}
	public void setState(BigInteger state) {
		this.state = state;
	}
	public Integer getNature_of_service() {
		return nature_of_service;
	}
	public void setNature_of_service(Integer nature_of_service) {
		this.nature_of_service = nature_of_service;
	}
	public Integer getGl_account() {
		return gl_account;
	}
	public void setGl_account(Integer gl_account) {
		this.gl_account = gl_account;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public Integer getLocal_conveyance_types() {
		return local_conveyance_types;
	}
	public void setLocal_conveyance_types(Integer local_conveyance_types) {
		this.local_conveyance_types = local_conveyance_types;
	}
	public Integer getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(Integer claim_id) {
		this.claim_id = claim_id;
	}
	public Date getDetails_date() {
		return details_date;
	}
	public void setDetails_date(Date details_date) {
		this.details_date = details_date;
	}
	public String getClaim_reimbursement_id() {
		return claim_reimbursement_id;
	}
	public void setClaim_reimbursement_id(String claim_reimbursement_id) {
		this.claim_reimbursement_id = claim_reimbursement_id;
	}
	public double getAdvance_amount() {
		return advance_amount;
	}
	public void setAdvance_amount(double advance_amount) {
		this.advance_amount = advance_amount;
	}
	public double getClaim_amount() {
		return claim_amount;
	}
	public void setClaim_amount(double claim_amount) {
		this.claim_amount = claim_amount;
	}
	public Integer getClaim_advanceid() {
		return claim_advanceid;
	}
	public void setClaim_advanceid(Integer claim_advanceid) {
		this.claim_advanceid = claim_advanceid;
	}
	public String getExisted_claim_id() {
		return existed_claim_id;
	}
	public void setExisted_claim_id(String existed_claim_id) {
		this.existed_claim_id = existed_claim_id;
	}
	public Integer getFinancial_year() {
		return financial_year;
	}
	public void setFinancial_year(Integer financial_year) {
		this.financial_year = financial_year;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
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
	public Integer getSector_id() {
		return sector_id;
	}
	public void setSector_id(Integer sector_id) {
		this.sector_id = sector_id;
	}
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
	public Integer getPurpose() {
		return purpose;
	}
	public void setPurpose(Integer purpose) {
		this.purpose = purpose;
	}
	public Integer getSector() {
		return sector;
	}
	public void setSector(Integer sector) {
		this.sector = sector;
	}
	public Integer getProject() {
		return project;
	}
	public void setProject(Integer project) {
		this.project = project;
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
	public String getCost_center() {
		return cost_center;
	}
	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}
	public String getClaim_advance_id() {
		return claim_advance_id;
	}
	public void setClaim_advance_id(String claim_advance_id) {
		this.claim_advance_id = claim_advance_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Integer getRem_id() {
		return rem_id;
	}
	public void setRem_id(Integer rem_id) {
		this.rem_id = rem_id;
	}
	public String getTravel() {
		return travel;
	}
	public void setTravel(String travel) {
		this.travel = travel;
	}
	public double getCities_incidental() {
		return cities_incidental;
	}
	public void setCities_incidental(double cities_incidental) {
		this.cities_incidental = cities_incidental;
	}
	public double getOther_incidental() {
		return other_incidental;
	}
	public void setOther_incidental(double other_incidental) {
		this.other_incidental = other_incidental;
	}
	public double getStay_metro() {
		return stay_metro;
	}
	public void setStay_metro(double stay_metro) {
		this.stay_metro = stay_metro;
	}
	public double getStay_non_metro() {
		return stay_non_metro;
	}
	public void setStay_non_metro(double stay_non_metro) {
		this.stay_non_metro = stay_non_metro;
	}
	public double getMobile_benefits() {
		return mobile_benefits;
	}
	public void setMobile_benefits(double mobile_benefits) {
		this.mobile_benefits = mobile_benefits;
	}
	public double getInternet_benefits() {
		return internet_benefits;
	}
	public void setInternet_benefits(double internet_benefits) {
		this.internet_benefits = internet_benefits;
	}
	public Integer getLocal_conveyance() {
		return local_conveyance;
	}
	public void setLocal_conveyance(Integer local_conveyance) {
		this.local_conveyance = local_conveyance;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public Integer getClaim_type() {
		return claim_type;
	}
	public void setClaim_type(Integer claim_type) {
		this.claim_type = claim_type;
	}
	public Integer getCaderid() {
		return caderid;
	}
	public void setCaderid(Integer caderid) {
		this.caderid = caderid;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	public Integer getDesignationid() {
		return designationid;
	}
	public void setDesignationid(Integer designationid) {
		this.designationid = designationid;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDesignation_name() {
		return designation_name;
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	public String getGrade_name() {
		return grade_name;
	}
	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}
	public Integer getDesignation() {
		return designation;
	}
	public void setDesignation(Integer designation) {
		this.designation = designation;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getCader() {
		return cader;
	}
	public void setCader(Integer cader) {
		this.cader = cader;
	}
	public Integer getType_ofvehicle() {
		return type_ofvehicle;
	}
	public void setType_ofvehicle(Integer type_ofvehicle) {
		this.type_ofvehicle = type_ofvehicle;
	}
	public double getRate_km() {
		return rate_km;
	}
	public void setRate_km(double rate_km) {
		this.rate_km = rate_km;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public double getRate_perkm() {
		return rate_perkm;
	}
	public void setRate_perkm(double rate_perkm) {
		this.rate_perkm = rate_perkm;
	}
	public double getRate_per_km() {
		return rate_per_km;
	}
	public void setRate_per_km(double rate_per_km) {
		this.rate_per_km = rate_per_km;
	}
	public Integer getType_of_vehicle() {
		return type_of_vehicle;
	}
	public void setType_of_vehicle(Integer type_of_vehicle) {
		this.type_of_vehicle = type_of_vehicle;
	}
	public Integer getVendor_typeid() {
		return vendor_typeid;
	}
	public void setVendor_typeid(Integer vendor_typeid) {
		this.vendor_typeid = vendor_typeid;
	}
	public Integer getTax_section() {
		return tax_section;
	}
	public void setTax_section(Integer tax_section) {
		this.tax_section = tax_section;
	}
	public Integer getTax_account() {
		return tax_account;
	}
	public void setTax_account(Integer tax_account) {
		this.tax_account = tax_account;
	}
	public Integer getSupply_typeid() {
		return supply_typeid;
	}
	public void setSupply_typeid(Integer supply_typeid) {
		this.supply_typeid = supply_typeid;
	}
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public Date getEffective_from() {
		return effective_from;
	}
	public void setEffective_from(Date effective_from) {
		this.effective_from = effective_from;
	}
	public Date getEffective_to() {
		return effective_to;
	}
	public void setEffective_to(Date effective_to) {
		this.effective_to = effective_to;
	}
	public String getVendor_type() {
		return vendor_type;
	}
	public void setVendor_type(String vendor_type) {
		this.vendor_type = vendor_type;
	}
	public String getSupply_type() {
		return supply_type;
	}
	public void setSupply_type(String supply_type) {
		this.supply_type = supply_type;
	}
	public double getTax_rate() {
		return tax_rate;
	}
	public void setTax_rate(double tax_rate) {
		this.tax_rate = tax_rate;
	}
	public Integer getServiceid() {
		return serviceid;
	}
	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}
	public Integer getVendortype() {
		return vendortype;
	}
	public void setVendortype(Integer vendortype) {
		this.vendortype = vendortype;
	}
	public Integer getTaxgroup() {
		return taxgroup;
	}
	public void setTaxgroup(Integer taxgroup) {
		this.taxgroup = taxgroup;
	}
	public Integer getSupplytype() {
		return supplytype;
	}
	public void setSupplytype(Integer supplytype) {
		this.supplytype = supplytype;
	}
	public Integer getTaxsection() {
		return taxsection;
	}
	public void setTaxsection(Integer taxsection) {
		this.taxsection = taxsection;
	}
	public double getTaxrate() {
		return taxrate;
	}
	public void setTaxrate(double taxrate) {
		this.taxrate = taxrate;
	}
	public Date getEffectivefrom() {
		return effectivefrom;
	}
	public void setEffectivefrom(Date effectivefrom) {
		this.effectivefrom = effectivefrom;
	}
	public Date getEffectiveto() {
		return effectiveto;
	}
	public void setEffectiveto(Date effectiveto) {
		this.effectiveto = effectiveto;
	}
	public String getAccounttype_name() {
		return accounttype_name;
	}
	public void setAccounttype_name(String accounttype_name) {
		this.accounttype_name = accounttype_name;
	}
	public String getAccountnature_name() {
		return accountnature_name;
	}
	public void setAccountnature_name(String accountnature_name) {
		this.accountnature_name = accountnature_name;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public Integer getTax_groupid() {
		return tax_groupid;
	}
	public void setTax_groupid(Integer tax_groupid) {
		this.tax_groupid = tax_groupid;
	}
	public Integer getAccount_nature() {
		return account_nature;
	}
	public void setAccount_nature(Integer account_nature) {
		this.account_nature = account_nature;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public Integer getGl_accountid() {
		return gl_accountid;
	}
	public void setGl_accountid(Integer gl_accountid) {
		this.gl_accountid = gl_accountid;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getTax_group() {
		return tax_group;
	}
	public void setTax_group(String tax_group) {
		this.tax_group = tax_group;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getTax_group_name() {
		return tax_group_name;
	}
	public void setTax_group_name(String tax_group_name) {
		this.tax_group_name = tax_group_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getExpense_account_name() {
		return expense_account_name;
	}
	public void setExpense_account_name(String expense_account_name) {
		this.expense_account_name = expense_account_name;
	}
	public String getLiabilityhead() {
		return liabilityhead;
	}
	public void setLiabilityhead(String liabilityhead) {
		this.liabilityhead = liabilityhead;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLiabilities_subhead() {
		return liabilities_subhead;
	}
	public void setLiabilities_subhead(String liabilities_subhead) {
		this.liabilities_subhead = liabilities_subhead;
	}
	public Integer getLiabilities_head() {
		return liabilities_head;
	}
	public void setLiabilities_head(Integer liabilities_head) {
		this.liabilities_head = liabilities_head;
	}
	public String getLiabilitieshead() {
		return liabilitieshead;
	}
	public void setLiabilitieshead(String liabilitieshead) {
		this.liabilitieshead = liabilitieshead;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getPrevious_financial_year() {
		return previous_financial_year;
	}
	public void setPrevious_financial_year(Integer previous_financial_year) {
		this.previous_financial_year = previous_financial_year;
	}
	public Double getPrevious_amount() {
		return previous_amount;
	}
	public void setPrevious_amount(Double previous_amount) {
		this.previous_amount = previous_amount;
	}
	public Integer getGlid() {
		return glid;
	}
	public void setGlid(Integer glid) {
		this.glid = glid;
	}
	public Integer getTax_id() {
		return tax_id;
	}
	public void setTax_id(Integer tax_id) {
		this.tax_id = tax_id;
	}
	public Integer getNo_of_candidates() {
		return no_of_candidates;
	}
	public void setNo_of_candidates(Integer no_of_candidates) {
		this.no_of_candidates = no_of_candidates;
	}
	public Integer getNo_of_trainers() {
		return no_of_trainers;
	}
	public void setNo_of_trainers(Integer no_of_trainers) {
		this.no_of_trainers = no_of_trainers;
	}
	public String getInvoice_check_name() {
		return invoice_check_name;
	}
	public void setInvoice_check_name(String invoice_check_name) {
		this.invoice_check_name = invoice_check_name;
	}
	public Double getTds_igst_amount() {
		return tds_igst_amount;
	}
	public void setTds_igst_amount(Double tds_igst_amount) {
		this.tds_igst_amount = tds_igst_amount;
	}
	public Double getTds_cgst_amount() {
		return tds_cgst_amount;
	}
	public void setTds_cgst_amount(Double tds_cgst_amount) {
		this.tds_cgst_amount = tds_cgst_amount;
	}
	public Double getTds_sgst_amount() {
		return tds_sgst_amount;
	}
	public void setTds_sgst_amount(Double tds_sgst_amount) {
		this.tds_sgst_amount = tds_sgst_amount;
	}
	public Double getTds_194j() {
		return tds_194j;
	}
	public void setTds_194j(Double tds_194j) {
		this.tds_194j = tds_194j;
	}
	public Double getGross_total() {
		return gross_total;
	}
	public void setGross_total(Double gross_total) {
		this.gross_total = gross_total;
	}
	public String getCheque_no() {
		return cheque_no;
	}
	public void setCheque_no(String cheque_no) {
		this.cheque_no = cheque_no;
	}
	public Date getCheque_date() {
		return cheque_date;
	}
	public void setCheque_date(Date cheque_date) {
		this.cheque_date = cheque_date;
	}
	public Date getBank_date() {
		return bank_date;
	}
	public void setBank_date(Date bank_date) {
		this.bank_date = bank_date;
	}
	public String getPurchaseorder_id() {
		return purchaseorder_id;
	}
	public void setPurchaseorder_id(String purchaseorder_id) {
		this.purchaseorder_id = purchaseorder_id;
	}
	public String getMou_id() {
		return mou_id;
	}
	public void setMou_id(String mou_id) {
		this.mou_id = mou_id;
	}
	public String getNote_generated_id() {
		return note_generated_id;
	}
	public void setNote_generated_id(String note_generated_id) {
		this.note_generated_id = note_generated_id;
	}
	public Integer getWorkorderid() {
		return workorderid;
	}
	public void setWorkorderid(Integer workorderid) {
		this.workorderid = workorderid;
	}
	public Integer getMouid() {
		return mouid;
	}
	public void setMouid(Integer mouid) {
		this.mouid = mouid;
	}
	public Integer getPurchaseorderid() {
		return purchaseorderid;
	}
	public void setPurchaseorderid(Integer purchaseorderid) {
		this.purchaseorderid = purchaseorderid;
	}
	public Integer getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}
	public Integer getInvoicecount() {
		return invoicecount;
	}
	public void setInvoicecount(Integer invoicecount) {
		this.invoicecount = invoicecount;
	}
	public Integer getReportingcount() {
		return reportingcount;
	}
	public void setReportingcount(Integer reportingcount) {
		this.reportingcount = reportingcount;
	}
	public Integer getCfocount() {
		return cfocount;
	}
	public void setCfocount(Integer cfocount) {
		this.cfocount = cfocount;
	}
	public Integer getFinancecount() {
		return financecount;
	}
	public void setFinancecount(Integer financecount) {
		this.financecount = financecount;
	}
	public Integer getPaymentcount() {
		return paymentcount;
	}
	public void setPaymentcount(Integer paymentcount) {
		this.paymentcount = paymentcount;
	}
	public Integer getBookedcount() {
		return bookedcount;
	}
	public void setBookedcount(Integer bookedcount) {
		this.bookedcount = bookedcount;
	}
	public Integer getReleasecount() {
		return releasecount;
	}
	public void setReleasecount(Integer releasecount) {
		this.releasecount = releasecount;
	}
	public Integer getHoldcount() {
		return holdcount;
	}
	public void setHoldcount(Integer holdcount) {
		this.holdcount = holdcount;
	}
	public Integer getReturnedcount() {
		return returnedcount;
	}
	public void setReturnedcount(Integer returnedcount) {
		this.returnedcount = returnedcount;
	}
	public String getInvoice_type() {
		return invoice_type;
	}
	public void setInvoice_type(String invoice_type) {
		this.invoice_type = invoice_type;
	}
	public String getFy() {
		return fy;
	}
	public void setFy(String fy) {
		this.fy = fy;
	}
	public Integer getTds_type() {
		return tds_type;
	}
	public void setTds_type(Integer tds_type) {
		this.tds_type = tds_type;
	}
	
	public String getHsn_sac_code() {
		return hsn_sac_code;
	}
	public void setHsn_sac_code(String hsn_sac_code) {
		this.hsn_sac_code = hsn_sac_code;
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
	public Integer getNo_of_trainees() {
		return no_of_trainees;
	}
	public void setNo_of_trainees(Integer no_of_trainees) {
		this.no_of_trainees = no_of_trainees;
	}
	public Integer getNo_of_batches() {
		return no_of_batches;
	}
	public void setNo_of_batches(Integer no_of_batches) {
		this.no_of_batches = no_of_batches;
	}
	public Double getModel_rate() {
		return model_rate;
	}
	public void setModel_rate(Double model_rate) {
		this.model_rate = model_rate;
	}
	public String getTax_rate_value() {
		return tax_rate_value;
	}
	public void setTax_rate_value(String tax_rate_value) {
		this.tax_rate_value = tax_rate_value;
	}
	public String getTax_name() {
		return tax_name;
	}
	public void setTax_name(String tax_name) {
		this.tax_name = tax_name;
	}
	public String getWorkorder_name() {
		return workorder_name;
	}
	public void setWorkorder_name(String workorder_name) {
		this.workorder_name = workorder_name;
	}
	public String getAccount_types() {
		return account_types;
	}
	public void setAccount_types(String account_types) {
		this.account_types = account_types;
	}
	public String getNext_approver() {
		return next_approver;
	}
	public void setNext_approver(String next_approver) {
		this.next_approver = next_approver;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Date getInvoice_booked_date() {
		return invoice_booked_date;
	}
	public void setInvoice_booked_date(Date invoice_booked_date) {
		this.invoice_booked_date = invoice_booked_date;
	}
	public String getO_type() {
		return o_type;
	}
	public void setO_type(String o_type) {
		this.o_type = o_type;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Double getCredit_balance() {
		return credit_balance;
	}
	public void setCredit_balance(Double credit_balance) {
		this.credit_balance = credit_balance;
	}
	public Double getDebit_balance() {
		return debit_balance;
	}
	public void setDebit_balance(Double debit_balance) {
		this.debit_balance = debit_balance;
	}
	public Double getCapex_budget_value() {
		return capex_budget_value;
	}
	public void setCapex_budget_value(Double capex_budget_value) {
		this.capex_budget_value = capex_budget_value;
	}
	public Double getOpex_budget_value() {
		return opex_budget_value;
	}
	public void setOpex_budget_value(Double opex_budget_value) {
		this.opex_budget_value = opex_budget_value;
	}
	public Double getCapex_spent_amount() {
		return capex_spent_amount;
	}
	public void setCapex_spent_amount(Double capex_spent_amount) {
		this.capex_spent_amount = capex_spent_amount;
	}
	public Double getOpex_spent_amount() {
		return opex_spent_amount;
	}
	public void setOpex_spent_amount(Double opex_spent_amount) {
		this.opex_spent_amount = opex_spent_amount;
	}
	public Integer getCheck_id() {
		return check_id;
	}
	public void setCheck_id(Integer check_id) {
		this.check_id = check_id;
	}
	
	
	
	
	
	

}
