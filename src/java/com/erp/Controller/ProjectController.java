package com.erp.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.Project;

import com.erp.Service.ProjectService; 
@RestController
@RequestMapping("/project")
public class ProjectController {           
	@Autowired
	private ProjectService  projectservice;     
	@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return projectservice.getYears();
	}	
	
	
	@ResponseBody
	@RequestMapping(value = "getSchemes", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSchemes()
	{
		return projectservice.getSchemes();
	}
	
	@ResponseBody
	@RequestMapping(value = "getSdeis", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSdeis()
	{
		return projectservice.getSdeis();
	}
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Project projectserviceModel)
	{
		System.out.println("hi");
		return projectservice.add(projectserviceModel);       
	}
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String project_name)  
	{
		return projectservice.getById(project_name);
	}
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return projectservice.getAll();
	} 
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String project_name)
	{
		return projectservice.remove(project_name);
	}
	
	    
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Project projectserviceModel)
	{
		
		return projectservice.updateData(projectserviceModel);
	}
	
	
	
}             