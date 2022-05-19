
package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_habilidades;
    private String nombre_habilidad;
    private String descripcion_habilidad;
    private Long rango;
    private Long personas_id_persona;
    
    
    public Habilidades(){
    }

    public Habilidades(Long id_habilidades, String nombre_habilidad, String descripcion_habilidad, Long rango, Long personas_id_persona) {
            this.id_habilidades = id_habilidades;
            this.nombre_habilidad = nombre_habilidad;
            this.descripcion_habilidad = descripcion_habilidad;
            this.rango = rango;
            this.personas_id_persona = personas_id_persona;
    }     
}
