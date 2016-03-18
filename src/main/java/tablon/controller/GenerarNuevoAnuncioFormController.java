package tablon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tablonanuncios.model.Persona;
import tablonanuncios.repository.PersonaRepository;

@Controller
public class GenerarNuevoAnuncioFormController {

	@Autowired
	private PersonaRepository repositorioPersonas;
	
	@RequestMapping("/nuevoAnuncio")
	public String insertar(Model model) {
		
		List<Persona> personas =repositorioPersonas.findAllByOrderByUsuarioAsc();
		
		model.addAttribute("personas", personas);
		
		return("nuevoAnuncio");
	}
}
