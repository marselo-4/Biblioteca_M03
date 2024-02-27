package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class materialL {
	private String id;
	private String titulo;
	private String autor;
	private String tematica;
	private ArrayList<materialL> arraymaterialL = new ArrayList<materialL>();

//Fer constructor getter i setters.

	public materialL(String id, String titulo, String autor, String tematica) {
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
		System.out.println("Id --> " + this.id);
		System.out.println("Titulo --> " + this.titulo);
		System.out.println("Autor --> " + this.autor);
		System.out.println("Tematica --> " + this.tematica);

	}
	
	public void editar() {
		Scanner scan_String = new Scanner(System.in);
		Scanner scan_num = new Scanner(System.in);

		System.out.println("Indica el nuevo id, id actual --> " + this.id);
		String id_nuevo = scan_String.nextLine();
		setId(id_nuevo); 
		System.out.println("Indica el nuevo titulo, titulo actual --> " + this.titulo);
		String titulo_nuevo = scan_String.nextLine();
		setTitulo(titulo_nuevo);
		System.out.println("Indica el nuevo autor, autor actual --> " + this.autor);
		String autor_nuevo = scan_String.nextLine();
		setAutor(autor_nuevo);
		System.out.println("Indica el nuevo tematica, tematica actual --> " + this.tematica);
		String tematica_nuevo = scan_String.nextLine();
		setTematica(tematica_nuevo);
	}

}
