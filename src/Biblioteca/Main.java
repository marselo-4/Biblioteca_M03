package Biblioteca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Menu amb ifs o switch case o lo q sigui per nar fent les dif accions(imporar un desde el projecte de BBDD y modificar)
		
		Libro test1_libro = new Libro ("L00001", "titulo_generico", "Perro sanche" , "politica", false);
		
		Articulo test1_articulo = new Articulo ("A00001", "titulo_generico", "Pablo motos", "fantasia", true);
		
		Revista test1_revista = new Revista ("R00001", "titulo_generico", "Santi abascal", "gastronomia", 10.99);
		ArrayList<materialL> arraymaterialL = new ArrayList<>();
		arraymaterialL.add(test1_libro);
		 arraymaterialL.add(test1_articulo);
		 arraymaterialL.add(test1_revista);

	}
}
