package com.erp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.Deputation;
import com.erp.Model.EmployeeMaster;
import com.erp.Service.DeputationService;

@RestController
@RequestMapping({ "/deputation" })
public class DeputationController {
	
	@Autowired
	private DeputationService deputationService;
	
	@ResponseBody
	@RequestMapping(value = "/getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return deputationService.getYears();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getMonths", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMonths()
	{
		return deputationService.getMonths();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getNames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNames()
	{
		return deputationService.getNames();
	}
	
	@ResponseBody
	@RequestMapping(value = "/getPname", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPname()
	{
		return deputationService.getPname();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody List<Deputation> deps)
	{
		return deputationService.add(deps);
	}
	

}
