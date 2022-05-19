
package com.portfolio.portfolioSpringBoot.Controller;

//import com.portfolio.portfolioSpringBoot.model.Domicilio;
import com.portfolio.portfolioSpringBoot.model.Educacion;
import com.portfolio.portfolioSpringBoot.model.Personas;
import com.portfolio.portfolioSpringBoot.model.Experiencias;
//import com.portfolio.portfolioSpringBoot.service.IDomicilioService;
import com.portfolio.portfolioSpringBoot.service.IEducacionService;
import com.portfolio.portfolioSpringBoot.service.IExperienciasService;
import com.portfolio.portfolioSpringBoot.service.IPersonasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    //---- Persona -----
    
    @Autowired
    private IPersonasService persoServ;
    
    @PostMapping ("/persona/new")
    public void agregarPersona (@RequestBody Personas pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping("/personas/ver")
    @ResponseBody
    public List<Personas> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/persona/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
       persoServ.borrarPersona(id);
    }
    
    
    //---- Educacion ----
    
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/educacion/new")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    @DeleteMapping ("/educacion/delete/{id}")
    public void borrarEducacion (@PathVariable Long id){
      eduServ.borrarEducacion(id);
    }
    
        //---- Experiencias ----
    
    @Autowired
    private IExperienciasService expeServ;
    
    @PostMapping ("/experiencia/new")
    public void agregarExperiencia (@RequestBody Experiencias expe){
        expeServ.crearExperiencia(expe);
    }
    
    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencias> verExperiencia(){
        return expeServ.verExperiencias();
    }
    
    @DeleteMapping ("/experiencia/delete/{id}")
    public void borrarExperiencia (@PathVariable Long id){
      expeServ.borrarExperiencia(id);
    }
    
    
    
    
    
    
    //----Domicilio ------
    
//    @Autowired
//    private IDomicilioService domServ;
//   
//    @PostMapping ("/new/domicilio")
//    public void agregarDomiiclio (@RequestBody Domicilio dom){
//        domServ.crearDomicilio(dom);
//    }
//    
//    @GetMapping("/ver/domicilio")
//    @ResponseBody
//    public List<Domicilio> verDomicilio(){
//        return domServ.verDomicilio();
//    }
//    
//    @DeleteMapping ("/delete/domicilio/{id}")
//    public void borrarDomicilio (@PathVariable Long id){
//       domServ.borrarDomicilio(id);
//    }
    
}