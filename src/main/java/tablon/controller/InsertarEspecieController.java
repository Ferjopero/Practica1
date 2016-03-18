package tablon.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablon.model.Area;
import tablon.model.Especie;
import tablon.repository.EspecieRepository;

@Controller
public class InsertarEspecieController {

	@Autowired
	private EspecieRepository repositorioEspecies;

	@RequestMapping("/insertar")
	public String insertar(@RequestParam String tipo, @RequestParam String nombreComun, @RequestParam String nombreCientifico,
			Collection<Area> areas, Model model) {

		Especie a = new Especie();
		a.setTipo(tipo);
		a.setNombreComun(nombreComun);
		a.setNombreCientifico(nombreCientifico);
		a.setAreas(areas);
		
		repositorioEspecies.save(a);

		return "insertar";
	}

}