package Biblioteca;

import java.util.ArrayList;

public class Main {
	public static ArrayList<materialL> arraymaterialL = new ArrayList<>();

	public static void main(String[] args) {

		// Menu amb ifs o switch case o lo q sigui per nar fent les dif accions(imporar
		// un desde el projecte de BBDD y modificar)
	
Libro test1_libro = new Libro ("L00001", "titulo_generico1", "Perro sanche" , "politica", false);

Libro test2_libro = new Libro ("L00002", "titulo", "Perro sanche" , "gastronomia", true);

	
Articulo test1_articulo = new Articulo ("A00001", "titulo_generico2", "Pablo motos", "fantasia", true);

Revista test1_revista = new Revista ("R00001", "titulo_generico3", "Santi abascal", "gastronomia", 10.99);
arraymaterialL.add(test1_libro);
arraymaterialL.add(test1_articulo);
arraymaterialL.add(test1_revista);
arraymaterialL.add(test2_libro);


//		 

//		//Test Álvaro
//		Articulo a = new Articulo("1a", "berserk", "mi padre", "seinen", true);
//		
//		System.out.println("TEST DISPONIBLE");
//		a.disponible();
//		a.setDisponible(false);
//		System.out.println("TEST DISPONIBLE FALSO");
//		a.disponible();
//		
Revista r = new Revista("1b", "Revistzoca", "bazoka", "comedia", 3.5);
arraymaterialL.add(r);

//		System.out.println("CALCULAR PRECIO REVISTA");
//		System.out.println(r.calcularPrecio(4));
//		System.out.println("El precio era: " + r.getPrecio());
//		

		buscar.buscarMaterialnombre();
		buscar.buscarMaterialautor();
		buscar.buscarMaterialtematica();
	}
}
