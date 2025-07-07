package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.VendorDAO;
import com.erp.Model.Vendor;


@Service
public class VendorService {
	
	Response response = new Response();

	@Autowired
	private VendorDAO vendorDao;
	
	public Response add(Vendor vendor) {
		response.setSuccessful(false);
		vendorDao.add(vendor);
		response.setSuccessful(true);
		
		response.setResponseObject(vendor);
		return response;
	}
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = vendorDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getNameWiseData(Vendor vendor) {
		response.setSuccessful(false);
		List<Vendor> nameWiseData = vendorDao.getNameWiseData(vendor);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}  
	public Response getIdWiseData(Vendor vendor) {
		response.setSuccessful(false);
		List<Vendor> nameWiseData = vendorDao.getIdWiseData(vendor);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}   
	
	public Response getById(String vendor_id)
	{
		response.setSuccessful(false);
		Vendor singleuserdetails = vendorDao.getById(vendor_id);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}    

	public Response updateData(Vendor vendor)
	{
		response.setSuccessful(false);
		vendorDao.updateData(vendor);
		response.setSuccessful(true);
		response.setResponseObject(vendor);
		return response;
	}
	
	public Response getServices()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = vendorDao.getServices();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
}
