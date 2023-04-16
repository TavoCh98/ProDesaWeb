
package com.PruebaProyecto.service;

/**
 *
 * @author 0116960839$
 */

import com.PruebaProyecto.dao.ReservasDao;
import com.PruebaProyecto.domain.Reservas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservasServiceImpl implements ReservasService {
    
    @Autowired
    ReservasDao reservaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Reservas> getReservas() {
        return (List<Reservas>) reservaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Reservas reservas) {
        reservaDao.save(reservas);
    }

    @Override
    @Transactional
    public void delete(Reservas reservas) {
        reservaDao.deleteById(reservas.getIdReservas());
    }

   
    @Override
    @Transactional(readOnly = true)
    public Reservas getReservas(Reservas reservas) {
        return reservaDao.findById(reservas.getIdReservas()).orElse(null);
    }
}
