package com.erp.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;      
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.Sdeigroup;
import com.erp.Service.SdeigroupService;
@RestController
@RequestMapping("/sdei")
public class SdeigroupController {

	@Autowired
	private SdeigroupService sdeigroupService;
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody Sdeigroup sdeigroupModel)
	{
		return sdeigroupService.add(sdeigroupModel);
	}
	 
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return sdeigroupService.getAll();
	}   
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String sdei_groupnumber)  
	{
		return sdeigroupService.getById(sdei_groupnumber);
	}
	
	@ResponseBody
	@RequestMapping(value = "removeData", method = { RequestMethod.POST })
	public Response remove(@RequestBody String sdei_groupnumber)
	{
		return sdeigroupService.remove(sdei_groupnumber);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody Sdeigroup sdeigroup)
	{
		return sdeigroupService.updateData(sdeigroup);
	}
	}