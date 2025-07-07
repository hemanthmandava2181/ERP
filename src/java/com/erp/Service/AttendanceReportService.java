package com.erp.Service;

import java.util.List;
import java.util.Map;

import com.andromeda.commons.model.Response;
import com.erp.DAO.AttendanceReportDAO;


public class AttendanceReportService {
	Response response = new Response();
	private AttendanceReportDAO attendancereportDAO;

	public Response add(AttendanceReportService  attendanceservice) {
		response.setSuccessful(false);
		attendancereportDAO.add(attendanceservice);
		response.setSuccessful(true);
		
		response.setResponseObject(attendanceservice);
		return response;   
	}           
	public Response search(AttendanceReportService attendanceservice) {
		response.setSuccessful(false);
		List<Map<String, Object>> list = attendancereportDAO.search(attendanceservice);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(list);
		return response;
	}   
	
	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = attendancereportDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;     
	}
	
	
}
