
package com.erp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.LeaveStatusDAO;
import com.erp.Model.LeaveStatus;

@Service
public class LeaveStatusService {

	Response response = new Response();

	@Autowired
	private LeaveStatusDAO leavestatusDAO;

	
	public Response getAllLeaves(String empid)
	{
	  this.response.setSuccessful(false);
	  LeaveStatus singleuserdetails = this.leavestatusDAO. getAllLeaves(empid);
	  this.response.setSuccessful(true);
	  this.response.setResponseObject(singleuserdetails);
	  return this.response;
	}
	

}
