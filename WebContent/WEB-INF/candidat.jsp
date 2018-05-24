<%@ page pageEncoding = "UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
   		<meta charset="utf-8" />
       	<title>Inscription</title>
       	<link type="text/css" rel="stylesheet" href="form.css" />
    </head>
	<body>
	
		<form method="POST" action="register">
			<fieldset>
				<legend>Inscription</legend>
				<p>Vous pouvez candidater via ce formulaire.</p>
				</br>
				<label for="name">Name <span class="form-control">*</span></label>
				<input type="text" id="name" name="name"
					value = "${utilisateur.name}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['name']}</span>
				</br>
				<label for="prenom">Prenom <span class="form-control">*</span></label>
				<input type="text" id="prenom" name="prenom"
					value = "${utilisateur.prenom}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['prenom']}</span>
				</br>
				<label for="mdp">Mot de passe <span class="form-control">*</span></label>
				<input type="text" id="mdp" name="mdp"
					value = "${utilisateur.mdp}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['mdp']}</span>
				</br>
				<label for="mdp2">Mot de passe <span class="form-control">*</span></label>
				<input type="text" id="mdp2" name="mdp2"
					value = "${utilisateur.mdp2}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['mdp2']}</span>
				</br>
				<label for="phone">Telephone <span class="form-control">*</span></label>
				<input type="text" id="phone" name="phone"
					value = "${utilisateur.phone}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['phone']}</span>
				</br>
				<label for="email">Email <span class="form-control">*</span></label>
				<input type="text" id="email" name="email"
					value = "${utilisateur.email}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['email']}</span>
				</br>
				<label for="nationalite">Nationalite <span class="form-control">*</span></label>
				<input type="text" id="nationalite" name="nationalite"
					value = "${utilisateur.nationalite}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['nationalite']}</span>
				</br>
				<label for="paddress">Adresse <span class="form-control">*</span></label>
				<input type="text" id="paddress" name="paddress"
					value = "${utilisateur.paddress}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['paddress']}</span>
				</br>
				<label for="genderboxes">Genre H/F <span class="form-control">*</span></label>
				<input type="text" id="genderboxes" name="genderboxes"
					value = "${utilisateur.genderboxes}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['genderboxes']}</span>
				</br>
				<label for="selectbasic">Mois de naissance <span class="form-control">*</span></label>
				<input type="text" id="selectbasic1" name="selectbasic1"
					value = "${utilisateur.selectbasic1}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['selectbasic1']}</span>
				</br>
				</br>
				<label for="selectbasic"> Jour de naissance <span class="form-control">*</span></label>
				<input type="text" id="selectbasic2" name="selectbasic2"
					value = "${utilisateur.selectbasic2}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['selectbasic2']}</span>
					</br>
				<label for="selectbasic">Année de naissance <span class="form-control">*</span></label>
				<input type="text" id="selectbasic3" name="selectbasic3"
					value = "${utilisateur.selectbasic3}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['selectbasic3']}</span>
				<input type="submit" value="Inscription" class="sansLabel" />
			
			</fieldset>
		</form>
	</body>
</html>