<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Register</title>
</head>

<body>
	<h3>Register for using Sport Tandem Service.</h3>

	<s:form action="register">

		<s:textfield name="userBean.realname" label="First name" />
		<s:textfield name="userBean.username" label="Last name" />
		<s:textfield name="userBean.email" label="Email" />
		<s:textfield name="userBean.password" label="password" />

		<s:submit />

	</s:form>

</body>
</html>