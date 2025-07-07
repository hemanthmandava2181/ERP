package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Deputation;
import com.erp.Model.EmployeeMaster;

@Repository
public class DeputationDAO extends BaseDAO{
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	public List<Map<String, Object>> getYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Deputation.getYears");
	    return list;
	  }
	

	public List<Map<String, Object>> getMonths()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Deputation.getMonths");
	    return list;
	  }
	
	
	public List<Map<String, Object>> getNames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Deputation.getNames");
	    return list;
	  }
	
	public List<Map<String, Object>> getPname()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Deputation.getPname");
	    return list;
	  }
	
	
	
	public void add(Deputation dep) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", dep);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Deputation.Insert", params);
		sqlSession.commit();
		sqlSession.close();
	}
  
}
