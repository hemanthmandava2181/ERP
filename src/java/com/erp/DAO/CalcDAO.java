package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Calc;
import com.erp.Model.Ctc;
import com.erp.Model.EmployeeMaster;

@Repository
public class CalcDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	/*
	 * public List<Calc> getPayNameData(Calc table) { SqlSession sqlSession =
	 * sqlSessionFactory.openSession(); String payname = table.payname; List<Calc>
	 * paySlipData=sqlSession.selectList("Calc.getPayNameData", payname);
	 * sqlSession.close(); return paySlipData; }
	 */
	public  Map<String, Object> getById(Calc calcModel) {
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", calcModel);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getById", params);
		List<Map<String, Object>> Earningsdatavalue = sqlSessionTemplate.selectList("Calc.getEarnings", params);
		List<Map<String, Object>> dedctiondatavalue = sqlSessionTemplate.selectList("Calc.getDeductions", params);
		
		params.put("centers", list);
		params.put("earnings", Earningsdatavalue);
		params.put("deductions", dedctiondatavalue);
		return params;

/*		Calc singleuserdetails = this.sqlSessionTemplate.selectOne("Calc.getById", name);

		return singleuserdetails;
*/
	}	

	public List<Calc> getPayname() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Calc> userdetails1 = sqlSession.selectList("Calc.getPayname");
		sqlSession.close();
		return userdetails1;
	}

	public void saveCalcdetails(Calc calcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", calcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Calc.Insert", params);
		sqlSession.commit();
		sqlSession.close();
	}

	public Integer add(Calc calcModel) {

		
		Integer calc_id =this.sqlSessionTemplate.selectOne("Calc.getcalc_id");
		calc_id=calc_id+1;
		
		System.out.println("#########################################"+calc_id);
		
		     
		
		String p = calcModel.getPayslip_id();      
		String e = calcModel.getEntity_type();
		String v = calcModel.getValue();
		
		String p1[] =p.split(",");
		String e1[] =e.split(",");
		String v1[] =v.split(",");  
		Integer status = null;
		for(int i=0;i<p1.length;i++)
		{
			for(int j=0;j<e1.length;j++) 
			{
				if(i==j)
				{
					for(int k=0;k<v1.length;k++)
					{
						if(j==k)  
						{
							calcModel.setPayslip_id(p1[i]);
							calcModel.setEntity_type(e1[j]);
							calcModel.setValue(v1[k]);
							
							System.out.println("*******************************************"+p1[i]);
							
							System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+calc_id);
							calcModel.setId(calc_id);
							Map<String,Object> map = new HashMap<String,Object>();
							map.put("p",calcModel);     
						
							status=sqlSessionTemplate.insert("Calc.Insert1",map);
							/*sqlSessionTemplate.commit();*/
						          
							    
						}
					}
				}
			}

		}

		return status;
	}

	public List<Calc> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Calc> userdetails = sqlSession.selectList("Calc.getAll");
		sqlSession.close();
		return userdetails;
	}

	public List<Calc> getAll1() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Calc> userdetails = sqlSession.selectList("Calc.getAll1");
		sqlSession.close();
		return userdetails;
	}

	public List<Map<String, Object>> getMonths() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getMonths");
		return list;
	}

	public List<Map<String, Object>> getYears() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getYears");
		return list;
	}

	public List<Map<String, Object>> getCaders() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getCaders");
		return list;
	}

	public List<Map<String, Object>> getGrades() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getGrades");
		return list;
	}

	public List<Map<String, Object>> getCalcnames() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getCalcnames");
		return list;
	}

	/* #####payroll##### */

	public List<Map<String, Object>> getPname() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getPname");
		return list;
	}

	/* getting data in earnings table */
	public Map<String, Object> getEarnings(String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", name);
		List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Calc.getEarnings", name);
		map.put("dates", districts);
		return map;
	}

	/* getting data in deductions table */

	public Map<String, Object> getDeductions(String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", name);
		List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Calc.getDeductions", name);
		map.put("dates", districts);
		return map;
	}

	public List<Map<String, Object>> getNames() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getNames");
		return list;
	}

	/*
	 * public List<Map<String, Object>> getPayslipDetails() { List<Map<String,
	 * Object>> list = this.sqlSessionTemplate.selectList("Calc.getPayslipDetails");
	 * return list; }
	 */
	
	public List<Map<String, Object>> getAllLetterheads() {
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Calc.getAllLetterheads");
		return list;
	}
	
	public void saveLetterhead(Calc calcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", calcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Calc.saveLetterhead", params);
		sqlSession.commit();
		sqlSession.close();
	}
	public Map<String, Object> getByletterhead(String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", name);
		List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Calc.getByletterhead", name);
		map.put("dates", districts);
		return map;
	}
	
	public void updateLetterhead(Ctc ctc) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctc);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Ctc.updateLetterhead", params);
		sqlSession.close();
	}



}
