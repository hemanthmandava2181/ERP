package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Employee;
import com.erp.Model.EmployeeMaster;

@Repository
public class EmployeeMasterDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public List<EmployeeMaster> getNameWiseData(EmployeeMaster table) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		String empid = table.empid;
		List<EmployeeMaster> nameWiseData = sqlSession.selectList("EmployeeMaster.getNameWiseData", empid);
		sqlSession.close();
		return nameWiseData;
	}
	
	public List<Map<String, Object>> getemployeemaster(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getemployeemaster", params);
		return list;
		}
	public List<Map<String, Object>> search(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.search", params);
		return list;
	}

	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll");
		return list;
	}
	
   /* update data based on empid in employee master */
	
	public EmployeeMaster getById(String empid)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		EmployeeMaster singleuserdetails=sqlSession.selectOne("EmployeeMaster.getById",empid);
		sqlSession.close();
		return singleuserdetails;
		
	}
public void updateData(EmployeeMaster employee)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("EmployeeMaster.updateData",params);
		sqlSession.close();
	}
	
	
	public List<Map<String, Object>> getsearch(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getsearch", params);
		return list;
	}

	public List<Map<String, Object>> getCaders() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getCaders");
		return list;
	}

	public List<Map<String, Object>> getGrades() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getGrades");
		return list;
	}

	public List<Map<String, Object>> getDepartment() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getDepartment");
		return list;
	}

	public List<Map<String, Object>> getDesignation() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getDesignation");
		return list;
	}

	/* create hiring request add method */

	public void add(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer id = sqlSession.selectOne("EmployeeMaster.getCount1");
		params.put("id", id);
		sqlSession.insert("EmployeeMaster.Insert", params);
		sqlSession.close();
	}

	
	/* candidate Registration add1 method */

	/*
	 * public void add1(EmployeeMaster employee) { Map<String, Object> params = new
	 * HashMap<String, Object>(); params.put("p", employee); SqlSession sqlSession =
	 * sqlSessionFactory.openSession();
	 * 
	 * Integer id =sqlSession.selectOne("EmployeeMaster.getCount1");
	 * params.put("id",id);
	 * 
	 * sqlSession.insert("EmployeeMaster.Insert0", params); sqlSession.close(); }
	 */
	
	public void add1(EmployeeMaster employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("EmployeeMaster.Insert0", params);
		sqlSession.close();
	}

	/* getting details in table for hiring request */

	public List<Map<String, Object>> hiringRequest() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.hiringRequest");
		return list;
	}

	/* Education and branches in candidate registration */

	public List<Map<String, Object>> getEducations() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getEducations");
		return list;
	}

	public List<EmployeeMaster> getBranches(Integer branch_id) {
		List<EmployeeMaster> branches = this.sqlSessionTemplate.selectList("EmployeeMaster.getBranches", branch_id);
		return branches;
	}
	
	/* Getting details to front end Select Candidate */
	
	public List<Map<String, Object>> getCandidates() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getCandidates");
		return list;
	}
	
	/* getting data in table for Others in payslip */
	
	public Map<String, Object> getdetails(EmployeeMaster employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);

	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeMaster.getdetails",map);
	  map.put("dates", districts);
	  return map;
	  }

	/* Getting Employee type for attendance sheet */
	 
	 public List<Map<String, Object>> getStaff()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getStaff");
	    return list;
	  }
	
	/* search bar in hiring request */

	/*
	 * public List<Map<String, Object>> getHiringsearch(EmployeeMaster employee) {
	 * Map<String, Object> params = new HashMap<String, Object>(); params.put("p",
	 * employee); List<Map<String, Object>> list =
	 * this.sqlSessionTemplate.selectList("EmployeeMaster.getHiringsearch",params);
	 * return list; }
	 */

/* Getting Data in My timesheet Page */
	 
	 public Map<String, Object> getdata(EmployeeMaster employee)
	  {
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("p", employee);
	  List<Map<String, Object>> districts =
	  sqlSessionTemplate.selectList("EmployeeMaster.getdata",map);
	  map.put("dates", districts);
	  return map;
	  }
	 
	 /* Getting data based on empid in my timesheet view and edit button */
		/*
		 * public EmployeeMaster getByIddata(String empid) { SqlSession sqlSession =
		 * sqlSessionFactory.openSession(); EmployeeMaster
		 * singleuserdetails=sqlSession.selectOne("EmployeeMaster.getByIddata",empid);
		 * sqlSession.close(); return singleuserdetails; }
		 */
		  
	 public EmployeeMaster  getByIddata(EmployeeMaster mytimesheet)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", mytimesheet);
			EmployeeMaster singleuserdetails=sqlSession.selectOne("EmployeeMaster.getByIddata",params);
			sqlSession.close();      
			return singleuserdetails; 
			
		}
		  
		  /* Removing data based on task in my timesheet page */
		  
	 public void remove(String task)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.delete("EmployeeMaster.deletedata",task);
			sqlSession.close();
		}
		  
		  /* updating data based on task in my timesheet page */
		  
		  public void updatedata(EmployeeMaster employee)
			{
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", employee);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.update("EmployeeMaster.updatedata",params);
				sqlSession.close();
			}
		  
		  /* Getting details to popup in attendance sheet page */
			 
			 public EmployeeMaster getstatus(EmployeeMaster employee)
				{
					SqlSession sqlSession = sqlSessionFactory.openSession();
					EmployeeMaster singleuserdetails=sqlSession.selectOne("EmployeeMaster.getstatus",employee);
					sqlSession.close();
					return singleuserdetails;		
				}
			 
			 public EmployeeMaster getstatusab(EmployeeMaster employee)
				{
					SqlSession sqlSession = sqlSessionFactory.openSession();
					EmployeeMaster singleuserdetails=sqlSession.selectOne("EmployeeMaster.getstatusab",employee);
					System.out.println("######################################ghjk#################################");
					sqlSession.close();
					return singleuserdetails;
					
				}
			 
			
				 
				 /* getting report in attendance report page */
				 public List<Map<String, Object>> getAllname()
				  {
				    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAllname");
				    return list;
				  }
				        
				
				 
				 public List<Map<String, Object>> getAll1() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll1");
						return list;
					}
					public List<Map<String, Object>> getAll2() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll2");
						return list;
					}
					public List<Map<String, Object>> getAll3() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll3");
						return list;
					} 
					public List<Map<String, Object>> getAll4() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll4");
						return list;
					}
					public List<Map<String, Object>> getAll5() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll5");
						return list;
					}
					public List<Map<String, Object>> getAll6() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll6");
						return list;
					}
					public List<Map<String, Object>> getAll7() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll7");
						return list;
					}
					public List<Map<String, Object>> getAll8() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll8");
						return list;
					}
					public List<Map<String, Object>> getAll9() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getAll9");
						return list;
					}
					
					public List<Map<String, Object>> getempid() {
						List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getempid");
						return list;
					}
					
					
					public void updateData12(EmployeeMaster employee)
					{
						Map<String, Object> params = new HashMap<String, Object>();
						params.put("p", employee);
						SqlSession sqlSession = sqlSessionFactory.openSession();
						sqlSession.update("EmployeeMaster.updateData12",params);
						sqlSession.close();
					}
					
					 public List<Map<String, Object>> gethr()
					  {
					    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.gethr");
					    return list;
					  }
					 
					 
					 
					   
					 
					 public Integer Approveall(String empdata) throws JSONException  
					 {
					 Map<String, Object> map = new HashMap<String, Object>();
					 System.out.println(empdata);
					 EmployeeMaster emp = new EmployeeMaster();
						String emparray[]=empdata.split(",");
						emp.setMonth(emparray[1]);
						emp.setEmpid(emparray[0]);
						emp.setContract_from(emparray[2]);
						emp.setContract_to(emparray[3]);
						emp.setComments(emparray[4]);
						/*System.out.println(emparray[0]);
						System.out.println(emparray[1]);
						JSONObject obj=new JSONObject();
						obj.put("empid",emparray[0]);
						obj.put("Month",emparray[1]);
						System.out.println(obj);
						*/
						map.put("p",emp);
						SqlSession sqlSession = sqlSessionFactory.openSession();

						int status = sqlSession.update("EmployeeMaster.Approveall",map); 
						/*sqlSession.close();
						SqlSession sqlSession2 = sqlSessionFactory.openSession();*/
						sqlSession.insert("EmployeeMaster.inserthistory", map);
						sqlSession.close();
				/*	 Integer status=sqlSessionTemplate.update("EmployeeMaster.Approveall",map); */
						System.out.println("status approve"+status);
						return status; 
					
					 }
					 
					 public List<Map<String, Object>> getctccalculator()
					  {
					    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getctccalculator");
					    return list;
					  }
					 public EmployeeMaster GetDataByID(EmployeeMaster employee)
					 {

					 EmployeeMaster singleuserdetails=this.sqlSessionTemplate.selectOne("EmployeeMaster.GetDataByID",employee);

					 return singleuserdetails;

					 }
					 
					 
					 /*create apply leave*/
					  public void addleave(EmployeeMaster employee) {
							Map<String, Object> params = new HashMap<String, Object>();
							params.put("p", employee);
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.insert("EmployeeMaster.Insertleave", params);
							sqlSession.close();
						}
					  /*create apply Flexi leave*/   
					  public void addFlexi(EmployeeMaster employee) {
							Map<String, Object> params = new HashMap<String, Object>();
							params.put("p", employee);
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.insert("EmployeeMaster.InsertFlexi", params);
							sqlSession.close();
						}
					  /*create apply Comp leave*/   
					  public void addComp(EmployeeMaster employee) {
							Map<String, Object> params = new HashMap<String, Object>();
							params.put("p", employee);
							SqlSession sqlSession = sqlSessionFactory.openSession();
							sqlSession.insert("EmployeeMaster.InsertComp", params);
							sqlSession.close();
						}
					  /*getting Leavetype*/
						 public List<Map<String, Object>> getLeavetype()
						  {
						    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getLeavetype");
						    return list;
						  }
						 
						 /*getting reporting*/
						
						 public EmployeeMaster getReporting(String empid)
						  {
						    EmployeeMaster list  = this.sqlSessionTemplate.selectOne("EmployeeMaster.getReporting", empid);
						    return list;
						  }
						 
					 /*getting FlexiHolidays*/
						 public List<Map<String, Object>> getFlexiHolidays()
						  {
						    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getFlexiHolidays");
						    return list;
						  } 
						 /*getting FlexiCount*/
						 public List<Map<String, Object>> getFlexiCount(String empid)
						  {
							 Map<String, Object> params = new HashMap<String, Object>();
							 params.put("p", empid);
						    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("EmployeeMaster.getFlexiCount",empid);
						    return list;
						  } 
						 
						 /*Getting leave balance and total leaves*/
						 public EmployeeMaster getTotalleaves(EmployeeMaster employee)
						  {
						    EmployeeMaster list  = this.sqlSessionTemplate.selectOne("EmployeeMaster.getTotalleaves",employee);
						    return list;
						  }

				 

}
