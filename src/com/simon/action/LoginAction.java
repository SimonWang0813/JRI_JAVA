package com.simon.action;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simon.entity.*;

import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport{
	 private String username; 
	 private String password;
	 private String name;
	 private employee emp;

	//struts会自动执行这个方法
	 public String execute(){ 
		 // TODO Auto-generated method stub 
		// System.out.println(this.username);
		// System.out.println(this.password);
		  emp = new employee();
		  
	      String ret = ERROR;
	      Connection conn = null;

	      try {
	         String URL = "jdbc:mysql://localhost:3306/jri?serverTimezone=UTC&useSSL=true";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "password");
	         String sql = "SELECT name FROM jri.login WHERE";
	         sql+=" username = ? AND password = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, username);
	         ps.setString(2, password);
	         ResultSet rs = ps.executeQuery();

	         while (rs.next()) {
	            name = rs.getString(1);
	            ret = SUCCESS;
	         }
	      } catch (Exception e) {
	         ret = ERROR;
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      emp.setName(name);
	      return ret;
	 }
	 /** JavaBean */
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getUsername() { 
		 return username; 
	 } 
	 public void setUsername(String username){
		 this.username = username; 
	 } 
	 public String getPassword() { 
		 return password; 
	 } 
	 public void setPassword(String password) { 
		 this.password = password; 
	 } 
	 
	public employee getEmp() {
	    return emp;
	}
	
	public void setEmp(employee emp) {
	    this.emp = emp;
	}
}
