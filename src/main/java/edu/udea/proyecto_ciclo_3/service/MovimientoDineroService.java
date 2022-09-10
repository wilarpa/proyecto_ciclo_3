package edu.udea.proyecto_ciclo_3.service;

import edu.udea.proyecto_ciclo_3.modelos.MovimientoDinero;
import edu.udea.proyecto_ciclo_3.repo.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService {
    @Autowired
    MovimientoDineroRepository movimientoDineroRepository;

    public List<MovimientoDinero>getAllmonto(){
        List<MovimientoDinero>montoList = new ArrayList<>();
        MovimientoDineroRepository.findAll().forEach(monto -> montoList.add(monto));
        return montoList;
          }
    public List<MovimientoDinero>getAllconcepto(){
        List<MovimientoDinero>conceptoList = new ArrayList<>();
        MovimientoDineroRepository.findAll().forEach(concepto -> conceptoList.add(concepto));
        return conceptoList;
        }
    public MovimientoDinero get

    }


    public MovimientoDineroRepository getMovimientoDineroRepository() {
        return movimientoDineroRepository;
    }
}
