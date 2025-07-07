package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.CreatePO;
import software.amazon.ion.Decimal;







@Repository
public class CreatePODAO extends BaseDAO {  
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	 public List<Map<String, Object>> getYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getYears");
	    return list;
	  }
	 public List<Map<String, Object>> getAssetNames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getAssetNames");
	    return list;
	  }
	 public List<Map<String, Object>> getItemNames()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getItemNames");
	    return list;
	  }
	 public List<Map<String, Object>> getPurchaseOrderType()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPurchaseOrderType");
	    return list;
	  }
	 public List<Map<String, Object>> getPurchaseType()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPurchaseType");
	    return list;
	  }
	 public List<Map<String, Object>> getServices()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getServices");
	    return list;
	  }
	 public List<Map<String, Object>> getPrograms()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPrograms");
	    return list;
	  }    
	 public List<Map<String, Object>> getProjects()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getProjects");
	    return list;
	  }
	 public List<Map<String, Object>> getSchemes()
	  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getSchemes");
		    return list;
		  }
	 public List<Map<String, Object>> getSectors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getSectors");
	    return list;
	  }
	 public List<Map<String, Object>> getVendors()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getVendors");
	    return list;
	  }
	 public List<Map<String, Object>> getAssets()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getAssets");
	    return list;
	  }
	 public List<Map<String, Object>> getLocations()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getLocations");
	    return list;
	  }
	
	
	 public void add(CreatePO createposervice) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("CreatePo.Insert", params);
			sqlSession.close();
		}  	 
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getAll");
	    return list;
	  }
	 /*lineitems*/
	 public List<Map<String, Object>> getAll5()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getAll5");
	    return list;
	  }
	 
	 
	 public CreatePO getById(String asset_name)
		{ 
			
		 CreatePO createposervice = sqlSessionTemplate.selectOne("CreatePo.getById",asset_name);
			return createposervice;             
			        
		}
	 
	 public List<Map<String, Object>> getGroups()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getGroups");
	    return list;
	  }
	 
	 public List<Map<String, Object>> getPOID()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getPOID");
	    return list;
	  }
	   
	/* public void submit(CreatePO createposervice) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer id=sqlSession.selectOne("CreatePo.getCount");
			params.put("id",id);
			sqlSession.insert("CreatePo.Insert1", params);             
			sqlSession.close();
		} */ 
	 
	 
	 
	 
/*
	 public void submit(CreatePO createposervice) 
	 {
		 	double qty = this.sqlSessionTemplate.selectOne("CreatePo.getQuantity");
		 	System.out.println("###################################"+ qty);
		 	
		 	
		 	
		 
		 
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer id  =sqlSession.selectOne("CreatePo.getCount");
			params.put("id",id);
			String proid = sqlSession.selectOne("CreatePo.getProgramid");
			params.put("proid", proid);
			
			
			
			sqlSession.insert("CreatePo.Insert1", params);
			
			sqlSession.close();
		}  
	*/
	 
	 
	 public void submit(CreatePO createposervice) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer id  =sqlSession.selectOne("CreatePo.getCount");   
			params.put("id",id);
			Integer currentYear  =sqlSession.selectOne("CreatePo.getYear");  
			params.put("year",currentYear);
			Integer currentMonth =sqlSession.selectOne("CreatePo.getMonth");
			params.put("month",currentMonth);
			
			sqlSession.insert("CreatePo.Insert1", params);
			   
			sqlSession.close();
		}  
	 public void updateData(CreatePO createposervice)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("CreatePo.updateData",params);
			sqlSession.close();
		}
	
	 public List<Map<String,Object>> getAllIds(CreatePO faculty)
	 {  
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", faculty);      

	 List<Map<String,Object>> list = sqlSessionTemplate.selectList("CreatePo.getAllIds", params);  
	 return list;    
	 }
	 
	 public List<CreatePO> getNames() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<CreatePO> userdetails=sqlSession.selectList("CreatePo.getNames");
			sqlSession.close();
			return userdetails;
		}
	
	 public List<CreatePO> getVendornames(Integer serviceid) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<CreatePO> userdetails=sqlSession.selectList("CreatePo.getVendornames",serviceid);
			sqlSession.close();
			return userdetails;
		}
	
	 public List<CreatePO> getConsume(String assets)
	 {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<CreatePO> userdetails=sqlSession.selectList("CreatePo.getConsume",assets);
			sqlSession.close();
			return userdetails;
		}
	 
	 
	 
	 public void Consumables(CreatePO createposervice) {
		 
		 
		 System.out.println(createposervice);
		 System.out.println("**************************&&&&&&&&&&&&&&&&&&&&&&&&&&"+createposervice.getQty());
		 double quant = createposervice.getQty();
		 Decimal rate = createposervice.getRate();
		 double rte = rate.doubleValue();
		 double value = (quant*rte);
		 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+value);
		 
		 int val = (int)value;  
		 createposervice.setValue(val);    
		 
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("CreatePo.Consumables", params);      
			
			sqlSession.close();   
		}  	 
	     
	 
	 
	 public List<Map<String,Object>> getProgramDet(CreatePO createposervice)
	 {  
		 
		 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", createposervice);      
	 List<Map<String,Object>> list = sqlSessionTemplate.selectList("CreatePo.getProgramDet", params);  
	 return list;    
	 }
	     
	 
	 
	 /*######################WORK ORDER MULTIPLICATION####################*/
	 
	 
	public void addWOItems(CreatePO createposervice)   
	{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("CreatePo.addWOItems", params);
			sqlSession.close();    
		}
		   
		 
		  
	
	 


public void TravelDaysMutli(CreatePO createposervice)   
{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", createposervice);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("CreatePo.TravelDaysMutli", params);
		sqlSession.close();
	}
	

public void addwoadditions(CreatePO createposervice)   
{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", createposervice);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Procurement.createworkorder", params);
		sqlSession.insert("CreatePo.addwoadditions", params);
		sqlSession.close();
}

			/*####################################generating MOud Ids################*/

			public List<Map<String,Object>> getMoUIds(CreatePO faculty)
			{  
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", faculty);      
			List<Map<String,Object>> list = sqlSessionTemplate.selectList("CreatePo.getAllIds", params);  
			return list;    
			}
				
	
	  
}
 
	 
	 
	/* public List<Map<String, Object>> getConsume()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("CreatePo.getConsume");
	    return list;
	  }*/
	 
	/* public void POAmount(CreatePO createposervice) {
		 
		
		 System.out.println(createposervice);
		 System.out.println("**************************&&&&&&&&&&&&&&&&&&&&&&&&&&"+createposervice.getQty());
		 double quant = createposervice.getQty();
		 Decimal rate = createposervice.getRate();
		 double rte = rate.doubleValue();
		 double value = (quant*rte);
		 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+value);
		 
		 	
		 
		 double qty = this.sqlSessionTemplate.selectOne("CreatePo.getQty");
		 System.out.println("@@@@@@@@@@@@@@@@@@@"+qty);  
		 
		 
		 
  
			
				if (qty != null) {
					if (rate != null) {
						value = qty * rate;     
					}
				}

				if (status != null) {
					price = qty * cost;    
				}
   
				amount = value + price;   
				
		 
		 int val = (int)value;  
		 createposervice.setValue(val);    
		 	
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("CreatePo.POAmount", params);
			sqlSession.close();
		}  	   
	 
	 */
	 
	 
	 
	 

		/*public void remove1(String name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.delete("User.deleteData",name);
			sqlSession.close();
		}

		public CreatePO getById1(String name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			CreatePO singleuserdetails=sqlSession.selectOne("CreatePO.getById",name);
			sqlSession.close();
			return singleuserdetails;
			
		}

		public void updateData1(CreatePO createposervice)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", createposervice);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("User.updateData1",params);
			sqlSession.close();
		}
*/

