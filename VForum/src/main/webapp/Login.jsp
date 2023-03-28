<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>VForum Login</title>
</head>

<body>
<c:set var="valid" value="${credentials}"></c:set>
<c:if test="${valid != null }">
	<h2><c:out value="${valid}"></c:out></h2>
</c:if>

	<form action="UserLogin" method="post">
		EmailID: <input type="text" name="emailID" /> Password: <input
			type="password" name="password" /> <input type="submit" value="Login" />
	</form>

</body>

</html>