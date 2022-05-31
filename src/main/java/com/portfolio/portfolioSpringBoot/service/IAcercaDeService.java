
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.AcercaDe;
import java.util.List;
   
public interface IAcercaDeService {
    
    public List<AcercaDe> verAcercaDe();
    public AcercaDe crearAcercaDe (AcercaDe acer);
    public void borrarAcercaDe (Long id);
    public AcercaDe buscarAcercaDe (Long id);
}
