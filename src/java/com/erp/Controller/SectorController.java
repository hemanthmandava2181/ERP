package com.erp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;

import com.erp.Model.Sector;
import com.erp.Service.SectorService;

  


@RestController
@RequestMapping("/sector")
public class SectorController {

	@Autowired
	private SectorService sectorservice;
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Sector sectorModel)
	{
		return sectorservice.add(sectorModel);
	}
	 
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return sectorservice.getAll();
	}   
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String Sector_name)  
	{
		return sectorservice.getById(Sector_name);
	}
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String sector_name)
	{
		return sectorservice.remove(sector_name);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Sector sector)
	{
		return sectorservice.updateData(sector);
	}
	}