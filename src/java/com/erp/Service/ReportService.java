
package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.ReportDAO;

import com.erp.Model.ReportsEmployee;



@Service
public class ReportService {
	
	Response response = new Response();

	@Autowired
	private ReportDAO reportDAO;
	
	
	
	public Response getNewjoinerscount()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO. getNewjoinerscount();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getStopsalarycount()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO. getStopsalarycount();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getRelievingemployeescount()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO. getRelievingemployeescount();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getEmployeesalRevisioncount()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO. getEmployeesalRevisioncount();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response getLetterheads()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO.getLetterheads();
	//	Map<String, Object> map = reportDAO.getLetterheads();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAlldata()
	{
		response.setSuccessful(false);
		Map<String, Object> map = reportDAO.getAlldata();
		response.setSuccessful(true);
		response.setResponseObject(map);
		return response;
	}
	
	public Response getAllCadergrades()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO.getAllCadergrades();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAllExceptionReport()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO.getAllExceptionReport();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getAllcocexception()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = reportDAO.getAllcocexception();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	  /* Getting Exception data by status */
	  
	  public Response getExceptiondata(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getExceptiondata(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getloginreport(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getloginreport(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getclaimsquarterwise(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getclaimsquarterwise(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getclaimsreport(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getclaimsreport(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getEmployeeStatusReport(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeStatusReport(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getEmployeeKotak(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeKotak(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getOthetKotakbank(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getOthetKotakbank(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getAllBank(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getAllBank(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  
	  
	  
	  
	  
	  
	  
	  public Response getAllExceptiondata(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getAllExceptiondata(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  
	  public Response getEmployeeStatusRelievingReport(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeStatusRelievingReport(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  
	  public Response getEmployeeStatusStopReport(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeStatusStopReport(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getAllcfms(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getAllcfms(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getImprestreport(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getImprestreport(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  public Response getclaminscompare(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getclaminscompare(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getEmployeeStaffwise(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeStaffwise(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getEmployeePaytype(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeePaytype(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getEmployeeSaturation(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeSaturation(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  
	  
	  
	  
	  public Response getEmployeeStaff(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeStaff(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getEmployeeOthers(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeOthers(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  public Response getEmployeeDeputation(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeDeputation(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  
	  
	  public Response getEmployeeMonthlyRecouncilation(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getEmployeeMonthlyRecouncilation(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	  
	  public Response getLoginbefore11(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getLoginbefore11(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 
	  public Response getLoginafter11(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getLoginafter11(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
	  public Response  getMissedlogin(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO. getMissedlogin(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
	  public Response  getAllReports(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO. getAllReports(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
	  public Response getDefaultLogins(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO. getDefaultLogins(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	
	  public Response getLeavesReport(ReportsEmployee report)
			{
				response.setSuccessful(false);
				Map<String, Object> list = reportDAO. getLeavesReport(report);
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}

		public Response getloginreports(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getloginreports(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}

	
	  public Response getCoCExceptionReport() {
			response.setSuccessful(false);
			List<ReportsEmployee> userdetails =  reportDAO.getCoCExceptionReport();
			response.setSuccessful(true);
			response.setResponseObject(userdetails);
			return response;
		}         
	  
	  public Response getMonths()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getMonths();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  public Response getCfmsReport(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getCfmsReport(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  public Response getCfmsReportOthers(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getCfmsReportOthers(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  public Response getCfmsReportDeputations(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getCfmsReportDeputations(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  /* employee history*/
	 
	  public Response getEmployeeHistory(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getEmployeeHistory(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  public Response getAllEmployeeHistory()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getAllEmployeeHistory();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  public Response getEmployeeEmploymentDetails()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getEmployeeEmploymentDetails();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}

	  public Response getEmployeeProjectDetails()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getEmployeeProjectDetails();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}

	  public Response getEmployeeSalaryDetails()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getEmployeeSalaryDetails();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}

	  public Response getByIdEmployeeHistory(String empid)
		{
			response.setSuccessful(false);
			ReportsEmployee singleuserdetails = reportDAO.getByIdEmployeeHistory(empid);
			response.setSuccessful(true);
			response.setResponseObject(singleuserdetails);   
			return response;
		}
	  /*end  employee history*/
	  
	  public Response getCTCReports(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getCTCReports(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		} 
	  public Response getEmployeeIds()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getEmployeeIds();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  public Response getEmployeeTypes()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getEmployeeTypes();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	
	
	  public Response getYears()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getYears();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
public Response getCalendarYears()
			{
				response.setSuccessful(false);
				List<Map<String, Object>> list = reportDAO.getCalendarYears();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
	  public Response getQuarters()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.getQuarters();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  public Response getLeaveSummaryReport(ReportsEmployee report)
		{
			response.setSuccessful(false);
			Map<String, Object> list = reportDAO.getLeaveSummaryReport(report);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  
	  
	  public Response saveReqTypeDetails(ReportsEmployee report) {
			response.setSuccessful(false);
			reportDAO.saveReqTypeDetails(report);
			response.setSuccessful(true);
			response.setResponseObject(report);
			return response;
		}
		public Response getByIdCategories (Integer helpdesk_categoryid)
		{
			response.setSuccessful(false);
			ReportsEmployee  singleuserdetails = reportDAO.getByIdCategories(helpdesk_categoryid);
			response.setSuccessful(true);
			response.setResponseObject(singleuserdetails);   
			return response;
		}
		public Response getAllHelpdeskReqType() {
			response.setSuccessful(false);
			List<ReportsEmployee> userdetails = reportDAO.getAllHelpdeskReqType();
			response.setSuccessful(true);
			response.setResponseObject(userdetails);
			return response;
		}

	  public Response updateReqTypeData(ReportsEmployee report)
		{
			response.setSuccessful(false);
			reportDAO.updateReqTypeData(report);
			response.setSuccessful(true);
			response.setResponseObject(report);
			return response;
		}
	
	  public Response GetProfilereport()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.GetProfilereport();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  
	  public Response GetAttendanceoverviewreport()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = reportDAO.GetAttendanceoverviewreport();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	  
	  public Response getSingleEmpData(ReportsEmployee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = reportDAO.getSingleEmpData(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }

	  
}
