package com.itcentrex.port.api;

import com.itcentrex.model.Calculatrice;

public class ICalculerImpl implements ICalculer {


    @Override
    public Calculatrice additionner(Calculatrice calculatrice) {
        calculatrice.setResultat(calculatrice.getNombre1()+calculatrice.getNombre2());
        return calculatrice;
    }

    @Override
    public Calculatrice multiplier(Calculatrice calculatrice) {
        calculatrice.setResultat(calculatrice.getNombre1()*calculatrice.getNombre2());
        return calculatrice;
    }
}
