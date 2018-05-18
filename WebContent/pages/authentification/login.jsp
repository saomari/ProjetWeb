<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- <link href="../../css/bootstrap.min.css" rel="stylesheet"> -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Accéder à votre compte</title>

</head>

<body>
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="text-center">Bienvenue</h1>
				</div>
				<div class="modal-body">
					<form action="SAccess" method="post">
						<div class="form-group">
							<label>*<span class="glyphicon glyphicon-user"></span>Nom d'utilisateur
							</label> <input name="login" id="login" type="text" class="form-control"
								required>
						</div>

						<div class="form-group">
							<label>*<span class="glyphicon glyphicon-lock"></span>
								Mot de passe
							</label> <input name="password" id="password" type="password"
								class="form-control" required>
						</div>
						<br>
						
						<div class="form-group">
							<input type="submit" class="btn btn-block btn-lg btn-primary"
								name="Continuer" value="connexion" />
						</div>
						<div class="form-group">
							<a href="pages/inscription/inscription.jsp">S'enregistrer</a> - <a
								href="#">Mot de passe oublié</a>
						</div>
					</form>
				</div>
			</div>
			</div>

		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
		<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>