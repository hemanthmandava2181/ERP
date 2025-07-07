package com.erp.DAO;

import com.erp.Model.Login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.andromeda.commons.dao.BaseDAO;

@Repository
public class LoginDAO extends BaseDAO
{    

	public Integer checkUser(Login login)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", login);
		Integer userStatus = sqlSessionTemplate.selectOne("Login.checkUser", map);
		return userStatus;
	}    

	public void saveToLogins(Login login)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", login);

		sqlSessionTemplate.insert("Login.saveLogins", map);
	}
      
	public Login getUserDetails(Login login)
	{
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("username", login.getUsername());
		map.put("password", login.getPassword());
   		    int roleid = sqlSessionTemplate.selectOne("Login.getRole", map);
		    Login details = sqlSessionTemplate.selectOne("Login.getUserDetails", map);
		    details.setRoleid(roleid);
		    map.put("employee_id", details.getEmployee_id());
			//System.out.println("\n------>\n DAO after user data:"+details+"\n<------\n");
			List<String> lis = sqlSessionTemplate.selectList("Login.getUserRoles", map);
			//System.out.println("\n ------> \nRoles list:"+lis+"\n <------ \n");
			
			details.setRoles(lis);
			//System.out.println("\n------> \nType:"+lis.getClass().getSimpleName()+"\n<------\n");
			 
			//String[] roles = lis.toArray(new String[lis.size()]);
			 
			 /*for(String s : roles){  
				 System.out.println("\n------>\n Role Array:"+s+"\n<------\n");
		        } */
			
			//System.out.println("------> After DAO:"+details+"<------");
			return details;
		   
		
		
		}

	public Integer isUserLoggedIn(Login login)
	{
		Integer loginStatus = 0;
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", login);

	    loginStatus = sqlSessionTemplate.selectOne("Login.checkUser", map);
	   return loginStatus;
	}

	public void deleteLoginLog(String employeeid)
	{
		sqlSessionTemplate.update("Login.deleteLoginLog", employeeid);
	}

}   