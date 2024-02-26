package Biblioteca;

public class Articulo extends materialL{
private boolean disponible;

public Articulo (String id, String titulo, String autor, String tematica, boolean disponible) {
	super(id, titulo, autor, tematica);
	this.disponible = disponible;
	
}

public boolean isDisponible() {
	return disponible;
}

public void setDisponible(boolean disponible) {
	this.disponible = disponible;
} 

//Fer constructor getter i setters.



//Funcio amb ifs que depenen de si dispoible == true (.....) i si dispobible == false (......)
	
	
}
