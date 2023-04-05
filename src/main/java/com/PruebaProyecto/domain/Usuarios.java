package com.PruebaProyecto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table (name="usuarios")
public class Usuarios implements Serializable {
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuarios;
    public String nombre;
    public String apellidos;
    public String email;
    public String contraseña;

    public Usuarios() {
    }

    public Usuarios(Long idUsuarios, String nombre, String apellidos, String email, String contraseña) {
        this.idUsuarios = idUsuarios;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.contraseña = contraseña;
    }
    
    
}
