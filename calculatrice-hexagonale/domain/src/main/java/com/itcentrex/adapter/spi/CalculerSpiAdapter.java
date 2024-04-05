package com.itcentrex.adapter.spi;

import com.itcentrex.model.Calculatrice;
import com.itcentrex.port.api.ICalculerImpl;
import com.itcentrex.port.spi.ICalculerOut;

public class CalculerSpiAdapter implements ICalculerOut {

    private final ICalculerImpl calculerImpl;

    public CalculerSpiAdapter(ICalculerImpl calculerImpl) {
        this.calculerImpl = calculerImpl;

    }

    @Override
    public void afficherResultat(Calculatrice calculatrice) {
        System.out.println("le resultat de l'addition est : " +calculatrice.getResultat());
    }
}
