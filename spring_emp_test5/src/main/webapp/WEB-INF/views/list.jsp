<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMP table</title>
</head>
<body>

<h1>EMP TABLE 직원 목록</h1>
	<table border="1">
		<tr>
			<td align="center">사원번호 </td>
			<td align="center">사원이름 </td>
			<td align="center">직급(업무) </td>
			<td align="center">상사(이름) </td>
			<td align="center">입사일 </td>
			<td align="center">급여 </td>
			<td align="center">커미션 </td>
			<td align="center">부서번호 </td>
		
		</tr>
		<c:forEach items= "${list }" var="vo">
		<tr>
			<td> ${vo.empno }</td>
			<td> ${vo.ename }</td>
			<td> ${vo.job }</td>
			<td> ${vo.mgr }</td>
			<td> ${vo.hiredate }</td>
			<td> ${vo.sal }</td>
			<td> ${vo.comm }</td>
			<td> ${vo.deptno }</td>
			
			
		</tr>
		</c:forEach>
	</table>
	
	

</body>
</html>