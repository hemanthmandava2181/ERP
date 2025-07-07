package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Scheme;
import com.erp.Model.Sdeigroup;
import com.erp.Service.SchemeService;



@Repository
public class SchemeDAO extends BaseDAO {  
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	 public List<Map<String, Object>> getYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Scheme.getYears");
	    return list;
	  }
	 public List<Map<String, Object>> getPrimaryNames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Scheme.getPrimaryNames");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getSecondaryNames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Scheme.getSecondaryNames");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getSdeigroups()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Scheme.getSdeigroups");
	    return list;
	  }
	 
	
	
	 
	 public void add(Scheme schemeserviceModel) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", schemeserviceModel);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Scheme.Insert", params);
			sqlSession.close();
		}  	 
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Scheme.getAll");
	    return list;
	  }
	 
	 public Scheme getById(String financial_year)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Scheme singleuserdetails=sqlSession.selectOne("Scheme.getById",financial_year);
			sqlSession.close();
			return singleuserdetails;
			
		}

	 
	 public void remove(String financial_year)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.delete("Sdei.deleteData",financial_year);
			sqlSession.close();
		}

	
	 public void updateData(Scheme scheme)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", scheme);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Scheme.updateData",params);
			sqlSession.close();
		}
	
}
