package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;           
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Sector;

@Repository
public class SectorDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public void add(Sector sectorModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", sectorModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Sector.Insert", params);
		sqlSession.close();
	}
	public Sector getById(String sector_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Sector singleuserdetails=sqlSession.selectOne("Sector.getById",sector_name);
		sqlSession.close();
		return singleuserdetails;
		
	}
	
	public List<Sector> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Sector> userdetails=sqlSession.selectList("Sector.getAll");
		sqlSession.close();
		return userdetails;
	}

	public void remove(String sector_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Sector.deleteData",sector_name);
		sqlSession.close();
	}

	
	public void updateData(Sector sector)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", sector);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Sector.updateData",params);
		sqlSession.close();
	}
}
