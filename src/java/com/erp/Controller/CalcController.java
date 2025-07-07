package com.erp.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.andromeda.commons.util.HttpUtils;
import com.erp.Model.Calc;
import com.erp.Model.Ctc;
import com.erp.Model.EmployeeMaster;
import com.erp.Service.CalcService;

@RestController
@RequestMapping("/calc")
public class CalcController {   
	@Autowired
	CalcService calcservice;
	
	
	
/*	@ResponseBody              
	@RequestMapping(value = "getPayNameData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPayNameData(@RequestBody Calc table)
	{
			return calcservice.getPayNameData(table);
	}
	*/
	
	/* getting data in earnings table */	

	@ResponseBody
	@RequestMapping(value = {"/getEarnings"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEarnings(@RequestBody String name)
	{
		return calcservice.getEarnings(name);
	}
	
	
	/* getting data in deductions table */
	
	@ResponseBody
	@RequestMapping(value = {"/getDeductions"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDeductions(@RequestBody String name)
	{
		return calcservice.getDeductions(name);
	}
	
	
	@ResponseBody
	@RequestMapping(value = { "/getById"}, method = { RequestMethod.POST,RequestMethod.GET })
	public Response getById(@RequestBody  Calc calcModel)  
	{
		return this.calcservice.getById(calcModel);
		
	}
	
	@ResponseBody
	@RequestMapping(value = "getPayname", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPayname()
	{
		return calcservice.getPayname();
	}

	@ResponseBody         
	@RequestMapping(value = "/add", method = { RequestMethod.POST,
	RequestMethod.GET })
	public Response add(@RequestBody Calc calcModel,HttpServletRequest httpServletRequest)
	{

	String clientProxyIp = HttpUtils.getClientProxyAddress(httpServletRequest);
	String clientIp = HttpUtils.getClientAddress(httpServletRequest);
	return calcservice.add(calcModel);
	}
	 
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return calcservice.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value = "getAll1", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll1()
	{
		return calcservice.getAll1();
	}
	
	
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "getGrades", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrades()
	{
		return calcservice.getGrades();
	}
	
	@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return calcservice.getYears();   
	}
	
	@ResponseBody
	@RequestMapping(value = "getMonths", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMonths()
	{
		return calcservice.getMonths();   
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getCaders", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return calcservice.getCaders();
	}
	

	@ResponseBody
	@RequestMapping(value = "getCalcnames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCalcnames()
	{
		return calcservice.getCalcnames();
	}
	
	
	/******Payroll**********/
	
	
	
	@ResponseBody
	@RequestMapping(value = "getPname", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPname()
	{
		return calcservice.getPname();   
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getNames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNames()
	{
		return calcservice.getNames();   
	}
	
	
	
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getPayslipDetails", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getPayslipDetails() { return
	 * calcservice.getPayslipDetails(); }
	 */
	
	
	@ResponseBody
	@RequestMapping(value = "/getAllLetterheads", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllLetterheads()
	{
		return calcservice.getAllLetterheads();   
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "saveLetterhead", method = { RequestMethod.POST })          
	public Response saveLetterhead(@RequestBody Calc calcModel)
	{
		return calcservice.saveLetterhead(calcModel);
	}
	
	
	@ResponseBody
	@RequestMapping(value = {"/getByletterhead"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getByletterhead(@RequestBody String  name)
	{
		return calcservice.getByletterhead(name);
	}
	
	@ResponseBody
	@RequestMapping(value = "updateLetterhead", method = { RequestMethod.POST })
	public Response updateLetterhead(@RequestBody Ctc ctc)
	{
		return calcservice.updateLetterhead(ctc);
	}
	
	@ResponseBody
	@RequestMapping(value = "saveCalcdetails", method = { RequestMethod.POST })          
	public Response saveCalcdetails(@RequestBody Calc calcModel)
	{
		return calcservice.saveCalcdetails(calcModel);
	}
	
}
