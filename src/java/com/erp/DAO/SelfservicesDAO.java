
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;           
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.EmployeeMaster;
import com.erp.Model.Sdeigroup;
import com.erp.Model.Selfservices;


@Repository
public class SelfservicesDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	public List<Selfservices> getCategories() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getCategories");
		sqlSession.close();
		return userdetails;
	}
	public List<Selfservices> getAssigns() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getAssigns");
		sqlSession.close();
		return userdetails;
	}
	public List<Selfservices> getStatuss() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getStatuss");
		sqlSession.close();
		return userdetails;
	}
	public List<Selfservices> getReqtypes(Integer request_categoryid) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getReqtypes",request_categoryid);
		sqlSession.close();
		return userdetails;
	}
	
	
/*on duty request*/
	public void addonduty(Selfservices selfservicesModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", selfservicesModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Selfservices.Insert", params);
		sqlSession.close();
	}
	public List<Selfservices> getProjects() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getProjects");
		sqlSession.close();
		return userdetails;
	}
	
	public List<Selfservices> getAllduty() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getAllduty");
		sqlSession.close();
		return userdetails;
	}
	/*
	 * public Selfservices getById(String location) { SqlSession sqlSession =
	 * sqlSessionFactory.openSession(); Selfservices
	 * singleuserdetails=sqlSession.selectOne("Selfservices.getById",location);
	 * sqlSession.close(); return singleuserdetails;
	 * 
	 * }
	 */

	public Selfservices getById1(String location)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Selfservices singleuserdetails=sqlSession.selectOne("Selfservices.getById1",location);
		sqlSession.close();
		return singleuserdetails;
		
	}

	public void remove(String location)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Selfservices.deleteData",location);
		sqlSession.close();
	}

	
	public void updateData(Selfservices selfservicesModel)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", selfservicesModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Selfservices.updateData",params);
		sqlSession.close();     
	}
	public void updateDataCancel(Selfservices selfservicesModel)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", selfservicesModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Selfservices.updateDataCancel",params);
		sqlSession.close();
	}
	/*getting reporting*/
	public List<Selfservices> getReportings() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getReportings");
		sqlSession.close();
		return userdetails;
	}
	 public Selfservices getReporting(String empid)
	  {
		 Selfservices list  = this.sqlSessionTemplate.selectOne("Selfservices.getReporting", empid);
	    return list;
	  }
	
	
	
	
	
	
	
	/*on travel request*/
	public void addontravel(Selfservices selfservicesModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", selfservicesModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Selfservices.Insert2", params);
		sqlSession.close();
	}
	
	
	public List<Selfservices> getAlltravel() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getAlltravel");
		sqlSession.close();
		return userdetails;
	}
	/*
	 * public Selfservices getById2(String location) { SqlSession sqlSession =
	 * sqlSessionFactory.openSession(); Selfservices
	 * singleuserdetails=sqlSession.selectOne("Selfservices.getById2",location);
	 * sqlSession.close(); return singleuserdetails;
	 * 
	 * }
	 */
	
	

	public void remove2(String location)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Selfservices.deleteData2",location);
		sqlSession.close();
	}

	
	public void updateData2(Selfservices selfservicesModel)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", selfservicesModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Selfservices.updateData2",params);
		sqlSession.close();
	}
	public void updateData2Cancel(Selfservices selfservicesModel)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", selfservicesModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Selfservices.updateData2Cancel",params);
		sqlSession.close();
	}
	
	
	 
	 /*getting reporting*/
	
	 public Selfservices getReportings(String empid)
	  {
		 Selfservices list  = this.sqlSessionTemplate.selectOne("Selfservices.getReportings", empid);
	    return list;
	  }
	 /*on helpdesk request*/
		public void addhelpdesk(Selfservices selfservicesModel) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", selfservicesModel);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer currentYear  =sqlSession.selectOne("Selfservices.getYear");
			Integer id  =sqlSession.selectOne("Selfservices.getCount");
			params.put("year",currentYear);        
			params.put("id",id);
			sqlSession.insert("Selfservices.Insert3", params);
			sqlSession.close();
		}
		
		
		public List<Selfservices> getAllhelpdesk() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getAllhelpdesk");
			System.out.println("--------------------------------------------"+userdetails+"---------------------");
			sqlSession.close();
			return userdetails;
		}
		
		public List<Selfservices> getAllclosedhelpdesk() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getAllclosedhelpdesk");
			System.out.println("--------------------------------------------"+userdetails+"---------------------");
			sqlSession.close();
			return userdetails;
		}
		public Selfservices getById3(String request_id)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Selfservices singleuserdetails=sqlSession.selectOne("Selfservices.getById3",request_id);
			sqlSession.close();
			return singleuserdetails;	
		}
		public Selfservices getname(String empid)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Selfservices singleuserdetails=sqlSession.selectOne("Selfservices.getname",empid);
			sqlSession.close();
			return singleuserdetails;
			
		}
		public void remove3(String request_id)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.delete("Selfservices.deleteData3",request_id);
			sqlSession.close(); 
		}

		public Selfservices getByIdview(String request_id)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Selfservices singleuserdetails=sqlSession.selectOne("Selfservices.getByIdview",request_id);
			sqlSession.close();
			return singleuserdetails;
			
		}
		
		public void updateData3(Selfservices selfservicesModel)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", selfservicesModel);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Selfservices.updateData3",params);
			sqlSession.close();
		}
		public void updateDataAssign(Selfservices selfservicesModel)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", selfservicesModel);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Selfservices.updateDataAssign",params);
			sqlSession.close();
		}           
		public void updateDataEmpcomm(Selfservices selfservicesModel)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", selfservicesModel);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Selfservices.updateDataEmpcomm",params);
			sqlSession.close();
		}
		
		
		public void updateDatahrcomm(Selfservices selfservicesModel)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", selfservicesModel);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Selfservices.updateDatahrcomm",params);
			sqlSession.close();
		}
		
		
	
	public void exitemployee(Selfservices selfservicesModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", selfservicesModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Selfservices.exitemployee", params);
		sqlSession.close();
	}

	/*
	 * public List<Selfservices> getexitreportemployees() { SqlSession sqlSession =
	 * sqlSessionFactory.openSession(); List<Selfservices>
	 * userdetails=sqlSession.selectList("Selfservices.getexitreportemployees");
	 * sqlSession.close(); return userdetails; }
	 */
public List<Selfservices> getEmployeeDirectory() {
	SqlSession sqlSession = sqlSessionFactory.openSession();
	List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getEmployeeDirectory");
	sqlSession.close();
	return userdetails;
}




public void addexitemployee(Selfservices selfservicesModel) {
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("p", selfservicesModel);
	SqlSession sqlSession = sqlSessionFactory.openSession();
	sqlSession.insert("Selfservices.Insertexitemployee", params);
	sqlSession.close();
}
public Selfservices getNoticePeriod(String empid)
  {
	 Selfservices list  = this.sqlSessionTemplate.selectOne("Selfservices.getNoticePeriod", empid);
    return list;
  }
public Selfservices getallexitemployee(String empid)
{
	 Selfservices list  = this.sqlSessionTemplate.selectOne("Selfservices.getallexitemployee", empid);
  return list;
}
public Selfservices getallprojectemployee(String empid)
{
	 Selfservices list  = this.sqlSessionTemplate.selectOne("Selfservices.getallprojectemployee", empid);
  return list;
}

public List<Selfservices>  getByIdemployeeexit(String empid)
{
	SqlSession sqlSession = sqlSessionFactory.openSession();
	List<Selfservices>singleuserdetails=sqlSession.selectOne("Selfservices.getByIdemployeeexit",empid);
	sqlSession.close();
	return singleuserdetails;
	
}
public List<Selfservices> getexitreportemployees() {
	SqlSession sqlSession = sqlSessionFactory.openSession();
	List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getexitreportemployees");
	sqlSession.close();
	return userdetails;
}
     
public List<Selfservices> getHelpDeskTrackerDetails() {
	SqlSession sqlSession = sqlSessionFactory.openSession();
	List<Selfservices> userdetails=sqlSession.selectList("Selfservices.getHelpDeskTrackerDetails");
	sqlSession.close();
	return userdetails;
}

public Selfservices getById2(Selfservices travel)
{
	SqlSession sqlSession = sqlSessionFactory.openSession();
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("p", travel);
	Selfservices singleuserdetails=sqlSession.selectOne("Selfservices.getById2",params);
	sqlSession.close();      
	return singleuserdetails;
	
}

public Selfservices getById(Selfservices duty)
{
	SqlSession sqlSession = sqlSessionFactory.openSession();
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("p", duty);
	Selfservices singleuserdetails=sqlSession.selectOne("Selfservices.getById",params);
	sqlSession.close();      
	return singleuserdetails;
	
}        

public Selfservices getByIdviews(Selfservices duty)
{
	SqlSession sqlSession = sqlSessionFactory.openSession();
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("p", duty);
	Selfservices singleuserdetails=sqlSession.selectOne("Selfservices.getByIdviews",params);
	sqlSession.close();      
	return singleuserdetails;
	
}

	  
}
