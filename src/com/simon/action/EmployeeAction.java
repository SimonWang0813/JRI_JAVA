package com.simon.action;

import com.opensymphony.xwork2.ActionSupport;
public class EmployeeAction extends ActionSupport{

	public String add() {
		System.out.println("EmployeeAction--add");
		return "add";
	}
	
	public String execute(){
		System.out.println("EmployeeAction--execute");
		return "add";
	}
}
