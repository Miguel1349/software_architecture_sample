package co.edu.itm.software_architecture.reto;

class Libro implements Item {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void prestamo() {
        System.out.println("Libro '" + titulo + "' ha sido prestado.");
    }

    @Override
    public void devolucion() {
        System.out.println("Libro '" + titulo + "' ha sido retornado.");
    }

    @Override
    public void reserva() {
        System.out.println("Libro '" + titulo + "' ha sido reservado.");
    }

    @Override
    public void renovacion() {
        System.out.println("Libro '" + titulo + "' ha sido renovado.");
    }

    @Override
    public void adicionarAColeccion() {
        System.out.println("Libro '" + titulo + "' ha sido adicionado a coleccion.");
    }

    @Override
    public void eliminarDeColeccion() {
        System.out.println("Libro '" + titulo + "' ha sido eliminado de coleccion.");
    }
}