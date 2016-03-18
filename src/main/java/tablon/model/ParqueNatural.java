package tablon.model;

import java.util.Collection;

public class ParqueNatural {
	private String nombre;
	private Collection<Area> areas;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Collection<Area> getAreas() {
		return areas;
	}

	public void setAreas(Collection<Area> areas) {
		this.areas = areas;
	}
	
}
