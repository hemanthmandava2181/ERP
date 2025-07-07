package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.Employee;
import com.erp.Model.Payroll;
import com.erp.Service.PayrollService;


@RestController
@RequestMapping("/Payroll")
public class PayrollController {
	
	@Autowired
	private PayrollService payrollService;     
	
	@ResponseBody
	@RequestMapping(value = "getFinancialYear", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getFinancialYear()
	{
	return payrollService.getFinancialYear();
	}
	
	@ResponseBody
	@RequestMapping(value = "employeeCounts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response employeeCounts()
	{
		return payrollService.employeeCounts();   
	}
	@ResponseBody
	@RequestMapping(value = "savePayrollSettings", method = { RequestMethod.POST })
	public Response savePayrollSettings(@RequestBody Payroll payroll)
	{
		
		return payrollService.savePayrollSettings(payroll);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "GeneratePayroll", method = { RequestMethod.POST })
	public Response GeneratePayroll(@RequestBody Payroll payroll)
	{
		
		return payrollService.GeneratePayroll(payroll);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getPayrollDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPayrollDetails(@RequestBody Payroll payroll) {
		return payrollService.getPayrollDetails(payroll);
	}
	
	
	@ResponseBody
	@RequestMapping(value = { "/getJVPayrollDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getJVPayrollDetails(@RequestBody Payroll payroll) {
		return payrollService.getJVPayrollDetails(payroll);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getPayrollTotal" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPayrollTotal(@RequestBody Payroll payroll) {
		return payrollService.getPayrollTotal(payroll);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getJVPayrollTotal" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getJVPayrollTotal(@RequestBody Payroll payroll) {
		return payrollService.getJVPayrollTotal(payroll);
	}
	
	@ResponseBody
	@RequestMapping(value = "ValidatePayroll", method = { RequestMethod.POST })
	public Response ValidatePayroll(@RequestBody Payroll payroll)
	{
		
		return payrollService.ValidatePayroll(payroll);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "ApprovePayroll", method = { RequestMethod.POST })
	public Response ApprovePayroll(@RequestBody Payroll payroll)
	{
		
		return payrollService.ApprovePayroll(payroll);
		       
	}
	@ResponseBody
	@RequestMapping(value = "RejectPayroll", method = { RequestMethod.POST })
	public Response RejectPayroll(@RequestBody Payroll payroll)
	{
		
		return payrollService.RejectPayroll(payroll);
		       
	}
	@ResponseBody
	@RequestMapping(value = "RejectPayrollStatus", method = { RequestMethod.POST })
	public Response RejectPayrollStatus(@RequestBody Payroll payroll)
	{
		
		return payrollService.RejectPayrollStatus(payroll);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "GeneratePayrollStatus", method = { RequestMethod.POST })
	public Response GeneratePayrollStatus(@RequestBody Payroll payroll)
	{
		
		return payrollService.GeneratePayrollStatus(payroll);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "getPayRollJVModelData", method = { RequestMethod.POST })
	public Response getPayRollJVModelData(@RequestBody Payroll payroll)
	{
		return payrollService.getPayRollJVModelData(payroll);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "getPayRollJVModelDataOthers", method = { RequestMethod.POST })
	public Response getPayRollJVModelDataOthers(@RequestBody Payroll payroll)
	{
		return payrollService.getPayRollJVModelDataOthers(payroll);
		       
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getJVModalDataPaymentSummary", method = { RequestMethod.POST })
	public Response getJVModalDataPaymentSummary(@RequestBody Payroll payroll)
	{
		return payrollService.getJVModalDataPaymentSummary(payroll);
		       
	}
	
	@ResponseBody
	@RequestMapping(value = "getJVModalDataDeputation", method = { RequestMethod.POST })
	public Response getJVModalDataDeputation(@RequestBody Payroll payroll)
	{
		return payrollService.getJVModalDataDeputation(payroll);
		       
	}
	
	
	
	
	

}
