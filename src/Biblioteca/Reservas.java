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
	
}

private static void cancelarReserva() {
	
}

private static void historialReservas() {
	
}

private static void mostrarReservas() {
	for (int i = 0; i < Main.arraymaterialL.size(); i++) {
		
	}
}

}//Fin clase
