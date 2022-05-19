
package com.portfolio.portfolioSpringBoot.repository;

import com.portfolio.portfolioSpringBoot.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Long>{
    
}
