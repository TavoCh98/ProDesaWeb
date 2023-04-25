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
    
    @PostMapping("/usuarios/inicioSesion")
    public String inicio(Model model) {

        var usuario = usuarioService.getUsuarios();
        model.addAttribute("usuario", usuario);
        
        return "/usuarios/inicioSesion";
    }

    @GetMapping("/usuario/nuevo")
    public String nuevoUsuario(Usuario usuarios) {
        return "/usuario/modificar";
    }
   

    @PostMapping("/usuario/login")
    public String salvarUsuario(String email,String contrasena) {
        System.out.println(email);
        System.out.println(contrasena);
        Boolean exitos=false;
        var usuario = usuarioService.getUsuarios();
        for (Usuario us : usuario) {
            if(us.email.equals(email)&&us.contrasena.equals(contrasena)){
                exitos=true;
                break;
            }
        }
        if (exitos) {
            return "redirect:/";
        }
        return "redirect:/";  // aqui hay que redirigir a una pagina que diga que los datos no son validos
        //o bien que se recargue la pagina nada mas que no lo deje ir a otro lado 
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
