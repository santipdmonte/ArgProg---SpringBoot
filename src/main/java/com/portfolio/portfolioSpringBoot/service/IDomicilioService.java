
package com.portfolio.portfolioSpringBoot.service;

import com.portfolio.portfolioSpringBoot.model.Domicilio;
import java.util.List;


public interface IDomicilioService {    
    public List<Domicilio> verDomicilio();
    public void crearDomicilio(Domicilio dom);
    public void borrarDomicilio(Long id);
    public Domicilio buscarDomicilio(Long id); 
}
