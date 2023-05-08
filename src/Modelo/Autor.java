package Modelo;


public class Autor {
	
	private String nombre;
	private int fechaNacimiento;
	private boolean estaVivo;
	
	
	public Autor(String nombre, int fechaNacimiento, boolean estaVivo) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.estaVivo= estaVivo;
	}
	
	public String getNombre() {
		
		return nombre;
	}

}
