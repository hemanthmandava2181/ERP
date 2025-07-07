package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.Vendor;
import com.erp.Service.VendorService;


@RestController
@RequestMapping("/vendor")
public class VendorController {   
	
	        
	@Autowired
	private VendorService VendorService;     
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Vendor vendor)
	{
		System.out.println("hi");
		return VendorService.add(vendor);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return VendorService.getAll();
	}
	
	@ResponseBody              
	@RequestMapping(value = "getNameWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNameWiseData(@RequestBody Vendor vendor)
	{
			return VendorService.getNameWiseData(vendor);
	}
	
	@ResponseBody              
	@RequestMapping(value = "getIdWiseData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getIdWiseData(@RequestBody Vendor vendor)
	{
			return VendorService.getIdWiseData(vendor);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String vendor_id)
	{
		
		return VendorService.getById(vendor_id);
	}
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Vendor vendor)
	{
		
		return VendorService.updateData(vendor);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getServices", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getServices()
	{
		return VendorService.getServices();
	}
	
}             