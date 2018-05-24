<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accéder à votre compte</title>
<!--     <link href="../../css/bootstrap.min.css" rel="stylesheet"> -->
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

</head>
<body>
	<div class="container">
		<div class="text-center">
			<h1 class="nice">Authentification</h1>
		</div>
		<form id="monForm" name="monForm" action="../../InscriptionServlet" method="post" class="formulaire">
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="nom">Nom</label>
				<div class="col-md-4">
					<input id="name" name="nom" type="text" placeholder="Nom"
						class="form-control input-md" required=""> 
				</div>
			</div>
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="prenom">Prénom</label>
				<div class="col-md-4">
					<input id="prenom" name="prenom" type="text" placeholder="Prénom"
						class="form-control input-md" required=""> 
				</div>
			</div>
				<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="mdp">Mot de passe</label>
				<div class="col-md-4">
					<input id="mdp" name="mdp" type="text" placeholder="Mdp"
						class="form-control input-md" required=""> 
				</div>
			</div>
				<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="mdp2">Confirmer votre mot de passe</label>
				<div class="col-md-4">
					<input id="mdp2" name="mdp2" type="text" placeholder="Mdp"
						class="form-control input-md" required="">
				</div>
			</div>
				<!-- Select Date Of Birth-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="date">Date de naissance</label>
				<div class="col-md-4">
					<input id="date" name="datedenaissance" type="date" placeholder="date"
						class="form-control input-md" required="">
				</div>
			</div>
			
			
			<!-- Gender Input -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="checkboxes">Sexe</label>

				<div class="col-md-4">
					<div class="checkbox">
						<label> <input name="genderboxes" id="genderboxes-0"
							value="1" type="radio"> Masculin
						</label>
					</div>
					<div class="checkbox">
						<label> <input name="genderboxes" id="genderboxes-1"
							value="2" type="radio"> Féminin
						</label>
					</div>
					<span class="help-block">Veuillez entrer votre sexe</span>

				</div>
			
			</div>
				<!-- nationalité-->
				<div class="form-group">
					<label class="col-md-4 control-label">Nationalité</label>

					<div class="col-md-4">
						<input id="moffa" name="moffa" type="text"
							placeholder="Nationalité" class="form-control input-md"
							required=""> 
					</div>
				</div>
			<!-- Email input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="email">Email</label>

				<div class="col-md-4">
					<input id="email" name="email" type="email" placeholder="Email"
						class="form-control input-md" required=""> 
				</div>
			</div>
		
			<!-- Paddress input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="name">
					Adresse</label>

				<div class="col-md-4">
					<input id="paddress" name="paddress" type="text"
						placeholder="Adresse" class="form-control input-md" required="">
				</div>
			</div>
			
			<!-- Phone input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="password">Téléphone</label>

				<div class="col-md-4">
					<input id="phone" name="phone" type="tel"
						placeholder="Tél" class="form-control input-md"
						required=""> 
				</div>
			</div>
			
			<div class="form-group">
				<label class="col-md-4 control-label" for="button1id"></label>

				<div class="col-md-8">
					<button type="submit" class="btn btn-success">Enregistrer</button>
					<a id="cancel" name="cancel" class="btn btn-danger" href="#">
						Annuler</a>
				</div>
			</div>
		</form>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>