package com.PruebaProyecto.domain;


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
@Table (name="reservas")
public class Reserva implements Serializable {
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;
    int fechaLlegada;
    
    @JoinColumn(name="id_usuarios", referencedColumnName = "id_usuarios")
    @ManyToOne
    private Usuario usuario;


    public Reserva() {
    }

    public Reserva(Long idReserva, int fechaLlegada) {
        this.idReserva = idReserva;
        this.fechaLlegada = fechaLlegada;
    }
}
