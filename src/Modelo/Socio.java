package Modelo;

import java.util.ArrayList;

public class Socio {
	
	private String nombre;
	private int nroSocio;
	private static int nroSocioAnterior=1;
	private ArrayList<Prestamo> prestamos;
	
	
	
	public Socio(String nombre, int nroSocio, ArrayList<Prestamo> prestamos) {
		this.nombre = nombre;
		this.nroSocio = nroSocioAnterior;
		nroSocioAnterior++;
		this.prestamos = new ArrayList<>();
	}



	public void AgregarPrestamos(Prestamo prestamo) {		
		prestamos.add(prestamo);		
	}
	
	public int getNroSocio() {
		return nroSocio;
	}
	

}
