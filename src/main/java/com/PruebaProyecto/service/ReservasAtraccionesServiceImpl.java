
package com.PruebaProyecto.service;

import com.PruebaProyecto.dao.ReservasAtraccionesDao;
import com.PruebaProyecto.dao.ReservasDao;
import com.PruebaProyecto.domain.Reservas;
import com.PruebaProyecto.domain.ReservasAtracciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 0116960839$
 */

@Service
public class ReservasAtraccionesServiceImpl implements ReservasAtraccionesService{
    
    @Autowired
    ReservasAtraccionesDao reservaAtraccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<ReservasAtracciones> getReservasAtracciones() {
        return (List<ReservasAtracciones>) reservaAtraccionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ReservasAtracciones getReservasAtracciones(ReservasAtracciones reservasAtracciones) {
        return reservaAtraccionDao.findById(reservasAtracciones.getIdReservasAtracciones()).orElse(null);
    }

    @Override
    @Transactional
    public void save(ReservasAtracciones reservasAtracciones) {
        reservaAtraccionDao.save(reservasAtracciones);
    }

    @Override
    @Transactional
    public void delete(ReservasAtracciones reservasAtracciones) {
        reservaAtraccionDao.deleteById(reservasAtracciones.getIdReservasAtracciones());
    }
    
}
