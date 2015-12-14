<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="html" uri="/struts-tags" %>
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
                    <li><a href="<s:url action='index'/>">Profile</a></li>
                    <li class="active"><a href="<s:url action='makeFriend'/>">Make a friend</a></li>
                    <li><a href="#">Friends</a></li>
                    <li><a href="<s:url action='news'/>">News</a></li>
                </ul>
            </div><!--/.well -->
        </div><!--/span-->


        <div class="span6">
            <section id="makeFriend">
                <div class="page-header">
                    <h1>Find a partner</h1>
                </div>
                <s:form action="makeRequest" cssClass="form-horizontal">

                    <div class="control-group">
                        <label class="control-label" for="city">City</label>
                        <div class="controls">
                            <input name="userPref.city" type="text" id="city" placeholder="City">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="sport">Sport</label>
                        <div class="controls">
                            <%--<input type="text" id="sport" placeholder="Sport">--%>
                            <select id="sport" name="userPref.sport">
                                <option>Badminton</option>
                                <option>Bicycling</option>
                                <option>Boxing</option>
                                <option>Canoeing</option>
                                <option>Cross country skiing</option>
                                <option>Dancing</option>
                                <option>Diving</option>
                                <option>Golf</option>
                                <option>Hiking</option>
                                <option>Jogging</option>
                                <option>Kayaking</option>
                                <option>Roller sports</option>
                                <option>Skateboarding</option>
                                <option>Skiing</option>
                                <option>Table tennis</option>
                                <option>Tennis</option>
                                <option>Xtreme sports</option>
                            </select>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="sportLevel">Sport Level</label>
                        <div class="controls">
                            <select id="sportLevel" name="userPref.sportLevel">
                                <option value="1">Beginner</option>
                                <option value="2">Hobby</option>
                                <option value="3">Intermediate</option>
                                <option value="4">Advanced</option>
                                <option value="5">Expert</option>
                            </select>
                            <%--<s:select id="sportLevel" name="userPref.sportLevel"--%>
                                      <%--list="#{'1':'Beginner', '2': 'Hobby'}" />--%>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="frequency">How often would you like to go to sport?</label>
                        <div class="controls">
                            <select id="frequency" name="userPref.frequency">
                                <option>Daily</option>
                                <option>Weekly</option>
                                <option>Monthly</option>
                                <option>Every season</option>
                            </select>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="age">Age</label>
                        <div class="controls">
                            <input type="text" name="userPref.age" id="age" placeholder="Age">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <label class="checkbox inline">
                                <input type="checkbox" id="female" name="userPref.sex" value="f"> female
                            </label>
                            <label class="checkbox inline">
                                <input type="checkbox" id="male" name="userPref.sex" value="m"> male
                            </label>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="comments">Any comments?</label>
                        <div class="controls">
                            <textarea id="comments" name="userPref.comments" rows="3"></textarea>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>

                </s:form>
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