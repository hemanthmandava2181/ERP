package com.erp.Controller;

import java.io.File;
import java.io.FileOutputStream;
/*import java.io.UnsupportedEncodingException;*/
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
/*import java.security.NoSuchAlgorithmException;*/
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import commons.util.Base64;
import com.erp.Model.FileModel;
import com.andromeda.commons.model.Response;
import com.andromeda.commons.util.HttpUtils;
import com.erp.Model.Upload;
import com.erp.Service.UploadService;

              
@RestController
@RequestMapping("/Upload")
public class UploadController {
	     
	String file = null;
	Response response = new Response();        
	@Autowired                
	private UploadService uploadService;
	
	@ResponseBody
	@RequestMapping(value = { "saveDetails" }, method = { RequestMethod.POST })
	public Response saveDetails(@RequestBody List<Upload> employee,
			HttpServletRequest httpServletRequest)
	{
		String clientAddress = HttpUtils.getClientAddress(httpServletRequest);
		String proxyAddress = HttpUtils.getClientProxyAddress(httpServletRequest);
		String ipAddress =
				"Client Address: " + clientAddress + "Client Proxy Address: " + proxyAddress;
		List<String> pathsList = new ArrayList<String>();
		return this.uploadService.saveDetails(employee, ipAddress, pathsList);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return uploadService.getAll();
	}

	@ResponseBody
	@RequestMapping(value = { "/upload" },
			method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public Response handleFileUpload(@RequestBody FileModel fileModel)
	{
		this.response.setSuccessful(false);
		FileOutputStream fos = null;
		String file = null;
		try
		{
			String imageValue =fileModel.getBase64String();
			byte[] imageByteArray = decodeImage(imageValue);
			

			// Integer folderName = fileModel.getCollegeId();
			String baseDir =
					System.getProperty("catalina.base") + "/webapps/uploads/EmployeeData";
			File dir = new File(baseDir);
			if (!Files.isDirectory(Paths.get(baseDir)))
			{
				dir.mkdirs();
			}
			String random = UUID.randomUUID().toString();
			/*System.out.println("==================================================" + baseDir);*/
			fos = new FileOutputStream(baseDir + "/" +random+fileModel.getFileName());
			/*System.out.println(fos);*/
			file = "/uploads/EmployeeData" + "/" +random+ fileModel.getFileName();

			fos.write(imageByteArray);
			fos.close();
			// File f = new File(fileModel.getName());
			fileModel.setName(file);
		}
		catch (Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
		this.response.setSuccessful(true);
		this.response.setResponseObject(fileModel);
		return this.response;
	}
	public static byte[] decodeImage(String imageValue)
	{
		

		return Base64.decode(imageValue);
	}

	@ResponseBody
	@RequestMapping(value = "/getYear", method = { RequestMethod.POST, RequestMethod.GET })
     public Response getYear() 
	{
		return uploadService.getYear();
	}
	

	/*@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return addQualificationService.getAll();
	}
	

	@ResponseBody
	@RequestMapping(value = "getYears", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getYears()
	{
		return addQualificationService.getYears();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getById", method = { RequestMethod.POST })
	public Response getById(@RequestBody int addQualification)
	{
		return addQualificationService.getById(addQualification);
	}
	

	@ResponseBody
	@RequestMapping(value = "updateData", method = { RequestMethod.POST })
	public Response updateData(@RequestBody AddQualification addQualification)
	{
		return addQualificationService.updateData(addQualification);
	}
	@ResponseBody
	@RequestMapping(value = "/saveAllPrimaryDetails", method = { RequestMethod.POST })
	private Response saveAllPrimaryDetails(@RequestBody AddQualification college,
			HttpServletRequest httpServletRequest)
	{
		String clientIp = HttpUtils.getClientAddress(httpServletRequest);
		String clientProxyIp = HttpUtils.getClientProxyAddress(httpServletRequest);
		String ipAddress = "CLIENT:" + clientIp + ", CLIENT_PROXY:" + clientProxyIp;
		college.setIpAddress(ipAddress);
		return addQualificationService.saveAllPrimaryDetails(college);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST })
	public Response add(@RequestBody AddQualification addQualification)
	{
		System.out.println("controller");
		return addQualificationService.add(addQualification);
	}*/
		
}
                                                                                 