package edu.UdeA.proyecto_ciclo_3.controller;

import edu.UdeA.proyecto_ciclo_3.modelos.Empresa;
import edu.UdeA.proyecto_ciclo_3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class controllerFull {
    @Autowired
    EmpresaService empresaService;

    @GetMapping ({"/","/verEmpresas"})
    public String viewEmpresas(Model model){
        List<Empresa> listaEmpresa=empresaService.getAllEmpresas();
        model.addAttribute("emplist", listaEmpresa);
        return "verEmpresas";
    }
}
