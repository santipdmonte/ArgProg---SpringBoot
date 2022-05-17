
package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Personas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_persona;
    private String nombre;
    private String apellido;
    private String acerca_de;
    
    
    public Personas(){
    }

    public Personas(Long id_persona, String nombre, String apellido,String acerca_de) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acerca_de = acerca_de;
    }     
}
