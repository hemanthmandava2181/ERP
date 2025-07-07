package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.ProgramDAO;
import com.erp.Model.Program;

import com.erp.Service.ProgramService;



@Service
public class ProgramService {
	
	Response response = new Response();

	@Autowired
	private ProgramDAO programDAO;
	
	public Response getDistricts()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = programDAO.getDistricts();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	public Response getGroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = programDAO.getGroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSchemes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = programDAO.getSchemes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	
	public Response getProjects( String scheme_id)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> projects = programDAO.getProjects(scheme_id);
		response.setSuccessful(true);
		response.setResponseObject(projects);
		return response;
	}
	public Response getNames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = programDAO.getNames();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSegments()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = programDAO.getSegments();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSectors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = programDAO.getSectors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	
	
	
	
	public Response add(Program programservice) {
		response.setSuccessful(false);
		programDAO.add(programservice);
		response.setSuccessful(true);
		
		response.setResponseObject(programservice);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = programDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response remove(String program_name)
	{
		response.setSuccessful(false);
		programDAO.remove(program_name);
		response.setSuccessful(true);
		response.setResponseObject(program_name);
		return response;
	}
	
	public Response updateData(Program programservice)
	{
		response.setSuccessful(false);
		programDAO.updateData(programservice);
		response.setSuccessful(true);
		response.setResponseObject(programservice);
		return response;
	}
	
	public Response getById(String program_name)
	{
		response.setSuccessful(false);
		Program singleuserdetails = programDAO.getById(program_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}

	
}
