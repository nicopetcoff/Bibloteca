package Controlador;

import java.util.ArrayList;
import java.util.Iterator;

import Modelo.*;

public class Bibloteca {
	
	
	ArrayList<Autor> autores;
	ArrayList<Socio> socios;
	
	
	public Bibloteca() {
		
		this.autores = new ArrayList<>();
		this.socios = new ArrayList<>();		
	}
	
	public void buscarLibroPorAutor(String nombreAutor) {
		
		for (Autor a: autores) {
			if(a.getNombre().equals(nombreAutor)) {
				for (int i = 0; i < a.getLibros().size(); i++) {
					System.out.println(a.getLibros().get(i));
				}
			}
		}

	}
	
		
	public Libro buscarLibroPorNombre(String nombreLibro) {
		
		for(Autor a:autores) {
			if (!a.soyEseLibro(nombreLibro).equals(null)) {
				return a.soyEseLibro(nombreLibro);
			}
		}
			
		return null;
		
	}
	
	public void crearPrestamo(Libro libro, Socio socio, int fechaRetiro, int fechaDevolucion) throws Exception {		
		
		
		Ejemplar e = traemeEjemplares(libro);
		if (e.equals(null)) {
			throw new Exception("No hay Ejemplares de ese Libro");
		}
		
		socio.AgregarPrestamos(new Prestamo(socio, e, fechaRetiro, fechaDevolucion));	
		
		
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
	
	public Socio soyEseSocio(int nroSocio) {
		for (Socio s: socios) {
			if(s.getNroSocio() == nroSocio) {
				return s;
			}
			
		}
		return null;
	}
	
	
	


}
