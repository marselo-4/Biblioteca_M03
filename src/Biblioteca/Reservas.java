package Biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Reservas {
	private static Scanner scan = new Scanner(System.in);
	private static Scanner scan_s = new Scanner(System.in);
public static void main(String[] args) {
	
	
	Libro l = new Libro ("L00001", "titulo_generico1", "Perro sanche" , "pol2tica", true);	
	Articulo a = new Articulo ("A00001", "titulo_generico2", "Pablo2otos", "f2tasia", false);
	Libro l2 = new Libro ("L00021", "titulo_gener2co1", "Perro s2che" , "politica", true);	
	Main.arraymaterialL.add(a);
	Main.arraymaterialL.add(l);
	Main.arraymaterialL.add(l2);
	
	System.out.println("Que quiere hacer?");
	System.out.println("1--> Reservar un producto");
	System.out.println("2--> Cancelar reserva");
	System.out.println("3--> Ver reservas");
	
	
	boolean fin = false;
	while (!fin) {
		int eleccion = scan.nextInt();
		if (eleccion == 1) {
			reservar();
			fin = true;
		}else if (eleccion == 2) {
			cancelarReserva();
			fin = true;
		}else if (eleccion == 3) {
			mostrarReservas();
			fin = true;
		}else {
			System.out.println("Por favor, elija una opción válida");
		}
	}//Fin while

	}//Fin main

private static void reservar() {
	System.out.println("Quiere reservar un artículo o un libro?");
	String tipo = scan_s.nextLine().toUpperCase();
	if (tipo.equals("LIBRO")) {
		mostrarLibros();
	}else if (tipo.equals("ARTICULO")) {
		mostrarArticulos();
	}
	
}

private static void cancelarReserva() {
	
}


private static void mostrarReservas() {
    System.out.println("Mostrando reservas:");
    for (materialL obj : Main.arraymaterialL) {

        if (obj instanceof Libro) {
            Libro lib = (Libro) obj;
            if (lib.getReservado()) {
                System.out.println("------------------------------");
                lib.imprimir();
                System.out.println("------------------------------");
            }
        } else if (obj instanceof Articulo) {
            Articulo art = (Articulo) obj;
            if (art.getDisponible()) {
                System.out.println("------------------------------");
                art.imprimir();
                System.out.println("------------------------------");
            }
        }
    }
}

private static void mostrarArticulos() {

	System.out.println("Mostrando artículos: ");
	for (materialL obj : Main.arraymaterialL) {
		if (obj instanceof Articulo) {
            Articulo art = (Articulo) obj;
            if (!art.getDisponible()) {
                System.out.println("------------------------------");
                art.imprimir();
                System.out.println("------------------------------");
            }
        }
	}
}

private static void mostrarLibros() {
	System.out.println("Mostrando libros: ");
	for (materialL obj : Main.arraymaterialL) {
		if (obj instanceof Libro) {
            Libro lib = (Libro) obj;
            if (!lib.getReservado()) {
                System.out.println("------------------------------");
                lib.imprimir();
                System.out.println("------------------------------");
            }
        }
	}
}

}//Fin clase
