package org.itcentrex.com.infrastructure.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "calculatrice")
public class Calculatrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    double nb1;
    double nb2;
    double resultat;
    @Enumerated(EnumType.STRING)
    Operateur operateur;

}
