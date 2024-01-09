package com.example.doman;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//con esta etiqueta se hacen getter y setters
@Data

@Entity
//nombre d ela tabla de nuestra base de datos

@Table(name="individuo")
public class Individuo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idindividuo")
    private long id_individuo;
    private String nombre;
    private String apellido;
    private String  telefono;
    private String correo;
    private Integer edad;
    private String password;
}
