package com.springproject.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class admin 
{

	private Integer Admin_Id;
	private String Mall_name;
	private String Admin_Name;
	private Integer Ph_Number;
	private Integer Pwd;

	
	public admin() 
	{
		super();
	}
	
	public admin(Integer admin_Id, String mall_name, String admin_Name, Integer ph_Number, Integer pwd) 
	{
		super();
		Admin_Id = admin_Id;
		Mall_name = mall_name;
		Admin_Name = admin_Name;
		Ph_Number = ph_Number;
		Pwd = pwd;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public Integer getAdmin_Id() {
		return Admin_Id;
	}
	public void setAdmin_Id(Integer admin_Id) {
		Admin_Id = admin_Id;
	}
	public String getMall_name() {
		return Mall_name;
	}
	public void setMall_name(String mall_name) {
		Mall_name = mall_name;
	}
	public String getAdmin_Name() {
		return Admin_Name;
	}
	public void setAdmin_Name(String admin_Name) {
		Admin_Name = admin_Name;
	}
	public Integer getPh_Number() {
		return Ph_Number;
	}
	public void setPh_Number(Integer ph_Number) {
		Ph_Number = ph_Number;
	}
	public Integer getPwd() {
		return Pwd;
	}
	public void setPwd(Integer pwd) {
		Pwd = pwd;
	}
	@Override
	
	public String toString()
	{
		return "Admin[Admin id:"+Admin_Id+" Mall Name"+Mall_name+"Admin Name"+Admin_Name+"Phone Number"+Ph_Number+"Password"+Pwd+"]";
	}
}


