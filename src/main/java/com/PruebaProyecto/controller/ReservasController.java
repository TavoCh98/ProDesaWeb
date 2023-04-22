
package com.PruebaProyecto.controller;

import com.PruebaProyecto.domain.Reservas;
import com.PruebaProyecto.service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservasController {
    
    @Autowired
    ReservasService reservaService;
    
    @GetMapping("/reservas/lista")
    public String inicio(Model model) {

        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        return "/reservas/lista";
    }

    @GetMapping("/reserva/nuevo")
    public String nuevaReserva(Reservas reservas) {
        return "/reserva/modificar";
    }

    @PostMapping("/reserva/salvar")
    public String salvarReserva(Reservas reservas) {
        reservaService.save(reservas);
        return "redirect:/reservas/lista";
    }
    
    @GetMapping("/reserva/modificar/{idReserva}")
    
    public String modificarReserva(Reservas reservas, Model model) {
        reservas = reservaService.getReservas(reservas);
        model.addAttribute("reservas", reservas);
        return "/reserva/modificar";
    }

    @GetMapping("/reserva/eliminar/{idReservas}")
    public String eliminarReserva(Reservas reservas) {
        reservaService.delete(reservas);
        return "redirect:/reservas/lista";
    }          
}



