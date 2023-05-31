package com.example.tp5;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import metier.Etudiant;

import java.io.IOException;

@WebServlet(name = "AffichageEtudiants", value = "/AffichageEtudiants")
public class AffichageEtudiants extends HttpServlet {
    GestionEtudiants etud=new GestionEtudiants();
    public void init(){
        etud.add(new Etudiant("cin 1","Etudiant1",12));
        etud.add(new Etudiant("cin 2","Etudiant2",14));
        etud.add(new Etudiant("cin 3","Etudiant3",9));
        etud.add(new Etudiant("cin 4","Etudiant4",15));
        etud.add(new Etudiant("cin 5","Etudiant5",8));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setAttribute("etud",etud);
      request.getRequestDispatcher("etudiants.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
