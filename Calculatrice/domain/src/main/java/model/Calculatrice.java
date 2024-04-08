package model;

public class Calculatrice {

    Integer id;
    Double nb1;
    Double nb2;
    Double resultat;

    public Calculatrice(Integer id, Double nb1, Double nb2, Double resultat) {
        this.id = id;
        this.nb1 = nb1;
        this.nb2 = nb2;
        this.resultat = resultat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNb1() {
        return nb1;
    }

    public void setNb1(Double nb1) {
        this.nb1 = nb1;
    }

    public Double getNb2() {
        return nb2;
    }

    public void setNb2(Double nb2) {
        this.nb2 = nb2;
    }

    public Double getResultat() {
        return resultat;
    }

    public void setResultat(Double resultat) {
        this.resultat = resultat;
    }

    @Override
    public String toString() {
        return "Calculatrice{" +
                "id=" + id +
                ", nb1=" + nb1 +
                ", nb2=" + nb2 +
                ", resultat=" + resultat +
                '}';
    }
}
