<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<title><spring:message code="client.panel.title"/></title>
	</head>
	<body>
		<form:form modelAttribute="client" method="POST">
			<table>
				<tr>
					<td><spring:message code="client.panel.points"/></td>
					<td><form:input path="points" /> ${client.points}</td>
					<td><form:errors path="points"/></td>
				</tr>
			</table>
		</form:form>
		<table>
			<tr>
				<th><spring:message code="client.panel.offers"/></th>
			</tr>
		</table>
	</body>
</html>