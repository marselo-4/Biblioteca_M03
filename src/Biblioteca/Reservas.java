package Biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Reservas {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Que quiere hacer?");
	System.out.println("1--> Reservar un producto");
	System.out.println("2--> Cancelar reserva");
	System.out.println("3--> Ver reservas");
	
	
	boolean fin = false;
	while (!fin) {
		int eleccion = scan.nextInt();
		if (eleccion == 1) {
			reservar();
			mostrarReservas();
			fin = true;
		}else if (eleccion == 2) {
			cancelarReserva();
			fin = true;
		}else if (eleccion == 3) {
			historialReservas();
			fin = true;
		}else {
			System.out.println("Por favor, elija una opción válida");
		}
	}//Fin while

	}//Fin main

private static void reservar() {
	Libro l = new Libro ("L00001", "titulo_generico1", "Perro sanche" , "politica", false);	
	Articulo a = new Articulo ("A00001", "titulo_generico2", "Pablo motos", "fantasia", true);
	Libro l2 = new Libro ("L00001", "titulo_generico1", "Perro sanche" , "politica", false);	
	Main.arraymaterialL.add(a);

	Main.arraymaterialL.add(l);
	Main.arraymaterialL.add(l2);
	
}

private static void cancelarReserva() {
	
}

private static void historialReservas() {
	
}

private static void mostrarReservas() {
	for (materialL obj : Main.arraymaterialL) {
		System.out.println(obj);
		if (obj instanceof Libro) {
			Libro lib = (Libro) obj;
			//Si está reservado: mostrar nombre
			if (lib.getReservado()) {
				System.out.println("------------------------------");
				lib.imprimir();
				System.out.println("------------------------------");
			}
			
		}else if (obj instanceof Articulo) {
			Articulo art = (Articulo) obj;
			if (art.getDisponible()) {
				System.out.println("------------------------------");
				art.imprimir();
				System.out.println("------------------------------");
			}
		}

	}
}

}//Fin clase
