package org.itcentrex.com.infrastructure.Model;

import lombok.Getter;

@Getter

public enum Operateur {
    ADDITION("+"),
    SOUSTRACTION("-"),
    DIVISION("/"),
    MULTIPLICATION("*");
    private String symbole;

    Operateur(String symbole) {
        this.symbole = symbole;
    }

}
