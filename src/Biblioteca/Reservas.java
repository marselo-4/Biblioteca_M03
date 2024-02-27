package Biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Reservas {
	private static Scanner scan = new Scanner(System.in);
	private static Scanner scan_s = new Scanner(System.in);
public static void main(String[] args) {
	
	
	Libro l = new Libro ("L00001", "titulo_generico1", "Perro sanche" , "pol2tica", true);	
	Articulo a = new Articulo ("A00001", "titulo_generico2", "Pablo2otos", "f2tasia", true);
	Libro l2 = new Libro ("L00002", "titulo_gener2co1", "Perro s2che" , "politica", false);	
	Articulo a2 = new Articulo ("A00002", "titulo_generico2", "Pablo2otos", "f2tasia", false);

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
	boolean finReserva = false;
	while (!finReserva) {
		System.out.println("Quiere reservar un artículo o un libro?");
		System.out.println("--> 'LIBRO'");
		System.out.println("--> 'ARTICULO'");
		String tipo = scan_s.nextLine().toUpperCase();
		if (tipo.equals("LIBRO")) {
			mostrarLibros(true);
			System.out.println("Qué libro desea reservar?");
			String idLibro = scan_s.nextLine();
			
			for (materialL obj : Main.arraymaterialL) {
				if (obj instanceof Libro) {
					Libro lib = (Libro) obj;
					if (lib.getId().equals(idLibro)) {
						lib.reservado(true);
					}
				}
			}
			
		}else if (tipo.equals("ARTICULO")) {
			mostrarArticulos(true);
			System.out.println("Qué artículo desea reservar?");
			String idArticulo = scan_s.nextLine();
			
			for (materialL obj : Main.arraymaterialL) {
				if (obj instanceof Articulo) {
					Articulo art = (Articulo) obj;
					if (art.getId().equals(idArticulo)) {
						art.setDisponible(false);
					}
				}
			}
		}
		
		System.out.println("Desea reservar algún producto más?");
		boolean a = false;
		while (!a) {
			String continuar = scan_s.nextLine().toUpperCase();
			if (continuar.equals("SI")) {
				reservar();
			}else if (continuar.equals("NO")) {
				
				Main.main(null);
				a = true;
				finReserva = true;
			}else {
				System.out.println("No te he entendido, vuelve a escribirlo");
			}
		}
	}
	
}

private static void cancelarReserva() {
	boolean finReserva = false;
	while (!finReserva) {
		System.out.println("Quiere cancelar la reserva de un artículo o un libro?");
		System.out.println("--> 'LIBRO'");
		System.out.println("--> 'ARTICULO'");
		String tipo = scan_s.nextLine().toUpperCase();
		if (tipo.equals("LIBRO")) {
			mostrarLibros(false);
			System.out.println("De qué libro desea cancelar la reserva?");
			String idLibro = scan_s.nextLine();
			
			for (materialL obj : Main.arraymaterialL) {
				if (obj instanceof Libro) {
					Libro lib = (Libro) obj;
					if (lib.getId().equals(idLibro)) {
						lib.reservado(false);
					}
				}
			}
			
		}else if (tipo.equals("ARTICULO")) {
			mostrarArticulos(false);
			System.out.println("De qué artículo desea cancelar la reserva?");
			String idArticulo = scan_s.nextLine();
			
			for (materialL obj : Main.arraymaterialL) {
				if (obj instanceof Articulo) {
					Articulo art = (Articulo) obj;
					if (art.getId().equals(idArticulo)) {
						art.setDisponible(true);
					}
				}
			}
		}
		
		System.out.println("Desea cancelar alguna reserva más?");
		boolean a = false;
		while (!a) {
			String continuar = scan_s.nextLine().toUpperCase();
			if (continuar.equals("SI")) {
				cancelarReserva();
			}else if (continuar.equals("NO")) {
				
				Main.main(null);
				a = true;
				finReserva = true;
			}else {
				System.out.println("No te he entendido, vuelve a escribirlo");
			}
		}
	}
	

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

private static void mostrarArticulos(boolean reserva) {
	if (reserva) {
		System.out.println("Mostrando artículos: ");
		for (materialL obj : Main.arraymaterialL) {
			if (obj instanceof Articulo) {
	            Articulo art = (Articulo) obj;
	            if (art.getDisponible()) {
	                System.out.println("------------------------------");
	                art.imprimir();
	                System.out.println("------------------------------");
	            }
	        }
		}
	}else {
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
}

private static void mostrarLibros(boolean reserva) {
	if (reserva) {
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
	}else {
		System.out.println("Mostrando libros: ");
		for (materialL obj : Main.arraymaterialL) {
			if (obj instanceof Libro) {
	            Libro lib = (Libro) obj;
	            if (lib.getReservado()) {
	                System.out.println("------------------------------");
	                lib.imprimir();
	                System.out.println("------------------------------");
	            }
	        }
		}
	}
}

}//Fin clase
