
package com.portfolio.portfolioSpringBoot.Controller;

//import com.portfolio.portfolioSpringBoot.model.Domicilio;
import com.portfolio.portfolioSpringBoot.model.AcercaDe;
import com.portfolio.portfolioSpringBoot.model.Educacion;
import com.portfolio.portfolioSpringBoot.model.Personas;
import com.portfolio.portfolioSpringBoot.model.Experiencias;
import com.portfolio.portfolioSpringBoot.model.Habilidades;
import com.portfolio.portfolioSpringBoot.model.Proyectos;
import com.portfolio.portfolioSpringBoot.model.User;
import com.portfolio.portfolioSpringBoot.service.IAcercaDeService;
//import com.portfolio.portfolioSpringBoot.service.IDomicilioService;
import com.portfolio.portfolioSpringBoot.service.IEducacionService;
import com.portfolio.portfolioSpringBoot.service.IExperienciasService;
import com.portfolio.portfolioSpringBoot.service.IHabilidadService;
import com.portfolio.portfolioSpringBoot.service.IPersonasService;
import com.portfolio.portfolioSpringBoot.service.IProyectoService;
import com.portfolio.portfolioSpringBoot.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://portfolio-arg-programa.web.app/", maxAge = 3600)
@RestController
public class Controller {
    
    
    //User
    
    @Autowired
    private IUserService userServ;
    
    
    @PostMapping("/user/validar")
    @ResponseBody
    public boolean validarUser(@RequestBody User user){
       return userServ.validarUser(user);
    }
    
    @PostMapping ("/user/nuevo")
    public User agregarUsuario (@RequestBody User user){
        return userServ.agregarUsuario(user);
    }
    
    //@GetMapping("/user/traer")
    //@ResponseBody
    //public List<User> verUser(){
    //    return userServ.verUser();
    //}

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
    public Educacion agregarEducacion (@RequestBody Educacion edu){        
        return eduServ.crearEducacion(edu);
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
    public Experiencias agregarExperiencia (@RequestBody Experiencias expe){
        return expeServ.crearExperiencia(expe);
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
    
    
    
    
    
    
            //---- Habilidades ----
    
    @Autowired
    private IHabilidadService habServ;
    
    @PostMapping ("/habilidad/new")
    public Habilidades agregarHabilidad (@RequestBody Habilidades hab){
        return habServ.crearHabilidad(hab);
    }
    
    @GetMapping("/habilidad/ver")
    @ResponseBody
    public List<Habilidades> verHabilidad(){
        return habServ.verHabilidades();
    }
    
    @DeleteMapping ("/habilidad/delete/{id}")
    public void borrarHabilidad (@PathVariable Long id){
      habServ.borrarHabilidad(id);
    }
    
    
    
    
    
    
     //---- Proyectos ----
    
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping ("/proyecto/new")
    public Proyectos agregarProyecto (@RequestBody Proyectos proy){
        return proyServ.crearProyecto(proy);
    }
    
    @GetMapping("/proyecto/ver")
    @ResponseBody
    public List<Proyectos> verProyecto(){
        return proyServ.verProyectos();
    }
    
    @DeleteMapping ("/proyecto/delete/{id}")
    public void borrarProyecto (@PathVariable Long id){
      proyServ.borrarProyecto(id);
    }
    
        
     //---- Acerca De ----
    
    @Autowired
    private IAcercaDeService acerServ;
    
    @PostMapping ("/acercade/new")
    public AcercaDe agregarAcercaDe (@RequestBody AcercaDe acer){
        return acerServ.crearAcercaDe(acer);
    }
    
    @GetMapping("/acercade/ver")
    @ResponseBody
    public List<AcercaDe> verAcercaDe(){
        return acerServ.verAcercaDe();
    }
    
    @DeleteMapping ("/acercade/delete/{id}")
    public void borrarAcercaDe (@PathVariable Long id){
      acerServ.borrarAcercaDe(id);
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