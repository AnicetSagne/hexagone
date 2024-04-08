package model;

public class Calculatrice {

    Integer id;
    double nb1;
    double nb2;
    double resultat;
    Operateur operateur;

    public Calculatrice() {
    }

    public Calculatrice(double nb1, double nb2, double resultat, Operateur operateur) {
        this.nb1 = nb1;
        this.nb2 = nb2;
        this.resultat = resultat;
        this.operateur = operateur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getNb1() {
        return nb1;
    }

    public void setNb1(double nb1) {
        this.nb1 = nb1;
    }

    public double getNb2() {
        return nb2;
    }

    public void setNb2(double nb2) {
        this.nb2 = nb2;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
}
