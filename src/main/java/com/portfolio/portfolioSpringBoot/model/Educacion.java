
package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_educacion;
    private String institucion_edu;
    private String descripcion_edu;
    private String url_foto_edu;
    
    // @ManyToOne  si seria signacion muchos a uno
    // @JoinColumn   
    private String personas_id_persona;
    
    public Educacion(){
    }
    
    public Educacion (Long id_educacion, String institucion_edu, String descripcion_edu, String url_foto_edu, String personas_id_persona) {
        this.id_educacion = id_educacion;
        this.institucion_edu = institucion_edu;
        this.descripcion_edu = descripcion_edu;
        this.url_foto_edu = url_foto_edu;
        this.personas_id_persona = personas_id_persona;
    }     
}
