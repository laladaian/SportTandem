<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

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
					Logged in as &nbsp; 
					<s:property value="userBean.username" />
					&nbsp; <a href="<s:url action='logout'/>" class="navbar-link">Logout</a>
				</p>
				<ul class="nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="<s:url action='news'/>" />News</a></li>
					<li><a href="<s:url action='contact'/>" />Contact</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</div>
