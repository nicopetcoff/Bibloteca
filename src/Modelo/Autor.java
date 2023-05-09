package Modelo;

import java.util.ArrayList;

public class Autor {
	
	private String nombre;
	private int fechaNacimiento;
	private boolean estaVivo;
	private ArrayList<Libro> libros;
	
	
	public Autor(String nombre, int fechaNacimiento, boolean estaVivo) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.estaVivo= estaVivo;
		this.libros= new ArrayList<>();
	}
	
	public String getNombre() {		
		return nombre;
	}
	
	public void agregarLibro(Libro libro) {
		
		libros.add(libro);
	}
	
	public Libro soyEseLibro(String nombreLibro) {
		for (Libro libro : libros) {
			if (libro.getNombre().equals(nombreLibro)) {
				return libro;
			}
		}
		return null;
	}
	
	public ArrayList getLibros() {
		return libros;
	}
	
	

}
