package edu.UdeA.proyc3.controller;

import edu.UdeA.proyc3.modelos.Empresa;
import edu.UdeA.proyc3.service.EmpresaService;
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
