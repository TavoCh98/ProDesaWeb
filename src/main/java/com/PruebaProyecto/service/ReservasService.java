
package com.PruebaProyecto.service;

/**
 *
 * @author 0116960839$
 */

import com.PruebaProyecto.domain.Reservas;
import java.util.List;


public interface ReservasService {

    public List<Reservas> getReservas();
    
    public Reservas getReservas (Reservas reservas);
    
    public void save(Reservas reservas);
    
    public void delete (Reservas reservas);  
}
