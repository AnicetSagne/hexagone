package org.itcentrex.com.infrastructure.in;


import model.Calculatrice;
import model.CalculerUseCaseImpl;
import org.itcentrex.com.infrastructure.dto.Operandes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import port.CalculerUseCase;


@RestController
@RequestMapping("/calculer")
public class CalculerController {


    private CalculerUseCase calculerUseCase;


    public CalculerController() {
        this.calculerUseCase = new CalculerUseCaseImpl();
    }

    @PostMapping("additionner")
    public ResponseEntity<Calculatrice> additionner(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.additionner(operandes.getNb1(), operandes.getNb2()));
    }

    @PostMapping("soustraire")
    public ResponseEntity<Calculatrice> soustraire(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.soustraire(operandes.getNb1(), operandes.getNb2()));
    }

    @PostMapping("multiplication")
    public ResponseEntity<Calculatrice> multiplication(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.multiplication(operandes.getNb1(), operandes.getNb2()));
    }

    @PostMapping("division")
    public ResponseEntity<Calculatrice> division(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.division(operandes.getNb1(), operandes.getNb2()));
    }

}
