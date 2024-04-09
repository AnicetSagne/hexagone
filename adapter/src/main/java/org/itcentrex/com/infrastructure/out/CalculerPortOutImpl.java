package org.itcentrex.com.infrastructure.out;

import model.CalculatriceD;
import org.itcentrex.com.infrastructure.Mapper.CalculatriceMapper;
import org.itcentrex.com.infrastructure.Model.CalculatriceRepo;
import org.springframework.stereotype.Component;
import port.CalculerPortOut;

import java.util.List;

@Component
public class CalculerPortOutImpl implements CalculerPortOut {

    private final CalculatriceRepo calculatriceRepo;

    public CalculerPortOutImpl(CalculatriceRepo calculatriceRepo) {
        this.calculatriceRepo = calculatriceRepo;
    }

    @Override
    public CalculatriceD create(CalculatriceD calculatriceD) {
        return CalculatriceMapper.mapToCalculatriceD(calculatriceRepo.save(CalculatriceMapper.mapToCalculatrice(calculatriceD)));
    }

    @Override
    public List<CalculatriceD> getAllCalculs() {
        return calculatriceRepo.findAll().stream().map(CalculatriceMapper::mapToCalculatriceD).toList();
    }
}
