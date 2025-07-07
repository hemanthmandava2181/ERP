package com.erp.DAO;
import com.andromeda.commons.dao.BaseDAO;
import com.erp.Model.Attendance;
import com.erp.Model.EmployeeMaster;
import com.erp.Model.Login;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
@Repository
public class AttendanceDAO
  extends BaseDAO
{
  public String getVersion()   
  {
    String msg = (String)this.sqlSessionTemplate.selectOne("Attendance.getAppVersion");
    return msg;
  }
  /* getting detials to table in attendance sheet */	
  public Map<String, Object> getDetails(Attendance attendance)
  {
  Map<String, Object> map = new HashMap<String, Object>();
  map.put("p", attendance);

  List<Map<String, Object>> districts =
  sqlSessionTemplate.selectList("Attendance.getDetails",map);
  map.put("dates", districts);
  return map;
  }
  
  
  
  private static final Logger logger = LoggerFactory.getLogger(AttendanceDAO.class);

  /*public List<DateWiseAttendance> searchAttendance(DateWiseAttendance dateWiseAttendance)
	{
		Map<String, Object> params = null;
		List<DateWiseAttendance> list = null;
		try
		{
			params = new HashMap<String, Object>();
			params.put("p", dateWiseAttendance);
			list = sqlSessionTemplate.selectList("Attendance.selectDateWise", params);
		}
		catch (Exception e)
		{
			logger.error("Error ", e);
		}
		return list;
	}*/   
	/*
	 * public Map<String, Object> savePresentEmployees(Login login) {
	 * System.out.println(login); Map<String, Object> params = new HashMap<String,
	 * Object>(); params.put("p", login); SqlSession sqlSession =
	 * sqlSessionFactory.openSession(); Integer count =
	 * sqlSession.selectOne("Attendance.checkAttendance", params);
	 * System.out.println(count); if (count == 0) {
	 * sqlSession.insert("Attendance.savePresentEmployees", params); } else {
	 * System.out.println("Already Exists"); } return params;
	 * 
	 * }
	 * 
	 * public Map<String, Object> updatePresentEmployees(Login login) {
	 * System.out.println(login); Map<String, Object> params = new HashMap<String,
	 * Object>(); params.put("p", login); SqlSession sqlSession =
	 * sqlSessionFactory.openSession();
	 * 
	 * sqlSession.insert("Attendance.updatePresentEmployees", params);
	 * 
	 * 
	 * return params;
	 * 
	 * }
	 */
  /*get attendance report */     
  public List<Map<String, Object>> getStaff()
  {
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getStaff");
    return list;
  }
  
  /*public Attendance getAttendance(String empid)
  {
    Attendance list  = this.sqlSessionTemplate.selectOne("Attendance.getAttendance", empid);
    return list;
  }
 */
  
  
/* Getting details from db to table in attendance summary graph */
  
  public Map<String, Object> getReport(Attendance attendance)
  {
  Map<String, Object> map = new HashMap<String, Object>();
  map.put("p", attendance);

  List<Map<String, Object>> districts =
  sqlSessionTemplate.selectList("Attendance.getReport",map);
  map.put("report", districts);
  return map;
  }
  
  /*get dashboard login time*/
 /* public List<Map<String, Object>> getdashboard()
  {
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getdashboard");
    return list;
  }*/
  
	/*
	 * public Login getdashboard(Login login) { Login list =
	 * this.sqlSessionTemplate.selectOne("Attendance.getdashboard",login); return
	 * list; }
	 */
 
 
  
/* getting calendar details based on from date,to date*/
  
  public List<Map<String,Object>> getCalendarDetails(Attendance attendance)
  {
	   Map<String,Object> map=new HashMap<String,Object>();
	   map.put("p",attendance);
	   List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getCalendarDetails",map);
		/* map.put("dates",list); */
	   return list;     
  } 
  
/* updating attendance in attendance sheet */
  
  public void updateattendance(Attendance attendance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", attendance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Attendance.updateattendance",params);
		sqlSession.close();
	}
  
  /* updating attendance to leave in attendance sheet */
  
  public void updateattendancepresent(Attendance attendance)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", attendance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("Attendance.updateattendancepresent",params);
		sqlSession.close();
	}
  
  /* updating attendance to leave in attendance sheet */
  
  public void updateattendanceleave(Attendance attendance)
	{
	  
	  
	  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+attendance);
	  Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", attendance);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("Attendance.updateattendanceleave",params);
		System.out.println("#############################################################################################dfsgnfdsawerf");
		sqlSession.insert("Attendance.Addleave", params);
		System.out.println("sefsrgfdesa###################################################################################dfsgnfdsawerf");
		sqlSession.close();
	}
  
  /* getting calendar details based on from date,to date*/
  public Map<String,Object> getCalendarDetailsdet(Attendance attendance)
  {
	   Map<String,Object> map=new HashMap<String,Object>();
	   map.put("p",attendance);
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getCalendarDetailsdet",map);
    map.put("dates",list);
    return map;
  }
  
  /* getting calendar details based on from date,to date*/
  public Map<String,Object> apprvedTimesheets(Attendance attendance)
  {
	   Map<String,Object> map=new HashMap<String,Object>();
	   map.put("p",attendance);
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.apprvedTimesheets",map);
    map.put("dates",list);
    return map;
  }


  /* get years*/
   public List<Map<String, Object>> getyears()
  {
    List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getyears");
    return list;
  }

   /* getting calendar details based on from date,to date*/
   public Map<String,Object> getMyleavesDetails(Attendance attendance)
   {
	   Map<String,Object> map=new HashMap<String,Object>();
	   map.put("p",attendance);
     List<Map<String, Object>> districts = this.sqlSessionTemplate.selectList("Attendance.getMyleavesDetails",map);
     map.put("dates",districts);
     return map;
   }

  /* calendar page */
   
   public void addcalendar(Attendance employee) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("p", employee);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		/*Integer id  =sqlSession.selectOne("EmployeeMaster.getCount");
		params.put("id",id);*/
		sqlSession.insert("Attendance.Insert", params);
		sqlSession.close();
	}

/* getting myteam leaves details based on from date,to date*/
   
   public Map<String,Object> getMyTeamDetails(Attendance attendance)
   {
	   Map<String,Object> map=new HashMap<String,Object>();
	   map.put("p",attendance);
     List<Map<String, Object>> list = this.sqlSessionTemplate.selectList("Attendance.getMyTeamDetails",map);
     map.put("dates",list);
     return map;
   }

   public boolean savePresentEmployees(Login login)
   {   
     SqlSession sqlSession = sqlSessionFactory.openSession();
     Login dbLogin = sqlSession.selectOne("Attendance.getLogin",login);
     
     if(dbLogin == null) {
 		sqlSession.insert("Attendance.savePresentEmployees", login);
 		return true;
 	} else {
 		return false;	   
 	}
 }
   
  /* public boolean updatePresentEmployees(Login login)
   { 
     SqlSession sqlSession = sqlSessionFactory.openSession();
     Login dbLogin = sqlSession.selectOne("Attendance.getLogin",login);
     System.out.println(dbLogin);
     if(dbLogin != null && (dbLogin.getLogout_time() == null || dbLogin.getLogout_time().isEmpty())) {
     	sqlSession.update("Attendance.updatePresentEmployees", login);
     	return true;
     }
     
 	return false;
 }*/    
   
   public boolean updatePresentEmployees(Login login)
   { 
     SqlSession sqlSession = sqlSessionFactory.openSession();
     Login dbLogin = sqlSession.selectOne("Attendance.getLogin",login);
     System.out.println(dbLogin);
     if(dbLogin != null && (dbLogin.getLogout_time() == null || ((String) dbLogin.getLogout_time()).isEmpty())) {
     	sqlSession.update("Attendance.updatePresentEmployees", login);
     	return true;
     }
     
 	return false;
 }
   
   /*get dashboard login time*/
   
   
   public Login getdashboard(Login login)
   {
     Login list  = this.sqlSessionTemplate.selectOne("Attendance.getdashboard",login);
     System.out.println("====================="+list+"===============q");
     return list;
   }

/*get compoff date*/
   public List<Map<String,Object>> getCompoff(Attendance faculty)
	 {  
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("p", faculty);      

	 List<Map<String,Object>> list =  
	 sqlSessionTemplate.selectList("Attendance.getCompoff", params);  
	 return list;    
	 }
	 
   public Map<String, Object> getAbsentees(String date)
   {
     List<Map<String, Object>> absentees = 
       this.sqlSessionTemplate.selectList("Attendance.getAbsentees", date);
     Map<String, Object> map = new HashMap();   
     map.put("absentees", absentees);
         
     return map;
   }  

	public Integer updateAttendance(Login sdcModel)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p", sdcModel);
		Integer status=sqlSessionTemplate.insert("Attendance.updateAttendance",map);
		return status;
	}
   
	   
   
}
