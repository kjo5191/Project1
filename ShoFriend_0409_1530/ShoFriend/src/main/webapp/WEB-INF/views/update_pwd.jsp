<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <c:choose>
        <c:when test="${not empty sessionScope.loginCustomer}">
		    <h2>비밀번호 변경</h2>
		    <form method="post" action="updatePwdOk">
		        <label>새 비밀번호: </label>
		        <input type="password" name="new_pwd" required /><br><br>
		        <input type="submit" value="변경하기" />
		    </form>
		    <br>
		    <button onclick="location.href='customer_info'">내 정보 보기</button>
		</c:when>
        <c:otherwise>
            <p>로그인이 필요합니다.</p>
            <a href="login">로그인 페이지로 이동</a>
        </c:otherwise>		
	</c:choose>
	
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
	</c:choose>
</body>
</html>