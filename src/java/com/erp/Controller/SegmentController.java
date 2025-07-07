package com.erp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;

import com.erp.Model.Segment;
import com.erp.Service.SegmentService;

  


@RestController
@RequestMapping("/segment")
public class SegmentController {

	@Autowired
	private SegmentService segmentservice;
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Segment segmentModel)
	{
		return segmentservice.add(segmentModel);
	}
	 
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return segmentservice.getAll();
	}   
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String segment_name)  
	{
		return segmentservice.getById(segment_name);
	}
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String segment_name)
	{
		return segmentservice.remove(segment_name);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Segment segment)
	{
		return segmentservice.updateData(segment);
	}
	}