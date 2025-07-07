
package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.ManagerDAO;

import com.erp.Model.Manager;
import com.erp.Model.TimeSheet;

@Service
public class ManagerService {

	Response response = new Response();

	@Autowired
	private ManagerDAO managerDAO;

	public Response add(Manager managerModel) {
		response.setSuccessful(false);
		managerDAO.add(managerModel);
		response.setSuccessful(true);
		response.setResponseObject(managerModel);
		return response;
	}

	public Response getAll() {
		response.setSuccessful(false);
		List<Manager> userdetails = managerDAO.getAll();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	

	public Response remove(String task)
	{
		response.setSuccessful(false);
		managerDAO.remove(task);
		response.setSuccessful(true);
		response.setResponseObject(task);
		return response;
	}

	public Response getById(String task)
	{
		response.setSuccessful(false);
		Manager singleuserdetails = managerDAO.getById(task);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
	public Response getLoginSheets(Manager report)
	{
		response.setSuccessful(false);
		Map<String, Object> list = managerDAO.getLoginSheets(report);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getLoginbefore11(String login_date)
	{
		response.setSuccessful(false);
		Map<String, Object> list = managerDAO.getLoginbefore11(login_date);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getLoginafter11(String login_date)
	{
		response.setSuccessful(false);
		Map<String, Object> list = managerDAO.getLoginafter11(login_date);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getMissedLogin(String login_date)
	{
		response.setSuccessful(false);
		Map<String, Object> list = managerDAO.getMissedLogin(login_date);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getAllReports( String login_date)
	{
		response.setSuccessful(false);
		Map<String, Object> list = managerDAO.getAllReports(login_date);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getLeaveSheets(Manager report1)
	{
		response.setSuccessful(false);
		Map<String, Object> list = managerDAO.getLeaveSheets(report1);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getLeavesReport( String login_date)
	{
		response.setSuccessful(false);
		Map<String, Object> list = managerDAO.getLeavesReport(login_date);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	/*public Response getLoginbefore11() {
		response.setSuccessful(false);
		List<Manager> userdetails = managerDAO.getLoginbefore11();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response getLoginafter11() {
		response.setSuccessful(false);
		List<Manager> userdetails = managerDAO.getLoginafter11();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response getMissedLogin() {
		response.setSuccessful(false);
		List<Manager> userdetails = managerDAO.getMissedLogin();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getAllReports() {
		response.setSuccessful(false);
		List<Manager> userdetails = managerDAO.getAllReports();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getLeavesReport() {
		response.setSuccessful(false);
		List<Manager> userdetails = managerDAO.getLeavesReport();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	*/
	
	public Response updateDataapprove( Manager approve)
	{
		response.setSuccessful(false);
		managerDAO.updateDataapprove(approve);
		response.setSuccessful(true);
		response.setResponseObject(approve);
		return response;
	}
	public Response updateDatareject( Manager reject)
	{
		response.setSuccessful(false);
		managerDAO.updateDatareject(reject);
		response.setSuccessful(true);
		response.setResponseObject(reject);
		return response; 
	}
	public Response getByIdviewlogin(String login_date)
	{
		response.setSuccessful(false);
		List<Manager> singleuserdetails = managerDAO.getByIdviewlogin(login_date);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}	
	
	
}
