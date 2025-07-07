package com.erp.Controller;

import com.erp.Model.Services;

import com.erp.Service.ServiceService;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.andromeda.commons.util.HttpUtils;

@RestController
@RequestMapping("/service")
public class ServiceController
{
	@Autowired
	ServiceService serviceService;
	@ResponseBody
	@RequestMapping(value = { "/getAll" }, method = { RequestMethod.POST })
	public Response getAll()
	{
		return serviceService.getAll();
	}
	@ResponseBody
	@RequestMapping(value = { "/getLogins" }, method = { RequestMethod.POST })
	public Response getLogins(@RequestBody Integer collegeId)
	{
		return serviceService.getLogins(collegeId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/createHR", method = { RequestMethod.POST })
	private Response createHR(@RequestBody Services details,
			HttpServletRequest httpServletRequest) throws JSONException
	{
		
		String clientIp = HttpUtils.getClientAddress(httpServletRequest);
		String ipaddress = "CLIENT:" + clientIp ;
		details.setIpaddress(ipaddress);
		return serviceService.createHR(details);
	}
	@ResponseBody
	@RequestMapping(value = "/createEmployee", method = { RequestMethod.POST })
	private Response createEmployee(@RequestBody Services details,
			HttpServletRequest httpServletRequest) throws JSONException
	{
		
		String clientIp = HttpUtils.getClientAddress(httpServletRequest);
		String ipaddress = "CLIENT:" + clientIp ;
		details.setIpaddress(ipaddress);
		return serviceService.createEmployee(details);
	}
   
   
	@ResponseBody
	@RequestMapping(value = "/getCollegeDetails", method = { RequestMethod.POST })
	private Response getCollegeDetails(@RequestBody Integer districtId)
	{
		return serviceService.getCollegeDetails(districtId);
	}
}