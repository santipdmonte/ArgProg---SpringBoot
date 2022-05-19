
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Habilidades;
import com.portfolio.portfolioSpringBoot.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    public HabilidadesRepository habRepo;
        
    @Override
    public List<Habilidades> verHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidades Hab) {
        habRepo.save(Hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        return habRepo.findById(id).orElse(null);
    }
    
}
