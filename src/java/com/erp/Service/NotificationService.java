package com.erp.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;

import com.erp.Model.Notification;



import com.erp.DAO.NotificationDAO;


@Service
public class NotificationService {

	Response response = new Response();
   
	@Autowired
	private NotificationDAO notificationDAO;

	  

	public Response add(Notification notificationModel) {
		response.setSuccessful(false);
		notificationDAO.add(notificationModel);
		response.setSuccessful(true);
		System.out.println("hi for test");
		response.setResponseObject(notificationModel);
		return response;
	}
	
	
	/* Insert data into notification*/
	
	public Response inserting(Notification notificationModel) {
		response.setSuccessful(false);
		notificationDAO.inserting(notificationModel);
		response.setSuccessful(true);
		System.out.println("hi for testhfisdfjsdjdo");
		response.setResponseObject(notificationModel);
		return response;
	}
	
	
	
	
	
/* Get data of created group list*/


	public Response getAll()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = notificationDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	//get data for added employees
	
	public Response getbasedonselection(Integer id)
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = notificationDAO.getbasedonselection(id);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	

	
/* Getting employees based on given data based */
	
	public Response getemployeedatabased(Notification notify) {
		  response.setSuccessful(false);
		  Map<String, Object> data = notificationDAO.getemployeedatabased(notify);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	}
// Adding to added table   //
	
	/*public Response updateAdded(Notification notify)
	{
		response.setSuccessful(false);
		notificationDAO.updateAdded(notify);
		response.setSuccessful(true);
		response.setResponseObject(notify);
		return response;
	} 
	
	*/
	public Response Toadded(Notification notification) {
		response.setSuccessful(false);
		notificationDAO.Toadded(notification);
		response.setSuccessful(true);
		System.out.println("hi for test");
		response.setResponseObject(notification);
		return response;
	}
	
	public Response getGroupDetails(Integer id) {
		  response.setSuccessful(false);
		  Map<String, Object> data = notificationDAO.getGroupDetails(id);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
	}
	

	
	public Response getById(Integer id)
	{
		response.setSuccessful(false);
		Notification singleuserdetails = notificationDAO.getById(id);
		this.response.setSuccessful(true);
		this.response.setResponseObject(singleuserdetails);
		return this.response;
	}

	public Response getId(Integer id)
	{
		response.setSuccessful(false);
		Notification singleuserdetails = notificationDAO.getId(id);
		
		this.response.setSuccessful(true);
		this.response.setResponseObject(singleuserdetails);
		return this.response;
	}

	
	
	
	public Response updateData(Notification notification)
	{
		response.setSuccessful(false);
		notificationDAO.updateData(notification);
		response.setSuccessful(true);
		response.setResponseObject(notification);
		return response;
	}

	
	public Response getdropdown()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = notificationDAO.getdropdown();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	

	
	public Response sendSMS(Notification notification)
	{
		System.out.println("-----------");
		System.out.println(notification);
		
		Response response = new Response();
		response.setSuccessful(false);

		
		try
		{
			// Construct data
			String phonenumbers = notification.getMobile();
			String data = "user=" + URLEncoder.encode("APSSDC.", "UTF-8");
			data += "&password=" + URLEncoder.encode("Apssdc@2020", "UTF-8");
			data += "&message=" + URLEncoder.encode("Dear Sir/Madam"
					+ ", Welcome to APSSDC . " + notification.getNeedbydate(),
					"UTF-8");
			data += "&sender=" + URLEncoder.encode("APSSDC", "UTF-8");
			data += "&mobile=" + URLEncoder.encode(phonenumbers, "UTF-8");
			data += "&type=" + URLEncoder.encode("3", "UTF-8");
			// Send data
			URL url = new URL("https://login.bulksmsgateway.in/sendmessage.php?" + data);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			wr.write(data);
			wr.flush();
			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			String sResult1 = "";
			while ((line = rd.readLine()) != null)
			{
				// Process line...
				sResult1 = sResult1 + line + " ";
				response.setSuccessful(true);
				response.setResponseObject(sResult1);
			}
			wr.close();
			rd.close();
			return response;
		}
		catch (Exception e)
		{
			System.out.println("Error SMS " + e);
			response.setSuccessful(false);
			response.setResponseObject("Error " + e);
			return response;
		}
	}
	
	
	public Response sendGroupSMS(Notification notification)
	{
		System.out.println("-----------");
		System.out.println(notification);
		
		Response response = new Response();
		response.setSuccessful(false);

		
		try
		{
			// Construct data
			String phonenumbers = notification.getMobile();
			String data = "user=" + URLEncoder.encode("APSSDC.", "UTF-8");
			data += "&password=" + URLEncoder.encode("Apssdc@2020", "UTF-8");
			data += "&message=" + URLEncoder.encode("Dear Sir/Madam"
					+ ", Welcome to APSSDC . " + notification.getNeedbydate1(),
					"UTF-8");
			data += "&sender=" + URLEncoder.encode("APSSDC", "UTF-8");
			data += "&mobile=" + URLEncoder.encode(phonenumbers, "UTF-8");
			data += "&type=" + URLEncoder.encode("3", "UTF-8");
			// Send data
			URL url = new URL("https://login.bulksmsgateway.in/sendmessage.php?" + data);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			wr.write(data);
			wr.flush();
			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			String sResult1 = "";
			while ((line = rd.readLine()) != null)
			{
				// Process line...
				sResult1 = sResult1 + line + " ";
				response.setSuccessful(true);
				response.setResponseObject(sResult1);
			}
			wr.close();
			rd.close();
			return response;
		}
		catch (Exception e)
		{
			System.out.println("Error SMS " + e);
			response.setSuccessful(false);
			response.setResponseObject("Error " + e);
			return response;
		}
	}
	
	
	
	
}
