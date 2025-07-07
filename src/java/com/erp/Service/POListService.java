package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.POListDAO;
import com.erp.Model.CreatePO;

@Service
public class POListService {
	
	Response response = new Response();

	@Autowired
	private POListDAO polistDao;
	
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getAll1()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.getAll1();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getAll3()
	{  
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.getAll3();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAllpo()
	{  
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.getAllpo();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

	public Response checkedBy()
	{  
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao.checkedBy();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getByPo(String purchaseorder_id)
	{
		response.setSuccessful(false);
		CreatePO singleuserdetails = polistDao.getByPo(purchaseorder_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	
	/*getting vendor invoice field*/
	public Response getVendor()
	{  
		response.setSuccessful(false);
		List<Map<String, Object>> list = polistDao. getVendor();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}


}