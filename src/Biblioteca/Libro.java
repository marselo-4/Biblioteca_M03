package Biblioteca;

import java.util.Scanner;

public class Libro extends materialL {

	private boolean reservado;

	public Libro(String id, String titulo, String autor, String tematica, boolean reservado) {
		super(id, titulo, autor, tematica);
		this.reservado = reservado;

	}

	public boolean getReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Reservado --> " + this.reservado);
	}
	
	@Override
	public void editar() {
		Scanner scan_String = new Scanner(System.in);
		super.editar();
		System.out.println("Indica de nuevo si esta reservado, estado actual --> " + this.reservado);
		boolean reservado_nuevo = scan_String.nextBoolean();
		setReservado(reservado_nuevo);
	}
}

