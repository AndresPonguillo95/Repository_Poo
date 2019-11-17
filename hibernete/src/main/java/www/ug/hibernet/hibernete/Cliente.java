package www.ug.hibernet.hibernete;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="clientes")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name ="cliente_id")
	private long id ;
	@Column(name = "nombres")
	private String nombres;
	private String apellido;
	private  Date FechNac;
	private char EsActivo ;
	private String EstadoCivil;
	
	public Cliente() {
	}
	
	public Cliente(long id, String nombres, String apellido, Date fechNac, char esActivo, String estadoCivil) {
		
		this.id = id;
		this.nombres = nombres;
		this.apellido = apellido;
		this.FechNac = fechNac;
		this.EsActivo = esActivo;
		this.EstadoCivil = estadoCivil;
		
	}  
	
	public void imprimir() {
		System.out.println(nombres);
	}


	public Date getFechNac() {
		return FechNac;
	}

	public void setFechNac(Date fechNac) {
		FechNac = fechNac;
	}

	public char getEsActivo() {
		return EsActivo;
	}

	public void setEsActivo(char esActivo) {
		EsActivo = esActivo;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + ", apellido=" + apellido + ", FechNac=" + FechNac
				+ ", EsActivo=" + EsActivo + ", EstadoCivil=" + EstadoCivil + "]";
	}	

	
	
	
}
