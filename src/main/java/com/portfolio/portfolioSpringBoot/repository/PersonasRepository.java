
package com.portfolio.portfolioSpringBoot.repository;

import com.portfolio.portfolioSpringBoot.model.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasRepository extends JpaRepository <Personas, Long>{    
}
