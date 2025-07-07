package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Vendor;
import com.erp.Model.VendorService;

@Repository
public class VendorServiceDAO extends BaseDAO {  
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	
	public void add(VendorService VendorService) {
		Map<String, Object> params = new HashMap<String, Object>();
		if (VendorService.getStatus().equals("t"))
		{
			VendorService.setStatus("TRUE");
		}
		else //if (VendorService.getStatus().equals("1"))
		{
				VendorService.setStatus("FALSE");
		}
		params.put("p", VendorService);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer count = sqlSessionTemplate.selectOne("VendorserviceData.count");
		params.put("count", count);
		sqlSession.insert("VendorserviceData.Insert", params);
	
		sqlSession.update("VendorserviceData.updateDetails", params);
		sqlSession.close();
	}  
	
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorserviceData.getAll");
	   
	    return list;
	  }
	 
	 public List<VendorService> getNameWiseData(VendorService VendorService) {   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("service_name",VendorService.getService_name());    
			List<VendorService> nameWiseData=sqlSession.selectList("VendorserviceData.getNameWiseData",params);
			sqlSession.close();
			return nameWiseData;     
		} 
	 
	 public VendorService getById(String service_id)
		{ 
			
		 VendorService vendorservice = sqlSessionTemplate.selectOne("VendorserviceData.getById",service_id);
			return vendorservice;             
			        
		}
	 public void updateData(VendorService VendorService)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", VendorService);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("VendorserviceData.updateData",params);
			sqlSession.close();
		}
	      
}
