package Main;
import java.util.*;
import Controlador.*;
import Modelo.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		Bibloteca b = new Bibloteca();
		
		do {
			System.out.println("\t ¡Bienvenido a la Bibloteca! \n");
			System.out.println("Seleccione la opcion que desea");
			System.out.println("1.\t  Retirar un ejemplar determinado conociendo su título");
			opcion = sc.nextInt();
			
			switch(opcion){
				
				case 1:
					System.out.println("Diga el titulo del libro que busca");
					
					String titulo=sc.next();
					
					Libro l = b.buscarLibroPorNombre(titulo);
					
					System.out.println();
					
					break;
					
				default:
					break;
			}
			
		}
		while(opcion!=6);
		sc.close();
		

	}

}
