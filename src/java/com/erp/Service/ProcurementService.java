
package com.erp.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.andromeda.commons.model.Response;
import com.erp.DAO.ProcurementDAO;
import com.erp.Model.Grn;
import com.erp.Model.Procurement;




@Service
public class ProcurementService {
	
	Response response = new Response();

	@Autowired
	private ProcurementDAO procurementDAO;	
	public Response createworkorder(Procurement procurement) {
		response.setSuccessful(false);
		procurementDAO.createworkorder(procurement);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(procurement);
		return response;
		}
	public Response getVendors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = procurementDAO.getVendors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSectors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = procurementDAO.getSectors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response createmou(Procurement procurement) {
		response.setSuccessful(false);
		procurementDAO.createmou(procurement);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(procurement);
		return response;
		}
	public Response getmoulist()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = procurementDAO.getmoulist();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getwolist()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = procurementDAO.getwolist();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response addwoitems(Procurement procurement) {
		response.setSuccessful(false);
		procurementDAO.addwoitems(procurement);
		response.setSuccessful(true);
		response.setResponseObject(procurement);
		return response;
	}
	public Response addwoadditions(Procurement procurement) {
		response.setSuccessful(false);
		procurementDAO.addwoadditions(procurement);
		response.setSuccessful(true);	
		response.setResponseObject(procurement);
		return response;
	}
	public Response getDetailsofProgram(Procurement procurement)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = procurementDAO.getDetailsofProgram(procurement);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
	public Response getSchemes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list =  procurementDAO.getSchemes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getProjects()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> projects =procurementDAO.getProjects();
		response.setSuccessful(true);
		response.setResponseObject(projects);
		return response;
	}
	public Response getworkorders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> workorders =procurementDAO.getworkorders();
		response.setSuccessful(true);
		response.setResponseObject(workorders);
		return response;
	}
	public Response getpurchaseorders()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> purchaseorders =procurementDAO.getpurchaseorders();
		response.setSuccessful(true);
		response.setResponseObject(purchaseorders);
		return response;
	}
	public Response getmous()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> mous =procurementDAO.getmous();
		response.setSuccessful(true);
		response.setResponseObject(mous);
		return response;
	}
	public Response getProjectWiseSpentReport(Procurement procurement)
	{
		response.setSuccessful(false);
		Map<String,Object> list = procurementDAO.getProjectWiseSpentReport(procurement);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getProjectWise(Procurement procurement)
	{
		response.setSuccessful(false);
		Map<String,Object> list = procurementDAO.getProjectWise(procurement);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getWorkOrderWise(Procurement procurement)
	{
		response.setSuccessful(false);
		Map<String,Object> list = procurementDAO.getWorkOrderWise(procurement);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getWorkorderDetails(Procurement procurement)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = procurementDAO.getWorkorderDetails(procurement);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
	
	
	public Response getPODetails(Procurement procurement)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = procurementDAO.getPODetails(procurement);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
}
