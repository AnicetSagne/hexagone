package port;

import model.CalculatriceD;

import java.util.List;

public interface CalculerPortOut {
    CalculatriceD create(CalculatriceD calculatriceD);

    List<CalculatriceD> getAllCalculs();
}
