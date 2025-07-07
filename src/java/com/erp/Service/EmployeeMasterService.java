package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.EmployeeMasterDAO;

import com.erp.Model.EmployeeMaster;


@Service
public class EmployeeMasterService {

	
	Response response = new Response();

	@Autowired
	private EmployeeMasterDAO employeeDao;
	
	
	public Response getemployeemaster(EmployeeMaster employee)
	{
	response.setSuccessful(false);
	List<Map<String, Object>> list = employeeDao.getemployeemaster(employee);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
	}
	
	public Response getNameWiseData(EmployeeMaster table) {
		response.setSuccessful(false);
		List<EmployeeMaster> nameWiseData = employeeDao.getNameWiseData(table);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}  
	
	public Response search(EmployeeMaster employee) {
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.search(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
/* update data based on empid in employee master */
	
	public Response getById(String empid)
	{
		response.setSuccessful(false);
		EmployeeMaster singleuserdetails = employeeDao.getById(empid);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
public Response updateData(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		employeeDao.updateData(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	
	public Response getsearch(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getsearch(employee);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getCaders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getCaders();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getGrades()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getGrades();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getDepartment()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getDepartment();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getDesignation()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getDesignation();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* create hiring request add method */
	
	public Response add(EmployeeMaster employee) {
		response.setSuccessful(false);
		employeeDao.add(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	/* candidate registration add1 method */
	
	/*
	 * public Response add1(EmployeeMaster employee) {
	 * response.setSuccessful(false); employeeDao.add1(employee);
	 * response.setSuccessful(true); response.setResponseObject(employee); return
	 * response; }
	 */
	
	public Response add1(EmployeeMaster employee) {
		response.setSuccessful(false);
		employeeDao.add1(employee);  
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	/* Getting details in table for hiring request */
	
	public Response hiringRequest()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.hiringRequest();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* Education and branch in candidate registration */
	
	public Response getEducations()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getEducations();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	  
	public Response getBranches(Integer education_id)
	{
		response.setSuccessful(false);
		List<EmployeeMaster> branches = employeeDao.getBranches(education_id);
		response.setSuccessful(true);
		response.setResponseObject(branches);
		return response;
	}
	
	/* getting details to front end in Select candidate */
	
	public Response getCandidates()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getCandidates();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* getting data in table for others in payslip */
	
	public Response getdetails(EmployeeMaster employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = employeeDao.getdetails(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	}
	
	/* Getting employee type for attendance sheet */
	
	public Response getStaff()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getStaff();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/* Search bar in Hiring request */
	
	/*
	 * public Response getHiringsearch(EmployeeMaster employee) {
	 * response.setSuccessful(false); List<Map<String, Object>> list =
	 * employeeDao.getHiringsearch(employee); response.setSuccessful(true);
	 * response.setResponseObject(list); return response; }
	 */
	
/* Getting data in My Timesheet page */
	
	public Response getdata(EmployeeMaster employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = employeeDao.getdata(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
/* Getting data based on empid in my timesheet view and edit button */
		
	public Response getByIddata(EmployeeMaster mytimesheet)
	{
		response.setSuccessful(false);
		EmployeeMaster  singleuserdetails = employeeDao.getByIddata(mytimesheet);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	
/* Removing data based on task in my timesheet page */
	
	public Response remove(String task)
	{
		response.setSuccessful(false);
		employeeDao.remove(task);
		response.setSuccessful(true);
		response.setResponseObject(task);
		return response;
	}
	
	/* Updating data based on task in my timesheet page */
	
	public Response updatedata(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		employeeDao.updatedata(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	/* Getting Details to popup in attendance sheet page */
	
	public Response getstatus(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		EmployeeMaster singleuserdetails = employeeDao.getstatus(employee);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	public Response getstatusab(EmployeeMaster employee)
	{
		response.setSuccessful(false);
		EmployeeMaster singleuserdetails = employeeDao.getstatusab(employee);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	
	
	 /* getting report in attendance report page */
	public Response getAllname()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getAllname();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
		public Response getAll1()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll1();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		public Response getAll2()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll2();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		
		public Response getAll3()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll3();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response getAll4()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll4();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		
		public Response getAll5()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll5();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		public Response getAll6()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll6();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response getAll7()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll7();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		
		
		public Response getAll8()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll8();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		
		
		public Response getAll9()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getAll9();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		
		
		public Response getempid()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getempid();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response updateData12(EmployeeMaster employeemaster)
		{
			response.setSuccessful(false);
			
			employeeDao.updateData12(employeemaster);
			
			response.setSuccessful(true);
			
			response.setResponseObject(employeemaster);
			

			return response;
		}
		
		public Response gethr()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.gethr();
			response.setSuccessful(true);   
			response.setResponseObject(list);
			return response;
		}
		
		public Response Approveall(String empdata) throws JSONException
		{
		response.setSuccessful(false);
		Integer status = employeeDao.Approveall(empdata);
		if(status != 0){  
		response.setSuccessful(true);
		}else{
		response.setSuccessful(false);  
		}
		return response;



		}
   
		
		public Response getctccalculator()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getctccalculator();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response GetDataByID(EmployeeMaster employeemaster)
		{


		this.response.setSuccessful(false);
		EmployeeMaster singleuserdetails =this.employeeDao.GetDataByID(employeemaster);
		this.response.setSuccessful(true);
		this.response.setResponseObject(singleuserdetails);
		return this.response;
		}
		
		/* abcjsdghsdhsdgjdfjfg */
		
		/*create apply leave*/
		public Response addleave(EmployeeMaster employee) {
			response.setSuccessful(false);
			 employeeDao.addleave(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}
		
		/*Getting leavetype*/
		public Response getLeavetype()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getLeavetype();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		/*create apply flexi leave*/
		public Response addFlexi(EmployeeMaster employee) {
			response.setSuccessful(false);
			 employeeDao.addFlexi(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}
		/*create apply Comp leave*/
		public Response addComp(EmployeeMaster employee) {
			response.setSuccessful(false);
			 employeeDao.addComp(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}      
		/*Getting reporing*/    
		
		public Response getReporting(String empid)
		  {
		    this.response.setSuccessful(false);
		    EmployeeMaster singleuserdetails = this.employeeDao.getReporting(empid);
		    this.response.setSuccessful(true);
		    this.response.setResponseObject(singleuserdetails);
		    return this.response;
		  }
		
		/*Getting leave balance and total leaves*/
		 public Response getTotalleaves(EmployeeMaster employee)
		  {
		    this.response.setSuccessful(false);
		    EmployeeMaster singleuserdetails = this.employeeDao.getTotalleaves(employee);
		    this.response.setSuccessful(true);
		    this.response.setResponseObject(singleuserdetails);
		    return this.response;
		  }    
		 
		 /*Getting FlexiHolidays*/
			public Response getFlexiHolidays()      
			{
				response.setSuccessful(false);
				List<Map<String, Object>> list = employeeDao.getFlexiHolidays();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			 /*Getting FlexiCount*/
			public Response getFlexiCount(String empid)
			{
				response.setSuccessful(false);
				
				List<Map<String, Object>> list = employeeDao.getFlexiCount(empid);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			
			
	

}
