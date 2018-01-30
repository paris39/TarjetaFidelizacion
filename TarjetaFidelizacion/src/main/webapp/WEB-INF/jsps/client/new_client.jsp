<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<title><spring:message code="client.login.title"/></title>
	</head>
	<body>
		<form:form modelAttribute="client" method="POST">
			<table>
				<tr>
					<td><spring:message code="client.field.login"/></td>
					<td><form:input path="login" /></td>
					<td><form:errors path="login"/></td>
				</tr>
				<tr>
					<td><spring:message code="client.field.password"/></td>
					<td><form:password path="password" /></td>
					<td><form:errors path="password"/></td>
				</tr>
				<tr>
					<td><spring:message code="client.field.repeatPassword"/></td>
					<td><form:password path="repeatPassword" /></td>
					<td><form:errors path="repeatPassword"/></td>
				</tr>
				<tr>
					<td><spring:message code="client.field.email"/></td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email"/></td>
				</tr>
				<tr>
					<td><spring:message code="client.field.name"/></td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name"/></td>
				</tr>
				<tr>
					<td><spring:message code="client.field.surname"/></td>
					<td><form:input path="surname" /></td>
					<td><form:errors path="surname"/></td>
				</tr>
				<tr>
					<td colspan="3">
						<spring:message code="client.newClient.button" var="loginEnter" />
						<input type="submit" value="${loginEnter}" />
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>