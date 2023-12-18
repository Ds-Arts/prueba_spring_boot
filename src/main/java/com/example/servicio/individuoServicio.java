package com.example.servicio;

import com.example.doman.Individuo;
import java.util.List;

public interface individuoServicio {
    
    public List<Individuo> listaIndividuos();
    
    public void salvar(Individuo individuo);
    
    public void borrar(Individuo individuo);
    
    public Individuo localizarIndividuo(Individuo individuo);
}
