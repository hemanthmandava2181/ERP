package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Vendor;

@Repository
public class VendorDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	


	public void add(Vendor Vendor) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", Vendor);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer count = sqlSessionTemplate.selectOne("VendorData.count");
		params.put("count", count);
		sqlSession.insert("VendorData.Insert", params);
		Vendor.year=sqlSession.selectOne("VendorData.getYear", params);
		params.put("p", Vendor);
		
		sqlSession.update("VendorData.updateDetails", params);
		sqlSession.close();
	}  
	
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorData.getAll");
	    return list;
	  }
	 
	 public List<Vendor> getNameWiseData(Vendor vendor) {   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("name",vendor.getName());    
			List<Vendor> nameWiseData=sqlSession.selectList("VendorData.getNameWiseData",params);
			sqlSession.close();
			return nameWiseData;     
		}   
	 public List<Vendor> getIdWiseData(Vendor vendor) {   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("vendor_id",vendor.getVendor_id());    
			List<Vendor> nameWiseData=sqlSession.selectList("VendorData.getIdWiseData",params);
			sqlSession.close();
			return nameWiseData;     
		}   
		

	 
	 public Vendor getYear()
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Vendor year=sqlSession.selectOne("VendorData.getYear");
			sqlSession.close();
			return year;
			
		}
	 
	 public Vendor getById(String vendor_id)
		{ 
			
			Vendor vendor = sqlSessionTemplate.selectOne("VendorData.getById",vendor_id);
			return vendor;             
			        
		}
	 
	 public void updateData(Vendor vendor)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", vendor);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("VendorData.updateData",params);
			sqlSession.close();
		}
	 
	 public List<Map<String, Object>> getServices()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorData.getServices");
	    return list;
	  }
	      
		
}
