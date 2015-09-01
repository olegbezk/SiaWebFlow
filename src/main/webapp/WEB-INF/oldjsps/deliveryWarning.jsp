<%--
  Created by IntelliJ IDEA.
  User: Oleg.Bezkorovaynyi
  Date: 01 Sep 2015
  Time: 13:40
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2>No delivery available</h2>

<p>The address is outside of our delivery area. The order
    may still be taken for carry-out.</p>

<a href="flow.htm?_flowExecutionKey=${flowExecutionKey}&_eventId=continue">Continue</a> |
<a href="flow.htm?_flowExecutionKey=${flowExecutionKey}&_eventId=cancel">Cancel</a>
