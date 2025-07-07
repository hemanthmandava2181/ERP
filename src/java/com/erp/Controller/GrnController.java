
package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.CreatePO;
import com.erp.Model.Grn;
import com.erp.Service.GrnService;

@RestController
@RequestMapping("/grn")
public class GrnController {
	@Autowired
	private GrnService grnService;

	@ResponseBody
	@RequestMapping(value = "addinvoice", method = { RequestMethod.POST })
	public Response addinvoice(@RequestBody Grn grnModel)
	{
		return grnService.addinvoice(grnModel);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "addinvoicedetails", method = {  RequestMethod.POST, RequestMethod.GET })
	public Response addinvoicedetails(@RequestBody Grn grnModel)
	{
		return grnService.addinvoicedetails(grnModel);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getGrnData", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrnData(@RequestBody Grn  faculty)
	{
	return grnService.getGrnData(faculty);
	} 
	
	
	@ResponseBody
	@RequestMapping(value = "getInvoiceDetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getInvoiceDetails()
	{
		return grnService.getInvoiceDetails();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getProjects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProjects() {
		return grnService.getProjects();
	}

	@ResponseBody
	@RequestMapping(value = "getAlllineitems", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAlllineitems() {
		return grnService.getAlllineitems();
	}

	@ResponseBody
	@RequestMapping(value = "getByIdlineitems", method = { RequestMethod.POST })
	public Response getByIdlineitems(@RequestBody String grn_id) {
		return grnService.getByIdlineitems(grn_id);
	}

	/* save grn */
	@ResponseBody
	@RequestMapping(value = { "/getPODetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPODetails(@RequestBody Grn grnModel) {
		return grnService.getPODetails(grnModel);
	}

	@ResponseBody
	@RequestMapping(value = "addgrnid", method = { RequestMethod.POST })
	public Response addgrnid(@RequestBody Grn grnModel) {
		return grnService.addgrnid(grnModel);
	}

	@ResponseBody
	@RequestMapping(value = "getApprovepodetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getApprovepodetails() {
		return grnService.getApprovepodetails();
	}   

	@ResponseBody
	@RequestMapping(value = "getDraftgrn", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDraftgrn(@RequestBody String po_id) {
		return grnService.getDraftgrn(po_id);
	}

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "addassetinternalreq", method = { RequestMethod.POST
	 * }) public Response addassetinternalreq(@RequestBody Grn grnModel) { return
	 * grnService.addassetinternalreq(grnModel); }
	 */
	@ResponseBody
	@RequestMapping(value = "addPaymentDetails", method = { RequestMethod.POST })
	public Response addPaymentDetails(@RequestBody Grn grnModel) {
		return grnService.addPaymentDetails(grnModel);
	}

	@ResponseBody
	@RequestMapping(value = "getGrnItems", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrnItems(@RequestBody Grn faculty) {
		return grnService.getGrnItems(faculty);
	}

	@ResponseBody
	@RequestMapping(value = "getAssetId", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAssetId(@RequestBody Grn faculty) {
		return grnService.getAssetId(faculty);
	}

	@ResponseBody
	@RequestMapping(value = "getGrnIDs", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrnIDs() {
		return grnService.getGrnIDs();
	}

	@ResponseBody
	@RequestMapping(value = "getPurchaseOrderDetails", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPurchaseOrderDetails() {
		return grnService.getPurchaseOrderDetails();
	}

	/* Asset Details */
	@ResponseBody
	@RequestMapping(value = "getGrns", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrns() {
		return grnService.getGrns();
	}

	@ResponseBody
	@RequestMapping(value = { "/getAssetDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAssetDetails(@RequestBody Grn faculty) {
		return grnService.getAssetDetails(faculty);
	}

	@ResponseBody
	@RequestMapping(value = { "/getGrnListReport" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrnListReport(@RequestBody Grn grnModel) {
		return grnService.getGrnListReport(grnModel);
	}    

	/* getting po id details to pop up */
	@ResponseBody
	@RequestMapping(value = "Getpoiddata", method = { RequestMethod.POST })
	public Response Getpoiddata(@RequestBody String po_id) {
		return grnService.Getpoiddata(po_id);
	}

	@ResponseBody
	@RequestMapping(value = "getByIdpurchaseorderReport", method = { RequestMethod.POST })
	public Response getByIdpurchaseorderReport(@RequestBody String po_id) {
		return grnService.getByIdpurchaseorderReport(po_id);
	}

	@ResponseBody
	@RequestMapping(value = "saveGrndetails", method = { RequestMethod.POST })
	public Response saveGrndetails(@RequestBody Grn grnModel) {
		return grnService.saveGrndetails(grnModel);
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "getLineItemDetails", method = { RequestMethod.POST })
	public Response getLineItemDetails(@RequestBody String purchaseorder_id)  
	{
	return grnService.getLineItemDetails(purchaseorder_id);
	}
	
	
	

}