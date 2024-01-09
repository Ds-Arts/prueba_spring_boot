package com.example.jwt;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
//filtros personalizados
public class jwtAutheticationFilter extends OncePerRequestFilter{
    //filtros relacionados al token
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        final String token = getTokenFromRequest(request);
        if (token == null) {
            filterChain.doFilter(request, response);
            return;
        }
        filterChain.doFilter(request, response);

    }

    private String getTokenFromRequest(HttpServletRequest request) {
        
        //encabezado el item con la propiedad de autentificacion
        final String authHeader=request.getHeader(HttpHeaders.AUTHORIZATION);
        //token empezara con Bearer
        if (StringUtils.hasText(authHeader) &&  authHeader.startsWith("bearer ")) {
            //si empieza con beraer a partir del caracter 7 se subtraera el token
            return authHeader.substring(7);
        }
        //si no no retorna nada
        return null;
    }

    
}
