package com.erp.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;

import com.erp.Model.ReportsEmployee;
import com.erp.Service.ReportService; 
@RestController
@RequestMapping("/report")
public class ReportController {           
	@Autowired
	private ReportService  reportservice;     

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getYears", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getYears() { return
	 * reportservice.getYears(); }
	 */
	/*get newjoinerscount*/                                   
	@ResponseBody
	@RequestMapping(value = "getNewjoinerscount", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNewjoinerscount()
	{
		return reportservice.getNewjoinerscount();
	}
	/*get Stopsalarry count*/
	@ResponseBody
	@RequestMapping(value = "getStopsalarycount", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getStopsalarycount()
	{
		return reportservice.getStopsalarycount();
	}
	/*get Relievingemployeescount*/
	@ResponseBody
	@RequestMapping(value = "getRelievingemployeescount", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getRelievingemployeescount()
	{
		return reportservice.getRelievingemployeescount();
	}
	/*get employeesrevisioncount*/
	@ResponseBody
	@RequestMapping(value = "getEmployeesalRevisioncount", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeesalRevisioncount()
	{
		return reportservice.getEmployeesalRevisioncount();
	}
	 
	
	/*HRMS REPORTS DATA*/
	
	@ResponseBody
	@RequestMapping(value = "getLetterheads", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLetterheads()
	{
		return reportservice.getLetterheads();
	}
	/*get all data */
	@ResponseBody
	@RequestMapping(value = "getAlldata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAlldata()
	{
		return reportservice.getAlldata(); 
	}
	
	
	/*get all Exception report*/
	
	@ResponseBody   
	@RequestMapping(value = "getAllExceptionReport", method = RequestMethod.GET)
	public Response getAllExceptionReport()
	{
		return reportservice.getAllExceptionReport();
	}
	
	
	@ResponseBody   
	@RequestMapping(value = "getAllcocexception", method = RequestMethod.GET)
	public Response getAllcocexception()
	{
		return reportservice.getAllcocexception();
	}
	
	@ResponseBody
	@RequestMapping(value = "/getExceptiondata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getExceptiondata(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getExceptiondata(employee);
	} 
	
	
	@ResponseBody
	@RequestMapping(value = "/getloginreport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getloginreport(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getloginreport(employee);
	} 
	
	@ResponseBody
	@RequestMapping(value = "/getclaimsquarterwise", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getclaimsquarterwise(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getclaimsquarterwise(employee);
	} 
	
	
	@ResponseBody
	@RequestMapping(value = "/getclaimsreport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getclaimsreport(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getclaimsreport(employee);
	} 
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeStatusReport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeStatusReport(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeStatusReport(employee);
	} 
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeKotak", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeKotak(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeKotak(employee);
	}              
	
	@ResponseBody
	@RequestMapping(value = "/getOthetKotakbank", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getOthetKotakbank(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getOthetKotakbank(employee);
	} 
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getAllBank", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllBank(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getAllBank(employee);
	} 
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getAllExceptiondata", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllExceptiondata(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getAllExceptiondata(employee);
	} 
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeStatusRelievingReport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeStatusRelievingReport(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeStatusRelievingReport(employee);
	} 
	
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeStatusStopReport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeStatusStopReport(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeStatusStopReport(employee);
	} 
	
	@ResponseBody
	@RequestMapping(value = "/getAllcfms", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllcfms(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getAllcfms(employee);
	} 
	
	@ResponseBody
	@RequestMapping(value = "/getImprestreport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getImprestreport(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getImprestreport(employee);
	} 
	
	@ResponseBody
	@RequestMapping(value = "/getclaminscompare", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getclaminscompare(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getclaminscompare(employee);
	} 
	
	///////////////payroll/////////////
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeStaffwise", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeStaffwise(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeStaffwise(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeePaytype", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getEmployeePaytype(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeePaytype(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeSaturation", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getEmployeeSaturation(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeSaturation(employee);
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeDeputation", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getEmployeeDeputation(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeDeputation(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeOthers", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getEmployeeOthers(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeOthers(employee);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeStaff", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getEmployeeStaff(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeStaff(employee);
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "/getEmployeeMonthlyRecouncilation", method = { RequestMethod.POST, RequestMethod.GET })
	
	public Response getEmployeeMonthlyRecouncilation(@RequestBody ReportsEmployee employee)
	{
		return reportservice.getEmployeeMonthlyRecouncilation(employee);
	}
	
	
	/*HRMS REPORTSD DATA END*/
	
	
	
	@ResponseBody
	@RequestMapping(value = {"/getloginreports"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getloginreports(@RequestBody ReportsEmployee report)
	{
		return reportservice.getloginreports(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getLeavesReport"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeavesReport(@RequestBody ReportsEmployee report)
	{
		return reportservice.getLeavesReport(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getDefaultLogins"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDefaultLogins(@RequestBody ReportsEmployee report)
	{
		return reportservice.getDefaultLogins(report);
	}
	
	@ResponseBody
	@RequestMapping(value = {"/getMissedlogin"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMissedlogin(@RequestBody ReportsEmployee report)
	{
		return reportservice.getMissedlogin(report);
	}
	
	@ResponseBody
	@RequestMapping(value = {"/getAllReports"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllReports(@RequestBody ReportsEmployee report)
	{
		return reportservice.getAllReports(report);
	}

	@ResponseBody
	@RequestMapping(value = {"/getLoginbefore11"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLoginbefore11(@RequestBody ReportsEmployee report)
	{
		return reportservice.getLoginbefore11(report);
	}
	
	@ResponseBody
	@RequestMapping(value = {"/getLoginafter11"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLoginafter11(@RequestBody ReportsEmployee report)
	{
		return reportservice.getLoginafter11(report);
	}
	
	
	
	/*HRMS REPORTSD DATA END*/
	
	
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "saveReqTypeDetails", method = { RequestMethod.POST })
	public Response saveReqTypeDetails(@RequestBody ReportsEmployee report)
	{
		return reportservice.saveReqTypeDetails(report);
	}
	 
	@ResponseBody
	@RequestMapping(value = "getAllHelpdeskReqType", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllHelpdeskReqType()
	{
		return reportservice.getAllHelpdeskReqType();
	}   
	@ResponseBody
	@RequestMapping(value = "getByIdCategories", method = { RequestMethod.POST })
	public Response getByIdCategories(@RequestBody Integer helpdesk_categoryid)  
	{
		return reportservice.getByIdCategories(helpdesk_categoryid);
	}	
	
	@ResponseBody
	@RequestMapping(value = "updateReqTypeData", method = { RequestMethod.POST })
	public Response updateReqTypeData(@RequestBody ReportsEmployee report)
	{
		return reportservice.updateReqTypeData(report);
	}
		
	
	@ResponseBody
	@RequestMapping(value = "getCoCExceptionReport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCoCExceptionReport()
	{
		return reportservice.getCoCExceptionReport();
	}
	
	@ResponseBody
	@RequestMapping(value = "getMonths", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMonths()
	{     
		return reportservice.getMonths();
	}	
	@ResponseBody
	@RequestMapping(value = {"/getCfmsReportOthers"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCfmsReportOthers(@RequestBody ReportsEmployee report)
	{
		return reportservice.getCfmsReportOthers(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getCfmsReportDeputations"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCfmsReportDeputations(@RequestBody ReportsEmployee report)
	{
		return reportservice.getCfmsReportDeputations(report);
	}
	@ResponseBody
	@RequestMapping(value = {"/getCfmsReport"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCfmsReport(@RequestBody ReportsEmployee report)
	{
		return reportservice.getCfmsReport(report);
	}
	/* employee history*/
	@ResponseBody
	@RequestMapping(value = {"/getEmployeeHistory"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeHistory(@RequestBody ReportsEmployee report)
	{
		return reportservice.getEmployeeHistory(report);
	}
	@ResponseBody
	@RequestMapping(value = "getAllEmployeeHistory", method = {RequestMethod.GET })
	public Response getAllEmployeeHistory()
	{
		return reportservice.getAllEmployeeHistory();
	}	
	@ResponseBody
	@RequestMapping(value = "getEmployeeEmploymentDetails", method = {RequestMethod.GET })
	public Response getEmployeeEmploymentDetails()
	{
		return reportservice.getEmployeeEmploymentDetails();
	}	
	@ResponseBody
	@RequestMapping(value = "getEmployeeProjectDetails", method = {RequestMethod.GET })
	public Response getEmployeeProjectDetails()
	{
		return reportservice.getEmployeeProjectDetails();
	}	
	@ResponseBody
	@RequestMapping(value = "getEmployeeSalaryDetails", method = {RequestMethod.GET })
	public Response getEmployeeSalaryDetails()
	{
		return reportservice.getEmployeeSalaryDetails();
	}
	@ResponseBody
	@RequestMapping(value = "getByIdEmployeeHistory", method = { RequestMethod.POST })
	public Response getByIdEmployeeHistory(@RequestBody String empid)  
	{
		return reportservice.getByIdEmployeeHistory(empid);
	}
	/*end  employee history*/
	@ResponseBody
	@RequestMapping(value = {"/getCTCReports"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCTCReports(@RequestBody ReportsEmployee report)
	{
		return reportservice.getCTCReports(report);
	}
	@ResponseBody
	@RequestMapping(value = "getEmployeeIds", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeIds()
	{
		return reportservice.getEmployeeIds();
	}	
	@ResponseBody
	@RequestMapping(value = "getEmployeeTypes", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeTypes()
	{
		return reportservice.getEmployeeTypes();
	}
	@ResponseBody
	@RequestMapping(value = "getCalendarYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCalendarYears()
	{
		return reportservice.getCalendarYears();
	}	
	@ResponseBody
	@RequestMapping(value = "getQuarters", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getQuarters()
	{
		return reportservice.getQuarters();
	}
	@ResponseBody
	@RequestMapping(value = {"/getLeaveSummaryReport"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeaveSummaryReport(@RequestBody ReportsEmployee report)
	{
		return reportservice.getLeaveSummaryReport(report);
	}
@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return reportservice.getYears();
	}	
	
@ResponseBody
@RequestMapping(value = "GetProfilereport", method = { RequestMethod.POST, RequestMethod.GET })
public Response GetProfilereport()
{
	return reportservice.GetProfilereport();
}	
	

@ResponseBody
@RequestMapping(value = "GetAttendanceoverviewreport", method = { RequestMethod.POST, RequestMethod.GET })
public Response GetAttendanceoverviewreport()
{
	return reportservice.GetAttendanceoverviewreport();
}	

@ResponseBody
@RequestMapping(value = "/getSingleEmpData", method = { RequestMethod.POST, RequestMethod.GET })

public Response getSingleEmpData(@RequestBody ReportsEmployee employee)
{
	return reportservice.getSingleEmpData(employee);
}

	
	
}             