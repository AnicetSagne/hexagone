package org.itcentrex.com.infrastructure.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatriceRepo extends JpaRepository<Calculatrice, Integer> {

}
