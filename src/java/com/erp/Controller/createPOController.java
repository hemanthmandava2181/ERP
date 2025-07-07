package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.andromeda.commons.model.Response;
import com.erp.Model.CreatePO;
import com.erp.Service.CreatePOService;

@RestController
@RequestMapping("/purchase")
public class createPOController {
	@Autowired
	private CreatePOService createPOservice;

	@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears() {
		return createPOservice.getYears();
	}

	@ResponseBody
	@RequestMapping(value = "getPOID", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPOID() {
		return createPOservice.getPOID();
	}

	@ResponseBody
	@RequestMapping(value = "getPurchaseOrderType", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPurchaseOrderType() {
		return createPOservice.getPurchaseOrderType();
	}

	@ResponseBody
	@RequestMapping(value = "getPurchaseType", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPurchaseType() {
		return createPOservice.getPurchaseType();
	}

	@ResponseBody
	@RequestMapping(value = "getServices", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getServices() {
		return createPOservice.getServices();
	}

	@ResponseBody
	@RequestMapping(value = "getPrograms", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPrograms() {
		return createPOservice.getPrograms();
	}

	@ResponseBody
	@RequestMapping(value = "getProjects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProjects() {
		return createPOservice.getProjects();
	}

	@ResponseBody
	@RequestMapping(value = "getSchemes", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSchemes() {
		return createPOservice.getSchemes();
	}

	@ResponseBody
	@RequestMapping(value = "getSectors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSectors() {
		return createPOservice.getSectors();
	}

	@ResponseBody
	@RequestMapping(value = "getVendors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getVendors() {
		return createPOservice.getVendors();
	}

	@ResponseBody
	@RequestMapping(value = "getAssets", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAssets() {
		return createPOservice.getAssets();
	}

	@ResponseBody
	@RequestMapping(value = "getLocations", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLocations() {
		return createPOservice.getLocations();
	}

	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody CreatePO createposervice) {
		System.out.println("hi");
		return createPOservice.add(createposervice);
	}

	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll() {
		return createPOservice.getAll();
	}

	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody String createposervice) {
		return createPOservice.getById(createposervice);
	}

	@ResponseBody
	@RequestMapping(value = "getGroups", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGroups() {
		return createPOservice.getGroups();
	}

	@ResponseBody
	@RequestMapping(value = "submit", method = {RequestMethod.POST, RequestMethod.GET  })
	public Response submit(@RequestBody CreatePO createposervice) {
		System.out.println("hi");
		return createPOservice.submit(createposervice);
	}

	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody CreatePO createposervice) {

		return createPOservice.updateData(createposervice);
	}

	/* lineitems details */
	@ResponseBody
	@RequestMapping(value = "getAll5", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll5() {
		return createPOservice.getAll5();
	}

	@ResponseBody
	@RequestMapping(value = { "/getAllIds" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAllIds(@RequestBody CreatePO faculty) {
		return createPOservice.getAllIds(faculty);
	}

	/* Vendor names */
	@ResponseBody
	@RequestMapping(value = "getVendornames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getVendornames(@RequestBody Integer serviceid) {
		return createPOservice.getVendornames(serviceid);
	}

	/* names */
	@ResponseBody
	@RequestMapping(value = "{/getNames}", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getNames() {
		return createPOservice.getNames();
	}

	@ResponseBody
	@RequestMapping(value = "getAssetNames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAssetNames() {
		return createPOservice.getAssetNames();
	}

	@ResponseBody
	@RequestMapping(value = "getItemNames", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getItemNames() {
		return createPOservice.getItemNames();
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "Consumables", method = { RequestMethod.POST })
	public Response Consumables(@RequestBody CreatePO createposervice)
	{
		System.out.println("hi");
		return createPOservice.Consumables(createposervice); 
	}  
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "getConsume", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getConsume(@RequestBody String assets) {
		return createPOservice.getConsume(assets);
	}
	  
	
	
	
	@ResponseBody  
	@RequestMapping(value =  "getProgramDet" , method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProgramDet(@RequestBody CreatePO createposervice)
	{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	return createPOservice.getProgramDet(createposervice);  
	
	}
	
	
	/*######################WORK ORDER MULTIPLICATION####################*/
	
	
	
	@ResponseBody
	@RequestMapping(value = "addWOItems", method = { RequestMethod.POST })
	public Response addWOItems(@RequestBody CreatePO createposervice)
	{
		System.out.println("hi");
		return createPOservice.addWOItems(createposervice); 
	}  
	
	
	
	@ResponseBody
	@RequestMapping(value = "TravelDaysMutli", method = { RequestMethod.POST })
	public Response TravelDaysMutli(@RequestBody CreatePO createposervice)
	{
		System.out.println("hi");
		return createPOservice.TravelDaysMutli(createposervice); 
	}  
	
	
	
	@ResponseBody
	@RequestMapping(value = "addwoadditions", method = { RequestMethod.POST })
	public Response addwoadditions(@RequestBody CreatePO createposervice)
	{
		System.out.println("hi");
		return createPOservice.addwoadditions(createposervice); 
	}  
	
	
	
	
		/*#####################generating mou ids#####################*/
	
	
	
	@ResponseBody
	@RequestMapping(value = { "/getMoUIds" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getMoUIds(@RequestBody CreatePO faculty) {
		return createPOservice.getMoUIds(faculty);
	}

	
	
	

	/*@ResponseBody
	@RequestMapping(value = "getConsume", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getConsume()
	{
		return createPOservice.getConsume();
	}*/

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "add", method = { RequestMethod.POST }) public
	 * Response add(@RequestBody VendorService vendorservice) {
	 * System.out.println("hi"); return VendorServiceService.add(vendorservice); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getAll", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getCaders() { return
	 * VendorServiceService.getAll(); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getNameWiseData", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getNameWiseData(@RequestBody
	 * VendorService vendorservice) { return
	 * VendorServiceService.getNameWiseData(vendorservice); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getById", method = { RequestMethod.POST }) public
	 * Response getById(@RequestBody String vendorservice) {
	 * 
	 * return VendorServiceService.getById(vendorservice); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "updateData", method = { RequestMethod.POST }) public
	 * Response updateData(@RequestBody VendorService vendorservice) {
	 * 
	 * return VendorServiceService.updateData(vendorservice); }
	 * 
	 * 
	 */

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "removeData1", method = { RequestMethod.POST })
	 * public Response remove1(@RequestBody String name) { return
	 * createPOservice.remove1(name); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getById1", method = { RequestMethod.POST }) public
	 * Response getById1(@RequestBody String name) { return
	 * createPOservice.getById1(name); }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "updateData1", method = { RequestMethod.POST })
	 * public Response updateData1(@RequestBody CreatePO createposervice) { return
	 * createPOservice.updateData1(createposervice); }
	 */
}