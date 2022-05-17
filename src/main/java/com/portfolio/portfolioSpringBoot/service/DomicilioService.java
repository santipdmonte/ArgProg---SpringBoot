
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Domicilio;
import com.portfolio.portfolioSpringBoot.repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService implements IDomicilioService{

    @Autowired
    public DomicilioRepository domRepo;
    
    @Override
    public List<Domicilio> verDomicilio() {
        return domRepo.findAll();
    }

    @Override
    public void crearDomicilio(Domicilio dom) {
        domRepo.save(dom);
    }

    @Override
    public void borrarDomicilio(Long id) {
        domRepo.deleteById(id);
    }

    @Override
    public Domicilio buscarDomicilio(Long id) {
        return domRepo.findById(id).orElse(null);
    }
    
}
