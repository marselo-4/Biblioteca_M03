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

}
