package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.andromeda.commons.model.Response;
import com.erp.DAO.CalcDAO;
import com.erp.Model.Calc;
import com.erp.Model.Ctc;
import com.erp.Model.Employee;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.VendorService;



@Service
public class CalcService {
	
	Response response = new Response();

	@Autowired
	private CalcDAO calcDAO;
	
	
	/*public Response getPayNameData(Calc table) {
		response.setSuccessful(false);
		List<Calc> paySlipData = calcDAO.getPayNameData(table);
		response.setSuccessful(true);
		response.setResponseObject(paySlipData);
		return response;
	}  
	
	
	*/
	
	
	
	
	
	public Response getMonths()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getMonths();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	
	public Response getYears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getYears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getCaders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getCaders();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getGrades()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getGrades();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getCalcnames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getCalcnames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response saveCalcdetails(Calc calcserviceModel) 
	{
		response.setSuccessful(false);     
		calcDAO.saveCalcdetails(calcserviceModel);
		response.setSuccessful(true);
		response.setResponseObject(calcserviceModel);
		return response;
	}
	
	public Response getAll() {
		response.setSuccessful(false);
		List<Calc> userdetails = calcDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	
	
	
	public Response getAll1() {
		response.setSuccessful(false);
		List<Calc> userdetails = calcDAO.getAll1();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}    
	
	
	public Response add(Calc calcModel) {
		response.setSuccessful(false);
		Integer Status = calcDAO.add(calcModel);
		if(Status!=0) {
			response.setSuccessful(true);
		}
		else {
			response.setSuccessful(false);
		}
		
		return response;
	}
	
	
	
	public Response getById( Calc calcModel)
	{
		this.response.setSuccessful(false);
		Map<String, Object> list = calcDAO.getById(calcModel);
		this.response.setSuccessful(true);
		this.response.setResponseObject(list);   
		return this.response;
	}
	
	   
	
	public Response getPayname() {
		response.setSuccessful(false);
		List<Calc> userdetails1 = calcDAO.getPayname();
		response.setSuccessful(true);
		response.setResponseObject(userdetails1);
		return response;
	}
	
	
	/*public Response getById(String calcservice)
	{
		response.setSuccessful(false);
		Calc singleuserdetails = calcDAO.getById(calcservice);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}    
	*/
    
	
	
	/*public Response updateData(Calc calcserviceModel)
	{
		response.setSuccessful(false);
		calcDAO.updateData(calcserviceModel);
		response.setSuccessful(true);
		response.setResponseObject(calcserviceModel);
		return response;
	}*/
	
	
	
	
	/*#######Payroll######*/
	
	
	public Response getPname()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getPname();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
/* getting data in earnings table */
	
	public Response getEarnings(String name) {
		  response.setSuccessful(false);
		  Map<String, Object> data = calcDAO.getEarnings(name);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	/* getting data in deductions table */
	
	public Response getDeductions(String name) {
		  response.setSuccessful(false);
		  Map<String, Object> data = calcDAO.getDeductions(name);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
		
	public Response getNames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getNames();
		response.setSuccessful(true);   
		response.setResponseObject(list);
		return response;
	}	
	/*
	 * public Response getPayslipDetails() { response.setSuccessful(false);
	 * List<Map<String, Object>> list = calcDAO.getPayslipDetails();
	 * response.setSuccessful(true); response.setResponseObject(list); return
	 * response; }
	 */
	
	public Response getAllLetterheads()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = calcDAO.getAllLetterheads();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}	
	
	public Response saveLetterhead(Calc calcserviceModel) 
	{
		response.setSuccessful(false);     
		calcDAO.saveLetterhead(calcserviceModel);
		response.setSuccessful(true);
		response.setResponseObject(calcserviceModel);
		return response;
	}
	public Response getByletterhead(String name) {
		  response.setSuccessful(false);
		  Map<String, Object> data = calcDAO.getByletterhead(name);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	} 
	
	public Response updateLetterhead(Ctc ctc)
	{
		response.setSuccessful(false);
		calcDAO.updateLetterhead(ctc);
		response.setSuccessful(true);
		response.setResponseObject(ctc);
		return response;
	}
}
