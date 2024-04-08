package model;

public enum Operateur {
    ADDITION("+"),
    SOUSTRACTION("-"),
    DIVISION("/"),
    MULTIPLICATION("*");
    private String symbole;

    Operateur(String symbole) {
        this.symbole = symbole;
    }

    public String getSymbole() {
        return symbole;
    }
}
