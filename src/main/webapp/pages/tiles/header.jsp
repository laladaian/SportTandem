<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
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
    