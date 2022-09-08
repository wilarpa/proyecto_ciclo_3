package edu.udea.proyecto_ciclo_3.repo;
import edu.udea.proyecto_ciclo_3.modelos.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Integer> {
}
