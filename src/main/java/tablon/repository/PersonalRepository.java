package tablon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tablon.model.Personal;
import tablon.model.Personal;


public interface PersonalRepository extends JpaRepository<Personal, Long> {

	Personal findById(long id);
	
	//Obtiene la lista de personas ordenada por orden ascendente del atributo usuario
	List<Personal> findAllByOrderByIdAsc();

	List<Personal> findAllByTipo(String tipo);
	List<Personal> findAllByApellido(String apellido);
	List<Personal> findAllByNombreAndApellido(String nombre, String apellido);

	
}
