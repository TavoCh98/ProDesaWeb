package com.PruebaProyecto.service;

import com.PruebaProyecto.domain.Usuarios;
import java.util.List;


public interface UsuariosService {

    public List<Usuarios> getUsuarios();
    
    public Usuarios getUsuarios (Usuarios usuarios);
    
    public void save(Usuarios usuarios);
    
    public void delete (Usuarios usuarios);  
}
