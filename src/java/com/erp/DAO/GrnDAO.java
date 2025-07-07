
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.erp.Model.Grn;

@Repository
public class GrnDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	
	public void addinvoice(Grn grnModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", grnModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Grn.Insertinvoiceid", params);
		sqlSession.close();
	}
	
	
	
	 public void addinvoicedetails(Grn grnModel) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", grnModel);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Integer currentYear  =sqlSession.selectOne("Grn.getYear");
			Integer id  =sqlSession.selectOne("Grn.getCount");
			params.put("year",currentYear);        
			params.put("id",id);
			sqlSession.insert("Grn.Insertinvoicedetails", params);
			sqlSession.commit();
			sqlSession.close();
		}

	 
	 public List<Map<String, Object>> getInvoiceDetails()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Grn.getInvoiceDetails");
	    return list;
	  }
	 
	public Grn getByIdlineitems(String grn_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Grn singleuserdetails = sqlSession.selectOne("Grn.getByIdlineitems", grn_id);
		sqlSession.close();
		return singleuserdetails;

	}

	public List<Map<String, Object>> getProjects() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Grn.getProjects");
		return list;
	}

	public List<Grn> getApprovepodetails() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Grn> userdetails = sqlSession.selectList("Grn.getApprovepodetails");
		sqlSession.close();
		return userdetails;
	}

	public List<Map<String, Object>> getPODetails(Grn grnModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", grnModel);
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Grn.getPODetails", params);
		return list;
	}

	public void addgrnid(Grn grnModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", grnModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear = sqlSession.selectOne("Grn.getYear");
		Integer id = sqlSession.selectOne("Grn.getCount");
		params.put("year", currentYear);
		params.put("id", id);
		sqlSession.insert("Grn.Insertgrnid", params);
		sqlSession.close();
	}

	public List<Grn> getAlllineitems() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Grn> userdetails = sqlSession.selectList("Grn.getAlllineitems");
		sqlSession.close();
		return userdetails;
	}

	public List<Grn> getDraftgrn(String po_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Grn> userdetails = sqlSession.selectList("Grn.getDraftgrn", po_id);
		sqlSession.close();
		return userdetails;
	}

	/*
	 * public void addassetinternalreq(Grn grnModel) { Map<String, Object> params =
	 * new HashMap<String, Object>(); params.put("p", grnModel); SqlSession
	 * sqlSession = sqlSessionFactory.openSession();
	 * sqlSession.insert("Grn.Insertassetinternalreq", params); sqlSession.close();
	 * }
	 */
	public List<Map<String, Object>> getGrnItems(Grn faculty) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", faculty);
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Grn.getGrnItems", params);
		return list;
	}

	public List<Map<String, Object>> getAssetId(Grn faculty) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", faculty);
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Grn.getAssetId", params);
		return list;
	}

	public void addPaymentDetails(Grn grnModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", grnModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Grn.InsertPaymentDetails", params);
		sqlSession.close();
	}

	public List<Grn> getGrnIDs() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Grn> userdetails = sqlSession.selectList("Grn.getGrnIDs");
		sqlSession.close();
		return userdetails;
	}

	public List<Grn> getPurchaseOrderDetails() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Grn> userdetails = sqlSession.selectList("Grn.getPurchaseOrderDetails");
		sqlSession.close();
		return userdetails;
	}

	/* asset details */
	public List<Grn> getGrns() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Grn> userdetails = sqlSession.selectList("Grn.getGrns");
		sqlSession.close();
		return userdetails;
	}

	public List<Map<String, Object>> getAssetDetails(Grn faculty) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", faculty);
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Grn.getAssetDetails", params);
		return list;
	}

	public Map<String, Object> getGrnListReport(Grn grnModel) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", grnModel);
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Grn.getGrnListReport", params);
		params.put("centers", list);
		return params;
	}

	/* getting po id data to pop up */
	public Grn Getpoiddata(String po_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Grn singleuserdetails = sqlSession.selectOne("Grn.Getpoiddata", po_id);
		sqlSession.close();
		return singleuserdetails;

	}

	public Grn getByIdpurchaseorderReport(String po_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Grn singleuserdetails = sqlSession.selectOne("Grn.getByIdpurchaseorderReport", po_id);
		sqlSession.close();
		return singleuserdetails;
	}
	
	
	
	//add grn item details
	   
	
	public void saveGrndetails(Grn grnModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", grnModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Integer currentYear = sqlSession.selectOne("Grn.getYear");
		Integer id = sqlSession.selectOne("Grn.getCount");
		params.put("year", currentYear);
		params.put("id", id);  
		sqlSession.insert("Grn.InsertAsset", params);
		sqlSession.close();
	}
	
	
	
	
	public List<Map<String, Object>> getGrnData(Grn faculty) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", faculty);
		List<Map<String, Object>> list = sqlSessionTemplate.selectList("Grn.getGrnData", params);
		return list;
	}   
	
	
	   
	
	public Grn getLineItemDetails(String purchaseorder_id)
	{
	SqlSession sqlSession = sqlSessionFactory.openSession();
	Grn singleuserdetails=sqlSession.selectOne("Grn.getLineItemDetails",purchaseorder_id);
	sqlSession.close();
	return singleuserdetails;
	}

}
