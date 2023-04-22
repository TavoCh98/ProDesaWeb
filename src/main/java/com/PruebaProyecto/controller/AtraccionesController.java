
package com.PruebaProyecto.controller;

import com.PruebaProyecto.domain.Atracciones;
import com.PruebaProyecto.service.AtraccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AtraccionesController {
    
    @Autowired
    AtraccionesService atraccionesService;
    
    @GetMapping("/atracciones/lista")
    public String inicio(Model model) {

        var atracciones = atraccionesService.getAtracciones();
        model.addAttribute("atracciones", atracciones);
        return "/atracciones/lista";
    }

    @GetMapping("/atraccion/nuevo")
    public String nuevaAtraccion(Atracciones atracciones) {
        return "/atraccion/modificar";
    }

    @PostMapping("/atraccion/salvar")
    public String salvarAtraccion(Atracciones atracciones) {
        atraccionesService.save(atracciones);
        return "redirect:/atracciones/lista";
    }
    
    @GetMapping("/atraccion/modificar/{idAtraccion}")
    
    public String modificarAtraccion(Atracciones atracciones, Model model) {
        atracciones = atraccionesService.getAtraccion(atracciones);
        model.addAttribute("atracciones", atracciones);
        return "/atraccion/modificar";
    }

    @GetMapping("/atraccion/eliminar/{idAtraccion}")
    public String eliminarAtraccion(Atracciones atracciones) {
        atraccionesService.delete(atracciones);
        return "redirect:/atracciones/lista";
    }          
}

