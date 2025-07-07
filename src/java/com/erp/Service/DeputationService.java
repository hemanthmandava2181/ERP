package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.DeputationDAO;
import com.erp.Model.Deputation;
import com.erp.Model.EmployeeMaster;

@Service
public class DeputationService {
	
	Response response = new Response();
	  @Autowired
	  private DeputationDAO deputationDAO;
	  public Response getYears()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = deputationDAO.getYears();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  
	  
	  public Response getMonths()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = deputationDAO.getMonths();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  
	  public Response getNames()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = deputationDAO.getNames();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  
	  public Response getPname()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = deputationDAO.getPname();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  
	  
	  public Response add(List<Deputation> deps) {
			response.setSuccessful(false);
			for(Deputation dep : deps)
				deputationDAO.add(dep);
			response.setSuccessful(true);
			return response;
		}

}
