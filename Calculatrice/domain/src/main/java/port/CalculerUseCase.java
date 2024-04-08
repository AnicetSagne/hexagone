package port;

import model.Calculatrice;


public interface CalculerUseCase {

    Calculatrice additionner(double nb1, double nb2);

    Calculatrice soustraire(double nb1, double nb2);

    Calculatrice multiplication(double nb1, double nb2);

    Calculatrice division(double nb1, double nb2);

    void afficher(Calculatrice calculatrice);
}
