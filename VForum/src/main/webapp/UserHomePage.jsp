<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>VFORUM</title>
<script>
function confirmDelete(){
	if(confirm("Are you sure you wanna delete?")){
	//var questionID = document.location.getElementByName("questionId").value;
		//document.location.href='DeletePost?id=$questionID';
		document.location.href='DeletePost';
	}
}
</script>

</head>
<body>

	<div>
		<h1 align=center>
			WELCOME TO VFORUM,
			<c:out value="${accountUsername}"></c:out>
		</h1>
	</div>

	<div class=Logout style="float: right">
		<form action="UserLogout" method="post">
			<!--  LOGOUT BUTTON-->
			<input type="submit" value="Logout" />
		</form>
	</div>

	<div class="container">

		<div class="posts" align="center">
			<div class="UserPostQuestion">
				<form action="PostQuestion" method="post">
					<p>Anything to Ask?</p>

					<textarea name="newQuestion" style="height: 110px; width: 35%"></textarea>
					<input type="submit" value="post" />
				</form>
			</div>
			<br /> <br />

			<c:forEach items="${questions}" var="question">
				<form action=PostAnswer method=post>
					<div class="row">
					<!-- Question -->
					<div class="col"><h3>
						<c:out value="${question.getQuestionContent()}"></c:out>
					</h3></div>
					<div class="col">--<b><c:out value="${question.getUsername() }"></c:out></b> </div>
					
					<input	type=hidden name=questionId value="<c:out value="${question.getQuestionId()}"></c:out>" /> <br />
					
					
					<!-- Only Admin can Delete UserPost -->

					<c:if test="${userType != null }">
					<div class="col">
					<input type="button"  value="Delete" onclick="confirmDelete()"/>
					<!--  <a href="#"  id="deleteLink" onclick="confirmDelete()">Delete</a>-->
					</div>
					</c:if>
					</div>
					<!-- Answers For Above Question -->
					
					<c:forEach items="${answers}" var="answer">
						<c:if
							test="${question.getQuestionId() == answer.getQuestionId() }">
							<div class="row">
							<div class="col"></div><c:out value="${answer.getAnswerContent()}"></c:out>
							<div class="col">--<i><c:out value="${answer.getUsername() }"></c:out></i></div>
							</div>
							<br />

						</c:if>
					</c:forEach>
					<br /> Answer: <input type=text name=answer /> 
					<input type=submit value=Reply /><br /> <br />

				</form>

			</c:forEach>

		</div>
	</div>


</body>
</html>