package edu.UdeA.proyc3.repo;

import edu.UdeA.proyc3.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //punto intermedio entre la entidad y la tabla, se crean para que la tabla y la entidad se comuniquen
public interface EmpresaRepository extends JpaRepository <Empresa,Integer>{
}


