<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="span5" style="width:70%">
	<h1>Contact Us</h1>
	<hr>
	<div>
		<div style="float:left; width:50%; margin-right:30px;">
			<div class="alert alert-danger name-error">
				<span class="glyphicon glyphicon-alert"></span><strong> Error! Please fill in the name field with a valid name.</strong>
			</div>
			<div class="alert alert-danger email-error">
				<span class="glyphicon glyphicon-alert"></span><strong> Error! Please fill in the email fiel with a valid email.</strong>
			</div>
			<div class="alert alert-danger comment-error">
				<span class="glyphicon glyphicon-alert"></span><strong> Error! Please write some comment.</strong>
			</div>
			<s:form name="enq" method="post" action="sendEmail" onsubmit="return validation();">
				<fieldset>
					<input type="text" name="msgBean.name" id="name" value="" class="input-block-level" placeholder="Name" /> 
					<input type="text" name="msgBean.email" id="email" value="" class="input-block-level" placeholder="Email" />
					<textarea rows="11" name="msgBean.comment" id="message" class="input-block-level" placeholder="Comments"></textarea>
			
					<div class="actions">
						<input type="submit" value="Send Your Message" name="submit" id="submitButton" class="btn btn-info pull-right"
							title="Click here to submit your message!" />
					</div>
				</fieldset>
			</s:form>
		</div>
		<div style="float:left">
		<div style="margin-bottom:30px;">
			<div>Laura Kohli</div>
			<div>Grosswiesenstrasse 167</div>
			<div>8051 Z&uuml;rich</div>
			<div>Email: <a href="mailto:laura.kohli89@gmail.com" target="_top">laura.kohli89@gmail.com</a></div>
		</div>
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1169.49085428903!2d8.590551005518126!3d47.40310467949911!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x0!2zNDfCsDI0JzExLjgiTiA4wrAzNScyNy4xIkU!5e1!3m2!1sro!2sus!4v1448561988764" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
		</div>
	</div>
</div>

