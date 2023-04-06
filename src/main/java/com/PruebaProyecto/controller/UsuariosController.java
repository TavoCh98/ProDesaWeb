package com.PruebaProyecto.controller;

import com.PruebaProyecto.domain.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.PruebaProyecto.service.UsuariosService;

@Controller
public class UsuariosController {
    
    @Autowired
    UsuariosService usuarioService;
    
    @GetMapping("/usuarios/lista")
    public String inicio(Model model) {

        var usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "/usuarios/lista";
    }

    @GetMapping("/usuario/nuevo")
    public String nuevoUsuario(Usuarios usuarios) {
        return "/usuario/modificar";
    }

    @PostMapping("/usuario/salvar")
    public String salvarUsuario(Usuarios usuarios) {
        usuarioService.save(usuarios);
        return "redirect:/usuarios/lista";
    }
    
    @GetMapping("/cliente/modificar/{idCliente}")
    
    public String modificarUsuario(Usuarios usuarios, Model model) {
        usuarios = usuarioService.getUsuarios(usuarios);
        model.addAttribute("usuarios", usuarios);
        return "/usuario/modificar";
    }

    @GetMapping("/usuario/eliminar/{idUsuarios}")
    public String eliminarUsuario(Usuarios usuarios) {
        usuarioService.delete(usuarios);
        return "redirect:/usuarios/lista";
    }
            
}
