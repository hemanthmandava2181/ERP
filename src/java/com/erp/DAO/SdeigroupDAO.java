package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;           
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Sdeigroup;

@Repository
public class SdeigroupDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public void add(Sdeigroup sdeigroupModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", sdeigroupModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Sdei.Insert", params);
		sqlSession.close();
	}
	public Sdeigroup getById(String sdei_groupnumber)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Sdeigroup singleuserdetails=sqlSession.selectOne("Sdei.getById",sdei_groupnumber);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	public List<Sdeigroup> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Sdeigroup> userdetails=sqlSession.selectList("Sdei.getAll");
		sqlSession.close();
		return userdetails;
	}

	public void remove(String sdei_groupnumber)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Sdei.deleteData",sdei_groupnumber);
		sqlSession.close();
	}

	
	public void updateData(Sdeigroup sdeigroup)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", sdeigroup);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Sdei.updateData",params);
		sqlSession.close();
	}
}
