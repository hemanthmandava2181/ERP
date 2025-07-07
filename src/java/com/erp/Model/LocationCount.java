package com.erp.Model;


import com.andromeda.commons.model.BaseModel;

public class LocationCount extends BaseModel
{

	private String count;

	private Integer all;

	private Integer id;
	private Integer collegeId;
	
	
	
	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	

	public Integer getAll()
	{
		return all;
	}

	public void setAll(Integer all)
	{
		this.all = all;
	}


	public String getCount()
	{
		return count;
	}

	public void setCount(String count)
	{
		this.count = count;
	}

}
