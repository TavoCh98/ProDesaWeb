
package com.PruebaProyecto.dao;

import com.PruebaProyecto.domain.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaDao extends CrudRepository<Reserva, Long> {
}
