
package com.PruebaProyecto.service;

/**
 *
 * @author 0116960839$
 */

import com.PruebaProyecto.domain.ReservasAtracciones;
import java.util.List;


public interface ReservasAtraccionesService {

    public List<ReservasAtracciones> getReservasAtracciones();
    
    public ReservasAtracciones getReservasAtracciones (ReservasAtracciones reservasAtracciones);
    
    public void save(ReservasAtracciones reservasAtracciones);
    
    public void delete (ReservasAtracciones reservasAtracciones);  
}
