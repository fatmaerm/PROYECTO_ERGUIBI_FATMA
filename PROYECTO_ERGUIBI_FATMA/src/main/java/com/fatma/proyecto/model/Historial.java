package com.fatma.proyecto.model;

import java.util.HashSet;
import java.util.Set;

public class Historial {
	// atributos
	private Long nHistorial;
	private String descripcion;

	private Set<Alergia> alergias = new HashSet<>();

	// constructor
	public Historial() {
	}

	public Historial(Long nHistorial, String descripcion) {
		super();
		this.nHistorial = nHistorial;
		this.descripcion = descripcion;
	}

	// getters y setters
	public Long getnHistorial() {
		return nHistorial;
	}
	
	public void setnHistorial(Long nHistorial) {
		this.nHistorial = nHistorial;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Alergia> getAlergias() {
		return alergias;
	}

	public void setAlergias(Set<Alergia> alergias) {
		this.alergias = alergias;
	}

	// Método
	@Override
	public String toString() {
		return "Historial [nHistorial=" + nHistorial + ", descripcion=" + descripcion + "]";
	}

	public void mostrarHistorial() {
		System.out.println("Historial: " + nHistorial);
		System.out.println("Descripción: " + descripcion);

	}

}
