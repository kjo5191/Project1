<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<!-- * 25.04.09 권준우 최초 작성 -->

<head>
<meta charset="UTF-8">
<title>비밀번호 확인</title>
<script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
</head>
<body>
    <h2>비밀번호 확인</h2>

    <form name="pwd_frm" method="post" action="checkPwdOk">
        <label>비밀번호:</label>
        <input type="password" name="input_pwd" />
        <br><br>
        <input type="button" value="확인" onclick="check_pwd()"/>
    </form>
    
    <br>
    
    <c:choose>
	    <c:when test="${not empty sessionScope.loginCustomer}">
	        <h3>세션에 저장된 로그인 정보</h3>
	        <ul>
	            <li>ID: ${sessionScope.loginCustomer.id}</li>
	            <li>이름: ${sessionScope.loginCustomer.name}</li>
	            <li>비밀번호: ${sessionScope.loginCustomer.password}</li>
	            <li>이메일: ${sessionScope.loginCustomer.email}</li>
	            <li>전화번호: ${sessionScope.loginCustomer.phone}</li>
	            <li>주소: ${sessionScope.loginCustomer.address}</li>
	        </ul>
	    </c:when>
	    <c:otherwise>
	        <p>로그인 세션이 없습니다.</p>
	    </c:otherwise>
	</c:choose>
</body>
</html>
