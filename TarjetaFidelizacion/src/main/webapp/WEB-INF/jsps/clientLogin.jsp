<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<title><spring:message code="login.title"/></title>
	</head>
	<body>
		<form:form modelAttribute="client" method="POST">
			<table>
				<tr>
					<td><spring:message code="login.login"/></td>
					<td><form:input path="login" /></td>
					<td><form:errors path="login"/></td>
				</tr>
				<tr>
					<td><spring:message code="login.password"/></td>
					<td><form:password path="password" /></td>
					<td><form:errors path="password"/></td>
				</tr>
				<tr>
					<td colspan="3">
						<input type="submit" value="login.enter" />
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>