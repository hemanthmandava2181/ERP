
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.LeaveStatus;

@Repository
public class LeaveStatusDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public LeaveStatus  getAllLeaves(String empid)
	  {
		LeaveStatus list  = this.sqlSessionTemplate.selectOne("Selfservices. getAllLeaves", empid);
	    return list;
	  }
   
	

}
