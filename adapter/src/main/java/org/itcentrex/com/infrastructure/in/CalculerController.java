package org.itcentrex.com.infrastructure.in;


import model.CalculatriceD;
import org.itcentrex.com.infrastructure.dto.Operandes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import port.CalculerUseCase;

import java.util.List;


@RestController
@RequestMapping("/calculer")
public class CalculerController {


    private final CalculerUseCase calculerUseCase;

    public CalculerController(CalculerUseCase calculerUseCase) {
        this.calculerUseCase = calculerUseCase;
    }


    @PostMapping("additionner")
    public ResponseEntity<CalculatriceD> additionner(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.additionner(operandes.getNb1(), operandes.getNb2()));
    }

    @PostMapping("soustraire")
    public ResponseEntity<CalculatriceD> soustraire(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.soustraire(operandes.getNb1(), operandes.getNb2()));
    }

    @PostMapping("multiplication")
    public ResponseEntity<CalculatriceD> multiplication(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.multiplication(operandes.getNb1(), operandes.getNb2()));
    }

    @PostMapping("division")
    public ResponseEntity<CalculatriceD> division(@RequestBody Operandes operandes) {
        return ResponseEntity.ok(calculerUseCase.division(operandes.getNb1(), operandes.getNb2()));
    }

    @GetMapping("calculs")
    public ResponseEntity<List<CalculatriceD>> getAllCalculs() {
        return ResponseEntity.ok(calculerUseCase.getAllCalculs());
    }

}
