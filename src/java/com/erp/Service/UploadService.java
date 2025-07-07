
package com.erp.Service;
import java.util.List;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.UploadDAO;
import com.erp.Model.Upload;


@Service
public class UploadService {
	Response response = new Response();

	@Autowired
	private UploadDAO UploadDAO;

	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = UploadDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	 public Response saveDetails(List<Upload> employee, String ipAddress, List<String> pathsList)
	  {
	    this.response.setSuccessful(false);
	    Map<String, Object> list=this.UploadDAO.saveDetails(employee, ipAddress);
	    
	    Upload filePathsMail = new Upload();
	    
	    filePathsMail.setPaths(pathsList);
	    
	   // mailSend(filePathsMail);
	    
	    this.response.setSuccessful(true);
	    response.setResponseObject(list);
	    
	    return this.response;
	  }
            

	public Response getYear()
	{
		response.setSuccessful(false);
		Upload data = UploadDAO.getYear();
	    response.setResponseObject(data);
	    response.setSuccessful(true);
	    return response;
	}
	
	/*public Response getAll() {
	response.setSuccessful(false);
	List<AddQualification> addQualification = addQualificationDAO.getAll();
	response.setSuccessful(true);
	response.setResponseObject(addQualification);
	return response;
}*/
	
}