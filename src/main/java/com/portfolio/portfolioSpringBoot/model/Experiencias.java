
package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencias {
      
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_experiencias;
    private String nombre_expe;
    private String descripcion_expe;
    private String url_foto_expe;
    private Long personas_id_persona;
    
    
    public Experiencias(){
    }

    public Experiencias(Long id_experiencias, String nombre_expe, String descripcion_expe, String url_foto_expe, Long personas_id_persona) {
            this.id_experiencias = id_experiencias;
            this.nombre_expe = nombre_expe;
            this.descripcion_expe = descripcion_expe;
            this.url_foto_expe = url_foto_expe;
            this.personas_id_persona = personas_id_persona;
    }     
}
