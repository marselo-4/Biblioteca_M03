package Biblioteca;

import java.util.Scanner;

public class manejo {

	// Ha de modificar, borrar o afegir elements de lea arraylist suposo que buscant
	// per id.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Que quiere hacer añadir, eliminar o modificar un material");
		System.out.println("1--> Añadir");
		System.out.println("2--> Eliminar");
		System.out.println("3--> Modificar");
		int eleccion = scan.nextInt();
		if (eleccion == 1) {
			System.out.println("Eliga que tipo de material quiere añadir");
			System.out.println("1--> Libro");
			System.out.println("2--> Revista");
			System.out.println("3--> Articulo");
			int eleccion_2 = scan.nextInt();
			if (eleccion_2 == 1) {

			} else if (eleccion_2 == 2) {

			} else if (eleccion_2 == 3) {

			} else {
				System.out.println("Opcion no valida");
			}

		} else if (eleccion == 2) {

		} else if (eleccion == 3) {

		} else {
			System.out.println("Opcion no valida");
		}

	}

	public static void añadirLibro() {
		Scanner scan_String = new Scanner(System.in);
		Scanner scan_num = new Scanner(System.in);
		

		System.out.println("Introduzca id del libro");
		String id = scan_String.nextLine();
		System.out.println("Introduzca titulo del libro");
		String titulo = scan_String.nextLine();
		System.out.println("Introduzca autor del libro");
		String autor = scan_String.nextLine();
		System.out.println("Introduzca tematica del libro");
		String tematica = scan_String.nextLine();
		System.out.println("Introduzca true o false si el libro esta reservado o no");
		boolean reservado = scan_String.nextBoolean();
		//Libro  = new Libro(id, titulo, autor, tematica, reservado);

	}
	

}
