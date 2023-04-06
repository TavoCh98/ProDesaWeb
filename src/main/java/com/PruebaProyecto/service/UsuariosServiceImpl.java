package com.PruebaProyecto.service;

import com.PruebaProyecto.dao.UsuariosDao;
import com.PruebaProyecto.domain.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    UsuariosDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> getUsuarios() {
        return (List<Usuarios>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuarios getUsuarios(Usuarios usuarios) {
        return usuarioDao.findById(usuarios.getIdUsuarios()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Usuarios usuarios) {
        usuarioDao.save(usuarios);
    }

    @Override
    @Transactional
    public void delete(Usuarios usuarios) {
        usuarioDao.deleteById(usuarios.getIdUsuarios());
    }

}
