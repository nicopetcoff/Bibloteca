package Modelo;

public class Prestamo {
	
	private Socio socio;
	private Ejemplar ejemplar;
	private int fechaRetiro;
	private int fechaDevolucion;
	private int categoriaPrestamoDias;	
	private boolean demorado;
	
	public Prestamo(Socio socio, Ejemplar ejemplar, int fechaRetiro, int fechaDevolucion) {
		this.socio = socio;
		this.ejemplar = ejemplar;
		this.fechaRetiro = fechaRetiro;
		this.fechaDevolucion = fechaDevolucion;
		
	}
	
	

}
