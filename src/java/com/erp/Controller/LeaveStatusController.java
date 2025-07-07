package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.LeaveStatus;
import com.erp.Service.LeaveStatusService;

@RestController
@RequestMapping("/user")
public class LeaveStatusController {

	@Autowired
	private LeaveStatusService leavestatusService;
	
	@ResponseBody
	  @RequestMapping(value={"getAllLeaves"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getAllLeaves(@RequestBody String empid)
	  {
		
	    return this.leavestatusService.getAllLeaves(empid);
	  } 
	/*@ResponseBody
	@RequestMapping(value = {"/getAllLeaves"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllLeaves(@RequestBody LeaveStatus employee)
	{
		return leavestatusService.getAllLeaves(employee);
	}*/
	

}
