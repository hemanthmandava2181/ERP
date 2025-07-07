
package com.erp.Controller;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.UUID;
import java.nio.file.Paths;
import java.nio.file.LinkOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import com.andromeda.commons.model.Response;
import com.erp.Model.Procurement;
import com.erp.Service.ProcurementService;
import com.erp.Model.FileModel;
import com.erp.Model.Grn;

import commons.util.Base64; 

@RestController
@RequestMapping("/procurement")     
public class ProcurementController {  
	String file=null;
	Response response=new Response();
	@Autowired
	private ProcurementService  procurementservice;     
	@ResponseBody
	@RequestMapping(value = "createworkorder", method = { RequestMethod.POST })
	public Response createworkorder(@RequestBody Procurement procurement)
	{
	handleFileUploadwo(procurement);  
	procurement.setImage(file);  
	System.out.println("createworkorder");
	return procurementservice.createworkorder(procurement);      
	}

	/* file upload for work order */
	public String handleFileUploadwo(Procurement procurement)
	{
	FileOutputStream fos = null;

	try
	{
	String folderName = "Work Order";
	String imageValue = procurement.getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);

	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"
	+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();
	}

	String FileName = UUID.randomUUID().toString();

	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  

	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{  
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();  
	}
	public static byte[] decodeImage(String imageValue)
	{
	  return Base64.decode(imageValue);
	}
	@ResponseBody
	@RequestMapping(value = "getVendors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getVendors()
	{
		return procurementservice.getVendors();
	}	
	@ResponseBody
	@RequestMapping(value = "getSectors", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSectors()
	{
		return procurementservice.getSectors();
	}	
	@ResponseBody
	@RequestMapping(value = "createmou", method = { RequestMethod.POST })
	public Response createmou(@RequestBody Procurement procurement)
	{
	handleFileUploadwo(procurement);  
	procurement.setImage(file);  
	System.out.println("createmou");
	return procurementservice.createmou(procurement);      
	}
	/* file upload for work order */
	public String handleFileUploadmou(Procurement procurement)
	{
	FileOutputStream fos = null;

	try
	{
	String folderName = "MOU";
	String imageValue = procurement.getBase64String();
	byte[] imageByteArray = decodeImage(imageValue);
	String baseDir = System.getProperty("catalina.base") + "/webapps/uploads/"+ folderName;
	File dir = new File(baseDir);
	if (!Files.isDirectory(Paths.get(baseDir)))
	{
	dir.mkdirs();
	}
	String FileName = UUID.randomUUID().toString();
	fos = new FileOutputStream(baseDir + "/" + FileName+".pdf");
	file = "/uploads/" + folderName + "/" +FileName+".pdf";
	fos.write(imageByteArray);
	fos.close();  
	System.out.println("---Path--> " + file);
	}
	catch (Exception e)
	{  
	System.out.println("Exception: " + e.getMessage());
	}
	return file.trim();  
	}
	/*mou list*/
	@ResponseBody
	@RequestMapping(value = "getmoulist", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getmoulist()
	{
		return procurementservice.getmoulist();
	}/*wo list*/
	@ResponseBody
	@RequestMapping(value = "getwolist", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getwolist()
	{
		return procurementservice.getwolist();
	}
	@ResponseBody
	@RequestMapping(value = "addwoitems", method = { RequestMethod.POST })
	public Response addwoitems(@RequestBody Procurement procurement)
	{
		System.out.println("hi");
		return procurementservice.addwoitems(procurement);       
	}
	
	@ResponseBody
	@RequestMapping(value = "addwoadditions", method = { RequestMethod.POST })
	public Response addwoadditions(@RequestBody Procurement procurement)
	{
		System.out.println("hi");
		return procurementservice.addwoadditions(procurement);       
	}
	
	@ResponseBody  
	@RequestMapping(value = { "/getDetailsofProgram" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDetailsofProgram(@RequestBody Procurement procurement)
	{
	return procurementservice.getDetailsofProgram(procurement);  
	}
	@ResponseBody
	@RequestMapping(value = "getSchemes", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSchemes()
	{
		return procurementservice.getSchemes();
	}
	@ResponseBody
	@RequestMapping(value = { "/getProjects"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProjects()
	{
		return procurementservice.getProjects();
	}
	@ResponseBody
	@RequestMapping(value = { "/getworkorders"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getworkorders()
	{  
		return procurementservice.getworkorders();
	}
	@ResponseBody
	@RequestMapping(value = { "/getpurchaseorders"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getpurchaseorders()
	{
		return procurementservice.getpurchaseorders();
	}
	@ResponseBody
	@RequestMapping(value = { "/getmous"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getmous()
	{
		return procurementservice.getmous();
	}
	@ResponseBody
	@RequestMapping(value = {"/getProjectWiseSpentReport"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProjectWiseSpentReport(@RequestBody Procurement procurement)
	{
		return procurementservice.getProjectWiseSpentReport(procurement);
	}
	@ResponseBody
	@RequestMapping(value = {"/getProjectWise"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getProjectWise(@RequestBody Procurement procurement)
	{
		return procurementservice.getProjectWise(procurement);
	}
	@ResponseBody
	@RequestMapping(value = {"/getWorkOrderWise"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getWorkOrderWise(@RequestBody Procurement procurement)
	{
		return procurementservice.getWorkOrderWise(procurement);
	}
	@ResponseBody  
	@RequestMapping(value = { "/getWorkorderDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getWorkorderDetails(@RequestBody Procurement procurement)
	{
	return procurementservice.getWorkorderDetails(procurement);  
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = { "/getPODetails" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getPODetails(@RequestBody Procurement procurement) {
		return procurementservice.getPODetails(procurement);
	}
}             