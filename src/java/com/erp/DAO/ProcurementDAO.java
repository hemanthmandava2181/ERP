
package com.erp.DAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.erp.Model.Procurement;
@Repository
public class ProcurementDAO extends BaseDAO {
	@Autowired        
	private SqlSessionFactory sqlSessionFactory;
	
	public void createworkorder(Procurement procurement) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", procurement);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear  =sqlSession.selectOne("Procurement.getYearwo");
		params.put("year",currentYear);  
		Integer currentMonth  =sqlSession.selectOne("Procurement.getMonthwo");
		params.put("month",currentMonth);
		Integer id  =sqlSession.selectOne("Procurement.getCountwo");      
		params.put("id",id);
		sqlSession.insert("Procurement.createworkorder", params);
		sqlSession.close();
		}


	 public List<Map<String, Object>> getVendors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Procurement.getVendors");
	    return list;
	  }
	 public List<Map<String, Object>> getSectors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Procurement.getSectors");
	    return list;
	  }

	 public void createmou(Procurement procurement) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", procurement);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer currentYear  =sqlSession.selectOne("Procurement.getYearmou");
			params.put("year",currentYear);  
			Integer currentMonth  =sqlSession.selectOne("Procurement.getMonthmou");
			params.put("month",currentMonth);
			Integer id  =sqlSession.selectOne("Procurement.getCountmou");      
			params.put("id",id);
			sqlSession.insert("Procurement.createmou", params);
			sqlSession.insert("Procurement.createmou2", params);
			sqlSession.close();
			}

	 public List<Map<String, Object>> getmoulist()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Procurement.getmoulist");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getwolist()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Procurement.getwolist");
	    return list;
	  }
	 public void addwoitems(Procurement procurement) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", procurement);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Procurement.Insertwoitems", params);
			sqlSession.close();
		}
	 public void addwoadditions(Procurement procurement) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", procurement);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Procurement.Insertwoadditions", params);
			sqlSession.close();
		}
	 public List<Map<String,Object>> getDetailsofProgram(Procurement procurement)
	 {  
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", procurement);      
	 List<Map<String,Object>> list = sqlSessionTemplate.selectList("Procurement.getDetailsofProgram", params);  
	 return list;    
	 }
	 
	 public List<Map<String, Object>> getSchemes()        
		{
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Procurement.getSchemes");
		return list;    
		}   
	 public List<Map<String, Object>> getProjects()
	  {
	    List<Map<String, Object>> projects = this.sqlSessionTemplate.selectList("Procurement.getProjects");
	    return projects;
	  }
	 public List<Map<String, Object>> getpurchaseorders()
	  {
	    List<Map<String, Object>> purchaseorders = this.sqlSessionTemplate.selectList("Procurement.getpurchaseorders");
	    return purchaseorders;
	  }
	 public List<Map<String, Object>> getworkorders()
	  {
	    List<Map<String, Object>> workorders= this.sqlSessionTemplate.selectList("Procurement.getworkorders");
	    return workorders;
	  }
	 public List<Map<String, Object>> getmous()
	  {
	    List<Map<String, Object>> mous = this.sqlSessionTemplate.selectList("Procurement.getmous");
	    return mous;
	  }
	 
	 public Map<String, Object>getProjectWiseSpentReport(Procurement procurement)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",procurement);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Procurement.getProjectWiseSpentReport",params);
	     params.put("centers",list);
	    return params;
	  }
	 
	 public Map<String, Object>getProjectWise(Procurement procurement)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",procurement);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Procurement.getProjectWise",params);
	     params.put("centers",list);
	    return params;
	  }
	 public Map<String, Object>getWorkOrderWise(Procurement procurement)
	  { 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",procurement);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("Procurement.getWorkOrderWise",params);
	     params.put("centers",list);
	    return params;
	  }
	 public List<Map<String,Object>> getWorkorderDetails(Procurement procurement)
	 {  
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", procurement);      
	 List<Map<String,Object>> list = sqlSessionTemplate.selectList("Procurement.getWorkorderDetails", params);  
	 return list;    
	 }
	 
	 public List<Map<String,Object>> getPODetails(Procurement procurement)
	 {  
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", procurement);      
	 List<Map<String,Object>> list = sqlSessionTemplate.selectList("Procurement.getPODetails", params);  
	 return list;    
	 }
}  