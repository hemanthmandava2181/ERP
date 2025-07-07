
package com.erp.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.Manager;
import com.erp.Service.ManagerService;

@RestController
@RequestMapping("/manager")         
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Manager managerModel)
	{
		return managerService.add(managerModel);
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return managerService.getAll();
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String task)
	{
		return managerService.remove(task);
	}
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String task)
	{
		return managerService.getById(task);
	}
	@ResponseBody
	@RequestMapping(value = {"/getLoginSheets"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLoginSheets(@RequestBody Manager report)
	{
		return managerService.getLoginSheets(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getLeaveSheets"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeaveSheets(@RequestBody Manager report)
	{
		return managerService.getLeaveSheets(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getLoginbefore11"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLoginbefore11(@RequestBody String login_date)
	{
		return managerService.getLoginbefore11(login_date);
	}
	@ResponseBody
	@RequestMapping(value = {"/getLoginafter11"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLoginafter11(@RequestBody  String login_date)
	{
		return managerService.getLoginafter11(login_date);
	}
	@ResponseBody
	@RequestMapping(value = {"/getMissedLogin"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMissedLogin(@RequestBody  String login_date)
	{
		return managerService.getMissedLogin(login_date);
	}

	@ResponseBody
	@RequestMapping(value = {"/getAllReports"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllReports(@RequestBody  String login_date)
	{
		return managerService.getAllReports(login_date);
	}
	
	

	
	
	@ResponseBody
	@RequestMapping(value = {"/getLeavesReport"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeavesReport(@RequestBody  String login_date)
	{
		return managerService.getLeavesReport(login_date);
	}
	
	@ResponseBody
	@RequestMapping(value = "updateDataapprove", method = { RequestMethod.POST })
	public Response updateData(@RequestBody  Manager approve)
	{
		return managerService.updateDataapprove(approve);
	}
	@ResponseBody
	@RequestMapping(value = "updateDatareject", method = { RequestMethod.POST })
	public Response updateDatareject(@RequestBody Manager reject)
	{
		return managerService.updateDatareject(reject);
	}
	
	@ResponseBody
	@RequestMapping(value = "getByIdviewlogin", method = { RequestMethod.POST })
	public Response getByIdviewlogin(@RequestBody String login_date)  
	{
		return managerService.getByIdviewlogin(login_date);
	}
	
	
}
