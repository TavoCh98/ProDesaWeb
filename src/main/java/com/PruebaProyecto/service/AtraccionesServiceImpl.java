
package com.PruebaProyecto.service;

import com.PruebaProyecto.dao.AtraccionesDao;
import com.PruebaProyecto.domain.Atracciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AtraccionesServiceImpl implements AtraccionesService{
    
    @Autowired
    AtraccionesDao atraccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Atracciones> getAtracciones() {
        return (List<Atracciones>) atraccionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Atracciones getAtraccion(Atracciones atracciones) {
        return atraccionDao.findById(atracciones.getIdAtracciones()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Atracciones atracciones) {
        atraccionDao.save(atracciones);
    }

    @Override
    @Transactional
    public void delete(Atracciones atracciones) {
        atraccionDao.deleteById(atracciones.getIdAtracciones());
    }
}
