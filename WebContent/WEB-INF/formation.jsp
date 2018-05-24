<%@ page pageEncoding = "UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
   		<meta charset="utf-8" />
       	<title>Formation</title>
       	<link type="text/css" rel="stylesheet" href="form.css" />
    </head>
	<body>
		<form method="POST" action="register">
			<fieldset>
				<legend>Formation</legend>
				<p>Vous pouvez candidater via ce formulaire.</p>
				</br>
				<label for="motivation">Motivation <span class="form-control">*</span></label>
				<input type="text" id="motivation" name="motivation"
					value = "${utilisateur.motivation}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['motivation']}</span>
				</br>
				<label for="school">Ancien Etablissement <span class="form-control">*</span></label>
				<input type="text" id="school" name="school"
					value = "${utilisateur.school}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['school']}</span>
				</br>
				<label for="note">Note <span class="form-control">*</span></label>
				<input type="text" id="note" name="note"
					value = "${utilisateur.note}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['note']}</span>
				</br>
				<label for="diplome">Diplome <span class="form-control">*</span></label>
				<input type="text" id="diplome" name="diplome"
					value = "${utilisateur.diplome}" size="20" maxlength="60" /> 
					<span class="erreur">${form.erreurs['diplome']}</span>
				</br>
				<input type="submit" value="Inscription" class="sansLabel" />
			
			</fieldset>
		</form>
	</body>
</html>