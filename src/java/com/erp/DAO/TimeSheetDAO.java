
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.TimeSheet;

@Repository
public class TimeSheetDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public void add(TimeSheet timesheetModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", timesheetModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("TimeSheet.Insert", params);
		sqlSession.close();
	}

	public List<TimeSheet> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<TimeSheet> userdetails=sqlSession.selectList("TimeSheet.getAll");
		sqlSession.close();
		return userdetails;
	}

	public void remove(String task)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("TimeSheet.deleteData",task);
		sqlSession.close();
	}

	public TimeSheet getById(String task)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		TimeSheet singleuserdetails=sqlSession.selectOne("TimeSheet.getById",task);
		sqlSession.close();
		return singleuserdetails;
		
	}
	 public List<Map<String, Object>> getReportings()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("TimeSheet.getReportings");
	    return list;
	  }
	
public Map<String, Object>getTeamSheets(TimeSheet report)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("TimeSheet.getTeamSheets",params);
	     params.put("centers",list);
	    return params;
	  }
	 public Map<String, Object>getSheets1(TimeSheet report1)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report1);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("TimeSheet.getSheets1",params);
	     params.put("centers",list);
	    return params;
	  }
	/* public Map<String, Object>getAttSheets(TimeSheet report2)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report2);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("TimeSheet.getAttSheets",params);
	     params.put("centers",list);
	    return params;
	  }*/
	 public void updateDataapprove(TimeSheet  approve)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", approve);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("TimeSheet.updateDataapprove",params);
			sqlSession.close();
		}
	
	 public void updateDatareject(TimeSheet  reject)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", reject);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("TimeSheet.updateDatareject",params);
			sqlSession.close();
		}
	 
	 /* getting calendar details based on from date,to date*/
	  public Map<String,Object> getCalendarDetailsdet(TimeSheet timesheetModel)
	  {
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("p",timesheetModel);
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("TimeSheet.getCalendarDetailsdet",map);
	    map.put("dates",list);
	    return map;
	  }

	  public Map<String, Object>getAttSheets(TimeSheet timesheetModel)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",timesheetModel);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("TimeSheet.getAttSheets",params);
	     params.put("centers",list);
	    return params;
	  }
	  
	 
	  
}
