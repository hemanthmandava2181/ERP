package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Notification;



@Repository
public class NotificationDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;


	public void add(Notification notificationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", notificationModel);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Notification.Insert", params);
		
		
		sqlSession.close();
	}
	
	
	public void inserting(Notification notificationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", notificationModel);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Notification.inserting", params);
		
		
		sqlSession.close();
	}
	
	
	
	
	
	
	public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Notification.getAll");
	    return list;  
	  }
	
	
	
	public List<Map<String, Object>> getbasedonselection(Integer id)
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Notification.getbasedonselection",id);
	    return list;  
	  }

	

	 public List<Map<String, Object>> getdropdown()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Notification.getdropdown");
	    return list;  
	  }
	
	
	/* Getting employees based on given data in employees list */

	public Map<String, Object> getemployeedatabased(Notification notify) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", notify);
		List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Notification.getemployeedatabased", map);
		map.put("mody", districts);
		return map;
	}
	
	public Map<String, Object> getGroupDetails(Integer id) {
		
		
		List<Map<String, Object>> districts = this.sqlSessionTemplate.selectList("Notification.getGroupDetails", id);
		Map<String, Object> map = new HashMap();
		map.put("group", districts);
		return map;
	}
	
	
	/* Adding  into Added table */
	  
	 /* public void updateAdded(Notification notify)
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", notify);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Notification.updateAdded",params);
			
			sqlSession.close();
		}*/
	
	
	
	public Integer Toadded(Notification notification) {
		
		
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", notification);         
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer status=sqlSession.insert("Notification.Toadded", params);
		
		
		sqlSession.close();
		return status;
	}
	
	
	public Notification getById(Integer id)  
	{
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		Notification singleuserdetails=sqlSession.selectOne("Notification.getById",id);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	
	public Notification getId(Integer id)
	{
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		Notification singleuserdetails=sqlSession.selectOne("Notification.getId",id);
		sqlSession.close();
		System.out.println(")))))))))))))))))))))))))))))))))))))))))");
		System.out.println(singleuserdetails);
		System.out.println(")))))))))))))))))))))))))))))))))))))))))");
		return singleuserdetails;
		
	}
	
	
	
	
	
	
	

	
	public void updateData(Notification notification)
	{
		
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("p", notification);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.update("Notification.updateData",params);
		sqlSession.close();  
	}  
	
	
	  
	

}
