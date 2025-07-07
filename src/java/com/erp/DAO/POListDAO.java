package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.CreatePO;
import com.erp.Model.POList; 

  
@Repository
public class POListDAO extends BaseDAO {
	@Autowired        
	private SqlSessionFactory sqlSessionFactory;
	
	 public List<Map<String, Object>> getAll()
	  {
		 /* List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("POList.getAll");
		 if (POList.getStatus().equals(1))
			{
			 return list;
			}
			else //if (VendorService.getStatus().equals("1"))
			{
				 return list;
			}*/
		 
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("POList.getAll");
	    return list;
	  }
	 public List<Map<String, Object>> getAll1()
	  {
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("POList.getAll1");
	    return list;
	  }
	 public List<Map<String, Object>> getAll3()
	  {   
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorData.getAll3");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getAllpo()
	  {   
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorData.getAllpo");
	    return list;
	  }

	 public List<Map<String, Object>> checkedBy()
	  {   
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorData.checkedBy");
	    return list;
	  }
	 
	 public CreatePO getByPo(String purchaseorder_id)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			CreatePO singleuserdetails=sqlSession.selectOne("VendorData.getByPo",purchaseorder_id);
			sqlSession.close();
			return singleuserdetails;
			
		}
	 
	 /*getting vendor invoice field*/
	 public List<Map<String, Object>> getVendor()
	  {   
		 
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("VendorData.getVendor");
	    return list;
	  }
	 
	 

}  