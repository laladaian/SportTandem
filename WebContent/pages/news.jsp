<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="span7">
	<section id="news">
		<div class="page-header">
			<h1>News offered by ESPN</h1>
		</div>
		<div id="list8">
			<ul>
				<c:forEach items="${newsBean}" var="current">
					<li><a href="<c:out value="${current.link}"/>" target="_blank">
					<c:out value="${current.title}" /> </a></li>
				</c:forEach>
			</ul>
		</div>

	</section>
</div>