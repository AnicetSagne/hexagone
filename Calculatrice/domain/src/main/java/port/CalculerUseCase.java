package port;

import model.Calculatrice;


public interface CalculerUseCase {

    Calculatrice additionner(Calculatrice calculatrice);

    Calculatrice soustraire(Calculatrice calculatrice);

    void afficher(Calculatrice calculatrice);
}
