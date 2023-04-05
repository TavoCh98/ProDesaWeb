package com.PruebaProyecto.dao;

import com.PruebaProyecto.domain.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosDao extends CrudRepository<Usuarios, Long> {
}
