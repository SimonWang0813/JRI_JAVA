<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 引入struts标签s -->
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<!-- 创建登陆表单 --> 
<s:form action="login_action">
	<s:textfield name="username"></s:textfield> 
	<s:textfield name="password"></s:textfield> 
	<s:submit key="login"></s:submit>
</s:form>
</body>
</html>