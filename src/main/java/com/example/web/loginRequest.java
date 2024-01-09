package com.example.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//gettters y setters
@Data
//objetos
@Builder
//constructores
@AllArgsConstructor
@NoArgsConstructor
//esta clase pedira las credenciales
public class loginRequest {
    String nombre;
    String password;
}
