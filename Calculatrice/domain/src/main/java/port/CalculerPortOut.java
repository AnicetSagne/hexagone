package port;

import model.Calculatrice;

import java.util.List;

public interface CalculerPortOut {
    void create(Calculatrice calculatrice);

    List<Calculatrice> getAllCalculs();
}
