
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Experiencias;
import java.util.List;

public interface IExperienciasService {
    
    public List<Experiencias> verExperiencias();
    public void crearExperiencia (Experiencias Expe);
    public void borrarExperiencia (Long id);
    public Experiencias buscarExperiencia (Long id);
}
