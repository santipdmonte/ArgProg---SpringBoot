
package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Domicilio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_domicilio;
    private String pais;
    private String provincia;
    private String direccion;
    private String persona_id_persona;
    
    public Domicilio(){
    }
    
    public Domicilio (Long id_domicilio, String pais, String provincia, String direccion, String persona_id_persona) {
        this.id_domicilio = id_domicilio;
        this.pais = pais;
        this.provincia = provincia;
        this.direccion = direccion;
        this.persona_id_persona = persona_id_persona;
    } 
    
}
