
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;           
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Operation;

@Repository
public class OperationDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
/*-------------Create District-----------*/
	public void adddistrict(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertdistrict", params);
		sqlSession.close();
	}
	public Operation getByIddistrict(String district_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIddistrict",district_name);
		sqlSession.close();
		return singleuserdetails;	
	}	
	public List<Operation> getAlldistrict() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAlldistrict");
		sqlSession.close();
		return userdetails;
	}
	public void removedistrict(String district_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDatadistrict",district_name);
		sqlSession.close();
	}	
	public void updateDatadistrict(Operation user)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", user);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDatadistrict",params);
		sqlSession.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*-------------Create Item Group-----------*/
	public void additemgroup(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertitemgroup", params);
		sqlSession.close();
	}
	public Operation getByIditemgroup(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIditemgroup",name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllitemgroup() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllitemgroup");
		sqlSession.close();
		return userdetails;
	}
	public void removeitemgroup(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataitemgroup",name);
		sqlSession.close();
	}
	public void updateDataitemgroup(Operation group)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p",group);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataitemgroup",params);
		sqlSession.close();
}
	
	/*-------------Create Item Name-----------*/
	public void additemname(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertitemname", params);
		sqlSession.close();
	}
	public Operation getByIditemname(String item_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIditemname",item_name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllitemname() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllitemname");
		sqlSession.close();
		return userdetails;
	}
	public void removeitemname(String item_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataitemname",item_name);
		sqlSession.close();
	}
	public void updateDataitemname(Operation item)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", item);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataitemgroup",params);
		sqlSession.close();
}
	
	 public List<Map<String, Object>> getItemgroups()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Operation.getItemgroups");
	    return list;
	  }
	
	/*-------------Create Constituency-----------*/
	
	
	 public List<Map<String, Object>> getdistricts()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Operation.getdistricts");
	    return list;
	  }
	 
	public void addconstituency(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertconstituency", params);
		sqlSession.close();
	}
	public Operation getByIdconstituency(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdconstituency",name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllconstituency() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllconstituency");
		sqlSession.close();
		return userdetails;
	}
	public void removeconstituency(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataconstituency",name);
		sqlSession.close();
	}
	public void updateDataconstituency(Operation cons)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", cons);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataconstituency",params);
		sqlSession.close();
	}
	
	
	
	
	/*-------------Create Mandal-----------*/
	 public List<Map<String, Object>> getConstituencys()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Operation.getConstituencys");
	    return list;
	  }
	 
	public void addmandal(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertmandal", params);
		sqlSession.close();
	}
	public Operation getByIdmandal(String mandal_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdmandal",mandal_name);
		sqlSession.close();
		return singleuserdetails;		
	}
	public List<Operation> getAllmandal() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllmandal");
		sqlSession.close();
		return userdetails;
	}
	public void removemandal(String mandal_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDatamandal",mandal_name);
		sqlSession.close();
	}	
	public void updateDatamandal(Operation mandal)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", mandal);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDatamandal",params);
		sqlSession.close();
	}
	

	/*-------------Create Location-----------*/
	public List<Operation> getMandals() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getMandals");
		sqlSession.close();
		return userdetails;
	}
	public void addlocation(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertlocation", params);
		sqlSession.close();
	}
	public Operation getByIdlocation(String location_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdlocation",location_name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAlllocation() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAlllocation");
		sqlSession.close();
		return userdetails;
	}
	public void removelocation(String location_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDatalocation",location_name);
		sqlSession.close();
	}	
	public void updateDatalocation(Operation location)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", location);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDatalocation",params);
		sqlSession.close();
	}


	/*-------------Create Ledger Head-----------*/
	public void addledgerhead(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertledgerhead", params);
		sqlSession.close();
	}
	public Operation getByIdledgerhead(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdledgerhead",name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllledgerhead() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllledgerhead");
		sqlSession.close();
		return userdetails;
	}
	public void removeledgerhead(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataledgerhead",name);
		sqlSession.close();
	}	
	public void updateDataledgerhead(Operation user)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p",user);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataledgerhead",params);
		sqlSession.close();
	}
	
	
	
	
	/*-------------Create Asset Class-----------*/
	public void addassetclass(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertassetclass", params);
		sqlSession.close();
	}
	public Operation getByIdassetclass(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdassetclass",name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllassetclass() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllassetclass");
		sqlSession.close();
		return userdetails;
	}
	public void removeassetclass(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataassetclass",name);
		sqlSession.close();
	}	
	public void updateDataassetclass(Operation name)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p",name);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataassetclass",params);
		sqlSession.close();
	}
	

	/*-------------Create Asset Name-----------*/
	 public List<Map<String, Object>> getglaccounts()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Operation.getglaccounts");
	    return list;
	  }
	public void addassetname(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertassetname", params);
		sqlSession.close();
	}
	public Operation getByIdassetname(String asset_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdassetname",asset_name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllassetname() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllassetname");
		sqlSession.close();
		return userdetails;
	}
	public void removeassetname(String asset_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataassetname",asset_name);
		sqlSession.close();
	}	
	public void updateDataassetname(Operation name)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p",name);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataassetname",params);
		sqlSession.close();
	}
	
	/*-------------Create Asset Nature-----------*/

	 public List<Map<String, Object>> getassetclass()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Operation.getassetclass");
	    return list;
	  }
	public void addassetnature(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertassetnature", params);
		sqlSession.close();
	}
	public Operation getByIdassetnature(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdassetnature",name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllassetnature() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllassetnature");
		sqlSession.close();
		return userdetails;
	}
	public void removeassetnature(String name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataassetnature",name);
		sqlSession.close();
	}	
	public void updateDataassetnature(Operation name)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p",name);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataassetnature",params);
		sqlSession.close();
	}
	
	
	
	/*-------------Create Asset Groups-----------*/

	 public List<Map<String, Object>> getassetnature()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Operation.getassetnature");
	    return list;
	  }
	public void addassetgroup(Operation operationModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", operationModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Operation.Insertassetgroup", params);
		sqlSession.close();
	}
	public Operation getByIdassetgroup(String group_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Operation singleuserdetails=sqlSession.selectOne("Operation.getByIdassetgroup",group_name);
		sqlSession.close();
		return singleuserdetails;	
	}
	public List<Operation> getAllassetgroup() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Operation> userdetails=sqlSession.selectList("Operation.getAllassetgroup");
		sqlSession.close();
		return userdetails;
	}
	public void removeassetgroup(String group_name)
	{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Opeartion.deleteDataassetgroup",group_name);
		sqlSession.close();
	}	
	public void updateDataassetgroup(Operation name)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p",name);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Operation.updateDataassetgroup",params);
		sqlSession.close();
	}
	
}


