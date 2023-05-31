package metier;

public class Etudiant {
    private String cin;
    private String nom;
    private double moyenne;
    public Etudiant(){}

    public Etudiant(String cin, String nom, double moyenne) {
        this.cin = cin;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "nom " + nom + cin + moyenne ;
    }
}
