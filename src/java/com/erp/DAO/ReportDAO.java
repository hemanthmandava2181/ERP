
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erp.Model.Report;
import com.erp.Model.ReportsEmployee;
import com.erp.Service.ReportService;



@Repository
public class ReportDAO extends BaseDAO {  
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	
	

	 public List<Map<String, Object>> getNewjoinerscount()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Report.getNewjoinerscount");
	    return list;
	  }
	 public List<Map<String, Object>> getStopsalarycount()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Report.getNewjoinerscount");
	    return list;
	  }
	 public List<Map<String, Object>> getRelievingemployeescount()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Report.getRelievingemployeescount");
	    return list;
	  }
	 public List<Map<String, Object>> getEmployeesalRevisioncount()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Report.getEmployeesalRevisioncount");
	    return list;
	  } 
	 
		
		public List<Map<String, Object>> getLetterheads() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getLetterheads");
			return list;
		}
		
		  public Map<String,Object> getAlldata()
		  {   
			
			List<ReportsEmployee> getCaders = sqlSessionTemplate.selectList("HrmsReport.getCaders");
			List<ReportsEmployee> getDepartments = sqlSessionTemplate.selectList("HrmsReport.getDepartment");
			List<ReportsEmployee> getDesignation = sqlSessionTemplate.selectList("HrmsReport.getDesignation");
			List<ReportsEmployee> getDivisions = sqlSessionTemplate.selectList("HrmsReport.getDivisions");
			
			List<ReportsEmployee> getEmployeeType = sqlSessionTemplate.selectList("HrmsReport.getEmployeeType");

			 
		
			    Map<String, Object> map = new HashMap();
			  
			    map.put("caders", getCaders);   
			    map.put("departments", getDepartments);    
			    map.put("designations", getDesignation);
			    map.put("divisions", getDivisions);   
			   
			    map.put("employeetypes", getEmployeeType);
			  
			  
			    return map;
		  }      

		public List<Map<String, Object>> getAllExceptionReport() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getAllExceptionReport");
			return list;
		}
		
		public List<Map<String, Object>> getAllCadergrades() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getAllCadergrades");
			return list;
		}
		
		public List<Map<String, Object>> getAllcocexception() {
			List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getAllcocexception");
			return list;
		}

		public Map<String, Object> getExceptiondata(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getExceptiondata", map);
			map.put("report", List);
			return map;
		}
		
		
		public Map<String, Object> getloginreport(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getloginreport", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getclaimsquarterwise(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getclaimsquarterwise", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getclaimsreport(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			int type = this.sqlSessionTemplate.selectOne("employee.getType();");
			if(type == 2)
			{
				List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getclaimsreport", map);
				map.put("dates", List);
			}

			
			return map;
		}
		
		public Map<String, Object> getEmployeeStatusReport(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeStatusReport", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getEmployeeKotak(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeKotak", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getOthetKotakbank(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getOthetKotakbank", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getAllBank(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getAllBank", map);
			map.put("dates", List);
			return map;
		}
		
		
		
		
		
		public Map<String, Object> getAllExceptiondata(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getAllExceptiondata", map);
			map.put("dates", List);
			return map;
		}
		
		
		public Map<String, Object> getEmployeeStatusRelievingReport(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeStatusRelievingReport", map);
			map.put("dates", List);
			return map;
		}
		
		
		
		public Map<String, Object> getEmployeeStatusStopReport(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);
			

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeStatusStopReport", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getAllcfms(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getAllcfms", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getImprestreport(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getImprestreport", map);
			map.put("dates", List);
			return map;
		}
		
		
		public Map<String, Object> getclaminscompare(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getclaminscompare", map);
			map.put("dates", List);
			return map;
		}
		
		
		
		public Map<String, Object> getEmployeeStaffwise(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeStaffwise", map);
			map.put("dates", List);
			return map;
		}
		
		
		
		public Map<String, Object> getEmployeePaytype(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeePaytype", map);
			map.put("dates", List);
			return map;
		}
		
		
		public Map<String, Object> getEmployeeSaturation(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeSaturation", map);
			map.put("dates", List);
			return map;
		}
		
		
		
		
		public Map<String, Object> getEmployeeStaff(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeStaff", map);
			map.put("dates", List);
			return map;
		}
		public Map<String, Object> getEmployeeOthers(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeOthers", map);
			map.put("dates", List);
			return map;
		}
		
		
		public Map<String, Object> getEmployeeDeputation(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeDeputation", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object> getEmployeeMonthlyRecouncilation(ReportsEmployee employee) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", employee);

			List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getEmployeeMonthlyRecouncilation", map);
			map.put("dates", List);
			return map;
		}
		
		public Map<String, Object>getLoginbefore11(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getLoginbefore11",params);
		     params.put("centers",list);
		    return params;
		  }
		
		 public Map<String, Object>getLoginafter11(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getLoginafter11",params);
		     params.put("centers",list);
		    return params;
		  }
		
		 public Map<String, Object>getMissedlogin(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getMissedlogin",params);
		     params.put("centers",list);
		    return params;
		  }
		 public Map<String, Object>getAllReports(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getAllReports",params);
		     params.put("centers",list);
		    return params;
		  }
		
		 public Map<String, Object>getDefaultLogins(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getDefaultLogins",params);
		     params.put("centers",list);
		    return params;
		  }
		
		 public Map<String, Object>getLeavesReport(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getLeavesReport",params);
		     params.put("centers",list);
		    return params;
		  }
		 
		 public Map<String, Object>getloginreports(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getloginreports",params);
		     params.put("centers",list);
		    return params;
		  }
	 
	 
	 
	
 
		public List<ReportsEmployee> getCoCExceptionReport() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<ReportsEmployee> userdetails=sqlSession.selectList("HrmsReport.getCoCExceptionReport");
			sqlSession.close();
			return userdetails;
		}
		 public List<Map<String, Object>> getMonths()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getMonths");
		    return list;
		  }
		
		 public Map<String, Object>getCfmsReport(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getCfmsReport",params);
		     params.put("centers",list);
		    return params;
		  }
		 public Map<String, Object>getCfmsReportOthers(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getCfmsReportOthers",params);
		     params.put("centers",list);
		    return params;
		  }
		 public Map<String, Object>getCfmsReportDeputations(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getCfmsReportDeputations",params);
		     params.put("centers",list);
		    return params;
		  }
		 /*  employee history*/
		 
		 public List<Map<String, Object>> getAllEmployeeHistory()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getAllEmployeeHistory");
		    return list;
		  }
		 public Map<String, Object>getEmployeeHistory(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getEmployeeHistory",params);
		     params.put("centers",list);
		    return params;
		  }
		 

		 public List<Map<String, Object>> getEmployeeProjectDetails()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getEmployeeProjectDetails");
		    return list;
		  }
		 public List<Map<String, Object>> getEmployeeSalaryDetails()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getEmployeeSalaryDetails");
		    return list;
		  }
		 public List<Map<String, Object>> getEmployeeEmploymentDetails()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getEmployeeEmploymentDetails");
		    return list;
		  }
		 public ReportsEmployee getByIdEmployeeHistory(String empid)
			{
				SqlSession sqlSession = sqlSessionFactory.openSession();
				ReportsEmployee singleuserdetails=sqlSession.selectOne("HrmsReport.getByIdEmployeeHistory",empid);
				/*List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getByIdEmployeeHistory",empid);*/
				sqlSession.close();
			return singleuserdetails;
			
				
			}
		 /*end  employee history*/
		 
		 public Map<String, Object>getCTCReports(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getCTCReports",params);
		     params.put("centers",list);
		    return params;
		  }	
		 public List<Map<String, Object>> getEmployeeIds()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getEmployeeIds");
		    return list;
		  }
		 public List<Map<String, Object>> getEmployeeTypes()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getEmployeeTypes");
		    return list;
		  }
		
		  
		  
		  
		  public List<Map<String, Object>> getYears()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getYears");
		    return list;
		  }
public List<Map<String, Object>> getCalendarYears()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getCalendarYears");
		    return list;
		  }
		 public List<Map<String, Object>> getQuarters()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.getQuarters");
		    return list;
		  }
		 public Map<String, Object>getLeaveSummaryReport(ReportsEmployee report)
		  { 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("HrmsReport.getLeaveSummaryReport",params);
		     params.put("centers",list);
		    return params;
		  }
		 
		 
		 public void saveReqTypeDetails(ReportsEmployee report) {
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", report);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.insert("HrmsReport.Insert", params);
				sqlSession.close();
			}
			public ReportsEmployee getByIdCategories(Integer helpdesk_categoryid)
			{
				SqlSession sqlSession = sqlSessionFactory.openSession();
				ReportsEmployee singleuserdetails=sqlSession.selectOne("HrmsReport.getByIdCategories ",helpdesk_categoryid);
				sqlSession.close();
				return singleuserdetails;
				
			}
			
			public List<ReportsEmployee> getAllHelpdeskReqType() {
				SqlSession sqlSession = sqlSessionFactory.openSession();
				List<ReportsEmployee> userdetails=sqlSession.selectList("HrmsReport.getAllHelpdeskReqType");
				sqlSession.close();
				return userdetails;
			}

			
			public void updateReqTypeData(ReportsEmployee report)
			{
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("p", report);
				SqlSession sqlSession = sqlSessionFactory.openSession();
				sqlSession.update("HrmsReport.updateReqTypeData",params);
				sqlSession.close();
			}
			
			public List<Map<String, Object>> GetProfilereport()
			  {
			    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.GetProfilereport");
			    return list;
			  }
			  
			  public List<Map<String, Object>> GetAttendanceoverviewreport()
			  {
			    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("HrmsReport.GetAttendanceoverviewreport");
			    return list;
			  }
			  public Map<String, Object> getSingleEmpData(ReportsEmployee employee) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("p", employee);
					List<Map<String, Object>> List = sqlSessionTemplate.selectList("HrmsReport.getSingleEmpData", map);
					map.put("dates", List);
					return map;
				}
	 
}
