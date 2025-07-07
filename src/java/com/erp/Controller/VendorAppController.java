package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.VendorApp;
import com.erp.Service.VendorAppService;


@RestController
@RequestMapping("/vendorapp")
public class VendorAppController {   
	
	        
	@Autowired
	private VendorAppService VendorAppService;  
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return VendorAppService.getAll();
	}
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String vendorapp)
	{    
		
		return VendorAppService.getById(vendorapp);
	}
	@ResponseBody              
	@RequestMapping(value = "getNameWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNameWiseData(@RequestBody VendorApp vendorapp)
	{
			return VendorAppService.getNameWiseData(vendorapp);
	}
	
	@ResponseBody              
	@RequestMapping(value = "getIdWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getIdWiseData(@RequestBody VendorApp vendorapp)
	{
			return VendorAppService.getIdWiseData(vendorapp);
	}
}