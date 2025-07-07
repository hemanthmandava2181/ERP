
package com.erp.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.LeavesReport;
import com.erp.Model.Sdeigroup;



@Repository
public class LeavesReportDAO extends BaseDAO {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	
	
	public List<Map<String, Object>> getLeaves()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getLeaves");
	    return list;
	  }
	


    public Map<String, Object>getleavesDetailedReport(LeavesReport report)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.getleavesDetailedReport",params);
	     params.put("centers",list);
	    return params;
	  }
    
    public Map<String, Object>GetLeavesReport(LeavesReport report)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.GetLeavesReport",params);
	     params.put("centers",list);
	    return params;
	  }
	 
    public Map<String, Object>getSummary1(LeavesReport report1)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report1);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.getSummary1",params);
	     params.put("centers",list);
	    return params;
	  }
    
    public List<Map<String, Object>> getYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getYears");
	    return list;
	  }
	
	public List<Map<String, Object>> getCalendarYears()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getCalendarYears");
	    return list;   
	  }
	
	 public Map<String, Object>getLeaveEncashmentDetails(LeavesReport report)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.getLeaveEncashmentDetails",params);
	     params.put("centers",list);
	    return params;
	  }
	 
	  public Map<String, Object>getInactiveLeaveEncashmentDetails(LeavesReport report)
	  {
		 
		 Map<String,Object>params=new HashMap<String,Object>();
		 params.put("p",report);
	     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.getInactiveLeaveEncashmentDetails",params);
	     params.put("centers",list);
	    return params;
	  }
	
	public List<Map<String, Object>> getMonths()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getMonths");
	    return list;
	  }
	
	public List<Map<String, Object>> getQuarters()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getQuarters");
	    return list;
	  }
	
	
	   public List<Map<String,Object>> getEmployees(LeavesReport report)
	   	{  
	   		Map<String, Object> params = new HashMap<String, Object>();
	   		params.put("p", report);      
	   		
	   		List<Map<String,Object>> list =   
	   				sqlSessionTemplate.selectList("LeavesReport.getEmployees", params);  
	   		return list;    
	   	}
	  	 
	    public Map<String, Object>getEmployeeLOPDetails(LeavesReport report)
		  {
			 
			 Map<String,Object>params=new HashMap<String,Object>();
			 params.put("p",report);
		     List<Map<String, Object>> list = sqlSessionTemplate.selectList("LeavesReport.getEmployeeLOPDetails",params);
		     System.out.println("==============================");
		     System.out.println(list);
		     System.out.println("==============================");
		     params.put("centers",list);
		    return params;  
		  }
	    public List<Map<String,Object>> getLOPCount(LeavesReport report)
		{  
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", report);      
			
			List<Map<String,Object>> list =   
					sqlSessionTemplate.selectList("LeavesReport.getLOPCount", params);  
			return list;    
		}
	    
	    public List<Map<String,Object>> GetLeavesSummaryReport(LeavesReport report)
	 		{  
	 			Map<String, Object> params = new HashMap<String, Object>();
	 			params.put("p", report);      
	 			
	 			List<Map<String,Object>> list =   
	 					sqlSessionTemplate.selectList("LeavesReport.GetLeavesSummaryReport", params);  
	 			return list;    
	 		}
	    
	    
	    public Integer saveEmployeeLOPDetails(LeavesReport report)  
		{
	    	String empid =report.getEmpid();
	    	double ctc = this.sqlSessionTemplate.selectOne("LeavesReport.getAnnualctc",empid);
	        report.setCtc(ctc);
	        System.out.println("=================================");
	       System.out.println(ctc);
	       System.out.println("=================================");
	     Integer lop= report.getLop_days();       
	     
	     double amount=Math.round((lop *(ctc/365)));
	     report.setAmount(amount);

	     System.out.println("=================================");
	       System.out.println(amount);
	       System.out.println("=================================");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("p", report);
			Integer status=sqlSessionTemplate.insert("LeavesReport.saveEmployeeLOPDetails",map);
			
			return status;  
		 
	}  
	    
	    public void Insertloppayrolldata(LeavesReport report) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", report);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			sqlSession.insert("LeavesReport.Insertloppayrolldata", params);
			sqlSession.close();
			sqlSession.update("EmployeeMaster.Updatelopdate",params);
			sqlSession.close();
		}

	public LeavesReport  releaseamount(String empid) {
			LeavesReport list = this.sqlSessionTemplate.selectOne("LeavesReport.getreleaseamount", empid);
			return list;
		}
	
	public List<Map<String, Object>> EncashmentStatus()
	  {
	    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.EncashmentStatus");
	    return list;   
	  }
	  
	 
	
	   public Map<String, Object> GetEncashdetails(LeavesReport report)
		{  
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", report);      
			
			List<Map<String,Object>> list =   
					sqlSessionTemplate.selectList("LeavesReport.GetEncashdetails", params); 
			
			params.put("dates", list);
			return params;
			
		}
		
		
		    public void LeaveEncashdataprocess(LeavesReport report)   
		{   
		 	
			/*Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", report);*/
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", report);
			
			 sqlSession.insert("LeavesReport.LeaveEncashdataprocess",params);
			
		/*	sqlSession.commit();*/
			
		/*	sqlSession.update("LeavesReport.UpdateRelieveData",empid);
			sqlSession.close();*/
			
			
			/*sqlSession.update("EmployeeMaster.updateCTC",params);*/
			
			sqlSession.close();
		}
	    
	    
		public void UpdateEmployerelieveing(EmployeeMaster employee) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", employee);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.update("LeavesReport.UpdateRelieveData", params);
			sqlSession.close();
		}
		
		public List<Map<String, Object>> getLeavesDetails()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getLeavesDetails");
		    return list;
		  }
		  
		public List<Map<String, Object>> getLeaveRules()
		  {
		    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("LeavesReport.getLeaveRules");
		    return list;
		  } 
		  
		public void saveData(LeavesReport report) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p", report);         
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			sqlSession.insert("LeavesReport.saveData", params);
			sqlSession.commit();
			sqlSession.update("LeavesReport.update1", params);
			
			
			    
			sqlSession.close();
		}  
		    
		public Integer update(LeavesReport report)  
	   	{
	      
	      
	   		Map<String, Object> map = new HashMap<String, Object>();
	   		map.put("p", report);
	   		Integer status=sqlSessionTemplate.insert("LeavesReport.update",map);
	   		
	   		return status;  
	   	 
	   }
		   
		    public List<Map<String, Object>> getByLeave(Integer leave_type)
			{
		  
				List<Map<String, Object>> report =
						this.sqlSessionTemplate.selectList("LeavesReport.getByLeave", leave_type);
		      
				return report;
			}
		    
		    public Integer saveLeaveType(LeavesReport report)  
			{
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("p", report);
				Integer status=sqlSessionTemplate.insert("LeavesReport.saveLeaveType",map);
				return status;  
			}

	 
	 
}
