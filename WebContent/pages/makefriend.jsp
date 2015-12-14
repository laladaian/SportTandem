<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="html" uri="/struts-tags"%>

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
				<label class="control-label" for="frequency">How often would
					you like to go to sport?</label>
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
					<label class="checkbox inline"> <input type="checkbox"
						id="female" name="userPref.sex" value="f"> female
					</label> <label class="checkbox inline"> <input type="checkbox"
						id="male" name="userPref.sex" value="m"> male
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