package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.LeavesReport;

import com.erp.Model.EmployeeMaster;
import com.erp.Service.LeavesReportService;

@RestController
@RequestMapping("/leavesreport")
public class LeavesReportController {
	@Autowired
	LeavesReportService leavesReportservice;

	@ResponseBody
	@RequestMapping(value = "getLeaves", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeaves() {
		return leavesReportservice.getLeaves();
	}

	@ResponseBody
	@RequestMapping(value = { "/getleavesDetailedReport" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getleavesDetailReport(@RequestBody LeavesReport report) {
		return leavesReportservice.getleavesDetailedReport(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/GetLeavesReport" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response GetLeavesReport(@RequestBody LeavesReport report) {
		return leavesReportservice.GetLeavesReport(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/getSummary1" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSummary(@RequestBody LeavesReport report1) {
		return leavesReportservice.getSummary1(report1);
	}

	@ResponseBody
	@RequestMapping(value = { "/getYears" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears() {
		return leavesReportservice.getYears();
	}

	@ResponseBody
	@RequestMapping(value = { "/getCalendarYears" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCalendarYears() {
		return leavesReportservice.getCalendarYears();
	}

	@ResponseBody
	@RequestMapping(value = { "/getInactiveLeaveEncashmentDetails" }, method = { RequestMethod.POST,
			RequestMethod.GET })
	public Response getInactiveLeaveEncashmentDetails(@RequestBody LeavesReport report) {
		return leavesReportservice.getInactiveLeaveEncashmentDetails(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/getLeaveEncashmentDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeaveEncashmentDetails(@RequestBody LeavesReport report) {
		return leavesReportservice.getLeaveEncashmentDetails(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/getMonths" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMonths() {
		return leavesReportservice.getMonths();
	}

	@RequestMapping(value = { "/getQuarters" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getQuarters() {
		return leavesReportservice.getQuarters();
	}

	@ResponseBody
	@RequestMapping(value = { "/getEmployees" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployees(@RequestBody LeavesReport report) {
		return leavesReportservice.getEmployees(report);

	}

	@ResponseBody
	@RequestMapping(value = { "/getEmployeeLOPDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmployeeLOPDetails(@RequestBody LeavesReport report) {
		return leavesReportservice.getEmployeeLOPDetails(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/getLOPCount" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLOPCount(@RequestBody LeavesReport report) {
		return leavesReportservice.getLOPCount(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/saveEmployeeLOPDetails" }, method = { RequestMethod.POST })
	public Response saveEmployeeLOPDetails(@RequestBody LeavesReport report) {
		return leavesReportservice.saveEmployeeLOPDetails(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/GetLeavesSummaryReport" }, method = { RequestMethod.POST })
	public Response GetLeavesSummaryReport(@RequestBody LeavesReport report) {
		return leavesReportservice.GetLeavesSummaryReport(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/releaseamount" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response releaseamount(@RequestBody String empid) {
		return leavesReportservice.releaseamount(empid);
	}

	@ResponseBody
	@RequestMapping(value = { "/Insertloppayrolldata" }, method = { RequestMethod.POST })
	public Response Insertloppayrolldata(@RequestBody LeavesReport report) {
		return leavesReportservice.Insertloppayrolldata(report);
	}

	@ResponseBody
	@RequestMapping(value = { "/EncashmentStatus" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response EncashmentStatus() {
		return leavesReportservice.EncashmentStatus();
	}

	@ResponseBody
	@RequestMapping(value = { "/GetEncashdetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response GetEncashdetails(@RequestBody LeavesReport report) {
		return leavesReportservice.GetEncashdetails(report);
	}

	@ResponseBody
	@RequestMapping(value = { "LeaveEncashdataprocess" }, method = { RequestMethod.POST })
	public Response LeaveEncashdataprocess(@RequestBody LeavesReport report) {
		return leavesReportservice.LeaveEncashdataprocess(report);
	}

	@ResponseBody
	@RequestMapping(value = "UpdateEmployerelieveing", method = { RequestMethod.POST })
	public Response UpdateEmployerelieveing(@RequestBody EmployeeMaster employee) {
		return leavesReportservice.UpdateEmployerelieveing(employee);
	}
	
	@ResponseBody
	@RequestMapping(value = "getLeavesDetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeavesDetails()
	{
		return leavesReportservice.getLeavesDetails();
	}	
	
	@ResponseBody
	@RequestMapping(value = "getLeaveRules", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLeaveRules()
	{
		return leavesReportservice.getLeaveRules();
	}
	
	@RequestMapping(value = { "/saveData" }, method = { RequestMethod.POST })
	public Response saveData(@RequestBody LeavesReport report)
	{ 
		return leavesReportservice.saveData(report);      
	}
	
	@ResponseBody
	@RequestMapping(value = { "/update" }, method = { RequestMethod.POST })
	public Response update(@RequestBody LeavesReport report)
	{ 
		return leavesReportservice.update(report);      
	}
	
	@ResponseBody
	@RequestMapping(value = "getByLeave", method = { RequestMethod.POST,RequestMethod.GET})
	public Response getByLeave(@RequestBody Integer leave_type)
	{
		
		return this.leavesReportservice.getByLeave(leave_type);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/saveLeaveType" }, method = { RequestMethod.POST })
	public Response saveLeaveType(@RequestBody LeavesReport report)
	{ 
		return leavesReportservice.saveLeaveType(report);      
	} 

}
