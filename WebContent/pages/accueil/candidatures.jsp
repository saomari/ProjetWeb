<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accéder à votre compte</title>
<link href="../../css/bootstrap.min.css" rel="stylesheet">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

</head>

<body>
<form id="monForm" name="monForm" action="../../FormationServlet" method="post" class="formulaire">
	<div class="text-center">

		<h1>Dossier de candidature</h1>

	</div>
	<div class="container well">


			<!-- Textarea -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="motivation">
					Motivations :</label>
				<div class="col-md-4">
					<textarea class="form-control" id="motivation"
						name="motivation"></textarea>
				</div>
			</div>
			<!-- School input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="school">Ancien
					établissement :</label>

				<div class="col-md-4">
					<input id="school" name="school" type="text" placeholder=""
						class="form-control input-md" required="">
				</div>
			</div>
			<!-- note-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="name">Moyenne
					générale :</label>

				<div class="col-md-4">
					<input id="note" name="note" type="number" placeholder=""
						class="form-control input-md" required="">
				</div>
			</div>
			<!-- Diplome input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="diplome">Dernier
					diplome obtenu :</label>
				<div class="col-md-4">
					<input id="diplome" name="diplome" type="text" placeholder=""
						class="form-control input-md" required="">
				</div>
			</div>


			<div class="form-group">
				<label for="pwd">Diplome :</label> <input type="file"
					class="form-control" id="file">
			</div>
			<div class="pull-right">
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-backdrop="static" data-keyboard="false" data-target="#myModal"
					onclick="startUpload()">Valider</button>
			</div>
			<div class="form-group">
				<label for="pwd">CV :</label> <input type="file"
					class="form-control" id="file">
			</div>
			<div class="pull-right">
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-backdrop="static" data-keyboard="false" data-target="#myModal"
					onclick="startUpload()">Valider</button>
			</div>
			<br> <br> <br>
			 <button type="submit" class="btn btn-success">Soumettre</button>
			

		</div>

		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Upload initiated</h4>
					</div>
					<div class="modal-body">
						<p>File upload in progress you can either wait for the upload
							to complete or continue using the application in a new browser
							window</p>

						<div class="progress">
							<div class="progress-bar" role="progressbar" aria-valuenow="70"
								aria-valuemin="0" aria-valuemax="100" style="width: 70%">
								<span class="sr-only">70% Complete</span>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-info btnprogress"
							onclick="clickProgress()">Continue</button>
					</div>
				</div>

			</div>
		</div>
</body>
</html>


</body>
</html>
