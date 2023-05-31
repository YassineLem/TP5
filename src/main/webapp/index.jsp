<%@ page import="java.util.List" %>
<%@ page import="metier.Etudiant" %>
<%@ page import="com.example.tp5.GestionEtudiants" %>
<%
    GestionEtudiants etudiants= (GestionEtudiants) request.getAttribute("etud");
%>
<!DOCTYPE html>
<html>
<head>
    <title>ListEtudiants</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<style>
    body{
        width: 750px;
        margin: 0 50px;
    }
    a:link{
        text-decoration:none;

    }
    nav{
        margin-bottom: 25px;
    }
</style>
<body>
<%@ include file="navbar.jsp" %>
<h1>Liste des Etudiants</h1>
<table class="table  table-striped">
    <thead>
    <tr class="table-primary">
        <th scope="col">Nom</th>
        <th scope="col">Cin</th>
        <th scope="col">Moyenne</th>
        <th scope="col">Supprimer</th>
    </tr>
    </thead>
    <tbody>
    <%for(Etudiant e1:etudiants.getListetudiants()){%>
    <tr>
        <td><%=e1.getNom()%></td>
        <td><%=e1.getCin()%></td>
        <td><%=e1.getMoyenne()%></td>
        <td><a href="supprimer.do?cin=<%=e1.getCin()%>" >Supprimer</a></td>
    </tr>
    <%}%>
    </tbody>
</table>
</body>
</html>