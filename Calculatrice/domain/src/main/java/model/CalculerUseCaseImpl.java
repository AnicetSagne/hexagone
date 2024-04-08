package model;


import port.CalculerUseCase;

public class CalculerUseCaseImpl implements CalculerUseCase {
    @Override
    public Calculatrice additionner(double nb1, double nb2) {
        double res = nb1 + nb2;
        Calculatrice calculatrice = new Calculatrice(nb1, nb2, res, Operateur.ADDITION);
        afficher(calculatrice);
        return calculatrice;
    }

    @Override
    public Calculatrice soustraire(double nb1, double nb2) {
        double res = nb1 - nb2;
        Calculatrice calculatrice = new Calculatrice(nb1, nb2, res, Operateur.SOUSTRACTION);
        afficher(calculatrice);
        return calculatrice;
    }

    @Override
    public Calculatrice multiplication(double nb1, double nb2) {
        double res = nb1 * nb2;
        Calculatrice calculatrice = new Calculatrice(nb1, nb2, res, Operateur.MULTIPLICATION);
        afficher(calculatrice);
        return calculatrice;
    }

    @Override
    public Calculatrice division(double nb1, double nb2) {
        if (nb2 == 0) {
            throw new ArithmeticException("Impossible de diviser par 0");
        }
        double res = nb1 / nb2;
        Calculatrice calculatrice = new Calculatrice(nb1, nb2, res, Operateur.DIVISION);
        afficher(calculatrice);
        return calculatrice;
    }

    @Override
    public void afficher(Calculatrice calculatrice) {
        System.out.println(calculatrice.getResultat());
    }
}
