package com.erp.Service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.AttendanceSummaryDAO;
import com.erp.Model.AttendanceSummary;
            
     
@Service
public class AttendanceSummaryService {

	
	Response response = new Response();

	@Autowired
	private AttendanceSummaryDAO attendancesummarydao;
	
	public Response getsummary(AttendanceSummary report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = attendancesummarydao.getsummary(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	     
	
}   
    