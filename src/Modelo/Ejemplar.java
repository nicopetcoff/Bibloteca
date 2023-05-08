package Modelo;

import Modelo.Enum.*;

public class Ejemplar {
	
	private int nroEjemplar;
	private static int nroEjemplarSiguiente=1;
	private int anioEdicion;
	private TipoEncuadernacion tipoEncuadernacion; 
	private Idioma idioma;
	private boolean enUso;
	
	public Ejemplar(int anioEdicion, TipoEncuadernacion tipoEncuadernacion, Idioma idioma) {
		
		this.nroEjemplar = nroEjemplarSiguiente;
		nroEjemplarSiguiente++;
		this.anioEdicion = anioEdicion;
		this.tipoEncuadernacion = tipoEncuadernacion;
		this.idioma = idioma;
		this.enUso= false;
	}
	
	public boolean enUso() {
		return enUso;
	}
	public void cambiarALibre() {
		this.enUso= false;
	}
	
	public void cambiarAAlquilado() {
		this.enUso= true;
	}

}
