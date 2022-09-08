package edu.udea.proyecto_ciclo_3.service;

import edu.udea.proyecto_ciclo_3.modelos.Empleado;
import edu.udea.proyecto_ciclo_3.repo.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;
    public List<Empleado> getAllEmpleados(){
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;



    }
    public Empleado getEmpleadoById(Integer id){
        return empleadoRepository.findById(id).get();
    }
    public boolean saveOrUpdateEmpleado(Empleado empleado){
        Empleado empl=empleadoRepository.save(empleado);
        if(empleadoRepository.findById(empl.getId())!=null){
          return true;
        }
        return false;
    }
}
