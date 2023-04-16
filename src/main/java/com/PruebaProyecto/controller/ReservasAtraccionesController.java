
package com.PruebaProyecto.controller;

import com.PruebaProyecto.domain.ReservasAtracciones;
import com.PruebaProyecto.domain.ReservasAtracciones;
import com.PruebaProyecto.service.ReservasAtraccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author 0116960839$
 */

@Controller
public class ReservasAtraccionesController {
    
    @Autowired
    ReservasAtraccionesService reservaAtraccionesService;
    
    @GetMapping("/reservasAtracciones/lista")
    public String inicio(Model model) {

        var reservasAtracciones = reservaAtraccionesService.getReservasAtracciones();
        model.addAttribute("reservasAtracciones", reservasAtracciones);
        return "/reservasAtracciones/lista";
    }

    @GetMapping("/reservaAtraccion/nuevo")
    public String nuevaReservaAtraccion(ReservasAtracciones reservasAtracciones) {
        return "/reservaAtraccion/modificar";
    }

    @PostMapping("/reservaAtraccion/salvar")
    public String salvarReserva(ReservasAtracciones reservasAtracciones) {
        reservaAtraccionesService.save(reservasAtracciones);
        return "redirect:/reservasAtracciones/lista";
    }
    
    @GetMapping("/reservaAtraccion/modificar/{idReservaAtraccion}")
    
    public String modificarReserva(ReservasAtracciones reservasAtracciones, Model model) {
        reservasAtracciones = reservaAtraccionesService.getReservasAtracciones(reservasAtracciones);
        model.addAttribute("reservasAtracciones", reservasAtracciones);
        return "/reservaAtraccion/modificar";
    }

    @GetMapping("/reservaAtraccion/eliminar/{idReservas}")
    public String eliminarReservaAtraccion(ReservasAtracciones reservasAtracciones) {
        reservaAtraccionesService.delete(reservasAtracciones);
        return "redirect:/reservasAtracciones/lista";
    }          
}
