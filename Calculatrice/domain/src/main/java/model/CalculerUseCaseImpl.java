package model;


import port.CalculerUseCase;

public class CalculerUseCaseImpl implements CalculerUseCase {
    @Override
    public Calculatrice additionner(Calculatrice calculatrice) {
        calculatrice.setResultat(calculatrice.getNb1() + calculatrice.getNb2());
        afficher(calculatrice);
        return calculatrice;
    }

    @Override
    public Calculatrice soustraire(Calculatrice calculatrice) {
        calculatrice.setResultat(calculatrice.getNb1() - calculatrice.getNb2());
        afficher(calculatrice);
        return calculatrice;
    }

    @Override
    public void afficher(Calculatrice calculatrice) {
        System.out.println(calculatrice);
    }
}
