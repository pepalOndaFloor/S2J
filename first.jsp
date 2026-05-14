<%@ page language="java"%>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>

    <% String uname = request.getParameter("user");%>

    <h1>Hello,<%out.write(uname);%> to JSP World!</h1>

    <p>Current time: <%= new java.util.Date() %></p>

</body>
</html>