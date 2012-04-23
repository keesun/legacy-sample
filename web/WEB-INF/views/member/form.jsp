<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Member</title>
</head>
<body>
<a href="<c:url value='/app/member/list'/>">List</a>
<form:form commandName="member" action="/app/member"  method="POST">
    <p>
        <label>이름</label>
        <form:input path="name" size="50"/>
        <form:errors path="name" cssClass="smdis-error-message"/>
    </p>
    <input type="submit" value="저장"/> 
</form:form>
</body>
</html>