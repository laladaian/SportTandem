<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="span5">
	<section id="profile">
		<div class="page-header">
			<h1>Profile</h1>
		</div>
		<table class="table table-striped">
			<tbody>
				<tr>
					<td>Username:</td>
					<td><s:property value="userBean.username" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><s:property value="userBean.realname" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><s:property value="userBean.email" /></td>
				</tr>
			</tbody>
		</table>
	</section>
</div>

<tiles:insertAttribute name="footer" />