
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.AcercaDe;
import com.portfolio.portfolioSpringBoot.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService{

    @Autowired
    public AcercaDeRepository acerRepo;   
    
    @Override
    public List<AcercaDe> verAcercaDe() {
        return acerRepo.findAll();
    }

    @Override
    public AcercaDe crearAcercaDe(AcercaDe acer) {
        return acerRepo.save(acer);
    }

    @Override
    public void borrarAcercaDe(Long id) {
        acerRepo.deleteById(id);
    }

    @Override
    public AcercaDe buscarAcercaDe(Long id) {
        return acerRepo.findById(id).orElse(null);
    }
    
}
