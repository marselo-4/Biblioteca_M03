package Biblioteca;

public class Reservas {
    private String tipo;
    private String titulo;
    private String autor;
    private boolean reservado;

    public Reservas(String titulo, String autor) {
        this.tipo = "Libro";
        this.titulo = titulo;
        this.autor = autor;
        this.reservado = false;
    }

    public Reservas(String titulo, String autor, boolean reservado) {
        this.tipo = "Articulo";
        this.titulo = titulo;
        this.autor = autor;
        this.reservado = reservado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Reserva realizada con éxito para " + tipo + ": " + titulo);
        } else {
            System.out.println("Este " + tipo + " ya está reservado.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Reserva cancelada para " + tipo + ": " + titulo);
        } else {
            System.out.println("No hay reserva para este " + tipo + ".");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información de la reserva:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        String res = "";
        if (reservado) {
			res = "Si";
		}else {
			res = "No";
		}
        System.out.println("Reservado: " + res);
    }

    public static void main(String[] args) {
        Reservas reservaLibro = new Reservas("El Quijote", "Miguel de Cervantes");
        reservaLibro.reservar();
        reservaLibro.mostrarInformacion();
        reservaLibro.cancelarReserva();
    }
}
