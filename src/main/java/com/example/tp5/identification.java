package com.example.tp5;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import metier.Etudiant;

import java.io.IOException;

@WebServlet(name = "identification", urlPatterns = {"*.do"})
public class identification extends HttpServlet {
    GestionEtudiants etud =new GestionEtudiants();
    @Override
    public void init() throws ServletException {
        etud.add(new Etudiant("cin 1","Etudiant1",12));
        etud.add(new Etudiant("cin 2","Etudiant2",14));
        etud.add(new Etudiant("cin 3","Etudiant3",9));
        etud.add(new Etudiant("cin 4","Etudiant4",15));
        etud.add(new Etudiant("cin 5","Etudiant5",8));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if(path.equals("/index.do")){
            request.getRequestDispatcher("identification.jsp").forward(request,response);
        } else if (path.equals("/verification.do")) {
            String log=(String) request.getParameter("login");
            String pass= (String) request.getParameter("pass");
            if(log.equals("admin") && pass.equals("admin")){
                response.sendRedirect("list.do");
            }else{
                request.setAttribute("log",log);
                request.setAttribute("pass",pass);
                request.getRequestDispatcher("nonValide.jsp").forward(request,response);}

        } else if (path.equals("/ajouter.do")) {
            String cin= String.valueOf(request.getParameter("cin"));
            String nom= String.valueOf(request.getParameter("nom"));
            Double moyenne= Double.valueOf(request.getParameter("moyenne"));
            etud.add(new Etudiant(cin,nom,moyenne));
            response.sendRedirect("list.do");
        } else if (path.equals("/supprimer.do")) {
           String cin=(String) request.getParameter("cin");
           int e=etud.getEtud(cin);
           etud.remove(e);
           response.sendRedirect("list.do");
        }else if(path.equals("/list.do")){
            request.setAttribute("etud",etud);
            request.getRequestDispatcher("etudiants.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
