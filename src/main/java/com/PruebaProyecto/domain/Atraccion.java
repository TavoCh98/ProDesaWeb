package com.PruebaProyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "atracciones")
public class Atraccion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atracciones")
    private Long idAtracciones;
    private String nombre;
    private String descripcion;
    private double costo;

    public Atraccion() {
    }

    public Atraccion(Long idAtracciones, String nombre, String descripcion, double costo) {
        this.idAtracciones = idAtracciones;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }
}
