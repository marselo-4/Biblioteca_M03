package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<materialL> arraymaterialL = new ArrayList<>();

	public static void main(String[] args) {
		boolean fin = false;
		Scanner scan = new Scanner(System.in);

		while (fin == false) {
			System.out.println("--------MENU--------");
			System.out.println("1--> Buscar material");
			System.out.println("2--> Manejar material");
			System.out.println("3--> Reservas");
			System.out.println("4--> Salir");
			System.out.println("--------MENU--------");

			int elección = scan.nextInt();

			if (elección == 1) {
				System.out.println("--------BUSCAR--------");
				System.out.println("1--> Buscar por titulo");
				System.out.println("2--> Buscar por autor");
				System.out.println("3--> Buscar por tematica");
				System.out.println("--------BUSCAR--------");
				int eleccion_buscar = scan.nextInt();
				if (eleccion_buscar == 1) {
					buscar.buscarMaterialnombre();
				} else if (eleccion_buscar == 2) {
					buscar.buscarMaterialautor();
				} else if (eleccion_buscar == 3) {
					buscar.buscarMaterialtematica();
				}

			} else if (elección == 2) {
				manejo.main(args);
			} else if (elección == 3) {
				Reservas.main(args);
			} else if (elección == 4) {
				System.out.println("Programa finalizado");
				fin = true;
			} else {
				System.out.println("Erorr 404 vuelva a elegir");
			}

		}
	}
}
//No permet eliminar contingut  java.util.ConcurrentModificationException
