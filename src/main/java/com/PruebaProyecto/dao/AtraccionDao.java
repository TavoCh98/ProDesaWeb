package com.PruebaProyecto.dao;


import com.PruebaProyecto.domain.Atraccion;
import org.springframework.data.repository.CrudRepository;


public interface AtraccionDao extends CrudRepository<Atraccion, Long>{
    
}