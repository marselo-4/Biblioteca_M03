package Biblioteca;

import java.util.ArrayList;


public abstract class materialL {
private String id;	
private String titulo ;	
private String autor;	
private String tematica;	
private ArrayList<materialL> arraymaterialL = new ArrayList<materialL>();


//Fer constructor getter i setters.

public materialL (String id, String titulo, String autor, String tematica ) {
	this.id = id;
	this.titulo = titulo;
	this.autor = autor;
	this.tematica = tematica;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public String getAutor() {
	return autor;
}


public void setAutor(String autor) {
	this.autor = autor;
}


public String getTematica() {
	return tematica;
}


public void setTematica(String tematica) {
	this.tematica = tematica;
}


public ArrayList<materialL> getArraymaterialL() {
	return arraymaterialL;
}


public void setArraymaterialL(ArrayList<materialL> arraymaterialL) {
	this.arraymaterialL = arraymaterialL;
}

public void imprimir() {
	System.out.println("Id -->" + this.id);
	System.out.println("Titulo -->" + this.titulo);
	System.out.println("Autor -->" + this.autor);
	System.out.println("Tematica -->" + this.tematica);

}

}
