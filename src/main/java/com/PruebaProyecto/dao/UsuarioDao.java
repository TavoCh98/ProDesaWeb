package com.PruebaProyecto.dao;

import com.PruebaProyecto.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
}
