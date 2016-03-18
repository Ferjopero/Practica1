package tablon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tablonanuncios.repository.AnuncioRepository;

@Controller
public class TablonController {
	@Autowired
	private AnuncioRepository repositorioAnuncios;

	@RequestMapping("/")
	public String tablon(Model model) {

		model.addAttribute("anuncios", repositorioAnuncios.findAll());

		return "tablon";
	}

}