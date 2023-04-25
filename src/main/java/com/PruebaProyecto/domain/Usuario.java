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
@Table (name="usuarios")
public class Usuario implements Serializable {
    
     private static final long serialVersionUID = 1L;
     
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_usuarios")
    private Long idUsuarios;
    public String nombre;
    public String email;
    public String contrasena;
    public String rol;

    public Usuario() {
    }

    public Usuario(Long idUsuarios, String nombre, String email, String contrasena, String rol) {
        this.idUsuarios = idUsuarios;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
    }

   
}
