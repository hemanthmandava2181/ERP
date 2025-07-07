package com.erp.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.AttendanceReport;
import com.erp.Service.AttendanceReportService;
@RestController
@RequestMapping("/attendance")
public class AttendanceReportController {
	private AttendanceReport  attendanceservice;   
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody AttendanceReportService  attendanceservice)
	{    
		System.out.println("hi");
		return attendanceservice.add(attendanceservice);
		       
	}    
	/*@ResponseBody        
	@RequestMapping(value = "search", method = { RequestMethod.POST })
	public Response search(@RequestBody AttendanceReportService  attendanceservice )
	{
		return attendanceservice.search(attendanceservice);
		       
	}
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return attendanceservice.getAll();
	} 
*/
}
