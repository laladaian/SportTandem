<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Sport Tandem</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>

</head>

<body>
    
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
                <ul class="nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
                <s:form action="index" cssClass="navbar-form pull-right">

                    <input name="userBean.username" class="span2" type="text" placeholder="Username">
                    <input name="userBean.password" class="span2" type="password" placeholder="Password">

                    <button type="submit" class="btn">Sign in</button>
                    or
                    <button data-toggle="modal" href="#register" class="btn">Register</button>

                </s:form>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>
    
	<div class="container">
	    <!-- Main hero unit for a primary marketing message or call to action -->
	    <div class="hero-unit">
	        <h1>Looking for someone to do jogging together?</h1>
	        <p>Sport Tandem is made specially to help people to find a partner to do a sport together.</p>
	        <p><a class="btn btn-primary btn-large">Learn more &raquo;</a></p>
	    </div>
	</div>

	<div class="container">
		<s:form action="register" id="register" cssClass="modal hide fade in form-signin" style="display: none; ">
		    <div class="modal-header form-signin-heading">
		        <a class="close" data-dismiss="modal">�</a>
		        <h3>Registration</h3>
		    </div>
		    <div class="modal-body">
				<s:fielderror/>
				<s:actionerror/>
				<input name="userBean.realname" type="text" class="input-block-level" placeholder="Full name">
		        <input name="userBean.username" type="text" class="input-block-level" placeholder="Username">
		        <input name="userBean.email" type="text" class="input-block-level" placeholder="Email address">
		        <input name="userBean.password" type="password" class="input-block-level" placeholder="Password">
		        <button class="btn btn-large btn-primary" type="submit">Register</button>
		    </div>
		</s:form>
	</div>

	<div class="container">
	    <a class="twitter-timeline" href="https://twitter.com/search?q=%23sport" data-widget-id="279337389485334529">Tweets about "#sport"</a>
	    <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
	</div>
	
    <hr>

	<footer>
	    <p>&copy; Unifr 2012</p>
	</footer>

</body>
</html>