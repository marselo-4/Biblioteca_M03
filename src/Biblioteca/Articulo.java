package Biblioteca;

import java.util.Scanner;

public class Articulo extends materialL {
	private boolean disponible;
	
//Fer constructor getter i setters.
	public Articulo(String id, String titulo, String autor, String tematica, boolean disponible) {
		super(id, titulo, autor, tematica);
		this.disponible = disponible;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

//Funcio amb ifs que depenen de si dispoible == true (.....) i si dispobible == false (......)

	public void disponible() {

		if (this.disponible) {
			System.out.println("El artículo está disponible");
		} else {
			System.out.println("Lamentablemente el artículo no está disponible");
			System.out.println("Puede contactar a " + this.getAutor() + " para más información");
		}
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Disponible --> " + this.disponible);
	}
	
	@Override
	public void editar() {
		Scanner scan_String = new Scanner(System.in);
		super.editar();
		System.out.println("Indica de nuevo si esta disponible, estado actual --> " + this.disponible);
		boolean disponible_nuevo = scan_String.nextBoolean();
		setDisponible(disponible_nuevo);
	}
}
