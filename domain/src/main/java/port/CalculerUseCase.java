package port;

import model.CalculatriceD;

import java.util.List;


public interface CalculerUseCase {

    CalculatriceD additionner(double nb1, double nb2);

    CalculatriceD soustraire(double nb1, double nb2);

    CalculatriceD multiplication(double nb1, double nb2);

    CalculatriceD division(double nb1, double nb2);

    List<CalculatriceD> getAllCalculs();
}
