package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.SchemeDAO;
import com.erp.Model.Scheme;



@Service
public class SchemeService {
	
	Response response = new Response();

	@Autowired
	private SchemeDAO schemeDAO;
	
	public Response getYears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getYears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response getPrimaryNames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getPrimaryNames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response getSecondaryNames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getSecondaryNames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response getSdeigroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getSdeigroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response add(Scheme schemeserviceModel) {
		response.setSuccessful(false);
		schemeDAO.add(schemeserviceModel);
		response.setSuccessful(true);
		
		response.setResponseObject(schemeserviceModel);
		return response;
	}
	public Response getById(String financial_year)
	{
		response.setSuccessful(false);
		Scheme singleuserdetails = schemeDAO.getById(financial_year);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response remove(String financial_year)
	{
		response.setSuccessful(false);
		schemeDAO.remove(financial_year);
		response.setSuccessful(true);
		response.setResponseObject(financial_year);
		return response;
	}
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = schemeDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response updateData(Scheme scheme)
	{
		response.setSuccessful(false);
		schemeDAO.updateData(scheme);
		response.setSuccessful(true);
		response.setResponseObject(scheme);
		return response;
	}
	
	

}
