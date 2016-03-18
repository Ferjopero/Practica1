package tablon.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Especie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String tipo;
	private String nombreComun;
	private String nombreCientifico;
	private Collection<Area> areas;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return this.nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public Collection<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(Collection<Area> areas) {
		this.areas = areas;
	}
	
	
	public void addArea(Area area){
		this.areas.add(area);
	}
	
	public void addArea(Collection<Area> areas){
		this.areas.addAll(areas);
	}
	
	@Override
	public String toString() {
		String mainString;
		mainString = "Especie [Id: " + id + ", Tipo: " + tipo + ", NombreComun: " + this.nombreComun + ", Nombre Cientifico: " + this.nombreCientifico + "Areas: ";
		
		boolean firstPassed = false; //Para dejarlo bonito
		Iterator<Area> it = this.areas.iterator();
		while(it.hasNext()){
			if(!firstPassed){
				mainString += it.next().toString();
				firstPassed = true;
			}
			else
				mainString += ", " + it.next().toString();
		}
		mainString += "]";
		return mainString;
	}

}