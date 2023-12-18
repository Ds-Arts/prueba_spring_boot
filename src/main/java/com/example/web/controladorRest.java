package com.example.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.doman.Individuo;
import com.example.servicio.individuoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class controladorRest {
    
    @Autowired
    private individuoServicio individuoServicio;
    
    @GetMapping("/")
    public String comienzo(Model model){
        
        List<Individuo> individuos = individuoServicio.listaIndividuos();
        log.info("estoy ejecutando el controlador spring mvc");
        model.addAttribute("individuos", individuos);
        return "indice";
    }
    @GetMapping("/anexar")
    public String anexar(Individuo individuo){
        return "cambiar";
    }

    @PostMapping("/salvar")
    public String salvar(Individuo individuo){
        individuoServicio.salvar(individuo);
        return "redirect:/";
    }

    @GetMapping("/cambiar/{id_individuo}")
    public String cambiar (Individuo individuo , Model model){
        individuo = individuo = individuoServicio.localizarIndividuo(individuo);
        model.addAttribute("individuo", individuo);
        return "cambiar";
    }

}
