<%@ page import="test.*" %>
<%@ page import="javax.inject.*" %>

<%!@Current OurLogin login;%>

<%
	login.logout(null, request, response);
%>

<html>
	<body>
		<p>
			I am <%= request.getUserPrincipal() %>
		</p>
		<p>
			I am role "user":  <%= request.isUserInRole("user") %>
		</p>
		<a href="index.jsp">Home</a>
	</body>
</html>
