package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Ctc;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.Finance;
    
@Repository
public class FinanceDAO extends BaseDAO{
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	   
	/* inserting liabilities */
	public void addliability(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.addliabilitydata", params);  
		sqlSession.close();
	}
	
	/* getting liabilities heads */
	public List<Map<String, Object>> getliabilitiesheads()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getliabilitiesheads");
	    return list;
	  }
	
	/* getting all liabilities in table */
	public List<Finance> getallliabilities() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallliabilities");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting all Email Settings in table */
	public List<Finance> getallemailSettingsdata() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallemailSettingsdata");
		sqlSession.close();
		return userdetails;
	}
	
	/* inserting expense account */
	public void addexpenseaccount(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.addexpenseaccount", params);
		sqlSession.close();
	}
	
	/* getting all liabilities in table */
	public List<Finance> getalllexpenseaccounts() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalllexpenseaccounts");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting data based on expense account name */
	public Finance getexpenseaccountdetails(String expense_account_name)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getexpenseaccountdetails",expense_account_name);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* update data based on expense account name */
	public void updateexpenseaccount(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updateexpenseaccount",params);
		sqlSession.close();
	}
	
	/* update data based on voucher_number */
	public void updateJE(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updateJE",params);
		sqlSession.close();
	}
	
	/* inserting expense account */
	public void createcostcenter(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createcostcenter", params);
		sqlSession.close();
	}
	
	/* getting all cost centers data in table */
	public List<Finance> getalllcostcenters() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalllcostcenters");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting cost center data based on cost center name */
	public Finance getcostcenterdata(String name)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getcostcenterdata",name);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating cost center data based on cost center name */
	public void updatecostcenter(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updatecostcenter",params);
		sqlSession.close();
	}
	
	/* creating tax group */
	public void createtaxgroup(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createtaxgroup", params);
		sqlSession.close();
	}
	
	/* getting all tax groups in table */
	public List<Finance> getallltaxgroups() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallltaxgroups");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting tax group data based on tax group name */
	public Finance gettaxgroupdata(String tax_group_name)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.gettaxgroupdata",tax_group_name);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating data based on tax group name */
	public void updatetaxgroup(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updatetaxgroup",params);
		sqlSession.close();
	}
	
	/* create nature of service */
	public void createnatureofservice(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createnatureofservice", params);
		sqlSession.close();
	}
	
	/* getting all nature of services in table */
	public List<Finance> getalllnatureofservices() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalllnatureofservices");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting all Reimbursement data in table */
	public List<Finance> getallReimbursementdata() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallReimbursementdata");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting data based on service name */
	public Finance getnatureofservice(String service_name)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getnatureofservice",service_name);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* getting data based on service name */
	public Finance getemailsetingsdata(Integer id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getemailsetingsdata",id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* getting data based on id */
	public Finance getReimbursementdata(Integer id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getReimbursementdata",id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating email settings data based on id */
	public void updateEmailsettings(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updateEmailsettings",params);
		sqlSession.close();
	}
	
	/* updating reimbursement data based on id */
	public void updateReimbursements(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updateReimbursements",params);
		sqlSession.close();
	}
	
	/* updating data based on service name */
	public void updatenatureofservice(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updatenatureofservice",params);
		sqlSession.close();
	}
	
	/* getting tax groups in drop downs */
	public List<Map<String, Object>> getTaxgroups()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTaxgroups");
	    return list;
	  }
	
	/* getting bank account names in drop downs */
	public List<Map<String, Object>> getBankaccountnames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getBankaccountnames");
	    return list;
	  }
	
	/* getting tax groups in drop downs */
	public List<Map<String, Object>> getservicetype()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getservicetype");
	    return list;
	  }
	
	/* getting gl account names in drop downs */
	public List<Map<String, Object>> getTaxaccountnames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTaxaccountnames");
	    return list;
	  }
	
	/* creating tax account */
	public void createtaxaccount(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createtaxaccount", params);
		sqlSession.close();
	}
	
	/* getting all tax account data to table */
	public List<Finance> getallltaxaccounts() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallltaxaccounts");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting tax account data based on tax account name */
	public Finance gettaxaccountdata(Integer id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.gettaxaccountdata",id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating tax account data */
	public void updatetaxaccount(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updatetaxaccount",params);
		sqlSession.close();
	}
	
	/* getting tax section names in drop downs */
	public List<Map<String, Object>> getTaxsectionnames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTaxsectionnames");
	    return list;
	  }
	
	/* creating tax mapping */
	public void createtaxmapping(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createtaxmapping", params);
		sqlSession.close();
	}
	
	/* getting all tax mapping data in table */
	public List<Finance> getallltaxmappings() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallltaxmappings");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting data in pop up based on id */
	public Finance gettaxmappingdata(Integer id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.gettaxmappingdata",id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating tax mapping based on id */
	public void updatetaxmapping(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updatetaxmapping",params);
		sqlSession.close();
	}
	
	/* deleting tax mapping data based on id */
	public void remove(Integer id)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Finance.deletetaxmapping",id);
		sqlSession.close();
	}
	
	/* creating local conveyance rate */
	public void createlocalconveyancerate(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createlocalconveyancerate", params);
		sqlSession.close();
	}
	
	/* getting local conveyance data to table */
	public List<Finance> getallllocalconveyancesdata() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallllocalconveyancesdata");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting local conveyance data in pop up based on id */
	public Finance getlocalconveyancedata(Integer id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getlocalconveyancedata",id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating local conveance data */
	public void updatelocalconveyancedata(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updatelocalconveyancedata",params);
		sqlSession.close();
	}
	
	/* creating vehicle type */
	public void createvehicletype(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createvehicletype", params);
		sqlSession.close();
	}
	
	/* getting vehicle type details to table */
	public List<Finance> getalllvehicletypessdata() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalllvehicletypessdata");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting vehicle type data in pop up based on id */
	public Finance getvehicletypedatadata(Integer id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getvehicletypedatadata",id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating vehicle Type data */
	public void updatevehicletypedata(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updatevehicletypedata",params);
		sqlSession.close();
	}
	
	/* create email settings */
	public void createemailsettings(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createemailsettings", params);
		sqlSession.close();
	}
	
	/* creating vehicle registration */
	public void createvehicleRegistration(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createvehicleRegistration", params);
		sqlSession.close();
	}
	
	/* getting travel data in drop down */
	public List<Map<String, Object>> gettravel()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.gettravel");
	    return list;
	  }
	
	/* creating reimbursement policy */
	public void createreimbursementpolicy(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.createreimbursementpolicy", params);
		sqlSession.close();
	}
	
	/* creating claim advance new */
	public void submitclaimadvance(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear  =sqlSession.selectOne("Finance.getYear");
		Integer id  =sqlSession.selectOne("Finance.getCount");
		params.put("year",currentYear);        
		params.put("id",id);
		sqlSession.insert("Finance.submitclaimadvance", params);
		sqlSession.close();
	}
	      
	/* getting financial year drop down */
	public List<Map<String, Object>> getfinancialyears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getfinancialyears");
	    return list;
	  }
	

	
	/* getting sectors drop down */
	public List<Map<String, Object>> getsectors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getsectors");
	    return list;
	  }
	
	/* getting projects drop down */
	public List<Map<String, Object>> getprojects()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getprojects");
	    return list;
	  }
	
	/* creating claim advance existing */
	public void submitexistingclaimadvance(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.submitexistingclaimadvance", params);
		sqlSession.close();
	}
	
	/* getting claim advance ids drop down */
	public List<Map<String, Object>> getclaimadvanceids()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getclaimadvanceids");
	    return list;
	  }
	
	/* inserting bill submission data */
	public void suubmitbillsubmission(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer id  =sqlSession.selectOne("Finance.getCount1");       
		params.put("id",id);
		sqlSession.insert("Finance.suubmitbillsubmission", params);
		sqlSession.close();
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		Integer claim_id = sqlSession2.selectOne("Finance.getclaimid");
		params.put("claim_id",claim_id); 
		System.out.println(claim_id + "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		sqlSession2.insert("Finance.suubmitbillsubmissiondetails", params);
		sqlSession2.close();
	}
	     
	/* getting nature of services drop down */
	public List<Map<String, Object>> getNatureofservices()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getNatureofservices");
	    return list;
	  }
	
	/* getting states drop down */
	public List<Map<String, Object>> getStates()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getStates");
	    return list;
	  }
	
	/* creating customer */
	public void customercreation(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer id  =sqlSession.selectOne("Finance.getCount2");       
		params.put("id",id);
		sqlSession.insert("Finance.customercreation", params);
		sqlSession.close();
	}
	
	/* getting all customer details in table */
	public List<Finance> getalllCustomerDetails() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalllCustomerDetails");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting customer data to pop up based on customer id */
	public Finance getCustomerdata(String customer_id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getCustomerdata",customer_id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* updating customer data */
	public void UpdateCustomerdata(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.UpdateCustomerdata",params);
		sqlSession.close();
	}
	
	/* in activating customer */
	public void inactivecustomer(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.inactivecustomer",params);
		sqlSession.close();
	}
	
	/* getting customers drop down */
	public List<Map<String, Object>> getCustomers()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getCustomers");
	    return list;
	  }
	
	/* getting programs drop down */
	public List<Map<String, Object>> getPrograms()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getPrograms");
	    return list;
	  }
	
	/* getting services drop down */
	public List<Map<String, Object>> getServices()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getServices");
	    return list;
	  }
	
	/* getting schemes drop down */
	public List<Map<String, Object>> getSchemes()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getSchemes");
	    return list;
	  }
	
	/* creating Accounts receivable */
	public void createaccountreceivable(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear  =sqlSession.selectOne("Finance.getYear1");
		params.put("year",currentYear);  
		Integer currentMonth  =sqlSession.selectOne("Finance.getMonth");
		params.put("month",currentMonth); 
		Integer currentDate  =sqlSession.selectOne("Finance.getDate");
		params.put("date",currentDate); 
		Integer id  =sqlSession.selectOne("Finance.getCount3");       
		params.put("id",id);
		sqlSession.insert("Finance.createaccountreceivable", params);
		sqlSession.close();
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		Integer accounts_receivable_header = sqlSession2.selectOne("Finance.getaccountsreceivableid");
		params.put("accounts_receivable_header",accounts_receivable_header); 
		System.out.println(accounts_receivable_header + "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		sqlSession2.insert("Finance.createaccountreceivabledet", params);
		sqlSession2.close();
		 
		
	}
	
	/* getting all account receivables to table */
	public List<Finance> getalllaccountsreceivables() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalllaccountsreceivables");
		sqlSession.close();
		return userdetails;
	}
	
	/* deleting accounts receivable data from headers table based on voucher id */
	public void removeheader(String voucher_id)
	{  
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Finance.deleteaccoutsreceivableheader",voucher_id);
		sqlSession.close();
	}
	
	/* deleting accounts receivable data from details table based on voucher id */
	public void removedetails(String voucher_id)
	{  
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Finance.deleteaccoutsreceivabledetails",voucher_id);
		sqlSession.close();
	}
	
	/* uploading documents */
	public void uploaddocuments(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.uploaddocuments",params);
		sqlSession.close();
	}
	
	/* getting voucher id */
	public Finance getvoucherIDdata(String voucher_id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getvoucherIDdata",voucher_id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* getting vendors drop down */
	public List<Map<String, Object>> getvendors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getvendors");
	    return list;
	  }
	
	/* creating journal voucher details */
	public void CreateJE(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear  =sqlSession.selectOne("Finance.getYearJE");
		params.put("year",currentYear);  
		Integer currentMonth  =sqlSession.selectOne("Finance.getMonthJE");
		params.put("month",currentMonth); 
		Integer currentDate  =sqlSession.selectOne("Finance.getDateJE");
		params.put("date",currentDate); 
		Integer id  =sqlSession.selectOne("Finance.getCountJE");       
		params.put("id",id);
		sqlSession.insert("Finance.CreateJEHeader", params);
		sqlSession.close();   
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		Integer journal_entry_header = sqlSession2.selectOne("Finance.getjournalentryheaderid");
		params.put("journal_entry_header",journal_entry_header); 
		System.out.println(journal_entry_header + "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
		sqlSession2.insert("Finance.CreateJEDet", params); 
		sqlSession2.close();
	}   
	
	/*
	 * public void CreateJE(Finance finance) { Map<String, Object> params = new
	 * HashMap<String, Object>(); params.put("p", finance); SqlSession sqlSession =
	 * sqlSessionFactory.openSession(); Integer currentYear
	 * =sqlSession.selectOne("Finance.getYearJE"); params.put("year",currentYear);
	 * Integer currentMonth =sqlSession.selectOne("Finance.getMonthJE");
	 * params.put("month",currentMonth); Integer currentDate
	 * =sqlSession.selectOne("Finance.getDateJE"); params.put("date",currentDate);
	 * Integer id =sqlSession.selectOne("Finance.getCountJE"); params.put("id",id);
	 * sqlSession.insert("Finance.CreateJEHeader", params);
	 * sqlSession.insert("Finance.CreateJEDet", params); sqlSession.commit();
	 * sqlSession.close(); }
	 */
	
	/* getting all journal vouchers to table */
	public List<Finance> getalljournalaccounts() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalljournalaccounts");
		sqlSession.close();
		return userdetails;
	}
	
	/* deleting journal voucher data from headers table */
	public void removejeheader(String voucher_number)
	{  
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Finance.deletejournalvoucherheader",voucher_number);
		sqlSession.close();
	}
	
	/* deleting journal voucher data from details table */
	public void removejedetails(String voucher_number)
	{  
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Finance.deletejournalvoucherdetails",voucher_number);
		sqlSession.close();
	}
	
	/* getting districts drop down */
	public List<Map<String, Object>> getdistricts()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getdistricts");
	    return list;
	  }
	
	/* creating work order */
	public void createworkorder(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear  =sqlSession.selectOne("Finance.getYearwo");
		params.put("year",currentYear);  
		Integer currentMonth  =sqlSession.selectOne("Finance.getMonthwo");
		params.put("month",currentMonth); 
		Integer id  =sqlSession.selectOne("Finance.getCountwo");       
		params.put("id",id);
		sqlSession.insert("Finance.createworkorder", params); 
		sqlSession.close();
	}
	
	/* getting work orders drop down */
	public List<Map<String, Object>> getworkorders()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getworkorders");
	    return list;
	  }
	
	/* getting work order details in book invoice */
	 public List<Map<String,Object>> getDetailsofWO(Finance finance)
	 {  
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", finance);      

	 List<Map<String,Object>> list = sqlSessionTemplate.selectList("Finance.getDetailsofWO", params);  
	 return list;    
	 }
	
	 /* book invoice for others type */
	 public void bookothersinvoice(Finance finance) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer currentYear  =sqlSession.selectOne("Finance.getYearAP");
			params.put("year",currentYear);  
			Integer currentMonth  =sqlSession.selectOne("Finance.getMonthAP");
			params.put("month",currentMonth); 
			Integer currentDate  =sqlSession.selectOne("Finance.getDateAP");
			params.put("date",currentDate); 
			Integer id  =sqlSession.selectOne("Finance.getCountAP");       
			params.put("id",id);
			sqlSession.insert("Finance.bookothersinvoice", params);
			sqlSession.close();
		}
	 
	 /* getting gl account names in drop downs */
	 public List<Map<String, Object>> getSDEIgroupnames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getSDEIgroupnames");
	    return list;
	  }
		
	/* getting gl account names in drop downs */
	 public List<Map<String, Object>> getSegments()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getSegments");
	    return list;
	  }
	 
	 /* creating Budget inputs */
		public void createBudgetinput(Finance finance) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer currentYear  =sqlSession.selectOne("Finance.getYearBI");
			params.put("year",currentYear);  
			Integer currentMonth  =sqlSession.selectOne("Finance.getMonthBI");
			params.put("month",currentMonth); 
			Integer currentDate  =sqlSession.selectOne("Finance.getDateBI");
			params.put("date",currentDate); 
			Integer id  =sqlSession.selectOne("Finance.getCountBI");       
			params.put("id",id);   
			sqlSession.insert("Finance.createBudgetinput", params);
			sqlSession.close();   
			SqlSession sqlSession2 = sqlSessionFactory.openSession();
			Integer budgetid = sqlSession2.selectOne("Finance.getbudgetid");
			params.put("budgetid",budgetid); 
			System.out.println(budgetid + "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
			sqlSession2.insert("Finance.insertdatatobudgetnote", params);
			sqlSession2.close();   
		}    
	
	/* getting all budget inputs to table */
	 public List<Finance> getallBudgetInputs() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallBudgetInputs");
		sqlSession.close();
		return userdetails;
	}
		
	/* getting all pending claims */
	public List<Finance> getallPendingData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallPendingData");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting data in pending view page */
	public Finance getpendingclaimDetails(String claim_reimbursement_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getpendingclaimDetails", claim_reimbursement_id);
		return list;
	}
	
	/* getting data in pending view page table */
	
	public Map<String, Object> getViewpagetabledata(Finance finance) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", finance);
		List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getViewpagetabledata", map);
		map.put("dates", districts);
		return map;
	}
	
	/* Approving claim in pending view page */
	public void approveclaim(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.approveclaim",params);
		sqlSession.close();
	}
	
	/* getting all Approved claims */
	public List<Finance> getallApprovedData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallApprovedData");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting data in approved view page */
	public Finance getAcceptedclaimDetails(String claim_reimbursement_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getAcceptedclaimDetails", claim_reimbursement_id);
		return list;
	}
	
	/* getting all advance list  */
	public List<Finance> getalladvanceListData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalladvanceListData");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting all advance history list to view page table */
	public List<Finance> getallviewHistoryListData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallviewHistoryListData");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting data in approved view page */
	public Finance getadvanceviewpgedata(String claim_advance_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getadvanceviewpgedata", claim_advance_id);
		return list;
	}
	
	/* getting all advance pending list data to table */
	public List<Finance> getalladvancePendingData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalladvancePendingData");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting advance pending view page data */
	public Finance getadvancependingvewdata(String claim_advance_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getadvancependingvewdata", claim_advance_id);
		return list;
	}
	
	/* updating advance claim data */
	public void updateadvanceclaimdata(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.updateadvanceclaimdata",params);
		sqlSession.close();
	}
	
	/* getting data in advance claim pop up */
	public Finance getpopupdata(String claim_advance_id)  
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Finance singleuserdetails=sqlSession.selectOne("Finance.getpopupdata",claim_advance_id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	/* approving advance claim */
	public void Approveadvanceclaim(Finance finance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Finance.Approveadvanceclaim",params);
		sqlSession.close();
	}
	
	/* getting all approved data list to table */
	public List<Finance> getalladvanceApprovedData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getalladvanceApprovedData");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting approved view page details in advance list */
	public Finance getapprovedclaimDetails(String claim_advance_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getapprovedclaimDetails", claim_advance_id);
		return list;
	}
	
	/* getting all bill submission lists to table */
	public List<Finance> getallbillsubmissionlists() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallbillsubmissionlists");
		sqlSession.close();
		return userdetails;
	}
	
	/* getting data in bill submission view page */
	public Finance getbillsubmissionviewpgedata(String claim_reimbursement_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getbillsubmissionviewpgedata", claim_reimbursement_id);
		return list;
	}
	
	/* getting data in bill submission update page */
	public Finance getbillsubmissionupdatedata(String claim_reimbursement_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getbillsubmissionupdatedata", claim_reimbursement_id);
		return list;
	}
	
	/* getting data for advance claim in claim status report page */
	public Map<String, Object> getAdvanceClaimdata(Finance finance)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", finance);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("Finance.getAdvanceClaimdata",map);
	  map.put("dates", districts);
	  return map;
	  }
	
	/* getting data for reimbursement claim in claim status report page */
	public Map<String, Object> getreimbursementClaimdata(Finance finance)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", finance);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("Finance.getreimbursementClaimdata",map);
	  map.put("dates", districts);
	  return map;
	  }
	
	/* getting advance claim drop down */
	 public List<Map<String, Object>> getAdvanceclaims()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAdvanceclaims");
	    return list;
	  }
	
	 /* getting Reimbursement claim drop down */
	 public List<Map<String, Object>> getReimbursementclaims()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getReimbursementclaims");
	    return list;
	  }
	 
	 /* getting je data in submitted je tab for period type */
	 public Map<String, Object> getperiodJEList(Finance finance)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", finance);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("Finance.getperiodJEList",map);
	  map.put("subpe", districts);
	  return map;
	  }
	 
	 /* getting je data in submitted je tab for financial type */
	 public Map<String, Object> getfinancialJEList(Finance finance)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", finance);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("Finance.getfinancialJEList",map);
	  map.put("subpe", districts);
	  return map;
	  }
	 
	 /* getting data pop up in submitted list je tab for period type */
	 public Finance getsubmittedjelistdata(String voucher_number)  
	 {
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 Finance singleuserdetails=sqlSession.selectOne("Finance.getsubmittedjelistdata",voucher_number);
		 sqlSession.close();
		 return singleuserdetails;
			
	 }
	 
	 /* getting pop up table data for submitted je list view for period type */
	 public Map<String, Object> getpopuptabledatasubperiod(Finance finance)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", finance);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("Finance.getpopuptabledatasubperiod",map);
	  map.put("popuptable", districts);
	  return map;   
	  }
	 
	 /* getting data in update page in submitted je list tab for period type */
	 public Finance getupdatesubperioddata(String voucher_number)  
	 {
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 Finance singleuserdetails=sqlSession.selectOne("Finance.getupdatesubperioddata",voucher_number);
		 sqlSession.close();
		 return singleuserdetails;
		 
	 }
	 
	 /* getting data in pop up in budget page */
	 public Finance viewbudgetpopupdata(String budget_id)  
	 {
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 Finance singleuserdetails=sqlSession.selectOne("Finance.viewbudgetpopupdata",budget_id);
		 sqlSession.close();
		 return singleuserdetails;
		
	 }
	 
	 /* getting data in budget over view table based on financial year */
	 public Map<String, Object> getbudgetdataoverview(Finance finance)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", finance);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("Finance.getbudgetdataoverview",map);
	  map.put("budgetoverview", districts);
	  return map;
	  }
	 
	 /* getting all pending budget inputs to pending list table in budget approval page */
	 public List<Finance> getallPendingbudgetData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallPendingbudgetData");
		sqlSession.close();
		return userdetails;
	}	 
	 
	/* getting approved or rejected budget inputs list to table in budget approval page */
	 public List<Finance> getallapprovedbudgetData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallapprovedbudgetData");
		sqlSession.close();
		return userdetails;
	}	
	 
	 /* getting data in budget approval view page */
	 public Finance budgetviewpagedata(String budget_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.budgetviewpagedata", budget_id);
		return list;
	}
	 
	 public Finance getfinanceyear(Integer financialyear) {
			Finance list = this.sqlSessionTemplate.selectOne("Finance.getfinanceyear", financialyear);
			return list;
		}
	 
	/* approving budget input in budget approval view page */
	 public void approvebudgetinput(Finance finance)
	 {
		 Map<String, Object> params = new HashMap<String, Object>();
		 params.put("p", finance);
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 sqlSession.update("Finance.approvebudgetinput",params);
		 sqlSession.close();
	 }
	 
	 /* getting pending accounts receivables to table in pending list tab for account receivable list page */
	 public List<Finance> getallPendingreceivablesData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallPendingreceivablesData");
		sqlSession.close();
		return userdetails;
	}
	 
	/* getting data to view page in accounts receivable list page */
	 public Finance getreceivableviewdata(String voucher_id) {
		Finance list = this.sqlSessionTemplate.selectOne("Finance.getreceivableviewdata", voucher_id);
		return list;
	}
	 
	/* approving accounts receivables */
	 public void approveaccountsreceivable(Finance finance)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Finance.approveaccountsreceivable",params);
			sqlSession.close();
		}
	 
	 /* getting approved or rejected data to table in approved or rejected tab for accounts receivable list page */
	 public List<Finance> getallPendingapprovedrejectedreceivablesData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallPendingapprovedrejectedreceivablesData");
		sqlSession.close();
		return userdetails;
	}
	 
	/* getting all booked accounts receivables to table in booked invoices */
	public List<Finance> getallbookedreceivablesData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallbookedreceivablesData");
		sqlSession.close();
		return userdetails;  
	}
	
	/* getting partially paid invoices in accounts receivable booked invoices */
	public List<Finance> getpartiallypaideceivablesData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getpartiallypaideceivablesData");
		sqlSession.close();
		return userdetails;  
	}
	
	/* getting employee names drop down in generate form-16 page */
	public List<Map<String, Object>> getEmployeenames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getEmployeenames");
	    return list;
	  }
	
	/* getting data in pending invoices tab in booked invoice page in finance login */
	 public List<Finance> getallPendinginvoicesData() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Finance> userdetails = sqlSession.selectList("Finance.getallPendinginvoicesData");
		sqlSession.close();
		return userdetails;
	}
	 
	 
	 
	 
	 
	 /* Accounts_payable */

	 public List<Map<String, Object>> getAllPendings() {
	 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllPendings");
	 return list;
	 }

	  
	 public Finance getByPendingDetails(Finance finance) {
	 Finance list = this.sqlSessionTemplate.selectOne("Finance.getByPendingDetails", finance);

	 return list;
	 }
	 
	 
	 public Finance getByPendingDetails(String voucher_id) {
			Finance list = this.sqlSessionTemplate.selectOne("Finance.getByPendingDetails", voucher_id);
			return list;
		}
	 
	 public Finance getByPendingDetailsdata(String voucher_id) {
			Finance list = this.sqlSessionTemplate.selectOne("Finance.getByPendingDetailsdata", voucher_id);
			return list;
		}
	 

	 public List<Map<String, Object>> getTaxDetails(String voucher_id) {

	 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTaxDetails", voucher_id);

	 return list;
	 }

	 public Finance getPaymentDetails(String voucher_id) {
	 Finance list = this.sqlSessionTemplate.selectOne("Finance.getPaymentDetails", voucher_id);

	 return list;

	 }

	 public List<Map<String, Object>> getItemDetails(String voucher_id) {

	 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getItemDetails", voucher_id);

	 return list;
	 }
	 
	 

	 public List<Map<String, Object>> getDocumentDetails(String voucher_id) {

	 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getDocumentDetails", voucher_id);

	 return list;
	 }


	 public List<Map<String, Object>> getCommentDetails(String voucher_id) {

	 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getCommentDetails", voucher_id);

	 return list;
	 }
	 public List<Map<String, Object>> getTimelineDetails(String voucher_id) {

	 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTimelineDetails", voucher_id);

	 return list;
	 }

	 public List<Map<String, Object>> getPreviousInvoiceDetails(Integer workorder) {

	 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getPreviousInvoiceDetails", workorder);

	 return list;
	 }
	  public Map<String, Object> getJVDetails(String voucher_id)
	  {
	    List<Map<String, Object>> list =
	      this.sqlSessionTemplate.selectList("Finance.getAccountDetails", voucher_id);
	    List<Map<String, Object>> list1 =
	      this.sqlSessionTemplate.selectList("Finance.getTaxesDetails",voucher_id);
	    List<Map<String, Object>> list2 =
	        this.sqlSessionTemplate.selectList("Finance.getvendorDetails",voucher_id);
	       Map<String, Object> map = new HashMap();
	    map.put("account", list);  
	    map.put("tax", list1);
	    map.put("vendor", list2);     
	    
	    return map;       
	  }
	  
	  public void saveComments(Finance finance) {
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", finance);
	 SqlSession sqlSession = sqlSessionFactory.openSession();
	 sqlSession.insert("Finance.saveComments", params);
	 sqlSession.close();
	 }

	 /* booking invoice in accounts payable view page */
	  public void bookaccountspayableinvoice(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear  =sqlSession.selectOne("Finance.getYearJE");
		params.put("year",currentYear);  
		Integer currentMonth  =sqlSession.selectOne("Finance.getMonthJE");
		params.put("month",currentMonth); 
		Integer currentDate  =sqlSession.selectOne("Finance.getDateJE");
		params.put("date",currentDate); 
		Integer id  =sqlSession.selectOne("Finance.getCountJE");          
		params.put("id",id);
		sqlSession.insert("Finance.bookaccountspayableinvoice", params); 
		sqlSession.close();
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
	  	Integer jvid = sqlSession2.selectOne("Finance.getJVid");		     	
		params.put("jvid",jvid);
		sqlSession2.insert("Finance.bookaccountspayableinvoicepayable", params); 
		sqlSession2.close();    
		  
	  }
	 
	  public Finance getjouranlentrydata()     
		{
		  Map<String, Object> params = new HashMap<String, Object>();
		  	SqlSession sqlSession2 = sqlSessionFactory.openSession();
		  	Integer jvid = sqlSession2.selectOne("Finance.getJVid");		     	
			params.put("jvid",jvid);
			Finance singleuserdetails=sqlSession2.selectOne("Finance.getjouranlentrydata",jvid);
			sqlSession2.close();
			return singleuserdetails;
			
		}
	 
	  /* getting payment release page details */
	  public Finance getpaymentdetails(Finance finance) {
			Finance list = this.sqlSessionTemplate.selectOne("Finance.getpaymentdetails", finance);
			return list;
		}
	  
	  /* getting partial payment release page details */
	/*
	 * public Finance getPartialpaydet(Finance finance) { Finance list =
	 * this.sqlSessionTemplate.selectOne("Finance.getPartialpaydet", finance);
	 * return list; }
	 */
	  
	  public Finance getPartialpaydet(String voucher_number) {
			Finance list = this.sqlSessionTemplate.selectOne("Finance.getPartialpaydet", voucher_number);
			return list;
		}
	  
	  /* releasing payment to vendor */
	  public void Releasepaymenttovendor(Finance finance) {
		  Map<String, Object> params = new HashMap<String, Object>();
		  params.put("p", finance);
		  SqlSession sqlSession = sqlSessionFactory.openSession();
		  sqlSession.insert("Finance.Releasepaymenttovendor", params);
		  sqlSession.update("Finance.updatejournalpayables",params);
		  /* sqlSession.update("Finance.updatejournalaccountspayables",params); */
		  sqlSession.update("Finance.updatejournalinvoiceheader",params);
		  sqlSession.update("Finance.updateAccountsPayablestatus",params);
		  /* sqlSession.update("Finance.updatepaymentjournalentryheader",params); */  
		  sqlSession.close();
		   
		  SqlSession sqlSession1 = sqlSessionFactory.openSession();
		  Integer currentYear  =sqlSession1.selectOne("Finance.getYearpayment");
		  params.put("year",currentYear);  
		  Integer currentMonth  =sqlSession1.selectOne("Finance.getMonthpayment");
		  params.put("month",currentMonth);
		  Integer currentDate  =sqlSession1.selectOne("Finance.getDatepayment");
		  params.put("date",currentDate);
		  Integer id  =sqlSession1.selectOne("Finance.getCountbankadvice");      
		  params.put("id",id);
		     
		  Integer payementid = sqlSession1.selectOne("Finance.getpaymentid");
		  params.put("payementid",payementid);
		  sqlSession1.insert("Finance.Releasepaymentbankadvice", params);
		  sqlSession1.insert("Finance.Releasepaymentpaymentsdetails", params);
		  sqlSession1.close();
	}

	  
	  /* getting all bank payments to table in bank payment page */
	  public List<Finance> getallbankpaymentsdata() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<Finance> userdetails = sqlSession.selectList("Finance.getallbankpaymentsdata");
			sqlSession.close();
			return userdetails;
		}
	  
	  /* getting data in bank payments view page */
	  public Finance getBankpaymentsdata(String voucher_number) { 
			Finance list = this.sqlSessionTemplate.selectOne("Finance.getBankpaymentsdata", voucher_number);
			return list;
		}
	  
	  /* getting payment bank details to view page table in bank payments */
	  public Map<String, Object> getpaymentaccountdetails(String voucher_number)
	  {
	    List<Map<String, Object>> list =
	      this.sqlSessionTemplate.selectList("Finance.getVendorpaymentDetails", voucher_number);
	    List<Map<String, Object>> list1 =
	      this.sqlSessionTemplate.selectList("Finance.getBankpaymentDetails",voucher_number);
	    Map<String, Object> map = new HashMap();
	    map.put("vendor", list);  
	    map.put("bank", list1);	    
	    return map;
	  }
	  
	  /* getting all booked invoices to table in booked invoices page */
	  public List<Finance> getallbookedinvoicesData() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<Finance> userdetails = sqlSession.selectList("Finance.getallbookedinvoicesData");
			sqlSession.close();
			return userdetails;
		}
	  
	  /* getting Booked Invoices view page data */
		public Finance getJouranlentrydata(String voucher_id) {
			Finance list = this.sqlSessionTemplate.selectOne("Finance.getJouranlentrydata", voucher_id);
			return list;
		}
		
		/* getting all partially paid invoices to table in booked invoices page */
		  public List<Finance> getallpartiallypaidinvoices() {
				SqlSession sqlSession = sqlSessionFactory.openSession();
				List<Finance> userdetails = sqlSession.selectList("Finance.getallpartiallypaidinvoices");
				sqlSession.close();
				return userdetails;
			}
		  
		  /* creating tax sections */
		  public List<Map<String, Object>> getAllCreateSections()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllCreateSections");
		    return list;
		  }
		  
		  public Finance getBySection(Integer id)
			{ 
				
			 Finance finance = sqlSessionTemplate.selectOne("Finance.getBySection",id);
				return finance;             
				        
			}
		  
		  public void updateSectionData(Finance finance)   
			{
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", finance);   
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.update("Finance.updateSectionData",params);
				sqlSession.close();
			}
		  
		  /*Section Details*/
			
			 public void saveSectionDetails(Finance finance) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("p", finance);
					SqlSession sqlSession = sqlSessionFactory.openSession();
					sqlSession.insert("Finance.saveSectionDetails", params);
					sqlSession.close();
				}
			 
			 /*Tax Details*/
				
			 public void saveTaxDetails(Finance finance) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("p", finance);
					SqlSession sqlSession = sqlSessionFactory.openSession();
					sqlSession.insert("Finance.saveTaxDetails", params);
					sqlSession.close();
				}
				
				public List<Map<String, Object>> getAllSections()
				  {
					System.out.println("Service");
				    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllSections");
				    return list;
				  }
				
				 public Finance getByTax(Integer id)
					{ 
						
					 Finance finance = sqlSessionTemplate.selectOne("Finance.getByTax",id);
						return finance;             
						        
					}
				 
				 public void updateTaxData(Finance finance)   
					{
						Map<String, Object> params = new HashMap<String, Object>();
						params.put("p", finance);   
						SqlSession sqlSession = sqlSessionFactory.openSession();
						sqlSession.update("Finance.updateTaxData",params);
						sqlSession.close();
					}
				 
		/* finance admin gl accounts */
				 
	public List<Map<String, Object>> getAccountType() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAccountType");
		return list;
	}
	
	public List<Map<String, Object>> getGLHeads() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLHeads");
		return list;
	}
	
	public List<Map<String, Object>> getIncomeHeads() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getIncomeHeads");
		return list;
	}
	
	public List<Map<String, Object>> getLiability() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getLiability");
		return list;
	}
	
	public List<Map<String, Object>> getAssetClass() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAssetClass");
		return list;
	}
	
	public Map<String, Object> getAssetNature(Integer asset_id)
	{
		List<Map<String, Object>> report =
				sqlSessionTemplate.selectList("Finance.getAssetNature", asset_id);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("report", report);
		return map;
	}
	
	public void saveGLgroupDetails(Finance finance) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", finance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Finance.saveGLgroupDetails", params);
		sqlSession.close();
	}
	
	public List<Map<String, Object>> getAllGLgroups()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllGLgroups");
	    return list;
	  }
	
	 public Finance getByGLGroup(Integer id)
		{ 
			SqlSession sqlSession = sqlSessionFactory.openSession();
		 Finance finance = sqlSession.selectOne("Finance.getByGLGroup",id);
		 sqlSession.close();
			return finance;             
			        
		}
	 
	 public void updateData(Finance finance)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Finance.updateData",params);
			sqlSession.close();
		}
	 /*subgroup Details*/
	 public List<Map<String, Object>> getGLGroup() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLGroup");
			return list;
		}
	 
	 public void saveGLSubgroupDetails(Finance finance) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Finance.saveGLSubgroupDetails", params);
			sqlSession.close();
		}
		
		public List<Map<String, Object>> getAllGLSubgroups()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllGLSubgroups");
		    return list;
		  }
		
		 public Finance getByGLSubGroup(Integer id)
			{ 
				
			 Finance finance = sqlSessionTemplate.selectOne("Finance.getByGLSubGroup",id);
				return finance;             
				        
			}
		 
		 public void updateGLSubData(Finance finance)   
			{
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", finance);   
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.update("Finance.updateGLSubData",params);
				sqlSession.close();
			}
		 
		 /*subgroup Details*/
		 public List<Map<String, Object>> getGLSubGroup() {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLSubGroup");
				return list;
			}
		 
		 public void saveGLAccountDetails(Finance finance) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", finance);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				Integer currentYear  =sqlSession.selectOne("Finance.getYearGL");
				Integer id  =sqlSession.selectOne("Finance.getCountGL");
				params.put("year",currentYear); 
				params.put("id",id);
				sqlSession.insert("Finance.saveGLAccountDetails", params);
				sqlSession.close();
			}
			
			public List<Map<String, Object>> getAllGLAccount()
			  {
			    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllGLAccount");
			    return list;
			  }
			
			 public Finance getByGLAccount(Integer id)
				{ 
					
				 Finance finance = sqlSessionTemplate.selectOne("Finance.getByGLAccount",id);
					return finance;             
					        
				}
			 
			 public void updateGLAccountData(Finance finance)   
				{
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("p", finance);   
					SqlSession sqlSession = sqlSessionFactory.openSession();
					sqlSession.update("Finance.updateGLAccountData",params);
					sqlSession.close();
				}
			 
	/* getting view page table data in accounts receivable list */
	 public Map<String, Object> getARDetailstabledatainview(String voucher_id)
	  {
	    List<Map<String, Object>> list =
	      this.sqlSessionTemplate.selectList("Finance.getARDetailstabledatainview", voucher_id);	    
	    Map<String, Object> map = new HashMap();
	    map.put("ardet", list);
	    
	    return map;
	  }
	 
	 /* updating JE */
	 public void updateJV(Finance finance)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Finance.updateJVHEAD",params);
			sqlSession.update("Finance.updateJVDET",params);
			sqlSession.close();
		}
	  
	 /* updating bills */
	 public void updateBills(Finance finance)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Finance.updateBills",params);
			sqlSession.update("Finance.updateBillsDET",params);
			sqlSession.close();
		} 
	 
	 
	 
	

		
		

		public Map<String, Object> getProjectWiseSpentReport(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getProjectWiseSpentReport",
					map);
			map.put("project", districts);
			return map;
		}
   
		public List<Map<String, Object>> getAllProjects() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllProjects");
			return list;
		}

	

		public List<Map<String, Object>> getVendorDetails() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getVendorDetails");
			return list;
		}

		public List<Map<String, Object>> getInvoiceDetails(Integer id) {

			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getInvoiceDetails", id);

			return list;
		}

		public List<Map<String, Object>> getWorkorderDetails(Integer id) {

			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getWorkorderDetails", id);

			return list;
		}

		public List<Map<String, Object>> getPurchaseorderDetails(Integer id) {

			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderDetails", id);

			return list;
		}

		public List<Map<String, Object>> getMouDetails(Integer id) {

			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMouDetails", id);

			return list;
		}

		public Map<String, Object> getInvoiceStatusReport(Finance finance) {
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getInvoiceCount", finance);
			List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getReportingCount", finance);
			List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getCFOCount", finance);
			List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getFinanceCount", finance);
			List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getPaymentCount", finance);
			List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getBookedCount", finance);
			List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getReleaseCount", finance);
			List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Finance.getHoldCount", finance);
			List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Finance.getReturnCount", finance);
			Map<String, Object> map = new HashMap();
			map.put("count", list1);
			map.put("report", list2);
			map.put("cfo", list3);
			map.put("finance", list4);
			map.put("payment", list5);
			map.put("booked", list6);
			map.put("release", list7);
			map.put("hold", list8);
			map.put("returned", list9);

			return map;
		}

		public Map<String, Object> getInvoiceTotalData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getInvoiceTotalData", finance);
			Map<String, Object> map = new HashMap();
			map.put("total", list);
			return map;

		}

		public Map<String, Object> getTotalBookedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalBookedData", finance);
			Map<String, Object> map = new HashMap();
			map.put("bookedinvoice", list);
			return map;

		}

		public Map<String, Object> getTotalReleasedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalReleasedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("release", list);
			return map;

		}

		public Map<String, Object> getTotalReportingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalReportingData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalreport", list);
			return map;

		}

		public Map<String, Object> getTotalHoldData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalHoldData", finance);
			Map<String, Object> map = new HashMap();
			map.put("hold", list);
			return map;

		}

		public Map<String, Object> getTotalPendingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalPendingData", finance);
			Map<String, Object> map = new HashMap();
			map.put("totalcfo", list);
			return map;

		}

		public Map<String, Object> getTotalFinance(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalFinance", finance);
			Map<String, Object> map = new HashMap();
			map.put("finance", list);
			return map;

		}

		public Map<String, Object> getTotalReturnedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalReturnedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("returned", list);
			return map;

		}

		public Map<String, Object> getTotalPaymentData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalPaymentData", finance);
			Map<String, Object> map = new HashMap();
			map.put("payment", list);
			return map;

		}
		
		/*WORKORDER*/
		
		public Map<String, Object> getWorkorderStatusReport(Finance finance) {
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getWorkorderCount", finance);
			List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getWorkorderReportingCount", finance);
			List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getWorkorderCFOCount", finance);
			List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getWorkorderCEOCount", finance);
			List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getWorkorderApprovedCount", finance);
			List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getWorkorderHoldCount", finance);
			List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getWorkorderReturnCount", finance);

			Map<String, Object> map = new HashMap();
			map.put("count1", list1);
			map.put("report1", list2);
			map.put("cfo1", list3);
			map.put("ceo1", list4);
			map.put("approved1", list5);
			map.put("hold1", list6);
			map.put("returned1", list7);
			

			return map;
		}
		
		public Map<String, Object> getWorkorderTotalData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getWorkorderTotalData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalworkorder1", list);
			return map;

		}
		
		public Map<String, Object> getTotalWorkorderReportingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalWorkorderReportingData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalreport1", list);
			return map;

		}
		
		public Map<String, Object> getTotalworkorderPendingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalworkorderPendingData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalcfo1", list);
			return map;

		}
		
		public Map<String, Object> getTotalWorkorderCEOData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalWorkorderCEOData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalceo1", list);
			return map;

		}
		public Map<String, Object> getTotalApprovedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalApprovedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalapproved1", list);
			return map;

		}
		public Map<String, Object> getTotalWorkorderHoldData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalWorkorderHoldData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalhold1", list);
			return map;

		}
		public Map<String, Object> getTotalWorkorderReturnedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalWorkorderReturnedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalreturned1", list);
			return map;

		}
		
	/*PURCHASEORDER*/
		
		public Map<String, Object> getPurchaseorderStatusReport(Finance finance) {
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.gePurchaseorderCount", finance);
			List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderReportingCount", finance);
			List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderCFOCount", finance);
			List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderCEOCount", finance);
			List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderApprovedCount", finance);
			List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderHoldCount", finance);
			List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderReturnCount", finance);

			Map<String, Object> map = new HashMap();
			map.put("count2", list1);
			map.put("report2", list2);
			map.put("cfo2", list3);
			map.put("ceo2", list4);
			map.put("approved2", list5);
			map.put("hold2", list6);
			map.put("returned2", list7);
			

			return map;
		}
		
		public Map<String, Object> getPurchaseorderTotalData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getPurchaseorderTotalData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalpurchaseorder2", list);
			return map;

		}
		
		public Map<String, Object> getTotalPurchaseorderReportingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalPurchaseorderReportingData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalreport2", list);
			return map;

		}
		
		public Map<String, Object> getTotalpurchaseorderPendingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalpurchaseorderPendingData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalcfo2", list);
			return map;

		}
		
		public Map<String, Object> getTotalPurchaseorderCEOData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalPurchaseorderCEOData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalceo2", list);
			return map;

		}
		public Map<String, Object> getTotalPurchaseApprovedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalPurchaseApprovedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalapproved2", list);
			return map;

		}
		public Map<String, Object> getTotalPurchaseorderHoldData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalPurchaseorderHoldData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalhold2", list);
			return map;

		}
		public Map<String, Object> getTotalPurchaseorderReturnedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalPurchaseorderReturnedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalreturned2", list);
			return map;

		}
		
		
	/*MOU*/
		
		public Map<String, Object> getMOUStatusReport(Finance finance) {
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMOUCount", finance);
			List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMOUReportingCount", finance);
			List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getMOUCFOCount", finance);
			List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getMOUCEOCount", finance);
			List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getMOUApprovedCount", finance);
			List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getMOUHoldCount", finance);
			List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getMOUReturnCount", finance);

			Map<String, Object> map = new HashMap();
			map.put("count3", list1);
			map.put("report3", list2);
			map.put("cfo3", list3);
			map.put("ceo3", list4);
			map.put("approved3", list5);
			map.put("hold3", list6);
			map.put("returned3", list7);
			

			return map;
		}
		
		public Map<String, Object> getMOUTotalData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMOUTotalData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalmou3", list);
			return map;

		}
		
		public Map<String, Object> getTotalMOUReportingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalMOUReportingData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalreport3", list);
			return map;

		}
		
		public Map<String, Object> getTotalMOUPendingData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalMOUPendingData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalcfo3", list);
			return map;

		}
		
		public Map<String, Object> getTotalMOUCEOData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalMOUCEOData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalceo3", list);
			return map;

		}
		public Map<String, Object> getTotalMOUApprovedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalMOUApprovedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalapproved3", list);
			return map;

		}
		public Map<String, Object> getTotalMOUHoldData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalMOUHoldData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalhold3", list);
			return map;

		}
		public Map<String, Object> getTotalMOUReturnedData(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTotalMOUReturnedData",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("totalreturned3", list);
			return map;

		}


	

		public Map<String, Object> getAssetReport(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAssetReport1",
					finance);
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getAssetReport2",
					finance);
			List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getAssetReport3",
					finance);
			List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getAssetReport4",
					finance);
			List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getAssetReport5",
					finance);
			List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getAssetReport6",
					finance);
			List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getAssetReport7",
					finance);
			List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getAssetReport8",
					finance);
			List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Finance.getAssetReport9",
					finance);
			List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Finance.getAssetReport10",
					finance);
			List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Finance.getAssetReport11",
					finance);

			Map<String, Object> map = new HashMap();
			map.put("asset", list);
			map.put("asset1", list1);
			map.put("asset2", list2);
			map.put("asset3", list3);
			map.put("asset4", list4);
			map.put("asset5", list5);
			map.put("asset6", list6);
			map.put("asset7", list7);
			map.put("asset8", list8);
			map.put("asset9", list9);
			map.put("asset10", list10);
			return map;
		}

		public Map<String, Object> getEquityReport(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getEquityReport1",
					finance);
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getEquityReport2",
					finance);
			List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getEquityReport3",
					finance);
			List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getEquityReport4",
					finance);
			List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getEquityReport5",
					finance);
			List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getEquityReport6",
					finance);

			Map<String, Object> map = new HashMap();
			map.put("equity", list);
			map.put("equity1", list1);
			map.put("equity2", list2);
			map.put("equity3", list3);
			map.put("equity4", list4);
			map.put("equity5", list5);

			return map;
		}

		public Map<String, Object> getGLAsset(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAsset", map);
			map.put("glasset", districts);
			return map;
		}

		public Map<String, Object> getGLAsset1(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAsset1", map);
			map.put("glasset1", districts);
			return map;
		}

		public Map<String, Object> getGLAsset2(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAsset2", map);
			map.put("glasset2", districts);
			return map;
		}
		public Map<String, Object> getGLAsset3(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAsset3", map);
			map.put("glasset3", districts);
			return map;
		}
		public Map<String, Object> getGLAsset4(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAsset4", map);
			map.put("glasset4", districts);
			return map;
		}
		public Map<String, Object> getGLAsset5(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAsset5", map);
			map.put("glasset5", districts);
			return map;
		}
		
		public Map<String, Object> getGLAsset6(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAsset6", map);
			map.put("glasset6", districts);
			return map;
		}
		public Map<String, Object> getGLEquity(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLEquity", map);
			map.put("equity", districts);
			return map;
		}
		public Map<String, Object> getGLEquity1(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLEquity1", map);
			map.put("equity1", districts);
			return map;
		}
		public Map<String, Object> getGLEquity2(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLEquity2", map);
			map.put("equity2", districts);
			return map;
		}
		public Map<String, Object> getGLEquity3(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLEquity3", map);
			map.put("equity3", districts);
			return map;
		}
		public Map<String, Object> getGLEquity4(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLEquity4", map);
			map.put("equity4", districts);
			return map;
		}
		public Map<String, Object> getGLEquity5(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLEquity5", map);
			map.put("equity5", districts);
			return map;
		}
		
		public Map<String, Object> getCashFlowReport(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport1",
					finance);
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport2",
					finance);
			List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport3",
					finance);
			List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport4",
					finance);
			List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport5",
					finance);
			List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport6",
					finance);
			List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport7",
					finance);
			List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport8",
					finance);
			List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport9",
					finance);
			List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport10",
					finance);
			List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport11",
					finance);
			List<Map<String, Object>> list11 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport12",
					finance);
			List<Map<String, Object>> list12 = this.sqlSessionTemplate.selectList("Finance.getCashFlowReport13",
					finance);
			Map<String, Object> map = new HashMap();
			map.put("cashflow", list);
			map.put("cashflow1", list1);
			map.put("cashflow2", list2);
			map.put("cashflow3", list3);
			map.put("cashflow4", list4);
			map.put("cashflow5", list5);
			map.put("cashflow6", list6);
			map.put("cashflow7", list7);
			map.put("cashflow8", list8);
			map.put("cashflow9", list9);
			map.put("cashflow10", list10);
			map.put("cashflow11", list11);
			map.put("cashflow12", list12);
			return map;
		}
		
		public Map<String, Object> getGLAssetDetails(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails", id);
			Map<String, Object> map = new HashMap();
			map.put("groupasset", list);
			return map;
		}
		
		public Map<String, Object> getGLAssetDetails1(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails1", id);
			Map<String, Object> map = new HashMap();
			map.put("groupasset1", list);
			return map;
		}
		
		public Map<String, Object> getGLAssetDetails2(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails2", id);
			Map<String, Object> map = new HashMap();
			map.put("groupasset2", list);
			return map;
		}
		
		public Map<String, Object> getGLAssetDetails3(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails3", id);
			Map<String, Object> map = new HashMap();
			map.put("groupasset3", list);
			return map;
		}
		
		public Map<String, Object> getGLAssetDetails4(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails4", id);
			Map<String, Object> map = new HashMap();
			map.put("groupasset4", list);
			return map;
		}
		
		public Map<String, Object> getGLAssetDetails5(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails5", id);
			Map<String, Object> map = new HashMap();
			map.put("groupasset5", list);
			return map;
		}
		
		public Map<String, Object> getGLAssetDetails6(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails6", id);
			Map<String, Object> map = new HashMap();
			map.put("groupasset6", list);
			return map;
		}
		
		public Map<String, Object> getGLEquityDetails(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails", id);
			Map<String, Object> map = new HashMap();
			map.put("groupequity", list);
			return map;
		}
		

		public Map<String, Object> getGLEquityDetails(Finance finance) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails", finance);
			Map<String, Object> map = new HashMap();
			map.put("equitygroup", list);
			return map;
		}
		
		public Map<String, Object> getGLEquityDetails1(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails1", id);
			Map<String, Object> map = new HashMap();
			map.put("groupequity1", list);
			return map;
		}
		
		public Map<String, Object> getGLEquityDetails2(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails2", id);
			Map<String, Object> map = new HashMap();
			map.put("groupequity2", list);
			return map;
		}
		
		public Map<String, Object> getGLEquityDetails3(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails3", id);
			Map<String, Object> map = new HashMap();
			map.put("groupequity3", list);
			return map;
		}
		
		public Map<String, Object> getGLEquityDetails4(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails4", id);
			Map<String, Object> map = new HashMap();
			map.put("groupequity4", list);
			return map;
		}
		
		public Map<String, Object> getGLEquityDetails5(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails5", id);
			Map<String, Object> map = new HashMap();
			map.put("groupequity5", list);
			return map;
		}
            
		/*VENDOR ACCOUNT BALANCE*/
		public List<Map<String, Object>> getFinancialYear() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getFinancialYear");
			return list;
		}    
		
		public List<Map<String, Object>> getVendorAccountBalance(Integer financial_year) {

			List<Map<String, Object>> list = sqlSessionTemplate.selectList("Finance.getVendorAccountBalance",
					financial_year);

			return list;
		}
		
		 /* BANK RECONCILIATION REPORT*/
		
		public List<Map<String, Object>> getAllBankAccounts() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllBankAccounts");
			return list;
		}
		
		public Map<String, Object> getBankDetails(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getBankDetails", map);
			map.put("bank", districts);
			return map;
		}

		public void updateBankDetails(Finance finance) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", finance);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Finance.updateBankDetails", params);
			sqlSession.close();
		}

		public Finance getByBankDetails(Integer id) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Finance finance = sqlSession.selectOne("Finance.getByBankDetails", id);

			return finance;

		}
		/*DISPLAY ACCOUNT BALANCE*/
		
		public List<Map<String, Object>> getAllDisplayGLAccount() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllDisplayGLAccount");
			return list;
		}

		
		public Map<String, Object> getDisplayAccountBalance(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getDisplayAccountBalance",
					map);
			map.put("balance", districts);
			return map;  
		}

		public Map<String, Object> getJournalEntryDetails(String voucher_number) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getHeaderDetails",
					voucher_number);
			List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getEntryDetails",
					voucher_number);

			Map<String, Object> map = new HashMap();
			map.put("entry", list);
			map.put("entrydata", list1);

			return map;
		}
		 
		 /*INVOICE VS PAYMENTS*/
		public List<Map<String, Object>> getAllOrders() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getAllOrders");
			return list;
		}
		
		public Map<String, Object> getInvoicevsPaymentsReport(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getInvoicevsPaymentsReport",
					map);
			map.put("invs", districts);
			return map;
		}

		
		 /*INCOME AND EXPENDITURE REPORT*/
		
		
		public Map<String, Object> getGLAccountDetails(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails", id);
			Map<String, Object> map = new HashMap();
			map.put("group", list);
			return map;
		}

		public Map<String, Object> getGLAccountDetails1(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails1", id);
			Map<String, Object> map = new HashMap();
			map.put("group1", list);
			return map;
		}

		public Map<String, Object> getGLAccountDetails2(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails2", id);
			Map<String, Object> map = new HashMap();
			map.put("group2", list);
			return map;
		}

		public Map<String, Object> getGLAccountDetails3(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails3", id);
			Map<String, Object> map = new HashMap();
			map.put("group3", list);
			return map;
		}

		public Map<String, Object> getGLAccountDetails4(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails4", id);
			Map<String, Object> map = new HashMap();
			map.put("group4", list);
			return map;
		}

		public Map<String, Object> getGLAccountDetails5(Integer id) {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails5", id);
			Map<String, Object> map = new HashMap();
			map.put("group5", list);
			return map;
		}

		
		
		/*COSTCENTER WISE REPORT*/
		public List<Map<String, Object>> getJournalVoucherDetails(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);

			List<Map<String, Object>> students = sqlSessionTemplate.selectList("Finance.getJournalVoucherDetails", map);
			return students;
		}
		
			public Map<String, Object> getCostCenterReport(Finance finance) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", finance);
			List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getCostCenterReport", map);
			map.put("dates", districts);
			return map;
		}

			/*TDS AND GST*/
		
			public Map<String, Object> getIGSTReport(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getIGSTReport", map);
				map.put("igst", districts);
				return map;
			}

			public Map<String, Object> getCGSTReport(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getCGSTReport", map);
				map.put("cgst", districts);
				return map;
			}

			public Map<String, Object> get194JReport(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.get194JReport", map);
				map.put("tds", districts);
				return map;
			}

			public List<Map<String, Object>> getTDSGLAccounts() {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTDSGLAccounts");
				return list;
			}

			/*TRAIL BALANCE*/
			
			public Map<String, Object> getTrailIncomeExpenditureReport(Finance finance) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailIncomeAccounts",
						finance);
				List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getTrailIncomeoneAccounts",
						finance);

				Map<String, Object> map = new HashMap();
				map.put("trailincome", list);
				map.put("trailincome1", list1);

				return map;
			}

			public Map<String, Object> getTrailGLAccountDetails(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAccountDetails", id);
				Map<String, Object> map = new HashMap();
				map.put("trailgroup", list);
				return map;
			}

			public Map<String, Object> getTrailGLAccountDetails1(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAccountDetails1", id);
				Map<String, Object> map = new HashMap();
				map.put("trailgroup1", list);
				return map;
			}

			public Map<String, Object> getTrailGLAccountDetails2(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAccountDetails2", id);
				Map<String, Object> map = new HashMap();
				map.put("trailgroup2", list);
				return map;
			}

			public Map<String, Object> getTrailGLAccountDetails3(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAccountDetails3", id);
				Map<String, Object> map = new HashMap();
				map.put("trailgroup3", list);
				return map;
			}

			public Map<String, Object> getTrailGLAccountDetails4(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAccountDetails4", id);
				Map<String, Object> map = new HashMap();
				map.put("trailgroup4", list);
				return map;
			}

			public Map<String, Object> getTrailGLAccountDetails5(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAccountDetails5", id);
				Map<String, Object> map = new HashMap();
				map.put("trailgroup5", list);
				return map;
			}

			public Map<String, Object> getTrailExpenditureReport(Finance finance) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailExpenditureAccounts",
						finance);
				List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getTrailExpenditureAccounts1",
						finance);
				List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getTrailExpenditureAccounts2",
						finance);

				Map<String, Object> map = new HashMap();
				map.put("trailexpenditure", list);
				map.put("trailexpenditure1", list1);
				map.put("trailexpenditure2", list2);

				return map;
			}

			
			public Map<String, Object> getTrailAssetReport(Finance finance) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport1",
						finance);
				List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport2",
						finance);
				List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport3",
						finance);
				List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport4",
						finance);
				List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport5",
						finance);
				List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport6",
						finance);
				List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport7",
						finance);
				List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport8",
						finance);
				List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport9",
						finance);
				List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport10",
						finance);
				List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Finance.getTrailAssetReport11",
						finance);

				Map<String, Object> map = new HashMap();
				map.put("trailasset", list);
				map.put("trailasset1", list1);
				map.put("trailasset2", list2);
				map.put("trailasset3", list3);
				map.put("trailasset4", list4);
				map.put("trailasset5", list5);
				map.put("trailasset6", list6);
				map.put("trailasset7", list7);
				map.put("trailasset8", list8);
				map.put("trailasset9", list9);
				map.put("trailasset10", list10);
				return map;
			}

			public Map<String, Object> getTrailEquityReport(Finance finance) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailEquityReport1",
						finance);
				List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getTrailEquityReport2",
						finance);
				List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getTrailEquityReport3",
						finance);
				List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getTrailEquityReport4",
						finance);
				List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getTrailEquityReport5",
						finance);
				List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getTrailEquityReport6",
						finance);

				Map<String, Object> map = new HashMap();
				map.put("equity", list);
				map.put("equity1", list1);
				map.put("equity2", list2);
				map.put("equity3", list3);
				map.put("equity4", list4);
				map.put("equity5", list5);

				return map;
			}


			public Map<String, Object> getTrailGLAccountNames(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAccountNames", map);
				map.put("trailgl", districts);
				return map;
			}

			public Map<String, Object> getTrailGLAccountTwoNames(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAccountTwoNames", map);
				map.put("trailgl1", districts);
				return map;
			}

			public Map<String, Object> getTrailGLExpAccountNames(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLExpAccountNames", map);
				map.put("trailglexp", districts);
				return map;
			}

			public Map<String, Object> getTrailGLExpAccountOneNames(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLExpAccountOneNames", map);
				map.put("trailglexp1", districts);
				return map;
			}

			public Map<String, Object> getTrailGLExpAccountTwoNames(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLExpAccountTwoNames", map);
				map.put("trailglexp2", districts);
				return map;
			}

			public Map<String, Object> getTrailGLAsset(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAsset", map);
				map.put("trailglasset", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLAsset1(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAsset1", map);
				map.put("trailglasset1", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLAsset2(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAsset2", map);
				map.put("trailglasset2", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLAsset3(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAsset3", map);
				map.put("trailglasset3", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLAsset4(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAsset4", map);
				map.put("trailglasset4", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLAsset5(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAsset5", map);
				map.put("trailglasset5", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLAsset6(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLAsset6", map);
				map.put("trailglasset6", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquity(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLEquity", map);
				map.put("trailequity", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquity1(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLEquity1", map);
				map.put("trailequity1", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquity2(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLEquity2", map);
				map.put("trailequity2", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquity3(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLEquity3", map);
				map.put("trailequity3", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquity4(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLEquity4", map);
				map.put("trailequity4", districts);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquity5(Finance finance) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", finance);
				List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getTrailGLEquity5", map);
				map.put("trailequity5", districts);
				return map;
			}
			public Map<String, Object> getTrailGLAssetDetails(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAssetDetails", id);
				Map<String, Object> map = new HashMap();
				map.put("trailassetgroup", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLAssetDetails1(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAssetDetails1", id);
				Map<String, Object> map = new HashMap();
				map.put("trailassetgroup1", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLAssetDetails2(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAssetDetails2", id);
				Map<String, Object> map = new HashMap();
				map.put("trailassetgroup2", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLAssetDetails3(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAssetDetails3", id);
				Map<String, Object> map = new HashMap();
				map.put("trailassetgroup3", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLAssetDetails4(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAssetDetails4", id);
				Map<String, Object> map = new HashMap();
				map.put("trailassetgroup4", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLAssetDetails5(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAssetDetails5", id);
				Map<String, Object> map = new HashMap();
				map.put("trailassetgroup5", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLAssetDetails6(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLAssetDetails6", id);
				Map<String, Object> map = new HashMap();
				map.put("trailassetgroup6", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquityDetails(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLEquityDetails", id);
				Map<String, Object> map = new HashMap();
				map.put("trailequitygroup", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquityDetails1(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLEquityDetails1", id);
				Map<String, Object> map = new HashMap();
				map.put("trailequitygroup1", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquityDetails2(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLEquityDetails2", id);
				Map<String, Object> map = new HashMap();
				map.put("trailequitygroup2", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquityDetails3(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLEquityDetails3", id);
				Map<String, Object> map = new HashMap();
				map.put("trailequitygroup3", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquityDetails4(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLEquityDetails4", id);
				Map<String, Object> map = new HashMap();
				map.put("trailequitygroup4", list);
				return map;
			}
			
			public Map<String, Object> getTrailGLEquityDetails5(Integer id) {
				List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getTrailGLEquityDetails5", id);
				Map<String, Object> map = new HashMap();
				map.put("trailequitygroup5", list);
				return map;
			}
		
			 public Finance getpaymentdetails(String voucher_number) {
					Finance list = this.sqlSessionTemplate.selectOne("Finance.getpaymentdetails", voucher_number);
					return list;
				}  
			 
			 
							
				public Map<String, Object> getMonthIncomeExpenditureReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthIncomeAccounts",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthIncomeoneAccounts",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthincome", list);
					map.put("monthincome1", list1);

					return map;
				}
				
				
				public Map<String, Object> getMonthExpenditureReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthExpenditureAccounts",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthExpenditureAccounts1",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMonthExpenditureAccounts2",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthexpenditure", list);
					map.put("monthexpenditure1", list1);
					map.put("monthexpenditure2", list2);

					return map;
				}
				
				    
				
				public List<Map<String, Object>> getCostCenter() {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getCostCenter");
					return list;
				}
				
				public Map<String, Object> getGLAssetDetails(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroup", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetails1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails1", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroup1", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetails2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails2", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroup2", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetails3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails3", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroup3", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetails4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails4", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroup4", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetails5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails5", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroup5", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetails6(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetails6", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroup6", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetails1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails1", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroup1", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetails2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails2", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroup2", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetails3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails3", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroup3", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetails4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails4", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroup4", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetails5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetails5", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroup5", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetailsPrevious(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetailsPrevious", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroupprevious", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetailsPrevious1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetailsPrevious1", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroupprevious1", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetailsPrevious2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetailsPrevious2", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroupprevious2", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetailsPrevious3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetailsPrevious3", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroupprevious3", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetailsPrevious4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetailsPrevious4", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroupprevious4", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetailsPrevious5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetailsPrevious5", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroupprevious5", list);
					return map;
				}
				
				public Map<String, Object> getGLAssetDetailsPrevious6(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAssetDetailsPrevious6", finance);
					Map<String, Object> map = new HashMap();
					map.put("assetgroupprevious6", list);
					return map;
				}
	
				public Map<String, Object> getGLEquityDetailsPrevious(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetailsPrevious", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroupprevious", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetailsPrevious1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetailsPrevious1", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroupprevious1", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetailsPrevious2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetailsPrevious2", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroupprevious2", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetailsPrevious3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetailsPrevious3", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroupprevious3", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetailsPrevious4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetailsPrevious4", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroupprevious4", list);
					return map;
				}
				
				public Map<String, Object> getGLEquityDetailsPrevious5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLEquityDetailsPrevious5", finance);
					Map<String, Object> map = new HashMap();
					map.put("equitygroupprevious5", list);
					return map;
				}
				
				
				
				 /*INCOME AND EXPENDITURE REPORT*/
				
				public Map<String, Object> getIncomeExpenditureReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getIncomeAccounts",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getIncomeoneAccounts",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("income", list);
					map.put("income1", list1);

					return map;
				}

				public Map<String, Object> getGLAccountDetails(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails", finance);
					Map<String, Object> map = new HashMap();
					map.put("group", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetails1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails1", finance);
					Map<String, Object> map = new HashMap();
					map.put("group1", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetails2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails2", finance);
					Map<String, Object> map = new HashMap();
					map.put("group2", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetails3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails3", finance);
					Map<String, Object> map = new HashMap();
					map.put("group3", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetails4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails4", finance);
					Map<String, Object> map = new HashMap();
					map.put("group4", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetails5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetails5", finance);
					Map<String, Object> map = new HashMap();
					map.put("group5", list);
					return map;
				}
				
				/*PREVIOUS*/
				
				public Map<String, Object> getGLAccountDetailsPrevious(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetailsPrevious", finance);
					Map<String, Object> map = new HashMap();
					map.put("groups", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetailsPrevious1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetailsPrevious1", finance);
					Map<String, Object> map = new HashMap();
					map.put("groups1", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetailsPrevious2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetailsPrevious2", finance);
					Map<String, Object> map = new HashMap();
					map.put("groups2", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetailsPrevious3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetailsPrevious3", finance);
					Map<String, Object> map = new HashMap();
					map.put("groups3", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetailsPrevious4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetailsPrevious4", finance);
					Map<String, Object> map = new HashMap();
					map.put("groups4", list);
					return map;
				}

				public Map<String, Object> getGLAccountDetailsPrevious5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getGLAccountDetailsPrevious5", finance);
					Map<String, Object> map = new HashMap();
					map.put("groups5", list);
					return map;
				}

				public Map<String, Object> getExpenditureReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getExpenditureAccounts",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getExpenditureAccounts1",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getExpenditureAccounts2",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("expenditure", list);
					map.put("expenditure1", list1);
					map.put("expenditure2", list2);

					return map;
				}

				public Map<String, Object> getDepreciationDetails(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getDepreciationDetails",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("depreciation", list);

					return map;
				}

				public Map<String, Object> getGLAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAccountNames", map);
					map.put("gl", districts);
					return map;
				}

				public Map<String, Object> getGLAccountTwoNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLAccountTwoNames", map);
					map.put("gl1", districts);
					return map;
				}

				public Map<String, Object> getGLExpAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLExpAccountNames", map);
					map.put("glexp", districts);
					return map;
				}

				public Map<String, Object> getGLExpAccountOneNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLExpAccountOneNames", map);
					map.put("glexp1", districts);
					return map;
				}

				public Map<String, Object> getGLExpAccountTwoNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getGLExpAccountTwoNames", map);
					map.put("glexp2", districts);
					return map;
				}

				public Map<String, Object> getDepreciationAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getDepreciationAccountNames",
							map);
					map.put("dep", districts);
					return map;
				}
				
				 /*MONTHLY INCOME AND EXPENDITURE REPORT*/
				
								
				public Map<String, Object> getMonthDepreciationDetails(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthDepreciationDetails",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthdepreciation", list);

					return map;
				}
				
				public Map<String, Object> getMonthGLAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAccountNames", map);
					map.put("monthgl", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAccountTwoNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAccountTwoNames", map);
					map.put("monthgl1", districts);
					return map;
				}

				public Map<String, Object> getMonthGLExpAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLExpAccountNames", map);
					map.put("monthglexp", districts);
					return map;
				}

				public Map<String, Object> getMonthGLExpAccountOneNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLExpAccountOneNames", map);
					map.put("monthglexp1", districts);
					return map;
				}

				public Map<String, Object> getMonthGLExpAccountTwoNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLExpAccountTwoNames", map);
					map.put("monthglexp2", districts);
					return map;
				}

				public Map<String, Object> getMonthDepreciationAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthDepreciationAccountNames",
							map);
					map.put("monthdep", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAccountDetails(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetails", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroup", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetails1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetails1", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroup1", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetails2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetails2", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroup2", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetails3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetails3", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroup3", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetails4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetails4", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroup4", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetails5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetails5", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroup5", list);
					return map;
				}
				
				/*PREVIOUS*/
				
				public Map<String, Object> getMonthGLAccountDetailsPrevious(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetailsPrevious", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroups", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetailsPrevious1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetailsPrevious1", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroups1", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetailsPrevious2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetailsPrevious2", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroups2", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetailsPrevious3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetailsPrevious3", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroups3", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetailsPrevious4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetailsPrevious4", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroups4", list);
					return map;
				}

				public Map<String, Object> getMonthGLAccountDetailsPrevious5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAccountDetailsPrevious5", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthgroups5", list);
					return map;
				}

				
				/*MONTHLY TRAIL BALANCE*/
				
				public Map<String, Object> getMonthTrailIncomeExpenditureReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthTrailIncomeAccounts",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailIncomeoneAccounts",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthtrailincome", list);
					map.put("monthtrailincome1", list1);

					return map;
				}

				public Map<String, Object> getMonthTrailExpenditureReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthTrailExpenditureAccounts",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailExpenditureAccounts1",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailExpenditureAccounts2",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthtrailexpenditure", list);
					map.put("monthtrailexpenditure1", list1);
					map.put("monthtrailexpenditure2", list2);

					return map;
				}

				
				public Map<String, Object> getMonthTrailAssetReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport1",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport2",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport3",
							finance);
					List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport4",
							finance);
					List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport5",
							finance);
					List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport6",
							finance);
					List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport7",
							finance);
					List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport8",
							finance);
					List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport9",
							finance);
					List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport10",
							finance);
					List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailAssetReport11",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthtrailasset", list);
					map.put("monthtrailasset1", list1);
					map.put("monthtrailasset2", list2);
					map.put("monthtrailasset3", list3);
					map.put("monthtrailasset4", list4);
					map.put("monthtrailasset5", list5);
					map.put("monthtrailasset6", list6);
					map.put("monthtrailasset7", list7);
					map.put("monthtrailasset8", list8);
					map.put("monthtrailasset9", list9);
					map.put("monthtrailasset10", list10);
					return map;
				}

				public Map<String, Object> getMonthTrailEquityReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthTrailEquityReport1",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailEquityReport2",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailEquityReport3",
							finance);
					List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailEquityReport4",
							finance);
					List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailEquityReport5",
							finance);
					List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getMonthTrailEquityReport6",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthtrailequity", list);
					map.put("monthtrailequity1", list1);
					map.put("monthtrailequity2", list2);
					map.put("monthtrailequity3", list3);
					map.put("monthtrailequity4", list4);
					map.put("monthtrailequity5", list5);

					return map;
				}


				public Map<String, Object> getMonthTrailGLAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAccountNames", map);
					map.put("monthtrailgl", districts);
					return map;
				}

				public Map<String, Object> getMonthTrailGLAccountTwoNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAccountTwoNames", map);
					map.put("monthtrailgl1", districts);
					return map;
				}

				public Map<String, Object> getMonthTrailGLExpAccountNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLExpAccountNames", map);
					map.put("monthtrailglexp", districts);
					return map;
				}

				public Map<String, Object> getMonthTrailGLExpAccountOneNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLExpAccountOneNames", map);
					map.put("monthtrailglexp1", districts);
					return map;
				}

				public Map<String, Object> getMonthTrailGLExpAccountTwoNames(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLExpAccountTwoNames", map);
					map.put("monthtrailglexp2", districts);
					return map;
				}

				public Map<String, Object> getMonthTrailGLAsset(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAsset", map);
					map.put("monthtrailglasset", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLAsset1(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAsset1", map);
					map.put("monthtrailglasset1", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLAsset2(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAsset2", map);
					map.put("monthtrailglasset2", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLAsset3(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAsset3", map);
					map.put("monthtrailglasset3", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLAsset4(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAsset4", map);
					map.put("monthtrailglasset4", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLAsset5(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAsset5", map);
					map.put("monthtrailglasset5", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLAsset6(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLAsset6", map);
					map.put("monthtrailglasset6", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLEquity(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLEquity", map);
					map.put("monthtrailequity", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLEquity1(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLEquity1", map);
					map.put("monthtrailequity1", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLEquity2(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLEquity2", map);
					map.put("monthtrailequity2", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLEquity3(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLEquity3", map);
					map.put("monthtrailequity3", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLEquity4(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLEquity4", map);
					map.put("monthtrailequity4", districts);
					return map;
				}
				
				public Map<String, Object> getMonthTrailGLEquity5(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthTrailGLEquity5", map);
					map.put("monthtrailequity5", districts);
					return map;
				}
				
				
				
				/*MONTHLY BALANCE SHEET REPORT*/
				
				public Map<String, Object> getMonthAssetReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport1",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport2",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport3",
							finance);
					List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport4",
							finance);
					List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport5",
							finance);
					List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport6",
							finance);
					List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport7",
							finance);
					List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport8",
							finance);
					List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport9",
							finance);
					List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport10",
							finance);
					List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Finance.getMonthAssetReport11",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthasset", list);
					map.put("monthasset1", list1);
					map.put("monthasset2", list2);
					map.put("monthasset3", list3);
					map.put("monthasset4", list4);
					map.put("monthasset5", list5);
					map.put("monthasset6", list6);
					map.put("monthasset7", list7);
					map.put("monthasset8", list8);
					map.put("monthasset9", list9);
					map.put("monthasset10", list10);
					return map;
				}

				public Map<String, Object> getMonthEquityReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthEquityReport1",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthEquityReport2",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMonthEquityReport3",
							finance);
					List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getMonthEquityReport4",
							finance);
					List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getMonthEquityReport5",
							finance);
					List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getMonthEquityReport6",
							finance);

					Map<String, Object> map = new HashMap();
					map.put("monthequity", list);
					map.put("monthequity1", list1);
					map.put("monthequity2", list2);
					map.put("monthequity3", list3);
					map.put("monthequity4", list4);
					map.put("monthequity5", list5);

					return map;
				}

				
				public Map<String, Object> getMonthGLAsset(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAsset", map);
					map.put("monthglasset", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAsset1(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAsset1", map);
					map.put("monthglasset1", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAsset2(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAsset2", map);
					map.put("monthglasset2", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAsset3(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAsset3", map);
					map.put("monthglasset3", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAsset4(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAsset4", map);
					map.put("monthglasset4", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAsset5(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAsset5", map);
					map.put("monthglasset5", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLAsset6(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLAsset6", map);
					map.put("monthglasset6", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquity(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLEquity", map);
					map.put("monthglequity", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquity1(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLEquity1", map);
					map.put("monthglequity1", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquity2(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLEquity2", map);
					map.put("monthglequity2", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquity3(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLEquity3", map);
					map.put("monthglequity3", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquity4(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLEquity4", map);
					map.put("monthglequity4", districts);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquity5(Finance finance) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", finance);
					List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Finance.getMonthGLEquity5", map);
					map.put("monthglequity5", districts);
					return map;
				}
				public Map<String, Object> getMonthGLAssetDetails(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetails", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroup", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetails1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetails1", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroup1", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetails2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetails2", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroup2", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetails3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetails3", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroup3", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetails4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetails4", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroup4", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetails5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetails5", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroup5", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetails6(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetails6", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroup6", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetails(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetails", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroup", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetails1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetails1", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroup1", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetails2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetails2", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroup2", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetails3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetails3", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroup3", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetails4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetails4", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroup4", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetails5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetails5", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroup5", list);
					return map;
				}
				
				
				/*PREVIOUS*/
				
				public Map<String, Object> getMonthGLAssetDetailsPrevious(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetailsPrevious", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroupprevious", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetailsPrevious1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetailsPrevious1", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroupprevious1", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetailsPrevious2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetailsPrevious2", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroupprevious2", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetailsPrevious3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetailsPrevious3", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroupprevious3", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetailsPrevious4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetailsPrevious4", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroupprevious4", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetailsPrevious5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetailsPrevious5", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroupprevious5", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLAssetDetailsPrevious6(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLAssetDetailsPrevious6", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthassetgroupprevious6", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetailsPrevious(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetailsPrevious", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroupprevious", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetailsPrevious1(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetailsPrevious1", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroupprevious1", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetailsPrevious2(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetailsPrevious2", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroupprevious2", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetailsPrevious3(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetailsPrevious3", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroupprevious3", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetailsPrevious4(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetailsPrevious4", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroupprevious4", list);
					return map;
				}
				
				public Map<String, Object> getMonthGLEquityDetailsPrevious5(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthGLEquityDetailsPrevious5", finance);
					Map<String, Object> map = new HashMap();
					map.put("monthequitygroupprevious5", list);
					return map;
				}
				
				 /*MONTHLY CASH FLOW STATEMENT*/
				
				public Map<String, Object> getMonthCashFlowReport(Finance finance) {
					List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport1",
							finance);
					List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport2",
							finance);
					List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport3",
							finance);
					List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport4",
							finance);
					List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport5",
							finance);
					List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport6",
							finance);
					List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport7",
							finance);
					List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport8",
							finance);
					List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport9",
							finance);
					List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport10",
							finance);
					List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport11",
							finance);
					List<Map<String, Object>> list11 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport12",
							finance);
					List<Map<String, Object>> list12 = this.sqlSessionTemplate.selectList("Finance.getMonthCashFlowReport13",
							finance);
					Map<String, Object> map = new HashMap();
					map.put("monthcashflow", list);
					map.put("monthcashflow1", list1);
					map.put("monthcashflow2", list2);
					map.put("monthcashflow3", list3);
					map.put("monthcashflow4", list4);
					map.put("monthcashflow5", list5);
					map.put("monthcashflow6", list6);
					map.put("monthcashflow7", list7);
					map.put("monthcashflow8", list8);
					map.put("monthcashflow9", list9);
					map.put("monthcashflow10", list10);
					map.put("monthcashflow11", list11);
					map.put("monthcashflow12", list12);
					return map;
				}
				

}
