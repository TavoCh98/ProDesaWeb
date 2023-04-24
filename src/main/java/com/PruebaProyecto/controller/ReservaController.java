
package com.PruebaProyecto.controller;

import com.PruebaProyecto.domain.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.PruebaProyecto.service.ReservaService;

@Controller
public class ReservaController {
    
    @Autowired
    ReservaService reservaService;
    
    @GetMapping("/reservas/lista")
    public String inicio(Model model) {

        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        return "/reservas/lista";
    }

    @GetMapping("/reserva/nuevo")
    public String nuevaReserva(Reserva reservas) {
        return "/reserva/modificar";
    }

    @PostMapping("/reserva/salvar")
    public String salvarReserva(Reserva reservas) {
        reservaService.save(reservas);
        return "redirect:/reservas/lista";
    }
    
    @GetMapping("/reserva/modificar/{idReserva}")
    
    public String modificarReserva(Reserva reserva, Model model) {
        reserva = reservaService.getReserva(reserva);
        model.addAttribute("reservas", reserva);
        return "/reserva/modificar";
    }

    @GetMapping("/reserva/eliminar/{idReservas}")
    public String eliminarReserva(Reserva reservas) {
        reservaService.delete(reservas);
        return "redirect:/reservas/lista";
    }          
}



