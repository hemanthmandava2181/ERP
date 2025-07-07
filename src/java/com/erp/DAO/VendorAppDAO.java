package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Vendor;
import com.erp.Model.VendorApp;    

@Repository
public class VendorAppDAO extends BaseDAO {
	@Autowired        
	private SqlSessionFactory sqlSessionFactory;
	
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorDataApp.getAll");
	    return list;
	  }
	 public VendorApp getById(String vendor_id)
		{ 
			
		 VendorApp vendorapp = sqlSessionTemplate.selectOne("VendorDataApp.getById",vendor_id);
			return vendorapp;               
			        
		}
	 public List<VendorApp> getNameWiseData(VendorApp vendorapp) {   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("name",vendorapp.getName());    
			List<VendorApp> nameWiseData=sqlSession.selectList("VendorDataApp.getNameWiseData",params);
			sqlSession.close();
			return nameWiseData;     
		}   
	 public List<VendorApp> getIdWiseData(VendorApp vendorapp) {   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("vendor_id",vendorapp.getVendor_id());    
			List<VendorApp> nameWiseData=sqlSession.selectList("VendorDataApp.getIdWiseData",params);
			sqlSession.close();
			return nameWiseData;     
		}   
}