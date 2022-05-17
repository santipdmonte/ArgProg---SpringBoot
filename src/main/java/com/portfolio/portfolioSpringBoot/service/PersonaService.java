
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Personas;
import com.portfolio.portfolioSpringBoot.repository.PersonasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonasService{

    @Autowired
    public PersonasRepository persoRepo;
    
    @Override
    public List<Personas> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Personas per) {
      persoRepo.save(per);  
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Personas buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
}
