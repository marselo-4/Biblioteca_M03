package Biblioteca;

public class Libro extends materialL {
	
private boolean reservado;
	

public Libro (String id, String titulo, String autor, String tematica, boolean reservado) {
	super(id, titulo, autor, tematica);
	this.reservado = reservado;
	
}


public boolean isReservado() {
	return reservado;
}


public void setReservado(boolean reservado) {
	this.reservado = reservado;
}
}


//Fer constructor(super) getters, setters 


//Fucnio per reservar osea que cambio el boolean de false a true.

