package com.erp.Controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.text.ParseException;
import com.erp.Model.Attendance;
import com.erp.Model.Login;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.erp.Service.AttendanceService;
       
@RestController
@RequestMapping("/attendance")
public class AttendanceController {
	Response response = new Response();
	public static final String AUTH_KEY_FCM = "AAAAP4ondOo:APA91bFzqTDHTZ4QdKETWK0jzze0aX3cX1cEf3dxMLs-4hE-Tj1yZfT8AhpBMOmQdB64qgrfwIp7nL8oDa17AA-b3-sEAiTdbLJpOx2mVWd1qeVv3FtpMTIHGkgGjEyUadcJmz-w1r2E";
	public static final String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";
	@Autowired
	private AttendanceService attendanceService;

	@ResponseBody
	@RequestMapping(value = { "getAppVersion" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST,
			org.springframework.web.bind.annotation.RequestMethod.GET })
	public Response getAppVersion() {
		return this.attendanceService.getAppVersion();
	} 

	
	
	/* Getting details in Attendance Sheet */
	
	@ResponseBody
	@RequestMapping(value = "/getDetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDetails(@RequestBody Attendance attendance)
	{
		return attendanceService.getDetails(attendance);
	}
	
	
	@ResponseBody
	@RequestMapping(value = {"/apprvedTimesheets"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response apprvedTimesheets(@RequestBody Attendance attendance)
	{
		return attendanceService.apprvedTimesheets(attendance);
	}
	
	
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = { "/savePresentEmployees" }, method = {
	 * RequestMethod.POST }) public Response savePresentEmployees(@RequestBody Login
	 * login) throws ParseException { return
	 * attendanceService.savePresentEmployees(login); }
	 */
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = { "/updatePresentEmployees" }, method = {
	 * RequestMethod.POST }) public Response updatePresentEmployees(@RequestBody
	 * Login login) throws ParseException { return
	 * attendanceService.updatePresentEmployees(login); }
	 */

	/*get attendance report*/     
	@ResponseBody      
	@RequestMapping(value = "getStaff", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAttendance()
	{
		return attendanceService.getStaff();
	}
	/*@ResponseBody
	  @RequestMapping(value={"getAttendance"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById(@RequestBody String empid)
	  {
		
	    return this.attendanceService.getAttendance(empid);
	  } 
	
*/
	@ResponseBody
	@RequestMapping(value = "/getReport", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReport(@RequestBody Attendance attendance)
	{
		return attendanceService.getReport(attendance);
	}
	
	
	 /*get dashboard login time*/
	/*@ResponseBody
	@RequestMapping(value = "getdashboard", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getdashboard()
	{
		return attendanceService.getdashboard();
	}
	*/
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value={"getdashboard"}, method={ RequestMethod.POST,
	 * RequestMethod.GET }) public Response getById(@RequestBody Login login) {
	 * 
	 * return this.attendanceService.getdashboard(login); }
	 */
	
	
	/* getting calendar details based on from date,to date*/
	@ResponseBody
	@RequestMapping(value = {"/getCalendarDetails"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCalendarDetails(@RequestBody Attendance attendance)
	{
		return attendanceService.getCalendarDetails(attendance);
	}
	
/* Updating attendance to absent in attendance sheet */
	
	@ResponseBody
	@RequestMapping(value = "updateattendance", method = { RequestMethod.POST })
	public Response updateAttendance(@RequestBody Attendance attendance)
	{
		return attendanceService.updateattendance(attendance);
	}
	
	/* for attendance update to present in attendance sheet */
	
	@ResponseBody
	@RequestMapping(value = "updateattendancepresent", method = { RequestMethod.POST })
	public Response updateattendancepresent(@RequestBody Attendance attendance)
	{
		return attendanceService.updateattendancepresent(attendance);
	}
	
	/* for attendance update to leave in attendance sheet */
	
	@ResponseBody
	@RequestMapping(value = "updateattendanceleave", method = { RequestMethod.POST })
	public Response updateattendanceleave(@RequestBody Attendance attendance)
	{
		return attendanceService.updateattendanceleave(attendance);
	}
	
	/* getting calendar details based on from date,to date*/
	@ResponseBody
	@RequestMapping(value = {"/getCalendarDetailsdet"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCalendarDetailsdet(@RequestBody Attendance attendance)
	{
		return attendanceService.getCalendarDetailsdet(attendance);
	}
	
	/*get years*/
	@ResponseBody
	@RequestMapping(value = "getyears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getyears()
	{
		return attendanceService.getyears();
	}

	/* getting myleaves details based on year,leavetype*/
	@ResponseBody
	@RequestMapping(value = {"/getMyleavesDetails"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMyleavesDetails(@RequestBody Attendance attendance)
	{
		
		return attendanceService.getMyleavesDetails(attendance);
		
	}  

	/* calendar page  */
	@ResponseBody
	@RequestMapping(value = "addcalendar", method = { RequestMethod.POST })
	public Response addcalendar(@RequestBody Attendance attendance)
	{
		return attendanceService.addcalendar(attendance);
	}


	/* getting myteam leaves details based on from date,to date*/
	
	@ResponseBody
	@RequestMapping(value = {"/getMyTeamDetails"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMyTeamDetails(@RequestBody Attendance attendance)
	{
		return attendanceService.getMyTeamDetails(attendance);
	}
	
	/* dash board */
	
	@ResponseBody
	@RequestMapping(value = { "/savePresentEmployees" }, method = { RequestMethod.POST })
	public Response savePresentEmployees(@RequestBody Login login) throws ParseException {
		return attendanceService.savePresentEmployees(login);
	}
	
	@ResponseBody
	@RequestMapping(value = { "/updatePresentEmployees" }, method = { RequestMethod.POST })
	public Response updatePresentEmployees(@RequestBody Login login) throws ParseException {
		return attendanceService.updatePresentEmployees(login);
	}
/*get dashboard login time*/
	
	@ResponseBody
	  @RequestMapping(value={"getdashboard"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById(@RequestBody Login login)
	  {
		
	    return this.attendanceService.getdashboard(login);
	  } 

	@ResponseBody  
	@RequestMapping(value = { "/getCompoff" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCompoff(@RequestBody Attendance faculty)
	{
	return attendanceService.getCompoff(faculty);  
	}
	
	  @ResponseBody
	  @RequestMapping(value={"getAbsentees"}, method={org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
	  public Response getAbsentees(@RequestBody String date)
	  {
	    return this.attendanceService.getAbsentees(date);
	  }
	  
	  @ResponseBody
		@RequestMapping(value = { "/updateAttendance" }, method = { RequestMethod.POST , RequestMethod.GET  })
			public Response updateAttendance(@RequestBody Login sdcModel) throws ParseException
			{
			
				return attendanceService.updateAttendance(sdcModel);
			}
		
		
	
}
