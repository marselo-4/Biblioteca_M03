package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class buscar {

//Ha de iterar per totes les arraylist de los diferents objectes y quan en troba un prinetar.

	public static void buscarMaterialnombre() {
		boolean encontrado = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el nombre del material que quiere buscar");
		String nombre = scan.nextLine();

		for (materialL m : Main.arraymaterialL) {
			if (nombre.equals(m.getTitulo())) {
				System.out.println("-------------------");
				m.imprimir();
				encontrado = true;
				System.out.println("-------------------");
			} 
			}
		if (!encontrado){
			System.out.println("No se ha encontrado nada");
		}

	}

	public static void buscarMaterialautor() {
		boolean encontrado = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el autor del material que quiere buscar");
		String autor = scan.nextLine();

		for (materialL m : Main.arraymaterialL) {
			if (autor.equals(m.getAutor())) {
				System.out.println("-------------------");
				m.imprimir();
				System.out.println("-------------------");
				encontrado = true;
			} 
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado nada");
		}
	}

	public static void buscarMaterialtematica() {
		boolean encontrado = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca la tematica del material que quiere buscar");
		String tematica = scan.nextLine();

		for (materialL m : Main.arraymaterialL) {
			if (tematica.equals(m.getTematica())) {
				System.out.println("-------------------");
				m.imprimir();
				System.out.println("-------------------");
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado nada");
		}
	}
}
