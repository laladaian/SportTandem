<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sql_rt" uri="http://java.sun.com/jstl/sql_rt"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sport Tandem</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">

	<style type="text/css">
		body {
			padding-top: 60px;
			padding-bottom: 40px;
		}
		
		.sidebar-nav {
			padding: 9px 0;
		}
	</style>
	
	<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

</head>

<body>

	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</a> 
				<a class="brand" href="#">Sport Tandem</a>
				<div class="nav-collapse collapse">
					<p class="navbar-text pull-right">
						Logged in as
						<s:property value="userBean.username" />
						&nbsp; <a href="<s:url action='logout'/>" class="navbar-link">Logout</a>
					</p>
					<ul class="nav">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#about">About</a></li>
						<li><a href="#contact">Contact</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">Account</li>
						<li><a href="<s:url action='showAccount'/>">Profile</a></li>
						<li><a href="<s:url action='makeFriend'/>">Make a friend</a></li>
						<li class="active"><a href="#friends">Friends</a></li>
						<li><a href="<s:url action='news'/>">News</a></li>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->

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
		</div>

		<hr>
		
		<footer>
		<p>&copy; Unifr 2012</p>
		</footer>

	</div>
	<!--/container-fluid-->

</body>
</html>