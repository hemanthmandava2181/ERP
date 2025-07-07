package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;

import com.erp.Model.VendorService;
import com.erp.Service.VendorServiceService;

  
@RestController
@RequestMapping("/vendorservice")
public class VendorServiceController {   
	
	        
	@Autowired
	private VendorServiceService  VendorServiceService;     
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody VendorService vendorservice)
	{
		System.out.println("hi");
		return VendorServiceService.add(vendorservice);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return VendorServiceService.getAll();
	}  
	
	@ResponseBody              
	@RequestMapping(value = "getNameWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNameWiseData(@RequestBody VendorService vendorservice)
	{
			return VendorServiceService.getNameWiseData(vendorservice);
	}
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String vendorservice)
	{
		
		return VendorServiceService.getById(vendorservice);
	}
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody VendorService vendorservice)
	{
		
		return VendorServiceService.updateData(vendorservice);
	}
	
	
	
}             