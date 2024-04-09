package org.itcentrex.com.infrastructure.Mapper;

import model.CalculatriceD;
import org.itcentrex.com.infrastructure.Model.Calculatrice;
import org.modelmapper.ModelMapper;

public class CalculatriceMapper {
    private static ModelMapper modelMapper;

    static {
        modelMapper = new ModelMapper();
    }

    public static CalculatriceD mapToCalculatriceD(Calculatrice calculatrice) {
        return modelMapper.map(calculatrice, CalculatriceD.class);
    }

    public static Calculatrice mapToCalculatrice(CalculatriceD calculatriceD) {
        return modelMapper.map(calculatriceD, Calculatrice.class);
    }
}
