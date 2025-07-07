package com.erp.DAO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.PersistenceException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.erp.Model.Ctc;
import com.erp.Model.LeaveStatus;
import com.erp.Model.LeavesReport;
import com.erp.Model.ReportsEmployee;
import com.erp.Model.Selfservices;

@Repository
public class CtcDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	/*
	 * public Ctc getDetails(String payname) { Ctc list =
	 * this.sqlSessionTemplate.selectOne("Ctc.getDetails", payname); return list; }
	 * 
	 */

	public void add1(Ctc ctcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Ctc.Insert1", params);
		sqlSession.close();
	}

	public void add(Ctc ctcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Ctc.Insert", params);
		sqlSession.close();
	}

	public Ctc getById(String pname) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Ctc singleuserdetails = sqlSession.selectOne("Ctc.getById", pname);
		sqlSession.close();
		return singleuserdetails;

	}

	public List<Ctc> getAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Ctc> userdetails = sqlSession.selectList("Ctc.getAll");
		sqlSession.close();
		return userdetails;
	}

	public List<Ctc> getEarnings() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Ctc> userdetails = sqlSession.selectList("Ctc.getEarnings");
		sqlSession.close();
		return userdetails;
	}

	public List<Ctc> getDeductions() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Ctc> regdetails = sqlSession.selectList("Ctc.getDeductions");
		sqlSession.close();
		return regdetails;
	}

	public void remove(String name) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("Ctc.deleteData", name);
		sqlSession.close();
	}

	/* Getting all employees in modify ctc */
	public List<Ctc> getallemployees() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Ctc> userdetails = sqlSession.selectList("Ctc.getallemployees");
		sqlSession.close();
		return userdetails;
	}

	/* Getting employees based on given data in modify ctc */
	public Map<String, Object> getemployeedata(Ctc ctcModel) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", ctcModel);
		List<Map<String, Object>> districts = sqlSessionTemplate.selectList("Ctc.getemployeedata", map);
		map.put("ctcs", districts);
		return map;
	}

	/* Getting details in profileupdateadmin page based on empid */
	public Ctc getDetails(String empid) {
		Ctc list = this.sqlSessionTemplate.selectOne("Ctc.getDetails", empid);
		System.out.println("######################################################################sdfdccz");
		return list;
	}

	/* Updating employee data based on empid in profileupdateadmin page */

	/*
	 * public void adddata(Ctc ctcModel) { Map<String, Object> params = new
	 * HashMap<String, Object>(); params.put("p", ctcModel); SqlSession sqlSession =
	 * sqlSessionFactory.openSession(); System.out.println("hi2");
	 * sqlSession.update("EmployeeData.Update", params);
	 * sqlSession.insert("EmployeeData.Insert1", params);
	 * sqlSession.update("EmployeeData.Update1", params);
	 * sqlSession.insert("EmployeeData.Insert3", params);
	 * sqlSession.insert("EmployeeData.Insert4", params);
	 * sqlSession.insert("EmployeeData.Insert5", params);
	 * 
	 * 
	 * sqlSession.close(); }
	 */

	/* Getting employees */

	public List<Ctc> getemployees(String ctc_calculator) {
		List<Ctc> empids = this.sqlSessionTemplate.selectList("Ctc.getemployees", ctc_calculator);
		return empids;
	}

	public void updateData(Ctc ctc) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctc);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Ctc.updateData", params);
		sqlSession.close();
	}

	/* updating employee profile details by admin in modify ctc page */

	public void adminupdate(Ctc ctc) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctc);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi2");
		sqlSession.update("Ctc.personalupdate", params);
		sqlSession.update("Ctc.employementupdate", params);
		sqlSession.update("Ctc.bankupdate", params);
		sqlSession.update("Ctc.professionalupdate", params);
		/* sqlSession.update("Ctc.familyupdate", params); */
		sqlSession.close();
	}

	/* Getting details in revise ctc page based on empid */

	public Ctc getctcDetails(String empid) {
		Ctc list = this.sqlSessionTemplate.selectOne("Ctc.getctcDetails", empid);
		return list;
	}

	/* updating ctc in ctc rivision in modify ctc page */
	public void applyctcrevision(Ctc ctc) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctc);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		System.out.println("hi2");
		sqlSession.update("Ctc.ctcupdate", params);
		sqlSession.close();
	}

	public Map<String, Object> getsalsummary(Ctc report) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", report);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Ctc.getsalsummary", params);
		params.put("centers", list);
		return params;
	}
	
	public Ctc  releasestopsalaryamount(Ctc report) {
		Ctc list = this.sqlSessionTemplate.selectOne("Ctc.releasestopsalaryamount", report);
		return list;
	}
	
	public Ctc  releaseStopSalaryDate(Ctc report) {
		Ctc list = this.sqlSessionTemplate.selectOne("Ctc.releaseStopSalaryDate", report);
		return list;
	}
	
	
	
	
	
	public Map<String, Object> getStopData(Ctc report) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", report);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Ctc.getStopData", params);
		params.put("centers", list);
		return params;
	}
	
	public Map<String, Object> releasestopdate(Ctc report) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", report);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Ctc.releasestopdate", params);
		params.put("centers", list);
		return params;
	}
	
	
	
	public Map<String, Object> releasestopsalary(Ctc report) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", report);
		List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Ctc.releasestopsalary", params);
		params.put("centers", list);
		return params;
	}
	
	   public void releasestopsalarypayroll(Ctc report) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", report);         
				SqlSession sqlSession = sqlSessionFactory.openSession();
				
				sqlSession.insert("Ctc.releasestopsalarypayroll", params);
				sqlSession.commit();
				sqlSession.update("Ctc.Updatestopdatesalary",params);
				sqlSession.commit();
			}
	
	

	public void addsalsummary(Ctc ctcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Ctc.InsertSalsummary", params);
		sqlSession.commit();
		
	}
	
	public void addstopsalaryData(Ctc ctcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Ctc.addstopsalaryData", params);
		sqlSession.commit();
		
	}
	
	public void releaseEmployeestopsalaryDate(Ctc ctcModel) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", ctcModel);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Ctc.releaseEmployeestopsalaryDate", params);
	
		
	}
	
	
	

	public Integer addd(Ctc ctcModel) {
		System.out.println("======================");
		System.out.println(ctcModel);
		System.out.println("======================");
		String p = ctcModel.getEmployeename();
		System.out.println("########################################################################" + p);

		double a = ctcModel.getAmount();
		String amnt = String.valueOf(a);
		System.out.println(amnt);

		Integer payslip_id = ctcModel.getPayslip_heads();
		String payslip = Integer.toString(payslip_id);
		System.out.println(payslip);

		String e1[] = amnt.split(",");
		System.out.println(e1);
		String v1[] = payslip.split(",");

		Integer status = null;

		for (int j = 0; j < e1.length; j++) {

			for (int k = 0; k < v1.length; k++) {
				if (j == k) {

					double d = Double.parseDouble(e1[j]);
					ctcModel.setAmount(d);
					System.out.println("1111111111111111111111111111111" + d);

					int x = Integer.parseInt(v1[k]);
					ctcModel.setPayslip_heads(x);
					System.out.println("########################" + x);

					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", ctcModel);
					System.out.println(ctcModel);
					status = sqlSessionTemplate.insert("Ctc.Insert3", map);

				}
			}

		}
		return status;

	}
	
	/*Updating CTC calculator*/
	 public void updateCTC(Ctc employee)     
		{   
		 	
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.insert("Ctc.InsertModifiedCTC",params); 
			sqlSession.commit();    
			
			/*Integer inserted = sqlSession.insert("EmployeeMaster.InsertModifiedCTC1",params);
			System.out.println("======================================="+inserted+"======================");*/
			
			sqlSession.insert("Ctc.InsertModifiedCTCArreas",params);
			sqlSession.commit();
			
			sqlSession.insert("Ctc.updatearrearspayrolldata",params);
			sqlSession.commit();
			
			
			sqlSession.update("Ctc.updateCTCAssociation",params);
			
			sqlSession.commit();
			
			sqlSession.update("Ctc.updateCTCarrearspayrolldata",params);
			
			sqlSession.commit();
		}
	
	
	 
	 
/*	 public List<Ctc> viewdetalisdata(Ctc employee) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<Ctc> userdetails=sqlSession.selectList("Ctc.viewdetalisdata");
			sqlSession.close();
			return userdetails;
		}*/
	 
		public Ctc  viewdetalisdata(String empid)
		  {
			Ctc list  = this.sqlSessionTemplate.selectOne("Ctc.viewdetalisdata", empid);
		    return list;
		  }
		
		
		public Map<String, Object> getViewpayslipdeduction(Ctc employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("Ctc.getViewpayslipdeduction", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getViewpayslipearings(Ctc employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("Ctc.getViewpayslipearings", map);
			map.put("dates", List);
			return map;
		}
		
		
		public Map<String, Object> saveIncometaxDetails(List<Ctc> employee, String ipAddress)
		{
			Map<String, Object> maps = new HashMap<String, Object>();
			Ctc upload = new Ctc();
			
			 upload.setFinancialyear(((Ctc) employee.get(0)).getFinancialyear());
		    upload.setRole(((Ctc) employee.get(0)).getRole());
			upload.setFilePath(((Ctc) employee.get(0)).getFilePath());
			upload.setFileExtension(((Ctc) employee.get(0)).getFileExtension());
	        Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("p1", upload);
			sqlSessionTemplate.insert("Ctc.saveFileUploadDetails", map1);
			try
			{
				if (employee.size() > 0)
				{
					 
					Iterator<Ctc> i = employee.iterator();
					while (i.hasNext())      
					{                      
						Ctc upload1 =(Ctc) i.next();
						upload1.setIpAddress(ipAddress);
						
						                                
						
							maps.put("p", upload1);
							System.out.println("==============================>"+maps);
							this.sqlSessionTemplate.insert("Ctc.saveIncometaxDetails", maps);
						
								   
					}                                       
				}            
			}
			catch (Throwable t)
			{
				System.out.println("Excepction occured during updateBatch: " + t);

				throw new PersistenceException(t);
			}
			return map1;                  
			}

}
