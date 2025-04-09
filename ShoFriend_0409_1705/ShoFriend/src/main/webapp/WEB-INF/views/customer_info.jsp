<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<!-- * 25.04.08 권준우 최초 작성 -->

<head>
</head>
<body>
    <h2>내 정보 확인</h2>

    <c:choose>
        <c:when test="${not empty sessionScope.loginCustomer}">
            <table border="1" cellpadding="10">
                <tr>
                    <th>아이디(E-mail)</th>
                    <td>${loginCustomer.email}</td>
                </tr>
                <tr>
                    <th>비밀번호</th>
                    <td>${loginCustomer.password}</td>
                </tr>
                <tr>
                    <th>이름</th>
                    <td><input type="text" name="name" value="${loginCustomer.name}"></td>
                </tr>
                <tr>
                    <th>전화번호</th>
                    <td><input type="text" name="name" value="${loginCustomer.phone}"></td>
                </tr>
                <tr>
                    <th>주소</th>
                    <td><input type="text" name="name" value="${loginCustomer.address}"></td>
                </tr>
            </table>
            
            <form action="main" method="get">
			   	 <input type="submit" value="메인으로">
			</form>
			<button onclick="location.href='update_pwd'">비밀번호 변경</button>
        </c:when>
        <c:otherwise>
            <p>로그인이 필요합니다.</p>
            <a href="login">로그인 페이지로 이동</a>
        </c:otherwise>
    </c:choose>

    <br>
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
