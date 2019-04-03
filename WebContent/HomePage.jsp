<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
欢迎，<s:property value="name"/>
<br/>
<!-- 取值栈中的属性（Action中的成员属性）
                需要生成Get,Set方法，不需要加范围与井号
             -->
值栈属性<s:property value="emp.name" default="若value属性中没有取到值则输出此内容。" />
	<s:form action="queryEmpAction" method="post"> 
		<s:textfield name="sname" label="姓名"></s:textfield>
		<s:select name="color" list="{'red','yellow','green'}" label="颜色"/>
		<s:submit value="ok"></s:submit> 
	</s:form>
</body>
</html>