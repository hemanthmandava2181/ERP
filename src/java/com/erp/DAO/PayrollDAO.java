package com.erp.DAO;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andromeda.commons.dao.BaseDAO;
import com.erp.Model.Employee;
import com.erp.Model.LocationCount;
import com.erp.Model.Payroll;
@Repository
public class PayrollDAO extends BaseDAO {
	@Autowired
	
	private static final Logger logger = LoggerFactory.getLogger(PayrollDAO.class);
	
	
	public List<Map<String, Object>> getFinancialYear() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Payroll.getFinancialYear");
		return list;
		}
	
	public LocationCount employeeCounts()
	{
		LocationCount list = sqlSessionTemplate.selectOne("Payroll.locationCount");
		return list;
	}
	
	public void savePayrollSettings(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll);    
		Date from_date=payroll.getFrom_date();
		Date to_date=payroll.getTo_date();
		Integer month_days =(int)(((to_date.getTime()-1) - (from_date.getTime()-1)) / (1000 * 60 * 60 * 24));
		payroll.setMonth_days(month_days);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Payroll.savePayrollSettings", params);
		sqlSession.close();
	}
	public Map<String, Object> getPayrollDetails(Payroll payroll) {
		List<Map<String, Object>> list1 = this.sqlSessionTemplate.selectList("Payroll.getPayrollDetails1", payroll);
		List<Map<String, Object>> list2 = this.sqlSessionTemplate.selectList("Payroll.getPayrollDetails2", payroll);
		List<Map<String, Object>> list3 = this.sqlSessionTemplate.selectList("Payroll.getPayrollDetails3", payroll);
		List<Map<String, Object>> list4 = this.sqlSessionTemplate.selectList("Payroll.getPayrollDetails4", payroll);
		List<Map<String, Object>> list5 = this.sqlSessionTemplate.selectList("Payroll.getPayrollDetails5", payroll);
		/*List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Payroll.getPayrollDetails7", payroll);*/
		/*List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("FinanceData.getHoldCount", finance);
		List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("FinanceData.getReturnCount", finance);*/
		Map<String, Object> map = new HashMap();
		map.put("payroll", list1);
		map.put("payroll1", list2);
		map.put("payroll2", list3);
	    map.put("payroll3", list4);
	    map.put("payroll4", list5);
	    
		/*map.put("payroll6", list7);*/
		/*map.put("release", list7);
		map.put("hold", list8);
		map.put("returned", list9);*/

		return map;
	}
	
	
	
	
	public Map<String, Object> getJVPayrollDetails(Payroll payroll) {
		Map<String, Object> list1 = this.sqlSessionTemplate.selectOne("Payroll.getJVPayrollDetails1", payroll);
		Map<String, Object> list2 = this.sqlSessionTemplate.selectOne("Payroll.getJVPayrollDetails2", payroll);
		Map<String, Object> list3 = this.sqlSessionTemplate.selectOne("Payroll.getJVPayrollDetails3", payroll);
		Map<String, Object> list4 = this.sqlSessionTemplate.selectOne("Payroll.getJVPayrollDetails4", payroll);
		Map<String, Object> list5 = this.sqlSessionTemplate.selectOne("Payroll.getJVPayrollDetails5", payroll);
		/*List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Payroll.getPayrollDetails7", payroll);*/
		/*List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("FinanceData.getHoldCount", finance);
		List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("FinanceData.getReturnCount", finance);*/
		Map<String, Object> map = new HashMap();
		map.put("JVpayroll", list1);
		map.put("JVpayroll1", list2);
		map.put("JVpayroll2", list3);
	    map.put("JVpayroll3", list4);
	    map.put("JVpayroll4", list5);
		return map; 
	}
	public Map<String, Object> getPayrollTotal(Payroll payroll) {
		
	/*	List<Map<String, Object>> list6 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal1", payroll);*/
		
		Map<String, Object> list6 = this.sqlSessionTemplate.selectOne("Payroll.getPayrollTotal1", payroll);
		List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal2", payroll);
		List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal3", payroll);
		List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal4", payroll);
		List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal5", payroll);
		List<Map<String, Object>> list11 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal6", payroll);
		List<Map<String, Object>> list12 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal7", payroll);
		List<Map<String, Object>> list13 = this.sqlSessionTemplate.selectList("Payroll.getPayrollTotal8", payroll);

		Map<String, Object> map = new HashMap();
		map.put("payroll5", list6);
		map.put("payroll6", list7);
		map.put("payroll7", list8);
		map.put("payroll8", list9);
		map.put("payroll9", list10);
		map.put("payroll10", list11);
		map.put("payroll11", list12);
		map.put("payroll12", list13);
		return map;
	}
	
public Map<String, Object> getJVPayrollTotal(Payroll payroll) {
		
		Map<String, Object> list6 = this.sqlSessionTemplate.selectOne("Payroll.getJVPayrollTotal1", payroll);
		List<Map<String, Object>> list7 = this.sqlSessionTemplate.selectList("Payroll.getJVPayrollTotal2", payroll);
		List<Map<String, Object>> list8 = this.sqlSessionTemplate.selectList("Payroll.getJVPayrollTotal3", payroll);
		List<Map<String, Object>> list9 = this.sqlSessionTemplate.selectList("Payroll.getJVPayrollTotal4", payroll);
		List<Map<String, Object>> list10 = this.sqlSessionTemplate.selectList("Payroll.getJVPayrollTotal5", payroll);
		List<Map<String, Object>> list11 = this.sqlSessionTemplate.selectList("Payroll.getJVPayrollTotal6", payroll);
		List<Map<String, Object>> list12 = this.sqlSessionTemplate.selectList("Payroll.getJVPayrollTotal7", payroll);
		List<Map<String, Object>> list13 = this.sqlSessionTemplate.selectList("Payroll.getJVPayrollTotal8", payroll);

		Map<String, Object> map = new HashMap();
		map.put("JVpayroll5", list6);
		map.put("JVpayroll6", list7);
		map.put("JVpayroll7", list8);
		map.put("JVpayroll8", list9);
		map.put("JVpayroll9", list10);
		map.put("JVpayroll10", list11);
		map.put("JVpayroll11", list12);
		map.put("JVpayroll12", list13);
		return map;
	}
	
	
	
	public void GeneratePayroll(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll);    
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Payroll.GeneratePayroll", params);
		sqlSession.close();
	}
	
	public void RejectPayroll(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll);    
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Payroll.RejectPayroll", params);
		sqlSession.close();
	}
	
	public void RejectPayrollStatus(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll);    
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Payroll.RejectPayrollStatus", params);
		sqlSession.close();
	}
	
	public void ValidatePayroll(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll);    
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Payroll.ValidatePayroll", params);
		sqlSession.close();
	}


	public void ApprovePayroll(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll);    
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Payroll.ApprovePayroll", params);
		sqlSession.close();
	}

	public void GeneratePayrollStatus(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll);    
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Payroll.GeneratePayrollStatus", params);
		sqlSession.close();
	}
public Map<String, Object> getPayRollJVModelData(Payroll payroll) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", payroll); 
		List<Map<String, Object>> JVlist = this.sqlSessionTemplate.selectList("Payroll.getPayRollJVModelData", params);
		Map<String, Object> map = new HashMap();
		map.put("payRollJVModelData", JVlist);
		return map;
	}

public Map<String, Object> getPayRollJVModelDataOthers(Payroll payroll) {
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("p", payroll); 
	List<Map<String, Object>> JVlist = this.sqlSessionTemplate.selectList("Payroll.getPayRollJVModelDataOthers", params);
	Map<String, Object> map = new HashMap();
	map.put("payRollJVModelDataOthers", JVlist);
	return map;
}

public Map<String, Object> getJVModalDataPaymentSummary(Payroll payroll) {
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("p", payroll); 
	List<Map<String, Object>> JVlist = this.sqlSessionTemplate.selectList("Payroll.getJVModalDataPaymentSummary", params);
	Map<String, Object> map = new HashMap();
	map.put("payRollJVModelDataPaymentSummary", JVlist);
	return map;
}

public Map<String, Object> getJVModalDataDeputation(Payroll payroll) {
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("p", payroll); 
	List<Map<String, Object>> JVlist = this.sqlSessionTemplate.selectList("Payroll.getJVModalDataDeputation", params);
	Map<String, Object> map = new HashMap();
	map.put("payRollJVModelDataDeputation", JVlist);
	return map;
}





	
	
}
