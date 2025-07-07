package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;

import com.erp.Service.POListService;


@RestController
@RequestMapping("/polist")
public class POListController {   
	
	        
	@Autowired
	private POListService POListService;  
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return POListService.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll3", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll3()
	{
		return POListService.getAll3();
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll1", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll1()
	{
		return POListService.getAll1();
	}
	
	@ResponseBody
	@RequestMapping(value = "getAllpo", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllpo()
	{
		return POListService.getAllpo();
	}
	
	@ResponseBody
	@RequestMapping(value = "checkedBy", method = { RequestMethod.POST, RequestMethod.GET })
	public Response checkedBy()
	{
		return POListService.checkedBy();
	}

	/*getting vendor invoice field*/
	 @ResponseBody
		@RequestMapping(value = "getVendor", method = { RequestMethod.POST, RequestMethod.GET })
		public Response getVendor()
		{
			return POListService.getVendor();
		}
	 
	 	@ResponseBody
		@RequestMapping(value = "getByPo", method = { RequestMethod.POST })
		public Response getByPo(@RequestBody String purchaseorder_id)
		{
			return POListService.getByPo(purchaseorder_id);
		}


}