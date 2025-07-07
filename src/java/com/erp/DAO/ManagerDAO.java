
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Manager;
import com.erp.Model.TimeSheet;

@Repository
public class ManagerDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public void add(Manager managerModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", managerModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Manager.Insert", params);
		sqlSession.close();
	}

	public List<Manager> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Manager> userdetails=sqlSession.selectList("Manager.getAll");
		sqlSession.close();
		return userdetails;
	}

	public void remove(String task)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Manager.deleteData",task);
		sqlSession.close();
	}

	public Manager getById(String task)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Manager singleuserdetails=sqlSession.selectOne("Manager.getById",task);
		sqlSession.close();
		return singleuserdetails;
		
	}
	 public Map<String, Object>getLoginSheets(Manager report)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Manager.getLoginSheets",params);
	     params.put("centers",list);
	    return params;
	  }
	 public Map<String, Object>getLeaveSheets(Manager report1)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report1);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Manager.getLeaveSheets",params);
	     params.put("centers",list);
	    return params;
	  }
	 public Map<String, Object>getLoginbefore11(String login_date)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",login_date);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Manager.getLoginbefore11",params);
	     params.put("centers",list);
	    return params;
	  }
	
	 public Map<String, Object>getLoginafter11(String login_date)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",login_date);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Manager.getLoginafter11",params);
	     params.put("centers",list);
	    return params;
	  }
	 public Map<String, Object>getMissedLogin(String login_date)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",login_date);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Manager.getMissedLogin",params);
	     params.put("centers",list);
	    return params;
	  }
	 public Map<String, Object>getAllReports(String login_date)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",login_date);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Manager.getAllReports",params);
	     params.put("centers",list);
	    return params;
	  }
	 public Map<String, Object> getLeavesReport(String login_date)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",login_date);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Manager.getLeavesReport",params);
	     params.put("centers",list);
	    return params;
	  }
	
	 public void updateDataapprove( Manager  approve)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", approve);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Manager.updateDataapprove",params);
			sqlSession.close();
		}
	 public void updateDatareject( Manager  reject)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", reject);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Manager.updateDatareject",params);
			sqlSession.close();
		}
	 public List<Manager> getByIdviewlogin(String login_date)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<Manager> singleuserdetails=sqlSession.selectList("Manager.getByIdviewlogin",login_date);
			sqlSession.close();      
			return singleuserdetails;
			
		}
	
	
}
