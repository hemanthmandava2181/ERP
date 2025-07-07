package com.erp.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;
import java.util.UUID;

import org.json.JSONException;
import org.postgresql.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.EmployeeMaster;
import com.erp.Service.EmployeeMasterService;

@RestController
@RequestMapping("/Employee")
public class EmployeeMasterController {
	@Autowired  
	EmployeeMasterService employeeService;
	String file=null;
	@ResponseBody              
	@RequestMapping(value = "getNameWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNameWiseData(@RequestBody EmployeeMaster table)
	{
			return employeeService.getNameWiseData(table);
	}
	
	@ResponseBody
	@RequestMapping(value = "search", method = { RequestMethod.POST })
	public Response search(@RequestBody EmployeeMaster employee)
	{
		return employeeService.search(employee);
		       
	}
	/* Getting data in table in employee master */
	@ResponseBody
	@RequestMapping(value = "getemployeemaster", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getemployeemaster(@RequestBody EmployeeMaster Data)
	{
	return employeeService.getemployeemaster(Data);
	}
	

	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return employeeService.getAll();
	}
	
/* updating data based on empid in employee master */
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String empid)
	{
		return employeeService.getById(empid);
	}
@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody EmployeeMaster employee)
	{
		return employeeService.updateData(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "getsearch", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getsearch(@RequestBody EmployeeMaster Data)
	{
		return employeeService.getsearch(Data);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getCaders", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return employeeService.getCaders();
	}
	

	@ResponseBody
	@RequestMapping(value = "getGrades", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrades()
	{
		return employeeService.getGrades();
	}
	   
	@ResponseBody
	@RequestMapping(value = "getDepartment", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDepartment()
	{
		return employeeService.getDepartment();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDesignation", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDesignation()
	{
		return employeeService.getDesignation();
	}
	
	/* create hiring request add method */
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody EmployeeMaster employee)
	{
		return employeeService.add(employee);
	}
	
	/* getting details in table for hiring request */
	
	@ResponseBody
	@RequestMapping(value = "hiringRequest", method = { RequestMethod.POST, RequestMethod.GET })
	public Response hiringRequest()
	{
		return employeeService.hiringRequest();
	}
	
	
	/* Candidate Registration add1 method */
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "add1", method = { RequestMethod.POST }) public
	 * Response add1(@RequestBody EmployeeMaster employee) { return
	 * employeeService.add1(employee); }
	 */
	
	@ResponseBody
	@RequestMapping(value = "add1", method = { RequestMethod.POST })
	public Response add1(@RequestBody EmployeeMaster employee)
	{
		return employeeService.add1(employee);
	}
	
	/* Education and branches in candidate registration */
	
	@ResponseBody
	@RequestMapping(value = {"getEducations"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEducations()
	{
		return employeeService.getEducations();
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getBranches" }, method = { RequestMethod.POST })
	public Response getBranches(@RequestBody Integer education_id)
	{
		return employeeService.getBranches(education_id);
	}
	
	
	/* Getting Details to the front end in "Select Candidate" */
	
	@ResponseBody
	@RequestMapping(value = "getCandidates", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCandidates()
	{
		return employeeService.getCandidates();
	}	
	
	/* Getting staff in payslip */
	
	@ResponseBody
	@RequestMapping(value = "getStaff", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getStaff()
	{
		return employeeService.getStaff();
	}
	
	/* Getting Data in table for Others in payslip */
	
	@ResponseBody
	@RequestMapping(value = {"/getdetails"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdetails(@RequestBody EmployeeMaster employee)
	{
		return employeeService.getdetails(employee);
	}
	
	/* Hiring Request Search Bar */
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getHiringsearch", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getHiringsearch(@RequestBody
	 * EmployeeMaster Data) { return employeeService.getHiringsearch(Data); }
	 */
	
/* Getting data in Mytimesheets */
	
	@ResponseBody
	@RequestMapping(value = {"/getdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdata(@RequestBody EmployeeMaster employee)
	{
		return employeeService.getdata(employee);
	}
	
	/* Getting data based on empid in my timesheet view and edit button */
	
	@ResponseBody
	@RequestMapping(value = "getByIddata", method = { RequestMethod.POST })
	public Response getByIddata(@RequestBody EmployeeMaster mytimesheet)  
	{
		return employeeService.getByIddata(mytimesheet);
	}     
	
/* Removing data based on task in my timesheet page */
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String task)
	{
		return employeeService.remove(task);
	}
	
	/* Updating data based on task in my timesheet page */
	
	@ResponseBody
	@RequestMapping(value = "updatedata", method = { RequestMethod.POST })
	public Response updatedata(@RequestBody EmployeeMaster employee)
	{
		return employeeService.updatedata(employee);
	}
	
	
	/* Getting details to popup in attendance sheet page  */
	
	@ResponseBody
	@RequestMapping(value = "getstatus", method = { RequestMethod.POST })
	public Response getstatus(@RequestBody EmployeeMaster employee)
	{
		return employeeService.getstatus(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "getstatusab", method = { RequestMethod.POST })
	public Response getstatusab(@RequestBody EmployeeMaster employee)
	{
		return employeeService.getstatusab(employee);
	}
	
	/*create apply leave*/

	
		
		 /* getting report in attendance report page */
		@ResponseBody
		@RequestMapping(value = "getAllname", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getAllname()
		{
			return employeeService.getAllname();
		}
		
		   
		
		
		 @ResponseBody
			@RequestMapping(value = "getAll1", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll1()
			{
				return employeeService.getAll1();
			}
			@ResponseBody
			@RequestMapping(value = "getAll2", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll2()
			{
				return employeeService.getAll2();
			}
			
			@ResponseBody
			@RequestMapping(value = "getAll3", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll3()
			{
				return employeeService.getAll3();
			}
			@ResponseBody
			@RequestMapping(value = "getAll4", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll4()
			{
				return employeeService.getAll4();
				
			}
			@ResponseBody
			@RequestMapping(value = "getAll5", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll5()
			{
				return employeeService.getAll5();
				
			}
			
			@ResponseBody
			@RequestMapping(value = "getAll6", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll6()
			{
				return employeeService.getAll6();
				
			}
			
			@ResponseBody
			@RequestMapping(value = "getAll7", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll7()
			{
				return employeeService.getAll7();
				
			}
			
			@ResponseBody
			@RequestMapping(value = "getAll8", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll8()
			{
				return employeeService.getAll8();
				
			}
			@ResponseBody
			@RequestMapping(value = "getAll9", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAll9()
			{
				return employeeService.getAll9();
				
			}
			
			@ResponseBody
			@RequestMapping(value = "getempid", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getempid()
			{
				return employeeService.getempid();
				
			}   
			@ResponseBody
			@RequestMapping(value = "updateData12", method = { RequestMethod.POST })
			public Response updateData12(@RequestBody EmployeeMaster employeemaster)
			{
				return employeeService.updateData12(employeemaster);
			}
			
			@ResponseBody
			@RequestMapping(value = "gethr", method = { RequestMethod.POST, RequestMethod.GET })
			public Response gethr()
			{
				return ( employeeService).gethr();
			}
			    
   
	@ResponseBody
	@RequestMapping(value = { "/Approveall" }, method = { RequestMethod.POST ,RequestMethod.GET })
	public Response Approveall(@RequestBody List<EmployeeMaster>  empdata) throws JSONException
	{
	System.out.println("empdata test"+empdata);     
	Response response = new Response();

	try
	{
	for(EmployeeMaster emp:empdata) {
		if (emp!=null) {
	String singleemp=emp.getEmpid()+","+emp.getMonth()+","+emp.getContract_from()+","+emp.getContract_to()+","+emp.getComments();
	response = employeeService.Approveall(singleemp);
		}
	}
	}catch(Exception e) {


	}
	 
	return response;
	}

	
			
			@ResponseBody
			@RequestMapping(value = "getctccalculator", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getctccalculator()
			{
				return employeeService.getctccalculator();
			}
			
			@ResponseBody
			@RequestMapping(value = "GetDataByID", method = { RequestMethod.POST })
			public Response GetDataByID(@RequestBody EmployeeMaster employeemaster)
			{
			return this.employeeService.GetDataByID(employeemaster);
			}
			
			 @ResponseBody
				@RequestMapping(value = "addFlexi", method = { RequestMethod.POST })
				public Response addFlexi(@RequestBody EmployeeMaster employee)
				{
					return employeeService.addFlexi(employee);
				}
			 
			 /*create apply Comp leave*/

			 @ResponseBody
				@RequestMapping(value = "addComp", method = { RequestMethod.POST })
				public Response addComp(@RequestBody EmployeeMaster employee)
				{
					return employeeService.addComp(employee);
				}
			 /*Getting leavetype*/
				@ResponseBody
				@RequestMapping(value = "getLeavetype", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getLeavetype()
				{
					return employeeService.getLeavetype();
				}
				
				/*Getting reporting*/
				
				@ResponseBody
				  @RequestMapping(value={"getReporting"}, method={ RequestMethod.POST, RequestMethod.GET })
				  public Response getReporting(@RequestBody String empid)
				  {
					
				    return this.employeeService.getReporting(empid);
				  } 
				
			@ResponseBody
						@RequestMapping(value = "addleave", method = {  RequestMethod.POST })
						public Response addleave(@RequestBody EmployeeMaster employee)
						{
							handleFileUpload(employee);   
							
							employee.setImage(file);
							return employeeService.addleave(employee);   
						}
						
						public String handleFileUpload(EmployeeMaster employee)
						{
							FileOutputStream fos = null;

							try
							{
								String folderName = "leaves";
								String imageValue = employee.getBase64String();
								byte[] imageByteArray = decodeImage(imageValue);

								String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/" + "leaves" + "/"
										+ folderName;
								File dir = new File(baseDir);
								if (!Files.isDirectory(Paths.get(baseDir)))
								{
									dir.mkdirs();   
								}
								
								String leavesFileName = UUID.randomUUID().toString();
								
								fos = new FileOutputStream(baseDir + "/" + leavesFileName+".png");
								file = "/uploads/" + "leaves" + "/" + folderName + "/" +leavesFileName+".png";
								fos.write(imageByteArray);
								fos.close();

								System.out.println("---Path--> " + file);
								employee.setFile_name(file);
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
					         	     
      
					@ResponseBody
				@RequestMapping(value = "getFlexiHolidays", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getFlexiHolidays()
				{
					return employeeService.getFlexiHolidays();
				}
				@ResponseBody
				@RequestMapping(value = "getFlexiCount", method = { RequestMethod.POST, RequestMethod.GET })
				public Response getFlexiCount(@RequestBody String empid)
				{
					return employeeService.getFlexiCount(empid);    
				}
				 @ResponseBody
				  @RequestMapping(value={"getTotalleaves"}, method={ RequestMethod.POST, RequestMethod.GET })
				  public Response getById(@RequestBody EmployeeMaster employee)
				  {
					
				    return this.employeeService.getTotalleaves(employee);
				  } 

	 
}
