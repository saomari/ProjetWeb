<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Remplir le formulaire conçernant votre condidature </title>
</head>
<body>
<form id="monForm" name="monForm" action="../../CandidatureServlet" method="post" class="formulaire">
<div>
<h1 class="class-color">L'univeristé de Bordeaux</h1>

<strong>Bienvenue dans l'une des premières universités en Europe !</strong> </br></br></br>
Veuillez selectionner la formation de votre choix :
</div>

<div class="container">
	<div class="row">
		<div class="ui-widget">
            <select id="combobox" name="combobox">
                <option></option>
					<option value="informatique">Informatique</option>
					<option value="biologie">Biologie</option>
					<option value="chimie">Chimie</option>
					<option value="mathematiques">Mathématiques</option>
					<option value="sciences de l'ingénieur">Sciences de
						l'ingénieur</option>
					<option value="physique">Physique</option>
					<option value="lettres">Lettres</option>
					<option value="droit">Droit</option>
					<option value="economie">Economie</option>
					<option value="commerce">Commerce</option>
					<option value="staps">STAPS</option>
					<option value="medecine">Medecine</option>
				</select>
        </div>
	</div>
	<button type="submit" class="btn btn-success">Soumettre</button>
</div>
<br>

</body>
</html>