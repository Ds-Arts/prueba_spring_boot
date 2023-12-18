package com.example.servicio;

import com.example.dao.IIndividuoDao;
import com.example.doman.Individuo;
import com.example.servicio.individuoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class individuoServicioImplementar implements individuoServicio{
    //estos utilizara servicio y no los Daos dao
    @Autowired
    private IIndividuoDao individuoDao;
    @Override
    //solo sea de lectura
    @Transactional(readOnly = true)
    public List<Individuo> listaIndividuos() {
        //recupera los objetos de tipo individuo que se estan utilizando
        return (List<Individuo>) individuoDao.findAll();
    }
    
    @Override
    //se insertanr datos solo transaccional
    @Transactional
    public void salvar(Individuo individuo) {
            individuoDao.save(individuo);
    }

    @Override
    @Transactional
    public void borrar(Individuo individuo) {
            individuoDao.delete(individuo);
    }
    @Transactional(readOnly =true)
    @Override
    public Individuo localizarIndividuo(Individuo individuo) {
        return individuoDao.findById(individuo.getId_individuo()).orElse(null);
    }
    
    
}
