package edu.uacm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * cuando alguien entre a la 'peticion sera redireccionado a 'redir'
 * http://localhost:8080/peticion/redir
 * 						/alumno/registro
 * 						/alumno/consulta
 * 
 * las peticiones se hacen desde una aplicacion 'summit'
 */

@Controller 
@RequestMapping("/peticion")
public class PeticionController {

	/* Los metodos POST NO se ven en la url
	 * el metodo GET si se ve en la url
	 */	
	@RequestMapping(value="/redir", method=RequestMethod.POST)
	public String redireccionar(){
		return "redirect:/redireccion.html"; //y lo que hace redirecciona a otra pagina
	}
}
