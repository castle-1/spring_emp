<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employ input</title>
	<script type="text/javascript">
	
	window.onload = function() {
		var lf = document.getElementById("check");
		lf.onsubmit = function() {
			if(document.getElementById("checkEmpno").value == ""){
				alert("사원번호를 다시 입력하세요. 공백입니다.");
				return false;
			}
		};
	}
	
	</script>
	
	
</head>
<body>	
	<h1> 사원 정보 입력</h1>
	<hr>
	<form id="check" action="list" method="post">
		사원번호 <input id="checkEmpno" type="text" name="empno"> <br>
		사원이름 <input type="text" name="ename"> <br>
		사원직급 <input type="text" name="job"> <br>
		매니저 <select name="mgr">
		<c:forEach items="${listMgr }" var="vo">
			<option value="${vo.empno }">(${vo.empno })${vo.ename } </option>
			</c:forEach>
		</select><br>
		입사일 <input type="date" name="hiredate"> <br>
		급여 <input type="text" name="sal"> <br>
		커미션 <input type="text" name="comm"><br>
		부서 <select name="deptno">
			<c:forEach items="${listDep }" var="vo">
			<option value="${vo.deptno }">(${vo.deptno })${vo.dname } </option>
			</c:forEach>
		
		</select><br>
		<input type="submit" value="입력">
	</form>
		

</body>
</html>