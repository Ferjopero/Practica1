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
public class MostrarPersonalPorTipoController {

	@Autowired
	private PersonalRepository repositorioPersonal;

	@RequestMapping("/mostrarPorTipo")
	public String mostrar(@RequestParam String tipo, Model model) {

		List<Personal> variosPersonal = repositorioPersonal.findAllByTipo(tipo);

	    model.addAttribute("personalList", variosPersonal);

		return "mostrar";
	}
}