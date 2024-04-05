package com.itcentrex.adapter.api;


import com.itcentrex.adapter.spi.CalculerSpiAdapter;
import com.itcentrex.model.Calculatrice;
import com.itcentrex.port.api.ICalculerImpl;

public class CalculerApiAdapter {

    private final ICalculerImpl calculerImpl;
    private final CalculerSpiAdapter calculerSpiAdapter;


    public CalculerApiAdapter(ICalculerImpl calculerImpl, CalculerSpiAdapter calculerSpiAdapter) {
        this.calculerImpl = calculerImpl;
        this.calculerSpiAdapter = calculerSpiAdapter;
    }

    public void additionner(Calculatrice calculatrice) {
        calculerImpl.additionner(calculatrice);
        calculerSpiAdapter.afficherResultat(calculatrice);

    }
    public void multiplier(Calculatrice calculatrice) {
        calculerImpl.multiplier(calculatrice);
        calculerSpiAdapter.afficherResultat(calculatrice);

    }
}
