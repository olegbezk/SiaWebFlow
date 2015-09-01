<%--
  Created by IntelliJ IDEA.
  User: Oleg.Bezkorovaynyi
  Date: 01 Sep 2015
  Time: 13:03
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head><title>Spring Pizza</title></head>

<body>
<h2>Thank you for your order!</h2>

<form:form>
    <input type="hidden" name="_flowExecutionKey"
           value="${flowExecutionKey}"/>
    <input type="submit" name="_eventId_finished" value="Finished" />
</form:form>
</body>
</html>
