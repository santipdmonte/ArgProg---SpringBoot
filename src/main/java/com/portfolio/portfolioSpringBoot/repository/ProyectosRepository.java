
package com.portfolio.portfolioSpringBoot.repository;

import com.portfolio.portfolioSpringBoot.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
