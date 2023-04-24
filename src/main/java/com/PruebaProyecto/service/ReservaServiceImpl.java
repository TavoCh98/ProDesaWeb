
package com.PruebaProyecto.service;



import com.PruebaProyecto.domain.Reserva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.PruebaProyecto.dao.ReservaDao;

@Service
public class ReservaServiceImpl implements ReservaService {
    
    @Autowired
    ReservaDao reservaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Reserva> getReservas() {
        return (List<Reserva>) reservaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Reserva reserva) {
        reservaDao.save(reserva);
    }

    @Override
    @Transactional
    public void delete(Reserva reserva) {
        reservaDao.deleteById(reserva.getIdReserva());
    }

   
    @Override
    @Transactional(readOnly = true)
    public Reserva getReserva(Reserva reserva) {
        return reservaDao.findById(reserva.getIdReserva()).orElse(null);
    }
}
