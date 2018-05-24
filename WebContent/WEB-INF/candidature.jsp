<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Candidature</title>
<link type="text/css" rel="stylesheet" href="form.css" />
</head>
<body>
	<form method="POST" action="register">
		<fieldset>
			<legend>Cand</legend>
			<p>Vous pouvez candidater via ce formulaire.</p>
			</br>
			<label for="combobox">Combobox <span class="form-control">*</span></label>
			<input type="text" id="combobox" name="combobox"
				value="${utilisateur.combobox}" size="20" maxlength="60" /> <span
				class="erreur">${form.erreurs['combobox']}</span> 
			</br>

		</fieldset>
	</form>
</body>
</html>