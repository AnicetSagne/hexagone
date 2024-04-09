package model;


import ddd.DomainService;
import port.CalculerPortOut;
import port.CalculerUseCase;

import java.util.List;

@DomainService
public class CalculerUseCaseImpl implements CalculerUseCase {
    private final CalculerPortOut calculerPortOut;

    public CalculerUseCaseImpl(CalculerPortOut calculerPortOut) {
        this.calculerPortOut = calculerPortOut;
    }


    @Override
    public CalculatriceD additionner(double nb1, double nb2) {
        double res = nb1 + nb2;
        CalculatriceD calculatriceD = new CalculatriceD(nb1, nb2, res, Operateur.ADDITION);

        return calculerPortOut.create(calculatriceD);
    }

    @Override
    public CalculatriceD soustraire(double nb1, double nb2) {
        double res = nb1 - nb2;
        CalculatriceD calculatriceD = new CalculatriceD(nb1, nb2, res, Operateur.SOUSTRACTION);
        return calculerPortOut.create(calculatriceD);
    }

    @Override
    public CalculatriceD multiplication(double nb1, double nb2) {
        double res = nb1 * nb2;
        CalculatriceD calculatriceD = new CalculatriceD(nb1, nb2, res, Operateur.MULTIPLICATION);
        return calculerPortOut.create(calculatriceD);
    }

    @Override
    public CalculatriceD division(double nb1, double nb2) {
        if (nb2 == 0) {
            throw new ArithmeticException("Impossible de diviser par 0");
        }
        double res = nb1 / nb2;
        CalculatriceD calculatriceD = new CalculatriceD(nb1, nb2, res, Operateur.DIVISION);
        return calculerPortOut.create(calculatriceD);
    }

    @Override
    public List<CalculatriceD> getAllCalculs() {
        return calculerPortOut.getAllCalculs();
    }

}
