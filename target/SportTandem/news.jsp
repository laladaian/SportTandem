<%-- 
    Document   : news
    Created on : 06-Dec-2012, 01:00:29
    Author     : LALA
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="Aliya & Lala">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sport Tandem</title>

        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">

        <style type="text/css">
            body {
                padding-top: 60px;
                padding-bottom: 40px;
            }
            .sidebar-nav {
                padding: 9px 0;
            }
            /* LIST #8 */
            #list8 {  }
            #list8 ul { list-style:none; }
            #list8 ul li { font-family:Georgia,serif,Times; font-size:18px; }
            #list8 ul li a { display:block; width:300px; height:28px; background-color:rgb(245, 245, 245); 
                             border:1px solid #222;
                             border-radius:25px;
                             padding-left:10px;
                             margin-bottom: 10px;
                             text-decoration:none;  }
            #list8 ul li a:hover {  
                -moz-transform:rotate(-5deg); -moz-box-shadow:10px 10px 20px #000000;
                -webkit-transform:rotate(-5deg); -webkit-box-shadow:10px 10px 20px #000000;
                transform:rotate(-5deg); box-shadow:10px 10px 20px #000000; }
            </style>

            <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

        </head>
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
                        <li><a href="#">Home</a></li>
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
                        <li><a href="<s:url action='showAccount'/>">Profile</a></li>
                        <li><a href="<s:url action='makeFriend'/>">Make a friend</a></li>
                        <li><a href="<s:url action='searchFriends'/>">Friends</a></li>
                        <li class="active"><a href="#news">News</a></li>
                    </ul>
                </div><!--/.well -->
            </div><!--/span-->


            <div class="span7">
                <section id="news">
                    <div class="page-header">
                        <h1>News offered by ESPN</h1>
                    </div>
                    <div id="list8">
                        <ul>
                            <c:forEach items="${newsBean}" var="current">

                                <li>
                                    <a href="<c:out value="${current.link}"/>" target="_blank"><c:out value="${current.title}" /> </a> </li>

                            </c:forEach>
                        </ul>
                    </div>

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
