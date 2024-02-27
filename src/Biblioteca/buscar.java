package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class buscar {

//Ha de iterar per totes les arraylist de los diferents objectes y quan en troba un prinetar.

	
	public static void buscarMaterialnombre () {
		
		 Scanner scan = new Scanner(System.in);		
		 System.out.println("Introduzca el nombre del material que quiere buscar");
		 String nombre = scan.nextLine();
		 
		 for(materialL m : Main.arraymaterialL) {
				if (nombre.equals(m.getTitulo())) {
					m.imprimir();
				}
			}
	}
	
	public static void buscarMaterialautor () {
		 Scanner scan = new Scanner(System.in);		
		 System.out.println("Introduzca el autor del material que quiere buscar");
		 String autor = scan.nextLine();
		 
		 for(materialL m : Main.arraymaterialL) {
				if (autor.equals(m.getAutor())) {
					m.imprimir();
				}
			}
	}
	
	public static void buscarMaterialtematica () {
		 Scanner scan = new Scanner(System.in);		
		 System.out.println("Introduzca la tematica del material que quiere buscar");
		 String tematica = scan.nextLine();
		 
		 for(materialL m : Main.arraymaterialL) {
				if (tematica.equals(m.getTematica())) {
					m.imprimir();
					System.out.println("--------------");
				}
			}
	}
}
