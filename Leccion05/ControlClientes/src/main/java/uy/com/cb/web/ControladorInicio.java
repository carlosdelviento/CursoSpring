package uy.com.cb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import uy.com.cb.domain.Persona;
import uy.com.cb.servicio.PersonaService;


@Controller
@Slf4j
public class ControladorInicio {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var personas = personaService.listarPersonas();
		log.info("Ejecutando el controlador Spring MVC");
		model.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Persona persona) {
		return "modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		personaService.guardar(persona);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{idPersona}")
	public String editar(Persona persona, Model model) {
		persona = personaService.encontrarPersona(persona);
		model.addAttribute("persona", persona);
		return "modificar";
	}
	
	@GetMapping("/eliminar")
	public String eliminar(Persona persona) {
		personaService.eliminar(persona);
		return "redirect:/";
	}
}