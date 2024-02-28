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
				añadirLibro();
			} else if (eleccion_2 == 2) {
				añadirRevista();
			} else if (eleccion_2 == 3) {
				añadirArticulo();
			} else {
				System.out.println("Opcion no valida");
			}

		} else if (eleccion == 2) {
			eliminarMaterialL();
		} else if (eleccion == 3) {
			modificarMaterialL();
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
		Libro l = new Libro(id, titulo, autor, tematica, reservado);
		Main.arraymaterialL.add(l);

	}

	public static void añadirRevista() {

		Scanner scan_String = new Scanner(System.in);
		Scanner scan_num = new Scanner(System.in);

		System.out.println("Introduzca id de la revista");
		String id = scan_String.nextLine();
		System.out.println("Introduzca el titulo de la revista");
		String titulo = scan_String.nextLine();
		System.out.println("Introduzca autor de la revista");
		String autor = scan_String.nextLine();
		System.out.println("Introduzca tematica de la revista");
		String tematica = scan_String.nextLine();
		System.out.println("Introduzca el precio de la revista");
		double precio = scan_num.nextDouble();
		Revista r = new Revista(id, titulo, autor, tematica, precio);
		Main.arraymaterialL.add(r);

	}

	public static void añadirArticulo() {
		Scanner scan_String = new Scanner(System.in);
		Scanner scan_num = new Scanner(System.in);

		System.out.println("Introduzca id del articulo");
		String id = scan_String.nextLine();
		System.out.println("Introduzca el titulo del articulo");
		String titulo = scan_String.nextLine();
		System.out.println("Introduzca autor del articulo");
		String autor = scan_String.nextLine();
		System.out.println("Introduzca tematica del articulo");
		String tematica = scan_String.nextLine();
		System.out.println("Introduzca disponibilidad del articulo");
		boolean disponible = scan_String.nextBoolean();
		Articulo a = new Articulo(id, titulo, autor, tematica, disponible);
		Main.arraymaterialL.add(a);

	}

	public static void eliminarMaterialL() {
		Scanner scan_String = new Scanner(System.in);

		System.out.println("Indique el id del producto que quiere eliminar de la biblioteca");
		String id_eliminar = scan_String.nextLine();
		for (materialL m : Main.arraymaterialL) {
			if (id_eliminar.equals(m.getId())) {
				Main.arraymaterialL.remove(m);
				break;
			}
		}
	}

	public static void modificarMaterialL() {
		System.out.println("Indica el id del producto que desea modificar");
		Scanner scan_String = new Scanner(System.in);
		String id_modi = scan_String.nextLine();

		for (materialL m : Main.arraymaterialL) {
			if (id_modi.equals(m.getId())) {
				m.editar();

			}
		}

	}
}
