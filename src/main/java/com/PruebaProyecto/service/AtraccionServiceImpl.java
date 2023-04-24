
package com.PruebaProyecto.service;

import com.PruebaProyecto.domain.Atraccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.PruebaProyecto.dao.AtraccionDao;


@Service
public class AtraccionServiceImpl implements AtraccionService{
    
    @Autowired
    AtraccionDao atraccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Atraccion> getAtracciones() {
        return (List<Atraccion>) atraccionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Atraccion getAtraccion(Atraccion atraccion) {
        return atraccionDao.findById(atraccion.getIdAtracciones()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Atraccion atraccion) {
        atraccionDao.save(atraccion);
    }

    @Override
    @Transactional
    public void delete(Atraccion atraccion) {
        atraccionDao.deleteById(atraccion.getIdAtracciones());
    }
}
