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
public class MostrarPersonalPorApellidoController {

	@Autowired
	private PersonalRepository repositorioPersonal;

	@RequestMapping("/mostrarPorApellido")
	public String mostrar(@RequestParam String apellido, Model model) {

		List<Personal> variosPersonal = repositorioPersonal.findAllByApellido(apellido);

	    model.addAttribute("personalList", variosPersonal);

		return "mostrar";
	}
}