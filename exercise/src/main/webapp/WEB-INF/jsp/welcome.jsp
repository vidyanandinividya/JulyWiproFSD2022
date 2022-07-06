<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>
	<div>
		<h1>Spring Boot Web JSP Demo</h1>
	</div>
	<div>
		<h2>Message: ${message}</h2>
	</div>
</body>
</html>