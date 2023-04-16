
package com.PruebaProyecto.dao;

/**
 *
 * @author 0116960839$
 */
import com.PruebaProyecto.domain.Atracciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtraccionesDao extends CrudRepository<Atracciones, Long> {
}
