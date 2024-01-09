package com.example.web;

//repsuesta del token
import lombok.*;

//gettters y setters
@Data
//objetos
@Builder
//constructores
@AllArgsConstructor
@NoArgsConstructor

public class authResponse {
    
    String token;

}
