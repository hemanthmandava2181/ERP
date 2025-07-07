package com.erp.DAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.PersistenceException;

import java.util.Iterator;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Upload;



@Repository
public class UploadDAO extends BaseDAO{
	@Autowired                
	private SqlSessionFactory sqlSessionFactory;
                         
	           

	public Map<String, Object> saveDetails(List<Upload> employee, String ipAddress)
	{
		Map<String, Object> maps = new HashMap<String, Object>();
		Upload upload = new Upload();
		
		
		upload.setFilePath(((Upload) employee.get(0)).getFilePath());
		upload.setFileExtension(((Upload) employee.get(0)).getFileExtension());
        Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("p1", upload);
		sqlSessionTemplate.insert("Upload.saveFileUploadDetails", map1);
		try
		{
			if (employee.size() > 0)
			{
				 
				Iterator<Upload> i = employee.iterator();
				while (i.hasNext())
				{                      
					Upload upload1 =(Upload) i.next();
					upload1.setIpAddress(ipAddress);
					
					                                
						System.out.println("==============================>"+maps);     
						
						System.out.println("hi2");
						String year  =sqlSessionTemplate.selectOne("Upload.getYear1");
						Integer id  =sqlSessionTemplate.selectOne("Upload.getCount");
						maps.put("year",year);
						maps.put("id",id);
						String employeeid  =sqlSessionTemplate.selectOne("Upload.getEmployeeID",maps);
						System.out.println("year"+maps);
						upload1.empid=employeeid;
						maps.put("p", upload1);
						this.sqlSessionTemplate.insert("Upload.saveDetails", maps);
						this.sqlSessionTemplate.insert("Upload.saveDetails1", maps);
							   
				}                                       
			}            
		}
		catch (Throwable t)
		{
			System.out.println("Excepction occured during updateBatch: " + t);

			throw new PersistenceException(t);
		}
		return map1;                  
		}
		
	 public List<Map<String, Object>> getAll()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Upload.getAll");
	    return list;
	  }
	 
	public Upload getYear()
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Upload data=sqlSession.selectOne("Upload.getYear");
		sqlSession.close();
		return data;
		
	}
	
}
                                