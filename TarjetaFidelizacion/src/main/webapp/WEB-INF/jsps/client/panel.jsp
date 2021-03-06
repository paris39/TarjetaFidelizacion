<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri = "http://www.springframework.org/tags" prefix = "spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<title><spring:message code="client.panel.title"/></title>
	</head>
	<body>
		<form:form modelAttribute="client" method="POST">
			<table>
				<th>
					<td colspan="3"><spring:message code="client.panel.welcome" arguments="${client.name}" htmlEscape="false" /></td>
				<th>
				<tr>
					<td><spring:message code="client.panel.points" /></td>
					<td><form:input path="points" disabled="true" /></td>
					<td><form:errors path="points"/></td>
				</tr>
			</table>
			<table>
				<tr>
					<th><spring:message code="client.panel.cards"/> (${fn:length(client.cards)})</th>
				</tr>
				<c:forEach var="card" begin="0" items="${client.cards}">
					<tr>
						<td>${card.id}</td>
					</tr>
					<tr>
						
					</tr>
				</c:forEach>
			</table>
		</form:form>
	</body>
</html>