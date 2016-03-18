package tablon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Personal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String apellidos;
	private String email;
	private String fijo;
	private String movil;
	private String tipo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFijo() {
		return fijo;
	}
	
	public void setFijo(String fijo) {
		this.fijo = fijo;
	}
	
	public String getMovil() {
		return movil;
	}
	
	public void setMovil(String movil) {
		this.movil = movil;
	}

	@Override
	public String toString() {
		return "Persona [Id: " + id + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Email: " + email + "Fijo: " + fijo + "Movil: " + movil + "Tipo:" + tipo + "]";
	}
}
