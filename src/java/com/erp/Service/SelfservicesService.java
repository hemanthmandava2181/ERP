
package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.SelfservicesDAO;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.Sdeigroup;
import com.erp.Model.Selfservices;



@Service
public class SelfservicesService {
	
	Response response = new Response();

	@Autowired
	private SelfservicesDAO selfservicesDAO;
	
	public Response getCategories()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getCategories();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getAssigns()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getAssigns();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getStatuss()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getStatuss();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getReqtypes(Integer request_categoryid)
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getReqtypes(request_categoryid);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	 
	 
	
	public Response addonduty(Selfservices selfservicesModel) {
		response.setSuccessful(false);
		selfservicesDAO.addonduty(selfservicesModel);
		response.setSuccessful(true);
		
		response.setResponseObject(selfservicesModel);
		return response;
	}
	
	public Response getAllduty()       
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getAllduty();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	/*
	 * public Response getById(String location) { response.setSuccessful(false);
	 * Selfservices singleuserdetails = selfservicesDAO.getById(location);
	 * response.setSuccessful(true); response.setResponseObject(singleuserdetails);
	 * return response; }
	 */
	public Response getById1(String location)
	{
		response.setSuccessful(false);
		Selfservices singleuserdetails = selfservicesDAO.getById1(location);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	
	public Response remove(String location)
	{
		response.setSuccessful(false);
		selfservicesDAO.remove(location);
		response.setSuccessful(true);
		response.setResponseObject(location);
		return response;
	}

	
	public Response updateData(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateData(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}
	public Response updateDataCancel(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateDataCancel(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}     
	
	public Response getProjects()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getProjects();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	/*Getting reporing*/
	public Response getReportings()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getReportings();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getReporting(String empid)
	  {
	    this.response.setSuccessful(false);
	    Selfservices singleuserdetails = this.selfservicesDAO.getReporting(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }

	/*Getting reporing*/
	
	public Response getReportings(String empid)
	  {
	    this.response.setSuccessful(false);
	    Selfservices singleuserdetails = this.selfservicesDAO.getReportings(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
 
	
	
	
	/*	on travel request*/
	public Response addontravel(Selfservices selfservicesModel) {
		response.setSuccessful(false);
		selfservicesDAO.addontravel(selfservicesModel);
		response.setSuccessful(true);
		
		response.setResponseObject(selfservicesModel);
		return response;
	}
	    
	public Response getAlltravel()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getAlltravel();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	/*
	 * public Response getById2(String location) { response.setSuccessful(false);
	 * Selfservices singleuserdetails = selfservicesDAO.getById2(location);
	 * response.setSuccessful(true); response.setResponseObject(singleuserdetails);
	 * return response; }
	 */
	public Response remove2(String location)
	{
		response.setSuccessful(false);
		selfservicesDAO.remove2(location);
		response.setSuccessful(true);
		response.setResponseObject(location);
		return response;
	}

	
	public Response updateData2(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateData2(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}
	public Response updateData2Cancel(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateData2Cancel(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}
	      
	
	
	

	/*on helpdesk request*/
	public Response addhelpdesk(Selfservices selfservicesModel) {
		response.setSuccessful(false);
		selfservicesDAO.addhelpdesk(selfservicesModel);
		response.setSuccessful(true);
		
		response.setResponseObject(selfservicesModel);
		return response;
	}
	
	public Response getAllhelpdesk()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getAllhelpdesk();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getAllclosedhelpdesk()
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getAllclosedhelpdesk();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getById3(String request_id)
	{
		response.setSuccessful(false);
		Selfservices singleuserdetails = selfservicesDAO.getById3(request_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	
	public Response getByIdview(String request_id)
	{
		response.setSuccessful(false);
		Selfservices singleuserdetails = selfservicesDAO.getByIdview(request_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response remove3(String request_id)
	{
		response.setSuccessful(false);
		selfservicesDAO.remove3(request_id);
		response.setSuccessful(true);
		response.setResponseObject(request_id);
		return response;
	}

	
	public Response updateData3(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateData3(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}
	        
	public Response updateDataAssign(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateDataAssign(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}
	   
	public Response updateDataEmpcomm(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateDataEmpcomm(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}
	public Response updateDatahrcomm(Selfservices selfservicesModel)
	{
		response.setSuccessful(false);
		selfservicesDAO.updateDatahrcomm(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}   
	   
	public Response getname(String empid)
	{
		response.setSuccessful(false);
		Selfservices singleuserdetails = selfservicesDAO.getname(empid);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	
	
	public Response exitemployee(Selfservices selfservicesModel) {
		response.setSuccessful(false);
		selfservicesDAO.exitemployee(selfservicesModel);
		response.setSuccessful(true);
		
		response.setResponseObject(selfservicesModel);
		return response;
	}
	
	   
	
	public Response getEmployeeDirectory()                       
	{
		response.setSuccessful(false);
		List<Selfservices> list = selfservicesDAO.getEmployeeDirectory();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response addexitemployee(Selfservices selfservicesModel) {
		response.setSuccessful(false);
		selfservicesDAO.addexitemployee(selfservicesModel);
		response.setSuccessful(true);
		response.setResponseObject(selfservicesModel);
		return response;
	}
	public Response getNoticePeriod(String empid)
	  {
	    this.response.setSuccessful(false);
	    Selfservices singleuserdetails = this.selfservicesDAO.getNoticePeriod(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	public Response getallexitemployee(String empid)
	  {
	    this.response.setSuccessful(false);
	    Selfservices singleuserdetails = this.selfservicesDAO.getallexitemployee(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	public Response getallprojectemployee(String empid)
	  {
	    this.response.setSuccessful(false);
	    Selfservices singleuserdetails = this.selfservicesDAO.getallprojectemployee(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	/*public Response getexitreportemployees(String empid)
	  {
	    this.response.setSuccessful(false);
	    Selfservices singleuserdetails = this.selfservicesDAO.getexitreportemployees(empid);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }*/
	public Response  getByIdemployeeexit(String empid)
	{
		response.setSuccessful(false);
		List<Selfservices>	singleuserdetails = selfservicesDAO. getByIdemployeeexit(empid);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getexitreportemployees() {
		response.setSuccessful(false);
		List<Selfservices> userdetails = selfservicesDAO.getexitreportemployees();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getHelpDeskTrackerDetails() {
		response.setSuccessful(false);
		List<Selfservices> userdetails = selfservicesDAO.getHelpDeskTrackerDetails();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getById2(Selfservices travel)
	{
		response.setSuccessful(false);
		Selfservices  singleuserdetails =  selfservicesDAO.getById2(travel);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
public Response getById(Selfservices duty)
		{
			response.setSuccessful(false);
			Selfservices  singleuserdetails =  selfservicesDAO.getById(duty);
			response.setSuccessful(true);
			response.setResponseObject(singleuserdetails);   
			return response;
		}
	
public Response getByIdviews(Selfservices duty)
{
	response.setSuccessful(false);
	Selfservices  singleuserdetails =  selfservicesDAO.getByIdviews(duty);
	response.setSuccessful(true);
	response.setResponseObject(singleuserdetails);   
	return response;
}
	
	
}
