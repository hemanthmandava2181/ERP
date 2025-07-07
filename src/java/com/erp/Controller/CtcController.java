package com.erp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.Ctc;
import com.erp.Model.FileModel;
import com.erp.Model.LeavesReport;
import com.erp.Model.ReportsEmployee;
import com.erp.Service.CtcService;

import commons.util.Base64;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import com.andromeda.commons.util.HttpUtils;



@RestController
@RequestMapping("/ctc")   


public class CtcController {
	
	String file = null;  
	Response response = new Response();

	@Autowired
	private CtcService ctcService;
	
	
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Ctc ctcModel)
	{
		return ctcService.add(ctcModel);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "add1", method = { RequestMethod.POST })
	public Response add1(@RequestBody Ctc ctcModel)
	{
		return ctcService.add1(ctcModel);
	}
	
	 
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return ctcService.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "getEarnings", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEarnings()
	{
		return ctcService.getEarnings();
	}   
	
	
	
	@ResponseBody
	@RequestMapping(value = "getDeductions", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDeductions()
	{
		return ctcService.getDeductions();
	}   
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String pname)  
	{
		return ctcService.getById(pname);
	}
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String pname)
	{
		return ctcService.remove(pname);
	}
	
	/* Getting all employees in modify ctc */	
	@ResponseBody
	@RequestMapping(value = "getallemployees", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallemployees()
	{
		return ctcService.getallemployees();
	}
	
	/* Getting employees based on given data modify ctc */	
	@ResponseBody
	@RequestMapping(value = {"/getemployeedata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getemployeedata(@RequestBody Ctc ctcModel)
	{
		return ctcService.getemployeedata(ctcModel);
	}
	
	/* Getting details in profileupdateadmin page based on empid */	
	@ResponseBody
	  @RequestMapping(value={"getDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getDetails(@RequestBody String empid)
	  {
		
	    return this.ctcService.getDetails(empid);  
	  } 
	
	/* Updating employee data based on empid in profileupdateadmin page */
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "adddata", method = { RequestMethod.POST }) public
	 * Response adddata(@RequestBody Ctc ctcModel) {
	 * System.out.println("update controller"); return ctcService.adddata(ctcModel);
	 * 
	 * }
	 */
	
	/* Getting Employees */
	
	@ResponseBody
	@RequestMapping(value = { "/getemployees" }, method = { RequestMethod.POST })
	public Response getemployees(@RequestBody String ctc_calculator)
	{
		return ctcService.getemployees(ctc_calculator);
	}
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Ctc ctc)
	{
		return ctcService.updateData(ctc);
	}
	
	/* updating employee profile details by admin in modify ctc page */
	
	@ResponseBody
	@RequestMapping(value = "adminupdate", method = { RequestMethod.POST })
	public Response adminupdate(@RequestBody Ctc ctc)
	{
		System.out.println("controller for profile update by admin in modify ctc page");
		return ctcService.adminupdate(ctc);
	}
	
	/* Getting details in revisectc page based on empid */	
	@ResponseBody
	  @RequestMapping(value={"getctcDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getctcDetails(@RequestBody String empid)
	  {
		
	    return this.ctcService.getctcDetails(empid);  
	  }
	
	/* updating ctc in revise ctc page in modify ctc */
	@ResponseBody
	@RequestMapping(value = "applyctcrevision", method = { RequestMethod.POST })
	public Response applyctcrevision(@RequestBody Ctc ctc)
	{
		return ctcService.applyctcrevision(ctc);
	}
	
	/*Stop Salary Summary*/
	@ResponseBody
	@RequestMapping(value = { "/getsalsummary"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getsalsummary(@RequestBody Ctc report)
	{
		return ctcService.getsalsummary(report);
	}
	
	@ResponseBody    
	@RequestMapping(value = { "/releasestopsalaryamount" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response releasestopsalaryamount(@RequestBody Ctc report) {
		return ctcService.releasestopsalaryamount(report);
	}
	
	@ResponseBody    
	@RequestMapping(value = { "/releaseStopSalaryDate" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response releaseStopSalaryDate(@RequestBody Ctc report) {
		return ctcService.releaseStopSalaryDate(report);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = { "/getStopData"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getStopData(@RequestBody Ctc report)
	{
		return ctcService.getStopData(report);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/releasestopdate"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response releasestopdate(@RequestBody Ctc report)
	{
		return ctcService.releasestopdate(report);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/releasestopsalary"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response releasestopsalary(@RequestBody Ctc report)
	{
		return ctcService.releasestopsalary(report);
	}
	
	
	@ResponseBody
	@RequestMapping(value = { "/releasestopsalarypayroll" }, method = { RequestMethod.POST })
	public Response releasestopsalarypayroll(@RequestBody Ctc report) {
		return ctcService.releasestopsalarypayroll(report);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "addsalsummary", method = { RequestMethod.POST ,RequestMethod.GET})
	public Response addsalsummary(@RequestBody Ctc ctcModel)
	{
		return ctcService.addsalsummary(ctcModel);
	}
	
	@ResponseBody
	@RequestMapping(value = "addstopsalaryData", method = { RequestMethod.POST ,RequestMethod.GET})
	public Response addstopsalaryData(@RequestBody Ctc ctcModel)
	{
		return ctcService.addstopsalaryData(ctcModel);
	}
	
	@ResponseBody
	@RequestMapping(value = "releaseEmployeestopsalaryDate", method = { RequestMethod.POST ,RequestMethod.GET})
	public Response releaseEmployeestopsalaryDate(@RequestBody Ctc ctcModel)
	{
		return ctcService.releaseEmployeestopsalaryDate(ctcModel);
	}
	
	@ResponseBody
	@RequestMapping(value = "/addd", method = { RequestMethod.POST,
	RequestMethod.GET })
	public Response addd(@RequestBody Ctc ctcModel,HttpServletRequest httpServletRequest)
	{
	String clientProxyIp = HttpUtils.getClientProxyAddress(httpServletRequest);
	String clientIp = HttpUtils.getClientAddress(httpServletRequest);
	
	return ctcService.addd(ctcModel);
	}
	
	/*updating CTC Calulator*/
	@ResponseBody
	@RequestMapping(value = {"updateCTC"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response updateCTC(@RequestBody Ctc employee)
	{
		return ctcService.updateCTC(employee);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "viewdetalisdata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response viewdetalisdata(@RequestBody String empid)
	{
		return ctcService.viewdetalisdata(empid);
	} 
	
	@ResponseBody
	@RequestMapping(value = "/getViewpayslipdeduction", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getViewpayslipdeduction(@RequestBody Ctc employee)
	{
		return ctcService.getViewpayslipdeduction(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getViewpayslipearings", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getViewpayslipearings(@RequestBody Ctc employee)
	{
		return ctcService.getViewpayslipearings(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/upload" },
			method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public Response handleFileUpload(@RequestBody FileModel fileModel)
	{
		
		System.out.println("****************COntroller******************");
		
		this.response.setSuccessful(false);
		FileOutputStream fos = null;
		String file = null;
		try
		{
			String imageValue =fileModel.getBase64String();
			byte[] imageByteArray = decodeImage(imageValue);
			

			// Integer folderName = fileModel.getCollegeId();     
			String baseDir =
					System.getProperty("catalina.base") + "/webapps/uploads/EOIStudentsData";
			File dir = new File(baseDir);
			if (!Files.isDirectory(Paths.get(baseDir)))
			{
				dir.mkdirs();
			}
			String random = UUID.randomUUID().toString();
			/*System.out.println("==================================================" + baseDir);*/
			fos = new FileOutputStream(baseDir + "/" +random+fileModel.getFileName());
			/*System.out.println(fos);*/
			file = "/uploads/EOIStudentsData" + "/" +random+ fileModel.getFileName();

			fos.write(imageByteArray);
			fos.close();
			// File f = new File(fileModel.getName());
			fileModel.setName(file);
		}
		catch (Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
		this.response.setSuccessful(true);   
		this.response.setResponseObject(fileModel);   
		return this.response;
	}
	public static byte[] decodeImage(String imageValue)
	{
		

		return Base64.decode(imageValue);
	}
	
	@ResponseBody
	@RequestMapping(value = { "saveIncometaxDetails" }, method = { RequestMethod.POST })
	public Response saveIncometaxDetails(@RequestBody List<Ctc> employee,
			HttpServletRequest httpServletRequest)
	{
		String clientAddress = HttpUtils.getClientAddress(httpServletRequest);
		String proxyAddress = HttpUtils.getClientProxyAddress(httpServletRequest);
		String ipAddress =
				"Client Address: " + clientAddress + "Client Proxy Address: " + proxyAddress;
		List<String> pathsList = new ArrayList<String>();
		// StudentRegistrationModal studentRegistrationModal =(StudentRegistrationModal)
		// student.get(0);
		return this.ctcService.saveIncometaxDetails(employee, ipAddress, pathsList);
	}
	
	
}