
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Habilidades;
import java.util.List;

public interface IHabilidadService {

    public List<Habilidades> verHabilidades();
    public void crearHabilidad (Habilidades Hab);
    public void borrarHabilidad (Long id);
    public Habilidades buscarHabilidad (Long id);
}
