package com.PruebaProyecto.controller;

import com.PruebaProyecto.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.PruebaProyecto.service.UsuarioService;

@Controller
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/usuarios/lista")
    public String inicio(Model model) {

        var usuarios = usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "/usuarios/lista";
    }

    @GetMapping("/usuario/nuevo")
    public String nuevoUsuario(Usuario usuarios) {
        return "/usuario/modificar";
    }

    @PostMapping("/usuario/salvar")
    public String salvarUsuario(Usuario usuarios) {
        usuarioService.save(usuarios);
        return "redirect:/usuarios/lista";
    }
    
    @GetMapping("/cliente/modificar/{idCliente}")
    
    public String modificarUsuario(Usuario usuario, Model model) {
        usuario = usuarioService.getUsuario(usuario);
        model.addAttribute("usuarios", usuario);
        return "/usuario/modificar";
    }

    @GetMapping("/usuario/eliminar/{idUsuarios}")
    public String eliminarUsuario(Usuario usuarios) {
        usuarioService.delete(usuarios);
        return "redirect:/usuarios/lista";
    }
            
}
