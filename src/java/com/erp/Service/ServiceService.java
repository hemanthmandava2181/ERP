package com.erp.Service;

import java.util.List;
import java.util.Map;     
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.andromeda.commons.model.Response;
import com.erp.DAO.ServiceDAO;
import com.erp.Model.Services;
import com.erp.Model.Email;
import com.erp.Model.Selfservices;
import com.erp.Service.EmailService;
import com.erp.Service.ServiceService;
@Service
public class ServiceService
{
	@Autowired
	ServiceDAO serviceDAO;

	@Autowired
	EmailService emailService;
	
	Response response = new Response();
	public Response getAll( )
	{
		response.setSuccessful(false);
		List<Map<String, Object>> details = serviceDAO.getAll();
		response.setSuccessful(true);    
		response.setResponseObject(details);
		return response;
	}
	public Response getCollegeDetails(Integer districtId)
	{
		response.setSuccessful(false);
		Map<String, Object> details = serviceDAO.getCollegeDetails(districtId);
		response.setSuccessful(true);
		response.setResponseObject(details);
		return response;
	}
	
	
	public Response getLogins(Integer collegeId)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> logins = serviceDAO.getLogins(collegeId);
		if (logins == null)
		{
			response.setSuccessful(false);
			response.setErrorMessage(
					"No data available, create login credentials using 'Create login credentials' option");
		}
		else
		{
			response.setSuccessful(true);
			response.setResponseObject(logins);
		}
		return response;
	}
	        
	public Response createHR(Services details)
	{
		response.setSuccessful(false);
		Services login =serviceDAO.createHR(details);
		if(login.getUserStatus().equals("0")) {
        Email email = new Email();
		email.setFrom("Skill AP <siemensregistrations@apssdc.in>");
		email.setTo(details.getEmail().trim());
		email.setSubject("Registration Successful");
		String msg = "Dear Sir/Madam,<br><br>"+    
		"Username: "+details.getUsername()+"<br><br>"
		+ "Password: "+details.getPassword()+"<br><br>"
		+ "EmployeeId: "+details.getEmpid();     
		email.setText(msg);
		emailService.sendHtmlMsg(email);
		response.setSuccessful(true);
		response.setResponseObject(login);
		return response;
		}
		else
		{
		response.setSuccessful(false);
		return 	response;
		}
	}
	
	
	public Response createEmployee(Services details)
	{
		response.setSuccessful(false);
		Services login =serviceDAO.createEmployee(details);
		if(login.getUserStatus().equals("0")) {
        Email email = new Email();
		email.setFrom("Skill AP <siemensregistrations@apssdc.in>");
		email.setTo(details.getEmail().trim());
		email.setSubject("Registration Successful");
		String msg = "Dear Sir/Madam,<br><br>"+    
		"Username: "+details.getUsername()+"<br><br>"
		+ "Password: "+details.getPassword()+"<br><br>"
		+ "EmployeeId: "+details.getEmpid();     
		email.setText(msg);
		emailService.sendHtmlMsg(email);
		response.setSuccessful(true);
		response.setResponseObject(login);
		return response;
		}
		else       
		{
		response.setSuccessful(false);
		return 	response;
		}
	}
	
	

	
}