
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Proyectos;
import java.util.List;

public interface IProyectoService {
 
    public List<Proyectos> verProyectos();
    public Proyectos crearProyecto (Proyectos Proy);
    public void borrarProyecto (Long id);
    public Proyectos buscarProyecto (Long id);
}
