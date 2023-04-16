
package com.PruebaProyecto.service;

/**
 *
 * @author 0116960839$
 */

import com.PruebaProyecto.domain.Atracciones;
import java.util.List;


public interface AtraccionesService {

    public List<Atracciones> getAtracciones();
    
    public Atracciones getAtracciones (Atracciones atracciones);
    
    public void save(Atracciones atracciones);
    
    public void delete (Atracciones atracciones);  
}

