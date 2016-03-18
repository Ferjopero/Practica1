package tablon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tablon.model.Personal;
import tablon.repository.PersonalRepository;

@Controller
public class InsertarPersonalController {

	@Autowired
	private PersonalRepository repositorioPersonal;

	@RequestMapping("/insertarPersonal")
	public String insertar(@RequestParam long id, @RequestParam String nombre,@RequestParam String apellidos, @RequestParam String email, @RequestParam String fijo, @RequestParam String movil, Model model) {

        Personal personal = new Personal();
        
        personal.setId(id);
        personal.setNombre(nombre);
        personal.setApellidos(apellidos);
        personal.setEmail(email);
        personal.setFijo(fijo);
        personal.setMovil(movil);
        
		repositorioPersonal.save(personal);

		//return "insertarPersonal";
		return "insertar";
	}
}