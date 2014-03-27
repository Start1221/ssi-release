package com.jshand.ssi.model;

/**
 * @file_name	Person.java
 * @project		ssi-release
 * @author  	jshand
 * @createDate	Jun 26, 2013  10:32:22 AM
 * @version 	1.0
 * http://www.jshand.com
 * 
 */

public class Person {
	
	private String personid="";
	private String name="";
	private String age="";
	private String sex="";
	
	
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
