package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.andromeda.commons.dao.BaseDAO;
import com.andromeda.commons.util.CryptoUtils;

import com.erp.Model.Services;

@Repository    
public class ServiceDAO extends BaseDAO
{
	                
	public List<Map<String, Object>> getAll()
	{
	    
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Services.getAll");
		return list;
	}
	public Map<String, Object> getCollegeDetails(Integer districtId)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		List<Services> getDetails =
				sqlSessionTemplate.selectList("Services.getAllDetails", districtId);
		List<Services> getTrainingPrgmDetails =
				sqlSessionTemplate.selectList("Services.getTrainingProgramDetails");
		List<Services> getPrgmDetails = sqlSessionTemplate.selectList("Services.getPrgmDetails");
		map.put("colleges", getDetails);
		map.put("trainingPrgms", getTrainingPrgmDetails);
		map.put("prgms", getPrgmDetails);
		return map;
	}
	
	
		public List<Map<String, Object>> getLogins(Integer collegeId)
		{
		return sqlSessionTemplate.selectList("Services.getLogins", collegeId);
		}
	
		public Services createEmployee(Services details)
		{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", details);
		String mobileno = details.getMobile();
		Services clgDetails = details;
		clgDetails = sqlSessionTemplate.selectOne("Services.getUserDetails2",mobileno);	
		details.setUsername(details.getEmail());
		details.setPassword(clgDetails.getPwd()); 
		details.setPwd(CryptoUtils.getMD5Hash(clgDetails.getPwd()));
		details.setRoleid(2);
		map.put("p", details);                                  
		Integer userStatus = sqlSessionTemplate.selectOne("Services.checkUser", map);
		if (userStatus == 0)
		{
			details.setUserStatus("0");
			sqlSessionTemplate.insert("Services.saveEmployee", map);  
			sqlSessionTemplate.update("Services.update", map);
			return details;
		}  
		else     
		{
			details.setUserStatus("User already exists in " + clgDetails.getName());
			return details;
		}
		
	}
		public Services createHR(Services details)
		{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", details);
		String mobileno = details.getMobile();
		Services clgDetails = details;
		clgDetails = sqlSessionTemplate.selectOne("Services.getUserDetails1",mobileno);	
		details.setUsername(details.getEmail());
		details.setPassword(clgDetails.getPwd()); 
		details.setPwd(CryptoUtils.getMD5Hash(clgDetails.getPwd()));
		details.setRoleid(1);    
		map.put("p", details);                                  
		Integer userStatus = sqlSessionTemplate.selectOne("Services.checkUser", map);
		if (userStatus == 0)
		{
			details.setUserStatus("0");
			sqlSessionTemplate.insert("Services.saveHR", map);
			sqlSessionTemplate.update("Services.update", map);
			return details;
		}  
		else     
		{
			details.setUserStatus("User already exists in " + clgDetails.getName());
			return details;
		}
		
	}

	public Services getDetails(Services college)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", college);
		Services details = sqlSessionTemplate.selectOne("Services.getDetails", map);
		return details;
	}
	

	

	
}