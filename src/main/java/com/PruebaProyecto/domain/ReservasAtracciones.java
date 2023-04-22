package com.PruebaProyecto.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name="reservas_atracciones")
public class ReservasAtracciones implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reservas_atracciones")
    private Long idReservasAtracciones;
    
    @JoinColumn(name="id_atracciones", referencedColumnName = "id_atracciones")
    @ManyToOne
    private Atracciones atracciones;
    
    @JoinColumn(name="id_reservas", referencedColumnName = "id_reservas")
    @ManyToOne
    private Reservas reservas;

    public ReservasAtracciones() {
    }
}