<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>Login</title>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-sm bg-light">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="login">LOGIN</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Show
						Employees </a></li>
				<li class="nav-item"><a class="nav-link" href="#">Employee
						Registration</a></li>
			</ul>
		</nav>
		<br> ${ msg }
	</div>
	<div class="container">
		<h1>Employee Login Page</h1>
		<br>
		<br>

		<form action="authenticate" method="post">
			<div class="row">
				<div class="col-md-3">Email Id</div>
				<div class="col-md-9">
					<input type="text" name="emailId">
				</div>
			</div>
			</br>
			<div class="row">
				<div class="col-md-3">Password</div>
				<div class="col-md-9">
					<input type="text" name="password">
				</div>
			</div>
			<button type="submit" class="btn btn-success">Login</button>
		</form>
	</div>



	</div>
</body>
</html>