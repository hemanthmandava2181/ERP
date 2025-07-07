package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.CreatePODAO;
import com.erp.Model.CreatePO;
import com.erp.Model.Employee;
import com.erp.Model.Grn;
import com.erp.Model.VendorService;



@Service
public class CreatePOService {
	
	Response response = new Response();

	@Autowired
	private CreatePODAO createPODAO;
	
	public Response getYears()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getYears();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getPOID()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPOID();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getPurchaseOrderType()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPurchaseOrderType();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getPurchaseType()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPurchaseType();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getServices()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getServices();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getPrograms()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getPrograms();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getProjects()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getProjects();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSchemes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getSchemes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getSectors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getSectors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getVendors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getVendors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAssets()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getAssets();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getLocations()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getLocations();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	/* vendor names*/
	public Response getVendornames(Integer serviceid) {
		response.setSuccessful(false);
		List<CreatePO> userdetails = createPODAO.getVendornames(serviceid);
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getConsume(String assets) {
		response.setSuccessful(false);
		List<CreatePO> userdetails = createPODAO.getConsume(assets);
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getNames() {
		response.setSuccessful(false);
		List<CreatePO> userdetails = createPODAO.getNames();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	
	public Response add(CreatePO createposervice) {
		response.setSuccessful(false);
		createPODAO.add(createposervice);
		response.setSuccessful(true);
		
		response.setResponseObject(createposervice);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	/*line items*/
	public Response getAll5()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getAll5();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getById(String createposervice)
	{
		response.setSuccessful(false);
		CreatePO singleuserdetails = createPODAO.getById(createposervice);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}    
	public Response getGroups()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getGroups();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
    
	public Response submit(CreatePO createposervice) {
		response.setSuccessful(false);
		createPODAO.submit(createposervice);
		response.setSuccessful(true);
		
		response.setResponseObject(createposervice);
		return response;    
	}
	
	public Response updateData(CreatePO createposervice)
	{
		response.setSuccessful(false);
		createPODAO.updateData(createposervice);
		response.setSuccessful(true);
		response.setResponseObject(createposervice);
		return response;
	}
	
	public Response getAllIds(CreatePO faculty)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = createPODAO.getAllIds(faculty);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
	
	public Response getAssetNames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getAssetNames();
		response.setSuccessful(true);
		response.setResponseObject(list);   
		return response;
	}
	public Response getItemNames()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getItemNames();    
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response Consumables(CreatePO createposervice) {
		response.setSuccessful(false);	
		createPODAO.Consumables(createposervice);
		response.setSuccessful(true);
		 
		response.setResponseObject(createposervice);
		return response;
	}
	
	
	
	
	public Response getProgramDet(CreatePO createposervice)
	{
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	response.setSuccessful(false);
	List<Map<String,Object>>list = createPODAO.getProgramDet(createposervice);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}    
	
	/*######################WORK ORDER MULTIPLICATION####################*/
	
	public Response addWOItems(CreatePO createposervice) {
		response.setSuccessful(false);	
		createPODAO.addWOItems(createposervice);
		response.setSuccessful(true);
		
		response.setResponseObject(createposervice);
		return response;
	}
	
	
	
	public Response TravelDaysMutli(CreatePO createposervice) {
		response.setSuccessful(false);	
		createPODAO.TravelDaysMutli(createposervice);
		response.setSuccessful(true);
		
		response.setResponseObject(createposervice);
		return response;
	}
	
	
	public Response addwoadditions(CreatePO createposervice) {
		response.setSuccessful(false);	
		createPODAO.addwoadditions(createposervice);
		response.setSuccessful(true);
		
		response.setResponseObject(createposervice);
		return response;
	}
	
	
	
	
	/*##################################generating MOU ids#######################*/
	
	
	
	public Response getMoUIds(CreatePO faculty)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = createPODAO.getMoUIds(faculty);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
	
	
	
	
	
	
	
	/*public Response getConsume()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = createPODAO.getConsume();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}*/
	
	
	
	
	/*public Response add(VendorService vendorservice) {
		response.setSuccessful(false);
		vendorserviceDao.add(vendorservice);
		response.setSuccessful(true);
		
		response.setResponseObject(vendorservice);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = vendorserviceDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getNameWiseData(VendorService vendorservice) {
		response.setSuccessful(false);
		List<VendorService> nameWiseData = vendorserviceDao.getNameWiseData(vendorservice);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}  
	public Response getById(String vendorservice)
	{
		response.setSuccessful(false);
		VendorService singleuserdetails = vendorserviceDao.getById(vendorservice);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}    

	public Response updateData(VendorService vendorservice)
	{
		response.setSuccessful(false);
		vendorserviceDao.updateData(vendorservice);
		response.setSuccessful(true);
		response.setResponseObject(vendorservice);
		return response;
	}*/
	
	/*public Response remove1(String name)
	{
		response.setSuccessful(false);
		createPODAO.remove1(name);
		response.setSuccessful(true);
		response.setResponseObject(name);
		return response;
	}

	public Response getById1(String name)
	{
		response.setSuccessful(false);
		CreatePO singleuserdetails = createPODAO.getById(name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}

	public Response updateData1(CreatePO createposervice)
	{
		response.setSuccessful(false);
		createPODAO.updateData(createposervice);
		response.setSuccessful(true);
		response.setResponseObject(createposervice);
		return response;
	}*/
	

}
