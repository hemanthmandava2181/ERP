package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.VendorAppDAO;
import com.erp.Model.Vendor;
import com.erp.Model.VendorApp;


@Service
public class VendorAppService {
	
	Response response = new Response();

	@Autowired
	private VendorAppDAO vendorAppDao;
	
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = vendorAppDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getById(String vendorapp)
	{
		response.setSuccessful(false);   
		VendorApp singleuserdetails = vendorAppDao.getById(vendorapp);
		response.setSuccessful(true);  
		response.setResponseObject(singleuserdetails);
		return response;
	}  
	public Response getNameWiseData(VendorApp vendorapp) {
		response.setSuccessful(false);
		List<VendorApp> nameWiseData = vendorAppDao.getNameWiseData(vendorapp);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}  
	public Response getIdWiseData(VendorApp vendorapp) {
		response.setSuccessful(false);
		List<VendorApp> nameWiseData = vendorAppDao.getIdWiseData(vendorapp);
		response.setSuccessful(true);
		response.setResponseObject(nameWiseData);
		return response;
	}   
	
}