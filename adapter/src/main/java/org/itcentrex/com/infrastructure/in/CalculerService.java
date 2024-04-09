package org.itcentrex.com.infrastructure.in;


import lombok.RequiredArgsConstructor;
import org.itcentrex.com.infrastructure.Mapper.CalculatriceMapper;
import org.itcentrex.com.infrastructure.Model.Calculatrice;
import org.itcentrex.com.infrastructure.dto.Operandes;
import org.springframework.stereotype.Service;
import port.CalculerUseCase;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CalculerService {


    private final CalculerUseCase calculerUseCase;


    public Calculatrice additionner(Operandes operandes) {
        return CalculatriceMapper.mapToCalculatrice(calculerUseCase.additionner(operandes.getNb1(), operandes.getNb2()));
    }


    public Calculatrice soustraire(Operandes operandes) {
        return CalculatriceMapper.mapToCalculatrice(calculerUseCase.soustraire(operandes.getNb1(), operandes.getNb2()));
    }


    public Calculatrice multiplication(Operandes operandes) {
        return CalculatriceMapper.mapToCalculatrice(calculerUseCase.multiplication(operandes.getNb1(), operandes.getNb2()));
    }


    public Calculatrice division(Operandes operandes) {
        return CalculatriceMapper.mapToCalculatrice(calculerUseCase.division(operandes.getNb1(), operandes.getNb2()));
    }


    public List<Calculatrice> getAllCalculs() {
        return calculerUseCase.getAllCalculs()
                .stream()
                .map(CalculatriceMapper::mapToCalculatrice)
                .toList();
    }

}
