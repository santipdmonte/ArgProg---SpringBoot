
package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_acerca_de;
    private String descripcion_acerca_de;
    private String tecnologias;
    private String url_foto_acerca_de;
    private Long personas_id_persona;
        
    public AcercaDe(){
    }
    
    public AcercaDe (Long id_acerca_de, String descripcion_acerca_de, String tecnologias,String url_foto_acerca_de,Long personas_id_persona) {
        this.id_acerca_de = id_acerca_de;
        this.descripcion_acerca_de = descripcion_acerca_de;
        this.tecnologias = tecnologias;
        this.url_foto_acerca_de = url_foto_acerca_de;
        this.personas_id_persona = personas_id_persona;
    } 
    
    
    
}
