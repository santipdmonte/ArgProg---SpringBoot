package com.portfolio.portfolioSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;
    public String user_name;
    public String user_password;
    private String rol;
    private Long personas_id_persona;
    
    
    public User(){
    }

    public User(Long id_user, String user_name, String user_password,String rol, Long personas_id_persona) {
    this.id_user = id_user;
    this.user_name = user_name;
    this.user_password = user_password;
    this.rol = rol;
    this.personas_id_persona = personas_id_persona;
    }     
    
}
