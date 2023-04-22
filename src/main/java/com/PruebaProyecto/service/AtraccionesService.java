package com.PruebaProyecto.service;


import com.PruebaProyecto.domain.Atracciones;
import java.util.List;


public interface AtraccionesService {

    public List<Atracciones> getAtracciones();
    
    public Atracciones getAtraccion (Atracciones atracciones);
    
    public void save(Atracciones atracciones);
    
    public void delete (Atracciones atracciones);  
}

