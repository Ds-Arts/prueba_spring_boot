package com.example.web;

import lombok.*;

//gettters y setters
@Data
//objetos
@Builder
//constructores
@AllArgsConstructor
@NoArgsConstructor
public class register {
    private String nombre;
    private String apellido;
    private String  telefono;
    private String correo;
    private Integer edad;
    private String password;
}
