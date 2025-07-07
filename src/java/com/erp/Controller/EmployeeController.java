package com.erp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andromeda.commons.model.Response;
import com.erp.Model.Ctc;
import com.erp.Model.Employee;
import com.erp.Service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	        
	@Autowired
	private EmployeeService employeeService;     
	
	                                                      
	/*updating CTC Calulator*/
	
	@ResponseBody
	@RequestMapping(value = {"updateCTC"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response updateCTC(@RequestBody Ctc employee)
	{
		return employeeService.updateCTC(employee);
	}
	
	
	
	
	
	/* Scheme, Project and Sector */
	
	@ResponseBody
	@RequestMapping(value = {"getSchemes"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSchemes()
	{
		return employeeService.getSchemes();
	}
	@ResponseBody
	@RequestMapping(value = {"getctccalculator"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getctccalculator()
	{
		return employeeService.getctccalculator();
	}
	@ResponseBody
	@RequestMapping(value = { "/getProjects1" }, method = { RequestMethod.POST })
	public Response getProjects1(@RequestBody String scheme_id)
	{
		return employeeService.getProjects1(scheme_id);
	} 
	
	@ResponseBody
	@RequestMapping(value = {"getSectors"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getSectors()
	{
		return employeeService.getSectors();
	}
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "getSectors", method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getSectors() { return
	 * employeeService.getSectors(); }
	 */
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = {"getProjects"}, method = { RequestMethod.POST,
	 * RequestMethod.GET }) public Response getProjects() { return
	 * employeeService.getProjects(); }
	 */
	
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = { "/getSectors" }, method = { RequestMethod.POST })
	 * public Response getSectors(@RequestBody Integer project_id) { return
	 * employeeService.getSectors(project_id); }
	 */
	
	
	/* Institute and qualification in update employee education tab(Employee login) */
	
	/*@ResponseBody
	@RequestMapping(value = {"getInstitutes"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getInstitutes()
	{
		return employeeService.getInstitutes();
	}*/
	
	/*@ResponseBody
	@RequestMapping(value = { "/getQualifications" }, method = { RequestMethod.POST })
	public Response getQualifications(@RequestBody Integer institute_id)
	{
		return employeeService.getQualifications(institute_id);
	}*/
	
	/* Inserting task in Time and Attendance sheet */
	/*@ResponseBody
	@RequestMapping(value = "add8", method = { RequestMethod.POST })
	public Response add8(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add8(employee);
		       
	}*/
	
	/* Getting locations in Employee Project Mapping */
	
	/*@ResponseBody
	@RequestMapping(value = "getLocations", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLocations()
	{
		return employeeService.getLocations();
	}*/
	
	/* Getting Projects in Employee Project Mapping */
	
	/*@ResponseBody
	@RequestMapping(value = "getprojects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getprojects()
	{
		return employeeService.getprojects();
	}*/
	
	/* Getting reporting to in employee project mapping */
	/*
	@ResponseBody
	@RequestMapping(value = "getReporting", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReporting()
	{
		return employeeService.getReporting();
	}
	*/
	/* Getting data in table in project employee mapping */
	
	/*@ResponseBody
	@RequestMapping(value = {"/getprojectdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getprojectdata(@RequestBody Employee employee)
	{
		return employeeService.getprojectdata(employee);
	}*/
	
	/* Getting all employees of given location */
	
	/*@ResponseBody
	@RequestMapping(value = {"/getallemployees"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallemployees(@RequestBody Employee employee)
	{
		return employeeService.getallemployees(employee);
	}*/
	
	/* Adding employees to project in project employee mapping using checkboxes */
	
	/*@ResponseBody
	@RequestMapping(value = {"/addemployees"}, method = { RequestMethod.POST })
	public Response addemployees(@RequestBody String emp_id)
	{
		System.out.println("adding to project");
		return employeeService.addemployees(emp_id);
		       
	}*/
	
	/* Getting data in employee project mapping */
	
	/*@ResponseBody
	@RequestMapping(value = {"/getempprojectdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getempprojectdata(@RequestBody Employee employee)
	{
		return employeeService.getempprojectdata(employee);   
	} */  
	
	/* Getting data in pop up based on project name in employee project mapping */
	
	/*@ResponseBody
	@RequestMapping(value = "getByproject", method = { RequestMethod.POST })
	public Response getByproject(@RequestBody String project_name)
	{
		return employeeService.getByproject(project_name);
	}*/
	
	/* update data based on project_name in employee project mapping  */
	
	/*@ResponseBody
	@RequestMapping(value = "updateprojectdata", method = { RequestMethod.POST })
	public Response updateprojectdata(@RequestBody Employee employee)
	{
		return employeeService.updateprojectdata(employee);
	}*/
	
	/* Sravya */
	
	@ResponseBody
	@RequestMapping(value = "getDetails", method = { RequestMethod.POST })
	public Response getDetails(@RequestBody String empid)
	{
		return employeeService.getDetails(empid);
	}
	/* inserting employee */

	@ResponseBody
	@RequestMapping(value = "add1", method = { RequestMethod.POST })
	public Response add1(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add1(employee);
		       
	}

	/* getting caders */
	@ResponseBody
	@RequestMapping(value = "getCaders", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCaders()
	{
		return employeeService.getCaders();
	}
	
	/* getting caders */
	@ResponseBody
	@RequestMapping(value = "GetStatus", method = { RequestMethod.POST, RequestMethod.GET })
	public Response GetStatus()
	{
		return employeeService.GetStatus();
	}


	@ResponseBody
	@RequestMapping(value = "getRelations", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getRelations()
	{
		return employeeService.getRelations();
	}

	@ResponseBody
	@RequestMapping(value = "getDistricts", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDistricts()
	{
		return employeeService.getDistricts();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getGrades", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getGrades()
	{
		return employeeService.getGrades();
	}
	       
	
	
	@ResponseBody
	@RequestMapping(value = "getDepartment", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDepartment()
	{
		return employeeService.getDepartment();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDivision", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDivision()
	{
		return employeeService.getDivision();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getCost_center", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getCost_center()
	{
		return employeeService.getCost_center();
	}
	
	@ResponseBody
	@RequestMapping(value = "getDesignation", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDesignation()
	{
		return employeeService.getDesignation();
	}

	

	/* Institute and qualification in update employee education tab(Employee login) */
	
	@ResponseBody
	@RequestMapping(value = {"getInstitutes"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getInstitutes()
	{
		return employeeService.getInstitutes();
	}
	
	@ResponseBody
	@RequestMapping(value = { "/getQualifications" }, method = { RequestMethod.POST })
	public Response getQualifications(@RequestBody Integer institute_id)
	{
		return employeeService.getQualifications(institute_id);
	}
	
	/* Inserting task in Time and Attendance sheet */
	@ResponseBody
	@RequestMapping(value = "add8", method = { RequestMethod.POST })
	public Response add8(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add8(employee);
		       
	}

	/* getting login,logout time in attendance and timesheet */
	
	@ResponseBody
	  @RequestMapping(value={"getLoginDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getLoginDetails(@RequestBody String empid)
	  {
		
	    return this.employeeService.getLoginDetails(empid);  
	  }
	
	/* Getting locations in Employee Project Mapping */
	
	@ResponseBody
	@RequestMapping(value = "getLocations", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getLocations()
	{
		return employeeService.getLocations();
	}

	/* Getting Projects in Employee Project Mapping */
	
	@ResponseBody
	@RequestMapping(value = "getprojects", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getprojects()
	{
		return employeeService.getprojects();
	}
	
	/* Getting reporting to in employee project mapping */
	
	@ResponseBody
	@RequestMapping(value = "getReporting", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getReporting()
	{
		return employeeService.getReporting();
	}
	
	/* Getting data in table in project employee mapping */
	@ResponseBody
	@RequestMapping(value = {"/getprojectdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getprojectdata(@RequestBody Employee employee)
	{
		return employeeService.getprojectdata(employee);
	}
/* Getting all employees of given location */
	@ResponseBody
	@RequestMapping(value = {"/getallemployees"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getallemployees(@RequestBody Employee employee)
	{
		return employeeService.getallemployees(employee);
	}
/* Adding employees to project in project employee mapping using checkboxes */
	@ResponseBody
	@RequestMapping(value = {"/addemployees"}, method = { RequestMethod.POST })
	public Response addemployees(@RequestBody Employee employee)
	{
		System.out.println("adding to project");
		return employeeService.addemployees(employee);
		          
	}

	/* Getting data in employee project mapping */
	
	@ResponseBody
	@RequestMapping(value = {"/getempprojectdata"}, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getempprojectdata(@RequestBody Employee employee)
	{
		return employeeService.getempprojectdata(employee);   
	}   
	
	/* Getting data in pop up based on project name in employee project mapping */
	
	@ResponseBody
	@RequestMapping(value = "getByproject", method = { RequestMethod.POST })
	public Response getByproject(@RequestBody String project_name)
	{
		return employeeService.getByproject(project_name);
	}
	
	/* update data based on project_name in employee project mapping  */
	
	@ResponseBody
	@RequestMapping(value = "updateprojectdata", method = { RequestMethod.POST })
	public Response updateprojectdata(@RequestBody Employee employee)
	{
		return employeeService.updateprojectdata(employee);
	}

	/* HR profile details */
	 
	 @ResponseBody
	  @RequestMapping(value={"gethrDetails"}, method={ RequestMethod.POST, RequestMethod.GET })
	  public Response getById1(@RequestBody String empid)
	  {
		
	    return this.employeeService.gethrDetails(empid);  
	  } 
	                            
	 @ResponseBody
	 @RequestMapping(value = "add", method = { RequestMethod.POST })
	 public Response add(@RequestBody Employee employee)
	 {
	 System.out.println("hi");
	 return employeeService.add(employee);
	 }

	/* getting education details to table in profile update page */
	@ResponseBody
	@RequestMapping(value = "getAll", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getAll()
	{
		return employeeService.getAll();
	}
	
	/* Hr profile update method */     
	
	@ResponseBody
	@RequestMapping(value = "add3", method = { RequestMethod.POST })
	public Response add3(@RequestBody Employee employee)
	{
		System.out.println("hi");
		return employeeService.add3(employee);
		       
	}

	@ResponseBody
	@RequestMapping(value = "getEmp", method = { RequestMethod.POST, RequestMethod.GET })
	public Response getEmp()
	{
		return employeeService.getEmp();
	}
	
	@ResponseBody  
	@RequestMapping(value = { "/getDuration" }, method = { RequestMethod.POST, RequestMethod.GET })
	public Response getDuration(@RequestBody Employee employee)
	{
		return employeeService.getDuration(employee);  
	}
	
	
	/* Creating employee */
	@ResponseBody
	@RequestMapping(value = "createemployee", method = { RequestMethod.POST })
	public Response createemployee(@RequestBody Employee employee)
	{
	System.out.println("====================================="+employee);
	return employeeService.createemployee(employee);  
	     
	}
	
	  
	
	
	
	 
	 
	 
	 
	 @ResponseBody
		@RequestMapping(value = "addEducationaldetails", method = { RequestMethod.POST })
		public Response addEducationaldetails(@RequestBody Employee employee)
		{
			System.out.println("hi");
			return employeeService.addEducationaldetails(employee);		       
		}
	 @ResponseBody
		 @RequestMapping(value = { "/getEducationDetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		 public Response getEducationDetails(@RequestBody String empid) {
			 return employeeService.getEducationDetails(empid);
		 }
	 @ResponseBody
		 @RequestMapping(value = { "/getFamilydetails" }, method = { RequestMethod.POST, RequestMethod.GET })
		 public Response getFamilydetails(@RequestBody String empid) {
			 return employeeService.getFamilydetails(empid);
		 }
	/* deleting education data */
		 @ResponseBody    
		 @RequestMapping(value = "DeleteEducation", method = { RequestMethod.POST })
		 public Response remove(@RequestBody Integer id)
		 {
			 return employeeService.remove(id);
		 }
	@ResponseBody
		@RequestMapping(value = "addFamilydetails", method = { RequestMethod.POST })
		public Response addFamilydetails(@RequestBody Employee employee)
		{
			System.out.println("hi");
			return employeeService.addFamilydetails(employee);		       
		}
	/* deleting Family data */
		 @ResponseBody
		 @RequestMapping(value = "DeletefamilyDet", method = { RequestMethod.POST })
		 public Response removefamily(@RequestBody Integer id)
		 {
			 return employeeService.removefamily(id);
		 }
	
	////////////////Hr Admin?/////////////////////
		 @ResponseBody
			@RequestMapping(value = { "/saveDepartmentDetails" }, method = { RequestMethod.POST })
			public Response saveDepartmentDetails(@RequestBody Employee employee)
			{ 
				return employeeService.saveDepartmentDetails(employee);      
			} 
			@ResponseBody
			@RequestMapping(value = "getByDepartment", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getByDepartment(@RequestBody String department_name)
			{
				
				return employeeService.getByDepartment(department_name);
			} 
			
			@ResponseBody
			@RequestMapping(value = "getDesignationGroups", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getDesignationGroups()
			{
				return employeeService.getDesignationGroups();
			}
			@ResponseBody
			@RequestMapping(value = "getAllDesignations", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAllDesignations()
			{
				return employeeService.getAllDesignations();
			} 
			@ResponseBody
			@RequestMapping(value = "getByDesignation", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getByDesignation(@RequestBody Employee employee)
			{
				
				return employeeService.getByDesignation(employee);
			}  
			
			@ResponseBody
			@RequestMapping(value = "updateDataDeapartment", method = { RequestMethod.POST })
			public Response updateDataDeapartment(@RequestBody Employee employee)
			{
				
				return employeeService.updateDataDeapartment(employee);
			}
			
			@ResponseBody
			@RequestMapping(value = "updateDesignationData", method = { RequestMethod.POST })
			public Response updateDesignationData(@RequestBody Employee employee)
			{
				
				return employeeService.updateDesignationData(employee);
			}
			@ResponseBody
			@RequestMapping(value = { "/saveDesignationDetails" }, method = { RequestMethod.POST })
			public Response saveDesignationDetails(@RequestBody Employee employee)
			{ 
				return employeeService.saveDesignationDetails(employee);      
			} 
			
			
			
			@ResponseBody
			@RequestMapping(value = "getCastes", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getCastes()
			{
				return employeeService.getCastes();
			} 
			@ResponseBody
			@RequestMapping(value = "getAllGrades", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAllGrades()
			{
				return employeeService.getAllGrades();
			} 
			@ResponseBody
			@RequestMapping(value = "getByGrade", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getByGrade(@RequestBody String grade_name)
			{
				
				return employeeService.getByGrade(grade_name);
			}       
			
			@ResponseBody
			@RequestMapping(value = "updateGradeData", method = { RequestMethod.POST })
			public Response updateGradeData(@RequestBody Employee employee)
			{
				
				return employeeService.updateGradeData(employee);
			}
			@ResponseBody
			@RequestMapping(value = { "/saveGradeDetails" }, method = { RequestMethod.POST })
			public Response saveGradeDetails(@RequestBody Employee employee)
			{ 
				return employeeService.saveGradeDetails(employee);      
			}
			@ResponseBody
			@RequestMapping(value = "getAllCastes", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAllCastes()
			{
				return employeeService.getAllCastes();
			} 
			@ResponseBody
			@RequestMapping(value = "getByCaste", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getByCaste(@RequestBody String name)
			{
				
				return employeeService.getByCaste(name);
			}       
			
			@ResponseBody
			@RequestMapping(value = "updateCasteData", method = { RequestMethod.POST })
			public Response updateCasteData(@RequestBody Employee employee)
			{
				
				return employeeService.updateCasteData(employee);
			}
			@ResponseBody
			@RequestMapping(value = { "/saveCasteDetails" }, method = { RequestMethod.POST })
			public Response saveCasteDetails(@RequestBody Employee employee)
			{ 
				return employeeService.saveCasteDetails(employee);      
			} 
			@ResponseBody
			@RequestMapping(value = "getAllLocations", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAllLocations()
			{
				return employeeService.getAllLocations();
			} 
			@ResponseBody
			@RequestMapping(value = "getByLocation", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getByLocation(@RequestBody String name)
			{
				
				return employeeService.getByLocation(name);
			}       
			
			@ResponseBody
			@RequestMapping(value = "updateLocationData", method = { RequestMethod.POST })
			public Response updateLocationData(@RequestBody Employee employee)
			{
				
				return employeeService.updateLocationData(employee);
			}
			@ResponseBody
			@RequestMapping(value = { "/saveLocationDetails" }, method = { RequestMethod.POST })
			public Response saveLocationDetails(@RequestBody Employee employee)
			{ 
				return employeeService.saveLocationDetails(employee);      
			}
			
			@ResponseBody
			@RequestMapping(value = "getAllHelpDeskTypes", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getAllHelpDeskTypes()
			{
				return employeeService.getAllHelpDeskTypes();
			} 
			@ResponseBody
			@RequestMapping(value = "getByHelpDesk", method = { RequestMethod.POST, RequestMethod.GET })
			public Response getByHelpDesk(@RequestBody Integer id)
			{
				
				return employeeService.getByHelpDesk(id);
			}       
			
			@ResponseBody
			@RequestMapping(value = "updateHelpDeskData", method = { RequestMethod.POST })
			public Response updateHelpDeskData(@RequestBody Employee employee)
			{
				
				return employeeService.updateHelpDeskData(employee);
			}
			@ResponseBody
			@RequestMapping(value = { "/saveHelpDeskDetails" }, method = { RequestMethod.POST })
			public Response saveHelpDeskDetails(@RequestBody Employee employee)
			{ 
				return employeeService.saveHelpDeskDetails(employee);      
			} 
	
	
	
	
}             