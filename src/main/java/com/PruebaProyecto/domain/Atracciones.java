
package com.PruebaProyecto.domain;

/**
 *
 * @author 0116960839$
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name="atracciones")
public class Atracciones implements Serializable {
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtracciones;


    public Atracciones() {
    }

    public Atracciones(Long idAtracciones) {
        this.idAtracciones = idAtracciones;
     
    }
}
