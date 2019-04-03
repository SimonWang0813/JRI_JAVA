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
<h1>系统登录</h1>
   <s:form action="loginaction" method="post">
      User:<br/><input type="text" name="username"/><br/>
      Password:<br/><input type="password" name="password"/><br/>
      <s:submit type="submit" value="登录" label="Submit" align="center"/>		
   </s:form>
</body>
</html>