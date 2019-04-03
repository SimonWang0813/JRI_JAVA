package com.simon.entity;

public class employee {
	// id,name,userPwd,sex,age
	private String id;
	private String name;
	private String sex;
	private String email;
	private String notesId;
	private String band;
	private String assetId;
	private String landLine;
	private String mobileTel;
	private String skill;
	private String language;
	private String cost;
	private String jobTitle;
 
	public employee() {
		super();
	}
 
	public employee(String id,String name, String sex, String email, String notesId, String band) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.notesId = notesId;
		this.band = band;
	}
 
//	public employee(String id, String name, String userPwd, String userRePwd, String sex, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.userPwd = userPwd;
//		this.userRePwd = userRePwd;
//		this.sex = sex;
//		this.age = age;
//	}
 
	public employee(String id,String name, String sex, String email, String notesId, String band, String assetId, String landLine, String mobileTel, String skill, String language, String cost, String jobTitle) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.notesId = notesId;
		this.band = band;
		this.assetId = assetId;
		this.landLine = landLine;
		this.mobileTel = mobileTel;
		this.skill = skill;
		this.language = language;
		this.cost = cost;
		this.jobTitle = jobTitle;
	}
 
	public String getId() {
		return id;
	}
 
	public void setId(String id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
 
	public void setSex(String sex) {
		this.sex = sex;
	} 
	
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 	 
	public String getNotesId() {
		return notesId;
	}
 
	public void setNotesId(String notesId) {
		this.notesId = notesId;
	}
	
	public String getAssetid() {
		return assetId;
	}
 
	public void setAssetid(String assetId) {
		this.assetId = assetId;
	}
	public String getBand() {
		return band;
	}
 
	public void setBand(String band) {
		this.band = band;
	}
	public String getLandline() {
		return landLine;
	}
 
	public void setLandline(String landLine) {
		this.landLine = landLine;
	}
	public String getMobiletel() {
		return mobileTel;
	}
 
	public void setMobiletel(String mobileTel) {
		this.mobileTel = mobileTel;
	}
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	public String getJobtitle() {
		return jobTitle;
	}
	public void setJobtitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	/**
	 * 重写toString方法
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Id：" + id + "； ");
		sb.append("姓名：" + name + "； ");
//		sb.append("密码：" + userPwd + "； ");
//		sb.append("性别：" + (sex.equals("1")?'男':'女') + "； ");
//		sb.append("年龄：" + age + "； ");
//		sb.append("<a href=\"${pageContext.request.contextPath}/UserAction?method=userList\">隐藏</a>");
		return sb.toString();
	}
}
