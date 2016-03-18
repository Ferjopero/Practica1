package tablon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablon.model.Personal;
import tablon.repository.PersonalRepository;

@Controller
public class MostrarAnunciosPorPersonalController {

	@Autowired
	private PersonalRepository repositorioPersonal;

	
	@RequestMapping("/mostrarPorPersona")
	public String mostrar(Model model) {

		List<Personal> pList = repositorioPersonal.findAll();

    	model.addAttribute("personalList", pList);

		return "mostrarPersonal";
	}
	
	@RequestMapping("/mostrarPorPersona")
	public String mostrar(@RequestParam String nombre, Model model) {

		List<Personal> pList = repositorioPersonal.findAllByNombre(nombre);

    	model.addAttribute("personalList", pList);

		return "mostrarPersonal";
	}
	
	@RequestMapping("/mostrarPorPersona")
	public String mostrar(@RequestParam String nombre, @RequestParam String apellido, Model model) {

		List<Personal> pList = repositorioPersonal.findByNombreAndApellido(nombre, apellido);

    	model.addAttribute("personalList", pList);

		return "mostrarPersonal";
	}
	
	
	
}