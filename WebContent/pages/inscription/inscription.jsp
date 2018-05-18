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
		<form class="form-horizontal" method="post" action="#">
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="name">Nom</label>
				<div class="col-md-4">
					<input id="name" name="name" type="text" placeholder="Nom"
						class="form-control input-md" required=""> <span
						class="help-block">Veuillez entrer votre nom </span>
				</div>
			</div>
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="prenom">Prénom</label>
				<div class="col-md-4">
					<input id="prenom" name="prenom" type="text" placeholder="Prénom"
						class="form-control input-md" required=""> <span
						class="help-block">Veuillez entrer votre prénom</span>
				</div>
			</div>
				<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="mdp">Mot de passe</label>
				<div class="col-md-4">
					<input id="mdp" name="mdp" type="text" placeholder="Mdp"
						class="form-control input-md" required=""> <span
						class="help-block">Veuillez entrer votre mot de passe</span>
				</div>
			</div>
				<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="mdp2">Confirmer votre mot de passe</label>
				<div class="col-md-4">
					<input id="mdp2" name="mdp2" type="text" placeholder="Mdp"
						class="form-control input-md" required=""> <span
						class="help-block">Veuillez retaper votre mot de passe</span>
				</div>
			</div>
			<!-- Select Date Of Birth-->
			<div class="row">
				<div class="form-group">
					<label class="col-md-4 control-label" for="selectbasic">Mois</label>

					<div class="col-md-1">
						<select id="selectbasic" name="selectbasic" class="form-control">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
						</select>
					</div>


					<label class="col-md-1 control-label" for="selectbasic">Jour</label>

					<div class="col-md-1">
						<select id="selectbasic" name="selectbasic" class="form-control">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
							<option value="25">25</option>
							<option value="26">26</option>
							<option value="27">27</option>
							<option value="28">28</option>
							<option value="29">29</option>
							<option value="30">30</option>
							<option value="31">31</option>
						</select>
					</div>
					<label class="col-md-1 control-label" for="selectbasic">Année</label>

					<div class="col-md-2">
						<select id="selectbasic" name="selectbasic" class="form-control">
							<option value="1990">1990</option>
							<option value="1991">1991</option>
							<option value="1992">1992</option>
							<option value="1993">1993</option>
							<option value="1994">1994</option>
							<option value="1995">1995</option>
							<option value="1996">1996</option>
							<option value="1997">1997</option>
							<option value="1998">1998</option>
							<option value="2000">2000</option>
							<option value="2001">2001</option>
							<option value="2002">2002</option>
							<option value="2003">2003</option>
							<option value="2004">2004</option>
							<option value="2005">2005</option>
							<option value="2006">2006</option>
							<option value="2007">2007</option>
							<option value="2008">2008</option>
							<option value="2009">2009</option>
							<option value="2010">2010</option>
							<option value="2011">2011</option>
							<option value="2012">2012</option>
							<option value="2013">2013</option>
							<option value="2014">2014</option>
							<option value="2015">2015</option>
							<option value="2016">2016</option>
							<option value="2017">2017</option>
							<option value="2018">2018</option>
						</select> <span class="help-block">Veuillez entrer votre date de naissance</span>
					</div>
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
							required=""> <span class="help-block">Veuillez entrer votre nationalité</span>
					</div>
				</div>
			<!-- Email input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="email">Email</label>

				<div class="col-md-4">
					<input id="email" name="email" type="email" placeholder="Email"
						class="form-control input-md" required=""> <span
						class="help-block">Veuillez entrer votre email</span>
				</div>
			</div>
		
			<!-- Paddress input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="name">
					Adresse</label>

				<div class="col-md-4">
					<input id="paddress" name="paddress" type="text"
						placeholder="Adresse" class="form-control input-md" required="">
					<span class="help-block">Veuillez entrer votre adresse</span>
				</div>
			</div>
			
			<!-- Phone input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="password">Téléphone</label>

				<div class="col-md-4">
					<input id="phone" name="phone" type="tel"
						placeholder="Tél" class="form-control input-md"
						required=""> <span class="help-block">Veuillez entrer votre numéro de téléphone</span>
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