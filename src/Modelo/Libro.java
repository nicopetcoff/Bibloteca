package Modelo;

import java.util.ArrayList;

import Modelo.Enum.*;

public class Libro {
	
	private Autor autor;
	private int fechaEdicion;
	private String nombre;
	private Idioma idioma;
	private String resenia;
	ArrayList<Ejemplar> ejemplares;
	
	public Libro(Autor autor, int fechaEdicion, String nombre, Idioma idioma, String resenia,
			ArrayList<Ejemplar> ejemplares) {
		super();
		this.autor = autor;
		this.fechaEdicion = fechaEdicion;
		this.nombre = nombre;
		this.idioma = idioma;
		this.resenia = resenia;
		this.ejemplares = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public ArrayList<Ejemplar> getEjemplares() {
		return ejemplares;
	}
	
	public void agregarEjemplar(int fechaEdicion, TipoEncuadernacion tipoEncuadernacion
			, Idioma idioma) {
	Ejemplar ej = new Ejemplar(fechaEdicion, tipoEncuadernacion, idioma);
	
	ejemplares.add(ej);
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", fechaEdicion=" + fechaEdicion + ", nombreLibro=" + nombre + ", idioma=" + idioma
				+ ", resenia=" + resenia + ", ejemplares=" + ejemplares + "]";
	}
	
	

}
