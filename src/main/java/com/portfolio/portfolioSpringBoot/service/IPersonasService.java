
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Personas;
import java.util.List;


public interface IPersonasService {
    public List<Personas> verPersonas();
    public void crearPersona (Personas Per);
    public void borrarPersona (Long id);
    public Personas buscarPersona (Long id);
}
