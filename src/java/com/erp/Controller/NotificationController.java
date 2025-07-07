package com.erp.Controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.andromeda.commons.util.HttpUtils;
import com.erp.Model.Notification;

import com.erp.Service.NotificationService;


@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	        
	@Autowired
	private NotificationService notificationService;     
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Notification notification)
	{
		System.out.println("hi");
		return notificationService.add(notification);
		       
	}
	
	     
	
	@ResponseBody
	@RequestMapping(value = "inserting", method = { RequestMethod.POST, RequestMethod.GET })
	public Response inserting(@RequestBody Notification notification)
	{
		
		return notificationService.inserting(notification);
		       
	}
	
	
	

	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return notificationService.getAll();
	}


	@ResponseBody
	@RequestMapping(value = "getbasedonselection", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getbasedonselection(@RequestBody Integer id)
	{
		System.out.println("id######################3333"+id);
		return notificationService.getbasedonselection(id);
	}
	
	
	
	
	
	
	/*Getting drop down*/

	@ResponseBody
	@RequestMapping(value = "getdropdown", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdropdown()
	{
		return notificationService.getdropdown();
	}
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = {"/getemployeedatabased"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getemployeedata(@RequestBody Notification notiy)
	{
		return notificationService.getemployeedatabased(notiy);
	}
	
	@ResponseBody
	@RequestMapping(value = {"/getGroupDetails"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGroupDetails(@RequestBody Integer id)
	{
		return notificationService.getGroupDetails(id);
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = { "sendSMS" }, method = { RequestMethod.POST })
	public Response sendSMS(@RequestBody Notification notification,
			HttpServletRequest httpServletRequest)
	{
		
		 return notificationService.sendSMS(notification);
	}
	

	@ResponseBody
	@RequestMapping(value = { "sendGroupSMS" }, method = { RequestMethod.POST })
	public Response sendGroupSMS(@RequestBody Notification notification,
			HttpServletRequest httpServletRequest)
	{
		
		 return notificationService.sendGroupSMS(notification);
	}


	
/* Adding employees into Added Employees */
	
	@ResponseBody
	@RequestMapping(value = "Toadded", method = { RequestMethod.POST })
	public Response Toadded(@RequestBody Notification notification)
	{
		System.out.println("hi");
		return notificationService.Toadded(notification);
		       
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody Integer id)
	{
		return this.notificationService.getById(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "getId", method = { RequestMethod.POST })
	public Response getId(@RequestBody Integer id)
	{
		return this.notificationService.getId(id);
	}
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Notification notification)
	{
		
		System.out.println("&&&&&&&&&&&&&&&&&");
		return notificationService.updateData(notification);
	}

}
	                       