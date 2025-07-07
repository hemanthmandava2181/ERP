package com.erp.Service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;

import com.erp.DAO.CtcDAO;

import com.erp.Model.Ctc;
import com.erp.Model.LeaveStatus;
import com.erp.Model.LeavesReport;
import com.erp.Model.ReportsEmployee;
import com.erp.Model.Selfservices;


@Service
public class CtcService {
	@Autowired
	private CtcDAO ctcDAO;

	Response response = new Response();
	
	
	/* public Response getDetails(String payname)
	  {
	    this.response.setSuccessful(false);
	    Ctc singleuserdetails = this.ctcDAO.getDetails(payname);
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	*/
	public Response add1(Ctc ctcModel) {
		response.setSuccessful(false);
		ctcDAO.add1(ctcModel);
		response.setSuccessful(true);
		response.setResponseObject(ctcModel);
		return response;
	}
	
	public Response add(Ctc ctcModel) {
		response.setSuccessful(false);
		ctcDAO.add(ctcModel);
		response.setSuccessful(true);
		response.setResponseObject(ctcModel);
		return response;
	}
	public Response getById(String pname)
	{
		response.setSuccessful(false);
		Ctc singleuserdetails = ctcDAO.getById(pname);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAll() {
		response.setSuccessful(false);
		List<Ctc> userdetails = ctcDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response getEarnings() {
		response.setSuccessful(false);
		List<Ctc> userdetails = ctcDAO.getEarnings();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	
	public Response getDeductions() {
		response.setSuccessful(false);
		List<Ctc> regdetails = ctcDAO.getDeductions();
		response.setSuccessful(true);
		response.setResponseObject(regdetails);
		return response;
	}

	
	
	public Response remove(String pname)   
	{
		response.setSuccessful(false);
		ctcDAO.remove(pname);
		response.setSuccessful(true);
		response.setResponseObject(pname);
		return response;
	}

	/* getting all employees in modify ctc */
	public Response getallemployees() {
		response.setSuccessful(false);
		List<Ctc> userdetails = ctcDAO.getallemployees();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	/* Getting employees based on given data modify ctc */	
	public Response getemployeedata(Ctc ctcModel) {
		  response.setSuccessful(false);
		  Map<String, Object> data = ctcDAO.getemployeedata(ctcModel);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	}
	
	/* Getting details in profileupdateadmin page based on empid */	
	public Response getDetails(String empid)
	  {
	    this.response.setSuccessful(false);
	    Ctc singleuserdetails = this.ctcDAO.getDetails(empid);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* Updating employee data based on empid in profileupdateadmin page */
	
	/*
	 * public Response adddata(Ctc ctcModel) { response.setSuccessful(false);
	 * ctcDAO.adddata(ctcModel); response.setSuccessful(true);
	 * System.out.println("update service"); response.setResponseObject(ctcModel);
	 * return response; }
	 */
	
	/* Getting employees */
	
	public Response getemployees(String ctc_calculator)
	{
		response.setSuccessful(false);
		List<Ctc> empids = ctcDAO.getemployees(ctc_calculator);
		response.setSuccessful(true);
		response.setResponseObject(empids);
		return response;
	}
	
	public Response updateData(Ctc ctc)
	{
		response.setSuccessful(false);
		ctcDAO.updateData(ctc);
		response.setSuccessful(true);
		response.setResponseObject(ctc);
		return response;
	}
	
	/* updating employee profile details by admin in modify ctc page */
	
	public Response adminupdate(Ctc ctc) {
		response.setSuccessful(false);
		ctcDAO.adminupdate(ctc);
		response.setSuccessful(true);
		System.out.println("hi1");    
		response.setResponseObject(ctc);
		return response;
	}
	
	/* Getting details in revise ctc page based on empid */
	public Response getctcDetails(String empid)
	  {
	    this.response.setSuccessful(false);
	    Ctc singleuserdetails = this.ctcDAO.getctcDetails(empid);   
	    this.response.setSuccessful(true);
	    this.response.setResponseObject(singleuserdetails);
	    return this.response;
	  }
	
	/* updating ctc in revise ctc in modify ctc page */	
	public Response applyctcrevision(Ctc ctc) {
		response.setSuccessful(false);
		ctcDAO.applyctcrevision(ctc);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(ctc);
		return response;
	}
	
	/*stop salary*/
		public Response getsalsummary(Ctc report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = ctcDAO.getsalsummary(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		
		}
		
		public Response releasestopsalaryamount(Ctc report)
		{
			response.setSuccessful(false);
			Ctc   singleuserdetails = ctcDAO.releasestopsalaryamount(report);
			response.setResponseObject(singleuserdetails);
			response.setSuccessful(true);    
			return response;
		}  
		
		
		
		public Response releaseStopSalaryDate(Ctc report)
		{
			response.setSuccessful(false);
			Ctc   singleuserdetails = ctcDAO.releaseStopSalaryDate(report);
			response.setResponseObject(singleuserdetails);
			response.setSuccessful(true);    
			return response;
		}  
		
		public Response getStopData(Ctc report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = ctcDAO.getStopData(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		
		}
		
		
		
		public Response releasestopdate(Ctc report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = ctcDAO.releasestopdate(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		
		}
		public Response releasestopsalary(Ctc report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = ctcDAO.releasestopsalary(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		
		}
		
		public Response releasestopsalarypayroll(Ctc report)
		{
			response.setSuccessful(false);
			ctcDAO.releasestopsalarypayroll(report);
			
			response.setSuccessful(true);
		
			response.setSuccessful(false);
			
			return response;
		}
		
		
		
		
		
	
		public Response addsalsummary(Ctc ctcModel) {
			response.setSuccessful(false);
			ctcDAO.addsalsummary(ctcModel);
			response.setSuccessful(true);
			response.setResponseObject(ctcModel);
			return response;
		}
		
		
		
		public Response addstopsalaryData(Ctc ctcModel) {
			response.setSuccessful(false);
			ctcDAO.addstopsalaryData(ctcModel);
			response.setSuccessful(true);
			response.setResponseObject(ctcModel);
			return response;
		}
		

		public Response releaseEmployeestopsalaryDate(Ctc ctcModel) {
			response.setSuccessful(false);
			ctcDAO.releaseEmployeestopsalaryDate(ctcModel);
			response.setSuccessful(true);
			response.setResponseObject(ctcModel);
			return response;
		}
		
		
		public Response addd(Ctc ctcModel) {
			response.setSuccessful(false);
			Integer Status = ctcDAO.addd(ctcModel);
			if(Status!=0) {
				response.setSuccessful(true);
			}
			else {
				response.setSuccessful(false);
			}
			
			return response;
		}         
		
		/*updating CTC Calculator*/
		public Response updateCTC(Ctc employee)
		{
			response.setSuccessful(false);
			ctcDAO.updateCTC(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}
		
		
		public Response viewdetalisdata(String empid)
		{
			response.setSuccessful(false);
			  Ctc singleuserdetails = ctcDAO.viewdetalisdata(empid);
			response.setSuccessful(true);
			response.setResponseObject(singleuserdetails);
			return response;
		}
		
		  public Response getViewpayslipdeduction(Ctc employee) {
			  response.setSuccessful(false);
			  Map<String, Object> data = ctcDAO.getViewpayslipdeduction(employee);
			  response.setResponseObject(data);
			  response.setSuccessful(true);
			  return response;
			  }
		  
		  public Response getViewpayslipearings( Ctc employee) {
			  response.setSuccessful(false);
			  Map<String, Object> data = ctcDAO.getViewpayslipearings(employee);
			  response.setResponseObject(data);
			  response.setSuccessful(true);
			  return response;
			  }
		  
		  public Response saveIncometaxDetails(List<Ctc> employee, String ipAddress, List<String> pathsList)
		  {
		    this.response.setSuccessful(false);
		    Map<String, Object> list=this.ctcDAO.saveIncometaxDetails(employee, ipAddress);
		    
		    Ctc filePathsMail = new Ctc();
		    
		    filePathsMail.setPaths(pathsList);
		    
		   // mailSend(filePathsMail);
		    
		    this.response.setSuccessful(true);
		    response.setResponseObject(list);
		    
		    return this.response;
		  }
		
		
		
}