package com.example.tp5;

import metier.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class GestionEtudiants {
    private static List<Etudiant> Listetudiants= new ArrayList<Etudiant>();
    public  void add(Etudiant e){
        Listetudiants.add(e);
    }
    public List<Etudiant> getListetudiants() {
        return Listetudiants;
    }
    public void remove(int e){
        this.getListetudiants().remove(e);
    }

    public void setListetudiants(List<Etudiant> listetudiants) {
        Listetudiants = listetudiants;
    }
    public int getEtud(String cin){
       int i=0;
      for(Etudiant e1:this.getListetudiants()){
          if(e1.getCin().equals(cin)){
              i=this.getListetudiants().indexOf(e1);
          }
      }
      return i;
    }
}
