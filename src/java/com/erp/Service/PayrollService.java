package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.PayrollDAO;
import com.erp.Model.Employee;
import com.erp.Model.LocationCount;
import com.erp.Model.Payroll;

@Service
public class PayrollService {
	
	Response response = new Response();

	@Autowired
	private PayrollDAO payrollDAO;
	
	
	 public Response getFinancialYear()
	 {
	 response.setSuccessful(false);
	 List<Map<String, Object>> list = payrollDAO.getFinancialYear();
	 response.setSuccessful(true);
	 response.setResponseObject(list);
	 return response;
	 }

	
	public Response employeeCounts()
	{
		response.setSuccessful(false);
		LocationCount list = payrollDAO.employeeCounts();
		response.setResponseObject(list);
		response.setSuccessful(true);
		return response;
	}
	
	 public Response savePayrollSettings(Payroll payroll) {
		  response.setSuccessful(false);
		  payrollDAO.savePayrollSettings(payroll);
		  response.setSuccessful(true);
		  response.setResponseObject(payroll);
		  return response;
		  }
	 
	 public Response GeneratePayroll(Payroll payroll) {
		  response.setSuccessful(false);
		  payrollDAO.GeneratePayroll(payroll);
		  response.setSuccessful(true);
		  response.setResponseObject(payroll);
		  return response;
		  }
	 
	 public Response ValidatePayroll(Payroll payroll) {
		  response.setSuccessful(false);
		  payrollDAO.ValidatePayroll(payroll);
		  response.setSuccessful(true);
		  response.setResponseObject(payroll);
		  return response;
		  }
	 
	 public Response RejectPayroll(Payroll payroll) {
		  response.setSuccessful(false);
		  payrollDAO.RejectPayroll(payroll);
		  response.setSuccessful(true);
		  response.setResponseObject(payroll);
		  return response;
		  }
	 
	 public Response RejectPayrollStatus(Payroll payroll) {
		  response.setSuccessful(false);
		  payrollDAO.RejectPayrollStatus(payroll);
		  response.setSuccessful(true);
		  response.setResponseObject(payroll);
		  return response;
		  }
	 
	 public Response ApprovePayroll(Payroll payroll) {
		  response.setSuccessful(false);
		  payrollDAO.ApprovePayroll(payroll);
		  response.setSuccessful(true);
		  response.setResponseObject(payroll);
		  return response;
		  }
	 
	 public Response GeneratePayrollStatus(Payroll payroll) {
		  response.setSuccessful(false);
		  payrollDAO.GeneratePayrollStatus(payroll);
		  response.setSuccessful(true);
		  response.setResponseObject(payroll);
		  return response;
		  }
	 public Response getPayrollDetails(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getPayrollDetails(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 
	 
	 
	 public Response getJVPayrollDetails(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getJVPayrollDetails(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 
	 public Response getPayrollTotal(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getPayrollTotal(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 public Response getJVPayrollTotal(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getJVPayrollTotal(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 public Response getPayRollJVModelData(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getPayRollJVModelData(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 public Response getPayRollJVModelDataOthers(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getPayRollJVModelDataOthers(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 
	 public Response getJVModalDataPaymentSummary(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getJVModalDataPaymentSummary(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 
	 public Response getJVModalDataDeputation(Payroll payroll) {
			response.setSuccessful(false);
			Map<String, Object> list = payrollDAO.getJVModalDataDeputation(payroll);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
	 
	 
	 
	 
	 

}
