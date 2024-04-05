package com.itcentrex;

import com.itcentrex.adapter.api.CalculerApiAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.itcentrex.model.Calculatrice;

public class CalculatriceTest {

    private final CalculerApiAdapter calculerApiAdapter;

    public CalculatriceTest(CalculerApiAdapter calculerApiAdapter) {
        this.calculerApiAdapter = calculerApiAdapter;
    }

    @Test
    public void additionner() {
        Calculatrice calculatrice = new Calculatrice(10,15,0);
        assertEquals(10,calculatrice.getNombre1());
        assertEquals(15,calculatrice.getNombre2());
        assertEquals(0,calculatrice.getResultat());
        calculerApiAdapter.additionner(calculatrice);
    }@Test

    public void multiplier() {
        Calculatrice calculatrice = new Calculatrice(10,15,0);
        calculerApiAdapter.multiplier(calculatrice);
    }

}
