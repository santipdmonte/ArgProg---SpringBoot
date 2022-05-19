
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Experiencias;
import com.portfolio.portfolioSpringBoot.repository.ExperienciasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciasService{

    @Autowired
    public ExperienciasRepository expeRepo;
    
    @Override
    public List<Experiencias> verExperiencias() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencias Expe) {
        expeRepo.save(Expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencias buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }
    
}
