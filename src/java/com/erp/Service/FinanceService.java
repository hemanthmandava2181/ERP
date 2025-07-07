package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.FinanceDAO;
import com.erp.Model.Ctc;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.Finance;

@Service
public class FinanceService {
	
	Response response = new Response();
	
	@Autowired
	private FinanceDAO financeDao;
	
	/* Inserting Liabilities */
	public Response addliability(Finance finance) {		
		response.setSuccessful(false);
		financeDao.addliability(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting liabilities heads */
	public Response getliabilitiesheads()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getliabilitiesheads();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting all liabilities in table */
	public Response getallliabilities() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallliabilities();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting all email settings in table */
	public Response getallemailSettingsdata() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallemailSettingsdata();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* Inserting Liabilities */
	public Response addexpenseaccount(Finance finance) {		
		response.setSuccessful(false);
		financeDao.addexpenseaccount(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all expense accounts in table */
	public Response getalllexpenseaccounts() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalllexpenseaccounts();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data based on expense account name */
	public Response getexpenseaccountdetails(String expense_account_name)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getexpenseaccountdetails(expense_account_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating data based on expense account name */
	public Response updateexpenseaccount(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateexpenseaccount(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* updating data based on gl accounts */
	public Response updateJE(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateJE(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* Inserting cost center */
	public Response createcostcenter(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createcostcenter(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all cost centers data in table */
	public Response getalllcostcenters() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalllcostcenters();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting cost center data based on cost center name */
	public Response getcostcenterdata(String name)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getcostcenterdata(name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating cost center data based on cost center name */
	public Response updatecostcenter(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updatecostcenter(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* creating tax group */
	public Response createtaxgroup(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createtaxgroup(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all tax groups in table */
	public Response getallltaxgroups() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallltaxgroups();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting tax group data based on tax group name */
	public Response gettaxgroupdata(String tax_group_name)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.gettaxgroupdata(tax_group_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating tax group based on tax group name */
	public Response updatetaxgroup(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updatetaxgroup(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* create nature of service */
	public Response createnatureofservice(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createnatureofservice(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all nature of services on table */
	public Response getalllnatureofservices() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalllnatureofservices();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting all reimbursement data on table */
	public Response getallReimbursementdata() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallReimbursementdata();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data based on service name */
	public Response getnatureofservice(String service_name)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getnatureofservice(service_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* getting email settings data based on id */
	public Response getemailsetingsdata(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getemailsetingsdata(id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* getting reimbursement data based on id */
	public Response getReimbursementdata(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getReimbursementdata(id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating email settings data based on id */
	public Response updateEmailsettings(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateEmailsettings(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* updating reimbursement data based on id */
	public Response updateReimbursements(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateReimbursements(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* updating data based on service name */
	public Response updatenatureofservice(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updatenatureofservice(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting tax group dropdown */
	public Response getTaxgroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getTaxgroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting service type dropdown */
	public Response getservicetype()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getservicetype();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting gl account names dropdown */
	public Response getTaxaccountnames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getTaxaccountnames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating tax account */
	public Response createtaxaccount(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createtaxaccount(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all tax account data to tax account table */
	public Response getallltaxaccounts() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallltaxaccounts();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting tax account data based on tax account name */
	public Response gettaxaccountdata(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.gettaxaccountdata(id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating tax account data */
	public Response updatetaxaccount(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updatetaxaccount(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting tax section names in drop down */
	public Response getTaxsectionnames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getTaxsectionnames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting bank account names in drop down */
	public Response getBankaccountnames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getBankaccountnames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* create tax mapping */
	public Response createtaxmapping(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createtaxmapping(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all tax mapping data in table */
	public Response getallltaxmappings() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallltaxmappings();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data in pop up based on id */
	public Response gettaxmappingdata(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.gettaxmappingdata(id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* update tax mapping based on id */
	public Response updatetaxmapping(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updatetaxmapping(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* deleting tax mapping data based on id  */
	public Response remove(Integer id)
	{
		response.setSuccessful(false);
		financeDao.remove(id);
		response.setSuccessful(true);
		response.setResponseObject(id);
		return response;
	}
	
	/* creating local conveyance rate */
	public Response createlocalconveyancerate(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createlocalconveyancerate(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting local conveyance data to table */
	public Response getallllocalconveyancesdata() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallllocalconveyancesdata();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting local conveyance data based on id */
	public Response getlocalconveyancedata(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getlocalconveyancedata(id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating local conveyance data */
	public Response updatelocalconveyancedata(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updatelocalconveyancedata(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* creating vehicle type */
	public Response createvehicletype(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createvehicletype(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all details of vehicle type to table */
	public Response getalllvehicletypessdata() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalllvehicletypessdata();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting Vehicle type data based on id */
	public Response getvehicletypedatadata(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getvehicletypedatadata(id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating vehicle type data */
	public Response updatevehicletypedata(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updatevehicletypedata(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* creating email settings */
	public Response createemailsettings(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createemailsettings(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* Creating vehicle registration */
	public Response createvehicleRegistration(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createvehicleRegistration(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting travel drop down */
	public Response gettravel()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.gettravel();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating reimbursement policy */
	public Response createreimbursementpolicy(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createreimbursementpolicy(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* creating claim advance new */
	public Response submitclaimadvance(Finance finance) {		
		response.setSuccessful(false);
		financeDao.submitclaimadvance(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting financial year drop down */
	public Response getfinancialyears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getfinancialyears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	/* getting sectors drop down */
	public Response getsectors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getsectors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting projects drop down */
	public Response getprojects()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getprojects();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating claim advance existing */
	public Response submitexistingclaimadvance(Finance finance) {		
		response.setSuccessful(false);
		financeDao.submitexistingclaimadvance(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting claim advance ids drop down */
	public Response getclaimadvanceids()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getclaimadvanceids();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* inserting bill submission details */
	public Response suubmitbillsubmission(Finance finance) {		
		response.setSuccessful(false);
		financeDao.suubmitbillsubmission(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting nature of services drop down */
	public Response getNatureofservices()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getNatureofservices();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting states drop down */
	public Response getStates()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getStates();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating customer */
	public Response customercreation(Finance finance) {		
		response.setSuccessful(false);
		financeDao.customercreation(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all customer details in table */
	public Response getalllCustomerDetails() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalllCustomerDetails();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting customer data to pop up based on customer id */
	public Response getCustomerdata(String customer_id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getCustomerdata(customer_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* updating customer data */
	public Response UpdateCustomerdata(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.UpdateCustomerdata(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* in activating customer */
	public Response inactivecustomer(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.inactivecustomer(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting customers in drop down */
	public Response getCustomers()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getCustomers();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting programs drop down */
	public Response getPrograms()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getPrograms();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting services drop down */
	public Response getServices()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getServices();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting schemes drop down */
	public Response getSchemes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getSchemes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating accounts receivable */
	public Response createaccountreceivable(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createaccountreceivable(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all accounts receivables to table */
	public Response getalllaccountsreceivables() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalllaccountsreceivables();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* deleting accounts receivable data from headers table based on voucher id */
	public Response removeheader(String voucher_id)
	{
		response.setSuccessful(false);
		financeDao.removeheader(voucher_id);
		response.setSuccessful(true);
		response.setResponseObject(voucher_id);
		return response;
	}
	
	/* deleting accounts receivable data from details table based on voucher id */
	public Response removedetails(String voucher_id)
	{
		response.setSuccessful(false);
		financeDao.removedetails(voucher_id);
		response.setSuccessful(true);
		response.setResponseObject(voucher_id);
		return response;
	}
	
	/* upload documents */
	public Response uploaddocuments(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.uploaddocuments(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting voucher id */
	public Response getvoucherIDdata(String voucher_id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getvoucherIDdata(voucher_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* getting vendors in drop down */
	public Response getvendors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getvendors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating journal voucher details */
	public Response CreateJE(Finance finance) {		
		response.setSuccessful(false);
		financeDao.CreateJE(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/*
	 * public Response CreateJE(List<Finance> fins) { response.setSuccessful(false);
	 * for(Finance finance : fins) financeDao.CreateJE(finance);
	 * response.setSuccessful(true); return response; }
	 */
	
	/* getting all journal accounts to table */
	public Response getalljournalaccounts() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalljournalaccounts();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* deleting journal voucher data from headers table */
	public Response removejeheader(String voucher_number)
	{  
		response.setSuccessful(false);
		financeDao.removeheader(voucher_number);
		response.setSuccessful(true);
		response.setResponseObject(voucher_number);
		return response;
	}
	
	/* deleting journal voucher data from details table */
	public Response removejedetails(String voucher_number)
	{
		response.setSuccessful(false);
		financeDao.removedetails(voucher_number);
		response.setSuccessful(true);
		response.setResponseObject(voucher_number);
		return response;
	}
	
	/* getting districts in drop down */
	public Response getdistricts()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getdistricts();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating work order */
	public Response createworkorder(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createworkorder(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting work orders drop down */
	public Response getworkorders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getworkorders();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting work order details in book invoice page */
	public Response getDetailsofWO(Finance finance)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = financeDao.getDetailsofWO(finance);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
	
	/* book invoice for others type */
	public Response bookothersinvoice(Finance finance) {		
		response.setSuccessful(false);
		financeDao.bookothersinvoice(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting SDEI groups dropdown */
	public Response getSDEIgroupnames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getSDEIgroupnames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting Segment Names to dropdown */
	public Response getSegments()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getSegments();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* creating Budget Inputs rate */
	public Response createBudgetinput(Finance finance) {		
		response.setSuccessful(false);
		financeDao.createBudgetinput(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all budget inputs to table */
	public Response getallBudgetInputs() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallBudgetInputs();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting all pending claims */
	public Response getallPendingData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallPendingData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data in pending view page */
	public Response getpendingclaimDetails(String claim_reimbursement_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getpendingclaimDetails(claim_reimbursement_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting data in view page table */	
	public Response getViewpagetabledata(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getViewpagetabledata(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	}
	
	
	/* Approving claim in pending view page */
	public Response approveclaim(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.approveclaim(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all approved claims */
	public Response getallApprovedData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallApprovedData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data in approved view page */
	public Response getAcceptedclaimDetails(String claim_reimbursement_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getAcceptedclaimDetails(claim_reimbursement_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting all advance list data to table */
	public Response getalladvanceListData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalladvanceListData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting advance history list to view table */
	public Response getallviewHistoryListData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallviewHistoryListData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data in advanced list view page */
	public Response getadvanceviewpgedata(String claim_advance_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getadvanceviewpgedata(claim_advance_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting all advance pending data to table */
	public Response getalladvancePendingData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalladvancePendingData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting advanced pending view page data */
	public Response getadvancependingvewdata(String claim_advance_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getadvancependingvewdata(claim_advance_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* updating advance claim data */
	public Response updateadvanceclaimdata(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateadvanceclaimdata(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting advance claim pop data */
	public Response getpopupdata(String claim_advance_id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getpopupdata(claim_advance_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* Approving advance claim */
	public Response Approveadvanceclaim(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.Approveadvanceclaim(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all approved list data */
	public Response getalladvanceApprovedData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getalladvanceApprovedData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting approved view page details in advance list */
	public Response getapprovedclaimDetails(String claim_advance_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getapprovedclaimDetails(claim_advance_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting all bill submission lists to table */
	public Response getallbillsubmissionlists() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallbillsubmissionlists();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data in bill submission view page */
	public Response getbillsubmissionviewpgedata(String claim_reimbursement_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getbillsubmissionviewpgedata(claim_reimbursement_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting data in bill submission update page */
	public Response getbillsubmissionupdatedata(String claim_reimbursement_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getbillsubmissionupdatedata(claim_reimbursement_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting data for advance claim in claim status report page */
	public Response getAdvanceClaimdata(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getAdvanceClaimdata(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* getting data for reimbursement claim in claim status report page */
	public Response getreimbursementClaimdata(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getreimbursementClaimdata(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* getting advance claims drop down */
	public Response getAdvanceclaims()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getAdvanceclaims();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting reimbursement claims drop down */
	public Response getReimbursementclaims()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getReimbursementclaims();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting je list data in submitted je tab for period type */
	public Response getperiodJEList(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getperiodJEList(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* getting je list data in submitted je tab for financial type */
	public Response getfinancialJEList(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getfinancialJEList(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* getting data to pop up in submitted je list page */
	public Response getsubmittedjelistdata(String voucher_number)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getsubmittedjelistdata(voucher_number);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* getting pop up table data for submitted je list view for period type */
	public Response getpopuptabledatasubperiod(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getpopuptabledatasubperiod(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* getting data in update page in submitted je list tab for period type */
	public Response getupdatesubperioddata(String voucher_number)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getupdatesubperioddata(voucher_number);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* getting data in pop up in budget input page */
	public Response viewbudgetpopupdata(String budget_id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.viewbudgetpopupdata(budget_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* getting data in budget over view table based on financial year */	
	public Response getbudgetdataoverview(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getbudgetdataoverview(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* getting all pending budget inputs to pending list table in budget approval page */
	public Response getallPendingbudgetData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallPendingbudgetData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting approved or rejected budget inputs list to table in budget approval page */
	public Response getallapprovedbudgetData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallapprovedbudgetData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data in budget approval view page */
	public Response budgetviewpagedata(String budget_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.budgetviewpagedata(budget_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	public Response getfinanceyear(Integer financialyear)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getfinanceyear(financialyear);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* approving budget input in budget approval view page */
	public Response approvebudgetinput(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.approvebudgetinput(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting pending accounts receivables to table in pending list tab for account receivable list page */
	public Response getallPendingreceivablesData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallPendingreceivablesData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data to view page in accounts receivable list page */
	public Response getreceivableviewdata(String voucher_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getreceivableviewdata(voucher_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* approving accounts receivables */
	public Response approveaccountsreceivable(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.approveaccountsreceivable(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting approved or rejected data to table in approved or rejected tab for accounts receivable list page */
	public Response getallPendingapprovedrejectedreceivablesData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallPendingapprovedrejectedreceivablesData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting all booked accounts receivables to table in booked invoices */
	public Response getallbookedreceivablesData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallbookedreceivablesData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting partially paid invoices in accounts receivable booked invoices */
	public Response getpartiallypaideceivablesData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getpartiallypaideceivablesData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting employee names to drop down in generate form-16 page */
	public Response getEmployeenames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getEmployeenames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting data in pending invoices tab in booked invoice page in finance login */
	public Response getallPendinginvoicesData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallPendinginvoicesData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	
	
	

	 /* Accounts_payable */

	public Response getAllPendings() {
	response.setSuccessful(false);
	List<Map<String, Object>> list = financeDao.getAllPendings();
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}

	  
public Response getByPendingDetails(Finance finance) {
	this.response.setSuccessful(false);
	Finance singleuserdetails = this.financeDao.getByPendingDetails(finance);
	this.response.setSuccessful(true);
	this.response.setResponseObject(singleuserdetails);
	return this.response;
	}
	   
	        
	
	public Response getByPendingDetailsdata(String voucher_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getByPendingDetailsdata(voucher_id);   
	    this.response.setSuccessful(true);  
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	

	public Response getTaxDetails(String voucher_id) {
	response.setSuccessful(false);
	List<Map<String, Object>> list = financeDao.getTaxDetails(voucher_id);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}

	public Response getPaymentDetails(String voucher_id) {
	this.response.setSuccessful(false);
	Finance singleuserdetails = this.financeDao.getPaymentDetails(voucher_id);
	this.response.setSuccessful(true);
	this.response.setResponseObject(singleuserdetails);
	return this.response;
	}

	public Response getItemDetails(String voucher_id) {
	response.setSuccessful(false);
	List<Map<String, Object>> list = financeDao.getItemDetails(voucher_id);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;    
	}
	
	public Response getJournalEntryDetails(String voucher_number) {
		response.setSuccessful(false);
		Map<String, Object> list = financeDao.getJournalEntryDetails(voucher_number);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getDocumentDetails(String voucher_id) {
	response.setSuccessful(false);
	List<Map<String, Object>> list = financeDao.getDocumentDetails(voucher_id);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}

	public Response getCommentDetails(String voucher_id) {
	response.setSuccessful(false);
	List<Map<String, Object>> list = financeDao.getCommentDetails(voucher_id);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}

	public Response getTimelineDetails(String voucher_id) {
	response.setSuccessful(false);
	List<Map<String, Object>> list = financeDao.getTimelineDetails(voucher_id);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}

	public Response getPreviousInvoiceDetails(Integer workorder) {
	response.setSuccessful(false);
	List<Map<String, Object>> list = financeDao.getPreviousInvoiceDetails(workorder);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}

	public Response getJVDetails(String voucher_id) {
	response.setSuccessful(false);
	Map<String, Object> list = financeDao.getJVDetails(voucher_id);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}

	public Response saveComments(Finance finance) {
	response.setSuccessful(false);
	financeDao.saveComments(finance);
	response.setSuccessful(true);
	response.setResponseObject(finance);
	return response;
	}
	
	/* booking invoice in accounts payable in view page */
	public Response bookaccountspayableinvoice(Finance finance) {		
		response.setSuccessful(false);
		financeDao.bookaccountspayableinvoice(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	public Response getjouranlentrydata()
	{  
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getjouranlentrydata();
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/* getting payment release page details */
	public Response getpaymentdetails(Finance finance)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getpaymentdetails(finance);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting partial payment release page details */
	/*
	 * public Response getPartialpaydet(Finance finance) {
	 * this.response.setSuccessful(false); Finance singleuserdetails =
	 * this.financeDao.getPartialpaydet(finance); this.response.setSuccessful(true);
	 * this.response.setResponseObject(singleuserdetails); return this.response; }
	 */
	
	public Response getPartialpaydet(String voucher_number)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getPartialpaydet(voucher_number);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* releasing payment to vendor */
	public Response Releasepaymenttovendor(Finance finance) {		
		response.setSuccessful(false);
		financeDao.Releasepaymenttovendor(finance);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting all bank payments details to table in bank payments page */
	public Response getallbankpaymentsdata() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallbankpaymentsdata();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting data in bank payments view page */
	public Response getBankpaymentsdata(String voucher_number)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getBankpaymentsdata(voucher_number);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting payment bank details to view page table in bank payments */
	public Response getpaymentaccountdetails(String voucher_number) {
		response.setSuccessful(false);
		Map<String, Object> list = financeDao.getpaymentaccountdetails(voucher_number);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
		}
	
	/* getting all booked invoices to table in booked invoices page */
	public Response getallbookedinvoicesData() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallbookedinvoicesData();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* getting Booked Invoice view page data */
	public Response getJouranlentrydata(String voucher_id)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getJouranlentrydata(voucher_id);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* getting all partially paid invoices to table in booked invoices page */
	public Response getallpartiallypaidinvoices() {
		response.setSuccessful(false);
		List<Finance> userdetails = financeDao.getallpartiallypaidinvoices();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/*public Response getpaymenttabledetails(String name)
	  {
	    this.response.setSuccessful(false);
	    Finance singleuserdetails = this.financeDao.getpaymenttabledetails(name);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }*/
	
	/* creating tax section */
	public Response getAllCreateSections()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getAllCreateSections();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getBySection(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getBySection(id);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	public Response updateSectionData(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateSectionData(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/*Section Details*/
	
	public Response saveSectionDetails(Finance finance) {
		response.setSuccessful(false);
		financeDao.saveSectionDetails(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
/*Tax Details*/
	
	public Response saveTaxDetails(Finance finance) {
		response.setSuccessful(false);
		financeDao.saveTaxDetails(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	public Response getAllSections()
	{
		response.setSuccessful(false);
		System.out.println("Service");
		List<Map<String, Object>> list = financeDao.getAllSections();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getByTax(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getByTax(id);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}   
	
	public Response updateTaxData(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateTaxData(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* finance Admin gl accounts */
	
	public Response getAccountType()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getAccountType();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getGLHeads()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getGLHeads();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getIncomeHeads()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getIncomeHeads();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getLiability()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getLiability();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAssetClass()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getAssetClass();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAssetNature(Integer asset_id)   
	  {
	    this.response.setSuccessful(false);
	    Map<String, Object> map = this.financeDao.getAssetNature(asset_id);
	    this.response.setResponseObject(map);
	    this.response.setSuccessful(true);
	    return this.response;
	  }
	
	public Response saveGLgroupDetails(Finance finance) {
		response.setSuccessful(false);
		financeDao.saveGLgroupDetails(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	public Response getAllGLgroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getAllGLgroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getByGLGroup(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getByGLGroup(id);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}   
	
	public Response updateData(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateData(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	/*subgroup Details*/
	public Response getGLGroup()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getGLGroup();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	public Response saveGLSubgroupDetails(Finance finance) {
		response.setSuccessful(false);
		financeDao.saveGLSubgroupDetails(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	public Response getAllGLSubgroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getAllGLSubgroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getByGLSubGroup(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getByGLSubGroup(id);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}   
	
	public Response updateGLSubData(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateGLSubData(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/*Account Details*/
	public Response getGLSubGroup()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getGLSubGroup();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	public Response saveGLAccountDetails(Finance finance) {
		response.setSuccessful(false);
		financeDao.saveGLAccountDetails(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	public Response getAllGLAccount()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = financeDao.getAllGLAccount();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getByGLAccount(Integer id)
	{
		response.setSuccessful(false);
		Finance singleuserdetails = financeDao.getByGLAccount(id);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}   
	
	public Response updateGLAccountData(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateGLAccountData(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* getting accounts receivable list view page table data */
	public Response getARDetailstabledatainview(String voucher_id) {
		response.setSuccessful(false);
		Map<String, Object> list = financeDao.getARDetailstabledatainview(voucher_id);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
		}
	
	/* updating JE */
	public Response updateJV(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateJV(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	/* updating Bills */
	public Response updateBills(Finance finance)
	{
		response.setSuccessful(false);
		financeDao.updateBills(finance);
		response.setSuccessful(true);
		response.setResponseObject(finance);
		return response;
	}
	
	
	
	   
	 
	
	 
	/* public Response getJournalEntryDetails(String voucher_number) {
			response.setSuccessful(false);
			Map<String, Object> list = financeDao.getJournalEntryDetails(voucher_number);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}*/
	 
	
	 
	  
	 
	 
	 public Response getProjectWiseSpentReport(Finance finance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = financeDao.getProjectWiseSpentReport(finance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }  
	 
	 public Response getAllProjects() {
			response.setSuccessful(false);
			List<Map<String, Object>> list = financeDao.getAllProjects();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}

		
		 public Response getVendorDetails() {
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getVendorDetails();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getInvoiceDetails(Integer id) {
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getInvoiceDetails(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getWorkorderDetails(Integer id) {
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getWorkorderDetails(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getPurchaseorderDetails(Integer id) {
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getPurchaseorderDetails(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getMouDetails(Integer id) {
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getMouDetails(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getInvoiceStatusReport(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getInvoiceStatusReport(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}

		 public Response getInvoiceTotalData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getInvoiceTotalData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getTotalBookedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalBookedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		
		 
		 public Response getTotalPaymentData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalPaymentData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getTotalReportingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalReportingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getTotalPendingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalPendingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getTotalReleasedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalReleasedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getTotalHoldData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalHoldData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getTotalReturnedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalReturnedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 
		
		 
		/* WORKORDER*/
		 
		 public Response getWorkorderStatusReport(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getWorkorderStatusReport(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getWorkorderTotalData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getWorkorderTotalData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalWorkorderReportingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalWorkorderReportingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalworkorderPendingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalworkorderPendingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalWorkorderCEOData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalWorkorderCEOData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalApprovedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalApprovedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalWorkorderHoldData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalWorkorderHoldData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalWorkorderReturnedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalWorkorderReturnedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 
/* PURCHASEORDER*/
		 
		 public Response getPurchaseorderStatusReport(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getPurchaseorderStatusReport(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getPurchaseorderTotalData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getPurchaseorderTotalData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalPurchaseorderReportingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalPurchaseorderReportingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalpurchaseorderPendingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalpurchaseorderPendingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalPurchaseorderCEOData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalPurchaseorderCEOData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalPurchaseApprovedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalPurchaseApprovedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalPurchaseorderHoldData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalPurchaseorderHoldData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalPurchaseorderReturnedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalPurchaseorderReturnedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 
		 
/* MOU*/
		 
		 public Response getMOUStatusReport(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getMOUStatusReport(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getMOUTotalData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getMOUTotalData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalMOUReportingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalMOUReportingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalMOUPendingData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalMOUPendingData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalMOUCEOData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalMOUCEOData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalMOUApprovedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalMOUApprovedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalMOUHoldData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalMOUHoldData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getTotalMOUReturnedData(Finance finance) {
				response.setSuccessful(false);
			   Map<String, Object> list = financeDao.getTotalMOUReturnedData(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		  
		 
		 public Response getAssetReport(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getAssetReport(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getEquityReport(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getEquityReport(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 
		 public Response getGLAsset(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAsset(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAsset1(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAsset1(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAsset2(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAsset2(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAsset3(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAsset3(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAsset4(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAsset4(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAsset5(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAsset5(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getGLAsset6(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAsset6(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLEquity(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquity(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getGLEquity1(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquity1(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getGLEquity2(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquity2(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getGLEquity3(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquity3(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getGLEquity4(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquity4(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 public Response getGLEquity5(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquity5(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getCashFlowReport(Finance finance) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getCashFlowReport(finance);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAssetDetails(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAssetDetails(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAssetDetails1(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAssetDetails1(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAssetDetails2(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAssetDetails2(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAssetDetails3(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAssetDetails3(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAssetDetails4(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAssetDetails4(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAssetDetails5(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAssetDetails5(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLAssetDetails6(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLAssetDetails6(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLEquityDetails(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquityDetails(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLEquityDetails1(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquityDetails1(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLEquityDetails2(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquityDetails2(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLEquityDetails3(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquityDetails3(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getGLEquityDetails4(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquityDetails4(id);
				response.setSuccessful(true);
				response.setResponseObject(list);   
				return response;
			}
		 
		 public Response getGLEquityDetails5(Integer id) {
				response.setSuccessful(false);
				Map<String, Object> list = financeDao.getGLEquityDetails5(id);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 
		 
		 /*VENDOR ACCOUNT BALANCE*/
		 public Response getFinancialYear()
			{
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getFinancialYear();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getVendorAccountBalance(Integer financial_year) {
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getVendorAccountBalance(financial_year);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 /* BANK RECONCILIATION REPORT*/   
		 
		 public Response getAllBankAccounts() {
				response.setSuccessful(false);
				List<Map<String, Object>> list = financeDao.getAllBankAccounts();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
		 
		 public Response getBankDetails(Finance finance) {
			  response.setSuccessful(false);
			  Map<String, Object> data = financeDao.getBankDetails(finance);
			  response.setResponseObject(data);
			  response.setSuccessful(true);
			  return response;
			  } 
		public Response updateBankDetails(Finance finance) {
				response.setSuccessful(false);
				financeDao.updateBankDetails(finance);
				response.setSuccessful(true);
				response.setResponseObject(finance);
				return response;
			}


			public Response getByBankDetails(Integer id) {
				response.setSuccessful(false);
				Finance singleuserdetails = financeDao.getByBankDetails(id);
				response.setSuccessful(true);
				response.setResponseObject(singleuserdetails);
				return response;
			}
			
			/*DISPLAY ACCOUNT BALANCE*/
			
			 public Response getAllDisplayGLAccount() {
					response.setSuccessful(false);
					List<Map<String, Object>> list = financeDao.getAllDisplayGLAccount();
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			
			 public Response getDisplayAccountBalance(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getDisplayAccountBalance(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  }  
			 
			 /*INVOICE VS PAYMENTS*/
			 public Response getAllOrders() {
					response.setSuccessful(false);
					List<Map<String, Object>> list = financeDao.getAllOrders();
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getInvoicevsPaymentsReport(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getInvoicevsPaymentsReport(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  }  
			 
			
			 
			 
			 public Response getGLAccountDetails(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getGLAccountDetails(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getGLAccountDetails1(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getGLAccountDetails1(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getGLAccountDetails2(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getGLAccountDetails2(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getGLAccountDetails3(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getGLAccountDetails3(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getGLAccountDetails4(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getGLAccountDetails4(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getGLAccountDetails5(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getGLAccountDetails5(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			
			 
			
			 /*TRAIL BALANCE*/
			 public Response getTrailIncomeExpenditureReport(Finance finance) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailIncomeExpenditureReport(finance);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 
			 public Response getTrailGLAccountDetails(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAccountDetails(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAccountDetails1(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAccountDetails1(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAccountDetails2(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAccountDetails2(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getTrailGLAccountDetails3(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAccountDetails3(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getTrailGLAccountDetails4(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAccountDetails4(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getTrailGLAccountDetails5(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAccountDetails5(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailExpenditureReport(Finance finance) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailExpenditureReport(finance);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 
			 public Response getTrailGLAccountNames(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAccountNames(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLAccountTwoNames(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAccountTwoNames(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLExpAccountNames(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLExpAccountNames(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLExpAccountOneNames(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLExpAccountOneNames(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLExpAccountTwoNames(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLExpAccountTwoNames(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 

			 
			 public Response getTrailEquityReport(Finance finance) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailEquityReport(finance);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 
			 public Response getTrailAssetReport(Finance finance) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailAssetReport(finance);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAsset(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAsset(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLAsset1(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAsset1(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLAsset2(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAsset2(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLAsset3(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAsset3(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLAsset4(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAsset4(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLAsset5(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAsset5(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLAsset6(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLAsset6(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 public Response getTrailGLEquity(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLEquity(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLEquity1(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLEquity1(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLEquity2(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLEquity2(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLEquity3(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLEquity3(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLEquity4(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLEquity4(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  } 
			 
			 public Response getTrailGLEquity5(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getTrailGLEquity5(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  }
			 
			 public Response getTrailGLAssetDetails(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAssetDetails(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAssetDetails1(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAssetDetails1(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAssetDetails2(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAssetDetails2(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAssetDetails3(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAssetDetails3(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAssetDetails4(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAssetDetails4(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAssetDetails5(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAssetDetails5(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLAssetDetails6(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLAssetDetails6(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLEquityDetails(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLEquityDetails(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLEquityDetails1(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLEquityDetails1(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getTrailGLEquityDetails2(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLEquityDetails2(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 public Response getTrailGLEquityDetails3(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLEquityDetails3(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLEquityDetails4(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLEquityDetails4(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 
			 public Response getTrailGLEquityDetails5(Integer id) {
					response.setSuccessful(false);
					Map<String, Object> list = financeDao.getTrailGLEquityDetails5(id);
					response.setSuccessful(true);
					response.setResponseObject(list);
					return response;
				}
			 /*COSTCENTER WISE REPORT*/
			 public Response getJournalVoucherDetails(Finance finance)
				{
					response.setSuccessful(false);
					List<Map<String, Object>> colleges = financeDao.getJournalVoucherDetails(finance);
					response.setSuccessful(true);
					response.setResponseObject(colleges);
					return response;
				}
			 
			 	public Response getCostCenterReport(Finance finance) {
				  response.setSuccessful(false);
				  Map<String, Object> data = financeDao.getCostCenterReport(finance);
				  response.setResponseObject(data);
				  response.setSuccessful(true);
				  return response;
				  }  

			 	/*TDS AND GST*/
			 	
			 	 public Response getIGSTReport(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getIGSTReport(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  }  
				 public Response getCGSTReport(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getCGSTReport(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  }  
				 public Response get194JReport(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.get194JReport(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  }  
				 
				 public Response getTDSGLAccounts() {
						response.setSuccessful(false);
						List<Map<String, Object>> list = financeDao.getTDSGLAccounts();
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}

				 public Response getByPendingDetails(String voucher_id)
				  {
				    this.response.setSuccessful(false);
				    Finance singleuserdetails = this.financeDao.getByPendingDetails(voucher_id);   
				    this.response.setSuccessful(true);
				    this.response.setResponseObject(singleuserdetails);
				    return this.response;
				  }
				 
				 
				 
				 public Response getpaymentdetails(String voucher_number)
				  {
				    this.response.setSuccessful(false);
				    Finance singleuserdetails = this.financeDao.getpaymentdetails(voucher_number);   
				    this.response.setSuccessful(true);
				    this.response.setResponseObject(singleuserdetails);
				    return this.response;
				  }
				 
				 
				
				 
				 public Response getCostCenter() {
						response.setSuccessful(false);
						List<Map<String, Object>> list = financeDao.getCostCenter();
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}    
				 
				 public Response getGLAssetDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetails1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetails1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetails2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetails2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetails3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetails3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetails4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetails4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetails5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetails5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetails6(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetails6(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetails1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetails1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLEquityDetails2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetails2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLEquityDetails3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetails3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetails4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetails4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetails5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetails5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 
				 public Response getGLAssetDetailsPrevious(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetailsPrevious(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetailsPrevious1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetailsPrevious1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetailsPrevious2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetailsPrevious2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetailsPrevious3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetailsPrevious3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetailsPrevious4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetailsPrevious4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetailsPrevious5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetailsPrevious5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAssetDetailsPrevious6(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAssetDetailsPrevious6(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetailsPrevious(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetailsPrevious(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetailsPrevious1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetailsPrevious1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLEquityDetailsPrevious2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetailsPrevious2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLEquityDetailsPrevious3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetailsPrevious3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetailsPrevious4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetailsPrevious4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLEquityDetailsPrevious5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLEquityDetailsPrevious5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
				 }     
				 
				 /*INCOME AND EXPENDITURE REPORT*/
				 public Response getIncomeExpenditureReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getIncomeExpenditureReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 
				 public Response getGLAccountDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAccountDetails1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetails1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAccountDetails2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetails2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLAccountDetails3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetails3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLAccountDetails4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetails4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLAccountDetails5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetails5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				/* PREVIOUS*/
				 
				 public Response getGLAccountDetailsPrevious(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetailsPrevious(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAccountDetailsPrevious1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetailsPrevious1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAccountDetailsPrevious2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetailsPrevious2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLAccountDetailsPrevious3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetailsPrevious3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLAccountDetailsPrevious4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetailsPrevious4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getGLAccountDetailsPrevious5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getGLAccountDetailsPrevious5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getExpenditureReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getExpenditureReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getDepreciationDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getDepreciationDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getGLAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getGLAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getGLAccountTwoNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getGLAccountTwoNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getGLExpAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getGLExpAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getGLExpAccountOneNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getGLExpAccountOneNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getGLExpAccountTwoNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getGLExpAccountTwoNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 public Response getDepreciationAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getDepreciationAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 /*MONTHLY INCOME AND EXPENDITURE REPORT*/
				 public Response getMonthIncomeExpenditureReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthIncomeExpenditureReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthExpenditureReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthExpenditureReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthDepreciationDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthDepreciationDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAccountTwoNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAccountTwoNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;    
					  } 
				 
				 public Response getMonthGLExpAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLExpAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLExpAccountOneNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLExpAccountOneNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLExpAccountTwoNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLExpAccountTwoNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 public Response getMonthDepreciationAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthDepreciationAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAccountDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAccountDetails1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetails1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAccountDetails2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetails2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLAccountDetails3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetails3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLAccountDetails4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetails4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLAccountDetails5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetails5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAccountDetailsPrevious(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetailsPrevious(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAccountDetailsPrevious1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetailsPrevious1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAccountDetailsPrevious2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetailsPrevious2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLAccountDetailsPrevious3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetailsPrevious3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLAccountDetailsPrevious4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetailsPrevious4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLAccountDetailsPrevious5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAccountDetailsPrevious5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
	
				 
				 /*MONTHLY TRAIL BALANCE*/
				 
					
				 public Response getMonthTrailIncomeExpenditureReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthTrailIncomeExpenditureReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthTrailExpenditureReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthTrailExpenditureReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;    
					}
				 
				 
				 public Response getMonthTrailGLAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLAccountTwoNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAccountTwoNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLExpAccountNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLExpAccountNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLExpAccountOneNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLExpAccountOneNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLExpAccountTwoNames(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLExpAccountTwoNames(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 

				 
				 public Response getMonthTrailEquityReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthTrailEquityReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 
				 public Response getMonthTrailAssetReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthTrailAssetReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthTrailGLAsset(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAsset(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLAsset1(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAsset1(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLAsset2(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAsset2(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLAsset3(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAsset3(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLAsset4(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAsset4(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLAsset5(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAsset5(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLAsset6(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLAsset6(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 public Response getMonthTrailGLEquity(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLEquity(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLEquity1(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLEquity1(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLEquity2(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLEquity2(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLEquity3(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLEquity3(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLEquity4(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLEquity4(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthTrailGLEquity5(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthTrailGLEquity5(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  }
				 
				 
				 /* MONTHLY BALANCE SHEET REPORT*/
				 public Response getMonthEquityReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthEquityReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 
				 public Response getMonthAssetReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthAssetReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAsset(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAsset(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAsset1(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAsset1(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAsset2(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAsset2(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAsset3(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAsset3(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAsset4(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAsset4(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAsset5(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAsset5(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLAsset6(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLAsset6(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 public Response getMonthGLEquity(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLEquity(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLEquity1(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLEquity1(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLEquity2(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLEquity2(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLEquity3(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLEquity3(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLEquity4(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLEquity4(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  } 
				 
				 public Response getMonthGLEquity5(Finance finance) {
					  response.setSuccessful(false);
					  Map<String, Object> data = financeDao.getMonthGLEquity5(finance);
					  response.setResponseObject(data);
					  response.setSuccessful(true);
					  return response;
					  }
				 
				 public Response getMonthGLAssetDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetails1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetails1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetails2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetails2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetails3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetails3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetails4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetails4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetails5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetails5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetails6(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetails6(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetails(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetails(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetails1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetails1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLEquityDetails2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetails2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLEquityDetails3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetails3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetails4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetails4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetails5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetails5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				/* PREVIOUS*/
				 
				 public Response getMonthGLAssetDetailsPrevious(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetailsPrevious(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetailsPrevious1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetailsPrevious1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetailsPrevious2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetailsPrevious2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetailsPrevious3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetailsPrevious3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetailsPrevious4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetailsPrevious4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetailsPrevious5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetailsPrevious5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLAssetDetailsPrevious6(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLAssetDetailsPrevious6(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetailsPrevious(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetailsPrevious(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetailsPrevious1(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetailsPrevious1(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLEquityDetailsPrevious2(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetailsPrevious2(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 public Response getMonthGLEquityDetailsPrevious3(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetailsPrevious3(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetailsPrevious4(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetailsPrevious4(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
				 
				 public Response getMonthGLEquityDetailsPrevious5(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthGLEquityDetailsPrevious5(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
				 }
				 
				 /* MONTHLY CASH FLOW STATEMENT*/
				 
				 public Response getMonthCashFlowReport(Finance finance) {
						response.setSuccessful(false);
						Map<String, Object> list = financeDao.getMonthCashFlowReport(finance);
						response.setSuccessful(true);
						response.setResponseObject(list);
						return response;
					}
	

}
