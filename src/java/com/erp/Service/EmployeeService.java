package com.erp.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andromeda.commons.model.Response;
import com.erp.DAO.EmployeeDao;
import com.erp.Model.Ctc;
import com.erp.Model.Employee;
import com.erp.Model.EmployeeMaster;


   

@Service
public class EmployeeService {
	
	Response response = new Response();

	@Autowired
	private EmployeeDao employeeDao;
	
	
	/*updating CTC Calculator*/
	
	
	public Response updateCTC(Ctc employee)
	{
		response.setSuccessful(false);
		employeeDao.updateCTC(employee);
		response.setSuccessful(true);
		response.setResponseObject(employee);
		return response;
	}
	
	
	
	 public void submit(Employee employee) {
		/* System.out.println("========================>");
			System.out.println("Service:"+employee);
			System.out.println("========================>");*/
		  employeeDao.submit(employee);
		  }  
	
	 
	 public Response add(Employee employee) {
		 response.setSuccessful(false);
		 employeeDao.add(employee);
		 response.setSuccessful(true);
		 System.out.println("hi1");
		 response.setResponseObject(employee);
		 return response;
		 }
	
	/* getting education details to table in profile update page */
	
	
	
	/* Scheme, project and Sector */
	
	public Response getSchemes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getSchemes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;    
	}
	
	public Response getProjects1(String scheme_id)
	{
		response.setSuccessful(false);
		List<Employee> projects = employeeDao.getProjects1(scheme_id);
		response.setSuccessful(true);
		response.setResponseObject(projects);
		return response;
	}
	
	public Response getSectors()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getSectors();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	public Response getctccalculator()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getctccalculator();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	/*
	 * public Response getSectors() { response.setSuccessful(false);
	 * List<Map<String, Object>> list = employeeDao.getSectors();
	 * response.setSuccessful(true); response.setResponseObject(list); return
	 * response; }
	 */
	
	/*
	 * public Response getProjects() { response.setSuccessful(false);
	 * List<Map<String, Object>> list = employeeDao.getProjects();
	 * response.setSuccessful(true); response.setResponseObject(list); return
	 * response; }
	 */
	  
	/*
	 * public Response getSectors(Integer project_id) {
	 * response.setSuccessful(false); List<Employee> sectors =
	 * employeeDao.getSectors(project_id); response.setSuccessful(true);
	 * response.setResponseObject(sectors); return response; }
	 */
	
	/* Institute and qualification in update employee education tab(Employee login) */
	
	public Response getInstitutes()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getInstitutes();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	public Response getQualifications(Integer institute_id)
	{
		response.setSuccessful(false);
		List<Employee> qualifications = employeeDao.getQualifications(institute_id);
		response.setSuccessful(true);
		response.setResponseObject(qualifications);
		return response;
	}

	/* inserting task in time and attendance sheet */
	
	/*public Response add8(Employee employee) {
		response.setSuccessful(false);
		employeeDao.add8(employee);
		response.setSuccessful(true);
		System.out.println("hi1");
		response.setResponseObject(employee);
		return response;
	}
	
	 Getting Locations in Employee project Mapping 
	
	public Response getLocations()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getLocations();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	 Getting Projects in employee Project Mapping 
	
	public Response getprojects()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getprojects();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	 Getting reporting to in employee project mapping 
	
	public Response getReporting()
	{
		response.setSuccessful(false);
		List<Map<String, Object>> list = employeeDao.getReporting();
		response.setSuccessful(true);
		response.setResponseObject(list);
		return response;
	}
	
	 Getting data in project employee mapping 
	
	  public Response getprojectdata(Employee employee) {
	  response.setSuccessful(false);
	  Map<String, Object> data = employeeDao.getprojectdata(employee);
	  response.setResponseObject(data);
	  response.setSuccessful(true);
	  return response;
	  }  
	  
	   Getting all employees of given location 
		
	  public Response getallemployees(Employee employee) {
	  response.setSuccessful(false);
	  Map<String, Object> data = employeeDao.getallemployees(employee);
	  response.setResponseObject(data);
	  response.setSuccessful(true);
	  return response;
	  } 
	  
	   Adding employees to project in project employee mapping using check boxes 
	  
	  public Response addemployees(String emp_id)
	  {
		  response.setSuccessful(false);
		  Integer status = employeeDao.addemployees(emp_id);
		  if(status != 0) {
			  response.setSuccessful(true);
		  }else {
			  response.setSuccessful(false);
		  }
		  return response;
	  }
	  
	   getting data in employee project mapping 
		
	  public Response getempprojectdata(Employee employee) {
	  response.setSuccessful(false);
	  Map<String, Object> data = employeeDao.getempprojectdata(employee);
	  response.setResponseObject(data);
	  response.setSuccessful(true);
	  return response;
	  }  
	  
	   getting data in pop up based on project name 
	  
	  public Response getByproject(String project_name)
		{
			response.setSuccessful(false);
			Employee singleuserdetails = employeeDao.getByproject(project_name);
			response.setSuccessful(true);
			response.setResponseObject(singleuserdetails);
			return response;
		}
	  
	   update data based on project_name in employee project mapping 
	  
	  public Response updateprojectdata(Employee employee)
		{
			response.setSuccessful(false);
			employeeDao.updateprojectdata(employee);
			response.setSuccessful(true);
			response.setResponseObject(employee);
			return response;
		}*/
	  
	  /* Sravya */
	  
	public Response getDetails(String empid)
	{
		response.setSuccessful(false);
		Employee singleuserdetails = employeeDao.getDetails(empid);
		response.setSuccessful(true);
		response.setResponseObject(singleuserdetails);
		return response;
	}
		 
		 /* hr profile details */
		 
		 public Response gethrDetails(String empid)
		  {
		    this.response.setSuccessful(false);
		    Employee singleuserdetails = this.employeeDao.gethrDetails(empid);
		    this.response.setSuccessful(true);
		    this.response.setResponseObject(singleuserdetails);
		    return this.response;
		  }

		/* getting education details to table in profile update page */
		
		public Response getAll() {
			response.setSuccessful(false);  
			Employee userdetails = employeeDao.getAll();
			response.setSuccessful(true);
			response.setResponseObject(userdetails);
			return response;
		}
		
		/* HR profile update */
		
		public Response add3(Employee employee) {
			response.setSuccessful(false);
			employeeDao.add3(employee);
			response.setSuccessful(true);
			System.out.println("hi1");
			response.setResponseObject(employee);
			return response;
		}
		
		public Response add1(Employee employee) {
			response.setSuccessful(false);
			employeeDao.add1(employee);
			response.setSuccessful(true);
			System.out.println("hi1");
			response.setResponseObject(employee);
			return response;
		}

		public Response getCaders()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getCaders();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response GetStatus()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.GetStatus();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		
		
		public Response getRelations()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getRelations();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response getRoles()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getRoles();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		public Response getEmp()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getEmp();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		
		
		public Response getDuration(Employee employee)
		{
			response.setSuccessful(false);
			List<Map<String,Object>> list = employeeDao.getDuration(employee);
			response.setResponseObject(list);
			response.setSuccessful(true);    
			return response;
		}  
		
		public Response getGrades()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getGrades();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		public Response getDepartment()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getDepartment();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		public Response getDivision()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getDivision();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		public Response getCost_center()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getCost_center();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		public Response getDesignation()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getDesignation();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		/* inserting task in time and attendance sheet */
		
		public Response add8(Employee employee) {
			/*
			 * int z=0,i=0; String st = employee.getStart_time(); int x=
			 * Integer.parseInt(st); System.out.println(x); String et =
			 * employee.getEnd_time(); int y = Integer.parseInt(et); if (x > 12) { z = 12-x;
			 * } if (y < 12) { i = 12+x; }
			 * 
			 * int d = z+i; employee.setDuration(d);
			 */
			
			response.setSuccessful(false);
			employeeDao.add8(employee);
			response.setSuccessful(true);
			System.out.println("hi1");
			response.setResponseObject(employee);
			return response;
		}
		
		/* getting login,logout details in attendance and timesheet */
		
			public Response getLoginDetails(String empid)
			  {
			    this.response.setSuccessful(false);
			    Employee singleuserdetails = this.employeeDao.getLoginDetails(empid);
			    this.response.setSuccessful(true);
			    this.response.setResponseObject(singleuserdetails);
			    return this.response;
			  }
		
		/* Getting Locations in Employee project Mapping */
		
		public Response getLocations()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getLocations();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		/* Getting Projects in employee Project Mapping */
		
		public Response getprojects()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getprojects();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		/* Getting reporting to in employee project mapping */
		
		public Response getReporting()
		{
			response.setSuccessful(false);
			List<Map<String, Object>> list = employeeDao.getReporting();
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
		}
		
		/* Getting data in project employee mapping */
		
		/* Getting data in project employee mapping */
		  public Response getprojectdata(Employee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = employeeDao.getprojectdata(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }  
/* Getting all employees of given location */
		  public Response getallemployees(Employee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = employeeDao.getallemployees(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  } 
/* Adding employees to project in project employee mapping using check boxes */
		  public Response addemployees(Employee employee)
		  {
			  response.setSuccessful(false);
			  Integer status = employeeDao.addemployees(employee);
			  if(status != 0) {
				  response.setSuccessful(true);
			  }else {
				  response.setSuccessful(false);
			  }
			  return response;
		  }

		  
		  /* getting data in employee project mapping */
			
		  public Response getempprojectdata(Employee employee) {
		  response.setSuccessful(false);
		  Map<String, Object> data = employeeDao.getempprojectdata(employee);
		  response.setResponseObject(data);
		  response.setSuccessful(true);
		  return response;
		  }  
		  
		  /* getting data in pop up based on project name */
		  
		  public Response getByproject(String project_name)
			{
				response.setSuccessful(false);
				Employee singleuserdetails = employeeDao.getByproject(project_name);
				response.setSuccessful(true);
				response.setResponseObject(singleuserdetails);
				return response;
			}
		  
		  /* update data based on project_name in employee project mapping */
		  
		  public Response updateprojectdata(Employee employee)
			{
				response.setSuccessful(false);
				employeeDao.updateprojectdata(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
		  
		  public Response createemployee(Employee employee) {
			  response.setSuccessful(false);
			  employeeDao.createemployee(employee);
			  response.setSuccessful(true);
			  System.out.println("hi1");
			  response.setResponseObject(employee);
			  return response;
			  }
		  
		public Response getDistricts() {
			// TODO Auto-generated method stub
			return null;
		}
		  
		  
		  /* getting details of employee */
		/*	public Response getDetails(String empid)
			  {
			    this.response.setSuccessful(false);
			    Employee singleuserdetails = this.employeeDao.getDetails(empid);
			    this.response.setSuccessful(true);
			    this.response.setResponseObject(singleuserdetails);
			    return this.response;
			  }*/
			 
			 /* hr profile details */
			 
		/*	 public Response gethrDetails(String empid)
			  {
			    this.response.setSuccessful(false);
			    Employee singleuserdetails = this.employeeDao.gethrDetails(empid);
			    this.response.setSuccessful(true);
			    this.response.setResponseObject(singleuserdetails);
			    return this.response;
			  }*/

			/* employee profile update */

		/*	public Response add(Employee employee) {
				response.setSuccessful(false);
				employeeDao.add(employee);
				response.setSuccessful(true);
				System.out.println("hi1");
				response.setResponseObject(employee);
				return response;
			}
*/
			/* creating employee */

			/*public Response add(Employee employee) {
				response.setSuccessful(false);
				employeeDao.add(employee);
				response.setSuccessful(true);
				System.out.println("hi1");
				response.setResponseObject(employee);
				return response;
			}*/

			/* inserting task in time and attendance sheet */
			
		/*	public Response add8(Employee employee) {
				
				 * int z=0,i=0; String st = employee.getStart_time(); int x=
				 * Integer.parseInt(st); System.out.println(x); String et =
				 * employee.getEnd_time(); int y = Integer.parseInt(et); if (x > 12) { z = 12-x;
				 * } if (y < 12) { i = 12+x; }
				 * 
				 * int d = z+i; employee.setDuration(d);
				 
				
				response.setSuccessful(false);
				employeeDao.add8(employee);
				response.setSuccessful(true);
				System.out.println("hi1");
				response.setResponseObject(employee);
				return response;
			}*/
			
			/* getting login,logout details in attendance and timesheet */
			/*
				public Response getLoginDetails(String empid)
				  {
				    this.response.setSuccessful(false);
				    Employee singleuserdetails = this.employeeDao.getLoginDetails(empid);
				    this.response.setSuccessful(true);
				    this.response.setResponseObject(singleuserdetails);
				    return this.response;
				  }*/
	     
		
		
		
		
		
		
		public Response addEducationaldetails(Employee employee) {
			response.setSuccessful(false);
			employeeDao.addEducationaldetails(employee);
			response.setSuccessful(true);
			System.out.println("hi1");
			response.setResponseObject(employee);
			return response;
		}
	public Response getEducationDetails(String empid) {
			response.setSuccessful(false);
			Map<String, Object> list = employeeDao.getEducationDetails(empid);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
			}
	public Response getFamilydetails(String empid) {
			response.setSuccessful(false);
			Map<String, Object> list = employeeDao.getFamilydetails(empid);
			response.setSuccessful(true);
			response.setResponseObject(list);
			return response;
			}
	/* deleting education details */
		public Response remove(Integer id)
		{
			response.setSuccessful(false);
			employeeDao.remove(id);
			response.setSuccessful(true);
			response.setResponseObject(id);
			return response;
		}
	public Response addFamilydetails(Employee employee) {
			response.setSuccessful(false);
			employeeDao.addFamilydetails(employee);
			response.setSuccessful(true);
			System.out.println("hi1");
			response.setResponseObject(employee);
			return response;
		}
	/* deleting family details */
		public Response removefamily(Integer id)
		{
			response.setSuccessful(false);
			employeeDao.removefamily(id);
			response.setSuccessful(true);
			response.setResponseObject(id);
			return response;
		}
		
		//////Employee Settings/////////////
		 public Response saveDepartmentDetails(Employee employee) {
				response.setSuccessful(false);
				employeeDao.saveDepartmentDetails(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			public Response getAllDepartments()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getAllDepartments();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			public Response getByDepartment(String department_name)
			{
				response.setSuccessful(false);
				Employee singleuserdetails = employeeDao.getByDepartment(department_name);
				response.setSuccessful(true);  
				response.setResponseObject(singleuserdetails);
				return response;
			}    

			/*
			 * public Response updateData(Employee employee) {
			 * response.setSuccessful(false); employeeDao.updateData(employee);
			 * response.setSuccessful(true); response.setResponseObject(employee); return
			 * response; }
			 */
			public Response getDesignationGroups()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getDesignationGroups();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			public Response getAllDesignations()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getAllDesignations();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			public Response getByDesignation( Employee employee)
			{
				response.setSuccessful(false);
				Employee singleuserdetails = employeeDao.getByDesignation(employee);
				response.setSuccessful(true);  
				response.setResponseObject(singleuserdetails);
				return response;
			}   
			public Response updateDesignationData(Employee employee)
			{
				response.setSuccessful(false);
				employeeDao.updateDesignationData(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			public Response saveDesignationDetails(Employee employee) {
				response.setSuccessful(false);
				employeeDao.saveDesignationDetails(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			
			public Response getAllGrades()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getAllGrades();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			
			
			
			public Response getCastes()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getCastes();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			
			public Response getByGrade(String grade_name)
			{
				response.setSuccessful(false);
				Employee singleuserdetails = employeeDao.getByGrade(grade_name);
				response.setSuccessful(true);  
				response.setResponseObject(singleuserdetails);
				return response;
			}   
			public Response updateGradeData(Employee employee)
			{
				response.setSuccessful(false);
				employeeDao.updateGradeData(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			public Response saveGradeDetails(Employee employee) {
				response.setSuccessful(false);
				employeeDao.saveGradeDetails(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			
			public Response getAllCastes()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getAllCastes();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			public Response getByCaste(String name)
			{
				response.setSuccessful(false);
				Employee singleuserdetails = employeeDao.getByCaste(name);
				response.setSuccessful(true);  
				response.setResponseObject(singleuserdetails);
				return response;
			}   
			public Response updateCasteData(Employee employee)
			{
				response.setSuccessful(false);
				employeeDao.updateCasteData(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			public Response saveCasteDetails(Employee employee) {
				response.setSuccessful(false);
				employeeDao.saveCasteDetails(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			
			public Response getAllLocations()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getAllLocations();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			public Response getByLocation(String name)
			{
				response.setSuccessful(false);
				Employee singleuserdetails = employeeDao.getByLocation(name);
				response.setSuccessful(true);  
				response.setResponseObject(singleuserdetails);
				return response;
			}   
			public Response updateLocationData(Employee employee)
			{
				response.setSuccessful(false);
				employeeDao.updateLocationData(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			public Response saveLocationDetails(Employee employee) {
				response.setSuccessful(false);
				employeeDao.saveLocationDetails(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			
			public Response getAllHelpDeskTypes()
			{
				response.setSuccessful(false);
				List<Map<String, Object>>list = employeeDao.getAllHelpDeskTypes();
				response.setSuccessful(true);
				response.setResponseObject(list);
				return response;
			}
			public Response getByHelpDesk(Integer id)
			{
				response.setSuccessful(false);
				Employee singleuserdetails = employeeDao.getByHelpDesk(id);
				response.setSuccessful(true);  
				response.setResponseObject(singleuserdetails);
				return response;
			}   
			public Response updateHelpDeskData(Employee employee)
			{
				response.setSuccessful(false);
				employeeDao.updateHelpDeskData(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			
			public Response updateDataDeapartment(Employee employee)
			{
				response.setSuccessful(false);
				employeeDao.updateDataDeapartment(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
			
			
			public Response saveHelpDeskDetails(Employee employee) {
				response.setSuccessful(false);
				employeeDao.saveHelpDeskDetails(employee);
				response.setSuccessful(true);
				response.setResponseObject(employee);
				return response;
			}
       
		
		
		
		
	
}
