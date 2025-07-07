
package com.erp.Model;


import java.sql.Timestamp;

import software.amazon.ion.Decimal;

import java.sql.Date;


public class Grn {
	private static long serialVersionUID=1L;
	
	
	
			public Integer invoice;
			public Integer getInvoice() {
				return invoice;
			}
			public void setInvoice(Integer invoice) {
				this.invoice = invoice;
			}
			public String gl_id; 
			public String  account_name; 
			public Integer grn_details;
			public	boolean  is_installed; 
			public String  accounts_payble; 
			public String  invoice_id ;
			public Timestamp  invoice_date; 
			public Timestamp  invoice_due_date; 
			public double  credit_tax_amount;
			public double  debit_tax_amount; 
			public String  modified_by; 
			public Integer hsn_sac_code;
			public String gl_code;
			public String item_description;
		/**************KKKKKKKKKKKKKKKKKKKKKKK*/
			public Date date_of_manufacturing;
			public String asset_id;
			public String oem_no;
			public double life_of_asset;
			public double residual_value;
			public Integer asset_status;
			public String assets;
			public Date from_date;
			public Date to_date;
			public Integer	id ;
			 public Integer grn; 
			public String purchaseorder_id;
			 public Integer	po_details; 
			 public Integer	vgrn_details; 
			 public Integer	asset_name; 
			 public Integer	item_name; 
		     public Integer	po_qty ;
			 public Integer received_qty; 
			 public Integer inspected_qty ;
			 public Integer	rejected_qty;
			 public Integer	qc_qty;
			 public Integer installation_status;
			 public Timestamp installation_date;
			 public String	brand;
			 public Integer	location;
			 public Integer created_by;
			 public Timestamp created_date;	
				public Integer purchaseotypeid;
				public Integer service_id;
				public Integer purchasetypeid;
				public Integer sectorid;
				public Integer vendorid;
				public Integer serviceid;
				public String scheme_id;
				public String scheme_name;
				public String project_id;  
				public String project_name;
			    public Integer programid;
				public String program_id;
				public String program_name;
				public String sector_id;
				public String sector_name;
				public Integer vendor_id;
				public String location_name;
				public Integer qty;
				public double value;
				public String specifications;
				public double installation_cost;
				public String programname;
				public String financial_year;
				public Integer po_type;
				public Integer p_type;
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
				public String  installation ;
				public Integer  recieved_qty; 
				public Decimal	rate;
				public String grn_id; 
				 public Integer vendor_grn;
				public Date  grn_date; 
				public Integer  vendor; 
				public Date delivery_date; 
				 public String comments; 
				public Integer  grn_status; 
				 public Integer received_by; 
				  public Integer approved_by; 
				 public String po_id; 
				 public String checked_by; 
				 public String recieved_by;
				 public Timestamp current_timestamp;
				public String request_id; 
				public Integer  request_type; 
				public String  empid;	 
				public Integer cost_center; 
				public String  description; 
				public Integer  assigned_to;
				public boolean  is_closed; 
				 public Date closed_date; 
					  public String  existing_poid; 
					  public String asset_description;
					  public Integer status; 
					  public Timestamp date_created;   
					  public Integer order_status; 
					  public Integer  unlock_work_order; 
					  public Integer  vendor_accepted; 	 
					public Integer  delivery_location;
			
				public Timestamp getCreated_date() {
						return created_date;
					}
					public void setCreated_date(Timestamp created_date) {
						this.created_date = created_date;
					}
					public Integer getDelivery_location() {
						return delivery_location;
					}
					public void setDelivery_location(Integer delivery_location) {
						this.delivery_location = delivery_location;
					}
				public String getExisting_poid() {
						return existing_poid;
					}
					public void setExisting_poid(String existing_poid) {
						this.existing_poid = existing_poid;
					}
					public String getAsset_description() {
						return asset_description;
					}
					public void setAsset_description(String asset_description) {
						this.asset_description = asset_description;
					}
					public Integer getStatus() {
						return status;
					}
					public void setStatus(Integer status) {
						this.status = status;
					}
					public Timestamp getDate_created() {
						return date_created;
					}
					public void setDate_created(Timestamp date_created) {
						this.date_created = date_created;
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
					public Integer getVendor_accepted() {
						return vendor_accepted;
					}
					public void setVendor_accepted(Integer vendor_accepted) {
						this.vendor_accepted = vendor_accepted;
					}
				public String getRequest_id() {
					return request_id;
				}
				public void setRequest_id(String request_id) {
					this.request_id = request_id;
				}
				public Integer getRequest_type() {
					return request_type;
				}
				public void setRequest_type(Integer request_type) {
					this.request_type = request_type;
				}
				
				public String getEmpid() {
					return empid;
				}
				public void setEmpid(String empid) {
					this.empid = empid;
				}
				public Integer getCost_center() {
					return cost_center;
				}
				public void setCost_center(Integer cost_center) {
					this.cost_center = cost_center;
				}
				public String getDescription() {
					return description;
				}
				public void setDescription(String description) {
					this.description = description;
				}
				public Integer getAssigned_to() {
					return assigned_to;
				}
				public void setAssigned_to(Integer assigned_to) {
					this.assigned_to = assigned_to;
				}
				public boolean isIs_closed() {
					return is_closed;
				}
				public void setIs_closed(boolean is_closed) {
					this.is_closed = is_closed;
				}
				public Date getClosed_date() {
					return closed_date;
				}
				public void setClosed_date(Date closed_date) {
					this.closed_date = closed_date;
				}
				public Timestamp getCurrent_timestamp() {
					return current_timestamp;
				}
				public void setCurrent_timestamp(Timestamp current_timestamp) {
					this.current_timestamp = current_timestamp;
				}
				public String getRecieved_by() {
					return recieved_by;
				}
				public void setRecieved_by(String recieved_by) {
					this.recieved_by = recieved_by;
				}
				public String getPurchaseorder_id() {
					return purchaseorder_id;
				}
				public void setPurchaseorder_id(String purchaseorder_id) {
					this.purchaseorder_id = purchaseorder_id;
				}
				public static long getSerialVersionUID() {
					return serialVersionUID;
				}
				public static void setSerialVersionUID(long serialVersionUID) {
					Grn.serialVersionUID = serialVersionUID;
				}
				public Integer getId() {
					return id;
				}
				public void setId(Integer id) {
					this.id = id;
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
				public Integer getAsset_name() {
					return asset_name;
				}
				public void setAsset_name(Integer asset_name) {
					this.asset_name = asset_name;
				}
				public Integer getItem_name() {
					return item_name;
				}
				public void setItem_name(Integer item_name) {
					this.item_name = item_name;
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
				public String getBrand() {
					return brand;
				}
				public void setBrand(String brand) {
					this.brand = brand;
				}
				public Integer getLocation() {
					return location;
				}
				public void setLocation(Integer location) {
					this.location = location;
				}
				public Integer getCreated_by() {
					return created_by;
				}
				public void setCreated_by(Integer created_by) {
					this.created_by = created_by;
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
				public String getScheme_id() {
					return scheme_id;
				}
				public void setScheme_id(String scheme_id) {
					this.scheme_id = scheme_id;
				}
				public String getScheme_name() {
					return scheme_name;
				}
				public void setScheme_name(String scheme_name) {
					this.scheme_name = scheme_name;
				}
				public String getProject_id() {
					return project_id;
				}
				public void setProject_id(String project_id) {
					this.project_id = project_id;
				}
				public String getProject_name() {
					return project_name;
				}
				public void setProject_name(String project_name) {
					this.project_name = project_name;
				}
				public Integer getProgramid() {
					return programid;
				}
				public void setProgramid(Integer programid) {
					this.programid = programid;
				}
				public String getProgram_id() {
					return program_id;
				}
				public void setProgram_id(String program_id) {
					this.program_id = program_id;
				}
				public String getProgram_name() {
					return program_name;
				}
				public void setProgram_name(String program_name) {
					this.program_name = program_name;
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
				
				
				public String getSpecifications() {
					return specifications;
				}
				public void setSpecifications(String specifications) {
					this.specifications = specifications;
				}
				
				public String getProgramname() {
					return programname;
				}
				public void setProgramname(String programname) {
					this.programname = programname;
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
				public String getPuchaseorder_id() {
					return puchaseorder_id;
				}
				public void setPuchaseorder_id(String puchaseorder_id) {
					this.puchaseorder_id = puchaseorder_id;
				}
				public String getGroup_name() {
					return group_name;
				}
				public void setGroup_name(String group_name) {
					this.group_name = group_name;
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
				public Decimal getRate() {
					return rate;
				}
				public void setRate(Decimal rate) {
					this.rate = rate;
				}
				public String getGrn_id() {
					return grn_id;
				}
				public void setGrn_id(String grn_id) {
					this.grn_id = grn_id;
				}
				public Integer getVendor_grn() {
					return vendor_grn;
				}
				public void setVendor_grn(Integer vendor_grn) {
					this.vendor_grn = vendor_grn;
				}
				public Date getGrn_date() {
					return grn_date;
				}
				public void setGrn_date(Date grn_date) {
					this.grn_date = grn_date;
				}
				public Integer getVendor() {
					return vendor;
				}
				public void setVendor(Integer vendor) {
					this.vendor = vendor;
				}
				public Date getDelivery_date() {
					return delivery_date;
				}
				public void setDelivery_date(Date delivery_date) {
					this.delivery_date = delivery_date;
				}
				public String getComments() {
					return comments;
				}
				public void setComments(String comments) {
					this.comments = comments;
				}
				public Integer getGrn_status() {
					return grn_status;
				}
				public void setGrn_status(Integer grn_status) {
					this.grn_status = grn_status;
				}
				public Integer getReceived_by() {
					return received_by;
				}
				public void setReceived_by(Integer received_by) {
					this.received_by = received_by;
				}
				public Integer getApproved_by() {
					return approved_by;
				}
				public void setApproved_by(Integer approved_by) {
					this.approved_by = approved_by;           
				}
				public String getPo_id() {  
					return po_id;
				}
				public void setPo_id(String po_id) {  
					this.po_id = po_id;
				}
				public String getChecked_by() {
					return checked_by;
				}
				public void setChecked_by(String checked_by) {
					this.checked_by = checked_by;
				} 
				

	             public Date getFrom_date() {
					return from_date;
				}
				public void setFrom_date(Date from_date) {
					this.from_date = from_date;
				}
				public String getAssets() {
					return assets;
				}
				public void setAssets(String assets) {
					this.assets = assets;
				}  
				public Date getTo_date() {
					return to_date;
				}
				public void setTo_date(Date to_date) {
					this.to_date = to_date;
				}
				
				
				
				public String getAsset_id() {
					return asset_id;
				}
				public void setAsset_id(String asset_id) {
					this.asset_id = asset_id;
				}
				public String getOem_no() {
					return oem_no;
				}
				public void setOem_no(String oem_no) {
					this.oem_no = oem_no;
				}    
				public double getLife_of_asset() {
					return life_of_asset;
				}
				public void setLife_of_asset(double life_of_asset) {
					this.life_of_asset = life_of_asset;
				}
				public double getResidual_value() {
					return residual_value;
				}
				public void setResidual_value(double residual_value) {
					this.residual_value = residual_value;
				}
				public Integer getAsset_status() {
					return asset_status;
				}
				public void setAsset_status(Integer asset_status) {
					this.asset_status = asset_status;
				}
				public String getGl_id() {
					return gl_id;
				}
				public void setGl_id(String gl_id) {
					this.gl_id = gl_id;
				}
				public String getAccount_name() {
					return account_name;
				}
				public void setAccount_name(String account_name) {
					this.account_name = account_name;
				}
				public Integer getGrn_details() {
					return grn_details;
				}
				public void setGrn_details(Integer grn_details) {
					this.grn_details = grn_details;
				}
				public boolean isIs_installed() {
					return is_installed;
				}
				public void setIs_installed(boolean is_installed) {
					this.is_installed = is_installed;
				}
				public String getAccounts_payble() {
					return accounts_payble;
				}
				public void setAccounts_payble(String accounts_payble) {
					this.accounts_payble = accounts_payble;
				}
				public String getInvoice_id() {
					return invoice_id;
				}
				public void setInvoice_id(String invoice_id) {
					this.invoice_id = invoice_id;
				}
				public Timestamp getInvoice_date() {
					return invoice_date;
				}
				public void setInvoice_date(Timestamp invoice_date) {
					this.invoice_date = invoice_date;
				}
				public Timestamp getInvoice_due_date() {
					return invoice_due_date;
				}
				public void setInvoice_due_date(Timestamp invoice_due_date) {
					this.invoice_due_date = invoice_due_date;
				}
				public double getCredit_tax_amount() {
					return credit_tax_amount;
				}
				public void setCredit_tax_amount(double credit_tax_amount) {
					this.credit_tax_amount = credit_tax_amount;
				}
				public double getDebit_tax_amount() {
					return debit_tax_amount;
				}
				public void setDebit_tax_amount(double debit_tax_amount) {
					this.debit_tax_amount = debit_tax_amount;
				}
				public String getModified_by() {
					return modified_by;
				}
				public void setModified_by(String modified_by) {
					this.modified_by = modified_by;
				}
				public Integer getHsn_sac_code() {
					return hsn_sac_code;
				}
				public void setHsn_sac_code(Integer hsn_sac_code) {
					this.hsn_sac_code = hsn_sac_code;
				}
				public String getGl_code() {
					return gl_code;
				}
				public void setGl_code(String gl_code) {
					this.gl_code = gl_code;
				}
				public String getItem_description() {
					return item_description;
				}
				public void setItem_description(String item_description) {
					this.item_description = item_description;
				}
				public Date getDate_of_manufacturing() {
					return date_of_manufacturing;
				}
				public void setDate_of_manufacturing(Date date_of_manufacturing) {
					this.date_of_manufacturing = date_of_manufacturing;
				}
				public double getValue() {
					return value;
				}
				public void setValue(double value) {
					this.value = value;
				}
				public double getInstallation_cost() {
					return installation_cost;
				}
				public void setInstallation_cost(double installation_cost) {
					this.installation_cost = installation_cost;
				}
				   
				
				
				
				
				
				
				
				
				

}	