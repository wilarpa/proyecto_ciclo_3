package edu.UdeA.proyc3.service;

import edu.UdeA.proyc3.modelos.Empresa;
import edu.UdeA.proyc3.repo.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//en esta clase se programas todas las acciones que yo quiero que tenga la página (crear, actulizar...etc)
@Service
public class EmpresaService {
    @Autowired //conecta a clase con el repositorio de Empresa
    EmpresaRepository empresaRepository;

///se crea acontinuación la opción para llamar (mostrar ) las empresas creadas (se muestran en una LISTA)
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList=new ArrayList<>(); // en esta linea està creando una lista llamada empresa
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa));//como FindALL() genera un campo de memoria, entonces se itera los registros para añadiros a la lista
        return empresaList;
    }
    //llama y obtiene al objeto tipo empresa con el id
    public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).get(); //findBy(id)
    }
    //metodo para guardar o actualizar objetos tipo empresa
    public boolean saveOrUprateEmpresa(Empresa empresa){
        Empresa emp=empresaRepository.save(empresa);
                if(empresaRepository.findById(emp.getId())!=null){
                    return true;
                }
                return false;
    }

    //Método de eliminación de empresa con el id
    public boolean deleteEmpresa(Integer id){
        empresaRepository.deleteById(id);
        if (getEmpresaById(id) !=null){
            return false;
        }
        return true;
    }
}
