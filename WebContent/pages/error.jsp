<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <title>Authentication failed</title>
</head>
<body>
<p>
    You are not authorized to view this page.
    <a href="<s:url action='index' />" >Try again</a>.
</p>
</body>
</html>