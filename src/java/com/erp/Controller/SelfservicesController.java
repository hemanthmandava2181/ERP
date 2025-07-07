
package com.erp.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;

import com.erp.Model.Selfservices;
import com.erp.Service.SelfservicesService;
@RestController
@RequestMapping("/selfservice")
public class SelfservicesController {

	@Autowired
	private SelfservicesService selfservicesService;
	@ResponseBody
	@RequestMapping(value = "getCategories", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCategories()
	{
		return selfservicesService.getCategories();
	}  
	@ResponseBody
	@RequestMapping(value = "getReqtypes", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReqtypes(@RequestBody Integer request_categoryid)
	{
		return selfservicesService.getReqtypes(request_categoryid);
	}  
	@ResponseBody
	@RequestMapping(value="getStatuss", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getStatuss()
	{
		return selfservicesService.getStatuss();
	} 
	@ResponseBody
	@RequestMapping(value = "getAssigns", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAssigns()
	{
		return selfservicesService.getAssigns();
	}

	
	/*on duty request*/
	@ResponseBody
	@RequestMapping(value = "getProjects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProjects()
	{
		return selfservicesService.getProjects();
	}  
	@ResponseBody
	@RequestMapping(value = "addonduty", method = { RequestMethod.POST })
	public Response addonduty(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.addonduty(selfservicesModel);
	}
	 
	@ResponseBody
	@RequestMapping(value = "getAllduty", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllduty()
	{
		return selfservicesService.getAllduty();
	}  
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getById", method = { RequestMethod.POST }) public
	 * Response getById(@RequestBody String location) { return
	 * selfservicesService.getById(location); }
	 */
	@ResponseBody
	@RequestMapping(value = "getById1", method = { RequestMethod.POST })
	public Response getById1(@RequestBody String location)  
	{
		return selfservicesService.getById1(location);
	}
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String location)
	{
		return selfservicesService.remove(location);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateData(selfservicesModel);
	}
	
	

	@ResponseBody
	@RequestMapping(value = "updateDataCancel", method = { RequestMethod.POST })
	public Response updateDataCancel(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateDataCancel(selfservicesModel);
	}
/*Getting reporting*/
	@ResponseBody
	@RequestMapping(value = "getReportings", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReportings()
	{
		return selfservicesService.getReportings();
	}  
	@ResponseBody
	  @RequestMapping(value={"getReporting"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getReportings(@RequestBody String empid)
	  {
		
	    return this.selfservicesService.getReporting(empid);
	  } 
	
	
	
	
	
	
	
	
	
	/*on travel request*/
	@ResponseBody
	@RequestMapping(value = "addontravel", method = { RequestMethod.POST })
	public Response addontravel(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.addontravel(selfservicesModel);
	}
	 
	@ResponseBody
	@RequestMapping(value = "getAlltravel", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAlltravel()
	{
		return selfservicesService.getAlltravel();
	}   
	
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getById2", method = { RequestMethod.POST }) public
	 * Response getById2(@RequestBody String location) { return
	 * selfservicesService.getById2(location); }
	 */
	
	@ResponseBody
	@RequestMapping(value = "removeData2", method = { RequestMethod.POST })
	public Response remove2(@RequestBody String location)
	{
		return selfservicesService.remove2(location);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData2", method = { RequestMethod.POST })
	public Response updateData2(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateData2(selfservicesModel);
	}
	
	@ResponseBody
	@RequestMapping(value = "updateData2Cancel", method = { RequestMethod.POST })
	public Response updateData2Cancel(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateData2Cancel(selfservicesModel);
	}
	/*Getting reporting*/
	
	
	
	
	/*on helpdesk request*/
	
	@ResponseBody
	@RequestMapping(value = "addhelpdesk", method = { RequestMethod.POST })
	public Response addhelpdesk(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.addhelpdesk(selfservicesModel);
	}
	 
	@ResponseBody  
	@RequestMapping(value = "getAllhelpdesk", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllhelpdesk()
	{
		return selfservicesService.getAllhelpdesk();
	}  
	@ResponseBody  
	@RequestMapping(value = "getAllclosedhelpdesk", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllclosedhelpdesk()
	{
		return selfservicesService.getAllclosedhelpdesk();
	}  
	@ResponseBody
	@RequestMapping(value = "getById3", method = { RequestMethod.POST })
	public Response getById3(@RequestBody String request_id)  
	{
		return selfservicesService.getById3(request_id);
	}
	@ResponseBody
	@RequestMapping(value = "getByIdview", method = { RequestMethod.POST })         
	public Response getByIdview(@RequestBody String request_id)  
	{
		return selfservicesService.getByIdview(request_id);
	}
	@ResponseBody
	@RequestMapping(value = "removeData3", method = { RequestMethod.POST })
	public Response remove3(@RequestBody String request_id)
	{
		return selfservicesService.remove3(request_id);
	}
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData3", method = { RequestMethod.POST })
	public Response updateData3(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateData3(selfservicesModel);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataAssign", method = { RequestMethod.POST })
	public Response updateDataAssign(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateDataAssign(selfservicesModel);
	}
	@ResponseBody
	@RequestMapping(value = "updateDataEmpcomm", method = { RequestMethod.POST })
	public Response updateDataEmpcomm(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateDataEmpcomm(selfservicesModel);
	}
	@ResponseBody
	@RequestMapping(value = "updateDatahrcomm", method = { RequestMethod.POST })
	public Response updateDatahrcomm(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.updateDatahrcomm(selfservicesModel);
	}
	/* Getting Employee Name Helpdask */
	@ResponseBody
	@RequestMapping(value = "getname", method = { RequestMethod.POST })
	public Response getname(@RequestBody String empid)  
	{
		return selfservicesService.getname(empid);
	}
	
	
	
	/* sgDgdgdsg */
	
	
	
	@ResponseBody
	@RequestMapping(value = "exitemployee", method = { RequestMethod.POST })
	public Response exitemployee(@RequestBody Selfservices selfservicesModel)
	{
		return selfservicesService.exitemployee(selfservicesModel);
	}


@ResponseBody
@RequestMapping(value = "getEmployeeDirectory", method = { RequestMethod.POST, RequestMethod.GET })
public Response getEmployeeDirectory()
{
	return selfservicesService.getEmployeeDirectory();
} 
	
	      





@ResponseBody
@RequestMapping(value = "addexitemployee", method = { RequestMethod.POST })
public Response addexitemployee(@RequestBody Selfservices selfservicesModel)
{
	return selfservicesService.addexitemployee(selfservicesModel);
}
 

@ResponseBody
  @RequestMapping(value={"getNoticePeriod"}, method={ RequestMethod.POST, RequestMethod.GET })
  public Response getNoticePeriod(@RequestBody String empid)
  {
	
    return this.selfservicesService.getNoticePeriod(empid);
  } 
@ResponseBody
@RequestMapping(value={"getallexitemployee"}, method={ RequestMethod.POST, RequestMethod.GET })
public Response getallexitemployee(@RequestBody String empid)
{
	
  return this.selfservicesService.getallexitemployee(empid);
}  

@ResponseBody
@RequestMapping(value = "getallprojectemployee", method = { RequestMethod.POST })
public Response getallprojectemployee(@RequestBody String empid)  
{   
	return selfservicesService.getallprojectemployee(empid);
}



@ResponseBody
@RequestMapping(value = "getByIdemployeeexit", method = { RequestMethod.POST })
public Response getByIdemployeeexit(@RequestBody String empid)  
{
	return selfservicesService.getByIdemployeeexit(empid);
}
@ResponseBody
@RequestMapping(value = "getexitreportemployees", method = { RequestMethod.POST, RequestMethod.GET })
public Response getexitreportemployees()
{
	return selfservicesService.getexitreportemployees();
}   
	
@ResponseBody  
@RequestMapping(value = "getHelpDeskTrackerDetails", method = { RequestMethod.POST, RequestMethod.GET })
public Response getHelpDeskTrackerDetails()
{
	return selfservicesService.getHelpDeskTrackerDetails();
}  

@ResponseBody
@RequestMapping(value = "getById2", method = { RequestMethod.POST })
public Response getById2(@RequestBody Selfservices travel)  
{
	return selfservicesService.getById2(travel);
}
@ResponseBody
@RequestMapping(value = "getById", method = { RequestMethod.POST })
public Response getById(@RequestBody Selfservices duty)  
{
	return selfservicesService.getById(duty);
}

@ResponseBody
@RequestMapping(value = "getByIdviews", method = { RequestMethod.POST })
public Response getByIdviews(@RequestBody Selfservices duty)  
{
	return selfservicesService.getByIdviews(duty);
}
	
	
	}