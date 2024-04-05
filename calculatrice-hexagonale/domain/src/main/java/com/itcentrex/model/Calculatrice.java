package com.itcentrex.model;


public class Calculatrice {

    private double nombre1;
    private double nombre2;
    private double resultat;

    public Calculatrice(double nombre1, double nombre2, double resultat) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.resultat = resultat;
    }

    public double getNombre1() {
        return nombre1;
    }

    public double getNombre2() {
        return nombre2;
    }

    public double getResultat() {
        return resultat;
    }

    public void setNombre1(double nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(double nombre2) {
        this.nombre2 = nombre2;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
}