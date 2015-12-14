<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="span3">
	<div class="well sidebar-nav">
		<ul class="nav nav-list">
			<li class="nav-header">Account</li>
			<li><a href="<s:url action='showAccount'/>">Profile</a></li>
			<li><a href="<s:url action='makeFriend'/>">Make a friend</a></li>
			<li><a href="<s:url action='searchFriends'/>">Friends</a></li>
			<li><a href="<s:url action='news'/>">News</a></li>
		</ul>
	</div>
</div>