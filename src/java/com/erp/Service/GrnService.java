
package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.GrnDAO;
import com.erp.Model.Grn;
import com.erp.Model.Sdeigroup;
import com.erp.Model.CreatePO;
import com.erp.Model.Employee;
import com.erp.Model.VendorService;



@Service
public class GrnService {
	
	Response response = new Response();

	@Autowired
	private GrnDAO grnDAO;
	
	
	
	public Response addinvoice(Grn grnModel) {
		response.setSuccessful(false);
		grnDAO.addinvoice(grnModel);
		response.setSuccessful(true);
		response.setResponseObject(grnModel);
		return response;
	}
	
	public Response addinvoicedetails(Grn grnModel) {
		response.setSuccessful(false);
		grnDAO.addinvoicedetails(grnModel);
		response.setSuccessful(true);
		response.setResponseObject(grnModel);
		return response;
	}
	
	
	public Response getInvoiceDetails()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = grnDAO.getInvoiceDetails();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getByIdlineitems(String grn_id)
	{
		response.setSuccessful(false);
		Grn singleuserdetails = grnDAO.getByIdlineitems(grn_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	public Response getApprovepodetails() {
		response.setSuccessful(false);
		List<Grn> userdetails = grnDAO.getApprovepodetails();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response getProjects()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = grnDAO.getProjects();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	public Response getPODetails(Grn grnModel)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = grnDAO.getPODetails(grnModel);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
	public Response addgrnid(Grn grnModel) {
		response.setSuccessful(false);
		grnDAO.addgrnid(grnModel);
		response.setSuccessful(true);
		response.setResponseObject(grnModel);
		return response;
	}
public Response getAlllineitems() {
		response.setSuccessful(false);
		List<Grn> userdetails = grnDAO.getAlllineitems();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getDraftgrn(String po_id) {
		response.setSuccessful(false);
		List<Grn> userdetails = grnDAO.getDraftgrn(po_id);
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	/*public Response addassetinternalreq(Grn grnModel) {
		response.setSuccessful(false);
		grnDAO.addassetinternalreq(grnModel);
		response.setSuccessful(true);
		response.setResponseObject(grnModel);
		return response;
	}*/
	public Response addPaymentDetails(Grn grnModel) {
		response.setSuccessful(false);
		grnDAO.addPaymentDetails(grnModel);
		response.setSuccessful(true);
		response.setResponseObject(grnModel);
		return response;
	}
	public Response getGrnItems(Grn faculty) {
		response.setSuccessful(false);
		List<Map<String,Object>> userdetails = grnDAO.getGrnItems(faculty);
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	
	public Response getAssetId(Grn faculty) {
		response.setSuccessful(false);
		List<Map<String,Object>> userdetails = grnDAO.getAssetId(faculty);
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	public Response getGrnIDs() {
		response.setSuccessful(false);
		List<Grn> userdetails = grnDAO.getGrnIDs();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response getPurchaseOrderDetails() {
		response.setSuccessful(false);
		List<Grn> userdetails = grnDAO.getPurchaseOrderDetails();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	/*Asset Details*/
	public Response getGrns() {
		response.setSuccessful(false);
		List<Grn> userdetails = grnDAO.getGrns();
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	public Response getAssetDetails(Grn faculty)
	{
	response.setSuccessful(false);
	List<Map<String,Object>> list = grnDAO.getAssetDetails(faculty);
	response.setResponseObject(list);
	response.setSuccessful(true);    
	return response;
	}  
	public Response getGrnListReport(Grn grnModel)
	{
		response.setSuccessful(false);
		Map<String, Object> list = grnDAO.getGrnListReport(grnModel);
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	
	/* getting po id data to pop up */
	public Response Getpoiddata(String po_id)
	{
	response.setSuccessful(false);
	Grn singleuserdetails = grnDAO.Getpoiddata(po_id);
	response.setSuccessful(true);
	response.setResponseObject(singleuserdetails);
	return response;
	}
	
	public Response getByIdpurchaseorderReport(String po_id)
	{
		response.setSuccessful(false);
		Grn singleuserdetails = grnDAO.getByIdpurchaseorderReport(po_id);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);   
		return response;
	}
	
	
	//add grn item details
	
	
	public Response saveGrndetails(Grn grnModel) {
		response.setSuccessful(false);
		grnDAO.saveGrndetails(grnModel);
		response.setSuccessful(true);
		response.setResponseObject(grnModel);
		return response;
	}
	
	
	public Response getGrnData(Grn faculty) {
		response.setSuccessful(false);
		List<Map<String,Object>> userdetails = grnDAO.getGrnData(faculty);
		response.setSuccessful(true);
		response.setResponseObject(userdetails);
		return response;
	}
	
	
	

	public Response getLineItemDetails(String purchaseorder_id)
	{
	response.setSuccessful(false);
	Grn singleuserdetails = grnDAO.getLineItemDetails(purchaseorder_id);
	response.setSuccessful(true);
	response.setResponseObject(singleuserdetails);  
	return response;
	}
	
	
	               
}