<!DOCTYPE html>
<html>
<head>
    <title>Inserer Etudiant</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        h1{
            text-align: center;
        }
        .coutiner{
            max-width: 500px;
            margin: 0 70px;
        }

    </style>
</head>
<body>
<div class="coutiner">
<h1>Inserer Etudiant</h1>
<form method="get" action="ajouter.do">
    <div class="form-group">
        <label for="cin">Cin</label>
        <input type="text" class="form-control" id="cin" placeholder="cin" name="cin">
    </div>
    <div class="form-group">
        <label for="nom">Nom</label>
        <input type="text" class="form-control" id="nom" placeholder="nom" name="nom">
    </div>
    <div class="form-group">
        <label for="Moyenne">Moyenne</label>
        <input type="text" class="form-control" id="Moyenne" placeholder="moyenne" name="moyenne">
    </div>
    <button type="submit" class="btn btn-primary">Enregister</button>
</form>
</div>
</body>
</html>