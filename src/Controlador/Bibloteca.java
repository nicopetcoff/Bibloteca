package Controlador;

import java.util.ArrayList;
import java.util.Iterator;

import Modelo.*;

public class Bibloteca {
	
	ArrayList<Libro> libros;
	ArrayList<Autor> autores;
	ArrayList<Socio> socios;
	ArrayList<Prestamo> prestamos;
	public Bibloteca() {
		
		this.libros = new ArrayList<>();
		this.autores = new ArrayList<>();
		this.socios = new ArrayList<>();
		this.prestamos = new ArrayList<>();
	}
	
	public Libro buscarLibroPorNombre(String nombrel) {
		
		for(Libro l: libros) {
			if (l.getNombre().equals(nombrel)) {
				return l;
			}
		}
			return null;
	}
	
	public Libro buscarLibroPorAutor(String nombreAutor) {
		
		for(Libro l: libros) {
			if (l.getAutor().getNombre().equals(nombreAutor)) {
				return l;
			}
		}
			return null;
	}
	
	public void crearPrestamo(Libro libro, Socio socio, int fechaRetiro, int fechaDevolucion) throws Exception {		
		
		
		Ejemplar e = traemeEjemplares(libro);
		if (e.equals(null)) {
			throw new Exception("No hay Ejemplares de ese Libro");
		}
		
		prestamos.add(new Prestamo(socio, e, fechaRetiro, fechaDevolucion));	
		
		
	}
	
	private Ejemplar traemeEjemplares(Libro libro) {
		
		ArrayList<Ejemplar> ejemplares = libro.getEjemplares();
	
		for (Ejemplar ejemplar : ejemplares) {
			if (!ejemplar.enUso()) {
				return ejemplar;
			}
		}
		
		return null;		
	}
	


}
