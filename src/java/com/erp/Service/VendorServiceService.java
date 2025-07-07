package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.VendorServiceDAO;
import com.erp.Model.Vendor;
import com.erp.Model.VendorService;


@Service
public class VendorServiceService {
	
	Response response = new Response();

	@Autowired
	private VendorServiceDAO vendorserviceDao;
	
	public Response add(VendorService vendorservice) {
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
	}
}
