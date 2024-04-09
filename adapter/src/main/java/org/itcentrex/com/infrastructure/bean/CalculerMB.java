package org.itcentrex.com.infrastructure.bean;


import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.itcentrex.com.infrastructure.Model.Calculatrice;
import org.itcentrex.com.infrastructure.dto.Operandes;
import org.itcentrex.com.infrastructure.in.CalculerService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@RequestScoped
public class CalculerMB implements Serializable {


    @Getter
    @Setter
    List<Calculatrice> calculatrices;

    @Getter
    @Setter
    private Operandes operandes;

    @Getter
    @Setter
    private Calculatrice calculatrice;


    private CalculerService calculerService;


    @PostConstruct
    public void init() {
        this.operandes = new Operandes();
        this.calculatrices = calculerService.getAllCalculs();

    }

    public void reinitialiser() {
        calculatrice = new Calculatrice();

    }


    public Calculatrice additionner() {
        return calculerService.additionner(operandes);
    }

    public Calculatrice soustraire() {
        return calculerService.soustraire(operandes);
    }

    public Calculatrice multiplier() {
        return calculerService.multiplication(operandes);
    }

    public Calculatrice diviser() {
        return calculerService.division(operandes);
    }

    public List<Calculatrice> getAllCalculs() {
        return calculerService.getAllCalculs();
    }

}