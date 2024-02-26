package Biblioteca;

public class Revista extends materialL {
private double precio;


public Revista (String id, String titulo, String autor, String tematica, double precio) {
	super(id, titulo, autor, tematica);
	this.precio = precio;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}



//Fer constructor getter i setters.



//Funcio que calcula preu de comrra = unitats x precio
}
