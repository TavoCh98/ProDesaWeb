
package com.PruebaProyecto.dao;

/**
 *
 * @author 0116960839$
 */

import com.PruebaProyecto.domain.ReservasAtracciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservasAtraccionesDao extends CrudRepository<ReservasAtracciones, Long> {
}
