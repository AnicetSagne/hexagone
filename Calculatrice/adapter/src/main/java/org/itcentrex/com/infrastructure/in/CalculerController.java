package org.itcentrex.com.infrastructure.in;


import model.Calculatrice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import port.CalculerUseCase;


@RestController
@RequestMapping("/calculer")
public class CalculerController {


    private final CalculerUseCase calculerUseCase;


    public CalculerController(CalculerUseCase calculerUseCase) {
        this.calculerUseCase = calculerUseCase;
    }

    @PostMapping
    public Calculatrice additionner(Calculatrice calculatrice) {
        return calculerUseCase.additionner(calculatrice);
    }

    @PostMapping
    public Calculatrice soustraire(Calculatrice calculatrice) {
        return calculerUseCase.soustraire(calculatrice);
    }

}
