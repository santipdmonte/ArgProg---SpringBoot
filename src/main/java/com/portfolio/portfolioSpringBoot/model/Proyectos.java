
package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_proyectos;
    private String nombre_proyecto;
    private String descripcion_proyecto;
    private String url_proyecto;
    private String url_foto_proyecto;
    private Long personas_id_persona;
    
    
    public Proyectos(){
    }

    public Proyectos(Long id_proyectos, String nombre_proyecto, String descripcion_proyecto,String url_proyecto, String url_foto_proyecto, Long personas_id_persona) {
    this.id_proyectos = id_proyectos;
    this.nombre_proyecto = nombre_proyecto;
    this.descripcion_proyecto = descripcion_proyecto;
    this.url_proyecto = url_proyecto;
    this.url_foto_proyecto = url_foto_proyecto;
    this.personas_id_persona = personas_id_persona;
    }     
}
