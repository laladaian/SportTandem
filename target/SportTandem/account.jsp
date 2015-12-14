<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                    Logged in as <s:property value="userBean.username" />&nbsp;
                    <a href="<s:url action='logout'/>" class="navbar-link">Log out</a>
                </p>
                <ul class="nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="<s:url action='news'/>"/>News</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span3">
            <div class="well sidebar-nav">
                <ul class="nav nav-list">
                    <li class="nav-header">Account</li>
                    <li class="active"><a href="#profile">Profile</a></li>
                    <li><a href="<s:url action='makeFriend'/>">Make a friend</a></li>
                    <li><a href="<s:url action='searchFriends'/>">Friends</a></li>
                    <li><a href="<s:url action='news'/>">News</a></li>
                </ul>
            </div><!--/.well -->
        </div><!--/span-->


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

    </div>



<hr>

    <footer>
        <p>&copy; Unifr 2012</p>
    </footer>

</div>  <!--/container-fluid-->

</body>
</html>