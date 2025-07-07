package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.erp.Model.AttendanceReport;
import com.erp.Service.AttendanceReportService;

public class AttendanceReportDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	 public void add(AttendanceReportService  attendanceserviceModel) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", attendanceserviceModel);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("attendanceservice.Insert", params);
			sqlSession.close();
		}      
	 public List<Map<String, Object>> search(AttendanceReportService attendanceserviceModel) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", attendanceserviceModel);         
			 List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("attendanceservice.search", params);
			 return list;
		}  
	public List<Map<String, Object>> getAll() { 
		// TODO Auto-generated method stub
		return null;
	}
	
	 
}      
