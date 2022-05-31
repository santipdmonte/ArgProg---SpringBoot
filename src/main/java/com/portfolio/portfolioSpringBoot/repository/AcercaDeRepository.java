
package com.portfolio.portfolioSpringBoot.repository;

import com.portfolio.portfolioSpringBoot.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository<AcercaDe, Long>{
    
}
