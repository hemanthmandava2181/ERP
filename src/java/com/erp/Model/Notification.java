package com.erp.Model;





import java.util.List;

import com.andromeda.commons.model.BaseModel;

public class Notification extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	public String name;
	public Integer id;
	public Integer roleid;
	public String needbydate;
	public String needbydate1;
	
	
	public String getNeedbydate1() {
		return needbydate1;
	}

	public void setNeedbydate1(String needbydate1) {
		this.needbydate1 = needbydate1;
	}

	public String getNeedbydate() {
		return needbydate;
	}

	public void setNeedbydate(String needbydate) {
		this.needbydate = needbydate;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String group_name;
	public Integer caderid;
	public String first_name;
	public String last_name;
	public Integer grade;
	public Integer department;
	public String designation;
	public String designation_id;
	public Integer cader;
	public Integer designationid;
	public String middle_name;
	public String department_name;
	public String designation_name;
	public String description;
	public String grade_name;
	public Integer created_by;
	public Integer emp_id;
	public String mobile;
	
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Integer gradeid;
	public Integer departmentid;
	
	public Integer employee_type;
	public String type;
	/*public String status;*/
	public Boolean status;
	public Integer group_id;
	
	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	/*public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
*/
	
	public List<Notification> notification;
	
	

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<Notification> getNotification() {
		return notification;
	}

	public void setNotification(List<Notification> notification) {
		this.notification = notification;
	}

	public Integer getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(Integer employee_type) {
		this.employee_type = employee_type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer employee_typeid;
	
	

	public Integer getEmployee_typeid() {
		return employee_typeid;
	}

	public void setEmployee_typeid(Integer employee_typeid) {
		this.employee_typeid = employee_typeid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(String designation_id) {
		this.designation_id = designation_id;
	}

	public Integer getCader() {
		return cader;
	}

	public void setCader(Integer cader) {
		this.cader= cader;
	}

	public Integer getDesignationid() {
		return designationid;
	}

	public void setDesignationid(Integer designationid) {
		this.designationid = designationid;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDesignation_name() {
		return designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGrade_name() {
		return grade_name;
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}

	public Integer getGradeid() {
		return gradeid;
	}

	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	

	/*public Integer getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(Integer employee_type) {
		this.employee_type = employee_type;
	}*/
	
	

	public Integer getCaderid() {
		return caderid;
	}

	
	public void setCaderid(Integer caderid) {
		this.caderid = caderid;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(Notification notificationModel) {
		// TODO Auto-generated method stub
		
	} }