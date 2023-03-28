<!--%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>-->
<!DOCTYPE html>
<html>
<head> 
<title> Registration </title>
</head>

<body>
 Aye, Aye, Captain! Or, Are you not? Be a Captain by registering
<hr/>

<form action="UserRegister" method="post">
	<label>EmployeeID:</label> <input id ="empid" type="text" name="empid" autofocus required /> <br />
	<label>FirstName:</label> <input id ="firstName" type="text" name="firstName"  autofocus required/> <br />
	<label>LastName:</label> <input id ="lastName" type="text" name="lastName" autofocus required/> <br />
	<label>EmailID:</label> <input id ="email" type="email" name="email" pattern="[a-z]+(@virtusa.com)" autofocus required/> <br />
	<label>Password:</label> <input id ="password" type="password" name="password" autofocus required/> <br />
	<label>Phone Number:</label> <input id ="phoneNumber" type="tel" name="phoneNumber" pattern="[9876]{1}[0-9]{9}" autofocus required/> <br />
	<label>DateOfBirth:</label> <input id ="dob" type="date" name="dob" max="2000-12-31" min="1960-01-01" autofocus required/> <br />
	<input type="submit" value="Register" />
</form>
</body>

</html>