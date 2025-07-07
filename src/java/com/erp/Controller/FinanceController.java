package com.erp.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.andromeda.commons.model.Response;
import com.erp.Model.Finance;
import com.erp.Model.Ctc;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.FileModel;
import com.erp.Service.FinanceService;

import commons.util.Base64;



@RestController                
@RequestMapping("/finance")
public class FinanceController {
	
	String file = null;
	Response response = new Response();
	
	@Autowired
	private FinanceService financeService; 
	
	/* getting financial year drop down */
	@ResponseBody
	@RequestMapping(value = "getfinancialyears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getfinancialyears()
	{   
	return financeService.getfinancialyears();
	}
	
	
	
	/* Inserting liabilities */
	@ResponseBody
	@RequestMapping(value = "addliability", method = { RequestMethod.POST })
	public Response addliability(@RequestBody Finance finance)
	{
		System.out.println("hi");
		return financeService.addliability(finance);
		       
	}
	
	/* getting liabilities heads */
	@ResponseBody
	@RequestMapping(value = "getliabilitiesheads", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getliabilitiesheads()
	{
		return financeService.getliabilitiesheads();
	}
	
	/* getting all liability data in table */
	@ResponseBody
	@RequestMapping(value = "getallliabilities", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallliabilities()
	{
		return financeService.getallliabilities();
	}
	
	/* getting all Email Settings data in table */
	@ResponseBody
	@RequestMapping(value = "getallemailSettingsdata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallemailSettingsdata()
	{
		return financeService.getallemailSettingsdata();
	}
	
	/* Inserting expense accounts */
	@ResponseBody
	@RequestMapping(value = "addexpenseaccount", method = { RequestMethod.POST })
	public Response addexpenseaccount(@RequestBody Finance finance)
	{
		System.out.println("hi");
		return financeService.addexpenseaccount(finance);       
	}
	
	/* getting all liability data in table */
	@ResponseBody
	@RequestMapping(value = "getalllexpenseaccounts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getalllexpenseaccounts()
	{
		return financeService.getalllexpenseaccounts();
	}
	
	/* getting data based on expense account name */
	@ResponseBody
	@RequestMapping(value = "getexpenseaccountdetails", method = { RequestMethod.POST })
	public Response getexpenseaccountdetails(@RequestBody String expense_account_name)
	{
		return financeService.getexpenseaccountdetails(expense_account_name);
	}
	
	/* update data based on expense account name */
	@ResponseBody
	@RequestMapping(value = "updateexpenseaccount", method = { RequestMethod.POST })
	public Response updateexpenseaccount(@RequestBody Finance finance)
	{
		return financeService.updateexpenseaccount(finance);
	}
	
	/* update data based on voucher_number */
	@ResponseBody
	@RequestMapping(value = "updateJE", method = { RequestMethod.POST })
	public Response updateJE(@RequestBody Finance finance)
	{
		return financeService.updateJE(finance);
	}
	
	/* inserting cost center */
	@ResponseBody
	@RequestMapping(value = "createcostcenter", method = { RequestMethod.POST })
	public Response createcostcenter(@RequestBody Finance finance)
	{
		System.out.println("cost center creation");
		return financeService.createcostcenter(finance);       
	}
	
	/* getting all cost centers in table */
	@ResponseBody
	@RequestMapping(value = "getalllcostcenters", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getalllcostcenters()
	{
		return financeService.getalllcostcenters();
	}
	
	/* getting cost center data based on cost center name */
	@ResponseBody
	@RequestMapping(value = "getcostcenterdata", method = { RequestMethod.POST })
	public Response getcostcenterdata(@RequestBody String name)
	{
		return financeService.getcostcenterdata(name);
	}
	
	/* updating cost center based on cost center name */
	@ResponseBody
	@RequestMapping(value = "updatecostcenter", method = { RequestMethod.POST })
	public Response updatecostcenter(@RequestBody Finance finance)
	{
		return financeService.updatecostcenter(finance);
	}
	
	/* creating tax group */
	@ResponseBody
	@RequestMapping(value = "createtaxgroup", method = { RequestMethod.POST })
	public Response createtaxgroup(@RequestBody Finance finance)
	{
		System.out.println("tax group creation");
		return financeService.createtaxgroup(finance);       
	}
	
	/* getting all tax groups in table */
	@ResponseBody
	@RequestMapping(value = "getallltaxgroups", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallltaxgroups()
	{
		return financeService.getallltaxgroups();
	}
	
	/* getting data in popup based on tax group name */
	@ResponseBody
	@RequestMapping(value = "gettaxgroupdata", method = { RequestMethod.POST })
	public Response gettaxgroupdata(@RequestBody String tax_group_name)
	{
		return financeService.gettaxgroupdata(tax_group_name);
	}
	
	/* updating tax group based on tax group name */
	@ResponseBody
	@RequestMapping(value = "updatetaxgroup", method = { RequestMethod.POST })
	public Response updatetaxgroup(@RequestBody Finance finance)
	{
		return financeService.updatetaxgroup(finance);
	}	
	
	/* creating nature of service */
	@ResponseBody
	@RequestMapping(value = "createnatureofservice", method = { RequestMethod.POST })
	public Response createnatureofservice(@RequestBody Finance finance)
	{
		System.out.println("nature of service creation");
		return financeService.createnatureofservice(finance);       
	}
	
	/* getting all nature of services in table */
	@ResponseBody
	@RequestMapping(value = "getalllnatureofservices", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getalllnatureofservices()
	{
		return financeService.getalllnatureofservices();
	}
	
	/* getting al reimbursement data */
	@ResponseBody
	@RequestMapping(value = "getallReimbursementdata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallReimbursementdata()
	{
		return financeService.getallReimbursementdata();
	}
	
	/* getting data based on service name */
	@ResponseBody
	@RequestMapping(value = "getnatureofservice", method = { RequestMethod.POST })
	public Response getnatureofservice(@RequestBody String service_name)
	{
		return financeService.getnatureofservice(service_name);
	}
	
	/* getting data based on id */
	@ResponseBody
	@RequestMapping(value = "getReimbursementdata", method = { RequestMethod.POST })
	public Response getReimbursementdata(@RequestBody Integer id)
	{
		return financeService.getReimbursementdata(id);
	}
	
	/* getting email settings data based on id */
	@ResponseBody
	@RequestMapping(value = "getemailsetingsdata", method = { RequestMethod.POST })
	public Response getemailsetingsdata(@RequestBody Integer id)
	{
		return financeService.getemailsetingsdata(id);
	}
	
	/* updating email settings data based on id */
	@ResponseBody
	@RequestMapping(value = "updateEmailsettings", method = { RequestMethod.POST })
	public Response updateEmailsettings(@RequestBody Finance finance)
	{
		return financeService.updateEmailsettings(finance);
	}	
	
	/* updating reimbursement data based on id */
	@ResponseBody
	@RequestMapping(value = "updateReimbursements", method = { RequestMethod.POST })
	public Response updateReimbursements(@RequestBody Finance finance)
	{
		return financeService.updateReimbursements(finance);
	}	
	
	/* updating data based on service name */
	@ResponseBody
	@RequestMapping(value = "updatenatureofservice", method = { RequestMethod.POST })
	public Response updatenatureofservice(@RequestBody Finance finance)
	{
		return financeService.updatenatureofservice(finance);
	}	
	
	/* getting tax group dropdown */
	@ResponseBody
	@RequestMapping(value = "getTaxgroups", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getTaxgroups()
	{
		return financeService.getTaxgroups();
	}
	
	/* getting service type dropdown */
	@ResponseBody
	@RequestMapping(value = "getservicetype", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getservicetype()
	{
		return financeService.getservicetype();
	}
	
	/* getting gl account names dropdown */
	@ResponseBody
	@RequestMapping(value = "getTaxaccountnames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getTaxaccountnames()
	{
		return financeService.getTaxaccountnames();
	}
	
	/* creating tax account */
	@ResponseBody
	@RequestMapping(value = "createtaxaccount", method = { RequestMethod.POST })
	public Response createtaxaccount(@RequestBody Finance finance)
	{
		System.out.println("tax account creation");
		return financeService.createtaxaccount(finance);       
	}
	
	/* getting all data to table in tax account */
	@ResponseBody
	@RequestMapping(value = "getallltaxaccounts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallltaxaccounts()
	{
		return financeService.getallltaxaccounts();
	}
	
	/* get tax account data based on tax account name */
	@ResponseBody
	@RequestMapping(value = "gettaxaccountdata", method = { RequestMethod.POST })
	public Response gettaxaccountdata(@RequestBody Integer id)
	{
		return financeService.gettaxaccountdata(id);
	}
	
	/* updating tax account */
	@ResponseBody
	@RequestMapping(value = "updatetaxaccount", method = { RequestMethod.POST })
	public Response updatetaxaccount(@RequestBody Finance finance)
	{
		return financeService.updatetaxaccount(finance);
	}	
	
	/* getting tax section names dropdown */
	@ResponseBody
	@RequestMapping(value = "getTaxsectionnames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getTaxsectionnames()
	{
		return financeService.getTaxsectionnames();
	}
	
	/* Creating Tax mapping */
	@ResponseBody
	@RequestMapping(value = "createtaxmapping", method = { RequestMethod.POST })
	public Response createtaxmapping(@RequestBody Finance finance)
	{
		System.out.println("tax mapping creation");
		return financeService.createtaxmapping(finance);       
	}
	
	/* getting tax mapping data in table */
	@ResponseBody
	@RequestMapping(value = "getallltaxmappings", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallltaxmappings()
	{
		return financeService.getallltaxmappings();
	}
	
	/* getting data in pop up based on id */
	@ResponseBody
	@RequestMapping(value = "gettaxmappingdata", method = { RequestMethod.POST })
	public Response gettaxmappingdata(@RequestBody Integer id)
	{
		return financeService.gettaxmappingdata(id);
	}
	
	/* update tax mapping based on id */
	@ResponseBody
	@RequestMapping(value = "updatetaxmapping", method = { RequestMethod.POST })
	public Response updatetaxmapping(@RequestBody Finance finance)
	{
		return financeService.updatetaxmapping(finance);
	}	
	
	/* removing tax mapping data based on id */
	@ResponseBody
	@RequestMapping(value = "deletetaxmappingdata", method = { RequestMethod.POST })
	public Response remove(@RequestBody Integer id)
	{
		return financeService.remove(id);
	}
	
	/* creating local conveyance rate */
	@ResponseBody
	@RequestMapping(value = "createlocalconveyancerate", method = { RequestMethod.POST })
	public Response createlocalconveyancerate(@RequestBody Finance finance)
	{
		System.out.println("local conveyance creation");
		return financeService.createlocalconveyancerate(finance);       
	}
	
	/* getting all details of local conveyance to table */
	@ResponseBody
	@RequestMapping(value = "getallllocalconveyancesdata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallllocalconveyancesdata()
	{
		return financeService.getallllocalconveyancesdata();
	}
	
	/* getting local conveyance data in pop up based on id */
	@ResponseBody
	@RequestMapping(value = "getlocalconveyancedata", method = { RequestMethod.POST })
	public Response getlocalconveyancedata(@RequestBody Integer id)
	{
		return financeService.getlocalconveyancedata(id);
	}
	
	/* updating local conveyance data */
	@ResponseBody
	@RequestMapping(value = "updatelocalconveyancedata", method = { RequestMethod.POST })
	public Response updatelocalconveyancedata(@RequestBody Finance finance)
	{
		return financeService.updatelocalconveyancedata(finance);
	}
	
	/* creating vehicle type */
	@ResponseBody
	@RequestMapping(value = "createvehicletype", method = { RequestMethod.POST })
	public Response createvehicletype(@RequestBody Finance finance)
	{
		System.out.println("vehicle type creation");
		return financeService.createvehicletype(finance);       
	}
	
	/* getting all details of local conveyance to table */
	@ResponseBody
	@RequestMapping(value = "getalllvehicletypessdata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getalllvehicletypessdata()
	{
		return financeService.getalllvehicletypessdata();
	}
	
	/* getting vehicle type data in pop up based on id */
	@ResponseBody
	@RequestMapping(value = "getvehicletypedatadata", method = { RequestMethod.POST })
	public Response getvehicletypedatadata(@RequestBody Integer id)
	{
		return financeService.getvehicletypedatadata(id);
	}
	
	/* updating vehicle type data */
	@ResponseBody
	@RequestMapping(value = "updatevehicletypedata", method = { RequestMethod.POST })
	public Response updatevehicletypedata(@RequestBody Finance finance)
	{
		return financeService.updatevehicletypedata(finance);
	}
	
	/* creating email settings */
	@ResponseBody
	@RequestMapping(value = "createemailsettings", method = { RequestMethod.POST })
	public Response createemailsettings(@RequestBody Finance finance)
	{
		System.out.println("email settings creation");
		return financeService.createemailsettings(finance);       
	}
	
	/* creating vehicle registration */
	@ResponseBody
	@RequestMapping(value = "createvehicleRegistration", method = { RequestMethod.POST })
	public Response createvehicleRegistration(@RequestBody Finance finance)
	{
		System.out.println("Vehicle Registration creation");
		return financeService.createvehicleRegistration(finance);       
	}
	
	/* getting data in travel drop down */
	@ResponseBody
	@RequestMapping(value = "gettravel", method = { RequestMethod.POST, RequestMethod.GET })
	public Response gettravel()
	{
		return financeService.gettravel();
	}
	
	/* getting data in bank account names drop down */
	@ResponseBody
	@RequestMapping(value = "getBankaccountnames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getBankaccountnames()
	{
		return financeService.getBankaccountnames();
	}
	
	/* creating reimbursement policy */
	@ResponseBody
	@RequestMapping(value = "createreimbursementpolicy", method = { RequestMethod.POST })
	public Response createreimbursementpolicy(@RequestBody Finance finance)
	{
		System.out.println("Reimbursement Policy creation");
		return financeService.createreimbursementpolicy(finance);       
	}
	
	/* creating claim advance new */
	@ResponseBody
	@RequestMapping(value = "submitclaimadvance", method = { RequestMethod.POST })
	public Response submitclaimadvance(@RequestBody Finance finance)
	{
		handleFileUploadcl(finance);
		finance.setImage(file); 
		System.out.println("claim advance creation");
		return financeService.submitclaimadvance(finance);       
	}
	
	/* file upload */
	public String handleFileUploadcl(Finance finance)
	{
	FileOutputStream fos = null;

	try
	{
	String folderName = "Claim Advance";
	String imageValue = finance.getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);

	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
	+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();
	}

	String FileName = UUID.randomUUID().toString();

	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  

	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();
	}
	public static byte[] decodeImagecl(String imageValue)
	 {
	   return Base64.decode(imageValue);
	 }
	
	
	/* getting financial year drop down */
	
	
	/* getting sectors drop down */
	@ResponseBody
	@RequestMapping(value = "getsectors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getsectors()
	{
		return financeService.getsectors();
	}
	
	/* getting projects drop down */
	@ResponseBody
	@RequestMapping(value = "getprojects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getprojects()
	{
		return financeService.getprojects();
	}
	
	/* creating claim advance existing */
	@ResponseBody
	@RequestMapping(value = "submitexistingclaimadvance", method = { RequestMethod.POST })
	public Response submitexistingclaimadvance(@RequestBody Finance finance)
	{
		System.out.println("claim advance creation");
		return financeService.submitexistingclaimadvance(finance);       
	}
	
	/* getting claim advance id drop down */
	@ResponseBody
	@RequestMapping(value = "getclaimadvanceids", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getclaimadvanceids()
	{
		return financeService.getclaimadvanceids();
	}
	
	/* inserting bill submission details */
	@ResponseBody
	@RequestMapping(value = "suubmitbillsubmission", method = { RequestMethod.POST })
	public Response suubmitbillsubmission(@RequestBody Finance finance)
	{
		System.out.println("claim advance creation");
		return financeService.suubmitbillsubmission(finance);       
	}
	
	/* getting nature of services drop down */
	@ResponseBody
	@RequestMapping(value = "getNatureofservices", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNatureofservices()
	{
		return financeService.getNatureofservices();
	}
	
	/* getting states drop down */
	@ResponseBody
	@RequestMapping(value = "getStates", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getStates()
	{
		return financeService.getStates();
	}
	
	/* creating customer */
	@ResponseBody
	@RequestMapping(value = "customercreation", method = { RequestMethod.POST })
	public Response customercreation(@RequestBody Finance finance)
	{
		System.out.println("customercreation");
		return financeService.customercreation(finance);       
	}
	
	/* getting all details in table in customer creation */
	@ResponseBody
	@RequestMapping(value = "getalllCustomerDetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getalllCustomerDetails()
	{
		return financeService.getalllCustomerDetails();
	}
	
	/* getting data to pop up based on customer id */
	@ResponseBody
	@RequestMapping(value = "getCustomerdata", method = { RequestMethod.POST })
	public Response getCustomerdata(@RequestBody String customer_id)
	{
		return financeService.getCustomerdata(customer_id);
	}
	
	/* updating customer data */
	@ResponseBody
	@RequestMapping(value = "UpdateCustomerdata", method = { RequestMethod.POST })
	public Response UpdateCustomerdata(@RequestBody Finance finance)
	{
		return financeService.UpdateCustomerdata(finance);
	}
	
	/* inactivating customer */
	@ResponseBody
	@RequestMapping(value = "inactivecustomer", method = { RequestMethod.POST })
	public Response inactivecustomer(@RequestBody Finance finance)
	{
		return financeService.inactivecustomer(finance);
	}
	
	/* getting customers drop down */
	@ResponseBody
	@RequestMapping(value = "getCustomers", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCustomers()
	{
		return financeService.getCustomers();
	}
	
	/* getting programs drop down */
	@ResponseBody
	@RequestMapping(value = "getPrograms", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPrograms()
	{
		return financeService.getPrograms();
	}
	
	/* getting services drop down */
	@ResponseBody
	@RequestMapping(value = "getServices", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getServices()
	{
		return financeService.getServices();
	}
	
	/* getting schemes drop down */
	@ResponseBody
	@RequestMapping(value = "getSchemes", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSchemes()
	{
		return financeService.getSchemes();
	}
	
	/* creating accounts receivable */
	@ResponseBody
	@RequestMapping(value = "createaccountreceivable", method = { RequestMethod.POST })
	public Response createaccountreceivable(@RequestBody Finance finance)
	{
		handleFileUpload(finance);
		finance.setImage(file);
		System.out.println("createaccountreceivable");
		return financeService.createaccountreceivable(finance);       
	}
	
	/* getting all accounts receivables to table */
	@ResponseBody
	@RequestMapping(value = "getalllaccountsreceivables", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getalllaccountsreceivables()
	{
		return financeService.getalllaccountsreceivables();
	}
	
	/* deleting accounts receivable data from headers table based on voucher id */
	@ResponseBody
	@RequestMapping(value = "deleteaccountsreceivabledata", method = { RequestMethod.POST })
	public Response removeheader(@RequestBody String voucher_id)
	{
		return financeService.removeheader(voucher_id);
	}
	
	/* deleting accounts receivable data from details table based on voucher id */
	@ResponseBody
	@RequestMapping(value = "deleteAccountsreceivabledetails", method = { RequestMethod.POST })
	public Response removedetails(@RequestBody String voucher_id)
	{
		return financeService.removedetails(voucher_id);
	}
	
	/* uploading documents for accounts receivable */
	/*
	@ResponseBody
	@RequestMapping(value = "uploaddocuments", method = { RequestMethod.POST })
	public Response uploaddocuments(@RequestBody Finance finance)
	{
		handleFileUpload(finance);
		finance.setImage(file);  
		return financeService.uploaddocuments(finance);
	}
	*/
	   
	/* file upload */
	public String handleFileUpload(Finance finance)
	{
	FileOutputStream fos = null;

	try
	{
	String folderName = "Accounts Receivable";
	String imageValue = finance.getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);

	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
	+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();
	}

	String FileName = UUID.randomUUID().toString();

	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  

	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();
	}
	public static byte[] decodeImage(String imageValue)
	 {
	   return Base64.decode(imageValue);
	 }
	
	/* getting voucher id */
	@ResponseBody
	@RequestMapping(value = "getvoucherIDdata", method = { RequestMethod.POST })
	public Response getvoucherIDdata(@RequestBody String voucher_id)
	{
		return financeService.getvoucherIDdata(voucher_id);
	}
	
	/* getting vendors drop down */
	@ResponseBody
	@RequestMapping(value = "getvendors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getvendors()
	{
		return financeService.getvendors();
	}
	
	/* creating Journal Voucher */
	@ResponseBody
	@RequestMapping(value = "CreateJE", method = { RequestMethod.POST })
	public Response CreateJE(@RequestBody Finance finance)
	{
		handleFileUploadJE(finance);
		finance.setImage(file);
		System.out.println("CreateJE");
		return financeService.CreateJE(finance);       
	}
	
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "CreateJE", method = { RequestMethod.POST }) public
	 * Response CreateJE(@RequestBody List<Finance> fins) {
	 * handleFileUploadje(fins); ((Finance) fins).setImage(file); return
	 * financeService.CreateJE(fins); }
	 */
	
	
	/* file upload for JE */
	public String handleFileUploadJE(Finance finance)
	{
	FileOutputStream fos = null;
  
	try
	{
	String folderName = "Journal Voucher";
	String imageValue = ((Finance) finance).getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);

	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
	+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();
	}

	String FileName = UUID.randomUUID().toString();

	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  

	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();
	}
	public static byte[] decodeImageJE(String imageValue)
	 {
	   return Base64.decode(imageValue);
	 }
	
	/* getting all journal vouchers to table */
	@ResponseBody
	@RequestMapping(value = "getalljournalaccounts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getalljournalaccounts()
	{
		return financeService.getalljournalaccounts();
	}
	
	/* deleting journal Voucher data from headers table */
	@ResponseBody
	@RequestMapping(value = "deleteJEheaderdata", method = { RequestMethod.POST })
	public Response removejeheader(@RequestBody String voucher_number)
	{
		return financeService.removejeheader(voucher_number);
	}
	
	/* deleting journal Voucher data from details table */
	@ResponseBody
	@RequestMapping(value = "deleteJEdetailsdata", method = { RequestMethod.POST })
	public Response removejedetails(@RequestBody String voucher_number)
	{
		return financeService.removejedetails(voucher_number);
	}
	
	/* getting districts drop down */
	@ResponseBody
	@RequestMapping(value = "getdistricts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdistricts()
	{
		return financeService.getdistricts();
	}
	
	/* creating work order */
	@ResponseBody
	@RequestMapping(value = "createworkorder", method = { RequestMethod.POST })
	public Response createworkorder(@RequestBody Finance finance)
	{
		handleFileUploadwo(finance);  
		finance.setImage(file);  
		System.out.println("createworkorder");
		return financeService.createworkorder(finance);       
	}
	
	/* file upload for work order */
	public String handleFileUploadwo(Finance finance)
	{
	FileOutputStream fos = null;

	try
	{
	String folderName = "Work Order";
	String imageValue = finance.getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);

	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
	+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();
	}

	String FileName = UUID.randomUUID().toString();

	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  

	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{   
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();  
	}
	public static byte[] decodeImagewo(String imageValue)
	 {
	   return Base64.decode(imageValue);
	 }
	
	/* getting work orders to drop down */
	@ResponseBody
	@RequestMapping(value = "getworkorders", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getworkorders()
	{
		return financeService.getworkorders();
	}
	
	/* getting work order details in book invoice */
	@ResponseBody  
	@RequestMapping(value = { "/getDetailsofWO" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDetailsofWO(@RequestBody Finance finance)
	{
	return financeService.getDetailsofWO(finance);  
	}
	
	/* book invoice for others type */
	@ResponseBody
	@RequestMapping(value = "bookothersinvoice", method = { RequestMethod.POST })
	public Response bookothersinvoice(@RequestBody Finance finance)
	{
		System.out.println("bookothersinvoice");
		handleFileUploadAPO1(finance);  
		finance.setImage(file); 
		
		  handleFileUploadAPO2(finance); 
		  finance.setImage1(file);
		 
		return financeService.bookothersinvoice(finance);       
	}
	
	/* file upload for book invoice type others */
	public String handleFileUploadAPO1(Finance finance)
	{
	FileOutputStream fos = null;

	try
	{
	String folderName = "Book invoice";
	String imageValue = finance.getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);

	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
	+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();
	}

	String FileName = UUID.randomUUID().toString();

	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  

	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{   
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();  
	}
	public static byte[] decodeImageAPO1(String imageValue)   
	 {
	   return Base64.decode(imageValue);
	 }
	
	public String handleFileUploadAPO2(Finance finance)
	{
	FileOutputStream fos = null;

	try
	{
	String folderName = "Book invoice";
	String imageValue = finance.getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);

	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
	+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();   
	}

	String FileName = UUID.randomUUID().toString();

	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  

	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{   
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();  
	}
	public static byte[] decodeImageAPO2(String imageValue)
	 {
	   return Base64.decode(imageValue);
	 }
	
	/* getting segments drop down */
	@ResponseBody
	@RequestMapping(value = "getSegments", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSegments()
	{
		return financeService.getSegments();
	}
	
	/* getting SDEI Group names in drop down */
	@ResponseBody
	@RequestMapping(value = "getSDEIgroupnames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSDEIgroupnames()
	{
		return financeService.getSDEIgroupnames();
	}
	
	/* creating Budget input */
	@ResponseBody
	@RequestMapping(value = "createBudgetinput", method = { RequestMethod.POST })
	public Response createBudgetinput(@RequestBody Finance finance)
	{
		System.out.println("createBudgetinput");
		return financeService.createBudgetinput(finance);       
	}
	
	/* getting all budget inputs to table */
	@ResponseBody
	@RequestMapping(value = "getallBudgetInputs", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallBudgetInputs()
	{
		return financeService.getallBudgetInputs();
	}
	
	/* Getting pending list of claims */
	@ResponseBody
	@RequestMapping(value = "getallPendingData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallPendingData()
	{
		return financeService.getallPendingData();
	}
	
  /* getting data in pending view page */
  @ResponseBody
  @RequestMapping(value={"getpendingclaimDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
  public Response getpendingclaimDetails(@RequestBody String claim_reimbursement_id)
  {
	
    return this.financeService.getpendingclaimDetails(claim_reimbursement_id);  
  } 
	
  /* getting view page table data */
  	@ResponseBody
	@RequestMapping(value = {"/getViewpagetabledata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getViewpagetabledata(@RequestBody Finance finance)
	{
		return financeService.getViewpagetabledata(finance);
	}
	  
  /* approving claim in pending view page */
  	@ResponseBody
	@RequestMapping(value = "approveclaim", method = { RequestMethod.POST })
	public Response approveclaim(@RequestBody Finance finance)
	{
		return financeService.approveclaim(finance);
	}
	  	
  	/* Getting pending list of claims */
	@ResponseBody
	@RequestMapping(value = "getallApprovedData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallApprovedData()
	{
		return financeService.getallApprovedData();
	}
	
	/* getting data in approved view page */
	  @ResponseBody
	  @RequestMapping(value={"getAcceptedclaimDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getAcceptedclaimDetails(@RequestBody String claim_reimbursement_id)
	  {
		
	    return this.financeService.getAcceptedclaimDetails(claim_reimbursement_id);  
	  } 
	
	  /* getting all advance list in table */
	  @ResponseBody
	  @RequestMapping(value = "getalladvanceListData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getalladvanceListData()
	  {
	  	return financeService.getalladvanceListData();
	  }
	  
	  /* getting all advance history details to table */
	  @ResponseBody
	  @RequestMapping(value = "getallviewHistoryListData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallviewHistoryListData()
	  {
	  	return financeService.getallviewHistoryListData();
	  }
	  
	  /* getting data in Advanced List view page */
	  @ResponseBody
	  @RequestMapping(value={"getadvanceviewpgedata"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getadvanceviewpgedata(@RequestBody String claim_advance_id)
	  {
		
	    return this.financeService.getadvanceviewpgedata(claim_advance_id);  
	  } 
	  
	  /* getting all advance pending data to table */
	  	@ResponseBody
		@RequestMapping(value = "getalladvancePendingData", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getalladvancePendingData()
		{
			return financeService.getalladvancePendingData();
		}
	  	
	  /* getting advance pending view data */
	  @ResponseBody
  	  @RequestMapping(value={"getadvancependingvewdata"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response getadvancependingvewdata(@RequestBody String claim_advance_id)
  	  {
  		
  	    return this.financeService.getadvancependingvewdata(claim_advance_id);  
  	  } 
	  
	  /* Updating Advance claim data */
	  @ResponseBody
	  @RequestMapping(value = "updateadvanceclaimdata", method = { RequestMethod.POST })
	  public Response updateadvanceclaimdata(@RequestBody Finance finance)
	  {
		  /*
		  handleFileUploadac(finance);
		  finance.setImage(file);
		  */
		  return financeService.updateadvanceclaimdata(finance);
	  }
	  
	  /* file upload */
		public String handleFileUploadac(Finance finance)
		{
		FileOutputStream fos = null;

		try
		{
		String folderName = "Claim Advance";
		String imageValue = finance.getBase64String();
		byte[] imageByteArray = decodeImage(imageValue);

		String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
		+ folderName;
		File dir = new File(baseDir);
		if (!Files.isDirectory(Paths.get(baseDir)))
		{
		dir.mkdirs();
		}

		String FileName = UUID.randomUUID().toString();

		fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
		file = "/uploads/" + folderName + "/" +FileName+".pdf";
		fos.write(imageByteArray);
		fos.close();  

		System.out.println("---Path--> " + file);
		}
		catch (Exception e)
		{
		System.out.println("Exception: " + e.getMessage());
		}
		return file.trim();
		}    
		public static byte[] decodeImageac(String imageValue)
		 {
		   return Base64.decode(imageValue);
		 }
	  
	  /* get advance claim data to pop up */
	  @ResponseBody
	  @RequestMapping(value = "getpopupdata", method = { RequestMethod.POST })
	  public Response getpopupdata(@RequestBody String claim_advance_id)
	  {
		  return financeService.getpopupdata(claim_advance_id);
	  }
	  
	  /* Approving Advance Claim */
	  @ResponseBody
	  @RequestMapping(value = "Approveadvanceclaim", method = { RequestMethod.POST })
	  public Response Approveadvanceclaim(@RequestBody Finance finance)
	  {
		  return financeService.Approveadvanceclaim(finance);
	  }
	  
	  /* getting approved list data */
	  @ResponseBody
		@RequestMapping(value = "getalladvanceApprovedData", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getalladvanceApprovedData()
		{   
			return financeService.getalladvanceApprovedData();
		}
	  
	  /* getting data to advanced approved view page */
	  @ResponseBody
  	  @RequestMapping(value={"getapprovedclaimDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response getapprovedclaimDetails(@RequestBody String claim_advance_id)
  	  {
  		
  	    return this.financeService.getapprovedclaimDetails(claim_advance_id);  
  	  }
	  
	  /* getting all bill submission lists to table */
	  @ResponseBody
	  @RequestMapping(value = "getallbillsubmissionlists", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallbillsubmissionlists()
	  {
	  	return financeService.getallbillsubmissionlists();
	  }
	  
	  /* getting data in bill submission view page */
	  @ResponseBody
	  @RequestMapping(value={"getbillsubmissionviewpgedata"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getbillsubmissionviewpgedata(@RequestBody String claim_reimbursement_id)
	  {
		
	    return this.financeService.getbillsubmissionviewpgedata(claim_reimbursement_id);  
	  } 
	  
	  /* getting data in bill submission update page */
	  @ResponseBody
	  @RequestMapping(value={"getbillsubmissionupdatedata"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getbillsubmissionupdatedata(@RequestBody String claim_reimbursement_id)
	  {
		
	    return this.financeService.getbillsubmissionupdatedata(claim_reimbursement_id);  
	  }
	  
	  /* getting data for advance claim in claim status report page */
	  @ResponseBody
	  @RequestMapping(value = {"/getAdvanceClaimdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getAdvanceClaimdata(@RequestBody Finance finance)
	  {
		  return financeService.getAdvanceClaimdata(finance);
	  }
	  
	  /* getting data for reimbursement claim in claim status report page */
	  @ResponseBody
	  @RequestMapping(value = {"/getreimbursementClaimdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getreimbursementClaimdata(@RequestBody Finance finance)
	  {
		  return financeService.getreimbursementClaimdata(finance);
	  }
	  
	  /* getting advance claim drop down */
	  @ResponseBody
	  @RequestMapping(value = "getAdvanceclaims", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getAdvanceclaims()
	  {
		  return financeService.getAdvanceclaims();
	  }
	  
	  /* getting reimbursement claim drop down */
	  @ResponseBody
	  @RequestMapping(value = "getReimbursementclaims", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getReimbursementclaims()
	  {
		  return financeService.getReimbursementclaims();
	  }
	  
	  /* getting je list data in submitted je tab for period type */
	  @ResponseBody
	  @RequestMapping(value = {"/getperiodJEList"}, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getperiodJEList(@RequestBody Finance finance)
	  {
		  return financeService.getperiodJEList(finance);
	  }
	  
	  /* getting je list data in submitted je tab for Financial type */
	  @ResponseBody
	  @RequestMapping(value = {"/getfinancialJEList"}, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getfinancialJEList(@RequestBody Finance finance)
	  {
		  return financeService.getfinancialJEList(finance);
	  }
	  
	  /* getting data to pop up in submitted list in je list page */
	  @ResponseBody
	  @RequestMapping(value = "getsubmittedjelistdata", method = { RequestMethod.POST })
	  public Response getsubmittedjelistdata(@RequestBody String voucher_number)
	  {
		  return financeService.getsubmittedjelistdata(voucher_number);
	  }
	  
	  /* getting pop up table data for submitted je list view for period type */
	  @ResponseBody
	  @RequestMapping(value = {"/getpopuptabledatasubperiod"}, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getpopuptabledatasubperiod(@RequestBody Finance finance)
	  {
		  return financeService.getpopuptabledatasubperiod(finance);
	  }
	  
	  /* getting data in update page in submitted je list tab for period type */
	  @ResponseBody
	  @RequestMapping(value = "getupdatesubperioddata", method = { RequestMethod.POST })
	  public Response getupdatesubperioddata(@RequestBody String voucher_number)
	  {
		  return financeService.getupdatesubperioddata(voucher_number);
	  }
	  
	  /* getting data to pop up in budget page */
	  @ResponseBody
	  @RequestMapping(value = "viewbudgetpopupdata", method = { RequestMethod.POST })
	  public Response viewbudgetpopupdata(@RequestBody String budget_id)
	  {
		  return financeService.viewbudgetpopupdata(budget_id);
	  }
	  
	  /* getting data in budget over view table based on financial year */
	  @ResponseBody
	  @RequestMapping(value = {"/getbudgetdataoverview"}, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getbudgetdataoverview(@RequestBody Finance finance)
	  {
		  return financeService.getbudgetdataoverview(finance);
	  }
	  
	  /* getting all pending budget inputs to pending list table in budget approval page */
	  @ResponseBody
	  @RequestMapping(value = "getallPendingbudgetData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallPendingbudgetData()
	  {
		  return financeService.getallPendingbudgetData();
	  }
	  
	  /* getting approved or rejected budget inputs list to table in budget approval page */
	  @ResponseBody
	  @RequestMapping(value = "getallapprovedbudgetData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallapprovedbudgetData()
	  {
		  return financeService.getallapprovedbudgetData();
	  }
	  
	  /* getting budget approval view page data */
	  @ResponseBody
  	  @RequestMapping(value={"budgetviewpagedata"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response budgetviewpagedata(@RequestBody String budget_id)
  	  {
  		
  	    return this.financeService.budgetviewpagedata(budget_id);  
  	  } 
	  
	  /* getting financial year simulation summary */
	  @ResponseBody
  	  @RequestMapping(value={"getfinanceyear"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response getfinanceyear(@RequestBody Integer financialyear)
  	  {
  		
  	    return this.financeService.getfinanceyear(financialyear);  
  	  } 
	  
	  
	  /* approving budget input in budget approval view page */
	  @ResponseBody
	  @RequestMapping(value = "approvebudgetinput", method = { RequestMethod.POST })
	  public Response approvebudgetinput(@RequestBody Finance finance)
	  {
		  return financeService.approvebudgetinput(finance);
	  }
	  
	  /* getting pending accounts receivables to table in pending list tab for account receivable list page */
	  @ResponseBody
	  @RequestMapping(value = "getallPendingreceivablesData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallPendingreceivablesData()
	  {
		  return financeService.getallPendingreceivablesData();
	  }
	  
	  /* getting data to view page in accounts receivable list page */
	  @ResponseBody
  	  @RequestMapping(value={"getreceivableviewdata"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response getreceivableviewdata(@RequestBody String voucher_id)
  	  {
  		
  	    return this.financeService.getreceivableviewdata(voucher_id);  
  	  }
	  
	  /* approving accounts receivables */
	  @ResponseBody
	  @RequestMapping(value = "approveaccountsreceivable", method = { RequestMethod.POST })
	  public Response approveaccountsreceivable(@RequestBody Finance finance)
	  {
		  return financeService.approveaccountsreceivable(finance);
	  }
	  
	  /* getting approved or rejected data to table in approved or rejected tab for accounts receivable list page */
	  @ResponseBody
	  @RequestMapping(value = "getallPendingapprovedrejectedreceivablesData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallPendingapprovedrejectedreceivablesData()
	  {
		  return financeService.getallPendingapprovedrejectedreceivablesData();
	  }
	  
	  /* getting receivables to booked invoices table in accounts receivables */
	  @ResponseBody
	  @RequestMapping(value = "getallbookedreceivablesData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallbookedreceivablesData()
	  {
		  return financeService.getallbookedreceivablesData();
	  }
	  
	  /* getting partially paid invoices in accounts receivable booked invoices */
	  @ResponseBody
	  @RequestMapping(value = "getpartiallypaideceivablesData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getpartiallypaideceivablesData()
	  {
		  return financeService.getpartiallypaideceivablesData();
	  }
	  
	  /* getting employee names drop down in form-16 page */
	  @ResponseBody
	  @RequestMapping(value = "getEmployeenames", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getEmployeenames()
	  {
		  return financeService.getEmployeenames();
	  }
	  
	  /* getting data in pending invoices tab in booked invoice page in finance login */
	  @ResponseBody
	  @RequestMapping(value = "getallPendinginvoicesData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallPendinginvoicesData()
	  {
		  return financeService.getallPendinginvoicesData();
	  }
	  
	  
	  
	  
	  
	  /* Account_Payable */
	  @ResponseBody
	  @RequestMapping(value = "getAllPendings", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getAllPendings() {
	  return financeService.getAllPendings();
	  }

	    
	 /* @ResponseBody
	  @RequestMapping(value = { "/getByPendingDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getByPendingDetails(@RequestBody Finance finance) {
	  return this.financeService.getByPendingDetails(finance);
	  }*/
	  
	  
	    
	
	 
	  @ResponseBody
  	  @RequestMapping(value={"getByPendingDetailsdata"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response getByPendingDetailsdata(@RequestBody String voucher_id)
  	  {
  		
  	    return this.financeService.getByPendingDetailsdata(voucher_id);  
  	  } 

	  @ResponseBody
	  @RequestMapping(value = { "/getTaxDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getTaxDetails(@RequestBody String voucher_id) {
	  return financeService.getTaxDetails(voucher_id);
	  }

	  @ResponseBody
	  @RequestMapping(value = { "/getPaymentDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getPaymentDetails(@RequestBody String voucher_id) {
	  return this.financeService.getPaymentDetails(voucher_id);
	  }


	  @ResponseBody
	  @RequestMapping(value = { "/getItemDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getItemDetails(@RequestBody String voucher_id) {
	  return financeService.getItemDetails(voucher_id);
	  }
	  
	  @ResponseBody
	  @RequestMapping(value = { "/getJournalEntryDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getJournalEntryDetails(@RequestBody String voucher_id) {
	  return financeService.getJournalEntryDetails(voucher_id);
	  }
	  
	  @ResponseBody
	  @RequestMapping(value = { "/getDocumentDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getDocumentDetails(@RequestBody String voucher_id) {
	  return financeService.getDocumentDetails(voucher_id);
	  }

	  @ResponseBody
	  @RequestMapping(value = { "/getCommentDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getCommentDetails(@RequestBody String voucher_id) {
	  return financeService.getCommentDetails(voucher_id);
	  }

	  @ResponseBody
	  @RequestMapping(value = { "/getTimelineDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getTimelineDetails(@RequestBody String voucher_id) {
	  return financeService.getTimelineDetails(voucher_id);
	  }

	  @ResponseBody
	  @RequestMapping(value = { "/getPreviousInvoiceDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getPreviousInvoiceDetails(@RequestBody Integer workorder) {
	  return financeService.getPreviousInvoiceDetails(workorder);
	  }

	  @ResponseBody
	  @RequestMapping(value = { "/getJVDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getJVDetails(@RequestBody String voucher_id) {
	  return financeService.getJVDetails(voucher_id);
	  }

	  @ResponseBody
	  @RequestMapping(value = { "/saveComments" }, method = { RequestMethod.POST })
	  public Response saveComments(@RequestBody Finance finance) {
	  return financeService.saveComments(finance);
	  }
	  
	  /* booking invoice in accounts payable view page */
	  @ResponseBody
	  @RequestMapping(value = "bookaccountspayableinvoice", method = { RequestMethod.POST })
	  public Response bookaccountspayableinvoice(@RequestBody Finance finance)
	  {
		 System.out.println("bookaccountspayableinvoice");
		 return financeService.bookaccountspayableinvoice(finance);       
	  }
	  
	  /* getting data in view page */
	  @ResponseBody
		@RequestMapping(value = "getjouranlentrydata", method = { RequestMethod.POST })
		public Response getjouranlentrydata()
		{
			return financeService.getjouranlentrydata();
		}
	  
	/*   getting payment release page details 
	  @ResponseBody
	  @RequestMapping(value={"getpaymentdetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getpaymentdetails(@RequestBody Finance finance)
	  {
		
	    return this.financeService.getpaymentdetails(finance);  
	  } */
	  
	  /* getting partial payment release page details */
	/*      
	 * @ResponseBody
	 * 
	 * @RequestMapping(value={"getPartialpaydet"}, method={ RequestMethod.POST,
	 * RequestMethod.GET }) public Response getPartialpaydet(@RequestBody Finance
	 * finance) {
	 * 
	 * return this.financeService.getPartialpaydet(finance); }
	 */
	  
	  @ResponseBody
  	  @RequestMapping(value={"getPartialpaydet"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response getPartialpaydet(@RequestBody String voucher_number)
  	  {
  		
  	    return this.financeService.getPartialpaydet(voucher_number);  
  	  }
	  
	  /* releasing payment to vendor */
	  @ResponseBody
		@RequestMapping(value = "Releasepaymenttovendor", method = { RequestMethod.POST })
		public Response Releasepaymenttovendor(@RequestBody Finance finance)
		{
			System.out.println("Releasepaymenttovendor");
			return financeService.Releasepaymenttovendor(finance);       
		}
	  
	  /* getting all bank payments details to table in bank payments page */
	  @ResponseBody
	  @RequestMapping(value = "getallbankpaymentsdata", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallbankpaymentsdata()
	  {
		  return financeService.getallbankpaymentsdata();
	  }
	  
	  /* getting data in bank payments view page */
	  @ResponseBody
	  @RequestMapping(value={"getBankpaymentsdata"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getBankpaymentsdata(@RequestBody String voucher_number)
	  {
		
	    return this.financeService.getBankpaymentsdata(voucher_number);  
	  } 
	  
	  /* getting payment bank details to view page table in bank payments */
	  @ResponseBody
	  @RequestMapping(value = { "/getpaymentaccountdetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getpaymentaccountdetails(@RequestBody String voucher_number) {
	  return financeService.getpaymentaccountdetails(voucher_number);
	  }
	  
	  /* getting all booked invoices to table in booked invoices page */
	  @ResponseBody
	  @RequestMapping(value = "getallbookedinvoicesData", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallbookedinvoicesData()
	  {
		  return financeService.getallbookedinvoicesData();
	  }
	  
	  /* getting data in booked invoice view page */
	  @ResponseBody
  	  @RequestMapping(value={"getJouranlentrydata"}, method={ RequestMethod.POST, RequestMethod.GET })
  	  public Response getJouranlentrydata(@RequestBody String voucher_id)
  	  {
  		
  	    return this.financeService.getJouranlentrydata(voucher_id);  
  	  }
	  
	  /* getting all partially paid invoices to table in booked invoices page */
	  @ResponseBody
	  @RequestMapping(value = "getallpartiallypaidinvoices", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getallpartiallypaidinvoices()
	  {
		  return financeService.getallpartiallypaidinvoices();
	  }
	  
	  /* getting data in multiple release payment page */
	 /* @ResponseBody
	  @RequestMapping(value={"getpaymenttabledetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getpaymenttabledetails(@RequestBody String name)
	  {
		
	    return this.financeService.getpaymenttabledetails(name);  
	  } 
	  */
	  
	  /* tax section creation */
	  @ResponseBody
	  @RequestMapping(value = "getAllCreateSections", method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getAllCreateSections()
	  {
		  return financeService.getAllCreateSections();
	  } 
	  
	  @ResponseBody
		@RequestMapping(value = "getBySection", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getBySection(@RequestBody Integer id)
		{
			
			return financeService.getBySection(id);
		}
	  
	  @ResponseBody
		@RequestMapping(value = "updateSectionData", method = { RequestMethod.POST })
		public Response updateSectionData(@RequestBody Finance finance)
		{
			
			return financeService.updateSectionData(finance);
		}
	  
	  /*section Details*/
	  @ResponseBody
		@RequestMapping(value = { "/saveSectionDetails" }, method = { RequestMethod.POST })
		public Response saveSectionDetails(@RequestBody Finance finance)
		{ 
			return financeService.saveSectionDetails(finance);      
		} 
	  
	  @ResponseBody
		@RequestMapping(value = { "/saveTaxDetails" }, method = { RequestMethod.POST })
		public Response saveTaxDetails(@RequestBody Finance finance)
		{ 
			return financeService.saveTaxDetails(finance);      
		} 
	  
	  @ResponseBody
		@RequestMapping(value = "getAllSections", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getAllSections()
		{
		  System.out.println("Controller");
			return financeService.getAllSections();
		} 
	  
	  @ResponseBody
		@RequestMapping(value = "getByTax", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getByTax(@RequestBody Integer id)
		{
			
			return financeService.getByTax(id);
		}
		@ResponseBody
		@RequestMapping(value = "updateTaxData", method = { RequestMethod.POST })
		public Response updateTaxData(@RequestBody Finance finance)
		{
			
			return financeService.updateTaxData(finance);
		}
	  
		
		/* finance admin gl accounts */
		
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getAccountType", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getAccountType() { return
	 * financeService.getAccountType(); }
	 */
		
		@ResponseBody
		@RequestMapping(value = "getAccountType", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getAccountType()
		{
			return financeService.getAccountType();
		}		
		
		
		@ResponseBody
		@RequestMapping(value = "getGLHeads", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLHeads()
		{
			return financeService.getGLHeads();
		}
		    
		@ResponseBody
		@RequestMapping(value = "getIncomeHeads", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getIncomeHeads()
		{
			return financeService.getIncomeHeads();
		}
		
		@ResponseBody
		@RequestMapping(value = "getLiability", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getLiability()
		{
			return financeService.getLiability();
		}
		
		@ResponseBody
		@RequestMapping(value = "getAssetClass", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getAssetClass()
		{
			return financeService.getAssetClass();
		}
		                                                      
		  @ResponseBody
		  @RequestMapping(value={"/getAssetNature"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
		  public Response getAssetNature(@RequestBody Integer asset_id)
		  {
		    return this.financeService.getAssetNature(asset_id);
		  }
		
		  @ResponseBody
			@RequestMapping(value = { "/saveGLgroupDetails" }, method = { RequestMethod.POST })
			public Response saveGLgroupDetails(@RequestBody Finance finance)
			{ 
				return financeService.saveGLgroupDetails(finance);      
			} 
		  
		  @ResponseBody
			@RequestMapping(value = "getAllGLgroups", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAllGLgroups()
			{
				return financeService.getAllGLgroups();
			} 
		  
		  @ResponseBody
			@RequestMapping(value = "getByGLGroup", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getByGLGroup(@RequestBody Integer id)
			{
				
				return financeService.getByGLGroup(id);
			}
			@ResponseBody
			@RequestMapping(value = "updateData", method = { RequestMethod.POST })
			public Response updateData(@RequestBody Finance finance)
			{
				
				return financeService.updateData(finance);
			}
			/*subgroup Details*/
			@ResponseBody
			@RequestMapping(value = "getGLGroup", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getGLGroup()
			{
				return financeService.getGLGroup();
			}
			
			  @ResponseBody
				@RequestMapping(value = { "/saveGLSubgroupDetails" }, method = { RequestMethod.POST })
				public Response saveGLSubgroupDetails(@RequestBody Finance finance)
				{ 
					return financeService.saveGLSubgroupDetails(finance);      
				} 
			  
			  @ResponseBody
				@RequestMapping(value = "getAllGLSubgroups", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getAllGLSubgroups()
				{
					return financeService.getAllGLSubgroups();
				} 
			  
			  @ResponseBody
				@RequestMapping(value = "getByGLSubGroup", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getByGLSubGroup(@RequestBody Integer id)
				{
					
					return financeService.getByGLSubGroup(id);
				}
				@ResponseBody
				@RequestMapping(value = "updateGLSubData", method = { RequestMethod.POST })
				public Response updateGLSubData(@RequestBody Finance finance)
				{
					
					return financeService.updateGLSubData(finance);
				}
				
				/*Account Details*/
				@ResponseBody
				@RequestMapping(value = "getGLSubGroup", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getGLSubGroup()
				{
					return financeService.getGLSubGroup();
				}
				
			  @ResponseBody
				@RequestMapping(value = { "/saveGLAccountDetails" }, method = { RequestMethod.POST })
				public Response saveGLAccountDetails(@RequestBody Finance finance)
				{ 
					return financeService.saveGLAccountDetails(finance);      
				} 
			  
			  @ResponseBody
				@RequestMapping(value = "getAllGLAccount", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getAllGLAccount()
				{
					return financeService.getAllGLAccount();
				} 
			  
			  @ResponseBody
				@RequestMapping(value = "getByGLAccount", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getByGLAccount(@RequestBody Integer id)
				{
					
					return financeService.getByGLAccount(id);
				}
				@ResponseBody
				@RequestMapping(value = "updateGLAccountData", method = { RequestMethod.POST })
				public Response updateGLAccountData(@RequestBody Finance finance)
				{
					
					return financeService.updateGLAccountData(finance);
				}
	  
	/* getting accounts receivable list view page table data */
	 @ResponseBody
	  @RequestMapping(value = { "/getARDetailstabledatainview" }, method = { RequestMethod.POST, RequestMethod.GET })
	  public Response getARDetailstabledatainview(@RequestBody String voucher_id) {
	  return financeService.getARDetailstabledatainview(voucher_id);
	  }
	 
	 /* updating JE */
	 @ResponseBody
	 @RequestMapping(value = "updateJV", method = { RequestMethod.POST })
	 public Response updateJV(@RequestBody Finance finance)
	 {
		 return financeService.updateJV(finance);
	 }
	 
	 /* updating bills */
	 @ResponseBody
	 @RequestMapping(value = "updateBills", method = { RequestMethod.POST })
	 public Response updateBills(@RequestBody Finance finance)
	 {
		 return financeService.updateBills(finance);
	 }
	 
	 

		
		/*@ResponseBody
		@RequestMapping(value = { "/getJournalEntryDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getJournalEntryDetails(@RequestBody String voucher_number) {
			return financeService.getJournalEntryDetails(voucher_number);
		}
		*/    

	
		
		@ResponseBody
		@RequestMapping(value = { "/getProjectWiseSpentReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getProjectWiseSpentReport(@RequestBody Finance finance) {
			return financeService.getProjectWiseSpentReport(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = "getAllProjects", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getAllProjects() {
			return financeService.getAllProjects();
		}
		
	
		

		@ResponseBody
		@RequestMapping(value = "getVendorDetails", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getVendorDetails() {
			return financeService.getVendorDetails();
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getInvoiceDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getInvoiceDetails(@RequestBody Integer id) {
			return financeService.getInvoiceDetails(id);
		}
		@ResponseBody
		@RequestMapping(value = { "/getWorkorderDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getWorkorderDetails(@RequestBody Integer id) {
			return financeService.getWorkorderDetails(id);
		}
		@ResponseBody
		@RequestMapping(value = { "/getPurchaseorderDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getPurchaseorderDetails(@RequestBody Integer id) {
			return financeService.getPurchaseorderDetails(id);
		}
		@ResponseBody
		@RequestMapping(value = { "/getMouDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMouDetails(@RequestBody Integer id) {
			return financeService.getMouDetails(id);
		}

		@ResponseBody
		@RequestMapping(value = { "/getInvoiceStatusReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getInvoiceStatusReport(@RequestBody Finance finance) {
			return financeService.getInvoiceStatusReport(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getInvoiceTotalData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getInvoiceTotalData(@RequestBody Finance finance) {
			return financeService.getInvoiceTotalData(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getTotalBookedData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalBookedData(@RequestBody Finance finance) {
			return financeService.getTotalBookedData(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getTotalReportingData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalReportingData(@RequestBody Finance finance) {
			return financeService.getTotalReportingData(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getTotalPendingData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalPendingData(@RequestBody Finance finance) {
			return financeService.getTotalPendingData(finance);
		}
		
		
		@ResponseBody
		@RequestMapping(value = { "/getTotalPaymentData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalPaymentData(@RequestBody Finance finance) {
			return financeService.getTotalPaymentData(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getTotalReleasedData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalReleasedData(@RequestBody Finance finance) {
			return financeService.getTotalReleasedData(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getTotalHoldData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalHoldData(@RequestBody Finance finance) {
			return financeService.getTotalHoldData(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getTotalReturnedData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalReturnedData(@RequestBody Finance finance) {
			return financeService.getTotalReturnedData(finance);
		}
		
		
		
		   /*  WORKORDER*/
		
		@ResponseBody
		@RequestMapping(value = { "/getWorkorderStatusReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getWorkorderStatusReport(@RequestBody Finance finance) {
			return financeService.getWorkorderStatusReport(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getWorkorderTotalData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getWorkorderTotalData(@RequestBody Finance finance) {
			return financeService.getWorkorderTotalData(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getTotalWorkorderReportingData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalWorkorderReportingData(@RequestBody Finance finance) {
			return financeService.getTotalWorkorderReportingData(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getTotalworkorderPendingData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalworkorderPendingData(@RequestBody Finance finance) {
			return financeService.getTotalworkorderPendingData(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getTotalWorkorderCEOData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalWorkorderCEOData(@RequestBody Finance finance) {
			return financeService.getTotalWorkorderCEOData(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getTotalApprovedData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalApprovedData(@RequestBody Finance finance) {
			return financeService.getTotalApprovedData(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getTotalWorkorderHoldData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalWorkorderHoldData(@RequestBody Finance finance) {
			return financeService.getTotalWorkorderHoldData(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getTotalWorkorderReturnedData" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getTotalWorkorderReturnedData(@RequestBody Finance finance) {
			return financeService.getTotalWorkorderReturnedData(finance);
		}
		
		
		 /*  PURCHASEORDER*/
		
			@ResponseBody
			@RequestMapping(value = { "/getPurchaseorderStatusReport" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getPurchaseorderStatusReport(@RequestBody Finance finance) {
				return financeService.getPurchaseorderStatusReport(finance);
			}
			
			@ResponseBody
			@RequestMapping(value = { "/getPurchaseorderTotalData" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getPurchaseorderTotalData(@RequestBody Finance finance) {
				return financeService.getPurchaseorderTotalData(finance);
			}
			@ResponseBody
			@RequestMapping(value = { "/getTotalPurchaseorderReportingData" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getTotalPurchaseorderReportingData(@RequestBody Finance finance) {
				return financeService.getTotalPurchaseorderReportingData(finance);
			}
			@ResponseBody
			@RequestMapping(value = { "/getTotalpurchaseorderPendingData" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getTotalpurchaseorderPendingData(@RequestBody Finance finance) {
				return financeService.getTotalpurchaseorderPendingData(finance);
			}
			@ResponseBody
			@RequestMapping(value = { "/getTotalPurchaseorderCEOData" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getTotalPurchaseorderCEOData(@RequestBody Finance finance) {
				return financeService.getTotalPurchaseorderCEOData(finance);
			}
			@ResponseBody
			@RequestMapping(value = { "/getTotalPurchaseApprovedData" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getTotalPurchaseApprovedData(@RequestBody Finance finance) {
				return financeService.getTotalPurchaseApprovedData(finance);
			}
			@ResponseBody
			@RequestMapping(value = { "/getTotalPurchaseorderHoldData" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getTotalPurchaseorderHoldData(@RequestBody Finance finance) {
				return financeService.getTotalPurchaseorderHoldData(finance);
			}
			@ResponseBody
			@RequestMapping(value = { "/getTotalPurchaseorderReturnedData" }, method = { RequestMethod.POST, RequestMethod.GET })
			public Response getTotalPurchaseorderReturnedData(@RequestBody Finance finance) {
				return financeService.getTotalPurchaseorderReturnedData(finance);
			}
			
			

			 /*  MOU*/
			
				@ResponseBody
				@RequestMapping(value = { "/getMOUStatusReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMOUStatusReport(@RequestBody Finance finance) {
					return financeService.getMOUStatusReport(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMOUTotalData" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMOUTotalData(@RequestBody Finance finance) {
					return financeService.getMOUTotalData(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTotalMOUReportingData" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTotalMOUReportingData(@RequestBody Finance finance) {
					return financeService.getTotalMOUReportingData(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTotalMOUPendingData" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTotalMOUPendingData(@RequestBody Finance finance) {
					return financeService.getTotalMOUPendingData(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTotalMOUCEOData" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTotalMOUCEOData(@RequestBody Finance finance) {
					return financeService.getTotalMOUCEOData(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTotalMOUApprovedData" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTotalMOUApprovedData(@RequestBody Finance finance) {
					return financeService.getTotalMOUApprovedData(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTotalMOUHoldData" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTotalMOUHoldData(@RequestBody Finance finance) {
					return financeService.getTotalMOUHoldData(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTotalMOUReturnedData" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTotalMOUReturnedData(@RequestBody Finance finance) {
					return financeService.getTotalMOUReturnedData(finance);
				}
		
		
		
		
		@ResponseBody
		@RequestMapping(value = { "/getAssetReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getAssetReport(@RequestBody Finance finance) {
			return financeService.getAssetReport(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getEquityReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getEquityReport(@RequestBody Finance finance) {
			return financeService.getEquityReport(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getGLAsset" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAsset(@RequestBody Finance finance) {
			return financeService.getGLAsset(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAsset1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAsset1(@RequestBody Finance finance) {
			return financeService.getGLAsset1(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getGLAsset2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAsset2(@RequestBody Finance finance) {
			return financeService.getGLAsset2(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAsset3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAsset3(@RequestBody Finance finance) {
			return financeService.getGLAsset3(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAsset4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAsset4(@RequestBody Finance finance) {
			return financeService.getGLAsset4(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAsset5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAsset5(@RequestBody Finance finance) {
			return financeService.getGLAsset5(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAsset6" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAsset6(@RequestBody Finance finance) {
			return financeService.getGLAsset6(finance);
		}
		

		@ResponseBody
		@RequestMapping(value = { "/getGLEquity" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquity(@RequestBody Finance finance) {
			return financeService.getGLEquity(finance);
		}

		@ResponseBody
		@RequestMapping(value = { "/getGLEquity1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquity1(@RequestBody Finance finance) {
			return financeService.getGLEquity1(finance);
		}

		@ResponseBody
		@RequestMapping(value = { "/getGLEquity2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquity2(@RequestBody Finance finance) {
			return financeService.getGLEquity2(finance);
		}

		@ResponseBody
		@RequestMapping(value = { "/getGLEquity3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquity3(@RequestBody Finance finance) {
			return financeService.getGLEquity3(finance);
		}

		@ResponseBody
		@RequestMapping(value = { "/getGLEquity4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquity4(@RequestBody Finance finance) {
			return financeService.getGLEquity4(finance);
		}

		@ResponseBody
		@RequestMapping(value = { "/getGLEquity5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquity5(@RequestBody Finance finance) {
			return financeService.getGLEquity5(finance);
		}
		
		
/*MONTHLY BALANCE SHEET REPORT*/
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthEquityReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthEquityReport(@RequestBody Finance finance) {
			return financeService.getMonthEquityReport(finance);
		}
		
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthAssetReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthAssetReport(@RequestBody Finance finance) {
			return financeService.getMonthAssetReport(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAsset" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAsset(@RequestBody Finance finance) {
			return financeService.getMonthGLAsset(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAsset1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAsset1(@RequestBody Finance finance) {
			return financeService.getMonthGLAsset1(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAsset2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAsset2(@RequestBody Finance finance) {
			return financeService.getMonthGLAsset2(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAsset3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAsset3(@RequestBody Finance finance) {
			return financeService.getMonthGLAsset3(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAsset4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAsset4(@RequestBody Finance finance) {
			return financeService.getMonthGLAsset4(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAsset5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAsset5(@RequestBody Finance finance) {
			return financeService.getMonthGLAsset5(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAsset6" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAsset6(@RequestBody Finance finance) {
			return financeService.getMonthGLAsset6(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquity" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquity(@RequestBody Finance finance) {
			return financeService.getMonthGLEquity(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquity1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquity1(@RequestBody Finance finance) {
			return financeService.getMonthGLEquity1(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquity2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquity2(@RequestBody Finance finance) {
			return financeService.getMonthGLEquity2(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquity3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquity3(@RequestBody Finance finance) {
			return financeService.getMonthGLEquity3(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquity4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquity4(@RequestBody Finance finance) {
			return financeService.getMonthGLEquity4(finance);
		}
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquity5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquity5(@RequestBody Finance finance) {
			return financeService.getMonthGLEquity5(finance);
		}
		
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetails(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetails(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetails1(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetails1(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetails2(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetails2(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetails3(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetails3(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetails4(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetails4(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetails5(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetails5(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetails6" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetails6(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetails6(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetails1(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetails1(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetails2(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetails2(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetails3(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetails3(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetails4(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetails4(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetails5(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetails5(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetails(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetails(finance);
		}
		
		
		/*PREVIOUS*/
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetailsPrevious" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetailsPrevious(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetailsPrevious(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetailsPrevious1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetailsPrevious1(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetailsPrevious1(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetailsPrevious2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetailsPrevious2(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetailsPrevious2(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetailsPrevious3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetailsPrevious3(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetailsPrevious3(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetailsPrevious4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetailsPrevious4(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetailsPrevious4(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetailsPrevious5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetailsPrevious5(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetailsPrevious5(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLAssetDetailsPrevious6" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLAssetDetailsPrevious6(@RequestBody Finance finance) {
			return financeService.getMonthGLAssetDetailsPrevious6(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetailsPrevious1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetailsPrevious1(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetailsPrevious1(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetailsPrevious2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetailsPrevious2(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetailsPrevious2(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetailsPrevious3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetailsPrevious3(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetailsPrevious3(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetailsPrevious4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetailsPrevious4(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetailsPrevious4(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetailsPrevious5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetailsPrevious5(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetailsPrevious5(finance);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getMonthGLEquityDetailsPrevious" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getMonthGLEquityDetailsPrevious(@RequestBody Finance finance) {
			return financeService.getMonthGLEquityDetailsPrevious(finance);
		}
		
		
		
		
		
		
		
		
		
		
		
		

		@ResponseBody
		@RequestMapping(value = { "/getCashFlowReport" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getCashFlowReport(@RequestBody Finance finance) {
			return financeService.getCashFlowReport(finance);
		}
		
		/*@ResponseBody
		@RequestMapping(value = { "/getGLAssetDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAssetDetails(@RequestBody Integer id) {
			return financeService.getGLAssetDetails(id);
		}
		    
		@ResponseBody
		@RequestMapping(value = { "/getGLAssetDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAssetDetails1(@RequestBody Integer id) {
			return financeService.getGLAssetDetails1(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAssetDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAssetDetails2(@RequestBody Integer id) {
			return financeService.getGLAssetDetails2(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAssetDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAssetDetails3(@RequestBody Integer id) {
			return financeService.getGLAssetDetails3(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAssetDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAssetDetails4(@RequestBody Integer id) {
			return financeService.getGLAssetDetails4(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAssetDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAssetDetails5(@RequestBody Integer id) {
			return financeService.getGLAssetDetails5(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLAssetDetails6" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLAssetDetails6(@RequestBody Integer id) {
			return financeService.getGLAssetDetails6(id);
		}*/
		     
/*		@ResponseBody
		@RequestMapping(value = { "/getGLEquityDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquityDetails(@RequestBody Integer id) {
			return financeService.getGLEquityDetails(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLEquityDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquityDetails1(@RequestBody Integer id) {
			return financeService.getGLEquityDetails1(id);
		}
		
		@ResponseBody   
		@RequestMapping(value = { "/getGLEquityDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquityDetails2(@RequestBody Integer id) {
			return financeService.getGLEquityDetails2(id);
		}   
		
		@ResponseBody
		@RequestMapping(value = { "/getGLEquityDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquityDetails3(@RequestBody Integer id) {
			return financeService.getGLEquityDetails3(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLEquityDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquityDetails4(@RequestBody Integer id) {
			return financeService.getGLEquityDetails4(id);
		}
		
		@ResponseBody
		@RequestMapping(value = { "/getGLEquityDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
		public Response getGLEquityDetails5(@RequestBody Integer id) {
			return financeService.getGLEquityDetails5(id);
		}*/
		
		
		
		/*VENDOR ACCOUNT BALANCE*/
			 @ResponseBody
				@RequestMapping(value = "getFinancialYear", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getFinancialYear()
				{
					return financeService.getFinancialYear();
				}
			 
			 @ResponseBody
				@RequestMapping(value = { "/getVendorAccountBalance" }, method = { RequestMethod.POST})
				public Response getVendorAccountBalance(@RequestBody Integer financial_year) {
					return financeService.getVendorAccountBalance(financial_year);
				}
			 
			/* BANK RECONCILIATION REPORT*/
			 
			 @ResponseBody
				@RequestMapping(value = "getAllBankAccounts", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getAllBankAccounts() {
					return financeService.getAllBankAccounts();
				}
			 
			 @ResponseBody
				@RequestMapping(value = { "/getBankDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getBankDetails(@RequestBody Finance finance) {
					return financeService.getBankDetails(finance);
				}
				@ResponseBody
				@RequestMapping(value = "updateBankDetails", method = { RequestMethod.POST })
				public Response updateBankDetails(@RequestBody Finance finance) {

					return financeService.updateBankDetails(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = "getByBankDetails", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getByBankDetails(@RequestBody Integer id) {

					return financeService.getByBankDetails(id);
				}
				
				/*DISPLAY ACCOUNT BALANCE*/
				
				@ResponseBody
				@RequestMapping(value = "getAllDisplayGLAccount", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getAllDisplayGLAccount() {
					return financeService.getAllDisplayGLAccount();
				}
				@ResponseBody
				@RequestMapping(value = { "/getDisplayAccountBalance" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getDisplayAccountBalance(@RequestBody Finance finance) {
					return financeService.getDisplayAccountBalance(finance);
				}
			/*INVOICE VS PAYMENTS*/
				@ResponseBody
				@RequestMapping(value = "getAllOrders", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getAllOrders() {
					return financeService.getAllOrders();
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getInvoicevsPaymentsReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getInvoicevsPaymentsReport(@RequestBody Finance finance) {
					return financeService.getInvoicevsPaymentsReport(finance);
				}
				
				/*INCOME AND EXPENDITURE REPORT*/
				@ResponseBody
				@RequestMapping(value = { "/getIncomeExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getIncomeExpenditureReport(@RequestBody Finance finance) {
					return financeService.getIncomeExpenditureReport(finance);
				}
				
			
				
				/*MONTHLY INCOME AND EXPENDITURE REPORT*/
				
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthDepreciationDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthDepreciationDetails(@RequestBody Finance finance) {
					return financeService.getMonthDepreciationDetails(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountNames(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountTwoNames(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountTwoNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLExpAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLExpAccountNames(@RequestBody Finance finance) {
					return financeService.getMonthGLExpAccountNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLExpAccountOneNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLExpAccountOneNames(@RequestBody Finance finance) {
					return financeService.getMonthGLExpAccountOneNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLExpAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLExpAccountTwoNames(@RequestBody Finance finance) {
					return financeService.getMonthGLExpAccountTwoNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthDepreciationAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthDepreciationAccountNames(@RequestBody Finance finance) {
					return financeService.getMonthDepreciationAccountNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetails(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetails(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetails1(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetails1(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetails2(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetails2(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetails3(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetails3(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetails4(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetails4(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetails5(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetails5(finance);
				}
				

				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetailsPrevious" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetailsPrevious(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetailsPrevious(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetailsPrevious1" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetailsPrevious1(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetailsPrevious1(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetailsPrevious2" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetailsPrevious2(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetailsPrevious2(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetailsPrevious3" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetailsPrevious3(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetailsPrevious3(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetailsPrevious4" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetailsPrevious4(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetailsPrevious4(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getMonthGLAccountDetailsPrevious5" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getMonthGLAccountDetailsPrevious5(@RequestBody Finance finance) {
					return financeService.getMonthGLAccountDetailsPrevious5(finance);
				}
				
				/*PREVIOUS*/
				
				
				@ResponseBody
				@RequestMapping(value = { "/getExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getExpenditureReport(@RequestBody Finance finance) {
					return financeService.getExpenditureReport(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getDepreciationDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getDepreciationDetails(@RequestBody Finance finance) {
					return financeService.getDepreciationDetails(finance);
				}

				@ResponseBody
				@RequestMapping(value = { "/getGLAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getGLAccountNames(@RequestBody Finance finance) {
					return financeService.getGLAccountNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getGLAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getGLAccountTwoNames(@RequestBody Finance finance) {
					return financeService.getGLAccountTwoNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getGLExpAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getGLExpAccountNames(@RequestBody Finance finance) {
					return financeService.getGLExpAccountNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getGLExpAccountOneNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getGLExpAccountOneNames(@RequestBody Finance finance) {
					return financeService.getGLExpAccountOneNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getGLExpAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getGLExpAccountTwoNames(@RequestBody Finance finance) {
					return financeService.getGLExpAccountTwoNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getDepreciationAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getDepreciationAccountNames(@RequestBody Finance finance) {
					return financeService.getDepreciationAccountNames(finance);
				}
				
				/*TRAIL BALANCE*/
				@ResponseBody
				@RequestMapping(value = { "/getTrailIncomeExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailIncomeExpenditureReport(@RequestBody Finance finance) {
					return financeService.getTrailIncomeExpenditureReport(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAccountDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAccountDetails(@RequestBody Integer id) {
					return financeService.getTrailGLAccountDetails(id);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAccountDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAccountDetails1(@RequestBody Integer id) {
					return financeService.getTrailGLAccountDetails1(id);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAccountDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAccountDetails2(@RequestBody Integer id) {
					return financeService.getTrailGLAccountDetails2(id);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAccountDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAccountDetails3(@RequestBody Integer id) {
					return financeService.getTrailGLAccountDetails3(id);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAccountDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAccountDetails4(@RequestBody Integer id) {
					return financeService.getTrailGLAccountDetails4(id);
				}
				
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailExpenditureReport(@RequestBody Finance finance) {
					return financeService.getTrailExpenditureReport(finance);
				}
				
				

				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAccountNames(@RequestBody Finance finance) {
					return financeService.getTrailGLAccountNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAccountTwoNames(@RequestBody Finance finance) {
					return financeService.getTrailGLAccountTwoNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLExpAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLExpAccountNames(@RequestBody Finance finance) {
					return financeService.getTrailGLExpAccountNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLExpAccountOneNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLExpAccountOneNames(@RequestBody Finance finance) {
					return financeService.getTrailGLExpAccountOneNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLExpAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLExpAccountTwoNames(@RequestBody Finance finance) {
					return financeService.getTrailGLExpAccountTwoNames(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailEquityReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailEquityReport(@RequestBody Finance finance) {
					return financeService.getTrailEquityReport(finance);
				}
				
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailAssetReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailAssetReport(@RequestBody Finance finance) {
					return financeService.getTrailAssetReport(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAsset" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAsset(@RequestBody Finance finance) {
					return financeService.getTrailGLAsset(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAsset1" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAsset1(@RequestBody Finance finance) {
					return financeService.getTrailGLAsset1(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAsset2" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAsset2(@RequestBody Finance finance) {
					return financeService.getTrailGLAsset2(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAsset3" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAsset3(@RequestBody Finance finance) {
					return financeService.getTrailGLAsset3(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAsset4" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAsset4(@RequestBody Finance finance) {
					return financeService.getTrailGLAsset4(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAsset5" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAsset5(@RequestBody Finance finance) {
					return financeService.getTrailGLAsset5(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAsset6" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAsset6(@RequestBody Finance finance) {
					return financeService.getTrailGLAsset6(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquity" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquity(@RequestBody Finance finance) {
					return financeService.getTrailGLEquity(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquity1" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquity1(@RequestBody Finance finance) {
					return financeService.getTrailGLEquity1(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquity2" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquity2(@RequestBody Finance finance) {
					return financeService.getTrailGLEquity2(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquity3" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquity3(@RequestBody Finance finance) {
					return financeService.getTrailGLEquity3(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquity4" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquity4(@RequestBody Finance finance) {
					return financeService.getTrailGLEquity4(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquity5" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquity5(@RequestBody Finance finance) {
					return financeService.getTrailGLEquity5(finance);
				}
				
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAssetDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAssetDetails(@RequestBody Integer id) {
					return financeService.getTrailGLAssetDetails(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAssetDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAssetDetails1(@RequestBody Integer id) {
					return financeService.getTrailGLAssetDetails1(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAssetDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAssetDetails2(@RequestBody Integer id) {
					return financeService.getTrailGLAssetDetails2(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAssetDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAssetDetails3(@RequestBody Integer id) {
					return financeService.getTrailGLAssetDetails3(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAssetDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAssetDetails4(@RequestBody Integer id) {
					return financeService.getTrailGLAssetDetails4(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAssetDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAssetDetails5(@RequestBody Integer id) {
					return financeService.getTrailGLAssetDetails5(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLAssetDetails6" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLAssetDetails6(@RequestBody Integer id) {
					return financeService.getTrailGLAssetDetails6(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquityDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquityDetails1(@RequestBody Integer id) {
					return financeService.getTrailGLEquityDetails1(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquityDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquityDetails2(@RequestBody Integer id) {
					return financeService.getTrailGLEquityDetails2(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquityDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquityDetails3(@RequestBody Integer id) {
					return financeService.getTrailGLEquityDetails3(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquityDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquityDetails4(@RequestBody Integer id) {
					return financeService.getTrailGLEquityDetails4(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquityDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquityDetails5(@RequestBody Integer id) {
					return financeService.getTrailGLEquityDetails5(id);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getTrailGLEquityDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTrailGLEquityDetails(@RequestBody Integer id) {
					return financeService.getTrailGLEquityDetails(id);
				}
			
				
				/*COSTCENTER WISE REPORT*/
				@ResponseBody
				@RequestMapping(value = "/getJournalVoucherDetails", method = { RequestMethod.POST })
				public Response getJournalVoucherDetails(@RequestBody Finance finance)

				{
					return financeService.getJournalVoucherDetails(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = { "/getCostCenterReport" }, method = {        RequestMethod.POST, RequestMethod.GET })
				public Response getCostCenterReport(@RequestBody Finance finance) {
					return financeService.getCostCenterReport(finance);
				}
				
				 /*TDS AND GST*/
				
				@ResponseBody
				@RequestMapping(value = { "/getIGSTReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getIGSTReport(@RequestBody Finance finance) {
					return financeService.getIGSTReport(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/getCGSTReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response getCGSTReport(@RequestBody Finance finance) {
					return financeService.getCGSTReport(finance);
				}
				@ResponseBody
				@RequestMapping(value = { "/get194JReport" }, method = { RequestMethod.POST, RequestMethod.GET })
				public Response get194JReport(@RequestBody Finance finance) {
					return financeService.get194JReport(finance);
				}
				
				@ResponseBody
				@RequestMapping(value = "getTDSGLAccounts", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getTDSGLAccounts() {
					return financeService.getTDSGLAccounts();
				}
				


	 
	 
	 
	 
	 /*siri SbhzfhvzvZfgnfhjfghsdvfJZgfugfjhbfjghjZf jHfgJHf JhfgJHf mbfUHfMafbjAgfjhabfjhAgfjAWBfhjWfgibfjsbfafjefbafjabfegfhjfbjsygJHD zdjhSYJfbhjfgfbdjfgiddbKfbZgjsvbJgjfbfYSfgJfbUYfgfJZJfb   */
	


				
				
				
				

				  /* Account_Payable */
				

				  @ResponseBody
			  	  @RequestMapping(value={"getByPendingDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
			  	  public Response getByPendingDetails(@RequestBody String voucher_id)
			  	  {
			  		
			  	    return this.financeService.getByPendingDetails(voucher_id);  
			  	  } 

				 

				
				  
				  /* getting payment release page details */
				  @ResponseBody
				  @RequestMapping(value={"getpaymentdetails"}, method={ RequestMethod.POST, RequestMethod.GET })
				  public Response getpaymentdetails(@RequestBody String voucher_number)
				  {
					
				    return this.financeService.getpaymentdetails(voucher_number);  
				  } 
				  
				 
				  
				
				 
				  
				
				
			
					
							
				/* getting accounts receivable list view page table data */
			
				  
				
			/*VENDOR ACCOUNT BALANCE*/
				
				
					/*DISPLAY ACCOUNT BALANCE*/
					
					
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetails(@RequestBody Finance finance) {
						return financeService.getGLAccountDetails(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetails1(@RequestBody Finance finance) {
						return financeService.getGLAccountDetails1(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetails2(@RequestBody Finance finance) {
						return financeService.getGLAccountDetails2(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetails3(@RequestBody Finance finance) {
						return financeService.getGLAccountDetails3(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetails4(@RequestBody Finance finance) {
						return financeService.getGLAccountDetails4(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetails5(@RequestBody Finance finance) {
						return financeService.getGLAccountDetails5(finance);
					}
					
					
					/*MONTHLY INCOME AND EXPENDITURE REPORT*/
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthIncomeExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthIncomeExpenditureReport(@RequestBody Finance finance) {
						return financeService.getMonthIncomeExpenditureReport(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthExpenditureReport(@RequestBody Finance finance) {
						return financeService.getMonthExpenditureReport(finance);
					}
					
					
					/*PREVIOUS*/
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetailsPrevious" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetailsPrevious(@RequestBody Finance finance) {
						return financeService.getGLAccountDetailsPrevious(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetailsPrevious1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetailsPrevious1(@RequestBody Finance finance) {
						return financeService.getGLAccountDetailsPrevious1(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetailsPrevious2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetailsPrevious2(@RequestBody Finance finance) {
						return financeService.getGLAccountDetailsPrevious2(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetailsPrevious3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetailsPrevious3(@RequestBody Finance finance) {
						return financeService.getGLAccountDetailsPrevious3(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetailsPrevious4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetailsPrevious4(@RequestBody Finance finance) {
						return financeService.getGLAccountDetailsPrevious4(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getGLAccountDetailsPrevious5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAccountDetailsPrevious5(@RequestBody Finance finance) {
						return financeService.getGLAccountDetailsPrevious5(finance);
					}
					
					

					
			
					
					/*COSTCENTER WISE REPORT*/
					@ResponseBody
					@RequestMapping(value = "getCostCenter", method = { RequestMethod.POST, RequestMethod.GET })
					public Response getCostCenter() {
						return financeService.getCostCenter();
					}
					
				
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetails(@RequestBody Finance finance) {
						return financeService.getGLAssetDetails(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetails1(@RequestBody Finance finance) {
						return financeService.getGLAssetDetails1(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetails2(@RequestBody Finance finance) {
						return financeService.getGLAssetDetails2(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetails3(@RequestBody Finance finance) {
						return financeService.getGLAssetDetails3(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetails4(@RequestBody Finance finance) {
						return financeService.getGLAssetDetails4(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetails5(@RequestBody Finance finance) {
						return financeService.getGLAssetDetails5(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetails6" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetails6(@RequestBody Finance finance) {
						return financeService.getGLAssetDetails6(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetails1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetails1(@RequestBody Finance finance) {
						return financeService.getGLEquityDetails1(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetails2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetails2(@RequestBody Finance finance) {
						return financeService.getGLEquityDetails2(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetails3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetails3(@RequestBody Finance finance) {
						return financeService.getGLEquityDetails3(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetails4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetails4(@RequestBody Finance finance) {
						return financeService.getGLEquityDetails4(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetails5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetails5(@RequestBody Finance finance) {
						return financeService.getGLEquityDetails5(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetails(@RequestBody Finance finance) {
						return financeService.getGLEquityDetails(finance);
					}
					
					
					/*PREVIOUS*/
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetailsPrevious" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetailsPrevious(@RequestBody Finance finance) {
						return financeService.getGLAssetDetailsPrevious(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetailsPrevious1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetailsPrevious1(@RequestBody Finance finance) {
						return financeService.getGLAssetDetailsPrevious1(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetailsPrevious2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetailsPrevious2(@RequestBody Finance finance) {
						return financeService.getGLAssetDetailsPrevious2(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetailsPrevious3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetailsPrevious3(@RequestBody Finance finance) {
						return financeService.getGLAssetDetailsPrevious3(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetailsPrevious4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetailsPrevious4(@RequestBody Finance finance) {
						return financeService.getGLAssetDetailsPrevious4(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetailsPrevious5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetailsPrevious5(@RequestBody Finance finance) {
						return financeService.getGLAssetDetailsPrevious5(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLAssetDetailsPrevious6" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLAssetDetailsPrevious6(@RequestBody Finance finance) {
						return financeService.getGLAssetDetailsPrevious6(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetailsPrevious1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetailsPrevious1(@RequestBody Finance finance) {
						return financeService.getGLEquityDetailsPrevious1(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetailsPrevious2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetailsPrevious2(@RequestBody Finance finance) {
						return financeService.getGLEquityDetailsPrevious2(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetailsPrevious3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetailsPrevious3(@RequestBody Finance finance) {
						return financeService.getGLEquityDetailsPrevious3(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetailsPrevious4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetailsPrevious4(@RequestBody Finance finance) {
						return financeService.getGLEquityDetailsPrevious4(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetailsPrevious5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetailsPrevious5(@RequestBody Finance finance) {
						return financeService.getGLEquityDetailsPrevious5(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getGLEquityDetailsPrevious" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getGLEquityDetailsPrevious(@RequestBody Finance finance) {
						return financeService.getGLEquityDetailsPrevious(finance);
					}
					
					/*CASH FLOW STATEMENT*/
					     
					
					
					   /*  WORKORDER*/
					
					

					/*MONTHLY TRAIL BALANCE*/
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailIncomeExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailIncomeExpenditureReport(@RequestBody Finance finance) {
						return financeService.getMonthTrailIncomeExpenditureReport(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailExpenditureReport" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailExpenditureReport(@RequestBody Finance finance) {
						return financeService.getMonthTrailExpenditureReport(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAccountNames(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAccountNames(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAccountTwoNames(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAccountTwoNames(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLExpAccountNames" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLExpAccountNames(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLExpAccountNames(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLExpAccountOneNames" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLExpAccountOneNames(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLExpAccountOneNames(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLExpAccountTwoNames" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLExpAccountTwoNames(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLExpAccountTwoNames(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailEquityReport" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailEquityReport(@RequestBody Finance finance) {
						return financeService.getMonthTrailEquityReport(finance);
					}
					
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailAssetReport" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailAssetReport(@RequestBody Finance finance) {
						return financeService.getMonthTrailAssetReport(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAsset" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAsset(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAsset(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAsset1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAsset1(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAsset1(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAsset2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAsset2(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAsset2(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAsset3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAsset3(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAsset3(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAsset4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAsset4(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAsset4(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAsset5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAsset5(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAsset5(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLAsset6" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLAsset6(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLAsset6(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLEquity" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLEquity(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLEquity(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLEquity1" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLEquity1(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLEquity1(finance);
					}
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLEquity2" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLEquity2(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLEquity2(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLEquity3" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLEquity3(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLEquity3(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLEquity4" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLEquity4(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLEquity4(finance);
					}
					@ResponseBody
					@RequestMapping(value = { "/getMonthTrailGLEquity5" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthTrailGLEquity5(@RequestBody Finance finance) {
						return financeService.getMonthTrailGLEquity5(finance);
					}   
					
					
					  /* MONTHLY CASH FLOW STATEMENT*/
					
					@ResponseBody
					@RequestMapping(value = { "/getMonthCashFlowReport" }, method = { RequestMethod.POST, RequestMethod.GET })
					public Response getMonthCashFlowReport(@RequestBody Finance finance) {
						return financeService.getMonthCashFlowReport(finance);
					}
					
					
					

					
				
	  
	

}
