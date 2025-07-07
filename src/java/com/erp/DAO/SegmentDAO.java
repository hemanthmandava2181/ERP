package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;           
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Segment;

@Repository
public class SegmentDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public void add(Segment sdeigroupModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", sdeigroupModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Segment.Insert", params);
		sqlSession.close();
	}
	public Segment getById(String segment_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Segment singleuserdetails=sqlSession.selectOne("Segment.getById",segment_name);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	public List<Segment> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Segment> userdetails=sqlSession.selectList("Segment.getAll");
		sqlSession.close();
		return userdetails;
	}

	public void remove(String segment_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Segment.deleteData",segment_name);
		sqlSession.close();
	}

	
	public void updateData(Segment segment)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", segment);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Segment.updateData",params);
		sqlSession.close();
	}
}
