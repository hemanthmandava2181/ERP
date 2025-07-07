package com.erp.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
   
   
import com.erp.DAO.AttendanceDAO;
import com.erp.Model.Attendance;
/*
import in.apssdc.security.model.Attendance;
import in.apssdc.security.model.BiometricData;
import in.apssdc.security.model.Colleges;
import in.apssdc.security.model.DateWiseAttendance;
import in.apssdc.security.model.Employee;
import in.apssdc.security.model.Enquiry;
import in.apssdc.security.model.FilePathtoServer;*/
import com.erp.Model.Login;




@Service
public class AttendanceService   
{
  Response response = new Response();
  @Autowired
  private AttendanceDAO attendanceDAO;
  
  public Response getAppVersion()
  {
    this.response.setSuccessful(false);
    String version = this.attendanceDAO.getVersion();
    this.response.setSuccessful(true);
    this.response.setResponseObject(version);
    return this.response;
  }
  
  
	/*
	 * public Response savePresentEmployees(Login login) throws ParseException {
	 * response.setSuccessful(false); attendanceDAO.savePresentEmployees(login);
	 * response.setSuccessful(true); return response; }
	 * 
	 * public Response updatePresentEmployees(Login login) throws ParseException {
	 * response.setSuccessful(false); attendanceDAO.updatePresentEmployees(login);
	 * response.setSuccessful(true); return response; }
	 */
  
  /*get attendance report*/
	public Response getStaff()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = attendanceDAO.getStaff();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	/*
	 * public Response getdashboard(Login login) {
	 * this.response.setSuccessful(false); Login singleuserdetails =
	 * this.attendanceDAO.getdashboard(login); this.response.setSuccessful(true);
	 * this.response.setResponseObject(singleuserdetails); return this.response; }
	 */
	 
	 /* Getting details to table in attendance sheet */
		
	  public Response getDetails(Attendance attendance) {
	  response.setSuccessful(false);
	  Map<String, Object> data = attendanceDAO.getDetails(attendance);
	  response.setResponseObject(data);
	  response.setSuccessful(true);
	  return response;
	  }  
	  
	  /* Getting details from db to table in Attendance summary graph */
	  
	  public Response getReport(Attendance attendance) {
		  response.setSuccessful(false);
		  Map<String, Object> data = attendanceDAO.getReport(attendance);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }
	  
	 
	  /* getting calendar details based on from date,to date*/
	   public Response getCalendarDetails(Attendance attendance)
		{
			response.setSuccessful(false);
			List<Map<String,Object>> list = attendanceDAO.getCalendarDetails(attendance);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	   
	   /* Updating attendance in attendance sheet */
		  
	   public Response updateattendance(Attendance attendance)
		{
			response.setSuccessful(false);
			attendanceDAO.updateattendance(attendance);
			response.setSuccessful(true);
			response.setResponseObject(attendance);
			return response;
		}
	   
	   /* updating attendance to present in attendance sheet */
	   
	   public Response updateattendancepresent(Attendance attendance)
		{
			response.setSuccessful(false);
			attendanceDAO.updateattendancepresent(attendance);
			response.setSuccessful(true);
			response.setResponseObject(attendance);
			return response;
		}
	   
	   /* updating attendance to leave in attendance sheet */
	   
	   public Response updateattendanceleave(Attendance attendance)
		{
			response.setSuccessful(false);
			attendanceDAO.updateattendanceleave(attendance);
			response.setSuccessful(true);
			response.setResponseObject(attendance);
			return response;
		}
	   
	   /* getting calendar details based on from date,to date*/
	   public Response getCalendarDetailsdet(Attendance attendance)
		{
			response.setSuccessful(false);
			Map<String,Object> list = attendanceDAO.getCalendarDetailsdet(attendance);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	         
	   /* getting timesheets based on from date,to date*/
	   public Response apprvedTimesheets(Attendance attendance)
		{
			response.setSuccessful(false);
			Map<String,Object> list = attendanceDAO.apprvedTimesheets(attendance);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}

	   /*get years*/
	   public Response getyears()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = attendanceDAO.getyears();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}

	   /* getting calendar details based on from date,to date*/
	   public Response getMyleavesDetails(Attendance attendance)
		{
			response.setSuccessful(false);
			Map<String,Object> data = attendanceDAO.getMyleavesDetails(attendance);
			response.setResponseObject(data);
			response.setSuccessful(true);
			
			return response;
		}

	   /* calendar page */
	   
	   public Response addcalendar(Attendance employee) {
			response.setSuccessful(false);
			 attendanceDAO.addcalendar(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}

	   /* getting myteam leaves details based on from date,to date*/
	   public Response getMyTeamDetails(Attendance attendance)
		{
			response.setSuccessful(false);
			Map<String,Object> list = attendanceDAO.getMyTeamDetails(attendance);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	   
	   /* dashboard */

	   public Response savePresentEmployees(Login login) throws ParseException
	 	{
	 		response.setSuccessful(attendanceDAO.savePresentEmployees(login));
	 		return response;
	 	}

	   public Response updatePresentEmployees(Login login) throws ParseException
	 	{
	 		response.setSuccessful(attendanceDAO.updatePresentEmployees(login));
	 		return response;
	 	}
	   
	   /*get dashboard login time*/
		  
		  public Response getdashboard(Login login)
		  {
		    this.response.setSuccessful(false);
		    Login singleuserdetails = this.attendanceDAO.getdashboard(login);
		    this.response.setSuccessful(true);
		    this.response.setResponseObject(singleuserdetails);
		    return this.response;
		  }

/*get comp off dates*/
		  public Response getCompoff(Attendance faculty)
			{
			response.setSuccessful(false);
			List<Map<String,Object>> list = attendanceDAO.getCompoff(faculty);
			response.setResponseObject(list);
			response.setSuccessful(true);    
			return response;
			}  
			
		  public Response getAbsentees(String date)   
		  {
		    this.response.setSuccessful(false);
		    Map<String, Object> map = this.attendanceDAO.getAbsentees(date);
		    this.response.setResponseObject(map);
		    this.response.setSuccessful(true);
		    return this.response;
		  }	
			
		  public Response updateAttendance(Login sdcModel) throws ParseException
			{
				response.setSuccessful(false);
				attendanceDAO.updateAttendance(sdcModel);   
				System.out.println("+++++++++++++++++++++++++");
				System.out.println(sdcModel);
				System.out.println("+++++++++++++++++++++++++");
				response.setSuccessful(true);
				return response;
			}	
			

	   
}
   