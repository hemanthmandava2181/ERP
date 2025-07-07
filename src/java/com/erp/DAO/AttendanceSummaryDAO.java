
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.AttendanceSummary;
import com.erp.Model.LeavesReport;



@Repository
public class AttendanceSummaryDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	
	
	
	 public Map<String, Object>getsummary(AttendanceSummary report)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("AttendanceSummary.getsummary",params);
	     params.put("centers",list);
	    return params;
	  }
	 
	
}
