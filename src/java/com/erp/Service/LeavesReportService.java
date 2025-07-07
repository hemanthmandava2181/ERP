package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.LeavesReportDAO;
import com.erp.Model.LeavesReport;
import com.erp.Model.EmployeeMaster;          
 
@Service
public class LeavesReportService {

	
	Response response = new Response();

	@Autowired
	private LeavesReportDAO leavesReportDao;
	
	public Response getleavesDetailedReport(LeavesReport report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = leavesReportDao.getleavesDetailedReport(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response GetLeavesReport(LeavesReport report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = leavesReportDao.GetLeavesReport(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
public Response getSummary1(LeavesReport report1)
	{
		response.setSuccessful(false);
		Map<String, Object> list = leavesReportDao.getSummary1(report1);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

public Response getQuarters()
{
	response.setSuccessful(false);
	List<Map<String, Object>> list = leavesReportDao.getQuarters();
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}


public Response getYears()
{
	response.setSuccessful(false);
	List<Map<String, Object>> list = leavesReportDao.getYears();
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}

public Response getCalendarYears()
{
	response.setSuccessful(false);
	List<Map<String, Object>> list = leavesReportDao.getCalendarYears();
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}

public Response getLeaveEncashmentDetails(LeavesReport report)
{
	response.setSuccessful(false);
	Map<String, Object> list = leavesReportDao.getLeaveEncashmentDetails(report);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}

public Response getInactiveLeaveEncashmentDetails(LeavesReport report)
{
	response.setSuccessful(false);
	Map<String, Object> list = leavesReportDao.getInactiveLeaveEncashmentDetails(report);
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}



public Response getMonths()
{
	response.setSuccessful(false);
	List<Map<String, Object>> list = leavesReportDao.getMonths();
	response.setSuccessful(true);
	response.setResponseObject(list);
	return response;
}

	
	public Response getLeaves()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = leavesReportDao.getLeaves();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getEmployees(LeavesReport report)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = leavesReportDao.getEmployees(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getEmployeeLOPDetails(LeavesReport report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = leavesReportDao.getEmployeeLOPDetails(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getLOPCount(LeavesReport report)
	{
		response.setSuccessful(false);
		List<Map<String,Object>> list = leavesReportDao.getLOPCount(report);
		response.setResponseObject(list);
		response.setSuccessful(true);    
		return response;
	}  
	
	
	
	
	public Response GetLeavesSummaryReport(LeavesReport report)
	{
		response.setSuccessful(false);
		List<Map<String,Object>> list = leavesReportDao.GetLeavesSummaryReport(report);
		response.setResponseObject(list);
		response.setSuccessful(true);    
		return response;
	} 
	

	public Response saveEmployeeLOPDetails(LeavesReport report)
	{
		response.setSuccessful(false);
		Integer status = leavesReportDao.saveEmployeeLOPDetails(report);
		if(status != 0){  
		response.setSuccessful(true);
		}else{
		response.setSuccessful(false);
		}
		return response;
	}
	
	public Response releaseamount(String empid)
	{
		response.setSuccessful(false);
		LeavesReport   singleuserdetails = leavesReportDao.releaseamount(empid);
		response.setResponseObject(singleuserdetails);
		response.setSuccessful(true);    
		return response;
	}  

	public Response Insertloppayrolldata(LeavesReport report)
	{
		response.setSuccessful(false);
	leavesReportDao.Insertloppayrolldata(report);
		
		response.setSuccessful(true);
	
		response.setSuccessful(false);
		
		return response;
	}
	
	public Response EncashmentStatus()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = leavesReportDao.EncashmentStatus();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}

		public Response GetEncashdetails(LeavesReport report)
		{
			response.setSuccessful(false);
			Map<String,Object> list = leavesReportDao.GetEncashdetails(report);
			response.setResponseObject(list);
			response.setSuccessful(true);    
			return response;
		} 
		
			public Response LeaveEncashdataprocess(LeavesReport report)
		{
			response.setSuccessful(false);
			leavesReportDao.LeaveEncashdataprocess(report);
			response.setSuccessful(true);
			response.setResponseObject(true);
			return response;
		}
		
		
		public Response UpdateEmployerelieveing(EmployeeMaster employee)
		{
			response.setSuccessful(false);
			leavesReportDao.UpdateEmployerelieveing(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}
		
		public Response getLeavesDetails()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = leavesReportDao.getLeavesDetails();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response getLeaveRules()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = leavesReportDao.getLeaveRules();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response getByLeave(Integer leave_type)   
		  {
		    this.response.setSuccessful(false);
		    List<Map<String, Object>> map = this.leavesReportDao.getByLeave(leave_type);
		    this.response.setResponseObject(map);
		    this.response.setSuccessful(true);
		    return this.response;
		  }
		  
		public Response saveData(LeavesReport report) {
			response.setSuccessful(false);
			leavesReportDao.saveData(report);
			response.setSuccessful(true);
			response.setResponseObject(report);
			return response;
		}
		
		public Response update(LeavesReport report)
		{
			response.setSuccessful(false);
			Integer status = leavesReportDao.update(report);
			if(status != 0){  
			response.setSuccessful(true);
			}else{
			response.setSuccessful(false);
			}
			return response;
		}
		
		public Response saveLeaveType(LeavesReport report)
		{
			response.setSuccessful(false);
			Integer status = leavesReportDao.saveLeaveType(report);
			if(status != 0){  
			response.setSuccessful(true);
			}else{
			response.setSuccessful(false);
			}
			return response;
		}
}
