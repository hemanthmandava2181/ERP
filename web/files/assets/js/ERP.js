var ERP = {

	showPage : function(path, targetDiv) {
		var jqxhr = jQuery.post(path, function(data) {
			jQuery("#" + targetDiv).html(data);
		});
	},     
	
	        
	showLoginPage : function() {    
		var path = "/erp/login/html/login.html";
		ERP.showPage(path, "mainDiv");   
	},
	showEmployeeHomePage : function() {  
		var path = "/erp/html/dashboard/EmpHome.html";     
		ERP.showPage(path, "mainDiv");
	},  
	showAdminHomePage : function() {            
		var path = "/erp/html/dashboard/AdminHome.html";   
		ERP.showPage(path, "mainDiv");
	},
	showSuperAdminHomePage : function() {      
		var path = "/erp/html/dashboard/SuperAdminHome.html";   
		ERP.showPage(path, "mainDiv");    
	},            
	

    showProjectEmployeemappingpage: function() {                   
		var path = "/erp/html/projectemployeemapping.html";   
		ERP.showPage(path, "content-area");
    },
    
    showLeavesettings: function() {                
		var path = "/erp/html/HRMS/GeneralSettings/LeaveSettings.html";   
		ERP.showPage(path, "content-area");
    },
    
    showAttendanceModifyReport: function() {                
		var path = "/erp/html/HRMS/Attendance/Attendanceupdate.html";   
		ERP.showPage(path, "content-area");
    },
    showUploademployee: function() {                
		var path = "/erp/html/HRMS/onBoarding/uploadEmployee.html";   
		ERP.showPage(path, "content-area");
    },
    
	 /*Start MoU Management*/           
	showCreateMou: function() {     
		var path = "/erp/html/OperationsManagement/MoUManagement/CreateMoU.html";   
		ERP.showPage(path, "content-area");
	},
	showMouList: function() {           
		var path = "/erp/html/OperationsManagement/MoUManagement/MOUList.html";   
		ERP.showPage(path, "content-area");
	},
	
	showOrderManagement: function() {           
		var path = "/erp/html/OperationsManagement/OrderManagement/OrderManagement.html";   
		ERP.showPage(path, "content-area");
	},
	
	 /*End  Order Management*/
	    
	/*Start PO Management*/
	showCreatePO: function() {           
		var path = "/erp/html/OperationsManagement/POManagement/createPO.html";      
		ERP.showPage(path, "content-area");
	},
	showPOList: function() {           
		var path = "/erp/html/OperationsManagement/POManagement/POList.html";   
		ERP.showPage(path, "content-area");
	},
	 /*End  PO Management*/
	
	/*Start Vendor Management*/   
	showCreateVendor: function() {           
		var path = "/erp/html/OperationsManagement/vendorManagement/createVendor.html";   
		ERP.showPage(path, "content-area");       
	},            
	showVendorApprovals: function() {           
		var path = "/erp/html/OperationsManagement/vendorManagement/VendorApproval.html";   
		ERP.showPage(path, "content-area");
	},
	showNatureOfService: function() {           
		var path = "/erp/html/OperationsManagement/vendorManagement/CreateNatureofService.html";   
		ERP.showPage(path, "content-area");
	},
	
	showvendorcreationviewPage: function() {           
		var path = "/erp/html/vendorManagement/vendorcreationviewpage.html";   
		ERP.showPage(path, "content-area");
	},
	  
	/*End  Vendor Management*/
	/*Start Wo Management*/
	showCreateWO: function() {           
		var path = "/erp/html/OperationsManagement/workorderManagement/createWorkorder.html";   
		ERP.showPage(path, "content-area");
	},
	showWOList: function() {           
		var path = "/erp/html/OperationsManagement/workorderManagement/WoList.html";   
		ERP.showPage(path, "content-area");
	},        
	showWOSummary: function() {           
		var path = "/erp/html/OperationsManagement/workorderManagement/workOrderSummary.html";   
		ERP.showPage(path, "content-area");
	},
	 /*End  WO Management*/
	
	/*Start Assets Management*/
	showCreateGRN: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/GRN.html";   
		ERP.showPage(path, "content-area");
	},     
	showAssetDetails: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/AssetDetails.html";   
		ERP.showPage(path, "content-area");
	},
	showAssetDetailReport: function() {              
		var path = "/erp/html/OperationsManagement/AssetManagement/AssetDetailReport.html";   
		ERP.showPage(path, "content-area");
	},
	showAssetRequest: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/AssetRequest.html";   
		ERP.showPage(path, "content-area");
	},
	showFixedAsset: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/FixedAssetconsolidated.html";   
		ERP.showPage(path, "content-area");
	},
	showPOGRN: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/POGrn.html";   
		ERP.showPage(path, "content-area");
	},   
	showAssetRequestList: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/assetRequestList.html";      
		ERP.showPage(path, "content-area");
	},
	showAssetInvoiceSubmission: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/AssetInvoice.html";   
		ERP.showPage(path, "content-area");
	},
	showGRNList: function() {           
		var path = "/erp/html/OperationsManagement/AssetManagement/GRNList.html";   
		ERP.showPage(path, "content-area");
	},
	 /*End  Assets Management*/
	    
	/*Admin Pages*/
	
	
	
	
	showCreateSDEIGroup: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/createSDEIgroup.html";   
		ERP.showPage(path, "content-area");
	},   
	    
	showCreateProgram: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/CreateProgram.html";   
		ERP.showPage(path, "content-area");
	},
	
	showCreateProject: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/CreateProject.html";   
		ERP.showPage(path, "content-area");
	},
   
	
	
	showCreateScheme: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/CreateScheme.html";   
		ERP.showPage(path, "content-area");
	},
	showCreateSector: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/createSector.html";  
		ERP.showPage(path, "content-area");
	},
	showCreateSegment: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/createSegment.html";  
		ERP.showPage(path, "content-area");
	},
	showCreateLocation: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/CreateLocation.html";  
		ERP.showPage(path, "content-area");
	},
	showCreateMandal: function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/CreateMandal.html";  
		ERP.showPage(path, "content-area");
	},
	showCreateConstituency:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/CreateConstituency.html";  
		ERP.showPage(path, "content-area");
	},
	showCreateDistrict:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/CreateDistrict.html";  
		ERP.showPage(path, "content-area");
	},      
	showGenralLedgerHeads:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/GeneralLedgerHeads.html";  
		ERP.showPage(path, "content-area");
	},
	showProgramList:function() {           
		var path = "/erp/html/OperationsManagement/POManagement/POList.html";  
		ERP.showPage(path, "content-area");    
	},
	showItemName:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/ItemName.html";  
		ERP.showPage(path, "content-area");  
	},  
	showAssetName:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/AssetNames.html";  
		ERP.showPage(path, "content-area");
	},     
	  
	showAssetGroup:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/AssetGroup.html";  
		ERP.showPage(path, "content-area");
	},    
	
	showAssetClass:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/AssetClass.html";  
		ERP.showPage(path, "content-area");
	},
	showAssetNature:function() {           
		var path = "/erp/html/OperationsManagement/OperationsAdmin/AssetNature.html";  
		ERP.showPage(path, "content-area");
	},    
	
	/*End of Admin pages*/
	showAttendanceReport: function() {           
		var path = "/erp/html/HRMS/Attendance/AttendanceReport.html";   
		ERP.showPage(path, "content-area");
	},
	        
	showAddRoles: function() {           
		var path = "/erp/html/OperationsManagement/AddRoles.html";                
		ERP.showPage(path, "content-area");      
	},
         
	/*Claim Management start*/
	
	showAdvanceImprest: function() {           
		var path = "/erp/html/ClaimManagement/advance_imprest.html";   
		ERP.showPage(path, "content-area");      
	},
	showAdvanceList: function() {           
		var path = "/erp/html/ClaimManagement/Advance_list.html";   
		ERP.showPage(path, "content-area");      
	}, 
	
	showAdvancelistviewpage: function() { 
		/*ERP.setSessionValue("claim_advance_id", id);*/
		var path = "/erp/html/ClaimManagement/AdvanceListViewpage.html";   
		ERP.showPage(path, "content-area");         
	}, 
	
	showBillSubmission: function() {           
		var path = "/erp/html/ClaimManagement/Bill_Submission.html";   
		ERP.showPage(path, "content-area");      
	},
	showBillSubmissionList: function() {           
		var path = "/erp/html/ClaimManagement/billsubmissionlist.html";        
		ERP.showPage(path, "content-area");      
	},
	showBillSubmissionViewpage: function() {           
		var path = "/erp/html/ClaimManagement/billSubmissionlistViewPage.html";        
		ERP.showPage(path, "content-area");      
	},
	/*showImprestReimbursementForm: function() {           
		var path = "/erp/html/ClaimManagement/imprestreimbursementform.html";  
		ERP.showPage(path, "content-area");      
	},*/

	showClaimStatusReport: function() {           
		var path = "/erp/html/ClaimManagement/claimstatusreport.html";      
		ERP.showPage(path, "content-area");      
	},   
		/*Claim Management End*/   
	
	/*Claim Management Settings start*/
	showEmailSettings: function() {              
		var path = "/erp/html/ClaimManagementSettings/emailsettings.html";  
		ERP.showPage(path, "content-area");      
	},
	showLocalConveyanceRates: function() {           
		var path = "/erp/html/ClaimManagementSettings/localConveyanceRates.html";  
		ERP.showPage(path, "content-area");     
	},
	showReimbursementPolicy: function() {           
		var path = "/erp/html/ClaimManagementSettings/reimbursementpolicy.html";  
		ERP.showPage(path, "content-area");     
	},
	showVehicleRegistration: function() {           
		var path = "/erp/html/ClaimManagementSettings/VehicleRegistration.html";  
		ERP.showPage(path, "content-area");     
	},     
	showVehicleTypes: function() {                     
		var path = "/erp/html/ClaimManagementSettings/vehicletypes.html";  
		ERP.showPage(path, "content-area");                  
	},       
	   
		/*Claim Management Settings End*/               
	
				/*Finance Start*/
	

    /*Accounts Payable start*/


	showAccountsPayable: function() {           
	var path = "/erp/html/Finance/AccountsPayable/accountspayable.html";  
	ERP.showPage(path, "content-area");     
	},

	showbankpaymentviewpage: function() {           
	var path = "/erp/html/Finance/AccountsPayable/bankpaymentsviewpage.html";  
	ERP.showPage(path, "content-area");     
	},
   
/*showBankPaymentsViewPage: function() {           
	var path = "/erp/html/Finance/AccountsPayable/bankpaymentsviewpage.html";  
	ERP.showPage(path, "content-area");     
},*/
	showBookedInvoices: function() {           
	var path = "/erp/html/Finance/AccountsPayable/bookedinvoices.html";  
	ERP.showPage(path, "content-area");     
	},  

	showbookedInvoicesviewpage: function() {           
	var path = "/erp/html/Finance/AccountsPayable/Bookedinvoicesviewpage.html";  
	ERP.showPage(path, "content-area");    
	},

	showBankpaymentpage: function() {           
	var path = "/erp/html/Finance/AccountsPayable/bankpayments.html";  
	ERP.showPage(path, "content-area");    
	}, 
  
	showBookInvoice: function() {                     
	var path = "/erp/html/Finance/AccountsPayable/bookinvoice.html";  
	ERP.showPage(path, "content-area");     
	},
/*showCreateJE: function() {           
	var path = "/erp/html/Finance/AccountsPayable/createje.html";  
	ERP.showPage(path, "content-area");     
},*/
	showInvoiceActionReport: function() {           
	var path = "/erp/html/Finance/AccountsPayable/invoiceactionreport.html";  
	ERP.showPage(path, "content-area");     
	},
	showInvoiceInflowReport: function() {           
	var path = "/erp/html/Finance/AccountsPayable/invoiceinflowreport.html";  
	ERP.showPage(path, "content-area");     
	},
	showInvoiceVSPaymentsReleases: function() {           
	var path = "/erp/html/StatutoryReports/invoicevspaymentsreleases.html";  
	ERP.showPage(path, "content-area");     
	},         
	showInvoiceWOPOStatus: function() {           
	var path = "/erp/html/StatutoryReports/invoicewopostatus.html";  
	ERP.showPage(path, "content-area");     
	},
	showPaymentEntry: function() {           
	var path = "/erp/html/Finance/AccountsPayable/paymententry.html";  
	ERP.showPage(path, "content-area");        
	},      

   
 /*Accounts Payable end*/
       
 /*Team Claims start*/

showAdvanceList1: function() {           
	var path = "/erp/html/ClaimManagement/TeamClaims/advanceList.html";  
	ERP.showPage(path, "content-area");        
},

showAdvancelistpendingviewpage: function() {           
	var path = "/erp/html/ClaimManagement/TeamClaims/advanceListpendingview.html";  
	ERP.showPage(path, "content-area");        
},

showAdvancelistapproveviewpage: function() {           
	var path = "/erp/html/ClaimManagement/TeamClaims/Advancelistapproveview.html";  
	ERP.showPage(path, "content-area");        
},

showBookedClaims: function() {               
	var path = "/erp/html/ClaimManagement/TeamClaims/bookedclaims.html";  
	ERP.showPage(path, "content-area");        
},
showReimbursementList: function() {             
	var path = "/erp/html/ClaimManagement/TeamClaims/reimbursementlist.html";  
	ERP.showPage(path, "content-area");        
},

showReimbursementpendingviewpage: function() {             
	var path = "/erp/html/ClaimManagement/TeamClaims/ReimbursementPendingview.html";  
	ERP.showPage(path, "content-area");        
},

showReimbursementapproveviewpage: function() {             
	var path = "/erp/html/ClaimManagement/TeamClaims/reimbursementapproveviewpage.html";  
	ERP.showPage(path, "content-area");        
},

/*Team Claims end*/

/*Accounts Receivable start*/

showAccountReceivablesList: function() {           
	var path = "/erp/html/Finance/AccountsReceivable/AccountReceivableList.html";  
	ERP.showPage(path, "content-area");      
},
showAccountsReceivablelistviewpage: function() {           
	var path = "/erp/html/Finance/AccountsReceivable/accountsReceivableListViewpage.html";  
	ERP.showPage(path, "content-area");          
},
showAccountsReceivablelistApprovedviewpage: function() {           
	var path = "/erp/html/Finance/AccountsReceivable/AccountsReceivablelistapprovedview.html";  
	ERP.showPage(path, "content-area");      
},
showAccountReceivables: function() {           
	var path = "/erp/html/Finance/AccountsReceivable/AccountReceivables.html";  
	ERP.showPage(path, "content-area");        
},
showBookedInvoices1: function() {           
	var path = "/erp/html/Finance/AccountsReceivable/BookedInvoices.html";  
	ERP.showPage(path, "content-area");        
},    
showReceiptEntry: function() {           
	var path = "/erp/html/Finance/AccountsReceivable/ReceiptEntry.html";  
	ERP.showPage(path, "content-area");        
},

/*Accounts Receivable end*/  

/*Finance Admin Start*/

showCostCenter: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/CostCenter.html";  
	ERP.showPage(path, "content-area");        
},
showCreateLiability: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/createliability.html";  
	ERP.showPage(path, "content-area");        
},
showCreateTaxAccount: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/CreatetaxAccount.html";  
	ERP.showPage(path, "content-area");        
},        
showCreateTaxGroup: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/CreateTaxGroup.html";  
	ERP.showPage(path, "content-area");        
},
showExpenseAccounts: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/ExpenseAccounts.html";  
	ERP.showPage(path, "content-area");        
},
showGLAccounts: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/Gl Accounts.html";  
	ERP.showPage(path, "content-area");        
},
showServiceTypes: function() {              
	var path = "/erp/html/Finance/FinanceAdmin/natureofService.html";  
	ERP.showPage(path, "content-area");        
},
showTaxMapping: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/TaxMapping.html";  
	ERP.showPage(path, "content-area");        
},
showTaxSection: function() {           
	var path = "/erp/html/Finance/FinanceAdmin/TaxSection.html";  
	ERP.showPage(path, "content-area");        
},
    
/*Finance Admin End*/

/*GL Accounting Start*/

showCreateJE: function() {           
	var path = "/erp/html/Finance/GLAccounting/Create JE.html";  
	ERP.showPage(path, "content-area");        
},

showJEList: function() {           
	var path = "/erp/html/Finance/GLAccounting/JE List.html";  
	ERP.showPage(path, "content-area");        
},
/*GL Accounting End*/
	
					/*Finance End*/
	
	/*HRMS Start*/      
	
	/*Attendance start*/
	
/*	showAttendanceReport: function() {           
		var path = "/erp/html/HRMS/Attendance/AttendanceReport.html";  
		ERP.showPage(path, "content-area");        
	},
*/	
	showAttendanceSheet: function() {           
		var path = "/erp/html/HRMS/Attendance/AttendanceSheet.html";  
		ERP.showPage(path, "content-area");        
	},
	
	/*Attendance end*/
	
	/*CTC Start*/
	
	showModifyCTC: function() {           
		var path = "/erp/html/HRMS/CTC/modifyctc.html";  
		ERP.showPage(path, "content-area");        
	},
	/*CTC END*/
	
	/*Employee Settings*/
	
	showCreateCaste: function() {           
		var path = "/erp/html/HRMS/Employee Settings/createCaste.html";  
		ERP.showPage(path, "content-area");        
	},
	showCreateDepartment: function() {           
		var path = "/erp/html/HRMS/Employee Settings/createDepartment.html";  
		ERP.showPage(path, "content-area");        
	},
	showCreateDesignation: function() {           
		var path = "/erp/html/HRMS/Employee Settings/createDesignation.html";  
		ERP.showPage(path, "content-area");        
	},
	showCreateGrade: function() {           
		var path = "/erp/html/HRMS/Employee Settings/createGrade.html";  
		ERP.showPage(path, "content-area");        
	},
	showCreateWorkLocation: function() {           
		var path = "/erp/html/HRMS/Employee Settings/createWorkLocation.html";  
		ERP.showPage(path, "content-area");        
	},
	showemployeesHistory: function() {           
		var path = "/erp/html/HRMS/Employee Settings/employeesHistory.html";  
		ERP.showPage(path, "content-area");        
	},    
	showHelpDeskRequestType: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/HelpDeskRequestType.html";      
		ERP.showPage(path, "content-area");        
	},      
	    
	/*employee Settings End*/         
	
	/*EmployeeEmployeeSelfServices Start*/
	    
	showApplyLeave: function() {              
		var path = "/erp/html/HRMS/Employeeemployeeselfservieces/applyleave.html";  
		ERP.showPage(path, "content-area");        
	},
	showAttendanceAndTimesheet: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/attendanceandtimesheet.html";  
		ERP.showPage(path, "content-area");        
	},   
	showAttendanceSummaryGraph: function() {           
		var path = "/erp/html/HRMS/Employeeemployeeselfservieces/attendancesummarygraph.html";  
		ERP.showPage(path, "content-area");          
	},
	showMyTimeSheet: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/mytimesheet.html";  
		ERP.showPage(path, "content-area");        
	},
	
	
	/*EmployeeEmployeeSelfServices End*/
	
	/*EmployeeSelfServices Start*/
	/*Leave management Start*/
	
	showLeaveStatus: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/LeaveManagement/LeaveStatus.html";      
		ERP.showPage(path, "content-area");        
	},
	
	showLeaveSummaryReport: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/LeaveManagement/LeaveSummaryReport.html";      
		ERP.showPage(path, "content-area");        
	},
	
	showMyLeaves: function() {              
		var path = "/erp/html/HRMS/Employeeselfservices/LeaveManagement/Myleaves.html";      
		ERP.showPage(path, "content-area");        
	},
	/*Leave management End*/      
	
	showHelpDesk: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/HelpDesk.html";             
		ERP.showPage(path, "content-area"); 
	},    
	showLeaveEncashment: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/LeaveEncashment.html";      
		ERP.showPage(path, "content-area"); 
	},    
	showOnDutyRequest: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/OnDutyRequest.html";                      
		ERP.showPage(path, "content-area"); 
	},
	showOnTravelRequest: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/OnTravelRequest.html";      
		ERP.showPage(path, "content-area"); 
	},
	        
	showEmployeeDirectory: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/employeedirectory.html";          
		ERP.showPage(path, "content-area"); 
	},
	
	showpayslip: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/viewpayslip.html";          
		ERP.showPage(path, "content-area"); 
	},
	showEmployeeExit: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/employeeexit.html";      
		ERP.showPage(path, "content-area");    
	},
	showEmployeeExitReport: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/employeeexitreport.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	showMyTimeSheet: function() {           
		var path = "/erp/html/HRMS/Employeeemployeeselfservieces/mytimesheet.html";  
		ERP.showPage(path, "content-area");        
	},
	/*EmployeeSelfServices END*/     
 
	
	/*GeneralSettings Start*/
	
	showHelpDeskTracker: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/HelpDeskTracker.html";      
		ERP.showPage(path, "content-area"); 
	},
	       
	/*GeneralSettings END*/           
	
	/*HRReports start*/
	   
	showAttendanceOverview: function() {           
		var path = "/erp/html/HRMS/HRReports/AttendanceOverview.html";      
		ERP.showPage(path, "content-area"); 
	},
	showCFMsReports: function() {           
		var path = "/erp/html/HRMS/HRReports/cfmsreports.html";      
		ERP.showPage(path, "content-area"); 
	},
	showComparisionReports: function() {           
		var path = "/erp/html/HRMS/HRReports/claimscomparisionreports.html";           
		ERP.showPage(path, "content-area"); 
	},
	showClaimsQuarterWiseReports: function() {           
		var path = "/erp/html/HRMS/HRReports/ClaimsQuarterWiseReports.html";      
		ERP.showPage(path, "content-area"); 
	},
	showClaimsReport: function() {           
		var path = "/erp/html/HRMS/HRReports/claimsreport.html";      
		ERP.showPage(path, "content-area"); 
	},
	showCoCExceptionReport: function() {           
		var path = "/erp/html/HRMS/HRReports/CoCExceptionReport.html";      
		ERP.showPage(path, "content-area"); 
	},

	showEmployeeStatusReport: function() {           
		var path = "/erp/html/HRMS/HRReports/EmployeestatusReport.html";      
		ERP.showPage(path, "content-area"); 
	},
	showExceptionReport: function() {           
		var path = "/erp/html/HRMS/HRReports/ExceptionReport.html";      
		ERP.showPage(path, "content-area"); 
	},
	showGoalSettingStatusReport: function() {           
		var path = "/erp/html/HRMS/HRReports/goalsettingstatusreport.html";      
		ERP.showPage(path, "content-area"); 
	},
	showImprestReports: function() {           
		var path = "/erp/html/HRMS/HRReports/imprestreports.html";      
		ERP.showPage(path, "content-area"); 
	},

	showLoginReport: function() {           
		var path = "/erp/html/HRMS/HRReports/LoginReport.html";      
		ERP.showPage(path, "content-area"); 
	},
	showProfileReport: function() {           
		var path = "/erp/html/HRMS/HRReports/ProfileReport.html";      
		ERP.showPage(path, "content-area"); 
	},       
	
	showCtcReport: function() {           
		var path = "/erp/html/HRMS/HRReports/CtcReport.html";      
		ERP.showPage(path, "content-area"); 
	},
	/*HRReports End*/
	
	/*Manager SelfServices start*/
	showMyTeamLeaves: function() {           
		var path = "/erp/html/HRMS/Managerselfservices/MyTeamLeaves.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	showMyTeamLogins: function() {           
		var path = "/erp/html/HRMS/Managerselfservices/MyTeamLogins.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	showMyTeamTimeSheets: function() {           
		var path = "/erp/html/HRMS/Managerselfservices/MyTeamTimeSheets.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	/*Manager SelfServices End*/
	
	/*OnBoarding Start*/
	showCreateEmployee: function() {           
		var path = "/erp/html/HRMS/onBoarding/createEmployee.html";      
		ERP.showPage(path, "content-area"); 
	},
	showEmployeeMaster: function() {                
		var path = "/erp/html/HRMS/onBoarding/employeeMaster.html";      
		ERP.showPage(path, "content-area"); 
	},
	showProjectEmployeeMapping: function() {           
		var path = "/erp/html/HRMS/onBoarding/projectemployeemapping.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	ShowEmployeeRelieve: function() {           
		var path = "/erp/html/HRMS/onBoarding/relieveEmployee.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	
	
	
	        
	/*OnBoarding End*/
	/*PayrollManagement*/
	
	showBankStatement: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/BankStatement.html";      
		ERP.showPage(path, "content-area"); 
	},
	showCTCCalculator: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/CtcCalculator.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	showPaySlipHead: function() {           
		var path = "/erp/html/HRMS/Employee Settings/createletterhead.html";      
		ERP.showPage(path, "content-area"); 
	},      
	showDeputationEmployee: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/DeputationEmployee.html";      
		ERP.showPage(path, "content-area"); 
	},
	

	showEmployeePayrollMonthlyReconcilation: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/EmployeePayrollMonthlyReconcilation.html";      
		ERP.showPage(path, "content-area"); 
	},   
	
	showEmployeeStopSalary: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/EmployeeStopSalary.html";      
		ERP.showPage(path, "content-area"); 
	},
	showHRPolicies: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/hrpolicies.html";      
		ERP.showPage(path, "content-area"); 
	},
	showLOPAdjustments: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/LOPAdjustments.html";      
		ERP.showPage(path, "content-area"); 
	},
	showPaymentSummary: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/PaymentSummary.html";      
		ERP.showPage(path, "content-area");    
	},
	
	showPayrollSummary: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/PayrollSummary.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	uploadincometax: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/UploadIncomtax.html";      
		ERP.showPage(path, "content-area"); 
	},
	showPayTypeWise: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/PayTypeWise.html";      
		ERP.showPage(path, "content-area"); 
	},  
	
	showGeneratePayoll: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/generatepayroll.html";      
		ERP.showPage(path, "content-area");    
	},  
	
	
	
	showTimeSheetData: function() {           
		var path = "/erp/html/HRMS/Attendance/ApproveTimeSheets.html";  
		ERP.showPage(path, "content-area");        
	},
	
	showLeaveReportdata: function() {           
		var path = "/erp/html/HRMS/Attendance/LeavesReport.html";  
		ERP.showPage(path, "content-area");        
	},
	showPayrollJV: function() {           
		var path = "/erp/html/HRMS/PayRollManagement/generatepayrollJV.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	
	
	
	/*Contract Renewal start*/
	
	showEmployeeContarctRenewal: function() {           
		var path = "/erp/html/HRMS/ContractRenewal/employeecontractrenewal.html";      
		ERP.showPage(path, "content-area"); 
	},  
	   
	showContractRenewalList: function() {           
		var path = "/erp/html/HRMS/ContractRenewal/contractrenewalceo.html";      
		ERP.showPage(path, "content-area"); 
	},  
	
	
	
	showTotalHeadCountPage : function() {           
		var path = "/erp/html/HRMS/ContractRenewal/contractRenewalbutton.html";      
		ERP.showPage(path, "content-area"); 
	},     
	showTotalStaffCountPage : function() {           
		var path = "/erp/html/HRMS/ContractRenewal/totalstaffcount.html";      
		ERP.showPage(path, "content-area");           
	},       
	showTotalOthersCountPage : function() {           
		var path = "/erp/html/HRMS/ContractRenewble/totalotherscount.html";      
		ERP.showPage(path, "content-area"); 
	},        
	showUpcomingStaffCountPage : function() {           
		var path = "/erp/html/HRMS/ContractRenewal/upcomingstaff.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	showPendingStaffCountPage : function() {                     
		var path = "/erp/html/HRMS/ContractRenewal/pendingstaff.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	showUpcomingOthersCountPage : function() {           
		var path = "/erp/html/HRMS/ContractRenewal/upcomingstaff.html";      
		ERP.showPage(path, "content-area"); 
	},
	
	showPendingOthersCountPage : function() {           
		var path = "/erp/html/HRMS/ContractRenewal/pendingothers.html";      
		ERP.showPage(path, "content-area"); 
	},
	        
	                  
	/*Contract Renewal End*/
	      
	/*Budget Inputs Start*/
	
	 
    showBudgetInputPage: function() {           
		var path = "/erp/html/Finance/budgetinputs/budgetinput.html";   
		ERP.showPage(path, "content-area");
    },  
    
    showBudgetOverviewPage: function() {           
		var path = "/erp/html/Finance/budgetinputs/budgetoverview.html";   
		ERP.showPage(path, "content-area");
    },
    
    showBudgetApprovalsPage: function() {           
		var path = "/erp/html/Finance/budgetinputs/budgetapproval.html";   
		ERP.showPage(path, "content-area");
    },
    
    showSimulationSummaryPage: function() {           
		var path = "/erp/html/Finance/budgetinputs/simulationsummary.html";   
		ERP.showPage(path, "content-area");
    },
       
    showSimulationSumaryViewpage: function() {           
		var path = "/erp/html/Finance/budgetinputs/SimulationSummaryViewpage.html";   
		ERP.showPage(path, "content-area");
    },
	
	/*Budget Inputs End*/  
	
	/*Statutory Reports Start*/
	
	showBalanceSheet: function() {           
		var path = "/erp/html/StatutoryReports/BalanceSheet.html";         
		ERP.showPage(path, "content-area");     
	},
	
	
	showTDSGSTReport: function() {           
		var path = "/erp/html/StatutoryReports/TDS&GSTReport.html";         
		ERP.showPage(path, "content-area");     
	},    
	    
	showBankReconciliationReport: function() {           
		var path = "/erp/html/StatutoryReports/BankReconciliationReport.html";         
		ERP.showPage(path, "content-area");     
	},
	
	showCashFlow: function() {           
		var path = "/erp/html/StatutoryReports/cash-flow.html";         
		ERP.showPage(path, "content-area");     
	},
	
	showDisplayAccountBalance: function() {           
		var path = "/erp/html/StatutoryReports/DispalyAccountBalance.html";         
		ERP.showPage(path, "content-area");        
	},     

	showIncomeExpenditureReport: function() {           
		var path = "/erp/html/StatutoryReports/income-expenditure-report.html";         
		ERP.showPage(path, "content-area");     
	},
	
	showTrailBalance: function() {           
		var path = "/erp/html/StatutoryReports/trail-balance.html";         
		ERP.showPage(path, "content-area");     
	},
	
	showVendorBalance: function() {           
		var path = "/erp/html/StatutoryReports/VendorBalance.html";         
		ERP.showPage(path, "content-area");     
	},

	showPaymentsTerms: function() {           
		var path = "/erp/html/StatutoryReports/payment-terms.html";         
		ERP.showPage(path, "content-area");     
	},
	
	showCostCenterWiseSpentReport: function() {             
		var path = "/erp/html/StatutoryReports/costCenterWiseSpentReport.html";         
		ERP.showPage(path, "content-area");        
	},       
	
	showProfilePage: function() {           
		var path = "/erp/html/HRMS/onBoarding/employeeProfile.html";         
		ERP.showPage(path, "content-area");        
	},
	
	/*showTimeSheetsPage: function() {           
		var path = "/erp/html/HRMS/Employeeselfservices/attendanceandtimesheet.html";         
		ERP.showPage(path, "content-area");        
	},
	    */
	showMyTimeSheetsPage: function() {             
		var path = "/erp/html/HRMS/Employeeselfservices/mytimesheet.html";         
		ERP.showPage(path, "content-area");        
	},
	
	
	
	showNotificationMobile: function() {             
		var path = "/erp/html/HRMS/Ecommunictions/NotificationMobile.html";         
		ERP.showPage(path, "content-area");        
	},      
	
	
	
	
	
	/*Statutory Reports End*/
	

	
	
	
	
	
	
	    
	
	
	
	/*HRMS End*/    
	  
	
	
	
	
	
	
	setSessionValue : function(key, value) {
		sessionStorage.setItem(key, value);
	},

	getSessionValue : function(key) {
		return sessionStorage.getItem(key);
	},

	removeSessionValue : function(key) {
		sessionStorage.removeItem(key);    
	},

	showError : function(errorMessage) {
		var message = "<div class=\"alert alert-danger\"><strong>Error: </strong>"
				+ errorMessage + "</div>";
		jQuery("#errorDiv").html(message);
	},                       
                                                         
	logout : function() {      
		
		var employeeid = ERP.getSessionValue("employeeid") || "";
		ERP.setSessionValue("email", null);
		ERP.setSessionValue("password", null);
		ERP.setSessionValue("roleid", null);
		ERP.setSessionValue("username", null);
		ERP.post('/erp/login/logout', employeeid);
		ERP.setSessionValue("employeeid", null);
		ERP.showLoginPage();
	},

	post : function(url, data) {    
		var responseData = null;
         
		jQuery.ajax({
			url : url,
			type : 'post',
			data : JSON.stringify(data), // Stringified Json Object
			dataType : 'json',
			async : false, // Cross-domain requests and dataType: "jsonp"
			// requests do not support synchronous operation
			cache : false, // This will force requested pages not to be cached
			// by the browser
			processData : false, // To avoid making query String instead of
			// JSON
			contentType : "application/json; charset=utf-8",
			success : function(data) {    
				responseData = data;
			}
		});

		return responseData;
	},
      
	isUserLoggedIn : function() {
		
		var email = ERP.getSessionValue("email") || "";
		var password = ERP.getSessionValue("password") || "";
		var roleid = ERP.getSessionValue("roleid") || "";
		var username = ERP.getSessionValue("username") || "";
		var employeeid = ERP.getSessionValue("employeeid") || "";
		var login = {
			email : email,
			password : password,   
			roleid : roleid,
			username:username,
			employeeid : employeeid,
		};    
   
		return ERP.post('/erp/login/loggedin', login) || false;
	}  	
};
