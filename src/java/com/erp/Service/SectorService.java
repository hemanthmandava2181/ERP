package com.erp.Service;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;

import com.erp.DAO.SectorDAO;
import com.erp.Model.Sector;

@Service
public class SectorService {
	@Autowired
	private SectorDAO sectorDAO;

	Response response = new Response();
	public Response add(Sector sectorModel) {
		response.setSuccessful(false);
		sectorDAO.add(sectorModel);
		response.setSuccessful(true);            
		response.setResponseObject(sectorModel);
		return response;
	}
	public Response getById(String sector_name)
	{
		response.setSuccessful(false);
		Sector singleuserdetails = sectorDAO.getById(sector_name);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getAll() {
		response.setSuccessful(false);
		List<Sector> userdetails = sectorDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}

	public Response remove(String sector_name)
	{
		response.setSuccessful(false);
		sectorDAO.remove(sector_name);
		response.setSuccessful(true);
		response.setResponseObject(sector_name);
		return response;
	}

	
	public Response updateData(Sector sector)
	{
		response.setSuccessful(false);
		 sectorDAO.updateData( sector);
		response.setSuccessful(true);
		response.setResponseObject( sector);
		return response;
	}
	                 
}