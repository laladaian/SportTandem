<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="Aliya & Lala">
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<script src="./validation.js"></script>
	<title>Sport Tandem</title>

</head>
<body>

	<tiles:insertAttribute name="header" />

	<div class="container-fluid">
		<div class="row-fluid">
			<tiles:insertAttribute name="menu" />
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<tiles:insertAttribute name="footer" />
	<%-- 	<%@ include file="pages/tiles/footer.jsp"%> --%>

</body>

</html>
