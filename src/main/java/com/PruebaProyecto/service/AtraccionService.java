package com.PruebaProyecto.service;


import com.PruebaProyecto.domain.Atraccion;
import java.util.List;


public interface AtraccionService {

    public List<Atraccion> getAtracciones();
    
    public Atraccion getAtraccion (Atraccion atraccion);
    
    public void save(Atraccion atraccion);
    
    public void delete (Atraccion atraccion);  
}

