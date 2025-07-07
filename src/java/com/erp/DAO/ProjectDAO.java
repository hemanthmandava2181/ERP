package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Program;
import com.erp.Model.Project;
import com.erp.Model.Sdeigroup;
import com.erp.Service.ProjectService;



@Repository
public class ProjectDAO extends BaseDAO {  
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	 public List<Map<String, Object>> getYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Project.getYears");
	    return list;
	  }
	 
	 
	 public List<Map<String, Object>> getSdeis()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Project.getSdeis");
	    return list;
	  }
	 
	
	
	 public List<Map<String, Object>> getSchemes()
	  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Project.getSchemes");
		    return list;
		  }
	
	
	 public void add(Project projectserviceModel) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", projectserviceModel);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Project.Insert", params);
			sqlSession.close();
		}  
	 public Project getById(String project_name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Project singleuserdetails=sqlSession.selectOne("Project.getById",project_name);
			sqlSession.close();
			return singleuserdetails;
			
		}
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Project.getAll");
	    return list;
	  }
	
	 public void remove(String project_name)
		{
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.delete("Project.deleteData",project_name);
			sqlSession.close();
		}

	
	
	 public void updateData(Project project)   
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", project);   
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("Project.updateData",params);
			sqlSession.close();
		}
	
}
