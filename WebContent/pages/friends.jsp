<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="span4">
	<c:if test="${empty friends}">
		<div class="page-header">
			<h3>We couldn't find partners for you. Please try later.</h3>
		</div>
	</c:if>
	<section id="friends">
		<c:forEach var="user" items="${friends}">
			<h3>${user.username}</h3>
			<table class="table table-striped">
				<tbody>
					<tr>
						<td>Name:</td>
						<td>${user.realname}</td>
					</tr>
					<tr>
						<td>Email:</td>
						<td>${user.email}</td>
					</tr>
					<tr>
						<td>Phone:</td>
						<td>${user.phone}</td>
					</tr>
					<tr>
						<td>Comments:</td>
						<td>${user.comments}</td>
					</tr>
				</tbody>
			</table>
		</c:forEach>
	</section>
</div>

