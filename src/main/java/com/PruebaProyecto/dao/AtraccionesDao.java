package com.PruebaProyecto.dao;


import com.PruebaProyecto.domain.Atracciones;
import org.springframework.data.repository.CrudRepository;


public interface AtraccionesDao extends CrudRepository<Atracciones, Long>{
    
}