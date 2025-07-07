package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Ctc;
import com.erp.Model.Employee;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.Selfservices;
    


@Repository
public class EmployeeDao extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;   
		
	
	/*Updating CTC calculator*/
	
	
	 public void updateCTC(Ctc employee)   
		{   
		 	
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("EmployeeMaster.InsertModifiedCTC",params);
			sqlSession.commit();
			//List <Employee> user = sqlSession.selectList("EmployeeMaster.getCalculated");d
			Integer inserted = sqlSession.insert("EmployeeMaster.InsertModifiedCTC1",params);
			System.out.println("======================================="+inserted+"======================");
			sqlSession.commit();
			sqlSession.update("EmployeeMaster.updateModifiedCTC",params);
			sqlSession.close();
			
			
			/*sqlSession.update("EmployeeMaster.updateCTC",params);
			
			sqlSession.close();*/
		}
	
	
	
	
	 public void submit(Employee employee)
	  {
	  Map<String, String> map = new HashMap<String, String>();
	  String rolesList[]=employee.getRoles();
	  for(int i=0;i<employee.getRoles().length;i++) 
	  {
	  map.put("empid",employee.getEmpid());
	  map.put("role", rolesList[i]);
	  sqlSessionTemplate.insert("EmployeeData.insertRoles",map);
	  }
	  }   
	/*public Employee getDetails(String empid)
	  {
		//System.out.println("empoid DAO: " + empid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empid", empid); 
	    Employee list = this.sqlSessionTemplate.selectOne("EmployeeData.getDetails",empid);
	    return list;
	  }
	*/
	                                                                       

	  /*public Employee getDetails(String empid)
	  {
	    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.getDetails", empid);
	    return list;
	  }
	  
	   hr profile details 
	  
	  public Employee gethrDetails(String empid)    
	  {
	    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.gethrDetails", empid);
	    return list;
	  }*/
                           
	/*
	 public List<Map<String, Object>> getDetails(String empid)   
	  {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("empsid", empid); 
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDetails",empid);
	    return list;
	  }
	*/
	
	 /*public List<Map<String, Object>> getCaders()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCaders");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getEmp()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getEmp");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getRelations()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getRelations");
	    return list;
	  }
	 public List<Map<String, Object>> getDistricts()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDistricts");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getGrades()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getGrades");
	    return list;
	  }
	 public List<Map<String, Object>> getDepartment()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDepartment");
	    return list;
	  }
	 public List<Map<String, Object>> getDivision()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDivision");
	    return list;
	  }
	 public List<Map<String, Object>> getCost_center()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCost_center");
	    return list;
	  }
	 public List<Map<String, Object>> getCost_center1()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCost_center1");
	    return list;
	  }
	 public List<Map<String, Object>> getDesignation()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDesignation");
	    return list;
	  }    

	public void add(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi2");
		sqlSession.update("EmployeeData.Update", params);
		sqlSession.insert("EmployeeData.Insert1", params);
		 sqlSession.update("EmployeeData.Update1", params); 
		sqlSession.insert("EmployeeData.Insert4", params);  
		sqlSession.insert("EmployeeData.Insert5", params);
		sqlSession.insert("EmployeeData.Inserteducation", params);		
		
		sqlSession.close();
	}*/       
	
	/* getting education details to table in profile update page */
	
	/*public Employee getAll() {
		
		Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.getAll");
		return list;
	}
	
	 HR profile update 
	
	public void add3(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hihr");
		sqlSession.update("EmployeeData.Updatehr", params);
		sqlSession.insert("EmployeeData.Inserthr1", params);
		 sqlSession.update("EmployeeData.Updatehr1", params); 
		sqlSession.insert("EmployeeData.Inserthr2", params);  
		sqlSession.insert("EmployeeData.Inserthr3", params);
		sqlSession.insert("EmployeeData.Inserthreducation", params);
		
		sqlSession.close();
	}
	  
	public void add1(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi2");
		Integer currentYear  =sqlSession.selectOne("EmployeeData.getYear");
		Integer id  =sqlSession.selectOne("EmployeeData.getCount");
		params.put("year",currentYear);        
		params.put("id",id);
		sqlSession.insert("EmployeeData.Insert6", params);
		String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
		params.put("empid",employeeid);
		sqlSession.insert("EmployeeData.Insert9", params);
		sqlSession.insert("EmployeeData.Insert8", params);    
		String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
		params.put("empid",employeeid);
		sqlSession.insert("EmployeeData.Insert7", params);
		
		sqlSession.close();                        
	} */   
	
	
	/* Scheme, project and sector */
	
	public List<Map<String, Object>> getSchemes()  
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getSchemes");
	    return list;
	  }
	
	public List<Employee> getProjects1(String project_id)  
	  {
	    List<Employee> projects = this.sqlSessionTemplate.selectList("EmployeeData.getProjects1", project_id);
	    return projects;
	  }
	
	public List<Map<String, Object>> getSectors()  
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getSectors");
	    return list;
	  }
	
	/*
	 * public List<Map<String, Object>> getSectors() { List<Map<String, Object>>
	 * list = this.sqlSessionTemplate.selectList("EmployeeData.getSectors"); return
	 * list; }
	 */
	
	/*
	 * public List<Map<String, Object>> getProjects() { List<Map<String, Object>>
	 * list = this.sqlSessionTemplate.selectList("EmployeeData.getProjects"); return
	 * list; }
	 */
	
	/*
	 * public List<Employee> getSectors(Integer sector_id) { List<Employee> sectors
	 * = this.sqlSessionTemplate.selectList("EmployeeData.getSectors", sector_id);
	 * return sectors; }
	 */
	
	
	/* Institute and qualification in update employee education tab(Employee login) */
	
	public List<Map<String, Object>> getInstitutes()  
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getInstitutes");
	    return list;
	  }
	
	public List<Employee> getQualifications(Integer qualification_id)
	  {
	    List<Employee> qualifications = this.sqlSessionTemplate.selectList("EmployeeData.getQualifications", qualification_id);
	    return qualifications;
	  } 
	
	
	/*public void save(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi3");
		sqlSession.insert("EmployeeData.Insert2", params);
		sqlSession.close();
	}   */ 
	
	/* Inserting task in time and attendance sheet */
	
	/*public void add8(Employee employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("EmployeeData.Insertdata", params);
		sqlSession.close();
	}*/
	
	/* Getting Locations in Employee project mapping */
	
	 /*public List<Map<String, Object>> getLocations()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getLocations");
	    return list;
	  }*/
	
	 /* Getting projects in employee project mapping */
	 
	/* public List<Map<String, Object>> getprojects()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getprojects");
	    return list;
	  }*/
	 
	 /* Getting reporting to in employee project mapping */
	 
	 /*public List<Map<String, Object>> getReporting()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getReporting");
	    return list;
	  }*/
	      
	 /* Getting data in project employee mapping */
	 
	 /*public Map<String, Object> getprojectdata(Employee employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);    
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeData.getprojectdata",map);
	  map.put("dates", districts);
	  return map;
	  }  */ 
	 
	 /* Getting all employees of given location */
	 
	/* public Map<String, Object> getallemployees(Employee employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);  
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeData.getallemployees",map);
	  map.put("alldata", districts);
	  return map;
	  }*/
	 
	 /* Adding employees to project in project employee mapping using checkboxes */
	 
	/* public Integer addemployees(String emp_id)
	 {
	 Integer status = sqlSessionTemplate.insert("EmployeeData.addemployees",emp_id);
	 return status;
	 }*/
	 
	 /* Getting data in employee project mapping */
	 
	 /*public Map<String, Object> getempprojectdata(Employee employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);  
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeData.getempprojectdata",map);
	  map.put("dates", districts);
	  return map;
	  }*/
	 
	 /* getting data in pop up based on project name */
	 
	/* public Employee getByproject(String project_name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Employee singleuserdetails=sqlSession.selectOne("EmployeeData.getByproject",project_name);
			sqlSession.close();
			return singleuserdetails;
			
		}*/
	 
	 /* update data based on project_name employee project mapping */
	 
	/* public void updateprojectdata(Employee employee)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("EmployeeData.updateprojectdata1",params);
			sqlSession.close();
		}*/
	 
	 /* Sravya */
	 
		/* getting details of employee */	 
	public Employee getDetails(String empid)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Employee singleuserdetails=sqlSession.selectOne("EmployeeData.getDetails",empid);
		sqlSession.close();
		return singleuserdetails;
		
	}      
		  /* hr profile details */
		  
		  public Employee gethrDetails(String empid)    
		  {
		    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.gethrDetails", empid);
		    return list;
		  }

		 public List<Map<String, Object>> getCaders()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCaders");
		    return list;
		  }
		 
		 public List<Map<String, Object>> GetStatus()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.GetStatus");
		    return list;
		  }
		 
		 
		 public List<Map<String, Object>> getEmp()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getEmp");
		    return list;
		  }
		 
		 
		 public List<Map<String,Object>> getDuration(Employee employee)
			{  
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);      
				
				List<Map<String,Object>> list =   
						sqlSessionTemplate.selectList("EmployeeData.getDuration", params);  
				return list;    
			}
		 
		 
		 
		 
		 public List<Map<String, Object>> getctccalculator()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getctccalculator");
		    return list;
		  }
		 
		 public List<Map<String, Object>> getRelations()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getRelations");
		    return list;
		  }
		 public List<Map<String, Object>> getRoles()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getRoles");
		    return list;
		  }
		 
		 public List<Map<String, Object>> getGrades()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getGrades");
		    return list;
		  }
		 public List<Map<String, Object>> getDepartment()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDepartment");
		    return list;
		  }
		 public List<Map<String, Object>> getDivision()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDivision");
		    return list;
		  }
		 public List<Map<String, Object>> getCost_center()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCost_center");
		    return list;
		  }
		 public List<Map<String, Object>> getCost_center1()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getCost_center1");
		    return list;
		  }
		 public List<Map<String, Object>> getDesignation()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getDesignation");
		    return list;
		  }    

		 public void add(Employee employee) {
			 Map<String, Object> params = new HashMap<String, Object>();
			 params.put("p", employee);        
			 SqlSession sqlSession = sqlSessionFactory.openSession();
			 System.out.println("hi2");
			 sqlSession.update("EmployeeData.UpdatePersonal", params);
			 /* sqlSession.insert("EmployeeData.Insert1", params); */
			 /* sqlSession.update("EmployeeData.Update1", params); */  
			 sqlSession.insert("EmployeeData.InsertProfessional", params);  
			 /* sqlSession.insert("EmployeeData.InsertFamily", params); */
			 /* sqlSession.insert("EmployeeData.Inserteducation", params); */
			 sqlSession.close();
			 } 

		/* getting education details to table in profile update page */
		
		public Employee getAll() {
			
			Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.getAll");
			return list;
		}
		
		/* HR profile update */
		
	/*	public void add3(Employee employee) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			System.out.println("hihr");
			sqlSession.update("EmployeeData.Updatehr", params);
			sqlSession.insert("EmployeeData.Inserthr1", params);
			 sqlSession.update("EmployeeData.Updatehr1", params); 
			sqlSession.insert("EmployeeData.Inserthr2", params);  
			sqlSession.insert("EmployeeData.Inserthr3", params);
			sqlSession.insert("EmployeeData.Inserthreducation", params);
			
			sqlSession.close();
		}*/
		  
		public void add1(Employee employee) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			System.out.println("hi2");
			Integer currentYear  =sqlSession.selectOne("EmployeeData.getYear");
			Integer id  =sqlSession.selectOne("EmployeeData.getCount");
			params.put("year",currentYear);        
			params.put("id",id);
			/*sqlSession.insert("EmployeeData.Insert6", params);
			String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
			params.put("empid",employeeid);*/
			sqlSession.insert("EmployeeData.Insert9", params);
			sqlSession.insert("EmployeeData.Insert8", params);    
			String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
			params.put("empid",employeeid);
			sqlSession.insert("EmployeeData.Insert7", params);
			
			sqlSession.close();                        
		}    

		/* Inserting task in time and attendance sheet */
		
	/*	public void add8(Employee employee) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("EmployeeData.Insertdata", params);
			sqlSession.close();
		}*/
		
		/* getting login,logout details in attendance and timesheet page */
		
		/* public Employee getLoginDetails(String empid)
		  {
		    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.getLoginDetails", empid);
		    return list;
		  }*/
		
		/* Getting Locations in Employee project mapping */
		
		 public List<Map<String, Object>> getLocations()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getLocations");
		    return list;
		  }
		
		 /* Getting projects in employee project mapping */
		 
		 public List<Map<String, Object>> getprojects()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getprojects");
		    return list;
		  }
		 
		 /* Getting reporting to in employee project mapping */
		 
		 public List<Map<String, Object>> getReporting()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeData.getReporting");
		    return list;
		  }
		      
		 /* Getting data in project employee mapping */
		 
		 /* Getting data in project employee mapping */
		 public Map<String, Object> getprojectdata(Employee employee)
		  {
		  Map<String, Object> map = new HashMap<String, Object>();
		  map.put("p", employee);    
		  List<Map<String, Object>> districts =
		  sqlSessionTemplate.selectList("EmployeeData.getprojectdata",map);
		  map.put("dates", districts);
		  return map;
		  }   
 /* Getting all employees of given location */
		 public Map<String, Object> getallemployees(Employee employee)
		  {
		  Map<String, Object> map = new HashMap<String, Object>();
		  map.put("p", employee);  
		  List<Map<String, Object>> districts =
		  sqlSessionTemplate.selectList("EmployeeData.getallemployees",map);
		  map.put("alldata", districts);
		  return map;
		  }
/* Adding employees to project in project employee mapping using checkboxes */
		 public Integer addemployees(Employee employee)
		 {
		 Integer status = sqlSessionTemplate.insert("EmployeeData.addemployees",employee);
		 return status;
		 }
		 
		 /* Getting data in employee project mapping */
		 
		 public Map<String, Object> getempprojectdata(Employee employee)
		  {
		  Map<String, Object> map = new HashMap<String, Object>();
		  map.put("p", employee);  
		  List<Map<String, Object>> districts =
		  sqlSessionTemplate.selectList("EmployeeData.getempprojectdata",map);
		  map.put("dates", districts);
		  return map;
		  }
		 
		 /* getting data in pop up based on project name */
		 
		 public Employee getByproject(String project_name)
			{
				SqlSession sqlSession = sqlSessionFactory.openSession();
				Employee singleuserdetails=sqlSession.selectOne("EmployeeData.getByproject",project_name);
				sqlSession.close();
				return singleuserdetails;
				
			}
		 
		 /* update data based on project_name employee project mapping */
		 
		 public void updateprojectdata(Employee employee)
			{
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.update("EmployeeData.updateprojectdata1",params);
				sqlSession.close();
			}
		 
		    
			/* getting employee data  */
		/*	public Employee getDetails(String empid)
			  {
			    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.getDetails", empid);
			    return list;
			  }*/
			  
			  /* hr profile details */
			  
			 /* public Employee gethrDetails(String empid)    
			  {
			    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.gethrDetails", empid);
			    return list;
			  }*/
			
			/* employee profile update */

			/*public void add(Employee employee) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);         
				SqlSession sqlSession = sqlSessionFactory.openSession();
				System.out.println("hi2");
				sqlSession.update("EmployeeData.Update", params);
				sqlSession.insert("EmployeeData.Insert1", params);
				 sqlSession.update("EmployeeData.Update1", params); 
				sqlSession.insert("EmployeeData.Insert4", params);  
				sqlSession.insert("EmployeeData.Insert5", params);
				sqlSession.insert("EmployeeData.Inserteducation", params);		
				
				sqlSession.close();
			}*/


			/* HR profile update */
			
			public void add3(Employee employee) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);         
				SqlSession sqlSession = sqlSessionFactory.openSession();
				System.out.println("hihr");
				sqlSession.update("EmployeeData.Updatehr", params);
				sqlSession.insert("EmployeeData.Inserthr1", params);
				/* sqlSession.update("EmployeeData.Updatehr1", params); */
				sqlSession.insert("EmployeeData.Inserthr2", params);  
				sqlSession.insert("EmployeeData.Inserthr3", params);
				sqlSession.insert("EmployeeData.Inserthreducation", params);
				
				sqlSession.close();
			}

			
			/* Creating employee */
			public void createemployee(Employee employee) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				System.out.println("hi2");
				Integer currentYear  =sqlSession.selectOne("EmployeeData.getYear");
				Integer currentMonth  =sqlSession.selectOne("EmployeeData.getMonth");
				Integer id  =sqlSession.selectOne("EmployeeData.getCount");
				params.put("year",currentYear); 
				params.put("month",currentMonth);
				params.put("id",id);

				if (employee.getEmployee_type() == 0) {
					sqlSession.insert("EmployeeData.Insert9", params);
					sqlSession.insert("EmployeeData.Insert8", params);    
//					String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
//					params.put("empid",employeeid);
					sqlSession.insert("EmployeeData.Insert7", params);
					sqlSession.insert("EmployeeData.InsertCTC", params);
					sqlSession.insert("EmployeeData.InsertCTCeffectivedate", params);
					/* sqlSession.insert("EmployeeData.InsertProjectDetails", params); */
					sqlSession.insert("EmployeeData.InsertAllowanceDetails", params);
				}
				
				if(employee.getEmployee_type() == 1) {
					sqlSession.insert("EmployeeData.InsertBankOthers", params);
					sqlSession.insert("EmployeeData.InsertPersonalOthers", params);    
//					String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
//					params.put("empid",employeeid);
					sqlSession.insert("EmployeeData.InsertEmployementOthers", params);
					sqlSession.insert("EmployeeData.InsertCTCOthers", params);
					sqlSession.insert("EmployeeData.InsertCTCeffectivedateOthers", params);
					/* sqlSession.insert("EmployeeData.InsertProjectDetails", params); */
					sqlSession.insert("EmployeeData.InsertAllowanceDetailsOthers", params);
				}
				
				if(employee.getEmployee_type() == 3) {
					sqlSession.insert("EmployeeData.InsertBankDeputation", params);
					sqlSession.insert("EmployeeData.InsertPersonalDeputation", params);    
//					String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
//					params.put("empid",employeeid);
					sqlSession.insert("EmployeeData.InsertEmployementDeputation", params);
					sqlSession.insert("EmployeeData.InsertCTCDeputation", params);
					sqlSession.insert("EmployeeData.InsertCTCeffectivedateDeputation", params);
					/* sqlSession.insert("EmployeeData.InsertProjectDetails", params); */
					sqlSession.insert("EmployeeData.InsertAllowanceDetailsDeputation", params);
				}
				
				if(employee.getEmployee_type() == 6) {
					sqlSession.insert("EmployeeData.InsertBankFellow", params);
					sqlSession.insert("EmployeeData.InsertPersonalFellow", params);    
//					String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
//					params.put("empid",employeeid);
					sqlSession.insert("EmployeeData.InsertEmployementFellow", params);
					sqlSession.insert("EmployeeData.InsertCTCFellow", params);
					sqlSession.insert("EmployeeData.InsertCTCeffectivedateFellow", params);
					/* sqlSession.insert("EmployeeData.InsertProjectDetails", params); */
					sqlSession.insert("EmployeeData.InsertAllowanceDetailsFellow", params);
				}
				
				if(employee.getEmployee_type() == 7) {
					sqlSession.insert("EmployeeData.InsertBankOutSourcing", params);
					sqlSession.insert("EmployeeData.InsertPersonalOutSourcing", params);    
//					String employeeid  =sqlSession.selectOne("EmployeeData.getEmployeeID",params);
//					params.put("empid",employeeid);
					sqlSession.insert("EmployeeData.InsertEmployementOutSourcing", params);
					sqlSession.insert("EmployeeData.InsertCTCOutSourcing", params);
					sqlSession.insert("EmployeeData.InsertCTCeffectivedateOutSourcing", params);
					/* sqlSession.insert("EmployeeData.InsertProjectDetails", params); */
					sqlSession.insert("EmployeeData.InsertAllowanceDetailsOutSourcing", params);
				}
				
				sqlSession.close();
			}
        


			/* Inserting task in time and attendance sheet */
			
			public void add8(Employee employee) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.insert("EmployeeData.Insertdata", params);
				sqlSession.close();
			}
			
			/* getting login,logout details in attendance and timesheet page */
			
			 public Employee getLoginDetails(String empid)
			  {
			    Employee list  = this.sqlSessionTemplate.selectOne("EmployeeData.getLoginDetails", empid);
			    return list;
			  }
		 
		
				public void addEducationaldetails(Employee employee) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("p", employee);         
					SqlSession sqlSession = sqlSessionFactory.openSession();
					System.out.println("hi2");
					sqlSession.insert("EmployeeData.addEducationaldetails", params);			
					sqlSession.close();
				} 
		public Map<String, Object> getEducationDetails(String empid)
				  {
				    List<Map<String, Object>> list =
				      this.sqlSessionTemplate.selectList("EmployeeData.getEducationDetails", empid);		    
				       Map<String, Object> map = new HashMap();
				       map.put("educations", list); 		    
				       return map;       
				  }
		public Map<String, Object> getFamilydetails(String empid)
				  {
				    List<Map<String, Object>> list =
				      this.sqlSessionTemplate.selectList("EmployeeData.getFamilydetails", empid);		    
				       Map<String, Object> map = new HashMap();
				       map.put("families", list); 		    
				       return map;       
				  }
		/* deleting education details */
				public void remove(Integer id)
				{
					SqlSession sqlSession = sqlSessionFactory.openSession();
					sqlSession.delete("EmployeeData.DeleteEducation",id);
					sqlSession.close();
				}
		public void addFamilydetails(Employee employee) {
					Map<String, Object> params = new HashMap<String, Object>();
					params.put("p", employee);         
					SqlSession sqlSession = sqlSessionFactory.openSession();
					System.out.println("hi2");
					sqlSession.insert("EmployeeData.InsertFamily", params);		
					sqlSession.close();
				} 
		/* deleting family details */
				public void removefamily(Integer id)
				{
					SqlSession sqlSession = sqlSessionFactory.openSession();
					sqlSession.delete("EmployeeData.DeletefamilyDet",id);
					sqlSession.close();
				}
////////Employee Settings////////
				
				 public  void saveDepartmentDetails(Employee employee) {
						Map<String, Object>params = new HashMap<String, Object>();
						params.put("p", employee);
						SqlSession sqlSession = sqlSessionFactory.openSession();
						sqlSession.insert("EmployeeData.saveDepartmentDetails", params);
						sqlSession.close();
					}
					
					public List<Map<String, Object>> getAllDepartments()
					  {
					    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getAllDepartments");
					return list;
					  }
					public Employee getByDepartment(String department_name)
						{ 
							
						 Employee employee = sqlSessionTemplate.selectOne("EmployeeData.getByDepartment",department_name);
							return employee;             
							
						}
					public void updateDataDeapartment(Employee employee)   
						{
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);   
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.update("EmployeeData.updateDataDeapartment",params);
							sqlSession.close();
						}
					
					public List<Map<String, Object>> getDesignationGroups()
					  {
					    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getDesignationGroups");
					return list;
					  }
					
					public List<Map<String, Object>> getAllDesignations()
					  {
					    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getAllDesignations");
					return list;
					  }
				/*	public Employee getByDesignation(String designation_name)
						{ 
							
						 Employee employee = sqlSessionTemplate.selectOne("EmployeeData.getByDesignation",designation_name);
							return employee;             
							
						}*/
					
					public  Employee getByDesignation( Employee employee)
					{
						SqlSession sqlSession = sqlSessionFactory.openSession();
						Map<String, Object> params = new HashMap<String, Object>();
						params.put("p", employee);
						Employee singleuserdetails=sqlSession.selectOne("EmployeeData.getByDesignation",params);
						sqlSession.close();      
						return singleuserdetails;
						
					}    
					public void updateDesignationData(Employee employee)   
						{
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);   
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.update("EmployeeData.updateDesignationData",params);
							sqlSession.close();
						}
					public void saveDesignationDetails(Employee employee) {
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.insert("EmployeeData.saveDesignationDetails", params);
							sqlSession.close();
						}
					
					public List<Map<String, Object>> getAllGrades()
					  {
					    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getAllGrades");
					return list;
					  }
					
					
					public List<Map<String, Object>> getCastes()
					  {
					    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getCastes");
					return list;
					  }
					
					
					
					public Employee getByGrade(String grade_name)
						{ 
							
						 Employee employee = sqlSessionTemplate.selectOne("EmployeeData.getByGrade",grade_name);
							return employee;             
							
						}
					public void updateGradeData(Employee employee)   
						{
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);   
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.update("EmployeeData.updateGradeData",params);
							sqlSession.close();
						}
					public void saveGradeDetails(Employee employee) {
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.insert("EmployeeData.saveGradeDetails", params);
							sqlSession.close();
						}
					public List<Map<String, Object>> getAllCastes()
					  {
					    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getAllCastes");
					return list;
					  }
					public Employee getByCaste(String name)
						{ 
							
						 Employee employee = sqlSessionTemplate.selectOne("EmployeeData.getByCaste",name);
							return employee;             
							
						}
					public void updateCasteData(Employee employee)   
						{
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);   
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.update("EmployeeData.updateCasteData",params);
							sqlSession.close();
						}
					public void saveCasteDetails(Employee employee) {
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.insert("EmployeeData.saveCasteDetails", params);
							sqlSession.close();
						}
					public List<Map<String, Object>> getAllLocations()
					  {
					    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getAllLocations");
					return list;
					  }
					public Employee getByLocation(String name)
						{ 
							
						 Employee employee = sqlSessionTemplate.selectOne("EmployeeData.getByLocation",name);
							return employee;             
							
						}
					public void updateLocationData(Employee employee)   
						{
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);   
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.update("EmployeeData.updateLocationData",params);
							sqlSession.close();
						}
					public void saveLocationDetails(Employee employee) {
							Map<String, Object>params = new HashMap<String, Object>();
							params.put("p", employee);
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.insert("EmployeeData.saveLocationDetails", params);
							sqlSession.close();
						}
					
					public Employee getByHelpDesk(Integer id)
					{ 
						
					 Employee employee = sqlSessionTemplate.selectOne("EmployeeData.getByHelpDesk",id);
						return employee;             
						
					}
				public void updateHelpDeskData(Employee employee)   
					{
						Map<String, Object>params = new HashMap<String, Object>();
						params.put("p", employee);   
						SqlSession sqlSession = sqlSessionFactory.openSession();
						sqlSession.update("EmployeeData.updateHelpDeskData",params);
						sqlSession.close();
					}
				public void saveHelpDeskDetails(Employee employee) {
						Map<String, Object>params = new HashMap<String, Object>();
						params.put("p", employee);
						SqlSession sqlSession = sqlSessionFactory.openSession();
						sqlSession.insert("EmployeeData.saveHelpDeskDetails", params);
						sqlSession.close();
					}
				public List<Map<String, Object>> getAllHelpDeskTypes()
				  {
				    List<Map<String, Object>>list = this.sqlSessionTemplate.selectList("EmployeeData.getAllHelpDeskTypes");
				return list;
				  }
	 
	
}  
