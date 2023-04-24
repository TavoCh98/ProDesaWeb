
package com.PruebaProyecto.controller;

import com.PruebaProyecto.domain.Atraccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.PruebaProyecto.service.AtraccionService;


@Controller
public class AtraccionController {
    
    @Autowired
    AtraccionService atraccionesService;
    
    @GetMapping("/atracciones/inicio")
    public String inicio(Model model) {

        var atracciones = atraccionesService.getAtracciones();
        model.addAttribute("atracciones", atracciones);
        return "/atracciones/inicio";
    }

    @GetMapping("/atraccion/nuevo")
    public String nuevaAtraccion(Atraccion atracciones) {
        return "/atraccion/modificar";
    }

    @PostMapping("/atraccion/salvar")
    public String salvarAtraccion(Atraccion atracciones) {
        atraccionesService.save(atracciones);
        return "redirect:/atracciones/inicio";
    }
    
    @GetMapping("/atraccion/modificar/{idAtraccion}")
    
    public String modificarAtraccion(Atraccion atracciones, Model model) {
        atracciones = atraccionesService.getAtraccion(atracciones);
        model.addAttribute("atracciones", atracciones);
        return "/atraccion/modificar";
    }

    @GetMapping("/atraccion/eliminar/{idAtraccion}")
    public String eliminarAtraccion(Atraccion atracciones) {
        atraccionesService.delete(atracciones);
        return "redirect:/atracciones/inicio";
    }          
} 


