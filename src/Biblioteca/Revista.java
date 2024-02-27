package Biblioteca;

public class Revista extends materialL {
	private double precio;

//Fer constructor getter i setters.

	public Revista(String id, String titulo, String autor, String tematica, double precio) {
		super(id, titulo, autor, tematica);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

//Funcio que calcula preu de comrra = unitats x precio

	public double calcularPrecio(int unidades) {
		double precioTotal = 0;

		precioTotal = this.precio * unidades;
		return precioTotal;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Precio -->  " + this.precio);
	}
}
