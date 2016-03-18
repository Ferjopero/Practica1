package tablon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tablon.model.Especie;


public interface EspecieRepository extends JpaRepository<Especie, Long> {

	List<Especie> findByAsunto(String asunto);

}
